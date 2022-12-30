package com.amazon.android.p008f;

import android.app.Activity;
import com.amazon.android.framework.task.Task;

/* renamed from: com.amazon.android.f.d */
final class C0075d implements Task {

    /* renamed from: a */
    private /* synthetic */ C0072a f935a;

    /* renamed from: b */
    private /* synthetic */ C0074c f936b;

    C0075d(C0074c cVar, C0072a aVar) {
        this.f936b = cVar;
        this.f935a = aVar;
    }

    public final void execute() {
        Activity visible = this.f936b.f931d.getVisible();
        if (visible == null) {
            C0074c.f928a.trace("No activity to call startActivityForResult on. startActivityForResult when an activity becomes visible");
        } else {
            this.f935a.mo297a(visible);
        }
    }
}
