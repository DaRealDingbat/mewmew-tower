package amazon.android.tsumineko.battle;

import amazon.android.p000a.C0000a;
import amazon.android.p000a.C0004b;
import amazon.android.p000a.C0006d;
import amazon.android.p000a.C0010h;
import amazon.android.p000a.C0011i;
import amazon.android.p000a.C0012j;
import amazon.android.p000a.C0013k;
import amazon.android.p000a.p001a.C0002b;
import amazon.android.p000a.p001a.C0003c;
import amazon.android.tsumineko.TsumiNekoPadAppDelegate;
import amazon.android.tsumineko.game.C0031f;
import amazon.android.tsumineko.game.C0036h;
import amazon.android.tsumineko.game.C0037i;
import amazon.android.tsumineko.game.C0039k;
import amazon.android.tsumineko.game.EAGLView;
import amazon.android.tsumineko.game.p002a.C0024a;
import amazon.android.tsumineko.game.p002a.C0025b;
import android.util.Log;
import com.amazon.mas.kiwi.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: amazon.android.tsumineko.battle.a */
public final class C0018a extends C0036h {

    /* renamed from: Q */
    static int f405Q = 0;

    /* renamed from: l */
    public static HashMap f406l = new HashMap();

    /* renamed from: m */
    public static int f407m = 8;

    /* renamed from: A */
    C0025b f408A;

    /* renamed from: B */
    C0012j[] f409B = new C0012j[f407m];

    /* renamed from: C */
    C0010h[] f410C;

    /* renamed from: D */
    C0012j[] f411D = new C0012j[170];

    /* renamed from: E */
    C0024a f412E = new C0024a();

    /* renamed from: F */
    C0012j[] f413F = new C0012j[2];

    /* renamed from: G */
    C0022e[] f414G = new C0022e[2];

    /* renamed from: H */
    TsumiNekoPadAppDelegate f415H;

    /* renamed from: I */
    C0013k[] f416I = new C0013k[f260i.length];

    /* renamed from: J */
    boolean[] f417J = new boolean[2];

    /* renamed from: K */
    public float[] f418K = {-800.0f, -1280.0f, 0.0f, 800.0f, -1280.0f, 0.0f, -800.0f, 1280.0f, 0.0f, 800.0f, 1280.0f, 0.0f};

    /* renamed from: L */
    public byte[] f419L;

    /* renamed from: M */
    public byte[] f420M;

    /* renamed from: N */
    FloatBuffer f421N;

    /* renamed from: O */
    final C0000a[] f422O;

    /* renamed from: P */
    final C0000a[] f423P;

    /* renamed from: n */
    float[] f424n = new float[3];

    /* renamed from: o */
    float f425o;

    /* renamed from: p */
    float f426p;

    /* renamed from: q */
    float f427q;

    /* renamed from: r */
    boolean f428r;

    /* renamed from: s */
    float f429s;

    /* renamed from: t */
    float f430t;

    /* renamed from: u */
    float f431u;

    /* renamed from: v */
    int f432v;

    /* renamed from: w */
    EAGLView f433w;

    /* renamed from: x */
    int f434x;

    /* renamed from: y */
    int f435y;

    /* renamed from: z */
    int f436z;

    public C0018a(EAGLView eAGLView, TsumiNekoPadAppDelegate tsumiNekoPadAppDelegate) {
        byte[] bArr = new byte[16];
        bArr[2] = 102;
        bArr[3] = -1;
        bArr[6] = 102;
        bArr[7] = -1;
        bArr[10] = 102;
        bArr[11] = -1;
        bArr[14] = 102;
        bArr[15] = -1;
        this.f419L = bArr;
        byte[] bArr2 = new byte[16];
        bArr2[3] = 102;
        bArr2[7] = 102;
        bArr2[11] = 102;
        bArr2[15] = 102;
        this.f420M = bArr2;
        float[] fArr = this.f418K;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        this.f421N = asFloatBuffer;
        this.f422O = new C0000a[]{m175c(33.0f, C0031f.f589b), m175c(51.0f, C0031f.f589b), m175c(69.0f, C0031f.f589b)};
        this.f423P = new C0000a[]{m175c(51.0f, C0031f.f590c), m175c(69.0f, C0031f.f590c)};
        this.f433w = eAGLView;
        this.f415H = tsumiNekoPadAppDelegate;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private amazon.android.p000a.C0011i m82a(amazon.android.tsumineko.game.C0039k r7, int r8, float r9, float r10, float r11, int r12) {
        /*
            r6 = this;
            amazon.android.tsumineko.battle.e[] r0 = r6.f414G
            r0 = r0[r12]
            int r0 = r0.f462V
            amazon.android.tsumineko.battle.e[] r1 = r6.f414G
            r1 = r1[r12]
            amazon.android.a.i[] r1 = r1.f508d
            r1 = r1[r0]
            amazon.android.a.i r0 = r7.f838e
            amazon.android.a.j r0 = r0.f304b
            r1.f304b = r0
            amazon.android.a.j r0 = r1.f304b
            float r0 = r0.f329a
            amazon.android.a.j r2 = r1.f304b
            float r2 = r2.f330b
            amazon.android.a.b r0 = amazon.android.p000a.C0004b.m16a(r0, r2)
            r1.f314l = r0
            amazon.android.tsumineko.battle.e[] r0 = r6.f414G
            r0 = r0[r12]
            int r0 = r0.f449I
            if (r0 != 0) goto L_0x0031
            long r2 = java.lang.System.currentTimeMillis()
            switch(r8) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x00db;
                case 2: goto L_0x010f;
                default: goto L_0x0031;
            }
        L_0x0031:
            r0 = r11
        L_0x0032:
            r2 = 1203982336(0x47c35000, float:100000.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x003b
            r0 = 1092616192(0x41200000, float:10.0)
        L_0x003b:
            amazon.android.tsumineko.battle.e[] r2 = r6.f414G
            r2 = r2[r12]
            int r3 = r2.f449I
            int r3 = r3 + 1
            r2.f449I = r3
            amazon.android.tsumineko.battle.e[] r2 = r6.f414G
            r2 = r2[r12]
            int r2 = r2.f449I
            r3 = 3
            if (r2 <= r3) goto L_0x0055
            amazon.android.tsumineko.battle.e[] r2 = r6.f414G
            r2 = r2[r12]
            r3 = 0
            r2.f449I = r3
        L_0x0055:
            r2 = 1
            r1.f316n = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.f315m = r2
            r1.mo44b(r9, r10)
            amazon.android.a.a r2 = r1.f313k
            float r2 = r2.f0a
            r1.f318p = r2
            amazon.android.a.a r2 = r1.f313k
            float r2 = r2.f1b
            r1.f319q = r2
            float r2 = r7.f848o
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0142
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = amazon.android.tsumineko.game.C0031f.m138b()
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r4
            float r2 = r2 + r3
            float r2 = -r2
            r1.f323u = r2
        L_0x007f:
            r2 = 0
            r1.f297G = r2
            r1.f298H = r0
            r0 = 0
            r1.f299I = r0
            float r0 = r7.f848o
            r1.f321s = r0
            amazon.android.tsumineko.battle.e[] r0 = r6.f414G
            r0 = r0[r12]
            int r2 = r0.f462V
            int r2 = r2 + 1
            r0.f462V = r2
            amazon.android.tsumineko.battle.e[] r0 = r6.f414G
            r0 = r0[r12]
            int r0 = r0.f462V
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r2) goto L_0x00a6
            amazon.android.tsumineko.battle.e[] r0 = r6.f414G
            r0 = r0[r12]
            r2 = 0
            r0.f462V = r2
        L_0x00a6:
            return r1
        L_0x00a7:
            amazon.android.tsumineko.battle.e[] r0 = r6.f414G
            r0 = r0[r12]
            long r4 = r0.f450J
            long r2 = r2 - r4
            float r0 = (float) r2
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r11 = r0 / r2
            amazon.android.tsumineko.battle.e[] r0 = r6.f414G
            r0 = r0[r12]
            int r0 = r0.f445E
            r2 = 1
            if (r0 > r2) goto L_0x00be
            r11 = 1073741824(0x40000000, float:2.0)
        L_0x00be:
            double r2 = (double) r11
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0031
            amazon.android.a.h[] r0 = r6.f410C
            r2 = 12
            r0 = r0[r2]
            r0.mo33a()
            amazon.android.tsumineko.battle.e[] r0 = r6.f414G
            r0 = r0[r12]
            long r2 = java.lang.System.currentTimeMillis()
            r0.f450J = r2
            r0 = r11
            goto L_0x0032
        L_0x00db:
            amazon.android.tsumineko.battle.e[] r0 = r6.f414G
            r0 = r0[r12]
            long r4 = r0.f451K
            long r2 = r2 - r4
            float r0 = (float) r2
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r11 = r0 / r2
            amazon.android.tsumineko.battle.e[] r0 = r6.f414G
            r0 = r0[r12]
            int r0 = r0.f445E
            r2 = 1
            if (r0 > r2) goto L_0x00f2
            r11 = 1073741824(0x40000000, float:2.0)
        L_0x00f2:
            double r2 = (double) r11
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0031
            amazon.android.a.h[] r0 = r6.f410C
            r2 = 14
            r0 = r0[r2]
            r0.mo33a()
            amazon.android.tsumineko.battle.e[] r0 = r6.f414G
            r0 = r0[r12]
            long r2 = java.lang.System.currentTimeMillis()
            r0.f451K = r2
            r0 = r11
            goto L_0x0032
        L_0x010f:
            amazon.android.tsumineko.battle.e[] r0 = r6.f414G
            r0 = r0[r12]
            long r4 = r0.f452L
            long r2 = r2 - r4
            float r0 = (float) r2
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r11 = r0 / r2
            amazon.android.tsumineko.battle.e[] r0 = r6.f414G
            r0 = r0[r12]
            int r0 = r0.f445E
            r2 = 1
            if (r0 > r2) goto L_0x0126
            r11 = 1073741824(0x40000000, float:2.0)
        L_0x0126:
            double r2 = (double) r11
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0031
            amazon.android.a.h[] r0 = r6.f410C
            r2 = 16
            r0 = r0[r2]
            r0.mo33a()
            amazon.android.tsumineko.battle.e[] r0 = r6.f414G
            r0 = r0[r12]
            long r2 = java.lang.System.currentTimeMillis()
            r0.f452L = r2
            goto L_0x0031
        L_0x0142:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = amazon.android.tsumineko.game.C0031f.m138b()
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r4
            float r2 = r2 + r3
            r1.f323u = r2
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: amazon.android.tsumineko.battle.C0018a.m82a(amazon.android.tsumineko.game.k, int, float, float, float, int):amazon.android.a.i");
    }

    /* renamed from: a */
    private void m83a(long j, float f, int i) {
        GL10 a = this.f433w.mo123a();
        a.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        if (this.f414G[i].f467a == 6) {
            C0039k kVar = null;
            for (int i2 = this.f414G[i].f514j - 1; i2 >= 0; i2--) {
                C0039k kVar2 = this.f414G[i].f512h[i2];
                if (this.f417J[i]) {
                    this.f417J[i] = false;
                    if (i2 == this.f414G[i].f514j - 1) {
                    }
                }
                C0012j jVar = kVar2.f835b.f304b;
                if (kVar2.f812G == 1) {
                    if (((double) (((float) (j - kVar2.f811F)) / 1000.0f)) >= 0.25d) {
                        kVar2.f812G = 0;
                        kVar2.f811F = 0;
                    } else if (!(kVar2.f836c == null || kVar2.f836c.f304b == null)) {
                        jVar = kVar2.f836c.f304b;
                    }
                }
                if (kVar != null && ((double) (((float) (j - kVar.f851r)) / 1000.0f)) < 0.5d) {
                    switch (kVar.f839f) {
                        case 0:
                            if (kVar2.f839f == 1) {
                                jVar = kVar2.f836c.f304b;
                                break;
                            }
                            break;
                        case Base64.GZIP /*2*/:
                            if (kVar2.f839f != 2) {
                                jVar = kVar2.f836c.f304b;
                                break;
                            }
                            break;
                    }
                }
                C0004b bVar = kVar2.f807B;
                C0000a aVar = kVar2.f806A;
                float f2 = kVar2.f808C;
                float f3 = kVar2.f809D;
                float f4 = kVar2.f810E;
                float f5 = kVar2.f848o;
                if (kVar2.f858y == 0) {
                    boolean z = true;
                    if (kVar2.f806A == null || (kVar2.f806A.f0a == 0.0f && kVar2.f806A.f1b == 0.0f)) {
                        z = false;
                    }
                    if (((double) this.f414G[i].f522r) == 1.0d && kVar2.f806A.f1b > 1280.0f) {
                        z = false;
                    }
                    if (z) {
                        a.glPushMatrix();
                        if (((double) this.f414G[i].f522r) != 1.0d) {
                            a.glTranslatef(0.0f, -1280.0f * (1.0f - this.f414G[i].f522r), 0.0f);
                            a.glScalef(this.f414G[i].f522r, this.f414G[i].f522r, 1.0f);
                            a.glTranslatef(((((((1.0f - this.f414G[i].f522r) * ((800.0f / this.f414G[i].f522r) / 2.0f)) + ((800.0f / this.f414G[i].f522r) / 2.0f)) - (((800.0f / this.f414G[i].f522r) / 2.0f) - (bVar.f59a / 2.0f))) + aVar.f0a) + f) - f2, (((((1280.0f / this.f414G[i].f522r) / 2.0f) - (bVar.f60b / 2.0f)) + ((1280.0f / this.f414G[i].f522r) / 2.0f)) - aVar.f1b) - f3, 0.0f - f4);
                            a.glRotatef(f5, 0.0f, 0.0f, 1.0f);
                            a.glTranslatef(f2, f3, f4);
                        } else {
                            a.glTranslatef((((400.0f - (400.0f - (bVar.f59a / 2.0f))) + aVar.f0a) + f) - f2, (((640.0f - (bVar.f60b / 2.0f)) + 640.0f) - aVar.f1b) - f3, 0.0f - f4);
                            a.glRotatef(f5, 0.0f, 0.0f, 1.0f);
                            a.glTranslatef(f2, f3, f4);
                        }
                        a.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                        jVar.mo50b();
                        a.glPopMatrix();
                    }
                }
                kVar = kVar2;
            }
        }
    }

    /* renamed from: a */
    private void m84a(C0011i iVar, float f, float f2, int i) {
        C0000a aVar;
        GL10 a = this.f433w.mo123a();
        C0012j jVar = iVar.f304b;
        C0004b bVar = iVar.f314l;
        float f3 = this.f414G[i].f522r;
        float f4 = this.f414G[i].f523s;
        if (((double) f3) != 1.0d) {
            aVar = new C0000a(iVar.f318p, ((1.0f - f4) * f2) + (1280.0f - iVar.f313k.f1b) + 0.0f);
        } else {
            aVar = new C0000a(iVar.f318p, (1280.0f - iVar.f313k.f1b) + f2 + 0.0f);
        }
        float f5 = iVar.f321s;
        a.glPushMatrix();
        if (((double) f3) != 1.0d) {
            a.glScalef(f3, f3, 1.0f);
        }
        float f6 = (800.0f / f3) / 2.0f;
        a.glTranslatef(((((1.0f - f3) * f6) + f6) - (f6 - (bVar.f59a / 2.0f))) + aVar.f0a + f, (iVar.f313k.f1b - aVar.f1b) - 1280.0f, 0.0f);
        a.glRotatef(f5, 0.0f, 0.0f, 1.0f);
        a.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        jVar.mo47a(21.5946f, 21.5946f);
        a.glPopMatrix();
    }

    /* renamed from: a */
    private void m85a(byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        GL10 a = this.f433w.mo123a();
        a.glPushMatrix();
        a.glDisableClientState(32888);
        a.glVertexPointer(3, 5126, 0, this.f421N);
        a.glEnableClientState(32884);
        a.glColorPointer(4, 5121, 0, allocateDirect);
        a.glEnableClientState(32886);
        a.glDrawArrays(5, 0, 4);
        a.glDisableClientState(32886);
        a.glPopMatrix();
        if (allocateDirect != null) {
            allocateDirect.clear();
        }
    }

    /* renamed from: a */
    private static boolean m86a(float f, float f2, float f3, float f4, float f5, float f6, double d) {
        float abs = Math.abs(f - f4);
        float abs2 = Math.abs(f2 - f5);
        float abs3 = Math.abs(f3 - f6);
        return (((double) abs) > d && ((double) abs2) > d) || (((double) abs) > d && ((double) abs3) > d) || (((double) abs2) > d && ((double) abs3) > d);
    }

    /* renamed from: c */
    private C0011i m87c(int i) {
        float f = this.f411D[i].f329a;
        float f2 = this.f411D[i].f330b;
        C0011i iVar = new C0011i();
        iVar.mo41a(this.f411D[i], 0, 1, 0, new C0000a(0.0f, 0.0f), C0004b.m16a(f, f2), 0.0f, 0.0f);
        return iVar;
    }

    /* renamed from: c */
    private void m88c(float f, float f2, int i) {
        float f3;
        float f4;
        float f5;
        float f6 = this.f414G[i].f522r;
        int i2 = f6 != 0.0f ? (int) ((1.0f / f6) + 2.0f) : 2;
        if (((double) f6) == 1.0d) {
            i2 = 2;
        }
        C0011i[] iVarArr = {this.f414G[i].f488ai, this.f414G[i].f489aj};
        C0011i[] iVarArr2 = {this.f414G[i].f490ak, this.f414G[i].f491al};
        C0011i[] iVarArr3 = {this.f414G[i].f484ae, this.f414G[i].f485af, this.f414G[i].f486ag, this.f414G[i].f487ah};
        C0011i[] iVarArr4 = {this.f414G[i].f492am, this.f414G[i].f493an, this.f414G[i].f494ao, this.f414G[i].f504ay, this.f414G[i].f495ap, this.f414G[i].f496aq, this.f414G[i].f497ar, this.f414G[i].f498as, this.f414G[i].f499at, this.f414G[i].f500au, this.f414G[i].f501av, this.f414G[i].f502aw, this.f414G[i].f503ax};
        GL10 a = this.f433w.mo123a();
        a.glScalef(1.0f, 1.0f, 1.0f);
        a.glTranslatef(0.0f, 0.0f, 0.0f);
        a.glPushMatrix();
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < iVarArr.length; i4++) {
                C0000a aVar = new C0000a(iVarArr[i4].f318p, iVarArr[i4].f319q + ((float) (i4 * 3)));
                iVarArr[i4].f318p = aVar.f0a - ((float) (((i2 - 1) - i3) * 800));
                m84a(iVarArr[i4], f2, f, i);
                iVarArr[i4].f318p = aVar.f0a;
            }
            for (int i5 = 0; i5 < iVarArr2.length; i5++) {
                C0000a aVar2 = new C0000a(iVarArr2[i5].f318p, iVarArr2[i5].f319q + ((float) (i5 * 3)));
                iVarArr2[i5].f318p = aVar2.f0a + ((float) (i3 * 800));
                m84a(iVarArr2[i5], f2, f, i);
                iVarArr2[i5].f318p = aVar2.f0a;
            }
        }
        a.glPopMatrix();
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 >= iVarArr3.length) {
                break;
            }
            C0011i iVar = iVarArr3[i7];
            GL10 a2 = this.f433w.mo123a();
            C0012j jVar = iVar.f304b;
            C0004b bVar = iVar.f314l;
            C0000a c = ((double) this.f414G[i].f522r) != 1.0d ? m175c(iVar.f313k.f0a, (1280.0f - iVar.f313k.f1b) + ((1.0f - this.f414G[i].f523s) * f)) : m175c(iVar.f313k.f0a, (1280.0f - iVar.f313k.f1b) + f);
            float f7 = this.f414G[i].f522r;
            a2.glPushMatrix();
            if (((double) f7) != 1.0d) {
                a2.glScalef(f7, f7, 1.0f);
                f3 = (bVar.f59a / 2.0f) + ((((1.0f - f7) * ((800.0f / f7) / 2.0f)) + ((800.0f / f7) / 2.0f)) - (((800.0f / f7) / 2.0f) - (bVar.f59a / 2.0f))) + c.f0a + f2;
                f4 = iVar.f313k.f1b;
                f5 = c.f1b;
            } else {
                f3 = bVar.f59a + iVar.f313k.f0a + f2;
                f4 = iVar.f313k.f1b;
                f5 = c.f1b;
            }
            a2.glTranslatef(f3, f4 - f5, 0.0f);
            a2.glRotatef(iVar.f321s, 0.0f, 0.0f, 1.0f);
            a2.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            jVar.mo47a(5.0f, 5.3853197f);
            a2.glPopMatrix();
            i6 = i7 + 1;
        }
        this.f414G[i].f504ay.f322t = 2.0f;
        for (C0011i iVar2 : iVarArr4) {
            GL10 a3 = this.f433w.mo123a();
            float f8 = 1280.0f + f + iVar2.f304b.f330b;
            if (this.f414G[i].f526v != 0 || (iVar2.f319q <= f8 + iVar2.f304b.f330b && iVar2.f319q >= f)) {
                C0012j jVar2 = iVar2.f304b;
                C0004b bVar2 = iVar2.f314l;
                float f9 = this.f414G[i].f522r;
                float f10 = this.f414G[i].f523s;
                a3.glPushMatrix();
                if (((double) f9) != 1.0d) {
                    C0000a c2 = m175c(iVar2.f313k.f0a, ((1.0f - f10) * f) + (1280.0f - iVar2.f313k.f1b));
                    a3.glTranslatef(0.0f, 0.0f, 0.0f);
                    a3.glTranslatef(0.0f, -1280.0f * (1.0f - f9), 0.0f);
                    a3.glScalef(f9, f9, 1.0f);
                    a3.glTranslatef(0.0f, 0.0f, 0.0f);
                    a3.glTranslatef(((((1.0f - f9) * ((800.0f / f9) / 2.0f)) + ((800.0f / f9) / 2.0f)) - (((800.0f / f9) / 2.0f) - (bVar2.f59a / 2.0f))) + c2.f0a + f2, ((((1280.0f / f9) / 2.0f) - (bVar2.f60b / 2.0f)) + ((1280.0f / f9) / 2.0f)) - c2.f1b, 0.0f);
                    a3.glRotatef(iVar2.f321s, 0.0f, 0.0f, 1.0f);
                } else {
                    C0000a c3 = m175c(iVar2.f313k.f0a, (1280.0f - iVar2.f313k.f1b) + f);
                    a3.glTranslatef((400.0f - (400.0f - (bVar2.f59a / 2.0f))) + c3.f0a + f2, ((640.0f - (bVar2.f60b / 2.0f)) + 640.0f) - c3.f1b, 0.0f);
                    a3.glRotatef(iVar2.f321s, 0.0f, 0.0f, 1.0f);
                }
                a3.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                C0000a c4 = m175c(0.0f, 0.0f);
                if (iVar2.f322t == 1.0f) {
                    jVar2.mo48a(c4);
                } else {
                    jVar2.mo49a(c4, iVar2.f322t);
                }
                a3.glScalef(1.0f, 1.0f, 1.0f);
                a3.glPopMatrix();
            }
        }
        for (int i8 = 0; i8 < 300; i8++) {
            C0011i iVar3 = this.f414G[i].f507c[i8];
            if (iVar3 != null) {
                if (iVar3 == this.f414G[i].f466Z) {
                    if (this.f408A != null) {
                        this.f408A.mo159a(false, this.f414G[i].f464X);
                    }
                    if (i == 0) {
                        this.f415H.f398x.f51f = (double) this.f414G[i].f464X;
                    } else {
                        this.f415H.f399y.f51f = (double) this.f414G[i].f464X;
                    }
                    if (this.f408A != null) {
                        this.f408A.mo160b(false, this.f414G[i].f514j);
                    }
                }
                if (!(iVar3 == this.f414G[i].f482ac || iVar3.f316n == 0)) {
                    if (iVar3.f325w == 0) {
                        iVar3.mo42a(a);
                    } else {
                        iVar3.mo43a(a, iVar3.f321s);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m89d(int i) {
        this.f414G[i].f444D = System.currentTimeMillis();
        this.f414G[i].f445E = 1;
        this.f414G[i].f441A = 2;
        this.f414G[i].f443C = 0.0f;
        this.f414G[i].f446F = System.currentTimeMillis();
        this.f414G[i].f447G = 0.0f;
    }

    /* renamed from: e */
    public static void m90e() {
    }

    /* renamed from: e */
    private void m91e(int i) {
        int h = m176h();
        this.f414G[i].f515k = h;
        C0002b bVar = (C0002b) this.f415H.f388n.get(Integer.valueOf(h));
        int i2 = bVar.f20a;
        int i3 = 52 - (bVar.f22c / 2);
        int i4 = 13 - (bVar.f23d / 2);
        if (bVar.f21b == 0) {
            i4 = (int) (((double) i4) + (((double) bVar.f23d) / 8.0d));
        }
        if (bVar.f21b == 1) {
            i4 = (int) ((((double) bVar.f23d) / 2.2d) + ((double) i4));
        }
        this.f414G[i].f480aa.f313k = m175c(((float) i3) + 630.0f, ((float) i4) + 202.616f);
        this.f414G[i].f480aa.f304b = this.f412E.mo154a(i2, 0);
        this.f414G[i].f480aa.f314l = C0004b.m16a(this.f412E.mo154a(i2, 0).f329a, this.f412E.mo154a(i2, 0).f330b);
    }

    /* renamed from: f */
    private void m92f() {
        Log.e("AgainstGameMain", "intializeGameWork start.");
        this.f429s = 0.0f;
        this.f430t = 0.0f;
        this.f431u = 0.0f;
        this.f424n[0] = 0.0f;
        this.f424n[1] = 0.0f;
        this.f424n[2] = 0.0f;
        for (int i = 0; i < 2; i++) {
            this.f414G[i] = new C0022e();
        }
        for (int i2 = 0; i2 < 300; i2++) {
            this.f414G[0].f507c[i2] = null;
            this.f414G[1].f507c[i2] = null;
        }
        for (int i3 = 0; i3 < 2; i3++) {
            for (int i4 = 0; i4 < 300; i4++) {
                if (this.f414G[i3].f507c[i4] != null) {
                    this.f414G[i3].f507c[i4].f316n = 0;
                }
            }
            this.f414G[i3].f509e = 0;
            this.f414G[i3].f510f = null;
            this.f414G[i3].f511g = null;
            this.f414G[i3].f513i = 0;
            this.f414G[i3].f514j = 0;
            this.f414G[i3].f515k = 0;
            this.f414G[i3].f516l = 0;
            this.f414G[i3].f517m = 0;
            this.f414G[i3].f518n = 63.0f;
            this.f414G[i3].f519o = 0.0f;
            this.f414G[i3].f520p = 0.0f;
            this.f414G[i3].f521q = 0.0f;
            this.f414G[i3].f522r = 1.0f;
            this.f414G[i3].f523s = 0.0f;
            this.f414G[i3].f524t = 0.0f;
            this.f414G[i3].f525u = 0.0f;
            this.f414G[i3].f526v = 0;
            this.f414G[i3].f527w = 0;
            this.f414G[i3].f528x = 0.0f;
            this.f414G[i3].f529y = 0;
            this.f414G[i3].f530z = 0;
            this.f414G[i3].f441A = 0;
            this.f414G[i3].f442B = 0.0f;
            this.f414G[i3].f443C = 0.0f;
            this.f414G[i3].f444D = 0;
            this.f414G[i3].f445E = 0;
            this.f414G[i3].f446F = 0;
            this.f414G[i3].f447G = 0.0f;
            this.f414G[i3].f448H = 0;
            this.f414G[i3].f449I = 0;
            this.f414G[i3].f453M = 0;
            this.f414G[i3].f454N = 0;
            this.f414G[i3].f455O = 0;
            this.f414G[i3].f460T = 0.0f;
            this.f414G[i3].f461U = 0.0f;
            this.f414G[i3].f462V = 0;
            this.f414G[i3].f463W = 0.0f;
            this.f414G[i3].f459S = 0.0f;
            this.f414G[i3].f464X = 0;
            this.f414G[i3].f450J = 0;
            this.f414G[i3].f451K = 0;
            this.f414G[i3].f452L = 0;
            if (((int) (C0031f.m138b() * 10.0f)) < 5) {
                this.f414G[i3].f465Y = -5.0f;
            } else {
                this.f414G[i3].f465Y = 5.0f;
            }
            for (int i5 = 0; i5 < 1000; i5++) {
                if (this.f414G[i3].f508d[i5] == null) {
                    this.f414G[i3].f508d[i5] = new C0011i();
                }
                this.f414G[i3].f508d[i5].f316n = 0;
            }
            if (this.f414G[i3].f456P == 1) {
                this.f414G[i3].f515k = 0;
                this.f414G[i3].f516l = 0;
            }
            for (int i6 = 0; i6 < 1000; i6++) {
                if (this.f414G[i3].f512h[i6] != null) {
                    this.f414G[i3].f512h[i6] = null;
                }
            }
        }
        this.f435y = 0;
        this.f436z = 0;
        for (int i7 = 0; i7 < 2; i7++) {
            this.f414G[i7].f472aE = 0;
            this.f414G[i7].f467a = 0;
            this.f414G[i7].f519o = 0.0f;
            this.f414G[i7].f520p = 0.0f;
            this.f414G[i7].f521q = 0.0f;
            this.f414G[i7].f522r = 1.0f;
            this.f414G[i7].f518n = 63.0f;
            this.f414G[i7].f458R = 160.0f;
            this.f414G[i7].f465Y = 5.0f;
        }
        C0031f.m137a();
        this.f432v = 0;
        this.f434x = 0;
        Log.e("AgainstGameMain", "intializeGameWork end.");
    }

    /* renamed from: f */
    private void m93f(int i) {
        boolean z;
        if (this.f435y == 0) {
            if (f406l.size() > 0) {
                f406l.clear();
            }
            for (int i2 = 0; i2 < f252a.length; i2++) {
                f406l.put(Integer.valueOf(f252a[i2]), f253b[i2]);
            }
            for (int i3 = 0; i3 < f254c.length; i3++) {
                f406l.put(Integer.valueOf(f254c[i3]), f255d[i3]);
            }
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 >= this.f415H.f388n.size()) {
                    break;
                }
                C0002b bVar = (C0002b) this.f415H.f388n.get(Integer.valueOf(i6));
                int i7 = bVar.f20a * 7;
                if (this.f412E == null) {
                    this.f412E = new C0024a();
                }
                this.f412E.mo155a(this.f433w, this.f416I, i4, 0, this.f415H.mo93b(bVar.f24e));
                this.f412E.mo155a(this.f433w, this.f416I, i4, 1, this.f415H.mo93b(bVar.f19F));
                this.f412E.mo156a(this.f433w, this.f416I, this.f415H.mo93b("sleep_otona.png"));
                this.f411D[i7 + 50 + 0] = C0012j.m46a(this.f433w.mo123a(), this.f416I, this.f415H.mo91a(bVar.f27h), 0);
                this.f411D[i7 + 50 + 1] = C0012j.m46a(this.f433w.mo123a(), this.f416I, this.f415H.mo91a(bVar.f30k), 0);
                this.f411D[i7 + 50 + 2] = C0012j.m46a(this.f433w.mo123a(), this.f416I, this.f415H.mo91a(bVar.f33n), 0);
                this.f411D[i7 + 50 + 3] = C0012j.m46a(this.f433w.mo123a(), this.f416I, this.f415H.mo91a(bVar.f36q), 0);
                this.f411D[i7 + 50 + 4] = C0012j.m46a(this.f433w.mo123a(), this.f416I, this.f415H.mo91a(bVar.f39t), 0);
                this.f411D[i7 + 50 + 5] = C0012j.m46a(this.f433w.mo123a(), this.f416I, this.f415H.mo91a(bVar.f42w), 0);
                this.f411D[i7 + 50 + 6] = C0012j.m46a(this.f433w.mo123a(), this.f416I, this.f415H.mo91a(bVar.f45z), 0);
                for (int i8 = 0; i8 < 7; i8++) {
                    this.f414G[0].f469aB[i7 + i8] = m87c(i7 + 50 + i8);
                    this.f414G[1].f469aB[i7 + i8] = m87c(i7 + 50 + i8);
                    this.f414G[0].f507c[i7 + 100 + i8] = this.f414G[0].f469aB[i7 + i8];
                    this.f414G[1].f507c[i7 + 100 + i8] = this.f414G[1].f469aB[i7 + i8];
                }
                i4++;
                i5 = i6 + 1;
            }
            this.f413F[0] = C0012j.m46a(this.f433w.mo123a(), this.f416I, this.f415H.mo91a("sleep_otona.png"), 0);
            this.f413F[1] = C0012j.m46a(this.f433w.mo123a(), this.f416I, this.f415H.mo91a("sleep_otona.png"), 0);
            Iterator it = f406l.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    int intValue = num.intValue();
                    this.f411D[intValue] = C0012j.m46a(this.f433w.mo123a(), this.f416I, this.f415H.mo91a((String) f406l.get(num)), 1);
                    if (this.f411D[intValue] == null) {
                        m96i();
                        z = false;
                        break;
                    }
                } else {
                    if (this.f408A == null) {
                        this.f408A = new C0025b();
                        this.f408A.mo158a(this.f433w, this.f416I, this.f415H);
                    }
                    for (int i9 = 0; i9 < f262k.length; i9++) {
                        this.f409B[i9] = C0012j.m46a(this.f433w.mo123a(), this.f416I, this.f415H.mo91a(f262k[i9]), 0);
                    }
                    z = true;
                }
            }
            if (z) {
                C0037i[] iVarArr = {mo214a(this.f411D[4], this.f414G[0].f484ae, this.f414G[1].f484ae, 0, 5120, 400, 1280), mo214a(this.f411D[5], this.f414G[0].f485af, this.f414G[1].f485af, 0, 3840, 400, 1280), mo214a(this.f411D[7], this.f414G[0].f486ag, this.f414G[1].f486ag, 0, 2560, 400, 1280), mo214a(this.f411D[8], this.f414G[0].f487ah, this.f414G[1].f487ah, 0, 1280, 400, 1280), mo214a(this.f411D[25], this.f414G[0].f488ai, this.f414G[1].f488ai, -900, 2560, 200, 1280), mo214a(this.f411D[26], this.f414G[0].f489aj, this.f414G[1].f489aj, -900, 5120, 200, 1280), mo214a(this.f411D[25], this.f414G[0].f490ak, this.f414G[1].f490ak, 1500, 2560, 200, 1280), mo214a(this.f411D[26], this.f414G[0].f491al, this.f414G[1].f491al, 1500, 5120, 200, 1280), mo214a(this.f411D[10], this.f414G[0].f492am, this.f414G[1].f492am, 0, this.f411D[10].f336h, 800, this.f411D[10].f336h), mo213a(this.f411D[11], this.f414G[0].f493an, this.f414G[1].f493an, m171a(7), m174b(1362)), mo213a(this.f411D[12], this.f414G[0].f494ao, this.f414G[1].f494ao, m171a(6), m174b(1853)), mo213a(this.f411D[13], this.f414G[0].f495ap, this.f414G[1].f495ap, m171a(3), m174b(2155)), mo213a(this.f411D[14], this.f414G[0].f496aq, this.f414G[1].f496aq, m171a(115), m174b(2820)), mo213a(this.f411D[15], this.f414G[0].f497ar, this.f414G[1].f497ar, m171a(176), m174b(2893)), mo213a(this.f411D[16], this.f414G[0].f498as, this.f414G[1].f498as, m171a(24), m174b(3024)), mo213a(this.f411D[17], this.f414G[0].f499at, this.f414G[1].f499at, m171a(187), m174b(3080)), mo213a(this.f411D[18], this.f414G[0].f500au, this.f414G[1].f500au, m171a(133), m174b(3140)), mo213a(this.f411D[19], this.f414G[0].f501av, this.f414G[1].f501av, m171a(13), m174b(4244)), mo213a(this.f411D[20], this.f414G[0].f502aw, this.f414G[1].f502aw, m171a(66), m174b(4554)), mo213a(this.f411D[21], this.f414G[0].f503ax, this.f414G[1].f503ax, m171a(78), m174b(4757)), mo213a(this.f411D[22], this.f414G[0].f504ay, this.f414G[1].f504ay, m171a(82), m174b(3028)), mo213a(this.f411D[31], this.f414G[0].f483ad, this.f414G[1].f483ad, m171a(240), m174b(13)), mo213a(this.f412E.mo154a(0, 0), this.f414G[0].f480aa, this.f414G[1].f480aa, m171a(252), m174b(76)), mo213a(this.f411D[27], this.f414G[0].f505az, this.f414G[1].f505az, m171a(17), m174b(16)), mo213a(this.f411D[1], this.f414G[0].f466Z, this.f414G[1].f466Z, m171a(0), m174b(0)), mo213a(this.f411D[30], this.f414G[0].f468aA, this.f414G[1].f468aA, m171a(0), m174b(0)), mo213a(this.f411D[29], this.f414G[0].f481ab, this.f414G[1].f481ab, m171a(40), m174b(208)), new C0037i(this, (C0012j) null, (C0000a) null, (C0004b) null, (C0011i) null, (C0011i) null)};
                int i10 = 0;
                while (true) {
                    int i11 = i10;
                    if (iVarArr[i11].f794b == null) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12;
                            if (i13 >= 1000) {
                                break;
                            }
                            C0011i iVar = new C0011i();
                            C0011i iVar2 = new C0011i();
                            iVar.mo41a((C0012j) null, 0, 0, 2, m175c(0.0f, 0.0f), C0004b.m16a(0.0f, 0.0f), 0.0f, 0.0f);
                            iVar2.mo41a((C0012j) null, 0, 0, 2, m175c(0.0f, 0.0f), C0004b.m16a(0.0f, 0.0f), 0.0f, 0.0f);
                            this.f414G[0].f508d[i13] = iVar;
                            this.f414G[1].f508d[i13] = iVar2;
                            i12 = i13 + 1;
                        }
                        Log.e("AgainstGameMain", "loadSpriteInit end.");
                    } else {
                        C0011i iVar3 = iVarArr[i11].f797e;
                        C0011i iVar4 = iVarArr[i11].f798f;
                        if (iVar3 == null || iVar4 == null) {
                            m96i();
                        } else {
                            iVar3.mo41a(iVarArr[i11].f794b, 0, 1, iVarArr[i11].f793a, m175c(iVarArr[i11].f795c.f0a, iVarArr[i11].f795c.f1b), C0004b.m16a(iVarArr[i11].f796d.f59a, iVarArr[i11].f796d.f60b), iVarArr[i11].f795c.f0a, iVarArr[i11].f795c.f1b);
                            iVar4.mo41a(iVarArr[i11].f794b, 0, 1, iVarArr[i11].f793a, m175c(iVarArr[i11].f795c.f0a, iVarArr[i11].f795c.f1b), C0004b.m16a(iVarArr[i11].f796d.f59a, iVarArr[i11].f796d.f60b), iVarArr[i11].f795c.f0a, iVarArr[i11].f795c.f1b);
                            this.f414G[0].f507c[i11] = iVar3;
                            this.f414G[1].f507c[i11] = iVar4;
                            iVarArr[i11].f797e = iVar3;
                            iVarArr[i11].f798f = iVar4;
                            i10 = i11 + 1;
                        }
                    }
                }
                m96i();
            }
            this.f435y = 1;
        }
        this.f414G[i].f472aE = 2;
        this.f414G[i].f467a = this.f414G[i].f472aE;
        this.f414G[i].f470aC = System.currentTimeMillis();
    }

    /* renamed from: g */
    private synchronized void m94g() {
        if (this.f434x != 1) {
            this.f434x = 1;
            this.f433w.f539i.sendMessage(this.f433w.f539i.obtainMessage(3));
        }
    }

    /* renamed from: g */
    private void m95g(int i) {
        float f;
        C0011i iVar;
        float f2;
        float f3;
        float f4;
        C0000a c;
        C0039k kVar;
        GL10 a = this.f433w.mo123a();
        this.f436z = i;
        this.f414G[i].f467a = this.f414G[i].f472aE;
        if (this.f414G[i].f514j > 0) {
            m85a(this.f419L);
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f414G[i].f471aD = ((float) (currentTimeMillis - this.f414G[i].f470aC)) / 1000.0f;
        if (this.f414G[i].f467a < 15) {
            switch (this.f414G[i].f467a) {
                case 0:
                    Log.e("AgainstGameMain", "sceneStandBy");
                    m93f(i);
                    break;
                case Base64.ENCODE /*1*/:
                    Log.e("AgainstGameMain", "sceneGameFadeIn");
                    this.f414G[i].f482ac.f316n = 1;
                    float f5 = (this.f414G[i].f471aD / 1.0f) * 1.0f;
                    if (f5 < 0.0f) {
                        f5 = 0.0f;
                    }
                    this.f414G[i].f482ac.f315m = 1.0f - f5;
                    if (this.f414G[i].f482ac.f315m <= 0.0f && ((double) this.f414G[i].f471aD) > 1.5d) {
                        this.f414G[i].f482ac.f316n = 0;
                        this.f414G[i].f472aE = 2;
                        this.f414G[i].f470aC = System.currentTimeMillis();
                        break;
                    }
                case Base64.GZIP /*2*/:
                    m91e(i);
                    this.f414G[i].f506b = 0.0f;
                    this.f414G[i].f483ad.f316n = 1;
                    this.f414G[i].f483ad.f315m = 1.0f;
                    this.f414G[i].f480aa.f316n = 1;
                    this.f414G[i].f480aa.f315m = 1.0f;
                    this.f414G[i].f505az.f316n = 1;
                    this.f414G[i].f505az.f315m = 1.0f;
                    this.f414G[i].f457Q = System.currentTimeMillis();
                    if (this.f414G[i].f458R > 300.0f) {
                        this.f414G[i].f458R = 160.0f;
                    }
                    if (this.f414G[i].f456P == 1) {
                        this.f414G[i].f515k = 0;
                        this.f414G[i].f516l = 0;
                    }
                    this.f414G[i].f472aE = 3;
                    this.f414G[i].f470aC = System.currentTimeMillis();
                    this.f414G[i].f509e = 0;
                    break;
                case 3:
                    Log.e("AgainstGameMain", "sceneGameSoundPlay");
                    C0010h[] hVarArr = this.f415H.f397w;
                    this.f415H.f397w[36].mo33a();
                    this.f414G[i].f472aE = 4;
                    this.f414G[i].f470aC = System.currentTimeMillis();
                    break;
                case Base64.DONT_GUNZIP /*4*/:
                    this.f414G[i].f481ab.f316n = 1;
                    float f6 = this.f414G[i].f471aD;
                    if (((double) this.f414G[i].f471aD) > 2.3d) {
                        this.f414G[i].f481ab.f316n = 1;
                        this.f414G[i].f472aE = 5;
                        this.f414G[i].f470aC = System.currentTimeMillis();
                        break;
                    }
                    break;
                case 5:
                    this.f414G[i].f481ab.f316n = 1;
                    float f7 = (this.f414G[i].f471aD / 1.0f) * 3.0f;
                    this.f414G[i].f481ab.f322t = 1.0f + (2.6f * f7 * 2.0f);
                    if (f7 < 0.0f) {
                        f7 = 0.0f;
                    }
                    this.f414G[i].f481ab.f315m = 1.0f - f7;
                    if (((double) this.f414G[i].f471aD) > 0.4d) {
                        this.f414G[i].f481ab.f316n = 0;
                        this.f414G[i].f472aE = 6;
                        this.f414G[i].f470aC = System.currentTimeMillis();
                        break;
                    }
                    break;
                case 6:
                    if (this.f414G[i].f510f != null) {
                        float f8 = this.f414G[i].f471aD / 2.0f;
                        float f9 = f8 - ((float) ((int) f8));
                        float f10 = ((double) f9) < 0.5d ? f9 * 2.0f : ((0.5f - f9) + 0.5f) * 2.0f;
                        C0011i iVar2 = this.f414G[i].f510f;
                        iVar2.f321s = (f10 * iVar2.f324v) - (iVar2.f324v / 3.0f);
                    }
                    if (this.f414G[i].f509e == 2) {
                        float f11 = this.f414G[i].f471aD / 1.0f;
                        float f12 = f11 - ((float) ((int) f11));
                        if (((double) f12) >= 0.5d) {
                            this.f414G[i].f466Z.f315m = 1.0f - ((f12 - 0.5f) * 2.0f);
                            break;
                        } else {
                            this.f414G[i].f466Z.f315m = f12 * 2.0f;
                            break;
                        }
                    }
                    break;
                case 7:
                    Log.e("AgainstGameMain", "sceneGameOverReady");
                    this.f414G[i].f472aE = 8;
                    this.f414G[i].f470aC = System.currentTimeMillis();
                    break;
                case Base64.DO_BREAK_LINES /*8*/:
                    Log.e("AgainstGameMain", "sceneGameOverFadeOut");
                    this.f414G[i].f482ac.f316n = 1;
                    float f13 = this.f414G[i].f471aD / 1.0f;
                    if (f13 > 0.5f) {
                        f13 = 0.5f;
                    }
                    this.f414G[i].f482ac.f315m = f13;
                    if (((double) f13) >= 0.5d && this.f414G[i].f471aD > 0.1f) {
                        this.f414G[i].f482ac.f316n = 1;
                        this.f414G[i].f472aE = 10;
                        this.f414G[i].f470aC = System.currentTimeMillis();
                        this.f414G[i].f477aJ = 0;
                        this.f414G[i].f478aK = 0;
                        break;
                    }
                case 10:
                    this.f414G[i].f470aC = System.currentTimeMillis();
                    if (i == 0) {
                        if (this.f414G[1].f467a >= 10) {
                            this.f414G[i].f472aE = 11;
                            this.f414G[i].f470aC = System.currentTimeMillis();
                        }
                    } else if (this.f414G[0].f467a >= 10) {
                        this.f414G[i].f472aE = 11;
                        this.f414G[i].f470aC = System.currentTimeMillis();
                    }
                    this.f414G[i].f478aK++;
                    if (this.f414G[i].f478aK >= 10) {
                        this.f414G[i].f477aJ++;
                        this.f414G[i].f478aK = 0;
                    }
                    if (this.f414G[i].f477aJ >= f407m) {
                        this.f414G[i].f477aJ = 0;
                        break;
                    }
                    break;
                case 11:
                    this.f414G[i].f472aE = 12;
                    this.f414G[i].f470aC = System.currentTimeMillis();
                    break;
                case 12:
                    boolean z = false;
                    if (i == 0) {
                        if (this.f414G[1].f467a >= 12) {
                            z = true;
                        }
                    } else if (this.f414G[0].f467a >= 12) {
                        z = true;
                    }
                    if (z) {
                        this.f414G[i].f472aE = 13;
                        this.f414G[i].f470aC = System.currentTimeMillis();
                        break;
                    }
                    break;
                case 13:
                    this.f414G[i].f472aE = 14;
                    this.f414G[i].f470aC = System.currentTimeMillis();
                    break;
                case 14:
                    Log.e("AgainstGameMain", "sceneGameExit");
                    m94g();
                    break;
            }
        }
        if (this.f414G[0].f467a >= 2 && this.f414G[1].f467a >= 2) {
            if (this.f414G[i].f474aG > 180) {
                C0012j a2 = this.f412E.mo154a(this.f414G[i].f515k, 1);
                if (!this.f414G[i].f473aF && a2 != null) {
                    this.f414G[i].f473aF = true;
                    if (this.f413F[i] == null) {
                        this.f413F[i] = C0012j.m46a(this.f433w.mo123a(), this.f416I, this.f415H.mo91a("sleep_otona.png"), 0);
                    }
                    this.f414G[i].f480aa.f304b = a2;
                    this.f414G[i].f480aa.f314l = C0004b.m16a(a2.f329a, a2.f330b);
                }
            } else {
                this.f414G[i].f474aG++;
                C0012j a3 = this.f412E.mo154a(this.f414G[i].f515k, 0);
                if (this.f414G[i].f473aF) {
                    this.f414G[i].f473aF = false;
                    this.f414G[i].f480aa.f304b = a3;
                    this.f414G[i].f480aa.f314l = C0004b.m16a(a3.f329a, a3.f330b);
                }
            }
            if (this.f414G[i].f509e == 2 && this.f414G[i].f510f != null && this.f414G[i].f511g != null && this.f414G[i].f511g.f839f == 2) {
                C0002b bVar = this.f414G[i].f511g.f819N;
                if (((float) (currentTimeMillis - this.f414G[i].f517m)) / 1000.0f < 3.0f) {
                    this.f414G[i].f510f.f304b = this.f414G[i].f469aB[(bVar.f20a * 7) + 1].f304b;
                } else {
                    this.f414G[i].f510f.f304b = this.f414G[i].f469aB[(bVar.f20a * 7) + 0].f304b;
                }
            }
            if (this.f414G[i].f526v == 0) {
                int i2 = this.f414G[i].f514j - 1;
                while (true) {
                    if (i2 >= 0) {
                        C0039k kVar2 = this.f414G[i].f512h[i2];
                        if (kVar2.f858y != 0) {
                            i2--;
                        } else if (this.f414G[i].f463W < kVar2.f842i) {
                            this.f414G[i].f463W = kVar2.f842i;
                        }
                    }
                }
            }
            float f14 = ((float) (currentTimeMillis - this.f414G[i].f527w)) / 1000.0f;
            if (f14 > 1.0f) {
                f14 = 1.0f;
                if (this.f414G[i].f526v == 2) {
                    this.f414G[i].f519o = 0.0f;
                    this.f414G[i].f520p = 0.0f;
                    this.f414G[i].f521q = 0.0f;
                    this.f414G[i].f522r = 1.0f;
                    this.f414G[i].f523s = 0.0f;
                    this.f414G[i].f526v = 0;
                    this.f414G[i].f454N = 0;
                }
            }
            if (this.f414G[i].f526v == 1 || this.f414G[i].f526v == 3) {
                this.f414G[i].f519o = 0.0f;
                this.f414G[i].f520p = 0.0f;
                this.f414G[i].f521q = 0.0f;
                float f15 = 1280.0f / (this.f414G[i].f463W + 1280.0f);
                this.f414G[i].f522r = ((1.0f - f14) * (1.0f - f15)) + f15;
                this.f414G[i].f523s = f14;
                this.f414G[i].f524t = 800.0f * this.f414G[i].f522r;
                this.f414G[i].f525u = 1280.0f * this.f414G[i].f522r;
                if (this.f414G[i].f526v == 1 && f14 == 1.0f && this.f414G[i].f454N == 0) {
                    this.f414G[i].f453M = System.currentTimeMillis();
                    this.f414G[i].f454N = 2;
                }
            }
            if (this.f414G[i].f526v == 2) {
                this.f414G[i].f519o = 0.0f;
                this.f414G[i].f520p = 0.0f;
                this.f414G[i].f521q = 0.0f;
                float f16 = 1280.0f / (this.f414G[i].f463W + 1280.0f);
                this.f414G[i].f522r = (f14 * (1.0f - f16)) + f16;
                this.f414G[i].f523s = 1.0f - f14;
                this.f414G[i].f524t = 800.0f * this.f414G[i].f522r;
                this.f414G[i].f525u = 1280.0f * this.f414G[i].f522r;
            }
            float f17 = this.f414G[i].f459S;
            if (this.f414G[i].f514j > 0 && (kVar = this.f414G[i].f512h[this.f414G[i].f514j - 1]) != null && this.f414G[i].f526v == 0 && kVar.f844k > 0.0f) {
                float f18 = kVar.f844k;
                if (f18 > 852.0f && f18 - 852.0f > this.f414G[i].f459S) {
                    f17 = (float) ((int) (f18 - 640.0f));
                    this.f414G[i].f459S = f17;
                }
            }
            if (this.f414G[i].f526v == 0) {
                this.f414G[i].f528x = f17;
            } else {
                f17 = this.f414G[i].f528x;
            }
            if (this.f414G[i].f441A == 1) {
                float f19 = this.f414G[i].f442B - this.f414G[i].f443C;
                if (f19 < 0.0f) {
                    f = (this.f414G[i].f518n - 319.91998f) + f19;
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                }
            } else if (this.f414G[i].f441A == 2) {
                f = this.f414G[i].f518n - 319.91998f;
                int i3 = this.f414G[i].f514j - 1;
                while (true) {
                    if (i3 >= 0) {
                        C0039k kVar3 = this.f414G[i].f512h[i3];
                        if (kVar3.f858y != 0) {
                            i3--;
                        } else if (this.f414G[i].f463W < kVar3.f842i) {
                            f = kVar3.f842i;
                        }
                    }
                }
                if (f < 0.0f) {
                    f = 0.0f;
                }
            }
            float f20 = 0.0f;
            float f21 = 0.0f;
            if (this.f414G[i].f514j > 0 && this.f414G[i].f467a == 6) {
                float f22 = -this.f424n[0];
                if (this.f414G[i].f445E == 0) {
                    f20 = f22 * 100.0f;
                    f21 = 50.0f * f22;
                }
            }
            if (this.f414G[i].f445E != 0) {
                f20 += this.f414G[i].f460T;
            }
            float f23 = this.f414G[i].f526v != 0 ? (float) (((double) f20) * (1.0d - ((double) this.f414G[i].f523s))) : f20;
            long currentTimeMillis2 = System.currentTimeMillis();
            C0039k kVar4 = null;
            for (int i4 = 0; i4 < this.f414G[i].f514j; i4++) {
                C0039k kVar5 = this.f414G[i].f512h[i4];
                kVar5.f848o = 0.0f;
                kVar5.f857x = 0.0f;
            }
            float f24 = 0.0f;
            float f25 = 0.0f;
            float f26 = 0.0f;
            for (int i5 = this.f414G[i].f514j - 1; i5 >= 0; i5--) {
                C0039k kVar6 = this.f414G[i].f512h[i5];
                kVar6.f857x = f24;
                kVar6.f855v = f25;
                kVar6.f856w = f26;
                float f27 = ((float) (currentTimeMillis2 - kVar6.f851r)) / 5000.0f;
                if (f27 > 1.0f) {
                    f27 = 1.0f;
                }
                float f28 = ((float) i5) / ((float) (this.f414G[i].f514j - 1));
                float f29 = kVar6.f818M;
                f24 += f29 * f27 * f28;
                f25 += kVar6.f853t * (f29 / 20.0f) * 0.65f * f27 * f28;
                f26 += f27 * kVar6.f854u * (f29 / 20.0f) * 1.05f * f28;
            }
            float f30 = 0.0f;
            boolean z2 = false;
            boolean z3 = false;
            float f31 = 0.0f;
            int i6 = 0;
            float f32 = 0.0f;
            while (i6 < this.f414G[i].f514j) {
                C0039k kVar7 = this.f414G[i].f512h[i6];
                if (kVar7.f846m > 0.0f && kVar7.f847n <= 0.0f && kVar7.f846m > kVar7.f847n) {
                    kVar7.f848o = kVar7.f846m - kVar7.f847n;
                    z2 = true;
                    if (z3) {
                        z3 = false;
                        f2 = 0.0f;
                    } else {
                        f2 = f30;
                    }
                } else if (kVar7.f847n <= 0.0f || kVar7.f846m > 0.0f || kVar7.f846m >= kVar7.f847n) {
                    z2 = false;
                    z3 = false;
                    f2 = 0.0f;
                } else {
                    kVar7.f848o = -(kVar7.f847n - kVar7.f846m);
                    if (z2) {
                        z2 = false;
                        f30 = 0.0f;
                    }
                    z3 = true;
                    f2 = f30;
                }
                float f33 = f2 + kVar7.f848o;
                kVar7.f848o += f2;
                kVar7.f848o += f32;
                if (kVar7.f850q != 0.0f) {
                    float f34 = ((float) (currentTimeMillis2 - kVar7.f851r)) / 5000.0f;
                    if (f34 > 1.0f) {
                        f34 = 1.0f;
                    }
                    float f35 = (kVar7.f856w - kVar7.f855v) / 1.0f;
                    if (kVar7.f850q < 0.0f) {
                        f35 = -f35;
                    }
                    float f36 = f34 * kVar7.f850q * f35;
                    if (f36 < 0.0f) {
                        if (kVar7.f849p > f36) {
                            kVar7.f849p -= 0.005f;
                        }
                    } else if (f36 > 0.0f && kVar7.f849p < f36) {
                        kVar7.f849p += 0.005f;
                    }
                    kVar7.f848o += kVar7.f849p;
                }
                f30 = f33 + f21;
                C0011i iVar3 = kVar7.f835b;
                C0012j jVar = iVar3.f304b;
                if (((double) (((float) (currentTimeMillis2 - kVar7.f851r)) / 1000.0f)) < 0.25d) {
                    C0012j jVar2 = kVar7.f836c.f304b;
                }
                float f37 = 0.0f;
                float f38 = 0.0f;
                if (kVar4 != null) {
                    f37 = -kVar7.f841h;
                    f38 = kVar4.f852s;
                }
                float cos = (float) Math.cos((double) (f31 / -60.0f));
                float sin = (float) Math.sin((double) (f31 / -60.0f));
                if (kVar4 != null) {
                    f4 = (float) Math.cos((double) (kVar4.f848o / -60.0f));
                    f3 = (float) Math.sin((double) (kVar4.f848o / -60.0f));
                } else {
                    float f39 = cos;
                    f3 = sin;
                    f4 = f39;
                }
                float f40 = (f37 * f4) - (f38 * f3);
                float f41 = (f4 * f38) + (f3 * f37);
                float f42 = f40 - f37;
                float f43 = f41 - f38;
                C0004b bVar2 = iVar3.f314l;
                if (kVar4 == null) {
                    c = ((double) this.f414G[i].f522r) != 1.0d ? m175c(kVar7.f841h + f42, (1280.0f - kVar7.f842i) + ((1.0f - this.f414G[i].f523s) * f) + f43) : m175c(kVar7.f841h + f42, (1280.0f - kVar7.f842i) + f + f43);
                    kVar7.f859z = m175c(kVar7.f841h + f42, f43 + (1280.0f - kVar7.f842i) + f);
                    if (this.f414G[i].f526v == 0) {
                        kVar7.f843j = kVar7.f859z.f0a;
                        kVar7.f844k = (1280.0f - kVar7.f859z.f1b) + f;
                    }
                } else {
                    c = m175c(((kVar4.f835b.f313k.f0a + (kVar4.f835b.f314l.f59a / 2.0f)) - f40) - (kVar7.f835b.f314l.f59a / 2.0f), ((kVar4.f835b.f314l.f60b + kVar4.f835b.f313k.f1b) - f41) - kVar7.f835b.f314l.f60b);
                    kVar7.f859z = m175c(c.f0a, c.f1b);
                    if (this.f414G[i].f526v == 0) {
                        kVar7.f843j = kVar7.f859z.f0a;
                        kVar7.f844k = (1280.0f - kVar7.f859z.f1b) + f;
                    }
                }
                iVar3.f313k = c;
                kVar7.f806A = m175c(c.f0a, c.f1b);
                kVar7.f807B = C0004b.m16a(bVar2.f59a, bVar2.f60b);
                kVar7.f808C = iVar3.f326x;
                kVar7.f809D = iVar3.f327y;
                kVar7.f810E = iVar3.f328z;
                if (kVar7.f850q != 0.0f) {
                    f32 += kVar7.f849p;
                }
                i6++;
                f31 = f2 - f32;
                kVar4 = kVar7;
            }
            m88c(f, f23, i);
            this.f433w.mo123a();
            if (this.f414G[i].f473aF) {
                this.f414G[i].f475aH++;
                if (this.f414G[i].f475aH > 10) {
                    this.f414G[i].f476aI++;
                    this.f414G[i].f475aH = 0;
                }
                this.f415H.f388n.get(Integer.valueOf(this.f414G[i].f515k));
                int[] a4 = this.f415H.mo91a("sleep_otona.png");
                this.f413F[i].f337i = ((float) (((int) this.f412E.f575S[this.f414G[i].f476aI % 9][0]) + a4[1])) / ((float) this.f416I[1].f362n);
                this.f413F[i].f338j = ((float) (a4[2] + ((int) this.f412E.f575S[this.f414G[i].f476aI % 9][1]))) / ((float) this.f416I[1].f363o);
                this.f413F[i].mo48a(new C0000a(638.0f, 1280.0f - (this.f414G[i].f480aa.f319q - 0.5f)));
            }
            m83a(currentTimeMillis2, f23, i);
            if (this.f414G[i].f445E == 0 && this.f414G[i].f526v == 0 && this.f414G[i].f514j > 3) {
                C0039k kVar8 = this.f414G[i].f512h[this.f414G[i].f514j - 1];
                float f44 = kVar8.f807B.f59a;
                float f45 = kVar8.f806A.f0a;
                float f46 = kVar8.f806A.f1b - 50.0f;
                if (f44 + f45 < -40.0f || f45 > 765.0f || f46 > 1240.0f) {
                    m89d(i);
                    this.f414G[i].f441A = 0;
                    this.f414G[i].f460T = -((kVar8.f807B.f59a / 2.0f) + (kVar8.f859z.f0a - 400.0f));
                }
            }
            if (this.f414G[i].f445E == 1) {
                boolean z4 = false;
                if (this.f414G[i].f526v == 3) {
                    if (this.f414G[i].f523s == 1.0f) {
                        this.f414G[i].f454N = 0;
                        this.f414G[i].f445E = 2;
                        this.f414G[i].f446F = System.currentTimeMillis();
                        this.f414G[i].f447G = (C0031f.m138b() * 0.1f) + 0.05f;
                    }
                } else if (((float) (currentTimeMillis2 - this.f414G[i].f446F)) / 1000.0f > this.f414G[i].f447G) {
                    this.f414G[i].f446F = System.currentTimeMillis();
                    this.f414G[i].f447G = 0.3f;
                    boolean z5 = false;
                    int i7 = this.f414G[i].f514j - 1;
                    while (true) {
                        if (i7 >= 0) {
                            C0039k kVar9 = this.f414G[i].f512h[i7];
                            if (kVar9.f858y != 0 || kVar9.f806A.f1b - 20.0f >= 496.0f) {
                                i7--;
                            } else {
                                kVar9.f858y = 2;
                                z5 = true;
                            }
                        }
                    }
                    if (!z5) {
                        z4 = true;
                    }
                }
                if (z4 && this.f414G[i].f526v != 3) {
                    this.f414G[i].f526v = 3;
                    this.f414G[i].f519o = 0.0f;
                    this.f414G[i].f520p = 0.0f;
                    this.f414G[i].f521q = 0.0f;
                    this.f414G[i].f522r = 1.0f;
                    this.f414G[i].f527w = System.currentTimeMillis();
                    this.f414G[i].f441A = 0;
                    this.f414G[i].f463W = 0.0f;
                    int i8 = this.f414G[i].f514j - 1;
                    while (true) {
                        if (i8 >= 0) {
                            C0039k kVar10 = this.f414G[i].f512h[i8];
                            if (kVar10.f858y != 0) {
                                i8--;
                            } else if (this.f414G[i].f463W < kVar10.f842i) {
                                this.f414G[i].f463W = kVar10.f842i;
                            }
                        }
                    }
                }
            } else if (this.f414G[i].f445E == 2) {
                if (((float) (currentTimeMillis2 - this.f414G[i].f446F)) / 1000.0f > this.f414G[i].f447G) {
                    this.f414G[i].f446F = System.currentTimeMillis();
                    this.f414G[i].f447G = (C0031f.m138b() * 0.1f) + 0.05f;
                    boolean z6 = false;
                    int i9 = this.f414G[i].f514j - 1;
                    while (true) {
                        if (i9 >= 0) {
                            C0039k kVar11 = this.f414G[i].f512h[i9];
                            if (kVar11.f858y == 0) {
                                kVar11.f858y = 2;
                                z6 = true;
                                if (Math.abs(kVar11.f848o) > 90.0f) {
                                    this.f414G[i].f447G = 0.0f;
                                }
                            } else {
                                i9--;
                            }
                        }
                    }
                    if (!z6) {
                        this.f414G[i].f445E = 3;
                        this.f414G[i].f446F = System.currentTimeMillis();
                    }
                }
            } else if (this.f414G[i].f445E == 3 && ((float) (currentTimeMillis2 - this.f414G[i].f446F)) / 1000.0f > 1.2f) {
                if (this.f414G[i].f448H == 0) {
                    this.f414G[i].f472aE = 7;
                    this.f414G[i].f445E = 4;
                } else {
                    m92f();
                    this.f414G[i].f483ad.f316n = 1;
                    this.f414G[i].f483ad.f315m = 1.0f;
                    this.f414G[i].f480aa.f316n = 1;
                    this.f414G[i].f480aa.f315m = 1.0f;
                }
            }
            if (this.f414G[i].f445E > 0 && this.f414G[i].f514j > 0) {
                int i10 = this.f414G[i].f514j - 1;
                while (true) {
                    if (i10 >= 0) {
                        C0039k kVar12 = this.f414G[i].f512h[i10];
                        if (kVar12.f858y == 0) {
                            this.f414G[i].f460T = -((kVar12.f807B.f59a / 2.0f) + (kVar12.f859z.f0a - 160.0f));
                        } else {
                            i10--;
                        }
                    }
                }
            }
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = i12;
                int i14 = i11;
                if (i13 >= this.f414G[i].f514j) {
                    a.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                    for (int i15 = 0; i15 < 1000; i15++) {
                        C0011i iVar4 = this.f414G[i].f508d[i15];
                        if (!(iVar4 == null || iVar4.f316n == 0)) {
                            iVar4.f299I += 0.2f;
                            iVar4.mo44b(iVar4.f313k.f0a + iVar4.f323u, iVar4.f313k.f1b + iVar4.f299I);
                            iVar4.f297G++;
                            iVar4.f321s += iVar4.f324v;
                        }
                    }
                    for (int i16 = 0; i16 < 1000; i16++) {
                        C0011i iVar5 = this.f414G[i].f508d[i16];
                        if (!(iVar5 == null || iVar5.f316n == 0)) {
                            C0012j jVar3 = iVar5.f304b;
                            float f47 = iVar5.f315m;
                            C0004b a5 = C0004b.m16a(jVar3.f329a, jVar3.f330b);
                            C0000a aVar = iVar5.f313k;
                            float f48 = iVar5.f321s;
                            a.glPushMatrix();
                            if (((double) this.f414G[i].f522r) != 1.0d) {
                                a.glTranslatef(0.0f, -1280.0f * (1.0f - this.f414G[i].f522r), 0.0f);
                                a.glScalef(this.f414G[i].f522r, this.f414G[i].f522r, 1.0f);
                                a.glTranslatef(((((1.0f - this.f414G[i].f522r) * ((800.0f / this.f414G[i].f522r) / 2.0f)) + ((800.0f / this.f414G[i].f522r) / 2.0f)) - (((800.0f / this.f414G[i].f522r) / 2.0f) - (a5.f59a / 2.0f))) + aVar.f0a + f23, ((((1280.0f / this.f414G[i].f522r) / 2.0f) - (a5.f60b / 2.0f)) + ((1280.0f / this.f414G[i].f522r) / 2.0f)) - aVar.f1b, 0.0f);
                                a.glRotatef(f48, 0.0f, 0.0f, 1.0f);
                            } else {
                                a.glTranslatef((400.0f - (400.0f - (a5.f59a / 2.0f))) + aVar.f0a + f23, ((640.0f - (a5.f60b / 2.0f)) + 640.0f) - aVar.f1b, 0.0f);
                                a.glRotatef(f48, 0.0f, 0.0f, 1.0f);
                            }
                            a.glColor4f(1.0f * f47, 1.0f * f47, 1.0f * f47, f47);
                            if (iVar5.f323u > 0.0f) {
                                jVar3.mo51c();
                            } else {
                                jVar3.mo50b();
                            }
                            a.glPopMatrix();
                        }
                    }
                    C0011i iVar6 = this.f414G[i].f482ac;
                    if (!(iVar6 == null || iVar6.f316n == 0)) {
                        m85a(this.f420M);
                    }
                    if (this.f414G[i].f467a == 10) {
                        if (this.f414G[i == 0 ? (char) 1 : 0].f467a < 10) {
                            this.f409B[this.f414G[i].f477aJ].mo48a(m175c(540.0f, 150.0f));
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0039k kVar13 = this.f414G[i].f512h[i13];
                if (kVar13.f858y != 1) {
                    float abs = Math.abs(kVar13.f848o);
                    boolean z7 = false;
                    if (this.f414G[i].f445E == 0 && i13 > this.f414G[i].f514j - 10 && abs > 60.0f) {
                        z7 = true;
                        Log.e("AgainstGameMini", "Crash0!!!!!");
                    }
                    if ((i14 != 0 || kVar13.f858y == 2) ? true : z7) {
                        kVar13.f858y = 1;
                        this.f414G[i].f471aD = ((float) (System.currentTimeMillis() - this.f414G[i].f470aC)) / 1000.0f;
                        float f49 = kVar13.f859z.f0a;
                        float f50 = kVar13.f859z.f1b;
                        int i17 = kVar13.f839f;
                        if (i13 == 0) {
                            f50 = (1280.0f - kVar13.f835b.f304b.f330b) - 30.0f;
                        }
                        C0011i a6 = m82a(kVar13, i17, f49, f50, this.f414G[i].f471aD, i);
                        a6.f315m = 1.0f;
                        if (i14 == 0) {
                            if (this.f414G[i].f445E == 0) {
                                m89d(i);
                            }
                            iVar = a6;
                            i11 = i13;
                        } else {
                            iVar = a6;
                            i11 = i14;
                        }
                    } else {
                        iVar = null;
                        i11 = i14;
                    }
                    if (i11 > 0) {
                        float f51 = this.f414G[i].f518n;
                        this.f414G[i].f518n = 0.0f;
                        for (int i18 = 0; i18 < this.f414G[i].f514j; i18++) {
                            C0039k kVar14 = this.f414G[i].f512h[i18];
                            C0022e eVar = this.f414G[i];
                            eVar.f518n = kVar14.f852s + eVar.f518n;
                        }
                        float f52 = f51 - this.f414G[i].f518n;
                        if (iVar != null) {
                            iVar.mo44b(iVar.f313k.f0a, iVar.f313k.f1b - f52);
                            iVar.f318p = iVar.f313k.f0a;
                            iVar.f319q = iVar.f313k.f1b;
                        }
                    }
                } else {
                    i11 = i14;
                }
                i12 = i13 + 1;
            }
        }
    }

    /* renamed from: i */
    private void m96i() {
        if (this.f432v != 1) {
            this.f433w.f539i.sendMessage(this.f433w.f539i.obtainMessage(0));
            this.f432v = 1;
        }
    }

    /* renamed from: a */
    public final void mo111a() {
        m92f();
        this.f410C = this.f415H.f397w;
        Calendar instance = Calendar.getInstance();
        this.f415H.f398x.f46a = m172a(m173a(instance, "yyyy"));
        this.f415H.f398x.f47b = m172a(m173a(instance, "MM"));
        this.f415H.f398x.f48c = m172a(m173a(instance, "dd"));
        this.f415H.f398x.f49d = m172a(m173a(instance, "HH"));
        this.f415H.f398x.f50e = m172a(m173a(instance, "mm"));
        this.f415H.f398x.f53h = 0;
        this.f415H.f398x.f54i = 0;
        this.f415H.f398x.f52g = 0;
        this.f415H.f398x.f51f = 0.0d;
        this.f415H.f399y.f46a = m172a(m173a(instance, "yyyy"));
        this.f415H.f399y.f47b = m172a(m173a(instance, "MM")) - 1;
        this.f415H.f399y.f48c = m172a(m173a(instance, "dd"));
        this.f415H.f399y.f49d = m172a(m173a(instance, "HH"));
        this.f415H.f399y.f50e = m172a(m173a(instance, "mm"));
        this.f415H.f399y.f53h = 0;
        this.f415H.f399y.f54i = 0;
        this.f415H.f399y.f52g = 0;
        this.f415H.f399y.f51f = 0.0d;
    }

    /* renamed from: a */
    public final void mo112a(float f, float f2, float f3) {
        if (this.f414G[this.f436z].f467a == 6 && this.f414G[this.f436z].f445E == 0 && this.f414G[this.f436z].f514j >= 5) {
            if (!this.f428r && m86a(this.f425o, this.f426p, this.f427q, f, f2, f3, 0.699999988079071d)) {
                this.f428r = true;
                if (this.f414G[this.f436z].f445E == 0) {
                    Log.e("AgainstGameMini", "Crash SHAKE!!!!!");
                    m89d(this.f436z);
                }
            } else if (this.f428r && m86a(this.f425o, this.f426p, this.f427q, f, f2, f3, 0.20000000298023224d)) {
                this.f428r = false;
            }
            this.f425o = f;
            this.f426p = f2;
            this.f427q = f3;
        }
    }

    /* renamed from: a */
    public final void mo113a(float f, float f2, int i) {
        this.f414G[i].f474aG = 0;
        if (this.f414G[i].f467a == 6) {
            C0002b bVar = (C0002b) this.f415H.f388n.get(Integer.valueOf(this.f414G[i].f515k));
            if (this.f414G[i].f509e != 0) {
                return;
            }
            if (this.f414G[i].f483ad.mo39a(f, f2) != 0 && this.f414G[i].f526v == 0) {
                this.f414G[i].f509e = 2;
                this.f414G[i].f510f = this.f414G[i].f469aB[(bVar.f20a * 7) + 0];
                this.f414G[i].f510f.f318p = 80.0f + this.f414G[i].f510f.f314l.f59a;
                this.f414G[i].f511g = new C0039k();
                this.f414G[i].f511g.f839f = bVar.f21b;
                this.f414G[i].f511g.f819N = bVar;
                this.f414G[i].f511g.f840g = this.f414G[i].f516l;
                this.f414G[i].f511g.f832a = this.f414G[i].f510f;
                if (bVar.f21b == 0) {
                    this.f414G[i].f510f.f319q = 0.0f;
                    this.f414G[i].f510f.f326x = 13.0f;
                    this.f414G[i].f510f.f327y = -40.0f;
                    this.f414G[i].f511g.f813H = 32.5f;
                    this.f414G[i].f511g.f814I = 220.0f;
                    this.f414G[i].f511g.f815J = 27.5f;
                    this.f414G[i].f511g.f816K = 217.5f;
                }
                if (bVar.f21b == 1) {
                    this.f414G[i].f510f.f319q = 0.0f;
                    this.f414G[i].f510f.f326x = 40.0f;
                    this.f414G[i].f510f.f327y = -20.0f;
                    this.f414G[i].f511g.f813H = 17.5f;
                    this.f414G[i].f511g.f814I = 117.5f;
                    this.f414G[i].f511g.f815J = 10.0f;
                    this.f414G[i].f511g.f816K = 130.0f;
                }
                if (bVar.f21b == 2) {
                    this.f414G[i].f510f.f319q = 0.0f;
                    this.f414G[i].f510f.f326x = -5.0f;
                    this.f414G[i].f510f.f327y = -87.0f;
                    this.f410C[5].mo33a();
                    this.f414G[i].f511g.f813H = 47.5f;
                    this.f414G[i].f511g.f814I = 322.5f;
                    this.f414G[i].f511g.f815J = 70.0f;
                    this.f414G[i].f511g.f816K = 345.0f;
                }
                this.f414G[i].f513i++;
                this.f414G[i].f510f.f316n = 1;
                this.f414G[i].f510f.f315m = 1.0f;
                this.f414G[i].f510f.f322t = 1.0f;
                this.f414G[i].f510f.f325w = 1;
                this.f414G[i].f510f.f321s = 0.0f;
                this.f414G[i].f510f.f293C = 0.0f;
                this.f414G[i].f510f.f324v = 15.0f;
                this.f414G[i].f510f.f323u = f;
                this.f414G[i].f510f.mo44b(f - this.f414G[i].f510f.f318p, f2 - this.f414G[i].f510f.f319q);
                this.f414G[i].f466Z.f316n = 1;
                this.f414G[i].f466Z.f315m = 1.0f;
                this.f414G[i].f466Z.f318p = this.f414G[i].f466Z.f314l.f59a / 2.0f;
                this.f414G[i].f466Z.f319q = this.f414G[i].f466Z.f314l.f60b / 2.0f;
                this.f414G[i].f466Z.mo44b(f - this.f414G[i].f466Z.f318p, f2 - this.f414G[i].f466Z.f319q);
                this.f414G[i].f468aA.f316n = 1;
                this.f414G[i].f468aA.f315m = 1.0f;
                this.f414G[i].f468aA.f318p = this.f414G[i].f468aA.f314l.f59a + 87.0f;
                this.f414G[i].f468aA.f319q = (this.f414G[i].f468aA.f314l.f60b / 2.0f) + 42.0f;
                this.f414G[i].f468aA.mo44b(f - this.f414G[i].f468aA.f318p, f2 - this.f414G[i].f468aA.f319q);
                this.f414G[i].f517m = System.currentTimeMillis();
            } else if (this.f414G[i].f530z == 0 && this.f414G[i].f441A == 0 && this.f414G[i].f518n > 240.0f) {
                this.f414G[i].f529y = System.currentTimeMillis();
            }
        }
    }

    /* renamed from: a */
    public final void mo114a(float f, int i) {
        this.f414G[i].f474aG = 0;
        if (this.f414G[i].f467a == 6) {
            if (this.f414G[i].f509e == 0) {
                if (this.f414G[i].f441A == 2) {
                    this.f414G[i].f441A = 0;
                    this.f414G[i].f454N = 0;
                } else if (this.f414G[i].f441A == 1) {
                    if (f < 2500.708f) {
                        this.f414G[i].f441A = 0;
                        this.f414G[i].f454N = 0;
                    } else {
                        this.f414G[i].f441A = 2;
                    }
                }
                this.f414G[i].f530z++;
                if (this.f414G[i].f530z == 2) {
                    if (((float) (System.currentTimeMillis() - this.f414G[i].f529y)) / 1000.0f < 1.0f) {
                        if (this.f414G[i].f526v >= 0 && this.f414G[i].f526v <= 2) {
                            this.f414G[i].f519o = 0.0f;
                            this.f414G[i].f520p = 0.0f;
                            this.f414G[i].f521q = 0.0f;
                            this.f414G[i].f522r = 1.0f;
                            this.f414G[i].f527w = System.currentTimeMillis();
                        }
                        if (this.f414G[i].f526v == 0) {
                            this.f414G[i].f526v = 1;
                        } else if (this.f414G[i].f526v == 1) {
                            this.f414G[i].f526v = 2;
                            this.f414G[i].f453M = 0;
                            this.f414G[i].f454N = 0;
                        } else if (this.f414G[i].f526v == 2) {
                            this.f414G[i].f526v = 0;
                            this.f414G[i].f453M = 0;
                            this.f414G[i].f454N = 0;
                        }
                        this.f414G[i].f441A = 0;
                    }
                    this.f414G[i].f530z = 0;
                } else if (this.f414G[i].f530z > 2) {
                    this.f414G[i].f530z = 0;
                }
            } else if (this.f414G[i].f509e == 2 && this.f414G[i].f510f != null) {
                this.f414G[i].f509e = 0;
                this.f414G[i].f510f.f316n = 0;
                this.f414G[i].f466Z.f316n = 0;
                this.f414G[i].f468aA.f316n = 0;
                if (this.f414G[i].f445E == 0 && this.f414G[i].f511g.f845l == 1) {
                    C0039k kVar = null;
                    if (this.f414G[i].f514j > 0) {
                        kVar = this.f414G[i].f512h[this.f414G[i].f514j - 1];
                    }
                    C0002b bVar = this.f414G[i].f511g.f819N;
                    this.f414G[i].f511g.f835b = this.f414G[i].f469aB[(bVar.f20a * 7) + 2];
                    this.f414G[i].f511g.f836c = this.f414G[i].f469aB[(bVar.f20a * 7) + 3];
                    this.f414G[i].f511g.f837d = this.f414G[i].f469aB[(bVar.f20a * 7) + 6];
                    this.f414G[i].f511g.f838e = this.f414G[i].f469aB[(bVar.f20a * 7) + 6];
                    if (this.f414G[i].f511g.f839f == 0 && kVar != null && kVar.f839f == 1) {
                        this.f414G[i].f511g.f835b = this.f414G[i].f469aB[(bVar.f20a * 7) + 4];
                        this.f414G[i].f511g.f836c = this.f414G[i].f469aB[(bVar.f20a * 7) + 5];
                        this.f414G[i].f511g.f835b.f326x = 6.0f;
                        this.f414G[i].f511g.f835b.f327y = 24.0f;
                        this.f414G[i].f511g.f849p = 0.0f;
                        this.f414G[i].f511g.f850q = this.f414G[i].f465Y;
                        this.f414G[i].f511g.f813H = 19.0f;
                        this.f414G[i].f511g.f814I = 77.0f;
                        this.f410C[4].mo33a();
                        int b = (int) (C0031f.m138b() * 2.0f);
                        if (b == 0) {
                            this.f410C[8].mo33a();
                        }
                        if (b == 1) {
                            this.f410C[9].mo33a();
                        }
                        if (!(b == 0 || b == 1)) {
                            this.f410C[13].mo33a();
                        }
                    }
                    if (this.f414G[i].f511g.f839f == 2 && kVar != null) {
                        if (kVar.f839f != 2) {
                            this.f414G[i].f511g.f835b = this.f414G[i].f469aB[(bVar.f20a * 7) + 4];
                            this.f414G[i].f511g.f836c = this.f414G[i].f469aB[(bVar.f20a * 7) + 5];
                        }
                        this.f414G[i].f511g.f835b.f326x = 15.0f;
                        this.f414G[i].f511g.f835b.f327y = 39.0f;
                        this.f414G[i].f511g.f849p = 0.0f;
                        this.f414G[i].f511g.f850q = this.f414G[i].f465Y;
                        this.f414G[i].f511g.f813H = 24.0f;
                        this.f414G[i].f511g.f814I = 128.0f;
                        this.f410C[4].mo33a();
                        int b2 = (int) (C0031f.m138b() * 2.0f);
                        if (kVar.f839f == 0) {
                            if (b2 == 0) {
                                this.f410C[6].mo33a();
                            } else if (b2 == 1) {
                                this.f410C[7].mo33a();
                            } else {
                                this.f410C[11].mo33a();
                            }
                        } else if (kVar.f839f == 1) {
                            if (b2 == 0) {
                                this.f410C[8].mo33a();
                            } else if (b2 == 0 || b2 == 1) {
                                this.f410C[13].mo33a();
                            } else {
                                this.f410C[9].mo33a();
                            }
                        }
                    }
                    if (this.f414G[i].f514j > 0) {
                        C0039k kVar2 = this.f414G[i].f511g;
                        C0039k kVar3 = this.f414G[i].f512h[this.f414G[i].f514j - 1];
                        C0011i iVar = kVar2.f832a;
                        C0011i iVar2 = kVar3.f835b;
                        float f2 = iVar.f314l.f59a;
                        float f3 = iVar.f313k.f0a;
                        float f4 = iVar2.f314l.f59a;
                        float f5 = iVar2.f313k.f0a;
                        if (f3 < f5) {
                            this.f414G[i].f511g.f846m = (f5 - f3) / iVar.f314l.f59a;
                            this.f414G[i].f511g.f846m *= 15.0f;
                        }
                        if (f3 + f2 > f5 + f4) {
                            this.f414G[i].f511g.f847n = ((f3 + f2) - (f5 + f4)) / iVar.f314l.f59a;
                            this.f414G[i].f511g.f847n *= 15.0f;
                        }
                        if ((f4 / 4.0f) + f5 < (f2 / 2.0f) + f3) {
                            kVar3.f853t = ((((f2 / 2.0f) + f3) - f5) + f4) / iVar2.f314l.f59a;
                        }
                        if ((f5 + f4) - (f4 / 4.0f) > (f2 / 2.0f) + f3) {
                            kVar3.f854u = ((((f5 + f4) - (f4 / 4.0f)) - f3) + (f2 / 2.0f)) / iVar2.f314l.f59a;
                        }
                    }
                    this.f414G[i].f511g.f851r = System.currentTimeMillis();
                    C0039k kVar4 = this.f414G[i].f511g;
                    C0011i iVar3 = kVar4.f832a;
                    float f6 = (iVar3.f313k.f0a + (iVar3.f314l.f59a / 2.0f)) - (this.f414G[i].f511g.f835b.f314l.f59a / 2.0f);
                    this.f414G[i].f511g.f841h = f6;
                    if (kVar != null) {
                        this.f414G[i].f511g.f841h = ((kVar4.f835b.f314l.f59a / 2.0f) + f6) - (kVar.f835b.f313k.f0a + (kVar.f835b.f314l.f59a / 2.0f));
                    }
                    this.f414G[i].f511g.f842i = this.f414G[i].f518n + this.f414G[i].f511g.f835b.f314l.f60b;
                    this.f414G[i].f512h[this.f414G[i].f514j] = this.f414G[i].f511g;
                    if (i == 0) {
                        C0003c cVar = this.f415H.f398x;
                        cVar.f53h = (this.f414G[i].f511g.f839f == 1 ? 1 : 0) + cVar.f53h;
                        C0003c cVar2 = this.f415H.f398x;
                        cVar2.f54i = (this.f414G[i].f511g.f839f == 0 ? 1 : 0) + cVar2.f54i;
                        C0003c cVar3 = this.f415H.f398x;
                        cVar3.f52g = (this.f414G[i].f511g.f839f == 2 ? 1 : 0) + cVar3.f52g;
                    } else {
                        C0003c cVar4 = this.f415H.f399y;
                        cVar4.f53h = (this.f414G[i].f511g.f839f == 1 ? 1 : 0) + cVar4.f53h;
                        C0003c cVar5 = this.f415H.f399y;
                        cVar5.f54i = (this.f414G[i].f511g.f839f == 0 ? 1 : 0) + cVar5.f54i;
                        C0003c cVar6 = this.f415H.f399y;
                        cVar6.f52g = (this.f414G[i].f511g.f839f == 2 ? 1 : 0) + cVar6.f52g;
                    }
                    this.f414G[i].f514j++;
                    if (this.f414G[i].f514j >= 999) {
                        m89d(i);
                        this.f414G[i].f448H = 1;
                    }
                    switch (this.f414G[i].f511g.f839f) {
                        case 0:
                            this.f414G[i].f511g.f817L = 20.0f;
                            this.f414G[i].f511g.f818M = 50.0f;
                            this.f414G[i].f511g.f852s = (float) ((this.f414G[i].f511g.f819N.f32m / 3) * 2);
                            if (kVar != null && kVar.f839f == 1) {
                                this.f414G[i].f511g.f852s = (float) ((this.f414G[i].f511g.f819N.f32m / 3) * 2);
                            }
                            this.f410C[2].mo33a();
                            break;
                        case Base64.ENCODE /*1*/:
                            this.f414G[i].f511g.f817L = 10.0f;
                            this.f414G[i].f511g.f818M = 20.0f;
                            this.f414G[i].f511g.f852s = (float) ((this.f414G[i].f511g.f819N.f32m / 3) * 2);
                            this.f410C[1].mo33a();
                            break;
                        case Base64.GZIP /*2*/:
                            this.f414G[i].f511g.f817L = 30.0f;
                            this.f414G[i].f511g.f818M = 100.0f;
                            this.f414G[i].f511g.f852s = (float) ((this.f414G[i].f511g.f819N.f32m / 8) * 7);
                            if (!(kVar == null || kVar.f839f == 2)) {
                                this.f414G[i].f511g.f852s = (float) ((this.f414G[i].f511g.f819N.f32m / 8) * 7);
                            }
                            this.f410C[3].mo33a();
                            break;
                    }
                    this.f414G[i].f518n += this.f414G[i].f511g.f852s;
                    this.f414G[i].f464X += (int) this.f414G[i].f511g.f817L;
                    this.f417J[i] = true;
                    m91e(i);
                } else if (this.f414G[i].f511g != null) {
                    this.f414G[i].f511g = null;
                }
                this.f414G[i].f511g = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c3 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115b() {
        /*
            r6 = this;
            r5 = 0
            r4 = 1
            r0 = 0
            amazon.android.tsumineko.game.EAGLView r1 = r6.f433w
            javax.microedition.khronos.opengles.GL10 r1 = r1.mo123a()
            if (r1 != 0) goto L_0x0013
            java.lang.String r0 = "AgainstGameMain"
            java.lang.String r1 = "Can Not get GL10"
            android.util.Log.e(r0, r1)
        L_0x0012:
            return
        L_0x0013:
            r2 = 3042(0xbe2, float:4.263E-42)
            r1.glEnable(r2)
            r2 = 770(0x302, float:1.079E-42)
            r3 = 771(0x303, float:1.08E-42)
            r1.glBlendFunc(r2, r3)
            amazon.android.tsumineko.battle.e[] r1 = r6.f414G
            r1 = r1[r0]
            r1.f467a = r0
            amazon.android.tsumineko.battle.e[] r1 = r6.f414G
            r1 = r1[r0]
            long r2 = java.lang.System.currentTimeMillis()
            r1.f470aC = r2
            amazon.android.tsumineko.battle.e[] r1 = r6.f414G
            r1 = r1[r4]
            r1.f467a = r0
            amazon.android.tsumineko.battle.e[] r1 = r6.f414G
            r1 = r1[r4]
            long r2 = java.lang.System.currentTimeMillis()
            r1.f470aC = r2
        L_0x003f:
            java.lang.String[] r1 = f260i
            int r1 = r1.length
            if (r0 >= r1) goto L_0x0012
            amazon.android.a.k[] r1 = r6.f416I
            r1 = r1[r0]
            if (r1 == 0) goto L_0x00c8
            amazon.android.a.k[] r1 = r6.f416I
            r1 = r1[r0]
            int r1 = r1.f350b
            if (r1 == 0) goto L_0x00c8
            amazon.android.a.k[] r1 = r6.f416I     // Catch:{ Exception -> 0x00c7 }
            r1 = r1[r0]     // Catch:{ Exception -> 0x00c7 }
            int r1 = r1.f350b     // Catch:{ Exception -> 0x00c7 }
            boolean r1 = android.opengl.GLES11.glIsTexture(r1)     // Catch:{ Exception -> 0x00c7 }
            if (r1 != 0) goto L_0x0063
            amazon.android.a.k[] r1 = r6.f416I     // Catch:{ Exception -> 0x00c7 }
            r2 = 0
            r1[r0] = r2     // Catch:{ Exception -> 0x00c7 }
        L_0x0063:
            amazon.android.a.k[] r1 = r6.f416I
            r1 = r1[r0]
            if (r1 != 0) goto L_0x00c3
            amazon.android.a.k[] r1 = r6.f416I
            amazon.android.a.k r2 = new amazon.android.a.k
            java.lang.String[] r3 = f260i
            r3 = r3[r0]
            r2.<init>(r3)
            r1[r0] = r2
            amazon.android.a.k[] r1 = r6.f416I
            r1 = r1[r0]
            amazon.android.tsumineko.game.EAGLView r2 = r6.f433w
            android.content.Context r2 = r2.mo128b()
            boolean r1 = r1.mo53a(r2)
            if (r1 == 0) goto L_0x00cd
            amazon.android.tsumineko.game.EAGLView r1 = r6.f433w
            amazon.android.a.f r1 = r1.f531a
            amazon.android.a.k[] r2 = r6.f416I
            r2 = r2[r0]
            boolean r1 = r1.mo25a((amazon.android.p000a.C0013k) r2)
            if (r1 == 0) goto L_0x00bc
            java.lang.String r1 = "GameMain"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Texture gen ok.["
            r2.<init>(r3)
            java.lang.String[] r3 = f260i
            r3 = r3[r0]
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]="
            java.lang.StringBuilder r2 = r2.append(r3)
            amazon.android.a.k[] r3 = r6.f416I
            r3 = r3[r0]
            int r3 = r3.f350b
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
        L_0x00bc:
            amazon.android.a.k[] r1 = r6.f416I
            r1 = r1[r0]
            r1.mo54b()
        L_0x00c3:
            int r0 = r0 + 1
            goto L_0x003f
        L_0x00c7:
            r1 = move-exception
        L_0x00c8:
            amazon.android.a.k[] r1 = r6.f416I
            r1[r0] = r5
            goto L_0x0063
        L_0x00cd:
            java.lang.String r1 = "GameMain"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Texture gen NG.["
            r2.<init>(r3)
            java.lang.String[] r3 = f260i
            r3 = r3[r0]
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: amazon.android.tsumineko.battle.C0018a.mo115b():void");
    }

    /* renamed from: b */
    public final void mo116b(float f, float f2, float f3) {
        this.f424n[0] = (C0006d.f77G * f) + (this.f424n[0] * (1.0f - C0006d.f77G));
        this.f424n[1] = (C0006d.f77G * f2) + (this.f424n[1] * (1.0f - C0006d.f77G));
        this.f424n[2] = (C0006d.f77G * f3) + (this.f424n[2] * (1.0f - C0006d.f77G));
        long currentTimeMillis = System.currentTimeMillis();
        this.f414G[this.f436z].f471aD = ((float) (currentTimeMillis - this.f414G[this.f436z].f470aC)) / 1000.0f;
    }

    /* renamed from: b */
    public final void mo117b(float f, float f2, int i) {
        this.f414G[i].f474aG = 0;
        if (this.f414G[i].f467a == 6) {
            if (this.f414G[i].f509e == 0 && this.f414G[i].f441A == 1) {
                this.f414G[i].f443C = f2;
            }
            if (this.f414G[i].f509e == 2 && this.f414G[i].f510f != null) {
                float f3 = this.f414G[i].f510f.f313k.f0a + this.f414G[i].f510f.f318p;
                float f4 = this.f414G[i].f510f.f313k.f1b + this.f414G[i].f510f.f319q;
                float abs = Math.abs(f3 - f);
                float abs2 = Math.abs(f4 - f2);
                if (abs > 15.0f || abs2 > 15.0f) {
                    float sqrt = (float) Math.sqrt((double) ((abs2 * abs2) + (abs * abs)));
                    if (abs <= 5.0f && f2 <= f4) {
                        this.f414G[i].f510f.f324v -= sqrt;
                        if (this.f414G[i].f510f.f324v < 15.0f) {
                            this.f414G[i].f510f.f324v = 15.0f;
                        }
                    } else if (this.f414G[i].f510f.f324v < sqrt) {
                        this.f414G[i].f510f.f324v = sqrt;
                    }
                }
                if (this.f414G[i].f510f.f324v > 45.0f) {
                    this.f414G[i].f510f.f324v = 45.0f;
                }
                float f5 = 0.0f;
                if (f > 700.0f) {
                    f5 = ((f - 700.0f) / 60.0f) * 70.0f;
                }
                this.f414G[i].f510f.mo44b((f - this.f414G[i].f510f.f318p) + f5, f2 - this.f414G[i].f510f.f319q);
                this.f414G[i].f466Z.mo44b(f - this.f414G[i].f466Z.f318p, f2 - this.f414G[i].f466Z.f319q);
                this.f414G[i].f468aA.mo44b(f5 + (f - this.f414G[i].f468aA.f318p), f2 - this.f414G[i].f468aA.f319q);
                if (this.f414G[i].f514j > 0) {
                    C0039k kVar = this.f414G[i].f511g;
                    C0039k kVar2 = this.f414G[i].f512h[this.f414G[i].f514j - 1];
                    C0002b bVar = this.f414G[i].f511g.f819N;
                    C0011i iVar = kVar.f832a;
                    float f6 = kVar.f816K - kVar.f815J;
                    float f7 = iVar.f314l.f60b / 2.0f;
                    float f8 = ((iVar.f314l.f59a / 2.0f) - (((float) bVar.f31l) / 2.0f)) + iVar.f313k.f0a + kVar.f815J;
                    float f9 = iVar.f313k.f1b + f7;
                    float f10 = kVar2.f807B.f60b / 2.0f;
                    float f11 = kVar2.f806A.f0a + kVar2.f813H;
                    float f12 = kVar2.f806A.f1b - 50.0f;
                    if (f8 >= (((float) kVar2.f819N.f31l) / 2.0f) + f11 || f8 + f6 <= f11 || f9 >= f12 + f10 || f9 + f7 <= f12 || kVar2.f858y != 0 || this.f414G[i].f445E != 0) {
                        iVar.f315m = 1.0f;
                        kVar.f845l = 0;
                        return;
                    }
                    iVar.f315m = 0.5f;
                    kVar.f845l = 1;
                    return;
                }
                C0039k kVar3 = this.f414G[i].f511g;
                C0011i iVar2 = kVar3.f832a;
                C0011i iVar3 = kVar3.f832a;
                float f13 = iVar2.f314l.f59a;
                float f14 = iVar2.f314l.f60b / 2.0f;
                float f15 = iVar2.f313k.f0a;
                float f16 = iVar2.f313k.f1b + f14;
                float f17 = iVar3.f314l.f59a;
                float f18 = iVar3.f314l.f60b;
                float f19 = 400.0f - (f17 / 2.0f);
                float f20 = 1280.0f - f18;
                if (f15 >= f17 + f19 || f13 + f15 <= f19 || f16 >= f18 + f20 || f16 + f14 <= f20) {
                    iVar2.f315m = 1.0f;
                    kVar3.f845l = 0;
                    return;
                }
                iVar2.f315m = 0.5f;
                kVar3.f845l = 1;
            }
        }
    }

    /* renamed from: c */
    public final void mo118c() {
        GL10 a = this.f433w.mo123a();
        if (!this.f415H.f380C) {
            a.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            a.glClear(16384);
            this.f433w.mo125a(1);
            m95g(1);
            this.f433w.mo125a(0);
            m95g(0);
            f405Q = 0;
        }
    }

    /* renamed from: d */
    public final void mo119d() {
        GL10 a = this.f433w.mo123a();
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 300; i2++) {
                if (this.f414G[i].f507c[i2] != null) {
                    this.f414G[i].f507c[i2].mo40a();
                    this.f414G[i].f507c[i2] = null;
                }
            }
        }
        for (int i3 = 0; i3 < 2; i3++) {
            for (int i4 = 0; i4 < 1000; i4++) {
                if (this.f414G[i3].f508d[i4] != null) {
                    this.f414G[i3].f508d[i4].mo40a();
                    this.f414G[i3].f508d[i4] = null;
                }
            }
        }
        if (this.f412E != null) {
            this.f412E.mo40a();
            this.f412E = null;
        }
        for (int i5 = 0; i5 < 170; i5++) {
            if (this.f411D[i5] != null) {
                this.f411D[i5].mo45a();
                this.f411D[i5] = null;
            }
        }
        if (this.f408A != null) {
            this.f408A.mo157a();
            this.f408A = null;
        }
        for (int i6 = 0; i6 < f407m; i6++) {
            if (this.f409B[i6] != null) {
                this.f409B[i6].mo45a();
                this.f409B[i6] = null;
            }
        }
        if (this.f414G[0].f510f != null) {
            this.f414G[0].f510f.mo40a();
            this.f414G[0].f510f = null;
        }
        if (this.f414G[1].f510f != null) {
            this.f414G[1].f510f.mo40a();
            this.f414G[1].f510f = null;
        }
        if (this.f414G[0].f511g != null) {
            this.f414G[0].f511g = null;
        }
        if (this.f414G[1].f511g != null) {
            this.f414G[1].f511g = null;
        }
        if (this.f416I != null) {
            for (int i7 = 0; i7 < this.f416I.length; i7++) {
                if (this.f416I[i7] != null) {
                    a.glDeleteTextures(1, new int[]{this.f416I[i7].f350b}, 0);
                }
            }
        }
        if (this.f421N != null) {
            this.f421N.clear();
            this.f421N = null;
        }
        this.f415H.mo92b();
        Log.e("AgainstGameMain", "release ok.");
    }
}
