package com.amazon.android.framework.task;

import com.amazon.android.framework.resource.C0098a;
import com.amazon.android.framework.resource.C0099b;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.pipeline.C0122a;
import com.amazon.android.framework.task.pipeline.C0126e;
import com.amazon.android.framework.task.pipeline.C0127f;
import com.amazon.android.framework.task.pipeline.TaskPipelineId;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p015m.C0170c;
import com.amazon.android.p015m.C0174g;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.amazon.android.framework.task.a */
public final class C0101a implements C0099b, TaskManager {

    /* renamed from: a */
    private static final KiwiLogger f990a = new KiwiLogger("TaskManagerImpl");
    @Resource

    /* renamed from: b */
    private C0098a f991b;
    @Resource

    /* renamed from: c */
    private C0174g f992c;

    /* renamed from: d */
    private final AtomicBoolean f993d = new AtomicBoolean(false);

    /* renamed from: e */
    private final Map f994e = new HashMap();

    public C0101a() {
        C0122a a = C0122a.m316a(TaskPipelineId.COMMAND.name());
        C0122a a2 = C0122a.m316a(TaskPipelineId.BACKGROUND.name());
        C0126e eVar = new C0126e(a2);
        this.f994e.put(TaskPipelineId.COMMAND, a);
        this.f994e.put(TaskPipelineId.BACKGROUND, a2);
        this.f994e.put(TaskPipelineId.FOREGROUND, eVar);
    }

    /* renamed from: a */
    private void m268a(TaskPipelineId taskPipelineId, Task task, C0102b bVar) {
        if (!this.f993d.get()) {
            if (KiwiLogger.TRACE_ON) {
                f990a.trace("Populating Task: " + task);
            }
            this.f991b.mo367b(task);
            C0127f fVar = (C0127f) this.f994e.get(taskPipelineId);
            if (fVar == null) {
                throw new IllegalStateException("No pipeline registered with id: " + taskPipelineId);
            }
            bVar.mo373a(task, fVar);
        } else if (KiwiLogger.ERROR_ON) {
            f990a.error("Task enqueued after TaskManager has been finished! Task: " + task);
        }
    }

    /* renamed from: a */
    public final void mo372a() {
        if (this.f993d.compareAndSet(false, true)) {
            if (KiwiLogger.TRACE_ON) {
                f990a.trace("TaskManager finishing....");
            }
            for (C0127f a : this.f994e.values()) {
                a.mo398a();
            }
        }
    }

    public final void enqueue(TaskPipelineId taskPipelineId, Task task) {
        if (KiwiLogger.TRACE_ON) {
            f990a.trace("Enqueue task on pipeline id: " + taskPipelineId);
        }
        m268a(taskPipelineId, task, new C0103c(this));
    }

    public final void enqueueAfterDelay(TaskPipelineId taskPipelineId, Task task, long j) {
        m268a(taskPipelineId, task, new C0120f(this, j));
    }

    public final void enqueueAtFront(TaskPipelineId taskPipelineId, Task task) {
        m268a(taskPipelineId, task, new C0118d(this));
    }

    public final void enqueueAtTime(TaskPipelineId taskPipelineId, Task task, Date date) {
        m268a(taskPipelineId, task, new C0119e(this, date));
    }

    public final void onResourcesPopulated() {
        for (C0127f b : this.f994e.values()) {
            this.f991b.mo367b(b);
        }
        this.f992c.mo442a((C0170c) new C0121g(this));
    }
}
