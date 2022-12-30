package com.amazon.android.framework.prompt;

import com.amazon.android.p012j.C0146d;
import com.amazon.android.p015m.C0168a;
import com.amazon.android.p015m.C0170c;
import com.amazon.android.p015m.C0171d;
import com.amazon.android.p015m.C0173f;

/* renamed from: com.amazon.android.framework.prompt.o */
final class C0096o implements C0170c {

    /* renamed from: a */
    private /* synthetic */ PromptManagerImpl f985a;

    C0096o(PromptManagerImpl promptManagerImpl) {
        this.f985a = promptManagerImpl;
    }

    /* renamed from: a */
    public final C0173f mo282a() {
        return C0146d.DESTROY;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo283a(C0171d dVar) {
        this.f985a.finish();
    }

    /* renamed from: b */
    public final C0168a mo284b() {
        return C0168a.FIRST;
    }
}
