package com.amazon.android.framework.task.command;

import android.os.RemoteException;
import com.amazon.venezia.command.C0204n;
import com.amazon.venezia.command.C0208r;

/* renamed from: com.amazon.android.framework.task.command.g */
final class C0110g {

    /* renamed from: a */
    final String f1022a;

    /* renamed from: b */
    final String f1023b;

    /* renamed from: c */
    final long f1024c;

    /* renamed from: d */
    final C0117n f1025d;

    /* renamed from: e */
    final C0117n f1026e;

    /* renamed from: f */
    final C0117n f1027f;

    public C0110g(C0208r rVar) throws RemoteException {
        this.f1022a = rVar.mo576b();
        this.f1023b = rVar.mo577c();
        this.f1024c = rVar.mo578d();
        this.f1025d = m299a(rVar.mo579e());
        this.f1026e = m299a(rVar.mo580f());
        this.f1027f = m299a(rVar.mo581g());
    }

    /* renamed from: a */
    private static C0117n m299a(C0204n nVar) throws RemoteException {
        if (nVar == null) {
            return null;
        }
        return new C0117n(nVar);
    }
}
