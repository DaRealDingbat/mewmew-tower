package com.amazon.android;

import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.command.C0106c;
import com.amazon.android.licensing.C0158e;
import com.amazon.android.p013k.C0148b;
import com.amazon.android.p019q.C0184a;

/* renamed from: com.amazon.android.a */
public final class C0049a extends C0148b {
    @Resource

    /* renamed from: a */
    private C0106c f907a;

    public C0049a() {
        mo431a(new C0132g());
        mo431a(new C0184a());
        mo431a(new C0158e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo278a() {
        if (!isWorkflowChild()) {
            this.f907a.mo379b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo279b() {
        return "DrmFullApplicationLaunchTaskWorkflow";
    }
}
