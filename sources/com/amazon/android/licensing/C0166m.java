package com.amazon.android.licensing;

import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.prompt.PromptContent;
import com.amazon.android.p004b.C0057e;
import java.util.Map;

/* renamed from: com.amazon.android.licensing.m */
final class C0166m implements C0161h {

    /* renamed from: a */
    private Map f1142a;

    /* synthetic */ C0166m() {
        this((byte) 0);
    }

    private C0166m(byte b) {
        this.f1142a = new C0154a(this);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ PromptContent mo441a(KiwiException kiwiException) {
        PromptContent promptContent = (PromptContent) this.f1142a.get(((C0057e) kiwiException).getReason());
        return promptContent != null ? promptContent : C0162i.f1126e;
    }
}
