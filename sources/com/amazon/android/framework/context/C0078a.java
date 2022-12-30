package com.amazon.android.framework.context;

import android.app.Activity;
import com.amazon.android.framework.task.Task;

/* renamed from: com.amazon.android.framework.context.a */
final class C0078a implements Task {

    /* renamed from: a */
    private /* synthetic */ C0081d f942a;

    C0078a(C0081d dVar) {
        this.f942a = dVar;
    }

    public final void execute() {
        Activity root = this.f942a.getRoot();
        C0081d.f945a.trace("Finishing Root Task: " + root);
        if (root != null) {
            C0081d.f945a.trace("Finishing Root");
            root.finish();
        }
    }

    public final String toString() {
        return "ContextManager: kill root task";
    }
}
