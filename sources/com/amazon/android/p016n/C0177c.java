package com.amazon.android.p016n;

import com.amazon.android.framework.util.KiwiLogger;
import java.util.Date;

/* renamed from: com.amazon.android.n.c */
final class C0177c extends C0176b {

    /* renamed from: b */
    private /* synthetic */ C0178d f1156b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0177c(C0178d dVar, Object obj, Date date) {
        super(obj, date);
        this.f1156b = dVar;
    }

    /* access modifiers changed from: protected */
    public final void doExpiration() {
        if (KiwiLogger.ERROR_ON) {
            C0178d.f1157a.error("Woah, non-expirable value was expired!!!!");
        }
    }
}
