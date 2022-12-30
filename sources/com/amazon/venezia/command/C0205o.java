package com.amazon.venezia.command;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.mas.kiwi.util.Base64;

/* renamed from: com.amazon.venezia.command.o */
public abstract class C0205o extends Binder implements C0196f {
    public C0205o() {
        attachInterface(this, "com.amazon.venezia.command.ResultCallback");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C0200j vVar;
        C0208r aaVar;
        FailureResult abVar;
        SuccessResult xVar;
        switch (i) {
            case Base64.ENCODE:
                parcel.enforceInterface("com.amazon.venezia.command.ResultCallback");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    xVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.amazon.venezia.command.SuccessResult");
                    xVar = (queryLocalInterface == null || !(queryLocalInterface instanceof SuccessResult)) ? new C0214x(readStrongBinder) : (SuccessResult) queryLocalInterface;
                }
                mo394a(xVar);
                parcel2.writeNoException();
                return true;
            case Base64.GZIP:
                parcel.enforceInterface("com.amazon.venezia.command.ResultCallback");
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    abVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.amazon.venezia.command.FailureResult");
                    abVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof FailureResult)) ? new C0191ab(readStrongBinder2) : (FailureResult) queryLocalInterface2;
                }
                mo393a(abVar);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.amazon.venezia.command.ResultCallback");
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    aaVar = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.amazon.venezia.command.DecisionResult");
                    aaVar = (queryLocalInterface3 == null || !(queryLocalInterface3 instanceof C0208r)) ? new C0190aa(readStrongBinder3) : (C0208r) queryLocalInterface3;
                }
                mo396a(aaVar);
                parcel2.writeNoException();
                return true;
            case Base64.DONT_GUNZIP:
                parcel.enforceInterface("com.amazon.venezia.command.ResultCallback");
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    vVar = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.amazon.venezia.command.ExceptionResult");
                    vVar = (queryLocalInterface4 == null || !(queryLocalInterface4 instanceof C0200j)) ? new C0212v(readStrongBinder4) : (C0200j) queryLocalInterface4;
                }
                mo395a(vVar);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.amazon.venezia.command.ResultCallback");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
