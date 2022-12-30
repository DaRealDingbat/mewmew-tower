package com.amazon.venezia.command;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.amazon.venezia.command.d */
final class C0194d implements C0213w {

    /* renamed from: a */
    private IBinder f1174a;

    C0194d(IBinder iBinder) {
        this.f1174a = iBinder;
    }

    /* renamed from: a */
    public final String mo385a() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.Command");
            this.f1174a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1174a;
    }

    /* renamed from: b */
    public final String mo386b() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.Command");
            this.f1174a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: c */
    public final String mo387c() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.Command");
            this.f1174a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: d */
    public final Map mo388d() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.Command");
            this.f1174a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readHashMap(getClass().getClassLoader());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
