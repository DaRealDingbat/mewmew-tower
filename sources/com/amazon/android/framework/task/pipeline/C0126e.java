package com.amazon.android.framework.task.pipeline;

import com.amazon.android.framework.context.ContextManager;
import com.amazon.android.framework.resource.C0099b;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.Task;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p015m.C0170c;
import com.amazon.android.p015m.C0174g;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: com.amazon.android.framework.task.pipeline.e */
public final class C0126e implements C0099b, C0127f {

    /* renamed from: a */
    private static final KiwiLogger f1059a = new KiwiLogger("ForegroundTaskPipeline");
    @Resource

    /* renamed from: b */
    private ContextManager f1060b;
    @Resource

    /* renamed from: c */
    private C0174g f1061c;

    /* renamed from: d */
    private C0127f f1062d = C0122a.m318b("KIWI_UI");

    /* renamed from: e */
    private C0127f f1063e;

    /* renamed from: f */
    private List f1064f = new ArrayList();

    public C0126e(C0127f fVar) {
        this.f1063e = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m330a(Task task, boolean z) {
        if (!this.f1060b.isVisible()) {
            if (KiwiLogger.TRACE_ON) {
                f1059a.trace("No UI visible to execute task: " + task + ", placing into pending queue until task " + "is visible");
            }
            this.f1064f.add(task);
        } else if (z) {
            this.f1062d.mo402b(task);
        } else {
            this.f1062d.mo399a(task);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m331a(C0126e eVar) {
        if (KiwiLogger.TRACE_ON) {
            f1059a.trace("Activity resumed, scheduling tasks on UI thread");
        }
        for (Task a : eVar.f1064f) {
            eVar.m330a(a, true);
        }
        eVar.f1064f.clear();
    }

    /* renamed from: c */
    private Task m333c(Task task) {
        return new C0124c(this, task);
    }

    /* renamed from: a */
    public final void mo398a() {
        this.f1062d.mo398a();
        this.f1063e.mo398a();
        this.f1064f.clear();
    }

    /* renamed from: a */
    public final void mo399a(Task task) {
        m330a(task, false);
    }

    /* renamed from: a */
    public final void mo400a(Task task, long j) {
        this.f1063e.mo400a(m333c(task), j);
    }

    /* renamed from: a */
    public final void mo401a(Task task, Date date) {
        this.f1063e.mo401a(m333c(task), date);
    }

    /* renamed from: b */
    public final void mo402b(Task task) {
        m330a(task, true);
    }

    public final void onResourcesPopulated() {
        this.f1061c.mo442a((C0170c) new C0123b(this));
    }
}
