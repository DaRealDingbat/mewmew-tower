package com.amazon.android.framework.task.command;

import android.os.Binder;
import android.os.RemoteException;
import com.amazon.venezia.command.C0200j;
import com.amazon.venezia.command.C0208r;
import com.amazon.venezia.command.FailureResult;
import com.amazon.venezia.command.SuccessResult;

/* renamed from: com.amazon.android.framework.task.command.m */
public final class C0116m {

    /* renamed from: a */
    String f1034a;

    /* renamed from: b */
    RemoteException f1035b;

    /* renamed from: c */
    SuccessResult f1036c;

    /* renamed from: d */
    FailureResult f1037d;

    /* renamed from: e */
    C0208r f1038e;

    /* renamed from: f */
    C0200j f1039f;

    /* renamed from: g */
    private int f1040g = Binder.getCallingUid();

    public C0116m(FailureResult failureResult) {
        this.f1037d = failureResult;
        try {
            this.f1034a = failureResult.getAuthToken();
        } catch (RemoteException e) {
            this.f1035b = e;
        }
    }

    public C0116m(SuccessResult successResult) {
        this.f1036c = successResult;
        try {
            this.f1034a = successResult.getAuthToken();
        } catch (RemoteException e) {
            this.f1035b = e;
        }
    }

    public C0116m(C0200j jVar) {
        this.f1039f = jVar;
    }

    public C0116m(C0208r rVar) {
        this.f1038e = rVar;
        try {
            this.f1034a = rVar.mo573a();
        } catch (RemoteException e) {
            this.f1035b = e;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommandResult: [");
        sb.append("CallingUid: ").append(this.f1040g).append(", SuccessResult: ").append(this.f1036c).append(", FailureResult: ").append(this.f1037d).append(", DecisionResult: ").append(this.f1038e).append(", ExceptionResult: ").append(this.f1039f).append("]");
        return sb.toString();
    }
}
