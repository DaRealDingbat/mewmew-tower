package com.amazon.android.licensing;

import com.amazon.android.framework.task.pipeline.TaskPipelineId;
import com.amazon.android.p016n.C0176b;
import java.util.Date;

/* renamed from: com.amazon.android.licensing.d */
final class C0157d extends C0176b {

    /* renamed from: b */
    private /* synthetic */ C0165l f1113b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0157d(C0165l lVar, Object obj, Date date) {
        super(obj, date);
        this.f1113b = lVar;
    }

    public final void doExpiration() {
        this.taskManager.enqueue(TaskPipelineId.COMMAND, new C0165l());
    }
}
