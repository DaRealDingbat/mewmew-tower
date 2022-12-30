package com.amazon.venezia.command;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.venezia.command.Choice;
import com.amazon.venezia.command.DecisionExpirationContext;
import java.util.Map;

public interface DecisionResult extends IInterface {
    void expire(DecisionExpirationContext decisionExpirationContext) throws RemoteException;

    String getAuthToken() throws RemoteException;

    long getDecisionDurationInSeconds() throws RemoteException;

    String getDescription() throws RemoteException;

    String getDisplayableName() throws RemoteException;

    Map getExtensionData() throws RemoteException;

    Choice getNegativeChoice() throws RemoteException;

    Choice getNeutralChoice() throws RemoteException;

    Choice getPositiveChoice() throws RemoteException;

    public static abstract class Stub extends Binder implements DecisionResult {
        private static final String DESCRIPTOR = "com.amazon.venezia.command.DecisionResult";
        static final int TRANSACTION_expire = 5;
        static final int TRANSACTION_getAuthToken = 1;
        static final int TRANSACTION_getDecisionDurationInSeconds = 4;
        static final int TRANSACTION_getDescription = 3;
        static final int TRANSACTION_getDisplayableName = 2;
        static final int TRANSACTION_getExtensionData = 9;
        static final int TRANSACTION_getNegativeChoice = 8;
        static final int TRANSACTION_getNeutralChoice = 7;
        static final int TRANSACTION_getPositiveChoice = 6;

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static DecisionResult asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (iin == null || !(iin instanceof DecisionResult)) {
                return new Proxy(obj);
            }
            return (DecisionResult) iin;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            IBinder iBinder;
            IBinder iBinder2;
            IBinder iBinder3;
            switch (code) {
                case 1:
                    data.enforceInterface(DESCRIPTOR);
                    String _result = getAuthToken();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                case 2:
                    data.enforceInterface(DESCRIPTOR);
                    String _result2 = getDisplayableName();
                    reply.writeNoException();
                    reply.writeString(_result2);
                    return true;
                case TRANSACTION_getDescription /*3*/:
                    data.enforceInterface(DESCRIPTOR);
                    String _result3 = getDescription();
                    reply.writeNoException();
                    reply.writeString(_result3);
                    return true;
                case 4:
                    data.enforceInterface(DESCRIPTOR);
                    long _result4 = getDecisionDurationInSeconds();
                    reply.writeNoException();
                    reply.writeLong(_result4);
                    return true;
                case TRANSACTION_expire /*5*/:
                    data.enforceInterface(DESCRIPTOR);
                    expire(DecisionExpirationContext.Stub.asInterface(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case TRANSACTION_getPositiveChoice /*6*/:
                    data.enforceInterface(DESCRIPTOR);
                    Choice _result5 = getPositiveChoice();
                    reply.writeNoException();
                    if (_result5 != null) {
                        iBinder3 = _result5.asBinder();
                    } else {
                        iBinder3 = null;
                    }
                    reply.writeStrongBinder(iBinder3);
                    return true;
                case TRANSACTION_getNeutralChoice /*7*/:
                    data.enforceInterface(DESCRIPTOR);
                    Choice _result6 = getNeutralChoice();
                    reply.writeNoException();
                    if (_result6 != null) {
                        iBinder2 = _result6.asBinder();
                    } else {
                        iBinder2 = null;
                    }
                    reply.writeStrongBinder(iBinder2);
                    return true;
                case 8:
                    data.enforceInterface(DESCRIPTOR);
                    Choice _result7 = getNegativeChoice();
                    reply.writeNoException();
                    if (_result7 != null) {
                        iBinder = _result7.asBinder();
                    } else {
                        iBinder = null;
                    }
                    reply.writeStrongBinder(iBinder);
                    return true;
                case TRANSACTION_getExtensionData /*9*/:
                    data.enforceInterface(DESCRIPTOR);
                    Map _result8 = getExtensionData();
                    reply.writeNoException();
                    reply.writeMap(_result8);
                    return true;
                case 1598968902:
                    reply.writeString(DESCRIPTOR);
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        private static class Proxy implements DecisionResult {
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public String getAuthToken() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, _data, _reply, 0);
                    _reply.readException();
                    return _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public String getDisplayableName() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, _data, _reply, 0);
                    _reply.readException();
                    return _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public String getDescription() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getDescription, _data, _reply, 0);
                    _reply.readException();
                    return _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public long getDecisionDurationInSeconds() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(4, _data, _reply, 0);
                    _reply.readException();
                    return _reply.readLong();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void expire(DecisionExpirationContext context) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeStrongBinder(context != null ? context.asBinder() : null);
                    this.mRemote.transact(Stub.TRANSACTION_expire, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public Choice getPositiveChoice() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getPositiveChoice, _data, _reply, 0);
                    _reply.readException();
                    return Choice.Stub.asInterface(_reply.readStrongBinder());
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public Choice getNeutralChoice() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getNeutralChoice, _data, _reply, 0);
                    _reply.readException();
                    return Choice.Stub.asInterface(_reply.readStrongBinder());
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public Choice getNegativeChoice() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(8, _data, _reply, 0);
                    _reply.readException();
                    return Choice.Stub.asInterface(_reply.readStrongBinder());
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public Map getExtensionData() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getExtensionData, _data, _reply, 0);
                    _reply.readException();
                    return _reply.readHashMap(getClass().getClassLoader());
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }
    }
}
