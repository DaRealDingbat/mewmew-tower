package com.google.ads;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0261b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.StringTokenizer;

/* renamed from: com.google.ads.p */
public final class C0254p implements Runnable {

    /* renamed from: a */
    private C0255q f1271a;

    /* renamed from: b */
    private C0267w f1272b;

    /* renamed from: c */
    private volatile boolean f1273c;

    /* renamed from: d */
    private boolean f1274d;

    /* renamed from: e */
    private String f1275e;

    C0254p(C0255q qVar, C0267w wVar) {
        this.f1271a = qVar;
        this.f1272b = wVar;
    }

    /* renamed from: a */
    private void m532a(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Tracking-Urls");
        if (headerField != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(headerField);
            while (stringTokenizer.hasMoreTokens()) {
                this.f1272b.mo695a(stringTokenizer.nextToken());
            }
        }
        m533b(httpURLConnection);
        String headerField2 = httpURLConnection.getHeaderField("X-Afma-Refresh-Rate");
        if (headerField2 != null) {
            try {
                float parseFloat = Float.parseFloat(headerField2);
                if (parseFloat > 0.0f) {
                    this.f1272b.mo690a(parseFloat);
                    if (!this.f1272b.mo710n()) {
                        this.f1272b.mo699c();
                    }
                } else if (this.f1272b.mo710n()) {
                    this.f1272b.mo697b();
                }
            } catch (NumberFormatException e) {
                C0261b.m579b("Could not get refresh value: " + headerField2, e);
            }
        }
        String headerField3 = httpURLConnection.getHeaderField("X-Afma-Interstitial-Timeout");
        if (headerField3 != null) {
            try {
                this.f1272b.mo692a((long) (Float.parseFloat(headerField3) * 1000.0f));
            } catch (NumberFormatException e2) {
                C0261b.m579b("Could not get timeout value: " + headerField3, e2);
            }
        }
        String headerField4 = httpURLConnection.getHeaderField("X-Afma-Orientation");
        if (headerField4 != null) {
            if (headerField4.equals("portrait")) {
                this.f1271a.mo676a(AdUtil.m560b());
            } else if (headerField4.equals("landscape")) {
                this.f1271a.mo676a(AdUtil.m547a());
            }
        }
        if (!TextUtils.isEmpty(httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life"))) {
            try {
                this.f1272b.mo698b(Long.parseLong(httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life")));
            } catch (NumberFormatException e3) {
                C0261b.m582e("Got bad value of Doritos cookie cache life from header: " + httpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life") + ". Using default value instead.");
            }
        }
    }

    /* renamed from: b */
    private void m533b(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Afma-Click-Tracking-Urls");
        if (headerField != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(headerField);
            while (stringTokenizer.hasMoreTokens()) {
                this.f1271a.mo679a(stringTokenizer.nextToken());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo671a() {
        this.f1273c = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo672a(String str) {
        this.f1275e = str;
        this.f1273c = false;
        new Thread(this).start();
    }

    /* renamed from: a */
    public final void mo673a(boolean z) {
        this.f1274d = z;
    }

    public final void run() {
        HttpURLConnection httpURLConnection;
        String readLine;
        while (!this.f1273c) {
            try {
                httpURLConnection = (HttpURLConnection) new URL(this.f1275e).openConnection();
                Activity d = this.f1272b.mo700d();
                if (d == null) {
                    C0261b.m580c("activity was null in AdHtmlLoader.");
                    this.f1271a.mo678a(C0242d.INTERNAL_ERROR);
                    httpURLConnection.disconnect();
                    return;
                }
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(d);
                if (this.f1274d && !TextUtils.isEmpty(defaultSharedPreferences.getString("drt", ""))) {
                    if (AdUtil.f1302a == 8) {
                        httpURLConnection.addRequestProperty("X-Afma-drt-Cookie", defaultSharedPreferences.getString("drt", ""));
                    } else {
                        httpURLConnection.addRequestProperty("Cookie", defaultSharedPreferences.getString("drt", ""));
                    }
                }
                AdUtil.m556a(httpURLConnection, d.getApplicationContext());
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (300 <= responseCode && responseCode < 400) {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField == null) {
                        C0261b.m580c("Could not get redirect location from a " + responseCode + " redirect.");
                        this.f1271a.mo678a(C0242d.INTERNAL_ERROR);
                        httpURLConnection.disconnect();
                        return;
                    }
                    m532a(httpURLConnection);
                    this.f1275e = headerField;
                    httpURLConnection.disconnect();
                } else if (responseCode == 200) {
                    m532a(httpURLConnection);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()), 4096);
                    StringBuilder sb = new StringBuilder();
                    while (!this.f1273c && (readLine = bufferedReader.readLine()) != null) {
                        sb.append(readLine);
                        sb.append("\n");
                    }
                    String sb2 = sb.toString();
                    C0261b.m574a("Response content is: " + sb2);
                    if (sb2 == null || sb2.trim().length() <= 0) {
                        C0261b.m574a("Response message is null or zero length: " + sb2);
                        this.f1271a.mo678a(C0242d.NO_FILL);
                        httpURLConnection.disconnect();
                        return;
                    }
                    this.f1271a.mo680a(sb2, this.f1275e);
                    httpURLConnection.disconnect();
                    return;
                } else if (responseCode == 400) {
                    C0261b.m580c("Bad request");
                    this.f1271a.mo678a(C0242d.INVALID_REQUEST);
                    httpURLConnection.disconnect();
                    return;
                } else {
                    C0261b.m580c("Invalid response code: " + responseCode);
                    this.f1271a.mo678a(C0242d.INTERNAL_ERROR);
                    httpURLConnection.disconnect();
                    return;
                }
            } catch (MalformedURLException e) {
                C0261b.m575a("Received malformed ad url from javascript.", (Throwable) e);
                this.f1271a.mo678a(C0242d.INTERNAL_ERROR);
                return;
            } catch (IOException e2) {
                C0261b.m579b("IOException connecting to ad url.", e2);
                this.f1271a.mo678a(C0242d.NETWORK_ERROR);
                return;
            } catch (Exception e3) {
                C0261b.m575a("An unknown error occurred in AdHtmlLoader.", (Throwable) e3);
                this.f1271a.mo678a(C0242d.INTERNAL_ERROR);
                return;
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        }
    }
}
