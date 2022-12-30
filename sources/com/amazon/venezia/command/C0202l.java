package com.amazon.venezia.command;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.amazon.venezia.command.l */
public final class C0202l implements C0198h {

    /* renamed from: a */
    private IBinder f1176a;

    public C0202l(IBinder iBinder) {
        this.f1176a = iBinder;
    }

    /* renamed from: a */
    public final void mo589a(C0213w wVar, C0196f fVar) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.CommandService");
            obtain.writeStrongBinder(wVar != null ? wVar.asBinder() : null);
            obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
            this.f1176a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1176a;
    }
}
