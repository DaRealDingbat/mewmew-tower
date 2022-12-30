package amazon.android.tsumineko.game.gameover;

import amazon.android.tsumineko.BaseActivity;
import amazon.android.tsumineko.R;
import amazon.android.tsumineko.TsumiNekoAndActivity;
import amazon.android.tsumineko.TsumiNekoPadAppDelegate;
import amazon.android.tsumineko.battle.BattleActivity;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.android.Kiwi;
import java.util.Timer;

public class GameOverMini extends BaseActivity {

    /* renamed from: a */
    Timer f715a = null;

    /* renamed from: b */
    TsumiNekoPadAppDelegate f716b;

    /* renamed from: c */
    private SurfaceView f717c;

    /* renamed from: d */
    private C0033a f718d;

    private void onCreateGameOverMini(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(1024);
        requestWindowFeature(1);
        this.f716b = (TsumiNekoPadAppDelegate) getApplication();
        setContentView(R.layout.gameovermini);
        this.f716b.mo90a(this, (ViewGroup) findViewById(R.id.rootView), -1.0f, -1.0f);
    }

    private void onStartGameOverMini() {
        super.onStart();
        this.f717c = (SurfaceView) findViewById(R.id.gminiView);
        if (this.f718d == null) {
            this.f718d = new C0033a(this, this.f717c);
        }
    }

    private void onStopGameOverMini() {
        super.onStop();
        try {
            this.f715a.cancel();
        } catch (Exception e) {
        }
        try {
            this.f715a = null;
        } catch (Exception e2) {
        }
        try {
            this.f716b.f397w[18].mo35b();
        } catch (Exception e3) {
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!Kiwi.onActivityResult(this, requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onClick(View view) {
        if (view == findViewById(R.id.bgmminiTOP)) {
            Intent intent = new Intent(this, TsumiNekoAndActivity.class);
            intent.setFlags(67108864);
            startActivity(intent);
            return;
        }
        this.f716b.f397w[0].mo33a();
        Intent intent2 = new Intent(this, BattleActivity.class);
        intent2.setFlags(67108864);
        startActivity(intent2);
    }

    public void onCreate(Bundle bundle) {
        onCreateGameOverMini(bundle);
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
        super.onDestroy();
        Kiwi.onDestroy((Activity) this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        Intent intent = new Intent(this, TsumiNekoAndActivity.class);
        intent.setFlags(67108864);
        startActivity(intent);
        return false;
    }

    public void onPause() {
        super.onPause();
        Kiwi.onPause(this);
    }

    public void onResume() {
        super.onResume();
        Kiwi.onResume(this);
    }

    public void onStart() {
        onStartGameOverMini();
        Kiwi.onStart(this);
    }

    public void onStop() {
        onStopGameOverMini();
        Kiwi.onStop(this);
    }
}
