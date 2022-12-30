package com.amazon.venezia.command;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.amazon.venezia.command.ab */
final class C0191ab implements FailureResult {

    /* renamed from: a */
    private IBinder f1173a;

    C0191ab(IBinder iBinder) {
        this.f1173a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f1173a;
    }

    public final String getAuthToken() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.FailureResult");
            this.f1173a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final String getButtonLabel() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.FailureResult");
            this.f1173a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final String getDisplayableMessage() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.FailureResult");
            this.f1173a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final String getDisplayableName() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.FailureResult");
            this.f1173a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final Map getExtensionData() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.FailureResult");
            this.f1173a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readHashMap(getClass().getClassLoader());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean show() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.FailureResult");
            this.f1173a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
