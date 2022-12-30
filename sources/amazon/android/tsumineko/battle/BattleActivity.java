package amazon.android.tsumineko.battle;

import amazon.android.p000a.C0006d;
import amazon.android.p000a.C0015m;
import amazon.android.tsumineko.BaseActivity;
import amazon.android.tsumineko.R;
import amazon.android.tsumineko.TsumiNekoAndActivity;
import amazon.android.tsumineko.TsumiNekoPadAppDelegate;
import amazon.android.tsumineko.game.EAGLView;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amazon.android.Kiwi;
import com.amazon.mas.kiwi.util.Base64;

public class BattleActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public EAGLView f403a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public TsumiNekoPadAppDelegate f404b;

    private void onCreateBattleActivity(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(1024);
        requestWindowFeature(1);
        setVolumeControlStream(3);
        this.f404b = (TsumiNekoPadAppDelegate) getApplication();
        setContentView(R.layout.battle);
        this.f404b.mo90a(this, (ViewGroup) findViewById(R.id.rootView), -1.0f, -1.0f);
        C0015m.m66a((Activity) this);
        int i = C0015m.f366a;
        int i2 = C0015m.f367b;
        this.f404b.mo94c();
        if (this.f403a == null) {
            this.f403a = new EAGLView(this);
            this.f403a.f545o = i;
            this.f403a.f546p = i2;
            this.f403a.mo126a(new Rect(0, 0, (int) C0006d.f75E, (int) C0006d.f76F), 0, this.f404b, new C0019b(this, new AlertDialog.Builder(this)));
            ((FrameLayout) findViewById(R.id.battleFL1)).addView(this.f403a);
            if (this.f403a != null) {
                this.f403a.mo138g();
            }
        }
    }

    private void onDestroyBattleActivity() {
        super.onDestroy();
        try {
            this.f404b.mo95d();
        } catch (Exception e) {
        }
    }

    private void onPauseBattleActivity() {
        super.onPause();
    }

    private void onResumeBattleActivity() {
        super.onResume();
        try {
            Log.e("BattleActivity", "onResume");
        } catch (Exception e) {
        }
    }

    private void onStopBattleActivity() {
        super.onStop();
        try {
            Log.e("BattleActivity", "onStop");
        } catch (Exception e) {
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!Kiwi.onActivityResult(this, requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onCreate(Bundle bundle) {
        onCreateBattleActivity(bundle);
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
        onDestroyBattleActivity();
        Kiwi.onDestroy((Activity) this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f403a.mo139h();
        this.f404b.mo92b();
        Intent intent = new Intent(this, TsumiNekoAndActivity.class);
        intent.setFlags(67108864);
        startActivity(intent);
        return false;
    }

    public void onPause() {
        onPauseBattleActivity();
        Kiwi.onPause(this);
    }

    public void onResume() {
        onResumeBattleActivity();
        Kiwi.onResume(this);
    }

    public void onStart() {
        super.onStart();
        Kiwi.onStart(this);
    }

    public void onStop() {
        onStopBattleActivity();
        Kiwi.onStop(this);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f403a == null) {
            return true;
        }
        switch (action & 255) {
            case 0:
            case 5:
                this.f403a.mo129b(motionEvent);
                return true;
            case Base64.ENCODE /*1*/:
            case 6:
                this.f403a.mo137f(motionEvent);
                return true;
            case Base64.GZIP /*2*/:
                this.f403a.mo133d(motionEvent);
                return true;
            default:
                return true;
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f403a != null) {
            this.f403a.f532b = z;
        }
        Log.e("BattleActivity", "onWindowFocusChanged[" + z + "]");
    }
}
