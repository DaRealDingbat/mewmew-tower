package com.amazon.venezia.command;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.mas.kiwi.util.Base64;

/* renamed from: com.amazon.venezia.command.q */
public abstract class C0207q extends Binder implements C0198h {
    public C0207q() {
        attachInterface(this, "com.amazon.venezia.command.CommandService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C0213w dVar;
        C0196f tVar;
        switch (i) {
            case Base64.ENCODE:
                parcel.enforceInterface("com.amazon.venezia.command.CommandService");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    dVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.amazon.venezia.command.Command");
                    dVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C0213w)) ? new C0194d(readStrongBinder) : (C0213w) queryLocalInterface;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    tVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.amazon.venezia.command.ResultCallback");
                    tVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof C0196f)) ? new C0210t(readStrongBinder2) : (C0196f) queryLocalInterface2;
                }
                mo589a(dVar, tVar);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.amazon.venezia.command.CommandService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
