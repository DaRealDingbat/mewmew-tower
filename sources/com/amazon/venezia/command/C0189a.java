package com.amazon.venezia.command;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.amazon.venezia.command.a */
final class C0189a implements C0204n {

    /* renamed from: a */
    private IBinder f1171a;

    C0189a(IBinder iBinder) {
        this.f1171a = iBinder;
    }

    /* renamed from: a */
    public final String mo568a() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.Choice");
            this.f1171a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public final void mo569a(C0215y yVar) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.Choice");
            obtain.writeStrongBinder(yVar != null ? yVar.asBinder() : null);
            this.f1171a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1171a;
    }

    /* renamed from: b */
    public final Intent mo571b() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.Choice");
            this.f1171a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: c */
    public final Map mo572c() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.Choice");
            this.f1171a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readHashMap(getClass().getClassLoader());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
