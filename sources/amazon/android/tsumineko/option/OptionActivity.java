package amazon.android.tsumineko.option;

import amazon.android.tsumineko.BaseActivity;
import amazon.android.tsumineko.R;
import amazon.android.tsumineko.TsumiNekoPadAppDelegate;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.amazon.android.Kiwi;
import java.util.HashMap;

public class OptionActivity extends BaseActivity {

    /* renamed from: a */
    boolean f891a = false;

    /* renamed from: b */
    boolean f892b = false;

    /* renamed from: c */
    boolean f893c = false;

    /* renamed from: d */
    ImageButton f894d;

    /* renamed from: e */
    ImageButton f895e;

    /* renamed from: f */
    ImageButton f896f;

    /* renamed from: g */
    TsumiNekoPadAppDelegate f897g;

    /* renamed from: h */
    String f898h = "";

    /* renamed from: i */
    boolean f899i = false;

    /* renamed from: j */
    Thread f900j = null;

    /* renamed from: k */
    int f901k = 0;

    /* renamed from: a */
    private void m183a(View view) {
        if (this.f899i) {
            this.f897g.f397w[17].mo33a();
        }
        if (this.f891a) {
            this.f891a = false;
            ((ImageButton) view).setBackgroundResource(R.drawable.option_zoom_off);
            return;
        }
        this.f891a = true;
        ((ImageButton) view).setBackgroundResource(R.drawable.option_zoom_on);
    }

    /* renamed from: b */
    private void m184b(View view) {
        if (this.f899i) {
            this.f897g.f397w[17].mo33a();
        }
        if (this.f893c) {
            this.f893c = false;
            ((ImageButton) view).setBackgroundResource(R.drawable.option_right);
            return;
        }
        this.f893c = true;
        ((ImageButton) view).setBackgroundResource(R.drawable.option_left);
    }

    /* renamed from: c */
    private void m185c(View view) {
        if (this.f899i) {
            this.f897g.f397w[17].mo33a();
        }
        if (this.f892b) {
            this.f892b = false;
            ((ImageButton) view).setBackgroundResource(R.drawable.option_sound_off);
            return;
        }
        this.f892b = true;
        ((ImageButton) view).setBackgroundResource(R.drawable.option_sound_on);
    }

    private void onCreateOptionActivity(Bundle bundle) {
        boolean z = false;
        super.onCreate(bundle);
        getWindow().addFlags(1024);
        requestWindowFeature(1);
        this.f897g = (TsumiNekoPadAppDelegate) getApplication();
        setContentView(R.layout.option);
        this.f897g.mo90a(this, (ViewGroup) findViewById(R.id.rootView), -1.0f, -1.0f);
        HashMap hashMap = this.f897g.f386l;
        this.f897g.f400z.getClass();
        this.f891a = ((Integer) hashMap.get("zoom")).intValue() == 0;
        HashMap hashMap2 = this.f897g.f386l;
        this.f897g.f400z.getClass();
        this.f892b = ((Integer) hashMap2.get("sound")).intValue() == 0;
        HashMap hashMap3 = this.f897g.f386l;
        this.f897g.f400z.getClass();
        if (((Integer) hashMap3.get("hand")).intValue() == 0) {
            z = true;
        }
        this.f893c = z;
        this.f896f = (ImageButton) findViewById(R.id.optbtnLR);
        m184b(this.f896f);
        this.f894d = (ImageButton) findViewById(R.id.optbtnZOOM);
        m183a(this.f894d);
        this.f895e = (ImageButton) findViewById(R.id.optbtnSND);
        m185c(this.f895e);
        this.f899i = true;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!Kiwi.onActivityResult(this, requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onClickDlg(View view) {
        if (view == findViewById(R.id.optbtnZOOM)) {
            m183a(view);
        } else if (view == findViewById(R.id.optbtnLR)) {
            m184b(view);
        } else if (view == findViewById(R.id.optbtnSND)) {
            m185c(view);
        }
    }

    public void onClickOnDlg(View view) {
        int i = 1;
        HashMap hashMap = this.f897g.f386l;
        this.f897g.f400z.getClass();
        hashMap.put("zoom", Integer.valueOf(this.f891a ? 1 : 0));
        HashMap hashMap2 = this.f897g.f386l;
        this.f897g.f400z.getClass();
        hashMap2.put("sound", Integer.valueOf(this.f892b ? 1 : 0));
        HashMap hashMap3 = this.f897g.f386l;
        this.f897g.f400z.getClass();
        if (!this.f893c) {
            i = 0;
        }
        hashMap3.put("hand", Integer.valueOf(i));
        this.f897g.f400z.mo8b(this.f897g.f386l);
        if (this.f901k == 0) {
            setResult(-1, new Intent());
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        onCreateOptionActivity(bundle);
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
        setResult(-1, new Intent());
        finish();
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
        super.onStart();
        Kiwi.onStart(this);
    }

    public void onStop() {
        super.onStop();
        Kiwi.onStop(this);
    }
}
