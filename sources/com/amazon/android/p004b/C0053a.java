package com.amazon.android.p004b;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.amazon.android.framework.exception.KiwiException;

/* renamed from: com.amazon.android.b.a */
public class C0053a extends KiwiException {
    private static final long serialVersionUID = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0053a(RemoteException remoteException) {
        super(remoteException instanceof DeadObjectException ? "COMMAND_SERVICE_DEAD_OBJECT_EXCEPTION" : "COMMAND_SERVICE_REMOTE_EXCEPTION");
    }
}
