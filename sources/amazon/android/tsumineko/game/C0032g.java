package amazon.android.tsumineko.game;

import amazon.android.p000a.C0000a;
import amazon.android.p000a.C0004b;
import amazon.android.p000a.C0006d;
import amazon.android.p000a.C0010h;
import amazon.android.p000a.C0011i;
import amazon.android.p000a.C0012j;
import amazon.android.p000a.C0013k;
import amazon.android.p000a.p001a.C0002b;
import amazon.android.tsumineko.TsumiNekoPadAppDelegate;
import amazon.android.tsumineko.game.p002a.C0024a;
import amazon.android.tsumineko.game.p002a.C0025b;
import amazon.android.tsumineko.game.p002a.C0026c;
import android.util.Log;
import java.util.Calendar;
import java.util.HashMap;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: amazon.android.tsumineko.game.g */
public final class C0032g extends C0036h {

    /* renamed from: A */
    C0011i f592A = new C0011i();

    /* renamed from: B */
    C0011i f593B = new C0011i();

    /* renamed from: C */
    C0011i f594C = new C0011i();

    /* renamed from: D */
    C0011i f595D = new C0011i();

    /* renamed from: E */
    C0011i f596E = new C0011i();

    /* renamed from: F */
    C0011i f597F = new C0011i();

    /* renamed from: G */
    C0011i f598G = new C0011i();

    /* renamed from: H */
    C0011i f599H = new C0011i();

    /* renamed from: I */
    C0011i f600I = new C0011i();

    /* renamed from: J */
    C0011i f601J = new C0011i();

    /* renamed from: K */
    C0011i f602K = new C0011i();

    /* renamed from: L */
    C0011i f603L = new C0011i();

    /* renamed from: M */
    C0011i f604M = new C0011i();

    /* renamed from: N */
    C0011i f605N = new C0011i();

    /* renamed from: O */
    C0011i f606O = new C0011i();

    /* renamed from: P */
    C0011i f607P = new C0011i();

    /* renamed from: Q */
    C0011i f608Q = new C0011i();

    /* renamed from: R */
    C0011i f609R = new C0011i();

    /* renamed from: S */
    C0011i f610S = new C0011i();

    /* renamed from: T */
    C0011i[] f611T = new C0011i[5];

    /* renamed from: U */
    C0011i f612U = new C0011i();

    /* renamed from: V */
    C0011i[] f613V = new C0011i[119];

    /* renamed from: W */
    C0026c f614W = new C0026c();

    /* renamed from: X */
    C0039k[] f615X = new C0039k[1000];

    /* renamed from: Y */
    int f616Y;

    /* renamed from: Z */
    int f617Z;

    /* renamed from: aA */
    int f618aA;

    /* renamed from: aB */
    long f619aB;

    /* renamed from: aC */
    float f620aC;

    /* renamed from: aD */
    int f621aD;

    /* renamed from: aE */
    int f622aE;

    /* renamed from: aF */
    long f623aF;

    /* renamed from: aG */
    long f624aG;

    /* renamed from: aH */
    long f625aH;

    /* renamed from: aI */
    long f626aI;

    /* renamed from: aJ */
    int f627aJ;

    /* renamed from: aK */
    int f628aK;

    /* renamed from: aL */
    int f629aL;

    /* renamed from: aM */
    long f630aM;

    /* renamed from: aN */
    float f631aN;

    /* renamed from: aO */
    float f632aO;

    /* renamed from: aP */
    float f633aP;

    /* renamed from: aQ */
    float f634aQ;

    /* renamed from: aR */
    int f635aR;

    /* renamed from: aS */
    float f636aS;

    /* renamed from: aT */
    int f637aT;

    /* renamed from: aU */
    int f638aU;

    /* renamed from: aV */
    float f639aV;

    /* renamed from: aW */
    float f640aW;

    /* renamed from: aX */
    EAGLView f641aX;

    /* renamed from: aY */
    float f642aY;

    /* renamed from: aZ */
    float f643aZ;

    /* renamed from: aa */
    int f644aa;

    /* renamed from: ab */
    int f645ab;

    /* renamed from: ac */
    int f646ac;

    /* renamed from: ad */
    int f647ad;

    /* renamed from: ae */
    int f648ae;

    /* renamed from: af */
    int f649af;

    /* renamed from: ag */
    int f650ag;

    /* renamed from: ah */
    int f651ah;

    /* renamed from: ai */
    long f652ai;

    /* renamed from: aj */
    float f653aj;

    /* renamed from: ak */
    float f654ak;

    /* renamed from: al */
    float f655al;

    /* renamed from: am */
    float f656am;

    /* renamed from: an */
    float f657an;

    /* renamed from: ao */
    float f658ao;

    /* renamed from: ap */
    float f659ap;

    /* renamed from: aq */
    float f660aq;

    /* renamed from: ar */
    int f661ar;

    /* renamed from: as */
    long f662as;

    /* renamed from: at */
    float f663at;

    /* renamed from: au */
    long f664au;

    /* renamed from: av */
    int f665av;

    /* renamed from: aw */
    int f666aw;

    /* renamed from: ax */
    float f667ax;

    /* renamed from: ay */
    float f668ay;

    /* renamed from: az */
    long f669az;

    /* renamed from: ba */
    float f670ba;

    /* renamed from: bb */
    int f671bb;

    /* renamed from: bc */
    long[] f672bc = new long[2];

    /* renamed from: bd */
    long f673bd;

    /* renamed from: be */
    boolean f674be;

    /* renamed from: bf */
    boolean f675bf;

    /* renamed from: bg */
    C0012j f676bg;

    /* renamed from: bh */
    int f677bh;

    /* renamed from: bi */
    C0012j[] f678bi = new C0012j[6];

    /* renamed from: bj */
    int f679bj;

    /* renamed from: bk */
    float f680bk;

    /* renamed from: bl */
    int f681bl;

    /* renamed from: bm */
    TsumiNekoPadAppDelegate f682bm;

    /* renamed from: bn */
    C0013k[] f683bn = new C0013k[f260i.length];

    /* renamed from: bo */
    int f684bo = 0;

    /* renamed from: bp */
    long f685bp = 0;

    /* renamed from: bq */
    long f686bq = 0;

    /* renamed from: br */
    private HashMap f687br = new HashMap();

    /* renamed from: bs */
    private C0012j[] f688bs = new C0012j[170];

    /* renamed from: bt */
    private C0010h[] f689bt;

    /* renamed from: l */
    C0011i[] f690l = new C0011i[300];

    /* renamed from: m */
    C0011i[] f691m = new C0011i[1000];

    /* renamed from: n */
    C0025b f692n;

    /* renamed from: o */
    float[] f693o = new float[3];

    /* renamed from: p */
    int f694p;

    /* renamed from: q */
    long f695q;

    /* renamed from: r */
    C0011i f696r = new C0011i();

    /* renamed from: s */
    C0011i f697s = new C0011i();

    /* renamed from: t */
    C0011i f698t = new C0011i();

    /* renamed from: u */
    C0024a f699u = new C0024a();

    /* renamed from: v */
    C0011i f700v = new C0011i();

    /* renamed from: w */
    C0011i f701w = new C0011i();

    /* renamed from: x */
    C0011i f702x = new C0011i();

    /* renamed from: y */
    C0011i f703y = new C0011i();

    /* renamed from: z */
    C0011i f704z = new C0011i();

    public C0032g(EAGLView eAGLView, TsumiNekoPadAppDelegate tsumiNekoPadAppDelegate) {
        this.f641aX = eAGLView;
        this.f682bm = tsumiNekoPadAppDelegate;
    }

    /* renamed from: a */
    private void m140a(float f) {
        float f2;
        float f3;
        float sin;
        float f4;
        C0000a aVar;
        C0039k kVar = null;
        int i = 0;
        float f5 = 0.0f;
        while (i < this.f617Z) {
            C0039k kVar2 = this.f615X[i];
            float f6 = kVar2.f834ab;
            C0011i iVar = kVar2.f835b;
            if (kVar != null) {
                f2 = -kVar2.f841h;
                f3 = kVar.f852s;
            } else {
                f2 = 0.0f;
                f3 = 0.0f;
            }
            if (kVar != null) {
                f4 = (float) Math.cos((double) (kVar.f834ab / -36.0f));
                sin = (float) Math.sin((double) (kVar.f834ab / -36.0f));
            } else {
                float cos = (float) Math.cos((double) (f5 / -36.0f));
                sin = (float) Math.sin((double) (f5 / -36.0f));
                f4 = cos;
            }
            float f7 = (f2 * f4) - (f3 * sin);
            float f8 = (sin * f2) + (f4 * f3);
            float f9 = f7 - f2;
            float f10 = f8 - f3;
            C0004b bVar = iVar.f314l;
            if (kVar == null) {
                aVar = ((double) this.f657an) != 1.0d ? new C0000a(kVar2.f841h + f9, (1280.0f - kVar2.f842i) + ((1.0f - this.f658ao) * f) + f10) : new C0000a(kVar2.f841h + f9, (1280.0f - kVar2.f842i) + f + f10);
                kVar2.f859z = new C0000a(f9 + kVar2.f841h, f10 + (1280.0f - kVar2.f842i) + f);
                if (this.f661ar == 0) {
                    kVar2.f843j = kVar2.f859z.f0a;
                    kVar2.f844k = (1280.0f - kVar2.f859z.f1b) + f;
                }
            } else {
                C0000a aVar2 = new C0000a(((kVar.f835b.f313k.f0a + (kVar.f835b.f314l.f59a * 0.5f)) - f7) - (kVar2.f835b.f314l.f59a * 0.5f), ((kVar.f835b.f314l.f60b + kVar.f835b.f313k.f1b) - f8) - kVar2.f835b.f314l.f60b);
                kVar2.f859z = aVar2;
                if (this.f661ar == 0) {
                    kVar2.f843j = kVar2.f859z.f0a;
                    kVar2.f844k = (1280.0f - kVar2.f859z.f1b) + f;
                }
                aVar = aVar2;
            }
            iVar.f313k = aVar;
            kVar2.f806A = aVar;
            kVar2.f807B = bVar;
            kVar2.f808C = iVar.f326x;
            kVar2.f809D = iVar.f327y;
            kVar2.f810E = iVar.f328z;
            i++;
            kVar = kVar2;
            f5 = f6;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m141a(long r16) {
        /*
            r15 = this;
            amazon.android.tsumineko.game.EAGLView r0 = r15.f641aX
            javax.microedition.khronos.opengles.GL10 r4 = r0.mo123a()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4.glColor4f(r0, r1, r2, r3)
            int r0 = r15.f694p
            r1 = 6
            if (r0 != r1) goto L_0x001e
            r1 = 0
            int r0 = r15.f617Z
            int r0 = r0 + -1
            r2 = r0
        L_0x001c:
            if (r2 >= 0) goto L_0x001f
        L_0x001e:
            return
        L_0x001f:
            amazon.android.tsumineko.game.k[] r0 = r15.f615X
            r3 = r0[r2]
            amazon.android.a.i r0 = r3.f835b
            amazon.android.a.j r0 = r0.f304b
            int r5 = r3.f812G
            r6 = 1
            if (r5 != r6) goto L_0x0048
            long r5 = r3.f811F
            long r5 = r16 - r5
            float r5 = (float) r5
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 / r6
            r6 = 1048576000(0x3e800000, float:0.25)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x012d
            amazon.android.a.i r5 = r3.f836c
            if (r5 == 0) goto L_0x0048
            amazon.android.a.i r5 = r3.f836c
            amazon.android.a.j r5 = r5.f304b
            if (r5 == 0) goto L_0x0048
            amazon.android.a.i r0 = r3.f836c
            amazon.android.a.j r0 = r0.f304b
        L_0x0048:
            if (r1 == 0) goto L_0x005d
            long r5 = r1.f851r
            long r5 = r16 - r5
            float r5 = (float) r5
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 / r6
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x005d
            int r1 = r1.f839f
            switch(r1) {
                case 0: goto L_0x0136;
                case 1: goto L_0x0142;
                case 2: goto L_0x0145;
                default: goto L_0x005d;
            }
        L_0x005d:
            r1 = r0
        L_0x005e:
            amazon.android.a.b r5 = r3.f807B
            amazon.android.a.a r6 = r3.f806A
            float r7 = r3.f808C
            float r8 = r3.f809D
            float r9 = r3.f810E
            float r10 = r3.f848o
            int r0 = r3.f858y
            if (r0 != 0) goto L_0x0127
            r0 = 1
            amazon.android.a.a r11 = r3.f806A
            if (r11 != 0) goto L_0x0086
            amazon.android.a.a r11 = r3.f806A
            float r11 = r11.f0a
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x0086
            amazon.android.a.a r11 = r3.f806A
            float r11 = r11.f1b
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x0086
            r0 = 0
        L_0x0086:
            float r11 = r15.f657an
            r12 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x0099
            amazon.android.a.a r11 = r3.f806A
            float r11 = r11.f1b
            r12 = 1151336448(0x44a00000, float:1280.0)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0099
            r0 = 0
        L_0x0099:
            r11 = 1
            if (r0 != r11) goto L_0x0127
            r4.glPushMatrix()
            float r0 = r15.f657an
            double r11 = (double) r0
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0151
            r0 = 0
            r11 = -996147200(0xffffffffc4a00000, float:-1280.0)
            r12 = 1065353216(0x3f800000, float:1.0)
            float r13 = r15.f657an
            float r12 = r12 - r13
            float r11 = r11 * r12
            r12 = 0
            r4.glTranslatef(r0, r11, r12)
            float r0 = r15.f657an
            float r11 = r15.f657an
            r12 = 1065353216(0x3f800000, float:1.0)
            r4.glScalef(r0, r11, r12)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r11 = r15.f657an
            float r0 = r0 - r11
            r11 = 1145569280(0x44480000, float:800.0)
            float r12 = r15.f657an
            float r11 = r11 / r12
            r12 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r12
            float r0 = r0 * r11
            r11 = 1145569280(0x44480000, float:800.0)
            float r12 = r15.f657an
            float r11 = r11 / r12
            r12 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r12
            float r0 = r0 + r11
            r11 = 1145569280(0x44480000, float:800.0)
            float r12 = r15.f657an
            float r11 = r11 / r12
            r12 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r12
            float r12 = r5.f59a
            r13 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r13
            float r11 = r11 - r12
            float r0 = r0 - r11
            float r11 = r6.f0a
            float r0 = r0 + r11
            float r11 = r15.f639aV
            float r0 = r0 + r11
            float r0 = r0 - r7
            r11 = 1151336448(0x44a00000, float:1280.0)
            float r12 = r15.f657an
            float r11 = r11 / r12
            r12 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r12
            r12 = 1151336448(0x44a00000, float:1280.0)
            float r13 = r15.f657an
            float r12 = r12 / r13
            r13 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r13
            float r5 = r5.f60b
            r13 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r13
            float r5 = r12 - r5
            float r5 = r5 + r11
            float r6 = r6.f1b
            float r5 = r5 - r6
            float r5 = r5 - r8
            r6 = 0
            float r6 = r6 - r9
            r4.glTranslatef(r0, r5, r6)
            r0 = 0
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r4.glRotatef(r10, r0, r5, r6)
            r4.glTranslatef(r7, r8, r9)
        L_0x0116:
            r0 = 1065353216(0x3f800000, float:1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 1065353216(0x3f800000, float:1.0)
            r4.glColor4f(r0, r5, r6, r7)
            r1.mo50b()
            r4.glPopMatrix()
        L_0x0127:
            int r0 = r2 + -1
            r2 = r0
            r1 = r3
            goto L_0x001c
        L_0x012d:
            r5 = 0
            r3.f812G = r5
            r5 = 0
            r3.f811F = r5
            goto L_0x0048
        L_0x0136:
            int r1 = r3.f839f
            r5 = 1
            if (r1 != r5) goto L_0x005d
            amazon.android.a.i r0 = r3.f836c
            amazon.android.a.j r0 = r0.f304b
            r1 = r0
            goto L_0x005e
        L_0x0142:
            r1 = r0
            goto L_0x005e
        L_0x0145:
            int r1 = r3.f839f
            r5 = 2
            if (r1 == r5) goto L_0x005d
            amazon.android.a.i r0 = r3.f836c
            amazon.android.a.j r0 = r0.f304b
            r1 = r0
            goto L_0x005e
        L_0x0151:
            r0 = 1137180672(0x43c80000, float:400.0)
            r11 = 1137180672(0x43c80000, float:400.0)
            float r12 = r5.f59a
            r13 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r13
            float r11 = r11 - r12
            float r0 = r0 - r11
            float r11 = r6.f0a
            float r0 = r0 + r11
            float r11 = r15.f639aV
            float r0 = r0 + r11
            float r0 = r0 - r7
            r11 = 1142947840(0x44200000, float:640.0)
            r12 = 1142947840(0x44200000, float:640.0)
            float r5 = r5.f60b
            r13 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r13
            float r5 = r12 - r5
            float r5 = r5 + r11
            float r6 = r6.f1b
            float r5 = r5 - r6
            float r5 = r5 - r8
            r6 = 0
            float r6 = r6 - r9
            r4.glTranslatef(r0, r5, r6)
            r0 = 0
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r4.glRotatef(r10, r0, r5, r6)
            r4.glTranslatef(r7, r8, r9)
            goto L_0x0116
        */
        throw new UnsupportedOperationException("Method not decompiled: amazon.android.tsumineko.game.C0032g.m141a(long):void");
    }

    /* renamed from: a */
    private void m142a(C0011i iVar, float f, float f2) {
        GL10 a = this.f641aX.mo123a();
        C0012j jVar = iVar.f304b;
        C0004b bVar = iVar.f314l;
        C0000a aVar = ((double) this.f657an) != 1.0d ? new C0000a(iVar.f318p, (1280.0f - iVar.f313k.f1b) + ((1.0f - this.f658ao) * f2) + 0.0f) : new C0000a(iVar.f318p, (1280.0f - iVar.f313k.f1b) + f2 + 0.0f);
        float f3 = iVar.f321s;
        a.glPushMatrix();
        if (((double) this.f657an) != 1.0d) {
            a.glScalef(this.f657an, this.f657an, 1.0f);
        }
        float f4 = (800.0f / this.f657an) / 2.0f;
        a.glTranslatef(((((1.0f - this.f657an) * f4) + f4) - (f4 - (bVar.f59a / 2.0f))) + aVar.f0a + f, (iVar.f313k.f1b - aVar.f1b) - 1280.0f, 0.0f);
        a.glRotatef(f3, 0.0f, 0.0f, 1.0f);
        a.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        jVar.mo47a(21.5946f, 21.5946f);
        a.glPopMatrix();
    }

    /* renamed from: b */
    private void m143b(float f) {
        float f2;
        float f3;
        float f4;
        int i = this.f657an != 0.0f ? (int) ((1.0f / this.f657an) + 2.0f) : 2;
        if (((double) this.f657an) == 1.0d) {
            i = 2;
        }
        C0011i[] iVarArr = {this.f704z, this.f592A};
        C0011i[] iVarArr2 = {this.f593B, this.f594C};
        C0011i[] iVarArr3 = {this.f700v, this.f701w, this.f702x, this.f703y};
        C0011i[] iVarArr4 = {this.f595D, this.f596E, this.f597F, this.f607P, this.f598G, this.f599H, this.f600I, this.f601J, this.f602K, this.f603L, this.f604M, this.f605N, this.f606O};
        GL10 a = this.f641aX.mo123a();
        a.glScalef(1.0f, 1.0f, 1.0f);
        a.glTranslatef(0.0f, 0.0f, 0.0f);
        a.glPushMatrix();
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < iVarArr.length; i3++) {
                C0000a aVar = new C0000a(iVarArr[i3].f318p, iVarArr[i3].f319q + ((float) (i3 * 3)));
                iVarArr[i3].f318p = aVar.f0a - ((float) (i2 * 800));
                m142a(iVarArr[i3], this.f639aV, f);
                iVarArr[i3].f318p = aVar.f0a;
            }
            for (int i4 = 0; i4 < iVarArr2.length; i4++) {
                C0000a aVar2 = new C0000a(iVarArr2[i4].f318p, iVarArr2[i4].f319q + ((float) (i4 * 3)));
                iVarArr2[i4].f318p = aVar2.f0a + ((float) (i2 * 800));
                m142a(iVarArr2[i4], this.f639aV, f);
                iVarArr2[i4].f318p = aVar2.f0a;
            }
        }
        a.glPopMatrix();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= iVarArr3.length) {
                break;
            }
            C0011i iVar = iVarArr3[i6];
            float f5 = this.f639aV;
            GL10 a2 = this.f641aX.mo123a();
            C0012j jVar = iVar.f304b;
            C0004b bVar = iVar.f314l;
            C0000a aVar3 = ((double) this.f657an) != 1.0d ? new C0000a(iVar.f313k.f0a, (1280.0f - iVar.f313k.f1b) + ((1.0f - this.f658ao) * f)) : new C0000a(iVar.f313k.f0a, (1280.0f - iVar.f313k.f1b) + f);
            a2.glPushMatrix();
            if (((double) this.f657an) != 1.0d) {
                a2.glScalef(this.f657an, this.f657an, 1.0f);
                f2 = f5 + ((((1.0f - this.f657an) * ((800.0f / this.f657an) / 2.0f)) + ((800.0f / this.f657an) / 2.0f)) - (((800.0f / this.f657an) / 2.0f) - (bVar.f59a / 2.0f))) + aVar3.f0a + (bVar.f59a / 2.0f);
                f3 = iVar.f313k.f1b;
                f4 = aVar3.f1b;
            } else {
                f2 = f5 + iVar.f313k.f0a + bVar.f59a;
                f3 = iVar.f313k.f1b;
                f4 = aVar3.f1b;
            }
            a2.glTranslatef(f2, f3 - f4, 0.0f);
            a2.glRotatef(iVar.f321s, 0.0f, 0.0f, 1.0f);
            a2.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            jVar.mo47a(5.0f, 5.3853197f);
            a2.glPopMatrix();
            i5 = i6 + 1;
        }
        if (this.f684bo < 8) {
            this.f607P.f322t = 2.0f;
        }
        for (C0011i iVar2 : iVarArr4) {
            float f6 = this.f639aV;
            GL10 a3 = this.f641aX.mo123a();
            float f7 = (float) ((int) (((double) f6) + 0.5d));
            float f8 = 1280.0f + f + iVar2.f304b.f330b;
            if (this.f661ar != 0 || (iVar2.f319q <= f8 + iVar2.f304b.f330b && iVar2.f319q >= f)) {
                iVar2.f313k = new C0000a(iVar2.f313k.f0a, iVar2.f313k.f1b);
                C0012j jVar2 = iVar2.f304b;
                float f9 = iVar2.f321s;
                float f10 = iVar2.f322t;
                C0004b bVar2 = iVar2.f314l;
                a3.glPushMatrix();
                if (((double) this.f657an) != 1.0d) {
                    C0000a aVar4 = new C0000a(iVar2.f313k.f0a, (1280.0f - iVar2.f313k.f1b) + ((1.0f - this.f658ao) * f));
                    a3.glTranslatef(0.0f, -1280.0f * (1.0f - this.f657an), 0.0f);
                    a3.glScalef(this.f657an, this.f657an, 1.0f);
                    a3.glTranslatef(((((1.0f - this.f657an) * ((800.0f / this.f657an) / 2.0f)) + ((800.0f / this.f657an) / 2.0f)) - (((800.0f / this.f657an) / 2.0f) - (bVar2.f59a / 2.0f))) + aVar4.f0a + f7, (((1280.0f / this.f657an) / 2.0f) + (((1280.0f / this.f657an) / 2.0f) - (bVar2.f60b / 2.0f))) - aVar4.f1b, 0.0f);
                    a3.glRotatef(f9, 0.0f, 0.0f, 1.0f);
                } else {
                    C0000a aVar5 = new C0000a(iVar2.f313k.f0a, (1280.0f - iVar2.f313k.f1b) + f);
                    a3.glTranslatef((400.0f - (400.0f - (bVar2.f59a / 2.0f))) + aVar5.f0a + f7, (640.0f + (640.0f - (bVar2.f60b / 2.0f))) - aVar5.f1b, 0.0f);
                    a3.glRotatef(f9, 0.0f, 0.0f, 1.0f);
                }
                a3.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                if (f10 == 1.0f) {
                    jVar2.mo50b();
                } else {
                    jVar2.mo46a(f10);
                }
                a3.glPopMatrix();
            }
        }
    }

    /* renamed from: c */
    private C0011i m144c(int i) {
        float f = this.f688bs[i].f329a;
        float f2 = this.f688bs[i].f330b;
        C0011i iVar = new C0011i();
        iVar.mo41a(this.f688bs[i], i, 1, 0, new C0000a(0.0f, 0.0f), C0004b.m16a(f, f2), 0.0f, 0.0f);
        return iVar;
    }

    /* renamed from: i */
    private void m145i() {
        boolean z = true;
        Log.e("GameMain", "intializeGameWork start.");
        for (int i = 0; i < 300; i++) {
            if (this.f690l[i] == null) {
                this.f690l[i] = new C0011i();
            }
            if (this.f690l[i] != null) {
                this.f690l[i].f316n = 0;
            }
        }
        this.f693o[0] = 0.0f;
        this.f693o[1] = 0.0f;
        this.f693o[2] = 0.0f;
        if (this.f614W != null) {
            this.f614W.f583c = 0;
            this.f614W.mo161a();
        }
        this.f616Y = 0;
        this.f617Z = 0;
        this.f644aa = 0;
        this.f645ab = 0;
        this.f646ac = 0;
        this.f647ad = 0;
        this.f648ae = 0;
        this.f649af = 0;
        this.f650ag = 0;
        this.f651ah = 0;
        this.f652ai = 0;
        this.f653aj = 63.0f;
        this.f654ak = 0.0f;
        this.f655al = 0.0f;
        this.f656am = 0.0f;
        this.f657an = 1.0f;
        this.f658ao = 0.0f;
        this.f659ap = 0.0f;
        this.f660aq = 0.0f;
        this.f661ar = 0;
        this.f662as = 0;
        this.f663at = 0.0f;
        this.f664au = 0;
        this.f665av = 0;
        this.f666aw = 0;
        this.f667ax = 0.0f;
        this.f668ay = 0.0f;
        this.f669az = 0;
        this.f618aA = 0;
        this.f619aB = 0;
        this.f620aC = 0.0f;
        this.f621aD = 0;
        this.f622aE = 0;
        this.f626aI = 0;
        this.f627aJ = 0;
        this.f628aK = 0;
        this.f633aP = 0.0f;
        this.f634aQ = 0.0f;
        this.f635aR = 0;
        this.f636aS = 0.0f;
        this.f632aO = 0.0f;
        this.f637aT = 0;
        this.f623aF = 0;
        this.f624aG = 0;
        this.f625aH = 0;
        for (int i2 = 0; i2 < 1000; i2++) {
            if (this.f691m[i2] == null) {
                this.f691m[i2] = new C0011i();
            }
            this.f691m[i2].f316n = 0;
        }
        if (this.f629aL == 1) {
            this.f650ag = 0;
            this.f651ah = 0;
        }
        for (int i3 = 0; i3 < 1000; i3++) {
            if (this.f615X[i3] != null) {
                this.f615X[i3] = null;
            }
        }
        for (int i4 = 0; i4 < 300; i4++) {
            this.f690l[i4] = null;
        }
        this.f654ak = 0.0f;
        this.f655al = 0.0f;
        this.f656am = 0.0f;
        this.f657an = 1.0f;
        this.f653aj = 63.0f;
        this.f631aN = 160.0f;
        HashMap hashMap = this.f682bm.f386l;
        if (hashMap != null) {
            if (hashMap.containsKey("hand")) {
                this.f674be = ((Integer) hashMap.get("hand")).intValue() == 1;
            }
            if (hashMap.containsKey("zoom")) {
                if (((Integer) hashMap.get("zoom")).intValue() != 1) {
                    z = false;
                }
                this.f675bf = z;
            }
        }
        C0031f.m137a();
        this.f679bj = 0;
        this.f694p = 0;
        this.f638aU = 0;
        Log.e("GameMain", "intializeGameWork end.");
    }

    /* renamed from: j */
    private boolean m146j() {
        C0038j[] jVarArr = {mo216a(this.f688bs[4], this.f700v, 0, 5120, 400, 1280), mo216a(this.f688bs[5], this.f701w, 0, 3840, 400, 1280), mo216a(this.f688bs[7], this.f702x, 0, 2560, 400, 1280), mo216a(this.f688bs[8], this.f703y, 0, 1280, 400, 1280), mo216a(this.f688bs[25], this.f704z, -900, 2560, 200, 1280), mo216a(this.f688bs[26], this.f592A, -900, 5120, 200, 1280), mo216a(this.f688bs[25], this.f593B, 1500, 2560, 200, 1280), mo216a(this.f688bs[26], this.f594C, 1500, 5120, 200, 1280), mo216a(this.f688bs[10], this.f595D, 0, this.f688bs[10].f336h, 800, this.f688bs[10].f336h), mo215a(this.f688bs[11], this.f596E, m171a(7), m174b(1362)), mo215a(this.f688bs[12], this.f597F, m171a(6), m174b(1853)), mo215a(this.f688bs[13], this.f598G, m171a(3), m174b(2155)), mo215a(this.f688bs[14], this.f599H, m171a(115), m174b(2820)), mo215a(this.f688bs[15], this.f600I, m171a(176), m174b(2893)), mo215a(this.f688bs[16], this.f601J, m171a(24), m174b(3024)), mo215a(this.f688bs[17], this.f602K, m171a(187), m174b(3080)), mo215a(this.f688bs[18], this.f603L, m171a(133), m174b(3140)), mo215a(this.f688bs[19], this.f604M, m171a(13), m174b(4244)), mo215a(this.f688bs[20], this.f605N, m171a(66), m174b(4554)), mo215a(this.f688bs[21], this.f606O, m171a(78), m174b(4757)), mo215a(this.f688bs[22], this.f607P, m171a(82), m174b(3028)), mo215a(this.f688bs[31], this.f698t, m171a(240), m174b(13)), mo215a(this.f699u.mo154a(0, 0), this.f699u, m171a(252), m174b(70)), mo215a(this.f688bs[27], this.f608Q, m171a(17), m174b(16)), mo215a(this.f688bs[1], this.f697s, m171a(0), m174b(0)), mo215a(this.f688bs[30], this.f612U, m171a(0), m174b(0)), mo216a(this.f688bs[28], this.f696r, m171a(0), m174b(0), 853, 1280), new C0038j(this, (C0012j) null, (C0000a) null, (C0004b) null, (C0011i) null)};
        int i = 0;
        while (true) {
            int i2 = i;
            if (jVarArr[i2].f801b == null) {
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 >= 1000) {
                        Log.e("GameMain", "loadSpriteInit end.");
                        return true;
                    }
                    C0011i iVar = new C0011i();
                    iVar.mo41a((C0012j) null, 0, 0, 2, new C0000a(0.0f, 0.0f), C0004b.m16a(0.0f, 0.0f), 0.0f, 0.0f);
                    this.f691m[i4] = iVar;
                    i3 = i4 + 1;
                }
            } else {
                C0011i iVar2 = jVarArr[i2].f804e;
                if (iVar2 == null) {
                    if (this.f638aU != 1) {
                        this.f641aX.f539i.sendMessage(this.f641aX.f539i.obtainMessage(0));
                        this.f638aU = 1;
                    }
                    return false;
                }
                C0000a aVar = this.f674be ? (jVarArr[i2].f804e == this.f698t || jVarArr[i2].f804e == this.f699u || jVarArr[i2].f804e == this.f608Q) ? new C0000a(800.0f - (jVarArr[i2].f802c.f0a + jVarArr[i2].f803d.f59a), jVarArr[i2].f802c.f1b) : jVarArr[i2].f802c : jVarArr[i2].f802c;
                iVar2.mo41a(jVarArr[i2].f801b, 0, 1, jVarArr[i2].f800a, aVar, jVarArr[i2].f803d, aVar.f0a, aVar.f1b);
                Log.e("GameMain", "loadSpriteInit set[" + i2 + "]");
                this.f690l[i2] = iVar2;
                jVarArr[i2].f804e = iVar2;
                i = i2 + 1;
            }
        }
    }

    /* renamed from: k */
    private void m147k() {
        int i = 21;
        int i2 = -10;
        int i3 = 0;
        this.f650ag = m176h();
        C0002b bVar = (C0002b) this.f682bm.f388n.get(Integer.valueOf(this.f650ag));
        if (bVar != null) {
            C0024a aVar = this.f699u;
            boolean z = this.f674be;
            C0012j jVar = aVar.f567K[bVar.f20a][0];
            if (z) {
                if (bVar.f21b == 2) {
                    i3 = -10;
                } else {
                    i2 = 0;
                }
                if (bVar.f21b == 1) {
                    i3 = 20;
                    i2 = 21;
                }
                aVar.f313k = new C0000a(((float) i3) + aVar.f318p, ((float) i2) + aVar.f319q);
            } else {
                int i4 = 52 - (bVar.f22c / 2);
                if (bVar.f21b != 2) {
                    i2 = 0;
                }
                if (bVar.f21b != 1) {
                    i = i2;
                }
                aVar.f313k = new C0000a(630.0f + ((float) i4), aVar.f319q + ((float) i));
            }
            aVar.f304b = jVar;
            aVar.f314l = C0004b.m16a(jVar.f329a, jVar.f330b);
        }
    }

    /* renamed from: l */
    private void m148l() {
        this.f669az = System.currentTimeMillis();
        this.f618aA = 1;
        this.f666aw = 2;
        this.f668ay = 0.0f;
        this.f619aB = System.currentTimeMillis();
        this.f620aC = 0.5f;
    }

    /* renamed from: m */
    private void m149m() {
        if (this.f692n != null) {
            this.f692n.mo159a(this.f674be, this.f637aT);
        }
        this.f682bm.f398x.f51f = (double) this.f637aT;
        if (this.f692n != null) {
            this.f692n.mo160b(this.f674be, this.f617Z);
        }
    }

    /* renamed from: n */
    private void m150n() {
        GL10 a = this.f641aX.mo123a();
        if (this.f694p < 10) {
            for (int i = 0; i < 1000; i++) {
                C0011i iVar = this.f691m[i];
                if (!(iVar == null || iVar.f316n == 0)) {
                    C0012j jVar = iVar.f304b;
                    float f = iVar.f315m;
                    C0004b a2 = C0004b.m16a(jVar.f329a, jVar.f330b);
                    C0000a aVar = iVar.f313k;
                    float f2 = iVar.f321s;
                    a.glPushMatrix();
                    if (((double) this.f657an) != 1.0d) {
                        a.glTranslatef(0.0f, -1280.0f * (1.0f - this.f657an), 0.0f);
                        a.glScalef(this.f657an, this.f657an, 1.0f);
                        a.glTranslatef(((((1.0f - this.f657an) * ((800.0f / this.f657an) / 2.0f)) + ((800.0f / this.f657an) / 2.0f)) - (((800.0f / this.f657an) / 2.0f) - (a2.f59a / 2.0f))) + aVar.f0a + this.f639aV, ((((1280.0f / this.f657an) / 2.0f) - (a2.f60b / 2.0f)) + ((1280.0f / this.f657an) / 2.0f)) - aVar.f1b, 0.0f);
                        a.glRotatef(f2, 0.0f, 0.0f, 1.0f);
                    } else {
                        a.glTranslatef((400.0f - (400.0f - (a2.f59a / 2.0f))) + aVar.f0a + this.f639aV, ((640.0f - (a2.f60b / 2.0f)) + 640.0f) - aVar.f1b, 0.0f);
                        a.glRotatef(f2, 0.0f, 0.0f, 1.0f);
                    }
                    a.glColor4f(1.0f * f, 1.0f * f, 1.0f * f, f);
                    if (iVar.f323u > 0.0f) {
                        jVar.mo51c();
                    } else {
                        jVar.mo50b();
                    }
                    a.glPopMatrix();
                }
            }
        }
    }

    /* renamed from: o */
    private void m151o() {
        float f = 2.666f;
        GL10 a = this.f641aX.mo123a();
        if (this.f694p >= 9 && this.f676bg != null) {
            a.glPushMatrix();
            float f2 = 1.6f * ((float) this.f677bh);
            if (f2 >= 2.666f) {
                f = f2;
            }
            this.f676bg.mo49a(new C0000a(426.0f, 640.0f), f);
            a.glPopMatrix();
        }
    }

    /* renamed from: a */
    public final void mo167a() {
        m145i();
        this.f689bt = this.f682bm.f397w;
        Calendar instance = Calendar.getInstance();
        this.f682bm.f398x.f46a = m172a(m173a(instance, "yyyy"));
        this.f682bm.f398x.f47b = m172a(m173a(instance, "MM"));
        this.f682bm.f398x.f48c = m172a(m173a(instance, "dd"));
        this.f682bm.f398x.f49d = m172a(m173a(instance, "HH"));
        this.f682bm.f398x.f50e = m172a(m173a(instance, "mm"));
        this.f682bm.f398x.f53h = 0;
        this.f682bm.f398x.f54i = 0;
        this.f682bm.f398x.f52g = 0;
        this.f682bm.f398x.f51f = 0.0d;
        this.f682bm.f398x.f58m = false;
    }

    /* renamed from: a */
    public final void mo168a(float f, float f2) {
        float f3;
        this.f681bl = 0;
        if (this.f694p == 6) {
            if ((this.f618aA != 1 || this.f661ar <= 0) && (this.f618aA <= 1 || this.f618aA >= 4)) {
                C0002b bVar = (C0002b) this.f682bm.f388n.get(Integer.valueOf(this.f650ag));
                if (this.f614W.f583c != 0) {
                    return;
                }
                if (this.f698t.mo39a(f, f2) != 0 && this.f661ar == 0) {
                    int i = this.f613V[bVar.f20a * 7].f308f;
                    C0026c cVar = this.f614W;
                    C0011i c = m144c(i);
                    boolean z = this.f674be;
                    cVar.f583c = 2;
                    cVar.f582b = c;
                    if (z) {
                        cVar.f582b.f318p = 265.0f - cVar.f582b.f314l.f59a;
                        cVar.f582b.mo44b((cVar.f582b.f318p + f) - 0.057128906f, (f2 - cVar.f582b.f319q) + 100.0f);
                    } else {
                        cVar.f582b.f318p = 80.0f + cVar.f582b.f314l.f59a;
                        cVar.f582b.mo44b((f - cVar.f582b.f318p) + 75.0f, (f2 - cVar.f582b.f319q) + 25.0f);
                    }
                    C0026c cVar2 = this.f614W;
                    int i2 = this.f651ah;
                    if (cVar2.f581a == null) {
                        cVar2.f581a = new C0039k();
                    }
                    if (cVar2.f582b == null) {
                        cVar2.f582b = new C0011i();
                    }
                    cVar2.f581a = new C0039k();
                    cVar2.f581a.f839f = bVar.f21b;
                    cVar2.f581a.f819N = bVar;
                    cVar2.f581a.f840g = i2;
                    cVar2.f581a.f832a = cVar2.f582b;
                    if (bVar.f21b == 0) {
                        cVar2.f582b.f319q = 0.0f;
                        cVar2.f582b.f326x = 13.0f;
                        cVar2.f582b.f327y = -40.0f;
                        cVar2.f581a.f813H = 32.5f;
                        cVar2.f581a.f814I = 220.0f;
                        cVar2.f581a.f815J = 27.5f;
                        cVar2.f581a.f816K = 217.5f;
                        cVar2.f581a.f827V = 20.0f;
                        cVar2.f581a.f820O = 30.0f;
                        cVar2.f581a.f828W = 0.0f;
                    }
                    if (bVar.f21b == 1) {
                        cVar2.f582b.f319q = 0.0f;
                        cVar2.f582b.f326x = 5.0f;
                        cVar2.f582b.f327y = -25.0f;
                        cVar2.f581a.f813H = 17.5f;
                        cVar2.f581a.f814I = 117.5f;
                        cVar2.f581a.f815J = 10.0f;
                        cVar2.f581a.f816K = 130.0f;
                        cVar2.f581a.f827V = 10.0f;
                        cVar2.f581a.f820O = 15.0f;
                        cVar2.f581a.f828W = 0.0f;
                    }
                    if (bVar.f21b == 2) {
                        cVar2.f582b.f319q = 0.0f;
                        cVar2.f582b.f326x = -5.0f;
                        cVar2.f582b.f327y = -87.0f;
                        cVar2.f581a.f813H = 47.5f;
                        cVar2.f581a.f814I = 322.5f;
                        cVar2.f581a.f815J = 70.0f;
                        cVar2.f581a.f816K = 345.0f;
                        cVar2.f581a.f827V = 30.0f;
                        cVar2.f581a.f820O = 45.0f;
                        cVar2.f581a.f828W = 0.0f;
                    }
                    cVar2.f582b.f316n = 1;
                    cVar2.f582b.f315m = 1.0f;
                    cVar2.f582b.f322t = 1.0f;
                    cVar2.f582b.f325w = 1;
                    cVar2.f582b.f321s = 0.0f;
                    cVar2.f582b.f293C = 0.0f;
                    cVar2.f582b.f324v = 15.0f;
                    cVar2.f582b.f323u = f;
                    if (bVar.f21b == 2) {
                        this.f689bt[5].mo33a();
                    }
                    this.f616Y++;
                    this.f697s.f316n = 1;
                    this.f697s.f315m = 1.0f;
                    this.f697s.f318p = this.f697s.f314l.f59a / 2.0f;
                    this.f697s.f319q = this.f697s.f314l.f60b / 2.0f;
                    this.f697s.mo44b(f - this.f697s.f318p, f2 - this.f697s.f319q);
                    this.f612U.f316n = 1;
                    this.f612U.f315m = 1.0f;
                    this.f612U.f319q = (this.f612U.f314l.f60b / 2.0f) + 42.0f;
                    if (this.f674be) {
                        this.f612U.f318p = 100.0f;
                        C0011i iVar = this.f612U;
                        iVar.f318p -= 0.057128906f;
                        this.f612U.f319q -= 100.0f;
                        f3 = this.f612U.f318p + f;
                    } else {
                        this.f612U.f318p = 250.0f;
                        this.f612U.f318p -= 75.0f;
                        this.f612U.f319q -= 25.0f;
                        f3 = f - this.f612U.f318p;
                    }
                    this.f612U.mo44b(f3, f2 - this.f612U.f319q);
                    this.f652ai = System.currentTimeMillis();
                } else if (this.f665av == 0 && this.f666aw == 0 && this.f653aj > 240.0f) {
                    this.f664au = System.currentTimeMillis();
                }
            } else {
                this.f694p = 9;
                this.f618aA = 4;
            }
        }
    }

    /* renamed from: a */
    public final void mo169a(float f, float f2, float f3) {
        if (((double) Math.abs(f)) < 0.1d) {
            f = 0.0f;
        }
        this.f693o[0] = (C0006d.f77G * f) + (this.f693o[0] * (1.0f - C0006d.f77G));
        this.f693o[1] = (C0006d.f77G * f2) + (this.f693o[1] * (1.0f - C0006d.f77G));
        this.f693o[2] = (C0006d.f77G * f3) + (this.f693o[2] * (1.0f - C0006d.f77G));
        this.f680bk = ((float) (System.currentTimeMillis() - this.f695q)) / 1000.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo170b() {
        /*
            r5 = this;
            r4 = 0
            r0 = 0
            amazon.android.tsumineko.game.EAGLView r1 = r5.f641aX
            javax.microedition.khronos.opengles.GL10 r1 = r1.mo123a()
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            return
        L_0x000b:
            r5.f684bo = r0
            long r1 = java.lang.System.currentTimeMillis()
            r5.f695q = r1
        L_0x0013:
            java.lang.String[] r1 = f260i
            int r1 = r1.length
            if (r0 >= r1) goto L_0x000a
            amazon.android.a.k[] r1 = r5.f683bn
            r1 = r1[r0]
            if (r1 == 0) goto L_0x00a8
            amazon.android.a.k[] r1 = r5.f683bn
            r1 = r1[r0]
            int r1 = r1.f350b
            if (r1 == 0) goto L_0x00a8
            amazon.android.a.k[] r1 = r5.f683bn     // Catch:{ Exception -> 0x00a7 }
            r1 = r1[r0]     // Catch:{ Exception -> 0x00a7 }
            int r1 = r1.f350b     // Catch:{ Exception -> 0x00a7 }
            boolean r1 = android.opengl.GLES11.glIsTexture(r1)     // Catch:{ Exception -> 0x00a7 }
            if (r1 != 0) goto L_0x0037
            amazon.android.a.k[] r1 = r5.f683bn     // Catch:{ Exception -> 0x00a7 }
            r2 = 0
            r1[r0] = r2     // Catch:{ Exception -> 0x00a7 }
        L_0x0037:
            amazon.android.a.k[] r1 = r5.f683bn
            r1 = r1[r0]
            if (r1 != 0) goto L_0x00a3
            amazon.android.a.k[] r1 = r5.f683bn
            amazon.android.a.k r2 = new amazon.android.a.k
            java.lang.String[] r3 = f260i
            r3 = r3[r0]
            r2.<init>(r3)
            r1[r0] = r2
            amazon.android.a.k[] r1 = r5.f683bn
            r1 = r1[r0]
            amazon.android.tsumineko.game.EAGLView r2 = r5.f641aX
            android.content.Context r2 = r2.mo128b()
            boolean r1 = r1.mo53a(r2)
            if (r1 == 0) goto L_0x00ad
            amazon.android.tsumineko.game.EAGLView r1 = r5.f641aX
            amazon.android.a.f r1 = r1.f531a
            amazon.android.a.k[] r2 = r5.f683bn
            r2 = r2[r0]
            boolean r1 = r1.mo25a((amazon.android.p000a.C0013k) r2)
            if (r1 == 0) goto L_0x009c
            java.lang.String r1 = "GameMain"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Texture gen ok."
            r2.<init>(r3)
            int r3 = r5.f684bo
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "["
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String[] r3 = f260i
            r3 = r3[r0]
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]="
            java.lang.StringBuilder r2 = r2.append(r3)
            amazon.android.a.k[] r3 = r5.f683bn
            r3 = r3[r0]
            int r3 = r3.f350b
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
        L_0x009c:
            amazon.android.a.k[] r1 = r5.f683bn
            r1 = r1[r0]
            r1.mo54b()
        L_0x00a3:
            int r0 = r0 + 1
            goto L_0x0013
        L_0x00a7:
            r1 = move-exception
        L_0x00a8:
            amazon.android.a.k[] r1 = r5.f683bn
            r1[r0] = r4
            goto L_0x0037
        L_0x00ad:
            java.lang.String r1 = "GameMain"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Texture gen NG."
            r2.<init>(r3)
            int r3 = r5.f684bo
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "["
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String[] r3 = f260i
            r3 = r3[r0]
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "]"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
            goto L_0x00a3
        */
        throw new UnsupportedOperationException("Method not decompiled: amazon.android.tsumineko.game.C0032g.mo170b():void");
    }

    /* renamed from: b */
    public final void mo171b(float f, float f2) {
        Log.d("SampleGL", "-- handleTouchMoveX:x" + f + " y:" + f2);
        this.f681bl = 0;
        if (this.f694p == 6 && this.f614W.f583c == 2 && this.f614W.f582b != null) {
            C0026c cVar = this.f614W;
            float f3 = cVar.f582b.f313k.f0a + cVar.f582b.f318p;
            float f4 = cVar.f582b.f313k.f1b + cVar.f582b.f319q;
            float abs = Math.abs(f3 - f);
            float abs2 = Math.abs(f4 - f2);
            if (abs > 15.0f || abs2 > 15.0f) {
                float sqrt = (float) Math.sqrt((double) ((abs2 * abs2) + (abs * abs)));
                if (abs <= 5.0f && f2 <= f4) {
                    cVar.f582b.f324v -= sqrt;
                    if (cVar.f582b.f324v < 15.0f) {
                        cVar.f582b.f324v = 15.0f;
                    }
                } else if (cVar.f582b.f324v < sqrt) {
                    cVar.f582b.f324v = sqrt;
                }
            }
            if (cVar.f582b.f324v > 45.0f) {
                cVar.f582b.f324v = 45.0f;
            }
            float f5 = 0.0f;
            if (this.f674be) {
                if (f < 100.0f) {
                    f5 = 112.0f;
                }
                this.f614W.mo162a(f5, f, f2, this.f674be);
                this.f612U.mo44b((this.f612U.f318p + f) - f5, f2 - this.f612U.f319q);
            } else {
                if (f > 700.0f) {
                    f5 = ((f - 700.0f) / 60.0f) * 70.0f;
                }
                this.f614W.mo162a(f5, f, f2, this.f674be);
                this.f612U.mo44b(f5 + (f - this.f612U.f318p), f2 - this.f612U.f319q);
            }
            this.f697s.mo44b(f - this.f697s.f318p, f2 - this.f697s.f319q);
            if (this.f617Z > 0) {
                C0039k kVar = this.f614W.f581a;
                C0039k kVar2 = this.f615X[this.f617Z - 1];
                C0002b bVar = this.f614W.f581a.f819N;
                C0011i iVar = kVar.f832a;
                float f6 = kVar.f816K - kVar.f815J;
                float f7 = iVar.f314l.f60b / 2.0f;
                float f8 = ((iVar.f314l.f59a / 2.0f) - (((float) bVar.f31l) / 2.0f)) + iVar.f313k.f0a + kVar.f815J;
                float f9 = iVar.f313k.f1b + f7;
                float f10 = kVar2.f807B.f60b / 2.0f;
                float f11 = kVar2.f806A.f0a + kVar2.f813H;
                float f12 = kVar2.f806A.f1b - 53.32f;
                if (f8 >= (((float) kVar2.f819N.f31l) / 2.0f) + f11 || f8 + f6 <= f11 || f9 >= f12 + f10 || f9 + f7 <= f12 || kVar2.f858y != 0 || this.f618aA != 0) {
                    iVar.f315m = 1.0f;
                    kVar.f845l = 0;
                    return;
                }
                iVar.f315m = 0.5f;
                kVar.f845l = 1;
                return;
            }
            C0039k kVar3 = this.f614W.f581a;
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

    /* renamed from: c */
    public final void mo172c() {
        if (this.f675bf && this.f661ar == 0) {
            if (this.f661ar >= 0 && this.f661ar <= 2) {
                this.f654ak = 0.0f;
                this.f655al = 0.0f;
                this.f656am = 0.0f;
                this.f657an = 1.0f;
                this.f662as = System.currentTimeMillis();
            }
            this.f661ar = 1;
        }
    }

    /* renamed from: d */
    public final void mo173d() {
        if (this.f675bf && this.f661ar == 1) {
            if (this.f661ar >= 0 && this.f661ar <= 2) {
                this.f654ak = 0.0f;
                this.f655al = 0.0f;
                this.f656am = 0.0f;
                this.f657an = 1.0f;
                this.f662as = System.currentTimeMillis();
            }
            this.f661ar = 2;
            this.f626aI = 0;
            this.f627aJ = 0;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x042d, code lost:
        if (r1 != 1) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x042f, code lost:
        r15.f689bt[13].mo33a();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo174e() {
        /*
            r15 = this;
            r0 = 0
            r15.f681bl = r0
            int r0 = r15.f694p
            r1 = 6
            if (r0 == r1) goto L_0x0009
        L_0x0008:
            return
        L_0x0009:
            amazon.android.tsumineko.game.a.c r0 = r15.f614W
            int r0 = r0.f583c
            if (r0 != 0) goto L_0x0032
            int r0 = r15.f665av
            int r0 = r0 + 1
            r15.f665av = r0
            int r0 = r15.f665av
            r1 = 2
            if (r0 != r1) goto L_0x0029
            int r0 = r15.f618aA
            if (r0 == 0) goto L_0x0025
            int r0 = r15.f621aD
            if (r0 != 0) goto L_0x0025
            r0 = 7
            r15.f694p = r0
        L_0x0025:
            r0 = 0
            r15.f665av = r0
            goto L_0x0008
        L_0x0029:
            int r0 = r15.f665av
            r1 = 2
            if (r0 <= r1) goto L_0x0008
            r0 = 0
            r15.f665av = r0
            goto L_0x0008
        L_0x0032:
            amazon.android.tsumineko.game.a.c r0 = r15.f614W
            int r0 = r0.f583c
            r1 = 2
            if (r0 != r1) goto L_0x0008
            amazon.android.tsumineko.game.a.c r0 = r15.f614W
            amazon.android.a.i r0 = r0.f582b
            if (r0 == 0) goto L_0x0008
            amazon.android.tsumineko.game.a.c r0 = r15.f614W
            r1 = 0
            r0.f583c = r1
            amazon.android.tsumineko.game.a.c r0 = r15.f614W
            amazon.android.a.i r0 = r0.f582b
            r1 = 0
            r0.f316n = r1
            amazon.android.a.i r0 = r15.f697s
            r1 = 0
            r0.f316n = r1
            amazon.android.a.i r0 = r15.f612U
            r1 = 0
            r0.f316n = r1
            int r0 = r15.f618aA
            if (r0 != 0) goto L_0x03f5
            amazon.android.tsumineko.game.a.c r0 = r15.f614W
            amazon.android.tsumineko.game.k r0 = r0.f581a
            int r0 = r0.f845l
            r1 = 1
            if (r0 != r1) goto L_0x03f5
            r0 = 0
            int r1 = r15.f617Z
            if (r1 <= 0) goto L_0x006f
            amazon.android.tsumineko.game.k[] r0 = r15.f615X
            int r1 = r15.f617Z
            int r1 = r1 + -1
            r0 = r0[r1]
        L_0x006f:
            amazon.android.tsumineko.game.a.c r1 = r15.f614W
            amazon.android.a.i[] r2 = r15.f613V
            amazon.android.tsumineko.game.k r3 = r1.f581a
            amazon.android.a.a.b r3 = r3.f819N
            amazon.android.tsumineko.game.k r4 = r1.f581a
            int r5 = r3.f20a
            int r5 = r5 * 7
            int r5 = r5 + 2
            r5 = r2[r5]
            r4.f835b = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            int r5 = r3.f20a
            int r5 = r5 * 7
            int r5 = r5 + 3
            r5 = r2[r5]
            r4.f836c = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            int r5 = r3.f20a
            int r5 = r5 * 7
            int r5 = r5 + 6
            r5 = r2[r5]
            r4.f837d = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            int r5 = r3.f20a
            int r5 = r5 * 7
            int r5 = r5 + 6
            r5 = r2[r5]
            r4.f838e = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            int r4 = r4.f839f
            if (r4 != 0) goto L_0x0117
            amazon.android.tsumineko.game.k r4 = r1.f581a
            amazon.android.a.i r4 = r4.f835b
            r5 = 0
            r4.f326x = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            amazon.android.a.i r4 = r4.f835b
            r5 = 0
            r4.f327y = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            amazon.android.a.i r4 = r4.f836c
            r5 = -1048576000(0xffffffffc1800000, float:-16.0)
            r4.f326x = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            amazon.android.a.i r4 = r4.f836c
            r5 = 1097859072(0x41700000, float:15.0)
            r4.f327y = r5
            if (r0 == 0) goto L_0x0117
            int r4 = r0.f839f
            r5 = 1
            if (r4 != r5) goto L_0x0117
            amazon.android.tsumineko.game.k r4 = r1.f581a
            int r5 = r3.f20a
            int r5 = r5 * 7
            int r5 = r5 + 4
            r5 = r2[r5]
            r4.f835b = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            int r5 = r3.f20a
            int r5 = r5 * 7
            int r5 = r5 + 5
            r5 = r2[r5]
            r4.f836c = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            amazon.android.a.i r4 = r4.f835b
            r5 = 1086324736(0x40c00000, float:6.0)
            r4.f326x = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            amazon.android.a.i r4 = r4.f835b
            r5 = 1103101952(0x41c00000, float:24.0)
            r4.f327y = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            amazon.android.a.i r4 = r4.f836c
            r5 = -1054867456(0xffffffffc1200000, float:-10.0)
            r4.f326x = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            amazon.android.a.i r4 = r4.f836c
            r5 = 1108606976(0x42140000, float:37.0)
            r4.f327y = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            r5 = 1111359488(0x423e0000, float:47.5)
            r4.f813H = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            r5 = 1128300544(0x43408000, float:192.5)
            r4.f814I = r5
        L_0x0117:
            amazon.android.tsumineko.game.k r4 = r1.f581a
            int r4 = r4.f839f
            r5 = 1
            if (r4 != r5) goto L_0x013c
            amazon.android.tsumineko.game.k r4 = r1.f581a
            amazon.android.a.i r4 = r4.f835b
            r5 = 0
            r4.f326x = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            amazon.android.a.i r4 = r4.f835b
            r5 = 0
            r4.f327y = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            amazon.android.a.i r4 = r4.f836c
            r5 = -1050673152(0xffffffffc1600000, float:-14.0)
            r4.f326x = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            amazon.android.a.i r4 = r4.f836c
            r5 = 1091567616(0x41100000, float:9.0)
            r4.f327y = r5
        L_0x013c:
            amazon.android.tsumineko.game.k r4 = r1.f581a
            int r4 = r4.f839f
            r5 = 2
            if (r4 != r5) goto L_0x018e
            if (r0 == 0) goto L_0x018e
            int r4 = r0.f839f
            r5 = 2
            if (r4 == r5) goto L_0x0162
            amazon.android.tsumineko.game.k r4 = r1.f581a
            int r5 = r3.f20a
            int r5 = r5 * 7
            int r5 = r5 + 4
            r5 = r2[r5]
            r4.f835b = r5
            amazon.android.tsumineko.game.k r4 = r1.f581a
            int r3 = r3.f20a
            int r3 = r3 * 7
            int r3 = r3 + 5
            r2 = r2[r3]
            r4.f836c = r2
        L_0x0162:
            amazon.android.tsumineko.game.k r2 = r1.f581a
            amazon.android.a.i r2 = r2.f835b
            r3 = 1097859072(0x41700000, float:15.0)
            r2.f326x = r3
            amazon.android.tsumineko.game.k r2 = r1.f581a
            amazon.android.a.i r2 = r2.f835b
            r3 = 1109131264(0x421c0000, float:39.0)
            r2.f327y = r3
            amazon.android.tsumineko.game.k r2 = r1.f581a
            amazon.android.a.i r2 = r2.f836c
            r3 = -1035993088(0xffffffffc2400000, float:-48.0)
            r2.f326x = r3
            amazon.android.tsumineko.game.k r2 = r1.f581a
            amazon.android.a.i r2 = r2.f836c
            r3 = 1113587712(0x42600000, float:56.0)
            r2.f327y = r3
            amazon.android.tsumineko.game.k r2 = r1.f581a
            r3 = 1114636288(0x42700000, float:60.0)
            r2.f813H = r3
            amazon.android.tsumineko.game.k r2 = r1.f581a
            r3 = 1134559232(0x43a00000, float:320.0)
            r2.f814I = r3
        L_0x018e:
            amazon.android.tsumineko.game.k r1 = r1.f581a
            int r4 = r1.f839f
            switch(r4) {
                case 0: goto L_0x03fc;
                case 1: goto L_0x0195;
                case 2: goto L_0x043a;
                default: goto L_0x0195;
            }
        L_0x0195:
            int r1 = r15.f617Z
            if (r1 <= 0) goto L_0x0239
            amazon.android.tsumineko.game.k[] r1 = r15.f615X
            int r2 = r15.f617Z
            int r2 = r2 + -1
            amazon.android.tsumineko.game.a.c r3 = r15.f614W
            amazon.android.tsumineko.game.k[] r5 = r15.f615X
            int r6 = r15.f617Z
            int r6 = r6 + -1
            r5 = r5[r6]
            amazon.android.tsumineko.game.k r6 = r3.f581a
            amazon.android.a.i r6 = r6.f832a
            amazon.android.a.i r7 = r5.f835b
            amazon.android.a.b r8 = r6.f314l
            float r8 = r8.f59a
            amazon.android.a.a r9 = r6.f313k
            float r9 = r9.f0a
            amazon.android.a.b r10 = r7.f314l
            float r10 = r10.f59a
            amazon.android.a.a r11 = r7.f313k
            float r11 = r11.f0a
            int r12 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r12 >= 0) goto L_0x01d7
            amazon.android.tsumineko.game.k r12 = r3.f581a
            float r13 = r11 - r9
            amazon.android.a.b r14 = r6.f314l
            float r14 = r14.f59a
            float r13 = r13 / r14
            r12.f846m = r13
            amazon.android.tsumineko.game.k r12 = r3.f581a
            float r13 = r12.f846m
            r14 = 1097859072(0x41700000, float:15.0)
            float r13 = r13 * r14
            r12.f846m = r13
        L_0x01d7:
            float r12 = r9 + r8
            float r13 = r11 + r10
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x01f7
            amazon.android.tsumineko.game.k r12 = r3.f581a
            float r13 = r9 + r8
            float r14 = r11 + r10
            float r13 = r13 - r14
            amazon.android.a.b r6 = r6.f314l
            float r6 = r6.f59a
            float r6 = r13 / r6
            r12.f847n = r6
            amazon.android.tsumineko.game.k r3 = r3.f581a
            float r6 = r3.f847n
            r12 = 1097859072(0x41700000, float:15.0)
            float r6 = r6 * r12
            r3.f847n = r6
        L_0x01f7:
            r3 = 1082130432(0x40800000, float:4.0)
            float r3 = r10 / r3
            float r3 = r3 + r11
            r6 = 1073741824(0x40000000, float:2.0)
            float r6 = r8 / r6
            float r6 = r6 + r9
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0213
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r8 / r3
            float r3 = r3 + r9
            float r3 = r3 - r11
            float r3 = r3 + r10
            amazon.android.a.b r6 = r7.f314l
            float r6 = r6.f59a
            float r3 = r3 / r6
            r5.f853t = r3
        L_0x0213:
            float r3 = r11 + r10
            r6 = 1082130432(0x40800000, float:4.0)
            float r6 = r10 / r6
            float r3 = r3 - r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r6 = r8 / r6
            float r6 = r6 + r9
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0237
            float r3 = r11 + r10
            r6 = 1082130432(0x40800000, float:4.0)
            float r6 = r10 / r6
            float r3 = r3 - r6
            float r3 = r3 - r9
            r6 = 1073741824(0x40000000, float:2.0)
            float r6 = r8 / r6
            float r3 = r3 + r6
            amazon.android.a.b r6 = r7.f314l
            float r6 = r6.f59a
            float r3 = r3 / r6
            r5.f854u = r3
        L_0x0237:
            r1[r2] = r5
        L_0x0239:
            amazon.android.tsumineko.game.k[] r1 = r15.f615X
            int r2 = r15.f617Z
            amazon.android.tsumineko.game.a.c r3 = r15.f614W
            long r5 = java.lang.System.currentTimeMillis()
            float r7 = r15.f639aV
            float r8 = r15.f653aj
            amazon.android.tsumineko.game.k r9 = r3.f581a
            r9.f851r = r5
            amazon.android.tsumineko.game.k r5 = r3.f581a
            amazon.android.a.i r6 = r5.f832a
            amazon.android.a.b r9 = r6.f314l
            float r9 = r9.f59a
            amazon.android.a.a r6 = r6.f313k
            float r6 = r6.f0a
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            float r6 = r6 + r9
            amazon.android.tsumineko.game.k r9 = r3.f581a
            amazon.android.a.i r9 = r9.f835b
            amazon.android.a.b r9 = r9.f314l
            float r9 = r9.f59a
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            float r6 = r6 - r9
            amazon.android.tsumineko.game.k r9 = r3.f581a
            r9.f841h = r6
            amazon.android.tsumineko.game.k r9 = r3.f581a
            float r10 = r9.f841h
            float r7 = r7 + r10
            r9.f841h = r7
            if (r0 == 0) goto L_0x0293
            amazon.android.tsumineko.game.k r7 = r3.f581a
            amazon.android.a.i r5 = r5.f835b
            amazon.android.a.b r5 = r5.f314l
            float r5 = r5.f59a
            r9 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r9
            float r5 = r5 + r6
            amazon.android.a.i r6 = r0.f835b
            amazon.android.a.a r6 = r6.f313k
            float r6 = r6.f0a
            amazon.android.a.i r9 = r0.f835b
            amazon.android.a.b r9 = r9.f314l
            float r9 = r9.f59a
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            float r6 = r6 + r9
            float r5 = r5 - r6
            r7.f841h = r5
        L_0x0293:
            amazon.android.tsumineko.game.k r5 = r3.f581a
            amazon.android.tsumineko.game.k r6 = r3.f581a
            amazon.android.a.i r6 = r6.f835b
            amazon.android.a.b r6 = r6.f314l
            float r6 = r6.f60b
            float r6 = r6 + r8
            r5.f842i = r6
            amazon.android.tsumineko.game.k r3 = r3.f581a
            r1[r2] = r3
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r1 = r15.f682bm
            amazon.android.a.a.c r2 = r1.f398x
            int r3 = r2.f53h
            r1 = 1
            if (r4 != r1) goto L_0x048e
            r1 = 1
        L_0x02ae:
            int r1 = r1 + r3
            r2.f53h = r1
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r1 = r15.f682bm
            amazon.android.a.a.c r2 = r1.f398x
            int r3 = r2.f54i
            if (r4 != 0) goto L_0x0491
            r1 = 1
        L_0x02ba:
            int r1 = r1 + r3
            r2.f54i = r1
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r1 = r15.f682bm
            amazon.android.a.a.c r2 = r1.f398x
            int r3 = r2.f52g
            r1 = 2
            if (r4 != r1) goto L_0x0494
            r1 = 1
        L_0x02c7:
            int r1 = r1 + r3
            r2.f52g = r1
            int r2 = r15.f644aa
            r1 = 1
            if (r4 != r1) goto L_0x0497
            r1 = 1
        L_0x02d0:
            int r1 = r1 + r2
            r15.f644aa = r1
            int r2 = r15.f645ab
            if (r4 != 0) goto L_0x049a
            r1 = 1
        L_0x02d8:
            int r1 = r1 + r2
            r15.f645ab = r1
            int r2 = r15.f646ac
            r1 = 2
            if (r4 != r1) goto L_0x049d
            r1 = 1
        L_0x02e1:
            int r1 = r1 + r2
            r15.f646ac = r1
            int r1 = r15.f617Z
            int r1 = r1 + 1
            r15.f617Z = r1
            int r1 = r15.f617Z
            r2 = 50
            if (r1 <= r2) goto L_0x02fe
            float r1 = r15.f642aY
            int r2 = r15.f617Z
            int r2 = r2 + -50
            float r2 = (float) r2
            r3 = 1000593162(0x3ba3d70a, float:0.005)
            float r2 = r2 * r3
            float r1 = r1 + r2
            r15.f643aZ = r1
        L_0x02fe:
            int r1 = r15.f617Z
            r2 = 999(0x3e7, float:1.4E-42)
            if (r1 < r2) goto L_0x0307
            r15.m148l()
        L_0x0307:
            int r1 = r15.f617Z
            r2 = 1
            if (r1 <= r2) goto L_0x03ad
            amazon.android.tsumineko.game.k[] r1 = r15.f615X
            r2 = 0
            r2 = r1[r2]
            r1 = 0
            r2.f829X = r1
            r1 = 1
        L_0x0315:
            int r3 = r15.f617Z
            if (r1 < r3) goto L_0x04a0
            amazon.android.tsumineko.game.k[] r1 = r15.f615X
            r2 = 0
            r2 = r1[r2]
            float r1 = r2.f820O
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r3
            float r1 = -r1
            r2.f821P = r1
            float r1 = r2.f827V
            float r1 = -r1
            r2.f822Q = r1
            float r1 = r2.f820O
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r3
            r2.f823R = r1
            r1 = 0
            r2.f824S = r1
            r1 = 1
        L_0x0336:
            int r3 = r15.f617Z
            if (r1 < r3) goto L_0x04cc
            int r1 = r15.f617Z
            r2 = 1
            if (r1 <= r2) goto L_0x0385
            amazon.android.tsumineko.game.k[] r1 = r15.f615X
            r2 = 0
            r1 = r1[r2]
            amazon.android.tsumineko.game.k[] r2 = r15.f615X
            r3 = 1
            r2 = r2[r3]
            float r3 = r1.f821P
            float r5 = r1.f823R
            float r6 = r1.f821P
            float r5 = r5 - r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            float r3 = r3 + r5
            float r5 = r1.f822Q
            float r6 = r1.f824S
            float r1 = r1.f822Q
            float r1 = r6 - r1
            r6 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r6
            float r1 = r1 + r5
            float r5 = r2.f821P
            float r6 = r2.f823R
            float r7 = r2.f821P
            float r6 = r6 - r7
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r7
            float r5 = r5 + r6
            float r6 = r2.f822Q
            float r7 = r2.f824S
            float r8 = r2.f822Q
            float r7 = r7 - r8
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r8
            float r6 = r6 + r7
            float r5 = r5 - r3
            r7 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r7
            float r3 = r3 + r5
            r2.f825T = r3
            float r3 = r6 - r1
            r5 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r5
            float r1 = r1 + r3
            r2.f826U = r1
        L_0x0385:
            int r1 = r15.f617Z
            r2 = 2
            if (r1 <= r2) goto L_0x0394
            amazon.android.tsumineko.game.k[] r1 = r15.f615X
            r2 = 1
            r2 = r1[r2]
            r1 = 2
        L_0x0390:
            int r3 = r15.f617Z
            if (r1 < r3) goto L_0x04fd
        L_0x0394:
            amazon.android.tsumineko.game.k[] r1 = r15.f615X
            r2 = 0
            r1 = r1[r2]
            r2 = 0
            r1.f828W = r2
            amazon.android.tsumineko.game.k[] r1 = r15.f615X
            int r2 = r15.f617Z
            int r2 = r2 + -1
            r1 = r1[r2]
            float r3 = r1.f825T
            float r5 = r1.f826U
            r1 = 1
        L_0x03a9:
            int r2 = r15.f617Z
            if (r1 < r2) goto L_0x0531
        L_0x03ad:
            r1 = 0
            r15.f670ba = r1
            long r2 = java.lang.System.currentTimeMillis()
            r1 = 0
        L_0x03b5:
            int r5 = r15.f617Z
            if (r1 < r5) goto L_0x054f
            r15.f673bd = r2
            amazon.android.tsumineko.game.a.c r1 = r15.f614W
            amazon.android.tsumineko.game.k r2 = r1.f581a
            int r2 = r2.f839f
            switch(r2) {
                case 0: goto L_0x055d;
                case 1: goto L_0x0590;
                case 2: goto L_0x05ad;
                default: goto L_0x03c4;
            }
        L_0x03c4:
            amazon.android.tsumineko.game.k r0 = r1.f581a
            r2 = 0
            r0.f831Z = r2
            amazon.android.tsumineko.game.k r0 = r1.f581a
            r2 = 0
            r0.f830Y = r2
            amazon.android.tsumineko.game.k r0 = r1.f581a
            r2 = 0
            r0.f848o = r2
            amazon.android.tsumineko.game.k r0 = r1.f581a
            r1 = 0
            r0.f834ab = r1
            switch(r4) {
                case 0: goto L_0x05e0;
                case 1: goto L_0x05ea;
                case 2: goto L_0x05f4;
                default: goto L_0x03db;
            }
        L_0x03db:
            float r0 = r15.f653aj
            amazon.android.tsumineko.game.a.c r1 = r15.f614W
            amazon.android.tsumineko.game.k r1 = r1.f581a
            float r1 = r1.f852s
            float r0 = r0 + r1
            r15.f653aj = r0
            int r0 = r15.f637aT
            amazon.android.tsumineko.game.a.c r1 = r15.f614W
            amazon.android.tsumineko.game.k r1 = r1.f581a
            float r1 = r1.f817L
            int r1 = (int) r1
            int r0 = r0 + r1
            r15.f637aT = r0
            r15.m147k()
        L_0x03f5:
            amazon.android.tsumineko.game.a.c r0 = r15.f614W
            r1 = 0
            r0.f581a = r1
            goto L_0x0008
        L_0x03fc:
            if (r0 == 0) goto L_0x0195
            int r1 = r0.f839f
            r2 = 1
            if (r1 != r2) goto L_0x0195
            amazon.android.a.h[] r1 = r15.f689bt
            r2 = 4
            r1 = r1[r2]
            r1.mo33a()
            float r1 = amazon.android.tsumineko.game.C0031f.m138b()
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            if (r1 != 0) goto L_0x041e
            amazon.android.a.h[] r2 = r15.f689bt
            r3 = 8
            r2 = r2[r3]
            r2.mo33a()
        L_0x041e:
            r2 = 1
            if (r1 != r2) goto L_0x042a
            amazon.android.a.h[] r2 = r15.f689bt
            r3 = 9
            r2 = r2[r3]
            r2.mo33a()
        L_0x042a:
            if (r1 == 0) goto L_0x0195
            r2 = 1
            if (r1 == r2) goto L_0x0195
        L_0x042f:
            amazon.android.a.h[] r1 = r15.f689bt
            r2 = 13
            r1 = r1[r2]
            r1.mo33a()
            goto L_0x0195
        L_0x043a:
            if (r0 == 0) goto L_0x0195
            float r1 = amazon.android.tsumineko.game.C0031f.m138b()
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r2 = r0.f839f
            if (r2 != 0) goto L_0x046c
            if (r1 != 0) goto L_0x0454
            amazon.android.a.h[] r1 = r15.f689bt
            r2 = 6
            r1 = r1[r2]
            r1.mo33a()
            goto L_0x0195
        L_0x0454:
            r2 = 1
            if (r1 != r2) goto L_0x0461
            amazon.android.a.h[] r1 = r15.f689bt
            r2 = 7
            r1 = r1[r2]
            r1.mo33a()
            goto L_0x0195
        L_0x0461:
            amazon.android.a.h[] r1 = r15.f689bt
            r2 = 11
            r1 = r1[r2]
            r1.mo33a()
            goto L_0x0195
        L_0x046c:
            int r2 = r0.f839f
            r3 = 1
            if (r2 != r3) goto L_0x0195
            if (r1 != 0) goto L_0x047e
            amazon.android.a.h[] r1 = r15.f689bt
            r2 = 8
            r1 = r1[r2]
            r1.mo33a()
            goto L_0x0195
        L_0x047e:
            if (r1 == 0) goto L_0x042f
            r2 = 1
            if (r1 == r2) goto L_0x042f
            amazon.android.a.h[] r1 = r15.f689bt
            r2 = 9
            r1 = r1[r2]
            r1.mo33a()
            goto L_0x0195
        L_0x048e:
            r1 = 0
            goto L_0x02ae
        L_0x0491:
            r1 = 0
            goto L_0x02ba
        L_0x0494:
            r1 = 0
            goto L_0x02c7
        L_0x0497:
            r1 = 0
            goto L_0x02d0
        L_0x049a:
            r1 = 0
            goto L_0x02d8
        L_0x049d:
            r1 = 0
            goto L_0x02e1
        L_0x04a0:
            amazon.android.tsumineko.game.k[] r3 = r15.f615X
            r3 = r3[r1]
            amazon.android.a.i r5 = r3.f835b
            amazon.android.a.i r2 = r2.f835b
            amazon.android.a.a r6 = r5.f313k
            float r6 = r6.f0a
            amazon.android.a.b r5 = r5.f314l
            float r5 = r5.f59a
            r7 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r7
            float r5 = r5 + r6
            amazon.android.a.a r6 = r2.f313k
            float r6 = r6.f0a
            amazon.android.a.b r2 = r2.f314l
            float r2 = r2.f59a
            r7 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r7
            float r2 = r2 + r6
            float r2 = r5 - r2
            r5 = 1075838976(0x40200000, float:2.5)
            float r2 = r2 / r5
            r3.f829X = r2
            int r1 = r1 + 1
            r2 = r3
            goto L_0x0315
        L_0x04cc:
            amazon.android.tsumineko.game.k[] r3 = r15.f615X
            r3 = r3[r1]
            float r5 = r2.f821P
            float r6 = r2.f823R
            float r7 = r2.f821P
            float r6 = r6 - r7
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r7
            float r5 = r5 + r6
            float r6 = r3.f829X
            float r5 = r5 + r6
            float r6 = r3.f820O
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r7
            float r5 = r5 - r6
            r3.f821P = r5
            float r5 = r2.f822Q
            float r6 = r3.f827V
            float r5 = r5 - r6
            r3.f822Q = r5
            float r5 = r3.f821P
            float r6 = r3.f820O
            float r5 = r5 + r6
            r3.f823R = r5
            float r2 = r2.f822Q
            r3.f824S = r2
            int r1 = r1 + 1
            r2 = r3
            goto L_0x0336
        L_0x04fd:
            amazon.android.tsumineko.game.k[] r3 = r15.f615X
            r3 = r3[r1]
            float r5 = r2.f825T
            float r2 = r2.f826U
            float r6 = r3.f821P
            float r7 = r3.f823R
            float r8 = r3.f821P
            float r7 = r7 - r8
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r8
            float r6 = r6 + r7
            float r7 = r3.f822Q
            float r8 = r3.f824S
            float r9 = r3.f822Q
            float r8 = r8 - r9
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r9
            float r7 = r7 + r8
            float r6 = r6 - r5
            int r8 = r1 + 1
            float r8 = (float) r8
            float r6 = r6 / r8
            float r5 = r5 + r6
            r3.f825T = r5
            float r5 = r7 - r2
            int r6 = r1 + 1
            float r6 = (float) r6
            float r5 = r5 / r6
            float r2 = r2 + r5
            r3.f826U = r2
            int r1 = r1 + 1
            r2 = r3
            goto L_0x0390
        L_0x0531:
            amazon.android.tsumineko.game.k[] r2 = r15.f615X
            r6 = r2[r1]
            float r2 = r6.f822Q
            float r7 = r6.f824S
            float r8 = r6.f822Q
            float r7 = r7 - r8
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r8
            float r7 = r7 + r2
            r2 = 0
            r8 = 0
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x0549
            float r2 = r3 / r5
            float r2 = r2 * r7
        L_0x0549:
            r6.f828W = r2
            int r1 = r1 + 1
            goto L_0x03a9
        L_0x054f:
            amazon.android.tsumineko.game.k[] r5 = r15.f615X
            r5 = r5[r1]
            r5.f833aa = r2
            float r6 = r5.f834ab
            r5.f830Y = r6
            int r1 = r1 + 1
            goto L_0x03b5
        L_0x055d:
            amazon.android.tsumineko.game.k r2 = r1.f581a
            r3 = 1101004800(0x41a00000, float:20.0)
            r2.f817L = r3
            amazon.android.tsumineko.game.k r2 = r1.f581a
            r3 = 1112014848(0x42480000, float:50.0)
            r2.f818M = r3
            amazon.android.tsumineko.game.k r2 = r1.f581a
            amazon.android.tsumineko.game.k r3 = r1.f581a
            amazon.android.a.a.b r3 = r3.f819N
            int r3 = r3.f32m
            int r3 = r3 / 3
            int r3 = r3 * 2
            float r3 = (float) r3
            r2.f852s = r3
            if (r0 == 0) goto L_0x03c4
            int r0 = r0.f839f
            r2 = 1
            if (r0 != r2) goto L_0x03c4
            amazon.android.tsumineko.game.k r0 = r1.f581a
            amazon.android.tsumineko.game.k r2 = r1.f581a
            amazon.android.a.a.b r2 = r2.f819N
            int r2 = r2.f32m
            int r2 = r2 / 3
            int r2 = r2 * 2
            float r2 = (float) r2
            r0.f852s = r2
            goto L_0x03c4
        L_0x0590:
            amazon.android.tsumineko.game.k r0 = r1.f581a
            r2 = 1092616192(0x41200000, float:10.0)
            r0.f817L = r2
            amazon.android.tsumineko.game.k r0 = r1.f581a
            r2 = 1101004800(0x41a00000, float:20.0)
            r0.f818M = r2
            amazon.android.tsumineko.game.k r0 = r1.f581a
            amazon.android.tsumineko.game.k r2 = r1.f581a
            amazon.android.a.a.b r2 = r2.f819N
            int r2 = r2.f32m
            int r2 = r2 / 3
            int r2 = r2 * 2
            float r2 = (float) r2
            r0.f852s = r2
            goto L_0x03c4
        L_0x05ad:
            amazon.android.tsumineko.game.k r2 = r1.f581a
            r3 = 1106247680(0x41f00000, float:30.0)
            r2.f817L = r3
            amazon.android.tsumineko.game.k r2 = r1.f581a
            r3 = 1120403456(0x42c80000, float:100.0)
            r2.f818M = r3
            amazon.android.tsumineko.game.k r2 = r1.f581a
            amazon.android.tsumineko.game.k r3 = r1.f581a
            amazon.android.a.a.b r3 = r3.f819N
            int r3 = r3.f32m
            int r3 = r3 / 8
            int r3 = r3 * 7
            float r3 = (float) r3
            r2.f852s = r3
            if (r0 == 0) goto L_0x03c4
            int r0 = r0.f839f
            r2 = 2
            if (r0 == r2) goto L_0x03c4
            amazon.android.tsumineko.game.k r0 = r1.f581a
            amazon.android.tsumineko.game.k r2 = r1.f581a
            amazon.android.a.a.b r2 = r2.f819N
            int r2 = r2.f32m
            int r2 = r2 / 8
            int r2 = r2 * 7
            float r2 = (float) r2
            r0.f852s = r2
            goto L_0x03c4
        L_0x05e0:
            amazon.android.a.h[] r0 = r15.f689bt
            r1 = 2
            r0 = r0[r1]
            r0.mo33a()
            goto L_0x03db
        L_0x05ea:
            amazon.android.a.h[] r0 = r15.f689bt
            r1 = 1
            r0 = r0[r1]
            r0.mo33a()
            goto L_0x03db
        L_0x05f4:
            amazon.android.a.h[] r0 = r15.f689bt
            r1 = 3
            r0 = r0[r1]
            r0.mo33a()
            goto L_0x03db
        */
        throw new UnsupportedOperationException("Method not decompiled: amazon.android.tsumineko.game.C0032g.mo174e():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:287:0x0bda  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo175f() {
        /*
            r20 = this;
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r2 = r0.f641aX
            javax.microedition.khronos.opengles.GL10 r10 = r2.mo123a()
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r2 = r0.f682bm
            boolean r2 = r2.f380C
            if (r2 == 0) goto L_0x0011
        L_0x0010:
            return
        L_0x0011:
            long r11 = java.lang.System.currentTimeMillis()
            r0 = r20
            long r2 = r0.f695q
            long r2 = r11 - r2
            float r2 = (float) r2
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r3
            r0 = r20
            r0.f680bk = r2
            long r13 = java.lang.System.currentTimeMillis()
            r0 = r20
            long[] r2 = r0.f672bc
            r0 = r20
            int r3 = r0.f671bb
            r2[r3] = r13
            r0 = r20
            int r2 = r0.f671bb
            if (r2 != 0) goto L_0x00cb
            r2 = 1
        L_0x0038:
            r0 = r20
            r0.f671bb = r2
            r0 = r20
            int r2 = r0.f694p
            r3 = 6
            if (r2 != r3) goto L_0x004a
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r2 = r0.f641aX
            r2.mo134e()
        L_0x004a:
            r0 = r20
            int r2 = r0.f694p
            r3 = 15
            if (r2 >= r3) goto L_0x0059
            r0 = r20
            int r2 = r0.f694p
            switch(r2) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x0472;
                case 2: goto L_0x04c6;
                case 3: goto L_0x0059;
                case 4: goto L_0x0059;
                case 5: goto L_0x0059;
                case 6: goto L_0x0511;
                case 7: goto L_0x057c;
                case 8: goto L_0x058c;
                case 9: goto L_0x05a7;
                case 10: goto L_0x05f4;
                default: goto L_0x0059;
            }
        L_0x0059:
            r0 = r20
            int r2 = r0.f681bl
            r3 = 180(0xb4, float:2.52E-43)
            if (r2 <= r3) goto L_0x0616
            r0 = r20
            amazon.android.tsumineko.game.a.a r2 = r0.f699u
            r0 = r20
            int r3 = r0.f650ag
            boolean r4 = r2.f569M
            if (r4 != 0) goto L_0x009a
            amazon.android.a.j[][] r4 = r2.f567K
            r4 = r4[r3]
            r5 = 1
            r4 = r4[r5]
            if (r4 == 0) goto L_0x009a
            r4 = 1
            r2.f569M = r4
            amazon.android.a.j[][] r4 = r2.f567K
            r4 = r4[r3]
            r5 = 1
            r4 = r4[r5]
            r2.f304b = r4
            amazon.android.a.j[][] r4 = r2.f567K
            r4 = r4[r3]
            r5 = 1
            r4 = r4[r5]
            float r4 = r4.f329a
            amazon.android.a.j[][] r5 = r2.f567K
            r3 = r5[r3]
            r5 = 1
            r3 = r3[r5]
            float r3 = r3.f330b
            amazon.android.a.b r3 = amazon.android.p000a.C0004b.m16a(r4, r3)
            r2.f314l = r3
        L_0x009a:
            r0 = r20
            int r2 = r0.f694p
            r3 = 6
            if (r2 < r3) goto L_0x00a9
            r0 = r20
            int r2 = r0.f694p
            r3 = 8
            if (r2 < r3) goto L_0x067e
        L_0x00a9:
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r2 = r0.f641aX
            r2.mo134e()
            r0 = r20
            float r2 = r0.f632aO
            r0 = r20
            r0.m143b(r2)
            r2 = 21
        L_0x00bb:
            r3 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L_0x0652
            r20.m151o()
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r2 = r0.f641aX
            r2.mo136f()
            goto L_0x0010
        L_0x00cb:
            r2 = 0
            goto L_0x0038
        L_0x00ce:
            r0 = r20
            int r2 = r0.f679bj
            if (r2 != 0) goto L_0x0139
            r0 = r20
            java.util.HashMap r2 = r0.f687br
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x00e5
            r0 = r20
            java.util.HashMap r2 = r0.f687br
            r2.clear()
        L_0x00e5:
            r2 = 0
        L_0x00e6:
            int[] r3 = f252a
            int r3 = r3.length
            if (r2 < r3) goto L_0x016d
            r5 = 0
            r2 = 0
            r9 = r2
        L_0x00ee:
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r2 = r0.f682bm
            java.util.HashMap r2 = r2.f388n
            int r2 = r2.size()
            if (r9 < r2) goto L_0x0184
            r0 = r20
            java.util.HashMap r2 = r0.f687br
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r4 = r2.iterator()
        L_0x0106:
            boolean r2 = r4.hasNext()
            if (r2 != 0) goto L_0x03f5
            r0 = r20
            amazon.android.tsumineko.game.a.b r2 = r0.f692n
            if (r2 != 0) goto L_0x012e
            amazon.android.tsumineko.game.a.b r2 = new amazon.android.tsumineko.game.a.b
            r2.<init>()
            r0 = r20
            r0.f692n = r2
            r0 = r20
            amazon.android.tsumineko.game.a.b r2 = r0.f692n
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r3 = r0.f641aX
            r0 = r20
            amazon.android.a.k[] r4 = r0.f683bn
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r5 = r0.f682bm
            r2.mo158a(r3, r4, r5)
        L_0x012e:
            r20.m146j()
            r20.m147k()
            r2 = 1
            r0 = r20
            r0.f679bj = r2
        L_0x0139:
            r2 = 1
            r0 = r20
            r0.f694p = r2
            long r2 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f695q = r2
            r0 = r20
            amazon.android.a.i r2 = r0.f696r
            r3 = 1
            r2.f316n = r3
            r0 = r20
            amazon.android.a.i r2 = r0.f608Q
            r3 = 1
            r2.f316n = r3
            r0 = r20
            amazon.android.a.i r2 = r0.f608Q
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f315m = r3
            r0 = r20
            amazon.android.a.i r2 = r0.f698t
            r3 = 1
            r2.f316n = r3
            r0 = r20
            amazon.android.a.i r2 = r0.f698t
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f315m = r3
            goto L_0x0059
        L_0x016d:
            r0 = r20
            java.util.HashMap r3 = r0.f687br
            int[] r4 = f252a
            r4 = r4[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String[] r5 = f253b
            r5 = r5[r2]
            r3.put(r4, r5)
            int r2 = r2 + 1
            goto L_0x00e6
        L_0x0184:
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r2 = r0.f682bm
            java.util.HashMap r2 = r2.f388n
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.Object r2 = r2.get(r3)
            r8 = r2
            amazon.android.a.a.b r8 = (amazon.android.p000a.p001a.C0002b) r8
            int r2 = r8.f20a
            int r15 = r2 * 7
            r0 = r20
            amazon.android.tsumineko.game.a.a r2 = r0.f699u
            if (r2 != 0) goto L_0x01a8
            amazon.android.tsumineko.game.a.a r2 = new amazon.android.tsumineko.game.a.a
            r2.<init>()
            r0 = r20
            r0.f699u = r2
        L_0x01a8:
            r0 = r20
            amazon.android.tsumineko.game.a.a r2 = r0.f699u
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r3 = r0.f641aX
            r0 = r20
            amazon.android.a.k[] r4 = r0.f683bn
            r6 = 0
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r7 = r0.f682bm
            java.lang.String r0 = r8.f24e
            r16 = r0
            r0 = r16
            int[] r7 = r7.mo93b(r0)
            r2.mo155a(r3, r4, r5, r6, r7)
            r0 = r20
            amazon.android.tsumineko.game.a.a r2 = r0.f699u
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r3 = r0.f641aX
            r0 = r20
            amazon.android.a.k[] r4 = r0.f683bn
            r6 = 1
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r7 = r0.f682bm
            java.lang.String r0 = r8.f19F
            r16 = r0
            r0 = r16
            int[] r7 = r7.mo93b(r0)
            r2.mo155a(r3, r4, r5, r6, r7)
            r0 = r20
            amazon.android.tsumineko.game.a.a r2 = r0.f699u
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r3 = r0.f641aX
            r0 = r20
            amazon.android.a.k[] r4 = r0.f683bn
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r6 = r0.f682bm
            java.lang.String r7 = "sleep_otona.png"
            int[] r6 = r6.mo93b(r7)
            r2.mo156a(r3, r4, r6)
            r0 = r20
            amazon.android.a.j[] r2 = r0.f688bs
            int r3 = r15 + 50
            int r3 = r3 + 0
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r4 = r0.f641aX
            javax.microedition.khronos.opengles.GL10 r4 = r4.mo123a()
            r0 = r20
            amazon.android.a.k[] r6 = r0.f683bn
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r7 = r0.f682bm
            java.lang.String r0 = r8.f27h
            r16 = r0
            r0 = r16
            int[] r7 = r7.mo93b(r0)
            r16 = 1
            r0 = r16
            amazon.android.a.j r4 = amazon.android.p000a.C0012j.m46a(r4, r6, r7, r0)
            r2[r3] = r4
            r0 = r20
            amazon.android.a.j[] r2 = r0.f688bs
            int r3 = r15 + 50
            int r3 = r3 + 1
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r4 = r0.f641aX
            javax.microedition.khronos.opengles.GL10 r4 = r4.mo123a()
            r0 = r20
            amazon.android.a.k[] r6 = r0.f683bn
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r7 = r0.f682bm
            java.lang.String r0 = r8.f30k
            r16 = r0
            r0 = r16
            int[] r7 = r7.mo93b(r0)
            r16 = 1
            r0 = r16
            amazon.android.a.j r4 = amazon.android.p000a.C0012j.m46a(r4, r6, r7, r0)
            r2[r3] = r4
            r0 = r20
            amazon.android.a.j[] r2 = r0.f688bs
            int r3 = r15 + 50
            int r3 = r3 + 2
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r4 = r0.f641aX
            javax.microedition.khronos.opengles.GL10 r4 = r4.mo123a()
            r0 = r20
            amazon.android.a.k[] r6 = r0.f683bn
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r7 = r0.f682bm
            java.lang.String r0 = r8.f33n
            r16 = r0
            r0 = r16
            int[] r7 = r7.mo93b(r0)
            r16 = 1
            r0 = r16
            amazon.android.a.j r4 = amazon.android.p000a.C0012j.m46a(r4, r6, r7, r0)
            r2[r3] = r4
            r0 = r20
            amazon.android.a.j[] r2 = r0.f688bs
            int r3 = r15 + 50
            int r3 = r3 + 3
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r4 = r0.f641aX
            javax.microedition.khronos.opengles.GL10 r4 = r4.mo123a()
            r0 = r20
            amazon.android.a.k[] r6 = r0.f683bn
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r7 = r0.f682bm
            java.lang.String r0 = r8.f36q
            r16 = r0
            r0 = r16
            int[] r7 = r7.mo93b(r0)
            r16 = 1
            r0 = r16
            amazon.android.a.j r4 = amazon.android.p000a.C0012j.m46a(r4, r6, r7, r0)
            r2[r3] = r4
            r0 = r20
            amazon.android.a.j[] r2 = r0.f688bs
            int r3 = r15 + 50
            int r3 = r3 + 4
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r4 = r0.f641aX
            javax.microedition.khronos.opengles.GL10 r4 = r4.mo123a()
            r0 = r20
            amazon.android.a.k[] r6 = r0.f683bn
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r7 = r0.f682bm
            java.lang.String r0 = r8.f39t
            r16 = r0
            r0 = r16
            int[] r7 = r7.mo93b(r0)
            r16 = 1
            r0 = r16
            amazon.android.a.j r4 = amazon.android.p000a.C0012j.m46a(r4, r6, r7, r0)
            r2[r3] = r4
            r0 = r20
            amazon.android.a.j[] r2 = r0.f688bs
            int r3 = r15 + 50
            int r3 = r3 + 5
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r4 = r0.f641aX
            javax.microedition.khronos.opengles.GL10 r4 = r4.mo123a()
            r0 = r20
            amazon.android.a.k[] r6 = r0.f683bn
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r7 = r0.f682bm
            java.lang.String r0 = r8.f42w
            r16 = r0
            r0 = r16
            int[] r7 = r7.mo93b(r0)
            r16 = 1
            r0 = r16
            amazon.android.a.j r4 = amazon.android.p000a.C0012j.m46a(r4, r6, r7, r0)
            r2[r3] = r4
            r0 = r20
            amazon.android.a.j[] r2 = r0.f688bs
            int r3 = r15 + 50
            int r3 = r3 + 6
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r4 = r0.f641aX
            javax.microedition.khronos.opengles.GL10 r4 = r4.mo123a()
            r0 = r20
            amazon.android.a.k[] r6 = r0.f683bn
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r7 = r0.f682bm
            java.lang.String r8 = r8.f45z
            int[] r7 = r7.mo93b(r8)
            r8 = 1
            amazon.android.a.j r4 = amazon.android.p000a.C0012j.m46a(r4, r6, r7, r8)
            r2[r3] = r4
            r0 = r20
            amazon.android.a.i[] r2 = r0.f613V
            int r3 = r15 + 0
            r0 = r20
            amazon.android.a.i[] r4 = r0.f690l
            int r6 = r15 + 100
            int r6 = r6 + 0
            int r7 = r15 + 50
            int r7 = r7 + 0
            r0 = r20
            amazon.android.a.i r7 = r0.m144c(r7)
            r4[r6] = r7
            r2[r3] = r7
            r0 = r20
            amazon.android.a.i[] r2 = r0.f613V
            int r3 = r15 + 1
            r0 = r20
            amazon.android.a.i[] r4 = r0.f690l
            int r6 = r15 + 100
            int r6 = r6 + 1
            int r7 = r15 + 50
            int r7 = r7 + 1
            r0 = r20
            amazon.android.a.i r7 = r0.m144c(r7)
            r4[r6] = r7
            r2[r3] = r7
            r0 = r20
            amazon.android.a.i[] r2 = r0.f613V
            int r3 = r15 + 2
            r0 = r20
            amazon.android.a.i[] r4 = r0.f690l
            int r6 = r15 + 100
            int r6 = r6 + 2
            int r7 = r15 + 50
            int r7 = r7 + 2
            r0 = r20
            amazon.android.a.i r7 = r0.m144c(r7)
            r4[r6] = r7
            r2[r3] = r7
            r0 = r20
            amazon.android.a.i[] r2 = r0.f613V
            int r3 = r15 + 3
            r0 = r20
            amazon.android.a.i[] r4 = r0.f690l
            int r6 = r15 + 100
            int r6 = r6 + 3
            int r7 = r15 + 50
            int r7 = r7 + 3
            r0 = r20
            amazon.android.a.i r7 = r0.m144c(r7)
            r4[r6] = r7
            r2[r3] = r7
            r0 = r20
            amazon.android.a.i[] r2 = r0.f613V
            int r3 = r15 + 4
            r0 = r20
            amazon.android.a.i[] r4 = r0.f690l
            int r6 = r15 + 100
            int r6 = r6 + 4
            int r7 = r15 + 50
            int r7 = r7 + 4
            r0 = r20
            amazon.android.a.i r7 = r0.m144c(r7)
            r4[r6] = r7
            r2[r3] = r7
            r0 = r20
            amazon.android.a.i[] r2 = r0.f613V
            int r3 = r15 + 5
            r0 = r20
            amazon.android.a.i[] r4 = r0.f690l
            int r6 = r15 + 100
            int r6 = r6 + 5
            int r7 = r15 + 50
            int r7 = r7 + 5
            r0 = r20
            amazon.android.a.i r7 = r0.m144c(r7)
            r4[r6] = r7
            r2[r3] = r7
            r0 = r20
            amazon.android.a.i[] r2 = r0.f613V
            int r3 = r15 + 6
            r0 = r20
            amazon.android.a.i[] r4 = r0.f690l
            int r6 = r15 + 100
            int r6 = r6 + 6
            int r7 = r15 + 50
            int r7 = r7 + 6
            r0 = r20
            amazon.android.a.i r7 = r0.m144c(r7)
            r4[r6] = r7
            r2[r3] = r7
            int r5 = r5 + 1
            int r2 = r9 + 1
            r9 = r2
            goto L_0x00ee
        L_0x03f5:
            java.lang.Object r2 = r4.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r5 = r2.intValue()
            r0 = r20
            amazon.android.a.j[] r6 = r0.f688bs
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r3 = r0.f641aX
            javax.microedition.khronos.opengles.GL10 r7 = r3.mo123a()
            r0 = r20
            amazon.android.a.k[] r8 = r0.f683bn
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r9 = r0.f682bm
            r0 = r20
            java.util.HashMap r3 = r0.f687br
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            int[] r3 = r9.mo93b(r3)
            r9 = 1
            amazon.android.a.j r3 = amazon.android.p000a.C0012j.m46a(r7, r8, r3, r9)
            r6[r5] = r3
            java.lang.String r3 = "GameMain"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "initWithUIImage :"
            r6.<init>(r7)
            java.lang.StringBuilder r2 = r6.append(r2)
            java.lang.String r6 = " w:"
            java.lang.StringBuilder r2 = r2.append(r6)
            r0 = r20
            amazon.android.a.j[] r6 = r0.f688bs
            r6 = r6[r5]
            int r6 = r6.f335g
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r6 = " h:"
            java.lang.StringBuilder r2 = r2.append(r6)
            r0 = r20
            amazon.android.a.j[] r6 = r0.f688bs
            r6 = r6[r5]
            int r6 = r6.f336h
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r3, r2)
            r2 = 1
            if (r5 == r2) goto L_0x0106
            r2 = 28
            if (r5 == r2) goto L_0x0106
            r0 = r20
            amazon.android.a.j[] r2 = r0.f688bs
            r2 = r2[r5]
            r3 = 1
            r2.f342n = r3
            goto L_0x0106
        L_0x0472:
            long r2 = java.lang.System.currentTimeMillis()
            r0 = r20
            long r4 = r0.f695q
            long r2 = r2 - r4
            float r2 = (float) r2
            r0 = r20
            r0.f680bk = r2
            r0 = r20
            float r2 = r0.f680bk
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r3
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x048d
            r2 = 0
        L_0x048d:
            r0 = r20
            amazon.android.a.i r3 = r0.f696r
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = r4 - r2
            r3.f315m = r2
            r0 = r20
            amazon.android.a.i r2 = r0.f696r
            float r2 = r2.f315m
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0059
            r0 = r20
            float r2 = r0.f680bk
            double r2 = (double) r2
            r4 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0059
            r0 = r20
            amazon.android.a.i r2 = r0.f696r
            r3 = 0
            r2.f316n = r3
            r2 = 2
            r0 = r20
            r0.f694p = r2
            long r2 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f695q = r2
            goto L_0x0059
        L_0x04c6:
            r0 = r20
            amazon.android.a.i r2 = r0.f698t
            r3 = 1
            r2.f316n = r3
            r0 = r20
            amazon.android.a.i r2 = r0.f698t
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f315m = r3
            r0 = r20
            amazon.android.tsumineko.game.a.a r2 = r0.f699u
            r3 = 1
            r2.f316n = r3
            r0 = r20
            amazon.android.tsumineko.game.a.a r2 = r0.f699u
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f315m = r3
            r0 = r20
            amazon.android.a.i r2 = r0.f608Q
            r3 = 1
            r2.f316n = r3
            r0 = r20
            amazon.android.a.i r2 = r0.f608Q
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f315m = r3
            long r2 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f630aM = r2
            r2 = 6
            r0 = r20
            r0.f694p = r2
            long r2 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f695q = r2
            r0 = r20
            amazon.android.tsumineko.game.a.c r2 = r0.f614W
            r3 = 0
            r2.f583c = r3
            goto L_0x0059
        L_0x0511:
            r0 = r20
            amazon.android.tsumineko.game.a.c r3 = r0.f614W
            r0 = r20
            float r2 = r0.f680bk
            amazon.android.a.i r4 = r3.f582b
            if (r4 == 0) goto L_0x053a
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            int r4 = (int) r2
            float r4 = (float) r4
            float r2 = r2 - r4
            double r4 = (double) r2
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x055f
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r4
        L_0x052d:
            amazon.android.a.i r3 = r3.f582b
            float r4 = r3.f324v
            float r2 = r2 * r4
            float r4 = r3.f324v
            r5 = 1077936128(0x40400000, float:3.0)
            float r4 = r4 / r5
            float r2 = r2 - r4
            r3.f321s = r2
        L_0x053a:
            r0 = r20
            amazon.android.tsumineko.game.a.c r2 = r0.f614W
            int r2 = r2.f583c
            r3 = 2
            if (r2 != r3) goto L_0x0059
            r0 = r20
            float r2 = r0.f680bk
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r3
            int r3 = (int) r2
            float r3 = (float) r3
            float r2 = r2 - r3
            double r3 = (double) r2
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x056a
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r3
            r0 = r20
            amazon.android.a.i r3 = r0.f697s
            r3.f315m = r2
            goto L_0x0059
        L_0x055f:
            r4 = 1056964608(0x3f000000, float:0.5)
            float r2 = r4 - r2
            r4 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r4
            goto L_0x052d
        L_0x056a:
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 - r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r3
            r0 = r20
            amazon.android.a.i r3 = r0.f697s
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = r4 - r2
            r3.f315m = r2
            goto L_0x0059
        L_0x057c:
            r2 = 8
            r0 = r20
            r0.f694p = r2
            long r2 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f695q = r2
            goto L_0x0059
        L_0x058c:
            r0 = r20
            float r2 = r0.f680bk
            r0 = r20
            amazon.android.a.i r2 = r0.f696r
            r3 = 0
            r2.f316n = r3
            r2 = 10
            r0 = r20
            r0.f694p = r2
            long r2 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f695q = r2
            goto L_0x0059
        L_0x05a7:
            r0 = r20
            amazon.android.a.j r2 = r0.f676bg
            if (r2 != 0) goto L_0x05d4
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r2 = r0.f641aX
            javax.microedition.khronos.opengles.GL10 r2 = r2.mo123a()
            r0 = r20
            amazon.android.a.k[] r3 = r0.f683bn
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r4 = r0.f682bm
            java.lang.String r5 = "back_arc.png"
            int[] r4 = r4.mo93b(r5)
            r5 = 0
            amazon.android.a.j r2 = amazon.android.p000a.C0012j.m46a(r2, r3, r4, r5)
            r0 = r20
            r0.f676bg = r2
            r2 = 20
            r0 = r20
            r0.f677bh = r2
            goto L_0x0059
        L_0x05d4:
            r0 = r20
            int r2 = r0.f677bh
            r3 = 1
            if (r2 > r3) goto L_0x05e8
            r2 = 1
            r0 = r20
            r0.f677bh = r2
            r2 = 10
            r0 = r20
            r0.f694p = r2
            goto L_0x0059
        L_0x05e8:
            r0 = r20
            int r2 = r0.f677bh
            int r2 = r2 + -1
            r0 = r20
            r0.f677bh = r2
            goto L_0x0059
        L_0x05f4:
            r0 = r20
            int r2 = r0.f638aU
            r3 = 1
            if (r2 == r3) goto L_0x0059
            r2 = 1
            r0 = r20
            r0.f638aU = r2
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r2 = r0.f641aX
            android.os.Handler r2 = r2.f539i
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r3 = r0.f641aX
            android.os.Handler r3 = r3.f539i
            r4 = 3
            android.os.Message r3 = r3.obtainMessage(r4)
            r2.sendMessage(r3)
            goto L_0x0059
        L_0x0616:
            r0 = r20
            int r2 = r0.f681bl
            int r2 = r2 + 1
            r0 = r20
            r0.f681bl = r2
            r0 = r20
            amazon.android.tsumineko.game.a.a r2 = r0.f699u
            r0 = r20
            int r3 = r0.f650ag
            boolean r4 = r2.f569M
            if (r4 == 0) goto L_0x009a
            r4 = 0
            r2.f569M = r4
            amazon.android.a.j[][] r4 = r2.f567K
            r4 = r4[r3]
            r5 = 0
            r4 = r4[r5]
            r2.f304b = r4
            amazon.android.a.j[][] r4 = r2.f567K
            r4 = r4[r3]
            r5 = 0
            r4 = r4[r5]
            float r4 = r4.f329a
            amazon.android.a.j[][] r5 = r2.f567K
            r3 = r5[r3]
            r5 = 0
            r3 = r3[r5]
            float r3 = r3.f330b
            amazon.android.a.b r3 = amazon.android.p000a.C0004b.m16a(r4, r3)
            r2.f314l = r3
            goto L_0x009a
        L_0x0652:
            r0 = r20
            amazon.android.a.i[] r3 = r0.f690l
            r3 = r3[r2]
            r0 = r20
            amazon.android.a.i r4 = r0.f696r
            if (r3 == r4) goto L_0x0674
            r0 = r20
            amazon.android.a.i r4 = r0.f697s
            if (r3 != r4) goto L_0x0667
            r20.m149m()
        L_0x0667:
            if (r3 == 0) goto L_0x0674
            int r4 = r3.f316n
            if (r4 == 0) goto L_0x0674
            int r4 = r3.f325w
            if (r4 != 0) goto L_0x0678
            r3.mo42a(r10)
        L_0x0674:
            int r2 = r2 + 1
            goto L_0x00bb
        L_0x0678:
            float r4 = r3.f321s
            r3.mo43a((javax.microedition.khronos.opengles.GL10) r10, (float) r4)
            goto L_0x0674
        L_0x067e:
            r0 = r20
            amazon.android.tsumineko.game.a.c r2 = r0.f614W
            r0 = r20
            long r3 = r0.f652ai
            r0 = r20
            amazon.android.a.i[] r5 = r0.f613V
            int r6 = r2.f583c
            r7 = 2
            if (r6 != r7) goto L_0x06bc
            amazon.android.a.i r6 = r2.f582b
            if (r6 == 0) goto L_0x06bc
            amazon.android.tsumineko.game.k r6 = r2.f581a
            if (r6 == 0) goto L_0x06bc
            amazon.android.tsumineko.game.k r6 = r2.f581a
            int r6 = r6.f839f
            r7 = 2
            if (r6 != r7) goto L_0x06bc
            long r3 = r11 - r3
            float r3 = (float) r3
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r4
            amazon.android.tsumineko.game.k r4 = r2.f581a
            amazon.android.a.a.b r4 = r4.f819N
            r6 = 1077936128(0x40400000, float:3.0)
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0a5e
            amazon.android.a.i r2 = r2.f582b
            int r3 = r4.f20a
            int r3 = r3 * 7
            int r3 = r3 + 1
            r3 = r5[r3]
            amazon.android.a.j r3 = r3.f304b
            r2.f304b = r3
        L_0x06bc:
            r0 = r20
            int r2 = r0.f661ar
            if (r2 != 0) goto L_0x06ca
            r0 = r20
            int r2 = r0.f617Z
            int r2 = r2 + -1
        L_0x06c8:
            if (r2 >= 0) goto L_0x0a6e
        L_0x06ca:
            r0 = r20
            long r2 = r0.f662as
            long r2 = r11 - r2
            float r2 = (float) r2
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0702
            r2 = 1065353216(0x3f800000, float:1.0)
            r0 = r20
            int r3 = r0.f661ar
            r4 = 2
            if (r3 != r4) goto L_0x0702
            r3 = 0
            r0 = r20
            r0.f654ak = r3
            r3 = 0
            r0 = r20
            r0.f655al = r3
            r3 = 0
            r0 = r20
            r0.f656am = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r0 = r20
            r0.f657an = r3
            r3 = 0
            r0 = r20
            r0.f658ao = r3
            r3 = 0
            r0 = r20
            r0.f661ar = r3
        L_0x0702:
            r0 = r20
            int r3 = r0.f661ar
            r4 = 1
            if (r3 == r4) goto L_0x0710
            r0 = r20
            int r3 = r0.f661ar
            r4 = 3
            if (r3 != r4) goto L_0x076f
        L_0x0710:
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r2
            r4 = 0
            r0 = r20
            r0.f654ak = r4
            r4 = 0
            r0 = r20
            r0.f655al = r4
            r4 = 0
            r0 = r20
            r0.f656am = r4
            r4 = 1151336448(0x44a00000, float:1280.0)
            r0 = r20
            float r5 = r0.f636aS
            r6 = 1151336448(0x44a00000, float:1280.0)
            float r5 = r5 + r6
            float r4 = r4 / r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r4
            float r3 = r3 * r5
            float r3 = r3 + r4
            r0 = r20
            r0.f657an = r3
            r0 = r20
            r0.f658ao = r2
            r3 = 1145569280(0x44480000, float:800.0)
            r0 = r20
            float r4 = r0.f657an
            float r3 = r3 * r4
            r0 = r20
            r0.f659ap = r3
            r3 = 1151336448(0x44a00000, float:1280.0)
            r0 = r20
            float r4 = r0.f657an
            float r3 = r3 * r4
            r0 = r20
            r0.f660aq = r3
            r0 = r20
            int r3 = r0.f661ar
            r4 = 1
            if (r3 != r4) goto L_0x076f
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x076f
            r0 = r20
            int r3 = r0.f627aJ
            if (r3 != 0) goto L_0x076f
            long r3 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f626aI = r3
            r3 = 2
            r0 = r20
            r0.f627aJ = r3
        L_0x076f:
            r0 = r20
            int r3 = r0.f661ar
            r4 = 2
            if (r3 != r4) goto L_0x07b5
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r2
            r4 = 0
            r0 = r20
            r0.f654ak = r4
            r4 = 0
            r0 = r20
            r0.f655al = r4
            r4 = 0
            r0 = r20
            r0.f656am = r4
            r4 = 1151336448(0x44a00000, float:1280.0)
            r0 = r20
            float r5 = r0.f636aS
            r6 = 1151336448(0x44a00000, float:1280.0)
            float r5 = r5 + r6
            float r4 = r4 / r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r4
            float r2 = r2 * r5
            float r2 = r2 + r4
            r0 = r20
            r0.f657an = r2
            r0 = r20
            r0.f658ao = r3
            r2 = 1145569280(0x44480000, float:800.0)
            r0 = r20
            float r3 = r0.f657an
            float r2 = r2 * r3
            r0 = r20
            r0.f659ap = r2
            r2 = 1151336448(0x44a00000, float:1280.0)
            r0 = r20
            float r3 = r0.f657an
            float r2 = r2 * r3
            r0 = r20
            r0.f660aq = r2
        L_0x07b5:
            r0 = r20
            float r2 = r0.f632aO
            r0 = r20
            int r3 = r0.f617Z
            if (r3 <= 0) goto L_0x07f8
            r0 = r20
            amazon.android.tsumineko.game.k[] r3 = r0.f615X
            r0 = r20
            int r4 = r0.f617Z
            int r4 = r4 + -1
            r3 = r3[r4]
            if (r3 == 0) goto L_0x07f8
            r0 = r20
            int r4 = r0.f661ar
            if (r4 != 0) goto L_0x07f8
            float r4 = r3.f844k
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x07f8
            float r3 = r3.f844k
            r4 = 1146421248(0x44550000, float:852.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x07f8
            r4 = 1146421248(0x44550000, float:852.0)
            float r4 = r3 - r4
            r0 = r20
            float r5 = r0.f632aO
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x07f8
            r2 = 1142947840(0x44200000, float:640.0)
            float r2 = r3 - r2
            int r2 = (int) r2
            float r2 = (float) r2
            r0 = r20
            r0.f632aO = r2
        L_0x07f8:
            r0 = r20
            int r3 = r0.f661ar
            if (r3 != 0) goto L_0x0a90
            r0 = r20
            r0.f663at = r2
        L_0x0802:
            r3 = 0
            r0 = r20
            r0.f639aV = r3
            r3 = 0
            r0 = r20
            r0.f640aW = r3
            r0 = r20
            int r3 = r0.f617Z
            if (r3 <= 0) goto L_0x0835
            r0 = r20
            int r3 = r0.f694p
            r4 = 6
            if (r3 != r4) goto L_0x0835
            r0 = r20
            float[] r3 = r0.f693o
            r4 = 0
            r3 = r3[r4]
            float r3 = -r3
            r0 = r20
            int r4 = r0.f618aA
            if (r4 != 0) goto L_0x0835
            r4 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r3
            r0 = r20
            r0.f639aV = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r4
            r0 = r20
            r0.f640aW = r3
        L_0x0835:
            r0 = r20
            int r3 = r0.f618aA
            if (r3 == 0) goto L_0x0848
            r0 = r20
            float r3 = r0.f639aV
            r0 = r20
            float r4 = r0.f633aP
            float r3 = r3 + r4
            r0 = r20
            r0.f639aV = r3
        L_0x0848:
            r0 = r20
            int r3 = r0.f661ar
            if (r3 == 0) goto L_0x0861
            r0 = r20
            float r3 = r0.f639aV
            double r3 = (double) r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = r20
            float r7 = r0.f658ao
            double r7 = (double) r7
            double r5 = r5 - r7
            double r3 = r3 * r5
            float r3 = (float) r3
            r0 = r20
            r0.f639aV = r3
        L_0x0861:
            r0 = r20
            amazon.android.tsumineko.game.k[] r3 = r0.f615X
            r4 = 0
            r3 = r3[r4]
            if (r3 == 0) goto L_0x0899
            r0 = r20
            int r4 = r0.f617Z
            if (r4 <= 0) goto L_0x0899
            r4 = 0
            r3.f828W = r4
            r4 = 0
            r0 = r20
            long r5 = r0.f673bd
            long r5 = r13 - r5
            float r3 = (float) r5
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r5
            r5 = 1023960469(0x3d086595, float:0.0333)
            float r7 = r3 / r5
            r3 = 0
            r6 = r3
            r3 = r4
        L_0x0886:
            r0 = r20
            int r4 = r0.f617Z
            if (r6 < r4) goto L_0x0a96
            long r3 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f673bd = r3
            r0 = r20
            r0.m140a((float) r2)
        L_0x0899:
            r0 = r20
            int r3 = r0.f694p
            r4 = 6
            if (r3 == r4) goto L_0x08a8
            r0 = r20
            int r3 = r0.f694p
            r4 = 8
            if (r3 != r4) goto L_0x096d
        L_0x08a8:
            r0 = r20
            int r3 = r0.f618aA
            if (r3 != 0) goto L_0x08fa
            r0 = r20
            int r3 = r0.f617Z
            r4 = 1
            if (r3 <= r4) goto L_0x08fa
            r0 = r20
            amazon.android.tsumineko.game.k[] r3 = r0.f615X
            r0 = r20
            int r4 = r0.f617Z
            int r4 = r4 + -1
            r3 = r3[r4]
            amazon.android.a.b r4 = r3.f807B
            float r4 = r4.f59a
            amazon.android.a.a r5 = r3.f806A
            float r5 = r5.f0a
            amazon.android.a.a r6 = r3.f806A
            float r6 = r6.f1b
            r7 = 1112014848(0x42480000, float:50.0)
            float r6 = r6 - r7
            float r4 = r4 + r5
            r7 = -1038090240(0xffffffffc2200000, float:-40.0)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x08e3
            r4 = 1146224640(0x44520000, float:840.0)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x08e3
            r4 = 1151008768(0x449b0000, float:1240.0)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x08fa
        L_0x08e3:
            r20.m148l()
            amazon.android.a.a r4 = r3.f859z
            float r4 = r4.f0a
            r5 = 1137180672(0x43c80000, float:400.0)
            float r4 = r4 - r5
            amazon.android.a.b r3 = r3.f807B
            float r3 = r3.f59a
            r5 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r5
            float r3 = r3 + r4
            float r3 = -r3
            r0 = r20
            r0.f633aP = r3
        L_0x08fa:
            r0 = r20
            int r3 = r0.f618aA
            r4 = 1
            if (r3 != r4) goto L_0x0b99
            r3 = 0
            r0 = r20
            int r4 = r0.f661ar
            r5 = 3
            if (r4 != r5) goto L_0x0b2b
            r0 = r20
            float r4 = r0.f658ao
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0935
            r4 = 0
            r0 = r20
            r0.f627aJ = r4
            r4 = 2
            r0 = r20
            r0.f618aA = r4
            long r4 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f619aB = r4
            float r4 = amazon.android.tsumineko.game.C0031f.m138b()
            r5 = 1036831949(0x3dcccccd, float:0.1)
            float r4 = r4 * r5
            r5 = 1028443341(0x3d4ccccd, float:0.05)
            float r4 = r4 + r5
            r0 = r20
            r0.f620aC = r4
        L_0x0935:
            if (r3 == 0) goto L_0x096d
            r0 = r20
            int r3 = r0.f661ar
            r4 = 3
            if (r3 == r4) goto L_0x096d
            r3 = 3
            r0 = r20
            r0.f661ar = r3
            r3 = 0
            r0 = r20
            r0.f654ak = r3
            r3 = 0
            r0 = r20
            r0.f655al = r3
            r3 = 0
            r0 = r20
            r0.f656am = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r0 = r20
            r0.f657an = r3
            long r3 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f662as = r3
            r3 = 0
            r0 = r20
            r0.f636aS = r3
            r0 = r20
            int r3 = r0.f617Z
            int r3 = r3 + -1
        L_0x096b:
            if (r3 >= 0) goto L_0x0b79
        L_0x096d:
            r0 = r20
            int r3 = r0.f694p
            r4 = 6
            if (r3 >= r4) goto L_0x0984
            r0 = r20
            int r3 = r0.f694p
            r4 = 8
            if (r3 == r4) goto L_0x0984
            r0 = r20
            int r3 = r0.f694p
            r4 = 9
            if (r3 != r4) goto L_0x0010
        L_0x0984:
            r4 = 0
            r3 = 0
            r5 = r3
        L_0x0987:
            r0 = r20
            int r3 = r0.f617Z
            if (r5 < r3) goto L_0x0c58
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r10.glColor4f(r3, r4, r5, r6)
            r3 = 0
        L_0x0999:
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x0e65
            r3 = 0
            r4 = 0
            r5 = 1053609165(0x3ecccccd, float:0.4)
            r6 = 1065353216(0x3f800000, float:1.0)
            r10.glClearColor(r3, r4, r5, r6)
            r0 = r20
            r0.m143b(r2)
            r2 = 21
        L_0x09ae:
            r3 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L_0x0e9b
            r0 = r20
            amazon.android.tsumineko.game.a.c r2 = r0.f614W
            amazon.android.a.i r3 = r2.f582b
            if (r3 == 0) goto L_0x09cb
            amazon.android.a.i r3 = r2.f582b
            int r3 = r3.f316n
            if (r3 == 0) goto L_0x09cb
            amazon.android.a.i r3 = r2.f582b
            int r3 = r3.f325w
            if (r3 != 0) goto L_0x0ec7
            amazon.android.a.i r2 = r2.f582b
            r2.mo42a(r10)
        L_0x09cb:
            r0 = r20
            amazon.android.tsumineko.game.a.a r4 = r0.f699u
            r0 = r20
            boolean r2 = r0.f674be
            r0 = r20
            amazon.android.a.k[] r5 = r0.f683bn
            r0 = r20
            amazon.android.tsumineko.TsumiNekoPadAppDelegate r3 = r0.f682bm
            java.lang.String r6 = "sleep_otona.png"
            int[] r6 = r3.mo93b(r6)
            boolean r3 = r4.f569M
            if (r3 == 0) goto L_0x0a4a
            int r3 = r4.f570N
            int r3 = r3 + 1
            r4.f570N = r3
            int r3 = r4.f570N
            r7 = 10
            if (r3 <= r7) goto L_0x09fa
            int r3 = r4.f571O
            int r3 = r3 + 1
            r4.f571O = r3
            r3 = 0
            r4.f570N = r3
        L_0x09fa:
            if (r2 == 0) goto L_0x0ed2
            float r2 = r4.f318p
            r3 = 1093664768(0x41300000, float:11.0)
            float r3 = r3 + r2
            float r2 = amazon.android.p000a.C0006d.f76F
            float r7 = r4.f319q
            r8 = 1093664768(0x41300000, float:11.0)
            float r7 = r7 + r8
            float r2 = r2 - r7
        L_0x0a09:
            float[][] r7 = r4.f575S
            int r8 = r4.f571O
            int r8 = r8 % 9
            r7 = r7[r8]
            r8 = 0
            r7 = r7[r8]
            float[][] r8 = r4.f575S
            int r9 = r4.f571O
            int r9 = r9 % 9
            r8 = r8[r9]
            r9 = 1
            r8 = r8[r9]
            amazon.android.a.j r9 = r4.f568L
            r10 = 1
            r10 = r6[r10]
            float r10 = (float) r10
            float r7 = r7 + r10
            r10 = 1
            r10 = r5[r10]
            int r10 = r10.f362n
            float r10 = (float) r10
            float r7 = r7 / r10
            r9.f337i = r7
            amazon.android.a.j r7 = r4.f568L
            r9 = 2
            r6 = r6[r9]
            float r6 = (float) r6
            float r6 = r6 + r8
            r8 = 1
            r5 = r5[r8]
            int r5 = r5.f363o
            float r5 = (float) r5
            float r5 = r6 / r5
            r7.f338j = r5
            amazon.android.a.a r5 = new amazon.android.a.a
            r5.<init>(r3, r2)
            amazon.android.a.j r2 = r4.f568L
            r2.mo48a((amazon.android.p000a.C0000a) r5)
        L_0x0a4a:
            r0 = r20
            r0.m141a((long) r13)
            r20.m150n()
            r20.m151o()
            r0 = r20
            amazon.android.tsumineko.game.EAGLView r2 = r0.f641aX
            r2.mo136f()
            goto L_0x0010
        L_0x0a5e:
            amazon.android.a.i r2 = r2.f582b
            int r3 = r4.f20a
            int r3 = r3 * 7
            int r3 = r3 + 0
            r3 = r5[r3]
            amazon.android.a.j r3 = r3.f304b
            r2.f304b = r3
            goto L_0x06bc
        L_0x0a6e:
            r0 = r20
            amazon.android.tsumineko.game.k[] r3 = r0.f615X
            r3 = r3[r2]
            if (r3 == 0) goto L_0x0a8c
            int r4 = r3.f858y
            if (r4 != 0) goto L_0x0a8c
            r0 = r20
            float r2 = r0.f636aS
            float r4 = r3.f842i
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x06ca
            float r2 = r3.f842i
            r0 = r20
            r0.f636aS = r2
            goto L_0x06ca
        L_0x0a8c:
            int r2 = r2 + -1
            goto L_0x06c8
        L_0x0a90:
            r0 = r20
            float r2 = r0.f663at
            goto L_0x0802
        L_0x0a96:
            r0 = r20
            amazon.android.tsumineko.game.k[] r4 = r0.f615X
            r8 = r4[r6]
            long r4 = r8.f833aa
            long r4 = r13 - r4
            float r4 = (float) r4
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r5
            float r5 = (float) r6
            r9 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 / r9
            r9 = 1028443341(0x3d4ccccd, float:0.05)
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0ab2
            r5 = 1028443341(0x3d4ccccd, float:0.05)
        L_0x0ab2:
            r9 = 1109393408(0x42200000, float:40.0)
            float r11 = r8.f827V
            float r9 = r9 - r11
            r11 = 1036831949(0x3dcccccd, float:0.1)
            float r9 = r9 * r11
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 1107820544(0x42080000, float:34.0)
            float r3 = r3 - r12
            r12 = 1114636288(0x42700000, float:60.0)
            float r3 = r3 / r12
            float r3 = r11 - r3
            r11 = 4628968582426918912(0x403d666680000000, double:29.400001525878906)
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = (double) r3
            r17 = r0
            double r17 = java.lang.Math.sin(r17)
            double r15 = r15 - r17
            double r11 = r11 * r15
            double r15 = (double) r9
            double r11 = r11 / r15
            double r11 = java.lang.Math.sqrt(r11)
            float r9 = (float) r11
            r0 = r20
            int r3 = r0.f617Z
            r11 = 500(0x1f4, float:7.0E-43)
            if (r3 <= r11) goto L_0x0ee4
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0ee4
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0aed:
            float r11 = r8.f828W
            float r11 = -r11
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x0b19
            float r9 = java.lang.Math.abs(r9)
            float r3 = r3 * r9
        L_0x0afa:
            if (r6 != 0) goto L_0x0b20
            r3 = 0
            r5 = 0
        L_0x0afe:
            float r9 = r8.f828W
            float r4 = r4 * r9
            float r4 = r4 * r5
            float r3 = r3 + r4
            r8.f831Z = r3
            float r3 = r8.f831Z
            float r3 = -r3
            float r4 = r8.f830Y
            float r3 = r3 + r4
            r8.f834ab = r3
            float r3 = r8.f834ab
            r8.f848o = r3
            float r4 = r8.f848o
            int r3 = r6 + 1
            r6 = r3
            r3 = r4
            goto L_0x0886
        L_0x0b19:
            float r9 = java.lang.Math.abs(r9)
            float r9 = -r9
            float r3 = r3 * r9
            goto L_0x0afa
        L_0x0b20:
            float r9 = r8.f830Y
            r0 = r20
            float r11 = r0.f640aW
            float r11 = r11 * r7
            float r9 = r9 + r11
            r8.f830Y = r9
            goto L_0x0afe
        L_0x0b2b:
            r0 = r20
            long r4 = r0.f619aB
            long r4 = r13 - r4
            float r4 = (float) r4
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r5
            r0 = r20
            float r5 = r0.f620aC
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0935
            long r4 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f619aB = r4
            r4 = 1050253722(0x3e99999a, float:0.3)
            r0 = r20
            r0.f620aC = r4
            r4 = 0
            r0 = r20
            int r5 = r0.f617Z
            int r5 = r5 + -1
        L_0x0b53:
            if (r5 >= 0) goto L_0x0b5a
        L_0x0b55:
            if (r4 != 0) goto L_0x0935
            r3 = 1
            goto L_0x0935
        L_0x0b5a:
            r0 = r20
            amazon.android.tsumineko.game.k[] r6 = r0.f615X
            r6 = r6[r5]
            int r7 = r6.f858y
            if (r7 != 0) goto L_0x0b76
            amazon.android.a.a r7 = r6.f806A
            float r7 = r7.f1b
            r8 = 1112014848(0x42480000, float:50.0)
            float r7 = r7 - r8
            r8 = 1151008768(0x449b0000, float:1240.0)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x0b76
            r4 = 2
            r6.f858y = r4
            r4 = 1
            goto L_0x0b55
        L_0x0b76:
            int r5 = r5 + -1
            goto L_0x0b53
        L_0x0b79:
            r0 = r20
            amazon.android.tsumineko.game.k[] r4 = r0.f615X
            r4 = r4[r3]
            int r5 = r4.f858y
            if (r5 != 0) goto L_0x0b95
            r0 = r20
            float r3 = r0.f636aS
            float r5 = r4.f842i
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x096d
            float r3 = r4.f842i
            r0 = r20
            r0.f636aS = r3
            goto L_0x096d
        L_0x0b95:
            int r3 = r3 + -1
            goto L_0x096b
        L_0x0b99:
            r0 = r20
            int r3 = r0.f618aA
            r4 = 2
            if (r3 != r4) goto L_0x0c0b
            r0 = r20
            long r3 = r0.f619aB
            long r3 = r13 - r3
            float r3 = (float) r3
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r4
            r0 = r20
            float r4 = r0.f620aC
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x096d
            long r3 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f619aB = r3
            float r3 = amazon.android.tsumineko.game.C0031f.m138b()
            r4 = 1036831949(0x3dcccccd, float:0.1)
            float r3 = r3 * r4
            r4 = 1028443341(0x3d4ccccd, float:0.05)
            float r3 = r3 + r4
            r0 = r20
            r0.f620aC = r3
            r4 = 0
            r0 = r20
            int r3 = r0.f617Z
            int r3 = r3 + -1
            r19 = r3
            r3 = r4
            r4 = r19
        L_0x0bd6:
            if (r4 >= 0) goto L_0x0be9
        L_0x0bd8:
            if (r3 != 0) goto L_0x096d
            r3 = 3
            r0 = r20
            r0.f618aA = r3
            long r3 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f619aB = r3
            goto L_0x096d
        L_0x0be9:
            r0 = r20
            amazon.android.tsumineko.game.k[] r5 = r0.f615X
            r5 = r5[r4]
            int r6 = r5.f858y
            if (r6 != 0) goto L_0x0c08
            r3 = 2
            r5.f858y = r3
            r3 = 1
            float r5 = r5.f848o
            float r5 = java.lang.Math.abs(r5)
            r6 = 1119092736(0x42b40000, float:90.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0bd8
            r5 = 0
            r0 = r20
            r0.f620aC = r5
        L_0x0c08:
            int r4 = r4 + -1
            goto L_0x0bd6
        L_0x0c0b:
            r0 = r20
            int r3 = r0.f618aA
            r4 = 3
            if (r3 != r4) goto L_0x096d
            r0 = r20
            long r3 = r0.f619aB
            long r3 = r13 - r3
            float r3 = (float) r3
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r4
            r4 = 1067030938(0x3f99999a, float:1.2)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x096d
            r0 = r20
            int r3 = r0.f621aD
            if (r3 != 0) goto L_0x0c35
            r3 = 7
            r0 = r20
            r0.f694p = r3
            r3 = 4
            r0 = r20
            r0.f618aA = r3
            goto L_0x096d
        L_0x0c35:
            r20.m145i()
            r0 = r20
            amazon.android.a.i r2 = r0.f698t
            r3 = 1
            r2.f316n = r3
            r0 = r20
            amazon.android.a.i r2 = r0.f698t
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f315m = r3
            r0 = r20
            amazon.android.tsumineko.game.a.a r2 = r0.f699u
            r3 = 1
            r2.f316n = r3
            r0 = r20
            amazon.android.tsumineko.game.a.a r2 = r0.f699u
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f315m = r3
            goto L_0x0010
        L_0x0c58:
            r0 = r20
            amazon.android.tsumineko.game.k[] r3 = r0.f615X
            r8 = r3[r5]
            int r3 = r8.f858y
            r6 = 1
            if (r3 == r6) goto L_0x0db1
            float r3 = r8.f848o
            float r6 = java.lang.Math.abs(r3)
            r3 = 0
            r0 = r20
            int r7 = r0.f618aA
            if (r7 != 0) goto L_0x0c99
            r7 = 1114636288(0x42700000, float:60.0)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0c99
            java.lang.String r3 = "GameMain"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "!!!!!Crash check1 i="
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r7 = "/"
            java.lang.StringBuilder r6 = r6.append(r7)
            r0 = r20
            int r7 = r0.f617Z
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r3, r6)
            r3 = 1
        L_0x0c99:
            if (r4 != 0) goto L_0x0ca0
            int r6 = r8.f858y
            r7 = 2
            if (r6 != r7) goto L_0x0ca1
        L_0x0ca0:
            r3 = 1
        L_0x0ca1:
            r6 = 0
            if (r3 == 0) goto L_0x0d7e
            r3 = 1
            r8.f858y = r3
            long r6 = java.lang.System.currentTimeMillis()
            r0 = r20
            long r11 = r0.f695q
            long r6 = r6 - r11
            float r3 = (float) r6
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r6
            r0 = r20
            r0.f680bk = r3
            amazon.android.a.a r3 = r8.f859z
            float r9 = r3.f0a
            amazon.android.a.a r3 = r8.f859z
            float r3 = r3.f1b
            int r11 = r8.f839f
            if (r5 != 0) goto L_0x0ede
            amazon.android.a.i r3 = r8.f835b
            amazon.android.a.j r3 = r3.f304b
            r6 = 1151336448(0x44a00000, float:1280.0)
            float r3 = r3.f330b
            float r3 = r6 - r3
            r6 = 1106247680(0x41f00000, float:30.0)
            float r3 = r3 - r6
            r6 = r3
        L_0x0cd2:
            r0 = r20
            float r3 = r0.f680bk
            r0 = r20
            int r7 = r0.f635aR
            r0 = r20
            amazon.android.a.i[] r12 = r0.f691m
            r7 = r12[r7]
            amazon.android.a.i r12 = r8.f838e
            amazon.android.a.j r12 = r12.f304b
            r7.f304b = r12
            amazon.android.a.j r12 = r7.f304b
            float r12 = r12.f329a
            amazon.android.a.j r15 = r7.f304b
            float r15 = r15.f330b
            amazon.android.a.b r12 = amazon.android.p000a.C0004b.m16a(r12, r15)
            r7.f314l = r12
            r0 = r20
            int r12 = r0.f622aE
            if (r12 != 0) goto L_0x0d01
            long r15 = java.lang.System.currentTimeMillis()
            switch(r11) {
                case 0: goto L_0x0db8;
                case 1: goto L_0x0de6;
                case 2: goto L_0x0e14;
                default: goto L_0x0d01;
            }
        L_0x0d01:
            r11 = 1203982336(0x47c35000, float:100000.0)
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0d0a
            r3 = 1092616192(0x41200000, float:10.0)
        L_0x0d0a:
            r0 = r20
            int r11 = r0.f622aE
            int r11 = r11 + 1
            r0 = r20
            r0.f622aE = r11
            r0 = r20
            int r11 = r0.f622aE
            r12 = 3
            if (r11 <= r12) goto L_0x0d20
            r11 = 0
            r0 = r20
            r0.f622aE = r11
        L_0x0d20:
            r11 = 1
            r7.f316n = r11
            r11 = 1065353216(0x3f800000, float:1.0)
            r7.f315m = r11
            r7.mo44b(r9, r6)
            amazon.android.a.a r6 = r7.f313k
            float r6 = r6.f0a
            r7.f318p = r6
            amazon.android.a.a r6 = r7.f313k
            float r6 = r6.f1b
            r7.f319q = r6
            float r6 = r8.f848o
            r9 = 0
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0e42
            r6 = 1065353216(0x3f800000, float:1.0)
            float r9 = amazon.android.tsumineko.game.C0031f.m138b()
            r11 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r11
            float r6 = r6 + r9
            float r6 = -r6
            r7.f323u = r6
        L_0x0d4a:
            r6 = 0
            r7.f297G = r6
            r7.f298H = r3
            r3 = 0
            r7.f299I = r3
            float r3 = r8.f848o
            r7.f321s = r3
            r0 = r20
            int r3 = r0.f635aR
            int r3 = r3 + 1
            r0 = r20
            r0.f635aR = r3
            r0 = r20
            int r3 = r0.f635aR
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r6) goto L_0x0d6d
            r3 = 0
            r0 = r20
            r0.f635aR = r3
        L_0x0d6d:
            r3 = 1065353216(0x3f800000, float:1.0)
            r7.f315m = r3
            if (r4 != 0) goto L_0x0ee1
            r0 = r20
            int r3 = r0.f618aA
            if (r3 != 0) goto L_0x0d7c
            r20.m148l()
        L_0x0d7c:
            r6 = r7
            r4 = r5
        L_0x0d7e:
            if (r4 <= 0) goto L_0x0db1
            r0 = r20
            float r7 = r0.f653aj
            r3 = 0
            r0 = r20
            r0.f653aj = r3
            r3 = 0
        L_0x0d8a:
            r0 = r20
            int r8 = r0.f617Z
            if (r3 < r8) goto L_0x0e50
            r0 = r20
            float r3 = r0.f653aj
            float r3 = r7 - r3
            if (r6 == 0) goto L_0x0db1
            amazon.android.a.a r7 = r6.f313k
            float r7 = r7.f0a
            amazon.android.a.a r8 = r6.f313k
            float r8 = r8.f1b
            float r3 = r8 - r3
            r6.mo44b(r7, r3)
            amazon.android.a.a r3 = r6.f313k
            float r3 = r3.f0a
            r6.f318p = r3
            amazon.android.a.a r3 = r6.f313k
            float r3 = r3.f1b
            r6.f319q = r3
        L_0x0db1:
            r3 = r4
            int r4 = r5 + 1
            r5 = r4
            r4 = r3
            goto L_0x0987
        L_0x0db8:
            r0 = r20
            long r11 = r0.f623aF
            long r11 = r15 - r11
            float r3 = (float) r11
            r11 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r11
            r0 = r20
            int r11 = r0.f618aA
            r12 = 1
            if (r11 > r12) goto L_0x0dcb
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x0dcb:
            r11 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0d01
            r0 = r20
            amazon.android.a.h[] r11 = r0.f689bt
            r12 = 12
            r11 = r11[r12]
            r11.mo33a()
            long r11 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f623aF = r11
            goto L_0x0d01
        L_0x0de6:
            r0 = r20
            long r11 = r0.f624aG
            long r11 = r15 - r11
            float r3 = (float) r11
            r11 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r11
            r0 = r20
            int r11 = r0.f618aA
            r12 = 1
            if (r11 > r12) goto L_0x0df9
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x0df9:
            r11 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0d01
            r0 = r20
            amazon.android.a.h[] r11 = r0.f689bt
            r12 = 14
            r11 = r11[r12]
            r11.mo33a()
            long r11 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f624aG = r11
            goto L_0x0d01
        L_0x0e14:
            r0 = r20
            long r11 = r0.f625aH
            long r11 = r15 - r11
            float r3 = (float) r11
            r11 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r11
            r0 = r20
            int r11 = r0.f618aA
            r12 = 1
            if (r11 > r12) goto L_0x0e27
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x0e27:
            r11 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0d01
            r0 = r20
            amazon.android.a.h[] r11 = r0.f689bt
            r12 = 16
            r11 = r11[r12]
            r11.mo33a()
            long r11 = java.lang.System.currentTimeMillis()
            r0 = r20
            r0.f625aH = r11
            goto L_0x0d01
        L_0x0e42:
            r6 = 1065353216(0x3f800000, float:1.0)
            float r9 = amazon.android.tsumineko.game.C0031f.m138b()
            r11 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r11
            float r6 = r6 + r9
            r7.f323u = r6
            goto L_0x0d4a
        L_0x0e50:
            r0 = r20
            amazon.android.tsumineko.game.k[] r8 = r0.f615X
            r8 = r8[r3]
            r0 = r20
            float r9 = r0.f653aj
            float r8 = r8.f852s
            float r8 = r8 + r9
            r0 = r20
            r0.f653aj = r8
            int r3 = r3 + 1
            goto L_0x0d8a
        L_0x0e65:
            r0 = r20
            amazon.android.a.i[] r4 = r0.f691m
            r4 = r4[r3]
            if (r4 == 0) goto L_0x0e97
            int r5 = r4.f316n
            if (r5 == 0) goto L_0x0e97
            float r5 = r4.f299I
            r6 = 1045220557(0x3e4ccccd, float:0.2)
            float r5 = r5 + r6
            r4.f299I = r5
            amazon.android.a.a r5 = r4.f313k
            float r5 = r5.f1b
            float r6 = r4.f299I
            float r5 = r5 + r6
            amazon.android.a.a r6 = r4.f313k
            float r6 = r6.f0a
            float r7 = r4.f323u
            float r6 = r6 + r7
            r4.mo44b(r6, r5)
            int r5 = r4.f297G
            int r5 = r5 + 1
            r4.f297G = r5
            float r5 = r4.f321s
            float r6 = r4.f324v
            float r5 = r5 + r6
            r4.f321s = r5
        L_0x0e97:
            int r3 = r3 + 1
            goto L_0x0999
        L_0x0e9b:
            r0 = r20
            amazon.android.a.i[] r3 = r0.f690l
            r3 = r3[r2]
            r0 = r20
            amazon.android.a.i r4 = r0.f696r
            if (r3 == r4) goto L_0x0ebd
            r0 = r20
            amazon.android.a.i r4 = r0.f697s
            if (r3 != r4) goto L_0x0eb0
            r20.m149m()
        L_0x0eb0:
            if (r3 == 0) goto L_0x0ebd
            int r4 = r3.f316n
            if (r4 == 0) goto L_0x0ebd
            int r4 = r3.f325w
            if (r4 != 0) goto L_0x0ec1
            r3.mo42a(r10)
        L_0x0ebd:
            int r2 = r2 + 1
            goto L_0x09ae
        L_0x0ec1:
            float r4 = r3.f321s
            r3.mo43a((javax.microedition.khronos.opengles.GL10) r10, (float) r4)
            goto L_0x0ebd
        L_0x0ec7:
            amazon.android.a.i r3 = r2.f582b
            amazon.android.a.i r2 = r2.f582b
            float r2 = r2.f321s
            r3.mo43a((javax.microedition.khronos.opengles.GL10) r10, (float) r2)
            goto L_0x09cb
        L_0x0ed2:
            r3 = 1142947840(0x44200000, float:640.0)
            float r2 = amazon.android.p000a.C0006d.f76F
            float r7 = r4.f319q
            r8 = 1093664768(0x41300000, float:11.0)
            float r7 = r7 + r8
            float r2 = r2 - r7
            goto L_0x0a09
        L_0x0ede:
            r6 = r3
            goto L_0x0cd2
        L_0x0ee1:
            r6 = r7
            goto L_0x0d7e
        L_0x0ee4:
            r3 = r4
            goto L_0x0aed
        */
        throw new UnsupportedOperationException("Method not decompiled: amazon.android.tsumineko.game.C0032g.mo175f():void");
    }

    /* renamed from: g */
    public final void mo176g() {
        GL10 a = this.f641aX.mo123a();
        for (int i = 0; i < 6; i++) {
            if (this.f678bi[i] != null) {
                this.f678bi[i].mo45a();
                this.f678bi[i] = null;
            }
        }
        for (int i2 = 0; i2 < 300; i2++) {
            if (this.f690l[i2] != null) {
                this.f690l[i2].mo40a();
                this.f690l[i2] = null;
            }
        }
        for (int i3 = 0; i3 < 1000; i3++) {
            if (this.f691m[i3] != null) {
                this.f691m[i3].mo40a();
                this.f691m[i3] = null;
            }
        }
        if (this.f699u != null) {
            this.f699u.mo40a();
            this.f699u = null;
        }
        for (int i4 = 0; i4 < 170; i4++) {
            if (this.f688bs[i4] != null) {
                this.f688bs[i4].mo45a();
                this.f688bs[i4] = null;
            }
        }
        if (this.f692n != null) {
            this.f692n.mo157a();
            this.f692n = null;
        }
        if (this.f614W != null) {
            this.f614W.mo161a();
            this.f614W = null;
        }
        if (this.f676bg != null) {
            this.f676bg.mo45a();
        }
        if (this.f683bn != null) {
            for (int i5 = 0; i5 < this.f683bn.length; i5++) {
                if (this.f683bn[i5] != null) {
                    a.glDeleteTextures(1, new int[]{this.f683bn[i5].f350b}, 0);
                }
            }
        }
        this.f682bm.mo92b();
        Log.e("GameMain", "release ok.");
    }
}
