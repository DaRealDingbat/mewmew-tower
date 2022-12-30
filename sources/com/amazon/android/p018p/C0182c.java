package com.amazon.android.p018p;

import com.amazon.android.framework.util.KiwiLogger;

/* renamed from: com.amazon.android.p.c */
public final class C0182c implements C0183d {

    /* renamed from: a */
    private static final KiwiLogger f1162a = new KiwiLogger("MetricsManagerImpl");

    /* renamed from: b */
    private C0180a f1163b = new C0180a();

    /* renamed from: a */
    public final synchronized C0180a mo463a() {
        C0180a aVar;
        if (this.f1163b.mo457a()) {
            aVar = this.f1163b;
        } else {
            aVar = this.f1163b;
            this.f1163b = new C0180a();
        }
        return aVar;
    }

    /* renamed from: a */
    public final synchronized void mo464a(C0181b bVar) {
        if (KiwiLogger.TRACE_ON) {
            f1162a.trace("Recording Metric: " + bVar);
        }
        this.f1163b.f1160a.add(bVar);
    }
}
