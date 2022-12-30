package com.amazon.android.p010h;

import com.amazon.android.framework.resource.C0099b;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.TaskManager;
import com.amazon.android.framework.task.pipeline.TaskPipelineId;
import com.amazon.android.framework.util.KiwiLogger;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.amazon.android.h.b */
public abstract class C0137b implements C0099b {
    private static final KiwiLogger LOGGER = new KiwiLogger("Expirable");
    private AtomicBoolean expired = new AtomicBoolean(false);
    private final List observers = new Vector();
    @Resource
    protected TaskManager taskManager;

    private void notifyObservers() {
        for (C0139d observe : this.observers) {
            observe.observe(this);
        }
    }

    private void scheduleExpiration() {
        this.taskManager.enqueueAtTime(TaskPipelineId.BACKGROUND, new C0136a(this), getExpiration());
    }

    public final void discard() {
        if (this.expired.compareAndSet(false, true)) {
            notifyObservers();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void doExpiration();

    public void expire() {
        if (this.expired.compareAndSet(false, true)) {
            if (KiwiLogger.TRACE_ON) {
                LOGGER.trace("Expiring: " + this);
            }
            doExpiration();
            if (KiwiLogger.TRACE_ON) {
                LOGGER.trace("Notifying Observers of expiration: " + this);
            }
            notifyObservers();
        }
    }

    /* access modifiers changed from: protected */
    public abstract Date getExpiration();

    /* access modifiers changed from: protected */
    public boolean isExpired() {
        return this.expired.get();
    }

    public final void onResourcesPopulated() {
        scheduleExpiration();
        onResourcesPopulatedImpl();
    }

    /* access modifiers changed from: protected */
    public void onResourcesPopulatedImpl() {
    }

    public final void register(C0139d dVar) {
        this.observers.add(dVar);
    }
}
