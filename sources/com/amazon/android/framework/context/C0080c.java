package com.amazon.android.framework.context;

import com.amazon.android.framework.task.Task;

/* renamed from: com.amazon.android.framework.context.c */
final class C0080c implements Task {

    /* renamed from: a */
    private /* synthetic */ C0081d f944a;

    C0080c(C0081d dVar) {
        this.f944a = dVar;
    }

    public final void execute() {
        C0081d.m239a(this.f944a);
    }

    public final String toString() {
        return "ContextManager: init app shutdown on main thread";
    }
}
