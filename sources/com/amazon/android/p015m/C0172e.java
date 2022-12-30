package com.amazon.android.p015m;

import com.amazon.android.framework.util.KiwiLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.amazon.android.m.e */
public final class C0172e implements Comparator {

    /* renamed from: a */
    private static final KiwiLogger f1150a = new KiwiLogger("EventListenerNotificationQueue");

    /* renamed from: b */
    private List f1151b = new ArrayList();

    /* renamed from: a */
    public final void mo444a(C0170c cVar) {
        if (KiwiLogger.TRACE_ON) {
            f1150a.trace("Adding listener: " + cVar);
        }
        this.f1151b.add(cVar);
        Collections.sort(this.f1151b, this);
    }

    /* renamed from: a */
    public final void mo445a(C0171d dVar) {
        for (C0170c cVar : this.f1151b) {
            if (KiwiLogger.TRACE_ON) {
                f1150a.trace("Notifying listener: " + cVar);
            }
            cVar.mo283a(dVar);
        }
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((C0170c) obj).mo284b().compareTo(((C0170c) obj2).mo284b());
    }
}
