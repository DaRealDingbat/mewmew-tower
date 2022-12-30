package com.amazon.android.framework.task.pipeline;

import com.amazon.android.p012j.C0145c;
import com.amazon.android.p015m.C0168a;
import com.amazon.android.p015m.C0170c;
import com.amazon.android.p015m.C0171d;
import com.amazon.android.p015m.C0173f;

/* renamed from: com.amazon.android.framework.task.pipeline.b */
final class C0123b implements C0170c {

    /* renamed from: a */
    private /* synthetic */ C0126e f1054a;

    C0123b(C0126e eVar) {
        this.f1054a = eVar;
    }

    /* renamed from: a */
    public final C0173f mo282a() {
        return C0145c.RESUME;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo283a(C0171d dVar) {
        C0126e.m331a(this.f1054a);
    }

    /* renamed from: b */
    public final C0168a mo284b() {
        return C0168a.MIDDLE;
    }

    public final String toString() {
        return "ForegroundTaskPipeline:onResume listener";
    }
}
