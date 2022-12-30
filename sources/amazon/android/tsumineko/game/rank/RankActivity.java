package amazon.android.tsumineko.game.rank;

import amazon.android.p000a.C0015m;
import amazon.android.p000a.p001a.C0003c;
import amazon.android.tsumineko.BaseActivity;
import amazon.android.tsumineko.R;
import amazon.android.tsumineko.TsumiNekoAndActivity;
import amazon.android.tsumineko.TsumiNekoPadAppDelegate;
import amazon.android.tsumineko.game.GameActivity;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.android.Kiwi;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class RankActivity extends BaseActivity implements View.OnTouchListener {

    /* renamed from: a */
    boolean f860a = false;

    /* renamed from: b */
    boolean f861b = false;

    /* renamed from: c */
    TsumiNekoPadAppDelegate f862c;

    /* renamed from: d */
    String[] f863d = {"", "", ""};

    /* renamed from: e */
    String f864e = "";

    /* renamed from: f */
    Timer f865f = null;

    /* renamed from: g */
    int f866g;

    /* renamed from: h */
    TextView f867h;

    /* renamed from: i */
    TextView f868i;

    /* renamed from: j */
    TextView f869j;

    /* renamed from: k */
    TextView f870k;

    /* renamed from: l */
    TextView f871l;

    /* renamed from: m */
    TextView f872m;

    /* renamed from: n */
    TextView f873n;

    /* renamed from: o */
    int f874o = 0;

    /* renamed from: p */
    int f875p = 1;

    /* renamed from: q */
    String f876q = "";

    /* renamed from: r */
    String f877r = "";

    /* renamed from: s */
    int f878s = 0;

    /* renamed from: t */
    int f879t = 0;

    /* renamed from: u */
    int f880u = 0;

    /* renamed from: a */
    private void m181a() {
        try {
            this.f865f.cancel();
        } catch (Exception e) {
        }
        try {
            this.f865f = null;
        } catch (Exception e2) {
        }
    }

    private void onCreateRankActivity(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(1024);
        requestWindowFeature(1);
        this.f862c = (TsumiNekoPadAppDelegate) getApplication();
        setContentView(R.layout.rank);
        this.f878s = C0015m.m65a(23);
        this.f879t = C0015m.m65a(37);
        this.f880u = C0015m.m65a(19);
        this.f863d[0] = getString(R.string.str_sendscore);
        this.f863d[1] = getString(R.string.str_sendscoreok);
        this.f863d[2] = getString(R.string.str_sendscoreng);
        this.f874o = 0;
        this.f864e = "";
        this.f876q = getString(R.string.twitter_send_message);
        this.f877r = "https://twitter.com/intent/tweet?text=";
        ((ImageView) findViewById(R.id.ibPlay)).setVisibility(8);
        findViewById(R.id.rbRetry).setOnTouchListener(this);
        this.f862c.mo90a(this, (ViewGroup) findViewById(R.id.rootView), -1.0f, -1.0f);
    }

    private void onDestroyRankActivity() {
        super.onDestroy();
    }

    private void onResumeRankActivity() {
        super.onResume();
    }

    private void onStartRankActivity() {
        super.onStart();
        this.f872m = (TextView) findViewById(R.id.recCATS);
        this.f872m.setTextSize(1, (float) this.f878s);
        this.f872m.setText(String.format("%1$9d", new Object[]{Integer.valueOf((int) this.f862c.f400z.mo13e())}));
        this.f873n = (TextView) findViewById(R.id.recToday);
        this.f873n.setTextSize(1, (float) this.f878s);
        this.f873n.setText(String.format("%1$9d", new Object[]{Integer.valueOf(this.f862c.f400z.mo15g())}));
        C0003c[] d = this.f862c.f400z.mo12d();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= d.length) {
                break;
            }
            if (i2 < 5) {
                TextView textView = (TextView) findViewById(R.id.rec1AA1 + (i2 * 5));
                textView.setText(new StringBuilder().append((((int) d[i2].f51f) / 100) % 100).toString());
                textView.setTextSize(1, (float) this.f879t);
                ((TextView) findViewById(R.id.rec1AA1 + (i2 * 5) + 1)).setTextSize(1, (float) this.f879t);
                ((TextView) findViewById(R.id.rec1AA1 + (i2 * 5) + 3)).setTextSize(1, (float) this.f879t);
                TextView textView2 = (TextView) findViewById(R.id.rec1AA1 + (i2 * 5) + 2);
                textView2.setText(String.format("%1$02d", new Object[]{Integer.valueOf(((int) d[i2].f51f) % 100)}));
                textView2.setTextSize(1, (float) this.f879t);
                TextView textView3 = (TextView) findViewById(R.id.rec1AA1 + (i2 * 5) + 4);
                textView3.setTextSize(1, (float) this.f880u);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy'/'MM'/'dd' 'HH':'mm");
                Date date = new Date();
                int i3 = d[i2].f46a + -1900 < 0 ? 0 : d[i2].f46a - 1900;
                int i4 = d[i2].f47b != 0 ? d[i2].f47b - 1 : d[i2].f47b;
                int i5 = d[i2].f48c != 0 ? d[i2].f48c : 1;
                int i6 = d[i2].f49d;
                int i7 = d[i2].f50e;
                date.setYear(i3);
                date.setMonth(i4);
                date.setDate(i5);
                date.setHours(i6);
                date.setMinutes(i7);
                textView3.setText(simpleDateFormat.format(date));
            }
            if (d[i2].f52g == this.f862c.f398x.f52g && d[i2].f48c == this.f862c.f398x.f48c && d[i2].f51f == this.f862c.f398x.f51f && d[i2].f49d == this.f862c.f398x.f49d && d[i2].f54i == this.f862c.f398x.f54i && d[i2].f50e == this.f862c.f398x.f50e && d[i2].f47b == this.f862c.f398x.f47b && d[i2].f56k == this.f862c.f398x.f56k && d[i2].f55j == this.f862c.f398x.f55j && d[i2].f53h == this.f862c.f398x.f53h && d[i2].f46a == this.f862c.f398x.f46a) {
                this.f874o = i2 + 1;
            }
            i = i2 + 1;
        }
        if (this.f874o > 0 && this.f874o <= 5) {
            this.f867h = (TextView) findViewById(getResources().getIdentifier("rec" + this.f874o + "AA1", "id", getPackageName()));
            this.f868i = (TextView) findViewById(getResources().getIdentifier("rec" + this.f874o + "AA2", "id", getPackageName()));
            this.f869j = (TextView) findViewById(getResources().getIdentifier("rec" + this.f874o + "CM1", "id", getPackageName()));
            this.f870k = (TextView) findViewById(getResources().getIdentifier("rec" + this.f874o + "CM2", "id", getPackageName()));
            this.f871l = (TextView) findViewById(getResources().getIdentifier("rec" + this.f874o + "ZZ1", "id", getPackageName()));
            this.f865f = null;
            this.f865f = new Timer(true);
            this.f865f.schedule(new C0040a(this), 1000, 1000);
        }
    }

    private void onStopRankActivity() {
        super.onStop();
        try {
            m181a();
            Log.e("RankActivity", "onStop");
        } catch (Exception e) {
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!Kiwi.onActivityResult(this, requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onClick(View view) {
        if (view == findViewById(R.id.rbTop)) {
            if (!this.f860a) {
                this.f860a = true;
                m181a();
                Intent intent = new Intent(this, TsumiNekoAndActivity.class);
                intent.setFlags(67108864);
                startActivity(intent);
            }
        } else if (view == findViewById(R.id.rbRetry)) {
            if (!this.f860a) {
                this.f860a = true;
                this.f862c.f397w[0].mo33a();
                m181a();
                Intent intent2 = new Intent(this, GameActivity.class);
                intent2.setFlags(67108864);
                startActivity(intent2);
            }
        } else if (view == findViewById(R.id.rbTwitter)) {
            try {
                int g = this.f862c.f400z.mo15g();
                int e = (int) this.f862c.f400z.mo13e();
                int a = (int) this.f862c.f400z.mo1a(true);
                if (g <= 1) {
                    this.f876q = this.f876q.replace("$TODAY_NUM$", String.valueOf(Integer.toString(g)) + getText(R.string.neko_unit_one));
                } else {
                    this.f876q = this.f876q.replace("$TODAY_NUM$", String.valueOf(Integer.toString(g)) + getText(R.string.neko_unit_any));
                }
                if (e <= 1) {
                    this.f876q = this.f876q.replace("$TOTAL_NUM$", String.valueOf(Integer.toString(e)) + getText(R.string.neko_unit_one));
                } else {
                    this.f876q = this.f876q.replace("$TOTAL_NUM$", String.valueOf(Integer.toString(e)) + getText(R.string.neko_unit_any));
                }
                if (a < 100) {
                    this.f876q = this.f876q.replace("$TOTAL_HEIGHT$", String.valueOf(Integer.toString(a % 100)) + "cm");
                } else {
                    this.f876q = this.f876q.replace("$TOTAL_HEIGHT$", String.valueOf(Integer.toString(a / 100)) + "M" + Integer.toString(a % 100) + "cm");
                }
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.valueOf(this.f877r) + this.f876q + "%20%23tsumineko")));
            } catch (Exception e2) {
                Log.e("RankActivity", "onClick ERROR1=" + e2.getMessage());
            }
        } else if (view == findViewById(R.id.rdBanner)) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.tsumineko.com/")));
        }
    }

    public void onCreate(Bundle bundle) {
        onCreateRankActivity(bundle);
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
        onDestroyRankActivity();
        Kiwi.onDestroy((Activity) this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        Kiwi.onPause(this);
    }

    public void onResume() {
        onResumeRankActivity();
        Kiwi.onResume(this);
    }

    public void onStart() {
        onStartRankActivity();
        Kiwi.onStart(this);
    }

    public void onStop() {
        onStopRankActivity();
        Kiwi.onStop(this);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = findViewById(R.id.rbRetry);
        if (motionEvent.getAction() == 1) {
            ((ImageView) findViewById(R.id.ibPlay)).setVisibility(0);
            onClick(findViewById);
        }
        return true;
    }
}
