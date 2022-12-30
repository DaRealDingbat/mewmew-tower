package com.google.ads;

import android.webkit.WebView;

/* renamed from: com.google.ads.r */
final class C0256r implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0255q f1290a;

    /* renamed from: b */
    private final C0267w f1291b;

    /* renamed from: c */
    private final WebView f1292c;

    /* renamed from: d */
    private final C0254p f1293d;

    /* renamed from: e */
    private final C0242d f1294e;

    /* renamed from: f */
    private final boolean f1295f;

    public C0256r(C0255q qVar, C0267w wVar, WebView webView, C0254p pVar, C0242d dVar, boolean z) {
        this.f1290a = qVar;
        this.f1291b = wVar;
        this.f1292c = webView;
        this.f1293d = pVar;
        this.f1294e = dVar;
        this.f1295f = z;
    }

    public final void run() {
        if (this.f1292c != null) {
            this.f1292c.stopLoading();
            this.f1292c.destroy();
        }
        if (this.f1293d != null) {
            this.f1293d.mo671a();
        }
        if (this.f1295f) {
            C0246h h = this.f1291b.mo704h();
            h.stopLoading();
            h.setVisibility(8);
        }
        this.f1291b.mo693a(this.f1294e);
    }
}
