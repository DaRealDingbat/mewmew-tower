package com.amazon.venezia.command;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.mas.kiwi.util.Base64;
import java.util.Map;

/* renamed from: com.amazon.venezia.command.m */
public abstract class C0203m extends Binder implements C0204n {
    public C0203m() {
        attachInterface(this, "com.amazon.venezia.command.Choice");
    }

    /* renamed from: a */
    public static C0204n m444a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.amazon.venezia.command.Choice");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0204n)) ? new C0189a(iBinder) : (C0204n) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C0215y kVar;
        switch (i) {
            case Base64.ENCODE:
                parcel.enforceInterface("com.amazon.venezia.command.Choice");
                String a = mo568a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case Base64.GZIP:
                parcel.enforceInterface("com.amazon.venezia.command.Choice");
                Intent b = mo571b();
                parcel2.writeNoException();
                if (b != null) {
                    parcel2.writeInt(1);
                    b.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 3:
                parcel.enforceInterface("com.amazon.venezia.command.Choice");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    kVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.amazon.venezia.command.ChoiceContext");
                    kVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C0215y)) ? new C0201k(readStrongBinder) : (C0215y) queryLocalInterface;
                }
                mo569a(kVar);
                parcel2.writeNoException();
                return true;
            case Base64.DONT_GUNZIP:
                parcel.enforceInterface("com.amazon.venezia.command.Choice");
                Map c = mo572c();
                parcel2.writeNoException();
                parcel2.writeMap(c);
                return true;
            case 1598968902:
                parcel2.writeString("com.amazon.venezia.command.Choice");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
