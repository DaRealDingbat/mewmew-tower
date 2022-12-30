package com.amazon.android.p008f;

import android.app.Activity;
import com.amazon.android.p012j.C0144b;
import com.amazon.android.p012j.C0145c;
import com.amazon.android.p015m.C0168a;
import com.amazon.android.p015m.C0170c;
import com.amazon.android.p015m.C0171d;
import com.amazon.android.p015m.C0173f;

/* renamed from: com.amazon.android.f.e */
final class C0076e implements C0170c {

    /* renamed from: a */
    private /* synthetic */ C0074c f937a;

    C0076e(C0074c cVar) {
        this.f937a = cVar;
    }

    /* renamed from: a */
    public final C0173f mo282a() {
        return C0145c.RESUME;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo283a(C0171d dVar) {
        C0144b bVar = (C0144b) dVar;
        C0072a aVar = (C0072a) this.f937a.f933f.get();
        if (aVar != null) {
            Activity activity = bVar.f1075a;
            C0074c.f928a.error("Context changed while awaiting result!");
            if (aVar.f926b != null) {
                C0074c.f928a.error("Finishing activity from old context: " + aVar.f926b);
                aVar.f926b.finishActivity(aVar.f925a);
            }
            aVar.mo297a(activity);
        }
    }

    /* renamed from: b */
    public final C0168a mo284b() {
        return C0168a.MIDDLE;
    }
}
