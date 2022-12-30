package com.amazon.android.framework.task.pipeline;

import com.amazon.android.framework.task.Task;

/* renamed from: com.amazon.android.framework.task.pipeline.c */
final class C0124c implements Task {

    /* renamed from: a */
    private /* synthetic */ Task f1055a;

    /* renamed from: b */
    private /* synthetic */ C0126e f1056b;

    C0124c(C0126e eVar, Task task) {
        this.f1056b = eVar;
        this.f1055a = task;
    }

    public final void execute() {
        this.f1056b.m330a(this.f1055a, true);
    }

    public final String toString() {
        return "Future:PostToUITask: " + this.f1055a.toString();
    }
}
