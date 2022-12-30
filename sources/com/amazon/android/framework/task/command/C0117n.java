package com.amazon.android.framework.task.command;

import android.content.Intent;
import android.os.RemoteException;
import com.amazon.venezia.command.C0204n;

/* renamed from: com.amazon.android.framework.task.command.n */
final class C0117n {

    /* renamed from: a */
    final C0204n f1041a;

    /* renamed from: b */
    final String f1042b;

    /* renamed from: c */
    final Intent f1043c;

    public C0117n(C0204n nVar) throws RemoteException {
        this.f1041a = nVar;
        this.f1042b = nVar.mo568a();
        this.f1043c = nVar.mo571b();
    }
}
