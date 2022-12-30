package amazon.android.p000a;

import android.util.Log;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: amazon.android.a.i */
public class C0011i {

    /* renamed from: A */
    public float f291A;

    /* renamed from: B */
    public float f292B;

    /* renamed from: C */
    public float f293C;

    /* renamed from: D */
    public float f294D;

    /* renamed from: E */
    public float f295E;

    /* renamed from: F */
    public int f296F;

    /* renamed from: G */
    public int f297G;

    /* renamed from: H */
    public float f298H;

    /* renamed from: I */
    public float f299I;

    /* renamed from: J */
    public float f300J = 0.0f;

    /* renamed from: K */
    private int f301K = 0;

    /* renamed from: L */
    private int f302L = 0;

    /* renamed from: a */
    public int f303a;

    /* renamed from: b */
    public C0012j f304b;

    /* renamed from: c */
    public C0012j f305c;

    /* renamed from: d */
    public C0012j f306d;

    /* renamed from: e */
    public C0012j f307e;

    /* renamed from: f */
    public int f308f;

    /* renamed from: g */
    public int f309g;

    /* renamed from: h */
    public int f310h;

    /* renamed from: i */
    public int f311i;

    /* renamed from: j */
    public int f312j;

    /* renamed from: k */
    public C0000a f313k;

    /* renamed from: l */
    public C0004b f314l;

    /* renamed from: m */
    public float f315m;

    /* renamed from: n */
    public int f316n;

    /* renamed from: o */
    public int f317o;

    /* renamed from: p */
    public float f318p;

    /* renamed from: q */
    public float f319q;

    /* renamed from: r */
    public float f320r;

    /* renamed from: s */
    public float f321s;

    /* renamed from: t */
    public float f322t;

    /* renamed from: u */
    public float f323u;

    /* renamed from: v */
    public float f324v;

    /* renamed from: w */
    public int f325w;

    /* renamed from: x */
    public float f326x;

    /* renamed from: y */
    public float f327y;

    /* renamed from: z */
    public float f328z;

    /* renamed from: a */
    public final int mo39a(float f, float f2) {
        float f3 = ((float) this.f301K) + f;
        float f4 = ((float) this.f302L) + f2;
        Log.e("Sprite2D", "hitCheckX start");
        if (this.f313k == null) {
            Log.e("Sprite2D", "hitCheckX _location null.");
        }
        if (this.f314l == null) {
            Log.e("Sprite2D", "hitCheckX _size null.");
        }
        Log.e("Sprite2D", String.format("Hit Check !! [%d,%d][%d,%d,%d,%d]", new Object[]{Integer.valueOf((int) f3), Integer.valueOf((int) f4), Integer.valueOf((int) this.f313k.f0a), Integer.valueOf((int) this.f313k.f1b), Integer.valueOf((int) (this.f313k.f0a + this.f314l.f59a)), Integer.valueOf((int) (this.f313k.f1b + this.f314l.f60b))}));
        if (this.f313k.f0a >= f3 || this.f313k.f1b >= f4 || f3 >= this.f313k.f0a + this.f314l.f59a || f4 >= this.f313k.f1b + this.f314l.f60b) {
            return 0;
        }
        Log.e("Sprite2D", "#### Hit!! #####");
        return 1;
    }

    /* renamed from: a */
    public void mo40a() {
        if (this.f304b != null) {
            this.f304b.mo45a();
        }
        if (this.f305c != null) {
            this.f305c.mo45a();
        }
        if (this.f306d != null) {
            this.f306d.mo45a();
        }
        if (this.f307e != null) {
            this.f307e.mo45a();
        }
        this.f304b = null;
        this.f305c = null;
        this.f306d = null;
        this.f307e = null;
    }

    /* renamed from: a */
    public final void mo41a(C0012j jVar, int i, int i2, int i3, C0000a aVar, C0004b bVar, float f, float f2) {
        this.f303a = 0;
        this.f304b = jVar;
        this.f305c = null;
        this.f306d = null;
        this.f307e = null;
        this.f308f = i;
        this.f309g = 0;
        this.f310h = i2;
        this.f311i = i3;
        this.f312j = 0;
        this.f313k = aVar;
        this.f314l = bVar;
        this.f315m = 1.0f;
        this.f316n = 0;
        this.f317o = 0;
        this.f318p = f;
        this.f319q = f2;
        this.f320r = 0.0f;
        this.f321s = 0.0f;
        this.f322t = 1.0f;
        this.f291A = 0.0f;
        this.f292B = 0.0f;
        this.f293C = 0.0f;
        this.f294D = 0.0f;
        this.f295E = 0.0f;
        this.f296F = this.f316n;
        this.f297G = 0;
        this.f298H = 0.0f;
    }

    /* renamed from: a */
    public final void mo42a(GL10 gl10) {
        if (((double) this.f315m) > 0.0d) {
            gl10.glColor4f(this.f315m * 1.0f, this.f315m * 1.0f, this.f315m * 1.0f, this.f315m);
            C0000a aVar = new C0000a((float) ((int) (((C0006d.f75E / 2.0f) - ((C0006d.f75E / 2.0f) - (this.f314l.f59a / 2.0f))) + this.f313k.f0a + this.f300J)), (float) ((int) (((C0006d.f76F / 2.0f) + ((C0006d.f76F / 2.0f) - (this.f314l.f60b / 2.0f))) - this.f313k.f1b)));
            if (this.f322t == 1.0f) {
                this.f304b.mo48a(aVar);
            } else {
                this.f304b.mo49a(aVar, this.f322t);
            }
        }
    }

    /* renamed from: a */
    public final void mo43a(GL10 gl10, float f) {
        if (((double) this.f315m) > 0.0d) {
            gl10.glPushMatrix();
            gl10.glTranslatef(((((C0006d.f75E / 2.0f) - ((C0006d.f75E / 2.0f) - (this.f314l.f59a / 2.0f))) + this.f313k.f0a) - this.f326x) + this.f300J, (((C0006d.f76F / 2.0f) + ((C0006d.f76F / 2.0f) - (this.f314l.f60b / 2.0f))) - this.f313k.f1b) - this.f327y, 0.0f - this.f328z);
            gl10.glRotatef(f, 0.0f, 0.0f, 1.0f);
            gl10.glTranslatef(this.f326x, this.f327y, this.f328z);
            gl10.glColor4f(this.f315m * 1.0f, this.f315m * 1.0f, this.f315m * 1.0f, this.f315m);
            if (this.f322t == 1.0f) {
                this.f304b.mo50b();
            } else {
                this.f304b.mo46a(this.f322t);
            }
            gl10.glPopMatrix();
        }
    }

    /* renamed from: b */
    public final void mo44b(float f, float f2) {
        this.f313k.f0a = (float) ((int) f);
        this.f313k.f1b = (float) ((int) f2);
    }
}
