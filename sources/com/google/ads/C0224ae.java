package com.google.ads;

import android.webkit.WebView;
import com.google.ads.util.C0261b;
import java.util.HashMap;

/* renamed from: com.google.ads.ae */
public final class C0224ae implements C0221ab {
    /* renamed from: a */
    public final void mo638a(C0267w wVar, HashMap hashMap, WebView webView) {
        if (webView instanceof C0246h) {
            ((C0246h) webView).mo661a();
        } else {
            C0261b.m578b("Trying to close WebView that isn't an AdWebView");
        }
    }
}
