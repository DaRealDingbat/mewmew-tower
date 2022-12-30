package amazon.android.tsumineko.game.gameover;

import amazon.android.p000a.p001a.C0003c;
import amazon.android.tsumineko.BaseActivity;
import amazon.android.tsumineko.R;
import amazon.android.tsumineko.TsumiNekoPadAppDelegate;
import amazon.android.tsumineko.game.rank.RankActivity;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amazon.android.Kiwi;
import com.amazon.mas.kiwi.util.Base64;
import java.util.HashMap;
import java.util.Timer;

public class GameOver extends BaseActivity {

    /* renamed from: a */
    int f705a = 12;

    /* renamed from: b */
    travelCanvas f706b;

    /* renamed from: c */
    int f707c = R.raw.tim2;

    /* renamed from: d */
    int f708d = 0;

    /* renamed from: e */
    int[][] f709e;

    /* renamed from: f */
    Timer f710f;

    /* renamed from: g */
    int f711g;

    /* renamed from: h */
    FrameLayout f712h;

    /* renamed from: i */
    TsumiNekoPadAppDelegate f713i;

    /* renamed from: j */
    boolean f714j;

    public GameOver() {
        int[] iArr = new int[3];
        iArr[0] = 8;
        iArr[1] = R.raw.rank01;
        this.f709e = new int[][]{iArr, new int[]{12, R.raw.rank02, 1}, new int[]{16, R.raw.rank03, 2}, new int[]{20, R.raw.rank04, 3}, new int[]{24, R.raw.rank05, 4}, new int[]{28, R.raw.rank06, 5}, new int[]{32, R.raw.rank07, 6}, new int[]{36, R.raw.rank08, 7}, new int[]{40, R.raw.rank09, 8}, new int[]{44, R.raw.rank10, 9}, new int[]{48, R.raw.rank11, 10}, new int[]{52, R.raw.rank12, 11}, new int[]{56, R.raw.rank13, 12}, new int[]{60, R.raw.rank14, 13}, new int[]{66, R.raw.rank15, 14}, new int[]{71, R.raw.rank16, 15}, new int[]{99999, R.raw.rank17, 16}};
        this.f710f = null;
        this.f711g = 0;
        this.f714j = false;
    }

    /* renamed from: a */
    private void m162a() {
        long j;
        if (this.f713i.f398x != null && !this.f713i.f398x.f58m) {
            C0003c[] d = this.f713i.f400z.mo12d();
            C0003c[] cVarArr = new C0003c[(d == null ? 1 : d.length + 1)];
            for (int i = 0; i < cVarArr.length; i++) {
                cVarArr[i] = new C0003c();
                if (i < cVarArr.length - 2) {
                    cVarArr[i].f52g = d[i].f52g;
                    cVarArr[i].f48c = d[i].f48c;
                    cVarArr[i].f51f = d[i].f51f;
                    cVarArr[i].f49d = d[i].f49d;
                    cVarArr[i].f54i = d[i].f54i;
                    cVarArr[i].f50e = d[i].f50e;
                    cVarArr[i].f47b = d[i].f47b;
                    cVarArr[i].f56k = d[i].f56k;
                    cVarArr[i].f55j = d[i].f55j;
                    cVarArr[i].f53h = d[i].f53h;
                    cVarArr[i].f46a = d[i].f46a;
                    cVarArr[i].f57l = d[i].f57l;
                }
            }
            cVarArr[cVarArr.length - 1].f52g = this.f713i.f398x.f52g;
            cVarArr[cVarArr.length - 1].f48c = this.f713i.f398x.f48c;
            cVarArr[cVarArr.length - 1].f51f = this.f713i.f398x.f51f;
            cVarArr[cVarArr.length - 1].f49d = this.f713i.f398x.f49d;
            cVarArr[cVarArr.length - 1].f54i = this.f713i.f398x.f54i;
            cVarArr[cVarArr.length - 1].f50e = this.f713i.f398x.f50e;
            cVarArr[cVarArr.length - 1].f47b = this.f713i.f398x.f47b;
            cVarArr[cVarArr.length - 1].f56k = this.f713i.f398x.f56k;
            cVarArr[cVarArr.length - 1].f55j = this.f713i.f398x.f55j;
            cVarArr[cVarArr.length - 1].f53h = this.f713i.f398x.f53h;
            cVarArr[cVarArr.length - 1].f46a = this.f713i.f398x.f46a;
            this.f713i.f400z.mo5a(cVarArr);
            this.f713i.f398x.f58m = true;
            this.f713i.f400z.mo3a(cVarArr[cVarArr.length - 1]);
            this.f713i.f400z.mo7b(cVarArr[cVarArr.length - 1]);
            try {
                HashMap hashMap = this.f713i.f387m;
                this.f713i.f400z.getClass();
                j = Long.valueOf((String) hashMap.get("playcount")).longValue();
            } catch (Exception e) {
                j = 0;
            }
            HashMap hashMap2 = this.f713i.f387m;
            this.f713i.f400z.getClass();
            hashMap2.put("playcount", new StringBuilder().append(j + 1).toString());
            this.f713i.f400z.mo11d(this.f713i.f387m);
        }
    }

    private void onCreateGameOver(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(1024);
        requestWindowFeature(1);
        this.f713i = (TsumiNekoPadAppDelegate) getApplication();
        setContentView(R.layout.gameover);
        this.f713i.mo90a(this, (ViewGroup) findViewById(R.id.rootView), -1.0f, -1.0f);
        this.f706b = (travelCanvas) findViewById(R.id.travelCanvas);
        int i = this.f713i.f398x.f52g + this.f713i.f398x.f53h + this.f713i.f398x.f54i;
        for (int i2 = 0; i2 < this.f709e.length; i2++) {
            if (this.f709e[i2][0] >= i) {
                this.f708d = i2 + 19;
                return;
            }
        }
    }

    private void onDestroyGameOver() {
        super.onDestroy();
    }

    private void onStartGameOver() {
        super.onStart();
        if (this.f706b != null) {
            Log.d("GameOver", "onStart start canvas mode=" + this.f706b.mo206b() + " wp=" + this.f713i.f381D);
        }
        if (!this.f714j || this.f706b.mo206b() == 0) {
            this.f714j = true;
            this.f713i.f381D = 0;
            this.f712h = (FrameLayout) findViewById(R.id.frmGameOver);
            if (this.f714j) {
                m162a();
            }
            if (this.f706b != null) {
                Log.d("GameOver", "onStart canvas ok debug=" + this.f713i.f382E);
                this.f713i.f400z.mo14f();
                if (this.f713i.f382E) {
                    this.f706b.mo205a(this, this.f713i.f398x.f53h, this.f713i.f398x.f54i, this.f713i.f398x.f52g, this.f713i.f398x.f51f, (double) (this.f713i.f383F * 100));
                } else {
                    this.f706b.mo205a(this, this.f713i.f398x.f53h, this.f713i.f398x.f54i, this.f713i.f398x.f52g, this.f713i.f398x.f51f, (double) this.f713i.f400z.mo1a(false));
                }
            }
        } else {
            this.f706b.mo207c();
        }
        Log.d("GameOver", "onStart end");
    }

    private void onStopGameOver() {
        super.onStop();
        try {
            this.f710f.cancel();
        } catch (Exception e) {
        }
        try {
            this.f710f = null;
        } catch (Exception e2) {
        }
        try {
            this.f713i.f397w[18].mo35b();
        } catch (Exception e3) {
        }
        Log.d("GameOver", "onStop");
    }

    /* renamed from: a */
    public final void mo177a(int i) {
        Log.d("GameOver", "onChangeMode=" + i);
        if (i == 0) {
            this.f713i.f397w[18].mo34a(-1);
            this.f713i.f397w[18].mo33a();
        } else if (i == 1) {
            this.f713i.f397w[this.f708d].mo33a();
            this.f713i.f397w[18].mo35b();
            this.f706b.mo207c();
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!Kiwi.onActivityResult(this, requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onCreate(Bundle bundle) {
        onCreateGameOver(bundle);
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
        onDestroyGameOver();
        Kiwi.onDestroy((Activity) this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f706b != null) {
            if (this.f706b.mo206b() == 0) {
                this.f706b.mo204a();
            } else if (this.f706b.mo206b() == 4) {
                if (this.f713i.f382E) {
                    TsumiNekoPadAppDelegate tsumiNekoPadAppDelegate = this.f713i;
                    tsumiNekoPadAppDelegate.f383F = (int) (((double) tsumiNekoPadAppDelegate.f383F) + (this.f713i.f398x.f51f / 100.0d));
                }
                Intent intent = new Intent(this, RankActivity.class);
                intent.setFlags(67108864);
                startActivity(intent);
            }
        }
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
        onStartGameOver();
        Kiwi.onStart(this);
    }

    public void onStop() {
        onStopGameOver();
        Kiwi.onStop(this);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case Base64.ENCODE /*1*/:
                if (this.f706b == null) {
                    return true;
                }
                if (this.f706b.mo206b() == 0) {
                    this.f706b.mo204a();
                    return true;
                } else if (this.f706b.mo206b() != 4) {
                    return true;
                } else {
                    if (this.f710f != null) {
                        this.f710f.cancel();
                        this.f710f = null;
                    }
                    if (this.f713i.f382E) {
                        TsumiNekoPadAppDelegate tsumiNekoPadAppDelegate = this.f713i;
                        tsumiNekoPadAppDelegate.f383F = (int) (((double) tsumiNekoPadAppDelegate.f383F) + (this.f713i.f398x.f51f / 100.0d));
                    }
                    Intent intent = new Intent(this, RankActivity.class);
                    intent.setFlags(67108864);
                    startActivity(intent);
                    return true;
                }
            default:
                return true;
        }
    }
}
