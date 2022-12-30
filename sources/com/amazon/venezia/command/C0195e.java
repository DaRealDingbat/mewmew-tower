package com.amazon.venezia.command;

import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.mas.kiwi.util.Base64;
import java.util.Map;

/* renamed from: com.amazon.venezia.command.e */
public abstract class C0195e extends Binder implements SuccessResult {
    public C0195e() {
        attachInterface(this, "com.amazon.venezia.command.SuccessResult");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case Base64.ENCODE:
                parcel.enforceInterface("com.amazon.venezia.command.SuccessResult");
                String authToken = getAuthToken();
                parcel2.writeNoException();
                parcel2.writeString(authToken);
                return true;
            case Base64.GZIP:
                parcel.enforceInterface("com.amazon.venezia.command.SuccessResult");
                Map data = getData();
                parcel2.writeNoException();
                parcel2.writeMap(data);
                return true;
            case 1598968902:
                parcel2.writeString("com.amazon.venezia.command.SuccessResult");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
