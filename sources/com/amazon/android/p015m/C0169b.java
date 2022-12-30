package com.amazon.android.p015m;

import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p006d.C0067a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amazon.android.m.b */
public final class C0169b implements C0174g {

    /* renamed from: a */
    private static final KiwiLogger f1148a = new KiwiLogger("EventManagerImpl");

    /* renamed from: b */
    private final Map f1149b = new HashMap();

    /* renamed from: a */
    public final void mo442a(C0170c cVar) {
        C0067a.m219a((Object) cVar, "listener");
        C0067a.m218a();
        C0173f a = cVar.mo282a();
        f1148a.trace("Registering listener for event: " + a + ", " + cVar);
        C0172e eVar = (C0172e) this.f1149b.get(a);
        if (eVar == null) {
            eVar = new C0172e();
            this.f1149b.put(a, eVar);
        }
        eVar.mo444a(cVar);
    }

    /* renamed from: a */
    public final void mo443a(C0171d dVar) {
        C0173f a = dVar.mo281a();
        if (KiwiLogger.TRACE_ON) {
            f1148a.trace("Posting event: " + a);
        }
        if (this.f1149b.containsKey(a)) {
            ((C0172e) this.f1149b.get(a)).mo445a(dVar);
        } else if (KiwiLogger.TRACE_ON) {
            f1148a.trace("No registered listeners, returning");
        }
    }
}
