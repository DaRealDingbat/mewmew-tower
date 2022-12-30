package amazon.android.tsumineko;

import amazon.android.p000a.C0015m;
import amazon.android.tsumineko.battle.BattleActivity;
import amazon.android.tsumineko.game.GameActivity;
import amazon.android.tsumineko.howto.HowtoActivity;
import amazon.android.tsumineko.info.InfoActivity;
import amazon.android.tsumineko.option.OptionActivity;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.android.Kiwi;
import java.util.HashMap;

public class TsumiNekoAndActivity extends BaseActivity implements Animation.AnimationListener {

    /* renamed from: a */
    public int f373a = 0;

    /* renamed from: b */
    private TsumiNekoPadAppDelegate f374b;

    /* renamed from: c */
    private AlphaAnimation f375c;

    /* renamed from: d */
    private boolean f376d;

    private void onCreateTsumiNekoAndActivity(Bundle bundle) {
        super.onCreate(bundle);
        setVolumeControlStream(3);
        getWindow().addFlags(1024);
        requestWindowFeature(1);
        C0015m.m66a((Activity) this);
        this.f373a = C0015m.m65a(18);
        this.f374b = (TsumiNekoPadAppDelegate) getApplication();
        setContentView(R.layout.main);
        this.f374b.mo90a(this, (ViewGroup) findViewById(R.id.rootView), -1.0f, -1.0f);
        TextView textView = (TextView) findViewById(R.id.versionText);
        String str = "1.0";
        try {
            str = getPackageManager().getPackageInfo(getPackageName(), 128).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        textView.setText(str);
        textView.setTextSize(1, (float) this.f373a);
        this.f375c = new AlphaAnimation(1.0f, 0.0f);
        this.f375c.setAnimationListener(this);
        ImageView imageView = (ImageView) findViewById(R.id.Effect01);
        imageView.setVisibility(0);
        this.f375c.setDuration(3000);
        this.f375c.setFillAfter(true);
        imageView.startAnimation(this.f375c);
    }

    private void onDestroyTsumiNekoAndActivity() {
        super.onDestroy();
    }

    private void onResumeTsumiNekoAndActivity() {
        super.onResume();
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!Kiwi.onActivityResult(this, requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onAnimationEnd(Animation animation) {
        if (animation == this.f375c) {
            this.f374b.f379B = true;
            this.f374b.f395u = false;
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onClickPlay(View view) {
        if (this.f374b.f379B && !this.f374b.f395u) {
            if (view == findViewById(R.id.ibHowto)) {
                Intent intent = new Intent(this, HowtoActivity.class);
                intent.setFlags(67108864);
                startActivity(intent);
            } else if (view == findViewById(R.id.ibPlay)) {
                if (!this.f376d) {
                    this.f376d = true;
                    try {
                        HashMap hashMap = this.f374b.f386l;
                        this.f374b.f400z.getClass();
                        hashMap.put("misiyo", 1);
                        this.f374b.f400z.mo8b(this.f374b.f386l);
                        this.f374b.f400z.mo4a(this.f374b.f386l);
                    } catch (Exception e) {
                    }
                    this.f374b.f397w[0].mo33a();
                    Intent intent2 = new Intent(this, GameActivity.class);
                    intent2.setFlags(67108864);
                    startActivity(intent2);
                }
            } else if (view == findViewById(R.id.ibBattle)) {
                if (!this.f376d) {
                    this.f376d = true;
                    this.f374b.f397w[0].mo33a();
                    Intent intent3 = new Intent(this, BattleActivity.class);
                    intent3.setFlags(67108864);
                    startActivity(intent3);
                }
            } else if (view == findViewById(R.id.ibOption)) {
                Intent intent4 = new Intent(this, OptionActivity.class);
                intent4.setFlags(67108864);
                startActivity(intent4);
            } else if (view == findViewById(R.id.ibInfo)) {
                Intent intent5 = new Intent(this, InfoActivity.class);
                intent5.setFlags(67108864);
                startActivity(intent5);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        onCreateTsumiNekoAndActivity(bundle);
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
        onDestroyTsumiNekoAndActivity();
        Kiwi.onDestroy((Activity) this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.f374b.f379B) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.app_name);
        builder.setMessage(R.string.msg_finish);
        builder.setPositiveButton("Yes", new C0016a(this));
        builder.setNegativeButton("No", new C0017b(this));
        builder.show();
        return false;
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f376d = false;
    }

    public void onPause() {
        super.onPause();
        Kiwi.onPause(this);
    }

    public void onResume() {
        onResumeTsumiNekoAndActivity();
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

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
