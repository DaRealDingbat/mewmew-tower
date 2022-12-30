package com.google.ads;

import android.webkit.WebView;
import com.google.ads.util.C0261b;
import java.util.HashMap;

/* renamed from: com.google.ads.af */
public final class C0225af implements C0221ab {
    /* renamed from: a */
    public final void mo638a(C0267w wVar, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("js");
        if (str == null) {
            C0261b.m578b("Could not get the JS to evaluate.");
        }
        if (webView instanceof C0246h) {
            AdActivity b = ((C0246h) webView).mo663b();
            if (b == null) {
                C0261b.m578b("Could not get the AdActivity from the AdWebView.");
                return;
            }
            C0246h b2 = b.mo618b();
            if (b2 == null) {
                C0261b.m578b("Could not get the opening WebView.");
            } else {
                C0248j.m521a((WebView) b2, str);
            }
        } else {
            C0261b.m578b("Trying to evaluate JS in a WebView that isn't an AdWebView");
        }
    }
}
