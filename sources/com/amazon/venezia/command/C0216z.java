package com.amazon.venezia.command;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.mas.kiwi.util.Base64;
import java.util.Map;

/* renamed from: com.amazon.venezia.command.z */
public abstract class C0216z extends Binder implements C0213w {
    public C0216z() {
        attachInterface(this, "com.amazon.venezia.command.Command");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case Base64.ENCODE:
                parcel.enforceInterface("com.amazon.venezia.command.Command");
                String a = mo385a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case Base64.GZIP:
                parcel.enforceInterface("com.amazon.venezia.command.Command");
                String b = mo386b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                parcel.enforceInterface("com.amazon.venezia.command.Command");
                String c = mo387c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case Base64.DONT_GUNZIP:
                parcel.enforceInterface("com.amazon.venezia.command.Command");
                Map d = mo388d();
                parcel2.writeNoException();
                parcel2.writeMap(d);
                return true;
            case 1598968902:
                parcel2.writeString("com.amazon.venezia.command.Command");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
