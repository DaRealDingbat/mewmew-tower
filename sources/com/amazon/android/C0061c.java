package com.amazon.android;

import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p012j.C0144b;
import com.amazon.android.p012j.C0145c;
import com.amazon.android.p015m.C0168a;
import com.amazon.android.p015m.C0170c;
import com.amazon.android.p015m.C0171d;
import com.amazon.android.p015m.C0173f;
import com.amazon.android.p021s.C0186a;
import java.util.HashMap;

/* renamed from: com.amazon.android.c */
final class C0061c implements C0170c {

    /* renamed from: a */
    private /* synthetic */ Kiwi f911a;

    C0061c(Kiwi kiwi) {
        this.f911a = kiwi;
    }

    /* renamed from: a */
    public final C0173f mo282a() {
        return C0145c.RESUME;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo283a(C0171d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("EventName", C0145c.RESUME.name());
        hashMap.put("ActivityName", ((C0144b) dVar).f1075a.getClass().getName());
        hashMap.put("Timestamp", Long.valueOf(System.currentTimeMillis()));
        C0186a aVar = new C0186a(hashMap);
        if (KiwiLogger.TRACE_ON) {
            Kiwi.LOGGER.trace("Adding lifecycle RESUME command to pipeline");
        }
        Kiwi.unsafeAddCommandToCommandTaskPipeline(aVar);
    }

    /* renamed from: b */
    public final C0168a mo284b() {
        return C0168a.MIDDLE;
    }
}
