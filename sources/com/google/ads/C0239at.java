package com.google.ads;

import android.webkit.WebView;

/* renamed from: com.google.ads.at */
final class C0239at implements Runnable {

    /* renamed from: a */
    private boolean f1227a;

    /* renamed from: b */
    private WebView f1228b;

    public C0239at(WebView webView, boolean z) {
        this.f1228b = webView;
        this.f1227a = z;
    }

    public final void run() {
        C0236aq.m503a(this.f1228b, this.f1227a);
    }
}
