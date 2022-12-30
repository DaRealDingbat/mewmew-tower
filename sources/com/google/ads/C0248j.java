package com.google.ads;

import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0261b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.ads.j */
public final class C0248j {

    /* renamed from: a */
    public static final Map f1264a;

    /* renamed from: b */
    public static final Map f1265b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("/invalidRequest", new C0227ah());
        hashMap.put("/loadAdURL", new C0228ai());
        f1264a = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("/open", new C0230ak());
        hashMap2.put("/canOpenURLs", new C0222ac());
        hashMap2.put("/close", new C0224ae());
        hashMap2.put("/evalInOpener", new C0225af());
        hashMap2.put("/log", new C0229aj());
        hashMap2.put("/click", new C0223ad());
        hashMap2.put("/httpTrack", new C0226ag());
        hashMap2.put("/touch", new C0231al());
        hashMap2.put("/video", new C0232am());
        hashMap2.put("/plusOne", new C0250l());
        f1265b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static void m520a(WebView webView) {
        m522a(webView, "onshow", "{'version': 'afma-sdk-a-v4.3.1'}");
    }

    /* renamed from: a */
    public static void m521a(WebView webView, String str) {
        C0261b.m581d("Sending JS to a WebView: " + str);
        webView.loadUrl("javascript:" + str);
    }

    /* renamed from: a */
    public static void m522a(WebView webView, String str, String str2) {
        if (str2 != null) {
            m521a(webView, "AFMA_ReceiveMessage" + "('" + str + "', " + str2 + ");");
        } else {
            m521a(webView, "AFMA_ReceiveMessage" + "('" + str + "');");
        }
    }

    /* renamed from: a */
    public static void m523a(WebView webView, Map map) {
        m522a(webView, "openableURLs", new JSONObject(map).toString());
    }

    /* renamed from: a */
    static void m524a(C0267w wVar, Map map, Uri uri, WebView webView) {
        String str;
        HashMap b = AdUtil.m563b(uri);
        if (b == null) {
            C0261b.m582e("An error occurred while parsing the message parameters.");
            return;
        }
        if (m528c(uri)) {
            String host = uri.getHost();
            if (host == null) {
                C0261b.m582e("An error occurred while parsing the AMSG parameters.");
                str = null;
            } else if (host.equals("launch")) {
                b.put("a", "intent");
                b.put("u", b.get("url"));
                b.remove("url");
                str = "/open";
            } else if (host.equals("closecanvas")) {
                str = "/close";
            } else if (host.equals("log")) {
                str = "/log";
            } else {
                C0261b.m582e("An error occurred while parsing the AMSG: " + uri.toString());
                str = null;
            }
        } else if (m527b(uri)) {
            str = uri.getPath();
        } else {
            C0261b.m582e("Message was neither a GMSG nor an AMSG.");
            str = null;
        }
        if (str == null) {
            C0261b.m582e("An error occurred while parsing the message.");
            return;
        }
        C0221ab abVar = (C0221ab) map.get(str);
        if (abVar == null) {
            C0261b.m582e("No AdResponse found, <message: " + str + ">");
        } else {
            abVar.mo638a(wVar, b, webView);
        }
    }

    /* renamed from: a */
    public static boolean m525a(Uri uri) {
        if (uri == null || !uri.isHierarchical()) {
            return false;
        }
        return m527b(uri) || m528c(uri);
    }

    /* renamed from: b */
    public static void m526b(WebView webView) {
        m522a(webView, "onhide", (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r1 = r3.getAuthority();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m527b(android.net.Uri r3) {
        /*
            r0 = 0
            java.lang.String r1 = r3.getScheme()
            if (r1 == 0) goto L_0x000f
            java.lang.String r2 = "gmsg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            return r0
        L_0x0010:
            java.lang.String r1 = r3.getAuthority()
            if (r1 == 0) goto L_0x000f
            java.lang.String r2 = "mobileads.google.com"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x000f
            r0 = 1
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.C0248j.m527b(android.net.Uri):boolean");
    }

    /* renamed from: c */
    private static boolean m528c(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("admob");
    }
}
