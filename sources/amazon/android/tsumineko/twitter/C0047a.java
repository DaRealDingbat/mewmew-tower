package amazon.android.tsumineko.twitter;

import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

/* renamed from: amazon.android.tsumineko.twitter.a */
final class C0047a extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ twitterActivity f902a;

    C0047a(twitterActivity twitteractivity) {
        this.f902a = twitteractivity;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (webView.getHeight() > 900) {
            Log.e("TwitterActivity", "Height Over 900pix.");
            webView.setLayoutParams(new LinearLayout.LayoutParams(527, 932));
            webView.setVerticalScrollBarEnabled(true);
            return;
        }
        Log.e("TwitterActivity", "Height in 900pix.");
        webView.setVerticalScrollBarEnabled(false);
    }
}
