package com.amazon.android.framework.task.command;

import android.os.RemoteException;
import com.amazon.venezia.command.C0200j;
import com.amazon.venezia.command.C0205o;
import com.amazon.venezia.command.C0208r;
import com.amazon.venezia.command.FailureResult;
import com.amazon.venezia.command.SuccessResult;

/* renamed from: com.amazon.android.framework.task.command.k */
final class C0114k extends C0205o {

    /* renamed from: a */
    private /* synthetic */ C0106c f1032a;

    C0114k(C0106c cVar) {
        this.f1032a = cVar;
    }

    /* renamed from: a */
    public final void mo393a(FailureResult failureResult) throws RemoteException {
        this.f1032a.f1006d.add(new C0116m(failureResult));
    }

    /* renamed from: a */
    public final void mo394a(SuccessResult successResult) throws RemoteException {
        this.f1032a.f1006d.add(new C0116m(successResult));
    }

    /* renamed from: a */
    public final void mo395a(C0200j jVar) throws RemoteException {
        this.f1032a.f1006d.add(new C0116m(jVar));
    }

    /* renamed from: a */
    public final void mo396a(C0208r rVar) throws RemoteException {
        this.f1032a.f1006d.add(new C0116m(rVar));
    }
}
