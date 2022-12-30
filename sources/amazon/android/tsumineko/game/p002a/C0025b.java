package amazon.android.tsumineko.game.p002a;

import amazon.android.p000a.C0000a;
import amazon.android.p000a.C0006d;
import amazon.android.p000a.C0007e;
import amazon.android.p000a.C0012j;
import amazon.android.p000a.C0013k;
import amazon.android.tsumineko.TsumiNekoPadAppDelegate;
import amazon.android.tsumineko.game.EAGLView;
import android.util.Log;

/* renamed from: amazon.android.tsumineko.game.a.b */
public final class C0025b implements C0007e {

    /* renamed from: l */
    public static final float f576l = (C0006d.f75E - 252.0f);

    /* renamed from: m */
    public static final float f577m = (C0006d.f76F - 111.97199f);

    /* renamed from: n */
    public static final float f578n = (C0006d.f76F - 173.29f);

    /* renamed from: o */
    C0012j[] f579o = new C0012j[11];

    /* renamed from: p */
    C0012j[] f580p = new C0012j[11];

    /* renamed from: a */
    public final void mo157a() {
        if (this.f579o != null) {
            for (int i = 0; i < this.f579o.length; i++) {
                if (this.f579o[i] != null) {
                    this.f579o[i].mo45a();
                    this.f579o[i] = null;
                }
            }
        }
        if (this.f580p != null) {
            for (int i2 = 0; i2 < this.f580p.length; i2++) {
                if (this.f580p[i2] != null) {
                    this.f580p[i2].mo45a();
                    this.f580p[i2] = null;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo158a(EAGLView eAGLView, C0013k[] kVarArr, TsumiNekoPadAppDelegate tsumiNekoPadAppDelegate) {
        for (int i = 0; i < f256e.length; i++) {
            this.f579o[i] = C0012j.m46a(eAGLView.mo123a(), kVarArr, tsumiNekoPadAppDelegate.mo93b(f256e[i]), 1);
        }
        for (int i2 = 0; i2 < f257f.length; i2++) {
            this.f580p[i2] = C0012j.m46a(eAGLView.mo123a(), kVarArr, tsumiNekoPadAppDelegate.mo93b(f257f[i2]), 1);
        }
    }

    /* renamed from: a */
    public final void mo159a(boolean z, int i) {
        C0000a[] aVarArr = new C0000a[3];
        C0000a[] aVarArr2 = new C0000a[2];
        if (z) {
            for (int i2 = 0; i2 < 3; i2++) {
                aVarArr[i2] = new C0000a(f576l + ((float) (i2 * 37)), f577m);
            }
            for (int i3 = 0; i3 < 2; i3++) {
                aVarArr2[i3] = new C0000a(f576l + ((float) ((i3 + 1) * 37)), f578n);
            }
        } else {
            for (int i4 = 0; i4 < 3; i4++) {
                aVarArr[i4] = new C0000a(((float) (i4 * 37)) + 82.5f, f577m);
            }
            for (int i5 = 0; i5 < 2; i5++) {
                aVarArr2[i5] = new C0000a(((float) ((i5 + 1) * 37)) + 82.5f, f578n);
            }
        }
        int i6 = i / 100;
        int i7 = i % 100;
        int[] iArr = {i6 / 100, i6 / 10, (i6 % 100) % 10};
        int[] iArr2 = {i7 / 10, i7 % 10};
        int i8 = 0;
        while (true) {
            if (i8 < 3) {
                if (iArr[i8] != 0) {
                    break;
                }
                i8++;
            } else {
                i8 = 0;
                break;
            }
        }
        int i9 = 0;
        while (true) {
            if (i9 < 2) {
                if (iArr2[i9] != 0) {
                    break;
                }
                i9++;
            } else {
                i9 = 0;
                break;
            }
        }
        int i10 = i6 == 0 ? 2 : i8;
        int i11 = i7 == 0 ? 1 : i9;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 >= i10) {
                if (this.f579o[iArr[i12]] != null) {
                    this.f579o[iArr[i12]].mo48a(aVarArr[i12]);
                } else {
                    Log.e("GameMain", "drawHeight Error1");
                }
            }
        }
        for (int i13 = 0; i13 < 2; i13++) {
            if (i13 >= i11) {
                this.f579o[iArr2[i13]].mo48a(aVarArr2[i13]);
            }
        }
    }

    /* renamed from: b */
    public final void mo160b(boolean z, int i) {
        int[] iArr = new int[3];
        iArr[0] = i / 100;
        iArr[1] = (i - (iArr[0] * 100)) / 10;
        iArr[2] = (i % 100) % 10;
        int i2 = 0;
        while (true) {
            if (i2 < 3) {
                if (iArr[i2] != 0) {
                    break;
                }
                i2++;
            } else {
                i2 = 0;
                break;
            }
        }
        if (i == 0) {
            i2 = 2;
        }
        float f = z ? 92.5f + ((float) ((75 - ((3 - i2) * 25)) / 2)) : 657.5f + ((float) ((75 - ((3 - i2) * 25)) / 2));
        for (int i3 = 0; i3 < 3; i3++) {
            C0000a aVar = new C0000a(f, 984.074f);
            if (i3 >= i2) {
                this.f580p[iArr[i3]].mo48a(aVar);
                f += 25.0f;
            }
        }
    }
}
