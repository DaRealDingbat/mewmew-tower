package amazon.android.tsumineko.info;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: amazon.android.tsumineko.info.a */
final class C0046a extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ InfoActivity f890a;

    C0046a(InfoActivity infoActivity) {
        this.f890a = infoActivity;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
