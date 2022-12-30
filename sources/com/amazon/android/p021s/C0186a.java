package com.amazon.android.p021s;

import android.os.RemoteException;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.task.command.AbstractCommandTask;
import com.amazon.venezia.command.FailureResult;
import com.amazon.venezia.command.SuccessResult;
import java.util.Map;

/* renamed from: com.amazon.android.s.a */
public final class C0186a extends AbstractCommandTask {

    /* renamed from: a */
    private Map f1168a;

    public C0186a(Map map) {
        this.f1168a = map;
    }

    /* access modifiers changed from: protected */
    public final Map getCommandData() {
        return this.f1168a;
    }

    /* access modifiers changed from: protected */
    public final String getCommandName() {
        return "lifeCycle_Events";
    }

    /* access modifiers changed from: protected */
    public final String getCommandVersion() {
        return "1.0";
    }

    /* access modifiers changed from: protected */
    public final boolean isExecutionNeeded() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onFailure(FailureResult failureResult) throws RemoteException, KiwiException {
    }

    /* access modifiers changed from: protected */
    public final void onSuccess(SuccessResult successResult) throws RemoteException, KiwiException {
    }
}
