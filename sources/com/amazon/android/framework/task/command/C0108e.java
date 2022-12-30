package com.amazon.android.framework.task.command;

import android.content.DialogInterface;
import com.amazon.android.framework.util.KiwiLogger;

/* renamed from: com.amazon.android.framework.task.command.e */
final class C0108e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private /* synthetic */ C0117n f1017a;

    /* renamed from: b */
    private /* synthetic */ C0107d f1018b;

    C0108e(C0107d dVar, C0117n nVar) {
        this.f1018b = dVar;
        this.f1017a = nVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (KiwiLogger.TRACE_ON) {
            C0107d.f1013a.trace("Choice selected!");
        }
        if (this.f1018b.dismiss()) {
            this.f1018b.f1016d.add(this.f1017a);
        }
    }
}
