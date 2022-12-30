package amazon.android.tsumineko.game;

import amazon.android.p000a.C0006d;
import amazon.android.p000a.C0015m;
import amazon.android.tsumineko.BaseActivity;
import amazon.android.tsumineko.R;
import amazon.android.tsumineko.TsumiNekoAndActivity;
import amazon.android.tsumineko.TsumiNekoPadAppDelegate;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amazon.android.Kiwi;
import com.amazon.mas.kiwi.util.Base64;

public class GameActivity extends BaseActivity implements SensorEventListener {

    /* renamed from: a */
    TsumiNekoPadAppDelegate f555a;

    /* renamed from: b */
    float[] f556b = new float[16];

    /* renamed from: c */
    float[] f557c = new float[16];

    /* renamed from: d */
    float[] f558d = new float[16];

    /* renamed from: e */
    float[] f559e = new float[3];

    /* renamed from: f */
    float[] f560f = new float[3];

    /* renamed from: g */
    float[] f561g = new float[3];

    /* renamed from: h */
    boolean f562h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public EAGLView f563i = null;

    /* renamed from: j */
    private SensorManager f564j;

    private void onCreateGameActivity(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(1024);
        requestWindowFeature(1);
        this.f555a = (TsumiNekoPadAppDelegate) getApplication();
        setContentView(R.layout.game);
        C0015m.m66a((Activity) this);
        int i = C0015m.f366a;
        int i2 = C0015m.f367b;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.rootView);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        float f = ((float) i) / ((float) layoutParams.width);
        int i3 = layoutParams.height;
        int i4 = C0015m.f367b;
        this.f555a.mo90a(this, viewGroup, (float) i, (float) ((int) (((float) layoutParams.height) * f)));
        this.f555a.mo94c();
        if (this.f563i == null) {
            this.f563i = new EAGLView(this);
            this.f563i.f545o = C0015m.f366a;
            this.f563i.f546p = C0015m.f367b;
            Log.e("GameActivity", "orig_width=" + this.f563i.f545o + " orig_height=" + this.f563i.f546p);
            this.f563i.mo126a(new Rect(0, 0, (int) C0006d.f75E, (int) C0006d.f76F), 1, this.f555a, new C0023a(this, new AlertDialog.Builder(this)));
            ((FrameLayout) findViewById(R.id.gameFL1)).addView(this.f563i);
            this.f563i.mo138g();
        }
    }

    private void onDestroyGameActivity() {
        super.onDestroy();
        try {
            this.f555a.mo95d();
            this.f564j = null;
        } catch (Exception e) {
        }
    }

    private void onPauseGameActivity() {
        super.onPause();
        try {
            if (this.f562h) {
                this.f564j.unregisterListener(this);
                this.f562h = false;
            }
        } catch (Exception e) {
        }
    }

    private void onResumeGameActivity() {
        super.onResume();
        try {
            if (this.f564j == null) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= 10) {
                        break;
                    }
                    try {
                        this.f564j = (SensorManager) getSystemService("sensor");
                        if (this.f564j.getSensorList(-1).size() > 1) {
                            break;
                        }
                        this.f564j = null;
                        Thread.sleep(50);
                        i = i2 + 1;
                    } catch (Exception e) {
                    }
                }
            }
            for (Sensor next : this.f564j.getSensorList(-1)) {
                if (next.getType() == 1) {
                    this.f564j.registerListener(this, next, 2);
                    this.f562h = true;
                } else if (next.getType() == 3) {
                    this.f564j.registerListener(this, next, 2);
                    this.f562h = true;
                }
            }
        } catch (Exception e2) {
            try {
                Log.e("GameActivity", "onResume Error[" + e2.getMessage() + "]");
            } catch (Exception e3) {
            }
        }
    }

    private void onStopGameActivity() {
        super.onStop();
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!Kiwi.onActivityResult(this, requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onCreate(Bundle bundle) {
        onCreateGameActivity(bundle);
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
        onDestroyGameActivity();
        Kiwi.onDestroy((Activity) this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f563i.mo139h();
        Intent intent = new Intent(this, TsumiNekoAndActivity.class);
        intent.setFlags(67108864);
        startActivity(intent);
        return false;
    }

    public void onPause() {
        onPauseGameActivity();
        Kiwi.onPause(this);
    }

    public void onResume() {
        onResumeGameActivity();
        Kiwi.onResume(this);
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f563i != null) {
            switch (sensorEvent.sensor.getType()) {
                case Base64.ENCODE /*1*/:
                    float f = sensorEvent.values[0];
                    float f2 = sensorEvent.values[1];
                    float f3 = sensorEvent.values[2];
                    if (C0015m.m67a((Context) this)) {
                        f = sensorEvent.values[1];
                        f2 = sensorEvent.values[0];
                    }
                    this.f563i.mo124a(f / 9.80665f, f2 / 9.80665f, f3 / 9.80665f);
                    return;
                default:
                    return;
            }
        }
    }

    public void onStart() {
        super.onStart();
        Kiwi.onStart(this);
    }

    public void onStop() {
        onStopGameActivity();
        Kiwi.onStop(this);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f563i == null) {
            return true;
        }
        switch (action & 255) {
            case 0:
            case 5:
                this.f563i.mo127a(motionEvent);
                return true;
            case Base64.ENCODE /*1*/:
            case 6:
                this.f563i.mo135e(motionEvent);
                return true;
            case Base64.GZIP /*2*/:
                this.f563i.mo131c(motionEvent);
                return true;
            default:
                return true;
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f563i != null) {
            this.f563i.f532b = z;
        }
        Log.e("GameActivity", "onWindowFocusChanged[" + z + "]");
    }
}
