package com.amazon.android.p013k;

import com.amazon.android.framework.resource.C0098a;
import com.amazon.android.framework.resource.C0099b;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.Task;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p006d.C0067a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.amazon.android.k.b */
public abstract class C0148b extends C0149c implements C0099b {

    /* renamed from: a */
    private static final KiwiLogger f1089a = new KiwiLogger("TaskWorkflow");
    @Resource

    /* renamed from: b */
    private C0098a f1090b;

    /* renamed from: c */
    private List f1091c = new ArrayList();

    /* renamed from: d */
    private AtomicBoolean f1092d = new AtomicBoolean(false);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo278a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo431a(Task task) {
        C0067a.m219a((Object) task, "task");
        this.f1091c.add(task);
        if (task instanceof C0147a) {
            ((C0147a) task).setWorkflow(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo279b();

    /* renamed from: c */
    public final void mo432c() {
        this.f1092d.set(true);
    }

    public final void execute() {
        try {
            if (KiwiLogger.TRACE_ON) {
                f1089a.trace("Exiting task workflow: " + this);
            }
            Iterator it = this.f1091c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Task task = (Task) it.next();
                if (!this.f1092d.get()) {
                    task.execute();
                } else if (KiwiLogger.TRACE_ON) {
                    f1089a.trace("Finished set, exiting task workflow early");
                }
            }
        } finally {
            mo278a();
        }
    }

    public final void onResourcesPopulated() {
        for (Task b : this.f1091c) {
            this.f1090b.mo367b(b);
        }
    }

    public final String toString() {
        return mo279b();
    }
}
