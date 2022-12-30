package com.amazon.venezia.command;

import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.mas.kiwi.util.Base64;
import java.util.Map;

/* renamed from: com.amazon.venezia.command.b */
public abstract class C0192b extends Binder implements FailureResult {
    public C0192b() {
        attachInterface(this, "com.amazon.venezia.command.FailureResult");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case Base64.ENCODE:
                parcel.enforceInterface("com.amazon.venezia.command.FailureResult");
                String authToken = getAuthToken();
                parcel2.writeNoException();
                parcel2.writeString(authToken);
                return true;
            case Base64.GZIP:
                parcel.enforceInterface("com.amazon.venezia.command.FailureResult");
                String displayableName = getDisplayableName();
                parcel2.writeNoException();
                parcel2.writeString(displayableName);
                return true;
            case 3:
                parcel.enforceInterface("com.amazon.venezia.command.FailureResult");
                String displayableMessage = getDisplayableMessage();
                parcel2.writeNoException();
                parcel2.writeString(displayableMessage);
                return true;
            case Base64.DONT_GUNZIP:
                parcel.enforceInterface("com.amazon.venezia.command.FailureResult");
                String buttonLabel = getButtonLabel();
                parcel2.writeNoException();
                parcel2.writeString(buttonLabel);
                return true;
            case 5:
                parcel.enforceInterface("com.amazon.venezia.command.FailureResult");
                boolean show = show();
                parcel2.writeNoException();
                parcel2.writeInt(show ? 1 : 0);
                return true;
            case 6:
                parcel.enforceInterface("com.amazon.venezia.command.FailureResult");
                Map extensionData = getExtensionData();
                parcel2.writeNoException();
                parcel2.writeMap(extensionData);
                return true;
            case 1598968902:
                parcel2.writeString("com.amazon.venezia.command.FailureResult");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
