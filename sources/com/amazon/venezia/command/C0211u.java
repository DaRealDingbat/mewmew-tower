package com.amazon.venezia.command;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.amazon.venezia.command.u */
final class C0211u implements C0209s {

    /* renamed from: a */
    private IBinder f1178a;

    C0211u(IBinder iBinder) {
        this.f1178a = iBinder;
    }

    /* renamed from: a */
    public final String mo389a() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.DecisionExpirationContext");
            this.f1178a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1178a;
    }

    /* renamed from: b */
    public final Map mo390b() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.DecisionExpirationContext");
            this.f1178a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readHashMap(getClass().getClassLoader());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
