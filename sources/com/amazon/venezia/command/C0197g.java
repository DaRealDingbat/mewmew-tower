package com.amazon.venezia.command;

import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.mas.kiwi.util.Base64;
import java.util.Map;

/* renamed from: com.amazon.venezia.command.g */
public abstract class C0197g extends Binder implements C0215y {
    public C0197g() {
        attachInterface(this, "com.amazon.venezia.command.ChoiceContext");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case Base64.ENCODE:
                parcel.enforceInterface("com.amazon.venezia.command.ChoiceContext");
                Map a = mo593a();
                parcel2.writeNoException();
                parcel2.writeMap(a);
                return true;
            case 1598968902:
                parcel2.writeString("com.amazon.venezia.command.ChoiceContext");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
