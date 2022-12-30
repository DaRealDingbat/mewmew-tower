package com.amazon.venezia.command;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.mas.kiwi.util.Base64;
import java.util.Map;

/* renamed from: com.amazon.venezia.command.c */
public abstract class C0193c extends Binder implements C0208r {
    public C0193c() {
        attachInterface(this, "com.amazon.venezia.command.DecisionResult");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C0209s uVar;
        switch (i) {
            case Base64.ENCODE:
                parcel.enforceInterface("com.amazon.venezia.command.DecisionResult");
                String a = mo573a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case Base64.GZIP:
                parcel.enforceInterface("com.amazon.venezia.command.DecisionResult");
                String b = mo576b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                parcel.enforceInterface("com.amazon.venezia.command.DecisionResult");
                String c = mo577c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case Base64.DONT_GUNZIP:
                parcel.enforceInterface("com.amazon.venezia.command.DecisionResult");
                long d = mo578d();
                parcel2.writeNoException();
                parcel2.writeLong(d);
                return true;
            case 5:
                parcel.enforceInterface("com.amazon.venezia.command.DecisionResult");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    uVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.amazon.venezia.command.DecisionExpirationContext");
                    uVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C0209s)) ? new C0211u(readStrongBinder) : (C0209s) queryLocalInterface;
                }
                mo574a(uVar);
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.amazon.venezia.command.DecisionResult");
                C0204n e = mo579e();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(e != null ? e.asBinder() : null);
                return true;
            case 7:
                parcel.enforceInterface("com.amazon.venezia.command.DecisionResult");
                C0204n f = mo580f();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(f != null ? f.asBinder() : null);
                return true;
            case Base64.DO_BREAK_LINES:
                parcel.enforceInterface("com.amazon.venezia.command.DecisionResult");
                C0204n g = mo581g();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(g != null ? g.asBinder() : null);
                return true;
            case 9:
                parcel.enforceInterface("com.amazon.venezia.command.DecisionResult");
                Map h = mo582h();
                parcel2.writeNoException();
                parcel2.writeMap(h);
                return true;
            case 1598968902:
                parcel2.writeString("com.amazon.venezia.command.DecisionResult");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
