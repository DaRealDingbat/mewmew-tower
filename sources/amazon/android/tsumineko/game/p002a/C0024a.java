package amazon.android.tsumineko.game.p002a;

import amazon.android.p000a.C0011i;
import amazon.android.p000a.C0012j;
import amazon.android.p000a.C0013k;
import amazon.android.tsumineko.game.EAGLView;
import java.lang.reflect.Array;

/* renamed from: amazon.android.tsumineko.game.a.a */
public final class C0024a extends C0011i {

    /* renamed from: K */
    public C0012j[][] f567K = ((C0012j[][]) Array.newInstance(C0012j.class, new int[]{17, 2}));

    /* renamed from: L */
    public C0012j f568L;

    /* renamed from: M */
    public boolean f569M = false;

    /* renamed from: N */
    public int f570N;

    /* renamed from: O */
    public int f571O;

    /* renamed from: P */
    public int f572P = 37;

    /* renamed from: Q */
    public int f573Q = 39;

    /* renamed from: R */
    public int f574R = -1;

    /* renamed from: S */
    public float[][] f575S = {new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{(float) this.f572P, 0.0f}, new float[]{(float) this.f574R, (float) this.f573Q}, new float[]{(float) this.f572P, (float) this.f573Q}, new float[]{(float) this.f572P, (float) this.f573Q}, new float[]{(float) this.f574R, (float) this.f573Q}, new float[]{(float) this.f572P, 0.0f}, new float[]{0.0f, 0.0f}};

    /* renamed from: a */
    public final C0012j mo154a(int i, int i2) {
        return this.f567K[i][i2];
    }

    /* renamed from: a */
    public final void mo40a() {
        for (int i = 0; i < 17; i++) {
            if (this.f567K[i] != null) {
                if (this.f567K[i][0] != null) {
                    this.f567K[i][0].mo45a();
                    this.f567K[i][0] = null;
                }
                if (this.f567K[i][1] != null) {
                    this.f567K[i][1].mo45a();
                    this.f567K[i][1] = null;
                }
            }
        }
        if (this.f568L != null) {
            this.f568L.mo45a();
            this.f568L = null;
        }
    }

    /* renamed from: a */
    public final void mo155a(EAGLView eAGLView, C0013k[] kVarArr, int i, int i2, int[] iArr) {
        this.f569M = false;
        this.f567K[i][i2] = C0012j.m46a(eAGLView.mo123a(), kVarArr, iArr, 1);
    }

    /* renamed from: a */
    public final void mo156a(EAGLView eAGLView, C0013k[] kVarArr, int[] iArr) {
        if (this.f568L == null) {
            this.f568L = C0012j.m46a(eAGLView.mo123a(), kVarArr, iArr, 0);
        }
    }
}
