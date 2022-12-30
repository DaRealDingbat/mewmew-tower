package com.amazon.venezia.command;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.amazon.venezia.command.k */
final class C0201k implements C0215y {

    /* renamed from: a */
    private IBinder f1175a;

    C0201k(IBinder iBinder) {
        this.f1175a = iBinder;
    }

    /* renamed from: a */
    public final Map mo593a() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.amazon.venezia.command.ChoiceContext");
            this.f1175a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readHashMap(getClass().getClassLoader());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1175a;
    }
}
