package amazon.android.tsumineko.twitter;

import amazon.android.tsumineko.BaseActivity;
import amazon.android.tsumineko.R;
import amazon.android.tsumineko.TsumiNekoPadAppDelegate;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.amazon.android.Kiwi;
import com.amazon.mas.kiwi.util.Base64;

public class twitterActivity extends BaseActivity {

    /* renamed from: a */
    TsumiNekoPadAppDelegate f904a;

    /* renamed from: b */
    WebView f905b;

    /* renamed from: c */
    LinearLayout f906c;

    private void onActivityResulttwitterActivity(int i, int i2, Intent intent) {
    }

    private void onCreatetwitterActivity(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(1024);
        requestWindowFeature(1);
        this.f904a = (TsumiNekoPadAppDelegate) getApplication();
        setContentView(R.layout.twitter);
        this.f904a.mo90a(this, (ViewGroup) findViewById(R.id.rootView), -1.0f, -1.0f);
        this.f905b = (WebView) findViewById(R.id.twWebView);
        this.f906c = (LinearLayout) findViewById(R.id.twLayout);
        this.f905b.setScrollBarStyle(0);
        this.f905b.setWebViewClient(new C0047a(this));
    }

    private void onDestroytwitterActivity() {
        super.onDestroy();
    }

    private void onPausetwitterActivity() {
        super.onPause();
    }

    private void onResumetwitterActivity() {
        super.onResume();
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService("connectivity");
            if (connectivityManager.getActiveNetworkInfo() != null ? connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting() : false) {
                try {
                    int g = this.f904a.f400z.mo15g();
                    int e = (int) this.f904a.f400z.mo13e();
                    this.f905b.getSettings().setJavaScriptEnabled(true);
                    String charSequence = getText(R.string.twitter_send_message).toString();
                    String replace = g <= 1 ? charSequence.replace("$TODAY_NUM$", String.valueOf(Integer.toString(g)) + getText(R.string.neko_unit_one)) : charSequence.replace("$TODAY_NUM$", String.valueOf(Integer.toString(g)) + getText(R.string.neko_unit_any));
                    this.f905b.loadUrl(getText(R.string.twitter_send_url) + (e <= 1 ? replace.replace("$TOTAL_NUM$", String.valueOf(Integer.toString(e)) + getText(R.string.neko_unit_one)) : replace.replace("$TOTAL_NUM$", String.valueOf(Integer.toString(e)) + getText(R.string.neko_unit_any))));
                } catch (Exception e2) {
                }
            } else {
                new AlertDialog.Builder(this).setTitle(R.string.app_name).setMessage(getText(R.string.network_not_available)).setPositiveButton("OK", new C0048b(this)).show();
            }
        } catch (Exception e3) {
        }
    }

    private void onStoptwitterActivity() {
        super.onStop();
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!Kiwi.onActivityResult(this, requestCode, resultCode, data)) {
            onActivityResulttwitterActivity(requestCode, resultCode, data);
        }
    }

    public void onCreate(Bundle bundle) {
        onCreatetwitterActivity(bundle);
        Kiwi.onCreate((Activity) this, true);
    }

    public Dialog onCreateDialog(int i) {
        Dialog dialog = Kiwi.onCreateDialog(this, i);
        return dialog != null ? dialog : super.onCreateDialog(i);
    }

    public Dialog onCreateDialog(int i, Bundle bundle) {
        Dialog dialog = Kiwi.onCreateDialog(this, i);
        return dialog != null ? dialog : super.onCreateDialog(i, bundle);
    }

    public void onDestroy() {
        onDestroytwitterActivity();
        Kiwi.onDestroy((Activity) this);
    }

    public void onPause() {
        onPausetwitterActivity();
        Kiwi.onPause(this);
    }

    public void onResume() {
        onResumetwitterActivity();
        Kiwi.onResume(this);
    }

    public void onStart() {
        super.onStart();
        Kiwi.onStart(this);
    }

    public void onStop() {
        onStoptwitterActivity();
        Kiwi.onStop(this);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction() & 255) {
            case Base64.ENCODE /*1*/:
            case 6:
                finish();
                return true;
            default:
                return true;
        }
    }
}
