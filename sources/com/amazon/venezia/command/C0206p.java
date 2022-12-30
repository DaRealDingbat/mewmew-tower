package com.amazon.venezia.command;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.mas.kiwi.util.Base64;
import java.util.Map;

/* renamed from: com.amazon.venezia.command.p */
public abstract class C0206p extends Binder implements C0209s {
    public C0206p() {
        attachInterface(this, "com.amazon.venezia.command.DecisionExpirationContext");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case Base64.ENCODE:
                parcel.enforceInterface("com.amazon.venezia.command.DecisionExpirationContext");
                String a = mo389a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case Base64.GZIP:
                parcel.enforceInterface("com.amazon.venezia.command.DecisionExpirationContext");
                Map b = mo390b();
                parcel2.writeNoException();
                parcel2.writeMap(b);
                return true;
            case 1598968902:
                parcel2.writeString("com.amazon.venezia.command.DecisionExpirationContext");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
