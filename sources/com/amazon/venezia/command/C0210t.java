package com.amazon.venezia.command;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.amazon.venezia.command.t */
final class C0210t implements C0196f {

    /* renamed from: a */
    private IBinder f1177a;

    C0210t(IBinder iBinder) {
        this.f1177a = iBinder;
    }

    /* renamed from: a */
    public final void mo393a(FailureResult failureResult) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.ResultCallback");
            obtain.writeStrongBinder(failureResult != null ? failureResult.asBinder() : null);
            this.f1177a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo394a(SuccessResult successResult) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.ResultCallback");
            obtain.writeStrongBinder(successResult != null ? successResult.asBinder() : null);
            this.f1177a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo395a(C0200j jVar) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.ResultCallback");
            obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
            this.f1177a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo396a(C0208r rVar) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.ResultCallback");
            obtain.writeStrongBinder(rVar != null ? rVar.asBinder() : null);
            this.f1177a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1177a;
    }
}
