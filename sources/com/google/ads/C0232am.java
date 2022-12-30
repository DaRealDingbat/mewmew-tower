package com.google.ads;

import android.app.Activity;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0261b;
import java.util.HashMap;

/* renamed from: com.google.ads.am */
public final class C0232am implements C0221ab {
    /* renamed from: a */
    private static int m501a(HashMap hashMap, String str, int i, DisplayMetrics displayMetrics) {
        String str2 = (String) hashMap.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            return (int) TypedValue.applyDimension(1, (float) Integer.parseInt(str2), displayMetrics);
        } catch (NumberFormatException e) {
            C0261b.m574a("Could not parse \"" + str + "\" in a video gmsg: " + str2);
            return i;
        }
    }

    /* renamed from: a */
    public final void mo638a(C0267w wVar, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("action");
        if (str == null) {
            C0261b.m574a("No \"action\" parameter in a video gmsg.");
        } else if (webView instanceof C0246h) {
            C0246h hVar = (C0246h) webView;
            AdActivity b = hVar.mo663b();
            if (b == null) {
                C0261b.m574a("Could not get adActivity for a video gmsg.");
                return;
            }
            boolean equals = str.equals("new");
            boolean equals2 = str.equals("position");
            if (equals || equals2) {
                DisplayMetrics a = AdUtil.m549a((Activity) b);
                int a2 = m501a(hashMap, "x", 0, a);
                int a3 = m501a(hashMap, "y", 0, a);
                int a4 = m501a(hashMap, "w", -1, a);
                int a5 = m501a(hashMap, "h", -1, a);
                if (!equals || b.mo616a() != null) {
                    b.mo617a(a2, a3, a4, a5);
                } else {
                    b.mo619b(a2, a3, a4, a5);
                }
            } else {
                C0245g a6 = b.mo616a();
                if (a6 == null) {
                    C0248j.m522a(hVar, "onVideoEvent", "{'event': 'error', 'what': 'no_video_view'}");
                } else if (str.equals("click")) {
                    DisplayMetrics a7 = AdUtil.m549a((Activity) b);
                    int a8 = m501a(hashMap, "x", 0, a7);
                    int a9 = m501a(hashMap, "y", 0, a7);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    a6.mo651a(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a8, (float) a9, 0));
                } else if (str.equals("controls")) {
                    String str2 = (String) hashMap.get("enabled");
                    if (str2 == null) {
                        C0261b.m574a("No \"enabled\" parameter in a controls video gmsg.");
                    } else if (str2.equals("true")) {
                        a6.mo653a(true);
                    } else {
                        a6.mo653a(false);
                    }
                } else if (str.equals("currentTime")) {
                    String str3 = (String) hashMap.get("time");
                    if (str3 == null) {
                        C0261b.m574a("No \"time\" parameter in a currentTime video gmsg.");
                        return;
                    }
                    try {
                        a6.mo650a((int) (Float.parseFloat(str3) * 1000.0f));
                    } catch (NumberFormatException e) {
                        C0261b.m574a("Could not parse \"time\" parameter: " + str3);
                    }
                } else if (str.equals("hide")) {
                    a6.setVisibility(4);
                } else if (str.equals("load")) {
                    a6.mo649a();
                } else if (str.equals("pause")) {
                    a6.mo654b();
                } else if (str.equals("play")) {
                    a6.mo655c();
                } else if (str.equals("show")) {
                    a6.setVisibility(0);
                } else if (str.equals("src")) {
                    a6.mo652a((String) hashMap.get("src"));
                } else {
                    C0261b.m574a("Unknown video action: " + str);
                }
            }
        } else {
            C0261b.m574a("Could not get adWebView for a video gmsg.");
        }
    }
}
