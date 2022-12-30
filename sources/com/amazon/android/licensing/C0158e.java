package com.amazon.android.licensing;

import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.command.C0106c;
import com.amazon.android.p007e.C0070a;
import com.amazon.android.p013k.C0148b;

/* renamed from: com.amazon.android.licensing.e */
public final class C0158e extends C0148b {
    @Resource

    /* renamed from: a */
    private C0106c f1114a;

    public C0158e() {
        mo431a(new C0165l());
        mo431a(new C0070a());
        mo431a(new C0155b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo278a() {
        if (!isWorkflowChild()) {
            this.f1114a.mo379b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo279b() {
        return "LicenseEnforcementTaskWorkflow";
    }
}
