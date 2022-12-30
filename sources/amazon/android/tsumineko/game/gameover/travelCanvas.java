package amazon.android.tsumineko.game.gameover;

import amazon.android.p000a.C0005c;
import amazon.android.p000a.C0014l;
import amazon.android.tsumineko.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class travelCanvas extends SurfaceView implements SurfaceHolder.Callback, Runnable {

    /* renamed from: a */
    public static int[] f760a = {R.drawable.score_num_0, R.drawable.score_num_1, R.drawable.score_num_2, R.drawable.score_num_3, R.drawable.score_num_4, R.drawable.score_num_5, R.drawable.score_num_6, R.drawable.score_num_7, R.drawable.score_num_8, R.drawable.score_num_9};

    /* renamed from: b */
    public static int[] f761b = {R.drawable.total_num_0, R.drawable.total_num_1, R.drawable.total_num_2, R.drawable.total_num_3, R.drawable.total_num_4, R.drawable.total_num_5, R.drawable.total_num_6, R.drawable.total_num_7, R.drawable.total_num_8, R.drawable.total_num_9};

    /* renamed from: A */
    int f762A;

    /* renamed from: B */
    boolean f763B = false;

    /* renamed from: C */
    boolean f764C = false;

    /* renamed from: D */
    boolean f765D = false;

    /* renamed from: E */
    private Thread f766E;

    /* renamed from: F */
    private SurfaceHolder f767F;

    /* renamed from: G */
    private Context f768G = null;

    /* renamed from: c */
    final String f769c = "image/bitmap/";

    /* renamed from: d */
    GameOver f770d;

    /* renamed from: e */
    Canvas f771e = null;

    /* renamed from: f */
    Paint f772f = null;

    /* renamed from: g */
    int f773g = 12;

    /* renamed from: h */
    int f774h = 77;

    /* renamed from: i */
    int f775i = -1;

    /* renamed from: j */
    int f776j = 0;

    /* renamed from: k */
    int f777k = 0;

    /* renamed from: l */
    int f778l = 0;

    /* renamed from: m */
    int f779m = 0;

    /* renamed from: n */
    int f780n = 0;

    /* renamed from: o */
    int f781o = 0;

    /* renamed from: p */
    int f782p = 0;

    /* renamed from: q */
    int f783q = 0;

    /* renamed from: r */
    double f784r = 0.0d;

    /* renamed from: s */
    double f785s = 0.0d;

    /* renamed from: t */
    int f786t = 0;

    /* renamed from: u */
    C0005c f787u;

    /* renamed from: v */
    C0005c f788v;

    /* renamed from: w */
    C0005c f789w;

    /* renamed from: x */
    long f790x;

    /* renamed from: y */
    float f791y = 1.0f;

    /* renamed from: z */
    float f792z = 1.0f;

    public travelCanvas(Context context) {
        super(context);
        Log.d("travelCanvas", "new Instance");
        this.f768G = context;
        this.f767F = getHolder();
        this.f767F.setFormat(-2);
        this.f767F.addCallback(this);
    }

    public travelCanvas(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.d("travelCanvas", "new Instance2");
        this.f768G = context;
        this.f767F = getHolder();
        this.f767F.setFormat(-2);
        this.f767F.addCallback(this);
    }

    /* renamed from: a */
    private static String m166a(int i) {
        try {
            return Integer.toString(i);
        } catch (Exception e) {
            return "0";
        }
    }

    /* renamed from: a */
    public final void mo204a() {
        this.f777k = this.f776j;
        this.f779m = this.f778l;
        this.f781o = this.f780n;
        this.f783q = this.f782p;
    }

    /* renamed from: a */
    public final void mo205a(GameOver gameOver, int i, int i2, int i3, double d, double d2) {
        Log.e("travelCanvas", "startCountUp(" + d + "," + d2 + ")");
        this.f770d = gameOver;
        this.f776j = i;
        this.f777k = 0;
        this.f778l = i2;
        this.f779m = 0;
        this.f780n = i3;
        this.f781o = 0;
        this.f782p = i + i2 + i3;
        this.f783q = 0;
        this.f784r = d;
        this.f785s = 0.0d;
        this.f786t = (int) (this.f784r / ((double) this.f782p));
        this.f775i = 0;
    }

    /* renamed from: b */
    public final int mo206b() {
        return this.f775i;
    }

    /* renamed from: c */
    public final void mo207c() {
        this.f775i = 4;
    }

    public void draw(Canvas canvas) {
        if (canvas != null && this.f775i >= 0) {
            this.f772f = new Paint();
            if (!(this.f791y == 1.0f && this.f792z == 1.0f)) {
                canvas.scale(this.f791y, this.f792z);
            }
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f772f.setColor(Color.argb(255, 255, 255, 255));
            this.f772f.setStyle(Paint.Style.FILL);
            this.f772f.setAntiAlias(true);
            this.f772f.setTextSize((float) this.f774h);
            this.f772f.setTextAlign(Paint.Align.RIGHT);
            this.f787u.mo18a(canvas, this.f772f);
            if (this.f775i == 0) {
                if (this.f777k < this.f776j) {
                    this.f777k++;
                } else if (this.f779m < this.f778l) {
                    this.f779m++;
                } else if (this.f781o < this.f780n) {
                    this.f781o++;
                } else {
                    this.f785s = this.f784r;
                    this.f775i = 1;
                    this.f770d.mo177a(this.f775i);
                }
                if (this.f785s < this.f784r && this.f785s + ((double) this.f786t) <= this.f784r) {
                    this.f785s += (double) this.f786t;
                }
            }
            for (int i = 0; i < 2; i++) {
                this.f788v.mo16a().f0a = 137.0f + (((this.f788v.mo20b().f59a * 4.0f) / 5.0f) * ((float) i));
                this.f788v.mo16a().f1b = 489.0f;
                this.f788v.mo19a(canvas, this.f772f, Math.abs((((int) (this.f785s / 100.0d)) / ((int) Math.pow(10.0d, (double) (1 - i)))) % 10));
            }
            for (int i2 = 0; i2 < 2; i2++) {
                this.f788v.mo16a().f0a = 397.0f + (((this.f788v.mo20b().f59a * 4.0f) / 5.0f) * ((float) i2));
                this.f788v.mo16a().f1b = 489.0f;
                this.f788v.mo19a(canvas, this.f772f, Math.abs((((int) (this.f785s % 100.0d)) / ((int) Math.pow(10.0d, (double) (1 - i2)))) % 10));
            }
            canvas.drawText(m166a(this.f777k), (float) ((this.f774h * 2) + 459), (float) (this.f774h + 659), this.f772f);
            canvas.drawText(m166a(this.f779m), (float) ((this.f774h * 2) + 459), (float) (this.f774h + 774), this.f772f);
            canvas.drawText(m166a(this.f781o), (float) ((this.f774h * 2) + 459), (float) (this.f774h + 889), this.f772f);
            if (this.f781o == this.f780n) {
                for (int i3 = 0; i3 < 3; i3++) {
                    this.f789w.mo16a().f0a = 459.0f + (this.f789w.mo20b().f59a * ((float) i3));
                    this.f789w.mo16a().f1b = 1020.0f;
                    this.f789w.mo19a(canvas, this.f772f, Math.abs((this.f782p / ((int) Math.pow(10.0d, (double) (2 - i3)))) % 10));
                }
            }
        }
    }

    public void run() {
        this.f767F.setFormat(-2);
        while (this.f766E != null) {
            try {
                if (this.f763B && !this.f765D) {
                    this.f765D = true;
                    if (System.currentTimeMillis() - this.f790x > ((long) (1000 / this.f773g))) {
                        this.f790x = System.currentTimeMillis();
                        this.f771e = this.f767F.lockCanvas();
                        draw(this.f771e);
                    }
                }
                if (this.f771e != null) {
                    try {
                        getHolder().unlockCanvasAndPost(this.f771e);
                        this.f771e = null;
                    } catch (Exception e) {
                    }
                }
                this.f765D = false;
            } catch (Exception e2) {
                Log.e("travelCanvas", "run Error=" + e2.getMessage());
                if (this.f771e != null) {
                    try {
                        getHolder().unlockCanvasAndPost(this.f771e);
                        this.f771e = null;
                    } catch (Exception e3) {
                    }
                }
                this.f765D = false;
            } catch (Throwable th) {
                if (this.f771e != null) {
                    try {
                        getHolder().unlockCanvasAndPost(this.f771e);
                        this.f771e = null;
                    } catch (Exception e4) {
                    }
                }
                this.f765D = false;
                throw th;
            }
        }
        this.f764C = true;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f762A = getResources().getConfiguration().orientation;
        this.f791y = ((float) getWidth()) / 800.0f;
        this.f792z = ((float) getHeight()) / 1280.0f;
        if (!this.f763B) {
            this.f787u = new C0005c(C0014l.m61a(this.f768G, R.drawable.gameover_bg), this.f791y, this.f792z);
            this.f788v = new C0005c(C0014l.m61a(this.f768G, R.drawable.score_num_0), this.f791y, this.f792z);
            for (int i4 = 1; i4 < 10; i4++) {
                this.f788v.mo17a(C0014l.m61a(this.f768G, f760a[i4]));
            }
            this.f789w = new C0005c(C0014l.m61a(this.f768G, R.drawable.total_num_0), this.f791y, this.f792z);
            for (int i5 = 1; i5 < 10; i5++) {
                this.f789w.mo17a(C0014l.m61a(this.f768G, f761b[i5]));
            }
            this.f763B = true;
        }
        if (this.f775i == 0) {
            this.f770d.mo177a(this.f775i);
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f766E == null) {
            this.f762A = getResources().getConfiguration().orientation;
            this.f791y = ((float) getWidth()) / 800.0f;
            this.f792z = ((float) getHeight()) / 1280.0f;
            this.f764C = false;
            this.f766E = new Thread(this);
            this.f766E.start();
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.d("travelCanvas", "surfaceDestroyed");
        try {
            this.f766E = null;
            while (!this.f764C) {
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                }
            }
            if (this.f771e != null) {
                try {
                    getHolder().unlockCanvasAndPost(this.f771e);
                    this.f771e = null;
                } catch (Exception e2) {
                }
            }
            if (this.f787u != null) {
                this.f787u.mo21c();
            }
            if (this.f788v != null) {
                this.f788v.mo21c();
            }
            if (this.f789w != null) {
                this.f789w.mo21c();
            }
            this.f765D = false;
            Log.d("travelCanvas", "Destroy OK.");
            System.gc();
        } catch (Exception e3) {
        }
        this.f763B = false;
    }
}
