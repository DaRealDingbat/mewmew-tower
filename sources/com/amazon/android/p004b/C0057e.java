package com.amazon.android.p004b;

import android.os.RemoteException;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.venezia.command.C0200j;

/* renamed from: com.amazon.android.b.e */
public class C0057e extends KiwiException {
    private static final long serialVersionUID = 1;

    public C0057e(C0200j jVar) throws RemoteException {
        super("EXCEPTION_RESULT_FAILURE", jVar.mo591a());
    }
}
