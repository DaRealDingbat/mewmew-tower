package amazon.android.tsumineko.game;

import amazon.android.p000a.C0006d;
import amazon.android.p000a.C0008f;
import amazon.android.p000a.C0009g;
import amazon.android.tsumineko.TsumiNekoPadAppDelegate;
import amazon.android.tsumineko.battle.C0018a;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import com.amazon.mas.kiwi.util.Base64;
import java.util.Timer;
import javax.microedition.khronos.opengles.GL10;

public class EAGLView extends GLSurfaceView implements SurfaceHolder.Callback {

    /* renamed from: a */
    public C0008f f531a;

    /* renamed from: b */
    public boolean f532b;

    /* renamed from: c */
    boolean f533c;

    /* renamed from: d */
    int f534d;

    /* renamed from: e */
    Timer f535e;

    /* renamed from: f */
    int f536f;

    /* renamed from: g */
    C0032g f537g = null;

    /* renamed from: h */
    C0018a f538h = null;

    /* renamed from: i */
    public Handler f539i = null;

    /* renamed from: j */
    float f540j;

    /* renamed from: k */
    public boolean f541k = false;

    /* renamed from: l */
    MotionEvent[] f542l = new MotionEvent[2];

    /* renamed from: m */
    MotionEvent[] f543m = new MotionEvent[2];

    /* renamed from: n */
    MotionEvent[] f544n = new MotionEvent[2];

    /* renamed from: o */
    public int f545o;

    /* renamed from: p */
    public int f546p;

    /* renamed from: q */
    boolean f547q = false;

    /* renamed from: r */
    private Context f548r;

    /* renamed from: s */
    private TsumiNekoPadAppDelegate f549s;

    /* renamed from: t */
    private int[] f550t = new int[2];

    /* renamed from: u */
    private int f551u = 0;

    /* renamed from: v */
    private int f552v = 0;

    /* renamed from: w */
    private int f553w = 0;

    /* renamed from: x */
    private long f554x = 0;

    public EAGLView(Context context) {
        super(context);
        this.f548r = context;
    }

    /* renamed from: a */
    private int[] m107a(MotionEvent motionEvent, int i) {
        int i2;
        int[] iArr = new int[3];
        float f = C0006d.f75E / ((float) this.f531a.f273j);
        float f2 = C0006d.f76F / ((float) this.f531a.f274k);
        float x = (motionEvent.getX(i) - ((float) ((this.f545o - this.f531a.f273j) / 2))) * f;
        float y = (motionEvent.getY(i) - ((float) ((this.f546p - this.f531a.f274k) / 2))) * f2;
        int i3 = y < C0006d.f76F / 2.0f ? 0 : 1;
        int i4 = (int) ((x / C0006d.f75E) * C0006d.f76F);
        switch (i3) {
            case Base64.ENCODE /*1*/:
                i4 = ((int) C0006d.f76F) - i4;
                i2 = (int) (((y - 640.0f) / 640.0f) * 1024.0f);
                break;
            default:
                i2 = (int) (((640.0f - y) / 640.0f) * 1024.0f);
                break;
        }
        iArr[0] = i2;
        iArr[1] = i4;
        iArr[2] = i3;
        return iArr;
    }

    /* renamed from: a */
    public final GL10 mo123a() {
        if (this.f531a != null) {
            return this.f531a.mo22a();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo124a(float f, float f2, float f3) {
        if (this.f532b) {
            if (this.f537g != null) {
                this.f537g.mo169a(f * -1.0f, f2, f3);
            }
            if (this.f538h != null) {
                this.f538h.mo116b(f * -1.0f, f2, f3);
                this.f538h.mo112a(f * -1.0f, f2, f3);
            }
        }
    }

    /* renamed from: a */
    public final void mo125a(int i) {
        if (this.f531a != null) {
            this.f531a.mo23a(i);
        }
    }

    /* renamed from: a */
    public final void mo126a(Rect rect, int i, TsumiNekoPadAppDelegate tsumiNekoPadAppDelegate, Handler handler) {
        this.f549s = tsumiNekoPadAppDelegate;
        this.f539i = handler;
        if (this.f531a == null) {
            this.f536f = i;
            this.f531a = this.f536f == 1 ? new C0008f(this) : new C0009g(this);
            setRenderer(this.f531a);
            setRenderMode(1);
        }
        this.f532b = false;
        this.f533c = false;
        this.f534d = 1;
        this.f535e = null;
        if (this.f531a != null) {
            this.f531a.mo24a(rect);
        }
    }

    /* renamed from: a */
    public final void mo127a(MotionEvent motionEvent) {
        this.f542l[0] = motionEvent;
    }

    /* renamed from: b */
    public final Context mo128b() {
        return this.f548r;
    }

    /* renamed from: b */
    public final void mo129b(MotionEvent motionEvent) {
        if (this.f532b) {
            motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8);
            float f = C0006d.f75E / ((float) this.f531a.f273j);
            float f2 = C0006d.f76F / ((float) this.f531a.f274k);
            float f3 = (float) ((this.f545o - this.f531a.f273j) / 2);
            float f4 = (float) ((this.f546p - this.f531a.f274k) / 2);
            Log.e("EAGLVIEW", "orig_width=" + this.f545o + ",orig_height=" + this.f546p);
            if (this.f537g != null) {
                this.f537g.mo168a(f * (motionEvent.getX() - f3), (motionEvent.getY() - f4) * f2);
            } else if (this.f538h != null) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i = 0; i < pointerCount; i++) {
                    int[] a = m107a(motionEvent, i);
                    this.f538h.mo113a((float) a[0], (float) a[1], a[2]);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo130c() {
        if (this.f531a != null) {
            this.f531a.mo26b();
            Log.e("EGALView", "drawStart Renderer init ok.");
            this.f531a.mo27c();
        }
        if (this.f537g != null && this.f536f == 1) {
            Log.e("EAGLView", "drawStart");
            this.f537g.mo170b();
        }
        if (this.f538h != null && this.f536f == 0) {
            this.f538h.mo115b();
        }
        for (int i = 0; i < this.f550t.length; i++) {
            this.f550t[i] = -1;
        }
    }

    /* renamed from: c */
    public final void mo131c(MotionEvent motionEvent) {
        this.f543m[0] = motionEvent;
    }

    /* renamed from: d */
    public final void mo132d() {
        if (this.f532b) {
            this.f541k = false;
            int i = 0;
            while (true) {
                if (i >= (this.f536f == 1 ? 1 : 2)) {
                    break;
                }
                if (this.f542l[i] != null) {
                    mo129b(this.f542l[i]);
                    this.f542l[i] = null;
                }
                if (this.f543m[i] != null) {
                    mo133d(this.f543m[i]);
                    this.f543m[i] = null;
                }
                if (this.f544n[i] != null) {
                    mo137f(this.f544n[i]);
                    this.f544n[i] = null;
                }
                i++;
            }
            this.f541k = true;
            if (this.f537g != null && this.f536f == 1) {
                this.f537g.mo175f();
            }
            if (this.f538h != null && this.f536f == 0) {
                this.f538h.mo118c();
            }
            this.f541k = false;
            this.f551u++;
            if (System.currentTimeMillis() - this.f554x > 1000) {
                this.f552v = this.f551u;
                this.f551u = 0;
                this.f554x = System.currentTimeMillis();
                if (this.f549s.f385H) {
                    if (this.f552v < 10) {
                        this.f553w++;
                    } else {
                        this.f553w = 0;
                    }
                    if (this.f553w >= 5) {
                        this.f553w = 0;
                        if (this.f539i != null) {
                            this.f539i.sendMessage(this.f539i.obtainMessage(1));
                        }
                    }
                }
            }
        } else if (this.f547q) {
            if (this.f537g != null) {
                this.f537g.mo176g();
            }
            if (this.f538h != null) {
                C0018a aVar = this.f538h;
                C0018a.m90e();
                this.f538h.mo119d();
            }
            this.f547q = false;
        }
    }

    /* renamed from: d */
    public final void mo133d(MotionEvent motionEvent) {
        if (this.f532b) {
            int pointerCount = motionEvent.getPointerCount();
            motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8);
            float f = C0006d.f75E / ((float) this.f531a.f273j);
            float f2 = C0006d.f76F / ((float) this.f531a.f274k);
            float f3 = (float) ((this.f545o - this.f531a.f273j) / 2);
            float f4 = (float) ((this.f546p - this.f531a.f274k) / 2);
            if (this.f537g != null) {
                if (2 == pointerCount) {
                    Point point = new Point((int) ((motionEvent.getX(0) - f3) * f), (int) ((motionEvent.getY(0) - f4) * f2));
                    Point point2 = new Point((int) (f * (motionEvent.getX(1) - f3)), (int) (f2 * (motionEvent.getY(1) - f4)));
                    float sqrt = (float) Math.sqrt(Math.pow((double) ((float) (point2.y - point.y)), 2.0d) + Math.pow((double) ((float) (point2.x - point.x)), 2.0d));
                    if (this.f540j == 0.0f) {
                        this.f540j = sqrt;
                    } else if (sqrt - this.f540j > 100.0f) {
                        this.f540j = 0.0f;
                        this.f537g.mo173d();
                    } else if (this.f540j - sqrt > 100.0f) {
                        this.f540j = 0.0f;
                        this.f537g.mo172c();
                    }
                } else {
                    this.f537g.mo171b(f * (motionEvent.getX(0) - f3), (motionEvent.getY(0) - f4) * f2);
                }
            } else if (this.f538h != null) {
                for (int i = 0; i < pointerCount; i++) {
                    int[] a = m107a(motionEvent, i);
                    this.f538h.mo117b((float) a[0], (float) a[1], a[2]);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo134e() {
        if (this.f531a != null) {
            this.f531a.mo28d();
        }
    }

    /* renamed from: e */
    public final void mo135e(MotionEvent motionEvent) {
        this.f544n[0] = motionEvent;
    }

    /* renamed from: f */
    public final void mo136f() {
        if (this.f531a != null) {
            this.f531a.mo29e();
        }
    }

    /* renamed from: f */
    public final void mo137f(MotionEvent motionEvent) {
        if (this.f532b) {
            this.f540j = 0.0f;
            motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8);
            float f = C0006d.f75E;
            int i = this.f531a.f273j;
            float f2 = C0006d.f76F;
            int i2 = this.f531a.f274k;
            int i3 = this.f545o;
            int i4 = this.f531a.f273j;
            int i5 = this.f546p;
            int i6 = this.f531a.f274k;
            if (this.f537g != null) {
                motionEvent.getX();
                motionEvent.getY();
                this.f537g.mo174e();
            } else if (this.f538h != null) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i7 = 0; i7 < pointerCount; i7++) {
                    int[] a = m107a(motionEvent, i7);
                    this.f538h.mo114a((float) a[1], a[2]);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo138g() {
        if (!this.f532b) {
            if (this.f536f == 1) {
                Log.e("EAGLView", "StartAnimation Game=1");
                if (this.f537g == null) {
                    this.f537g = new C0032g(this, this.f549s);
                }
                this.f537g.mo167a();
            }
            if (this.f536f == 0) {
                Log.e("EAGLView", "StartAnimation Game=0");
                if (this.f538h == null) {
                    this.f538h = new C0018a(this, this.f549s);
                }
                this.f538h.mo111a();
            }
            this.f532b = true;
        }
    }

    /* renamed from: h */
    public final void mo139h() {
        if (this.f532b) {
            this.f535e = null;
            this.f532b = false;
            this.f547q = true;
        }
    }
}
