package com.amazon.android.licensing;

import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.prompt.PromptContent;

/* renamed from: com.amazon.android.licensing.g */
final class C0160g implements C0161h {

    /* renamed from: a */
    private /* synthetic */ PromptContent f1120a;

    /* renamed from: b */
    private /* synthetic */ LicenseFailurePromptContentMapper f1121b;

    C0160g(LicenseFailurePromptContentMapper licenseFailurePromptContentMapper, PromptContent promptContent) {
        this.f1121b = licenseFailurePromptContentMapper;
        this.f1120a = promptContent;
    }

    /* renamed from: a */
    public final PromptContent mo441a(KiwiException kiwiException) {
        return this.f1120a;
    }
}
