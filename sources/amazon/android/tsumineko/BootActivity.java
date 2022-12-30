package amazon.android.tsumineko;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.amazon.android.Kiwi;

public class BootActivity extends BaseActivity {

    /* renamed from: a */
    private TsumiNekoPadAppDelegate f372a;

    private void onCreateBootActivity(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(1024);
        requestWindowFeature(1);
        this.f372a = (TsumiNekoPadAppDelegate) getApplication();
        setContentView(R.layout.boot);
        this.f372a.mo90a(this, (ViewGroup) findViewById(R.id.boot_main), -1.0f, -1.0f);
        getIntent();
        Intent intent = new Intent(this, TsumiNekoAndActivity.class);
        intent.setAction("android.intent.action.VIEW");
        startActivity(intent);
        finish();
    }

    private void onDestroyBootActivity() {
        super.onDestroy();
    }

    private void onResumeBootActivity() {
        super.onResume();
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!Kiwi.onActivityResult(this, requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onCreate(Bundle bundle) {
        onCreateBootActivity(bundle);
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
        onDestroyBootActivity();
        Kiwi.onDestroy((Activity) this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        Kiwi.onPause(this);
    }

    public void onResume() {
        onResumeBootActivity();
        Kiwi.onResume(this);
    }

    public void onStart() {
        super.onStart();
        Kiwi.onStart(this);
    }

    public void onStop() {
        super.onStop();
        Kiwi.onStop(this);
    }
}
