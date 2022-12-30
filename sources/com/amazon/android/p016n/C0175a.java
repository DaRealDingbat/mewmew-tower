package com.amazon.android.p016n;

import com.amazon.android.framework.resource.C0098a;
import com.amazon.android.framework.resource.C0099b;
import com.amazon.android.framework.resource.Resource;

/* renamed from: com.amazon.android.n.a */
public final class C0175a implements C0099b {

    /* renamed from: a */
    public C0178d f1152a = new C0178d();
    @Resource

    /* renamed from: b */
    private C0098a f1153b;

    /* renamed from: a */
    public final Object mo447a(String str) {
        return this.f1152a.mo454b(str);
    }

    /* renamed from: a */
    public final void mo448a(String str, Object obj) {
        this.f1152a.mo452a(str, obj);
    }

    /* renamed from: b */
    public final boolean mo449b(String str) {
        return this.f1152a.mo453a(str);
    }

    public final void onResourcesPopulated() {
        this.f1153b.mo367b(this.f1152a);
    }

    public final String toString() {
        return this.f1152a.toString();
    }
}
