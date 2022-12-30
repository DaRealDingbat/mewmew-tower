package com.google.ads;

import android.webkit.WebView;

/* renamed from: com.google.ads.t */
final class C0258t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0255q f1297a;

    /* renamed from: b */
    private final String f1298b;

    /* renamed from: c */
    private final String f1299c;

    /* renamed from: d */
    private final WebView f1300d;

    public C0258t(C0255q qVar, WebView webView, String str, String str2) {
        this.f1297a = qVar;
        this.f1300d = webView;
        this.f1298b = str;
        this.f1299c = str2;
    }

    public final void run() {
        if (this.f1299c != null) {
            this.f1300d.loadDataWithBaseURL(this.f1298b, this.f1299c, "text/html", "utf-8", (String) null);
        } else {
            this.f1300d.loadUrl(this.f1298b);
        }
    }
}
