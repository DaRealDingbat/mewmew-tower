package com.amazon.android;

import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p012j.C0146d;
import com.amazon.android.p015m.C0168a;
import com.amazon.android.p015m.C0170c;
import com.amazon.android.p015m.C0171d;
import com.amazon.android.p015m.C0173f;

/* renamed from: com.amazon.android.e */
final class C0069e implements C0170c {

    /* renamed from: a */
    private /* synthetic */ Kiwi f921a;

    C0069e(Kiwi kiwi) {
        this.f921a = kiwi;
    }

    /* renamed from: a */
    public final C0173f mo282a() {
        return C0146d.DESTROY;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo283a(C0171d dVar) {
        if (KiwiLogger.TRACE_ON) {
            Kiwi.LOGGER.trace("Beginning shutdown process for application: " + this.f921a.application.getPackageName());
        }
        Kiwi unused = Kiwi.INSTANCE = null;
    }

    /* renamed from: b */
    public final C0168a mo284b() {
        return C0168a.LAST;
    }
}
