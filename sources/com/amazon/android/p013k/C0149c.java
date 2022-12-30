package com.amazon.android.p013k;

import com.amazon.android.p006d.C0067a;

/* renamed from: com.amazon.android.k.c */
public abstract class C0149c implements C0147a {
    private C0148b workflow;

    /* access modifiers changed from: protected */
    public final boolean isWorkflowChild() {
        return this.workflow != null;
    }

    /* access modifiers changed from: protected */
    public final void quitParentWorkflow() {
        C0067a.m221a(isWorkflowChild(), "task is no a workflow child");
        this.workflow.mo432c();
    }

    public final void setWorkflow(C0148b bVar) {
        C0067a.m219a((Object) bVar, "workflow");
        C0067a.m221a(this.workflow == null, "workflow instance can only be set once");
        this.workflow = bVar;
    }
}
