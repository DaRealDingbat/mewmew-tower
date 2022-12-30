package amazon.android.tsumineko.game.gameover;

import amazon.android.p000a.C0014l;
import amazon.android.tsumineko.R;
import amazon.android.tsumineko.TsumiNekoPadAppDelegate;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Button;
import java.lang.reflect.Array;

/* renamed from: amazon.android.tsumineko.game.gameover.a */
final class C0033a implements SurfaceHolder.Callback, Runnable {

    /* renamed from: G */
    public static final int[][] f719G = {new int[]{-352, 430, 58, 115, 68, -300, 465, 16, 20, 72}, new int[]{928, 368, 58, 115, 68, 976, 330, 16, 20, 72}};

    /* renamed from: H */
    public static final int[][] f720H = {new int[]{312, 281, 337, 444, 500}, new int[]{400, 934, 878, 771, 715}};

    /* renamed from: A */
    int f721A;

    /* renamed from: B */
    float f722B;

    /* renamed from: C */
    float f723C;

    /* renamed from: D */
    RectF f724D;

    /* renamed from: E */
    RectF f725E;

    /* renamed from: F */
    boolean f726F;

    /* renamed from: I */
    private Thread f727I;

    /* renamed from: J */
    private SurfaceHolder f728J;

    /* renamed from: K */
    private Activity f729K = null;

    /* renamed from: L */
    private TsumiNekoPadAppDelegate f730L;

    /* renamed from: M */
    private SurfaceView f731M;

    /* renamed from: a */
    boolean f732a = true;

    /* renamed from: b */
    int f733b = 800;

    /* renamed from: c */
    Button f734c;

    /* renamed from: d */
    Button f735d;

    /* renamed from: e */
    int[][] f736e;

    /* renamed from: f */
    int[] f737f;

    /* renamed from: g */
    int[][] f738g;

    /* renamed from: h */
    int[][] f739h;

    /* renamed from: i */
    int[] f740i;

    /* renamed from: j */
    Bitmap f741j;

    /* renamed from: k */
    Bitmap f742k;

    /* renamed from: l */
    Bitmap f743l;

    /* renamed from: m */
    Bitmap f744m;

    /* renamed from: n */
    Bitmap f745n;

    /* renamed from: o */
    Bitmap f746o;

    /* renamed from: p */
    Bitmap f747p;

    /* renamed from: q */
    Bitmap f748q;

    /* renamed from: r */
    Bitmap f749r;

    /* renamed from: s */
    Bitmap f750s;

    /* renamed from: t */
    Bitmap f751t;

    /* renamed from: u */
    Bitmap[] f752u;

    /* renamed from: v */
    Bitmap[] f753v;

    /* renamed from: w */
    Bitmap[] f754w;

    /* renamed from: x */
    Bitmap[] f755x;

    /* renamed from: y */
    Bitmap f756y;

    /* renamed from: z */
    int[] f757z;

    public C0033a(Activity activity, SurfaceView surfaceView) {
        int[] iArr = new int[3];
        iArr[0] = 8;
        iArr[1] = R.raw.rank01;
        this.f736e = new int[][]{iArr, new int[]{12, R.raw.rank02, 1}, new int[]{16, R.raw.rank03, 2}, new int[]{20, R.raw.rank04, 3}, new int[]{24, R.raw.rank05, 4}, new int[]{28, R.raw.rank06, 5}, new int[]{32, R.raw.rank07, 6}, new int[]{36, R.raw.rank08, 7}, new int[]{40, R.raw.rank09, 8}, new int[]{44, R.raw.rank10, 9}, new int[]{48, R.raw.rank11, 10}, new int[]{52, R.raw.rank12, 11}, new int[]{56, R.raw.rank13, 12}, new int[]{60, R.raw.rank14, 13}, new int[]{66, R.raw.rank15, 14}, new int[]{71, R.raw.rank16, 15}, new int[]{99999, R.raw.rank17, 16}};
        this.f740i = new int[2];
        this.f741j = null;
        this.f742k = null;
        this.f743l = null;
        this.f744m = null;
        this.f745n = null;
        this.f746o = null;
        this.f747p = null;
        this.f748q = null;
        this.f749r = null;
        this.f750s = null;
        this.f751t = null;
        this.f752u = new Bitmap[10];
        this.f753v = new Bitmap[10];
        this.f754w = new Bitmap[10];
        this.f755x = new Bitmap[10];
        this.f756y = null;
        this.f757z = new int[2];
        this.f724D = new RectF(0.0f, 0.0f, 800.0f, 640.0f);
        this.f725E = new RectF(0.0f, 640.0f, 800.0f, 1280.0f);
        this.f726F = false;
        this.f729K = activity;
        this.f731M = surfaceView;
        this.f730L = (TsumiNekoPadAppDelegate) this.f729K.getApplication();
        this.f728J = surfaceView.getHolder();
        this.f728J.addCallback(this);
        this.f721A = 0;
        this.f737f = new int[2];
        this.f740i[0] = 0;
        this.f740i[1] = 0;
        this.f739h = (int[][]) Array.newInstance(Integer.TYPE, new int[]{2, 4});
        this.f739h[0][0] = -1;
        this.f739h[0][1] = -1;
        this.f739h[0][2] = -1;
        this.f739h[0][3] = -1;
        this.f739h[1][0] = -1;
        this.f739h[1][1] = -1;
        this.f739h[1][2] = -1;
        this.f739h[1][3] = -1;
        this.f738g = (int[][]) Array.newInstance(Integer.TYPE, new int[]{2, 4});
        this.f738g[0][0] = this.f730L.f398x.f53h;
        this.f738g[0][1] = this.f730L.f398x.f54i;
        this.f738g[0][2] = this.f730L.f398x.f52g;
        this.f738g[0][3] = this.f738g[0][0] + this.f738g[0][1] + this.f738g[0][2];
        this.f738g[1][0] = this.f730L.f399y.f53h;
        this.f738g[1][1] = this.f730L.f399y.f54i;
        this.f738g[1][2] = this.f730L.f399y.f52g;
        this.f738g[1][3] = this.f738g[1][0] + this.f738g[1][1] + this.f738g[1][2];
        for (int i = 0; i < 2; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f736e.length) {
                    break;
                } else if (this.f736e[i2][0] >= this.f738g[i][3]) {
                    this.f757z[i] = i2 + 19;
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.f734c = (Button) this.f729K.findViewById(R.id.bgmminiTOP);
        this.f735d = (Button) this.f729K.findViewById(R.id.bgmminiRETRY);
        this.f732a = true;
    }

    /* renamed from: a */
    private void m164a(Canvas canvas, int i, int i2, Paint paint) {
        int i3 = (i2 / 1000) % 10;
        int i4 = (i2 / 100) % 10;
        int i5 = (i2 / 10) % 10;
        int i6 = i2 % 10;
        if (i == 0) {
            canvas.drawBitmap(this.f754w[i6], (float) f720H[i][0], (float) f720H[i][1], paint);
            canvas.drawBitmap(this.f754w[i5], (float) f720H[i][0], (float) f720H[i][2], paint);
            canvas.drawBitmap(this.f754w[i4], (float) f720H[i][0], (float) f720H[i][3], paint);
            canvas.drawBitmap(this.f754w[i3], (float) f720H[i][0], (float) f720H[i][4], paint);
            return;
        }
        canvas.drawBitmap(this.f755x[i6], (float) f720H[i][0], (float) f720H[i][1], paint);
        canvas.drawBitmap(this.f755x[i5], (float) f720H[i][0], (float) f720H[i][2], paint);
        canvas.drawBitmap(this.f755x[i4], (float) f720H[i][0], (float) f720H[i][3], paint);
        canvas.drawBitmap(this.f755x[i3], (float) f720H[i][0], (float) f720H[i][4], paint);
    }

    /* renamed from: a */
    private void m165a(Canvas canvas, int i, int[] iArr, Paint paint) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < 4) {
                if (iArr[i3] >= 0) {
                    if (i3 == 3) {
                        int i4 = iArr[i3];
                        int i5 = ((i4 % 1000) / 100) % 10;
                        int i6 = ((i4 % 100) / 10) % 10;
                        int i7 = i4 % 10;
                        int i8 = i == 0 ? f719G[i][1] + (f719G[i][4] * i3) : -(f719G[i][1] - (f719G[i][4] * i3));
                        if (i4 >= 100) {
                            canvas.drawBitmap(this.f753v[i5], (float) f719G[i][0], (float) i8, paint);
                        }
                        if (i4 >= 10) {
                            canvas.drawBitmap(this.f753v[i6], (float) (f719G[i][0] + f719G[i][2]), (float) i8, paint);
                        }
                        canvas.drawBitmap(this.f753v[i7], (float) (f719G[i][0] + f719G[i][3]), (float) i8, paint);
                    } else {
                        int i9 = i == 0 ? f719G[i][6] + (f719G[i][9] * i3) : -(f719G[i][6] - (f719G[i][9] * i3));
                        paint.setColor(-1);
                        canvas.drawText(new StringBuilder().append(iArr[i3]).toString(), (float) ((iArr[i3] < 10 ? f719G[i][8] : 0) + f719G[i][5]), (float) i9, paint);
                    }
                }
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    public final void run() {
        Log.d("MainSurfaceView", "run");
        this.f730L.f397w[18].mo34a(-1);
        this.f730L.f397w[18].mo33a();
        while (this.f727I != null) {
            for (int i = 0; i < 2; i++) {
                if (this.f740i[i] < 3) {
                    this.f739h[i][this.f740i[i]] = this.f739h[i][this.f740i[i]] + 1;
                    if (this.f739h[i][this.f740i[i]] >= this.f738g[i][this.f740i[i]]) {
                        this.f740i[i] = this.f740i[i] + 1;
                    }
                } else if (this.f740i[i] >= 3) {
                    if (this.f740i[i] == 3) {
                        this.f730L.f397w[this.f757z[i]].mo33a();
                        this.f739h[i][this.f740i[i]] = this.f738g[i][this.f740i[i]];
                        int[] iArr = this.f740i;
                        iArr[i] = iArr[i] + 1;
                    } else if (this.f740i[0] > 3 && this.f740i[1] > 3) {
                        this.f730L.f397w[18].mo34a(0);
                        this.f730L.f397w[18].mo35b();
                        int i2 = this.f730L.f398x.f51f > this.f730L.f399y.f51f ? (int) this.f730L.f398x.f51f : (int) this.f730L.f399y.f51f;
                        this.f734c.getHandler().post(new C0034b(this));
                        this.f735d.getHandler().post(new C0035c(this));
                        if (!this.f726F) {
                            this.f726F = true;
                            if (i2 >= this.f733b) {
                                this.f730L.f397w[37].mo34a(0);
                                this.f730L.f397w[37].mo33a();
                            } else {
                                this.f730L.f397w[38].mo34a(0);
                                this.f730L.f397w[38].mo33a();
                            }
                        }
                        this.f727I = null;
                    }
                }
            }
            try {
                int i3 = (int) this.f730L.f398x.f51f;
                int[] iArr2 = this.f739h[0];
                int i4 = this.f740i[0];
                int i5 = (int) this.f730L.f399y.f51f;
                int[] iArr3 = this.f739h[1];
                int i6 = this.f740i[1];
                Canvas lockCanvas = this.f728J.lockCanvas();
                Paint paint = new Paint();
                if (lockCanvas != null) {
                    lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    if (!(this.f722B == 1.0f && this.f723C == 1.0f)) {
                        lockCanvas.translate(0.0f, (float) ((int) ((((float) this.f731M.getHeight()) - (1280.0f * this.f722B)) / 2.0f)));
                        lockCanvas.scale(this.f722B, this.f722B);
                    }
                    lockCanvas.drawBitmap(this.f742k, 0.0f, (float) ((1280 - this.f742k.getHeight()) / 2), paint);
                    paint.setAntiAlias(true);
                    paint.setTextSize(38.0f);
                    lockCanvas.rotate(270.0f);
                    m165a(lockCanvas, 0, iArr2, paint);
                    lockCanvas.rotate(180.0f);
                    m165a(lockCanvas, 1, iArr3, paint);
                    lockCanvas.rotate(270.0f);
                    m164a(lockCanvas, 0, i3, paint);
                    m164a(lockCanvas, 1, i5, paint);
                    if (i4 > 3) {
                        Paint paint2 = new Paint();
                        paint2.setColor(Color.argb(136, 0, 0, 0));
                        paint2.setStyle(Paint.Style.FILL);
                        lockCanvas.drawRect(this.f724D, paint2);
                        paint2.setAlpha(255);
                        lockCanvas.drawBitmap(this.f750s, ((float) (800 - this.f750s.getWidth())) - 12.8f, ((float) ((1280 - this.f742k.getHeight()) / 2)) + ((512.0f - ((float) this.f750s.getHeight())) / 2.0f), paint2);
                    }
                    if (i6 > 3) {
                        Paint paint3 = new Paint();
                        paint3.setColor(Color.argb(136, 0, 0, 0));
                        paint3.setStyle(Paint.Style.FILL);
                        lockCanvas.drawRect(this.f725E, paint3);
                        paint3.setAlpha(255);
                        lockCanvas.drawBitmap(this.f751t, 12.8f, ((float) ((1280 - this.f742k.getHeight()) / 2)) + 512.0f + 16.0f, paint3);
                    }
                    this.f728J.unlockCanvasAndPost(lockCanvas);
                }
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
        this.f732a = false;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Log.d("MainSurfaceView", "surfaceChanged");
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.d("MainSurfaceView", "surfaceCreated");
        if (this.f727I == null) {
            Canvas lockCanvas = surfaceHolder.lockCanvas();
            this.f722B = ((float) this.f731M.getWidth()) / 800.0f;
            this.f723C = ((float) this.f731M.getHeight()) / 1280.0f;
            this.f741j = C0014l.m61a(this.f729K, R.drawable.gameovermini_bg2);
            this.f742k = C0014l.m63a(this.f741j, 800, 1027);
            if (this.f741j != null) {
                this.f741j.recycle();
                this.f741j = null;
            }
            this.f741j = C0014l.m61a(this.f729K, R.drawable.draw);
            this.f743l = C0014l.m63a(this.f741j, 384, 169);
            if (this.f741j != null) {
                this.f741j.recycle();
                this.f741j = null;
            }
            this.f741j = C0014l.m61a(this.f729K, R.drawable.win);
            this.f744m = C0014l.m63a(this.f741j, 384, 169);
            if (this.f741j != null) {
                this.f741j.recycle();
                this.f741j = null;
            }
            this.f741j = C0014l.m61a(this.f729K, R.drawable.lose);
            this.f745n = C0014l.m63a(this.f741j, 384, 169);
            if (this.f741j != null) {
                this.f741j.recycle();
                this.f741j = null;
            }
            if (this.f730L.f398x.f51f < this.f730L.f399y.f51f) {
                this.f750s = C0014l.m64b(this.f745n);
                this.f751t = C0014l.m62a(this.f744m);
            } else if (this.f730L.f398x.f51f > this.f730L.f399y.f51f) {
                this.f750s = C0014l.m64b(this.f744m);
                this.f751t = C0014l.m62a(this.f745n);
            } else if (this.f730L.f398x.f51f == this.f730L.f399y.f51f) {
                this.f750s = C0014l.m64b(this.f743l);
                this.f751t = C0014l.m62a(this.f743l);
            }
            for (int i = 0; i < 10; i++) {
                this.f741j = C0014l.m61a(this.f729K, R.drawable.score_num_0 + i);
                this.f752u[i] = C0014l.m63a(this.f741j, 64, 81);
                if (this.f741j != null) {
                    this.f741j.recycle();
                    this.f741j = null;
                }
                this.f754w[i] = C0014l.m64b(this.f752u[i]);
                this.f755x[i] = C0014l.m62a(this.f752u[i]);
                this.f741j = C0014l.m61a(this.f729K, R.drawable.total_num_0 + i);
                this.f753v[i] = C0014l.m63a(this.f741j, 64, 81);
                if (this.f741j != null) {
                    this.f741j.recycle();
                    this.f741j = null;
                }
            }
            surfaceHolder.unlockCanvasAndPost(lockCanvas);
            this.f727I = new Thread(this);
            this.f727I.start();
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.d("MainSurfaceView", "surfaceDestroyed");
        this.f727I = null;
        while (this.f732a) {
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
        if (this.f742k != null) {
            this.f742k.recycle();
            this.f742k = null;
        }
        if (this.f743l != null) {
            this.f743l.recycle();
            this.f743l = null;
        }
        if (this.f744m != null) {
            this.f744m.recycle();
            this.f744m = null;
        }
        if (this.f745n != null) {
            this.f745n.recycle();
            this.f745n = null;
        }
        if (this.f745n != null) {
            this.f745n.recycle();
            this.f745n = null;
        }
        if (this.f756y != null) {
            this.f756y.recycle();
            this.f756y = null;
        }
        if (this.f747p != null) {
            this.f747p.recycle();
            this.f747p = null;
        }
        if (this.f746o != null) {
            this.f746o.recycle();
            this.f746o = null;
        }
        if (this.f749r != null) {
            this.f749r.recycle();
            this.f749r = null;
        }
        if (this.f748q != null) {
            this.f748q.recycle();
            this.f748q = null;
        }
        if (this.f750s != null) {
            this.f750s.recycle();
            this.f750s = null;
        }
        if (this.f751t != null) {
            this.f751t.recycle();
            this.f751t = null;
        }
        for (int i = 0; i < 10; i++) {
            if (this.f752u[i] != null) {
                this.f752u[i].recycle();
                this.f752u[i] = null;
            }
            if (this.f754w[i] != null) {
                this.f754w[i].recycle();
                this.f754w[i] = null;
            }
            if (this.f755x[i] != null) {
                this.f755x[i].recycle();
                this.f755x[i] = null;
            }
            if (this.f753v[i] != null) {
                this.f753v[i].recycle();
                this.f753v[i] = null;
            }
        }
    }
}
