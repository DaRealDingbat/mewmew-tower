package com.amazon.android.p010h;

import com.amazon.android.framework.task.Task;

/* renamed from: com.amazon.android.h.a */
final class C0136a implements Task {

    /* renamed from: a */
    private /* synthetic */ C0137b f1069a;

    C0136a(C0137b bVar) {
        this.f1069a = bVar;
    }

    public final void execute() {
        this.f1069a.expire();
    }

    public final String toString() {
        return "Expire: " + this.f1069a.toString();
    }
}
