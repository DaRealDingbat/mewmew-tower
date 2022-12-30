package com.amazon.android.framework.task.pipeline;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.amazon.android.framework.task.Task;
import com.amazon.android.framework.util.KiwiLogger;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.amazon.android.framework.task.pipeline.a */
public final class C0122a implements C0127f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final KiwiLogger f1050a = new KiwiLogger("SimpleTaskPipeline");

    /* renamed from: b */
    private final Handler f1051b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Set f1052c = Collections.synchronizedSet(new HashSet());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f1053d;

    private C0122a(HandlerThread handlerThread) {
        this.f1053d = handlerThread.getName();
        handlerThread.start();
        this.f1051b = new Handler(handlerThread.getLooper());
    }

    private C0122a(String str) {
        this.f1053d = str;
        this.f1051b = new Handler();
    }

    /* renamed from: a */
    public static C0122a m316a(String str) {
        return new C0122a(new HandlerThread("KIWI_" + str));
    }

    /* renamed from: b */
    public static C0122a m318b(String str) {
        return new C0122a(str);
    }

    /* renamed from: c */
    private Runnable m321c(Task task) {
        C0125d dVar = new C0125d(this, task);
        this.f1052c.add(dVar);
        return dVar;
    }

    /* renamed from: a */
    public final void mo398a() {
        for (Runnable runnable : this.f1052c) {
            if (KiwiLogger.TRACE_ON) {
                f1050a.trace(this.f1053d + ": Removing callback: " + runnable);
            }
            this.f1051b.removeCallbacks(runnable);
        }
        this.f1052c.clear();
        if (this.f1051b.getLooper() != Looper.getMainLooper() && this.f1051b.getLooper().getThread().isAlive()) {
            f1050a.trace("Interrupting looper thread!");
            this.f1051b.getLooper().getThread().interrupt();
            f1050a.trace("Quitting looper: " + this.f1051b.getLooper().getThread() + ", " + this.f1051b.getLooper().getThread().isAlive());
            this.f1051b.getLooper().quit();
        }
    }

    /* renamed from: a */
    public final void mo399a(Task task) {
        if (KiwiLogger.TRACE_ON) {
            f1050a.trace("Scheduling task: " + task);
        }
        this.f1051b.post(m321c(task));
    }

    /* renamed from: a */
    public final void mo400a(Task task, long j) {
        if (KiwiLogger.TRACE_ON) {
            f1050a.trace(this.f1053d + ": Scheduling task: " + task + ", with delay: " + j);
        }
        this.f1051b.postDelayed(m321c(task), j);
    }

    /* renamed from: a */
    public final void mo401a(Task task, Date date) {
        long uptimeMillis = SystemClock.uptimeMillis() + (date.getTime() - System.currentTimeMillis());
        if (KiwiLogger.TRACE_ON) {
            f1050a.trace(this.f1053d + ": Scheduling task: " + task + ", at time: " + date + ", System uptimeMillis: " + System.currentTimeMillis() + ", uptimeMillis: " + uptimeMillis);
        }
        this.f1051b.postAtTime(m321c(task), uptimeMillis);
    }

    /* renamed from: b */
    public final void mo402b(Task task) {
        if (KiwiLogger.TRACE_ON) {
            f1050a.trace(this.f1053d + ": Scheduling task immediately: " + task);
        }
        this.f1051b.postAtFrontOfQueue(m321c(task));
    }
}
