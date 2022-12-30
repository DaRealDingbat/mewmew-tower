package amazon.android.tsumineko.game.p002a;

import amazon.android.p000a.C0011i;
import amazon.android.tsumineko.game.C0039k;

/* renamed from: amazon.android.tsumineko.game.a.c */
public final class C0026c {

    /* renamed from: a */
    public C0039k f581a;

    /* renamed from: b */
    public C0011i f582b;

    /* renamed from: c */
    public int f583c;

    /* renamed from: a */
    public final void mo161a() {
        if (this.f582b != null) {
            this.f582b.mo40a();
            this.f582b = null;
        }
        if (this.f581a != null) {
            this.f581a = null;
        }
    }

    /* renamed from: a */
    public final void mo162a(float f, float f2, float f3, boolean z) {
        if (z) {
            this.f582b.mo44b(((this.f582b.f318p + f2) - f) - 0.057128906f, (f3 - this.f582b.f319q) + 100.0f);
            return;
        }
        this.f582b.mo44b((f2 - this.f582b.f318p) + f + 75.0f, (f3 - this.f582b.f319q) + 25.0f);
    }
}
