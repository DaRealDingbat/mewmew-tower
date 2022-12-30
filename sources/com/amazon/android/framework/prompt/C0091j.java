package com.amazon.android.framework.prompt;

import com.amazon.android.p012j.C0144b;
import com.amazon.android.p012j.C0145c;
import com.amazon.android.p015m.C0168a;
import com.amazon.android.p015m.C0170c;
import com.amazon.android.p015m.C0171d;
import com.amazon.android.p015m.C0173f;

/* renamed from: com.amazon.android.framework.prompt.j */
final class C0091j implements C0170c {

    /* renamed from: a */
    private /* synthetic */ PromptManagerImpl f978a;

    C0091j(PromptManagerImpl promptManagerImpl) {
        this.f978a = promptManagerImpl;
    }

    /* renamed from: a */
    public final C0173f mo282a() {
        return C0145c.RESUME;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo283a(C0171d dVar) {
        this.f978a.onResume(((C0144b) dVar).f1075a);
    }

    /* renamed from: b */
    public final C0168a mo284b() {
        return C0168a.MIDDLE;
    }
}
