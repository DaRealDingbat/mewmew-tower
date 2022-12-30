package com.amazon.android.framework.task.pipeline;

import android.os.SystemClock;
import com.amazon.android.framework.task.Task;
import com.amazon.android.framework.util.KiwiLogger;
import java.util.Date;

/* renamed from: com.amazon.android.framework.task.pipeline.d */
final class C0125d implements Runnable {

    /* renamed from: a */
    private /* synthetic */ Task f1057a;

    /* renamed from: b */
    private /* synthetic */ C0122a f1058b;

    C0125d(C0122a aVar, Task task) {
        this.f1058b = aVar;
        this.f1057a = task;
    }

    public final void run() {
        this.f1058b.f1052c.remove(this);
        try {
            if (KiwiLogger.TRACE_ON) {
                C0122a.f1050a.trace(this.f1058b.f1053d + ": Executing Task: " + this.f1057a + ", current time: " + new Date() + ", uptime: " + SystemClock.uptimeMillis());
            }
            this.f1057a.execute();
            if (KiwiLogger.TRACE_ON) {
                C0122a.f1050a.trace(this.f1058b.f1053d + ": Task finished executing: " + this.f1057a);
            }
        } catch (Throwable th) {
            if (KiwiLogger.TRACE_ON) {
                C0122a.f1050a.trace(this.f1058b.f1053d + ": Task finished executing: " + this.f1057a);
            }
            throw th;
        }
    }

    public final String toString() {
        return this.f1057a.toString();
    }
}
