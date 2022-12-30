package com.amazon.android.framework.task.command;

import android.os.RemoteException;
import com.amazon.venezia.command.C0206p;
import java.util.Map;

/* renamed from: com.amazon.android.framework.task.command.i */
final class C0112i extends C0206p {

    /* renamed from: a */
    private /* synthetic */ C0105b f1029a;

    /* renamed from: b */
    private /* synthetic */ C0106c f1030b;

    C0112i(C0106c cVar, C0105b bVar) {
        this.f1030b = cVar;
        this.f1029a = bVar;
    }

    /* renamed from: a */
    public final String mo389a() throws RemoteException {
        return this.f1029a.name();
    }

    /* renamed from: b */
    public final Map mo390b() throws RemoteException {
        return null;
    }
}
