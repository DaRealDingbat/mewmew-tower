package com.amazon.android.p019q;

import android.os.RemoteException;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.command.AbstractCommandTask;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p005c.C0063b;
import com.amazon.android.p005c.C0065d;
import com.amazon.venezia.command.FailureResult;
import com.amazon.venezia.command.SuccessResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.amazon.android.q.a */
public final class C0184a extends AbstractCommandTask {

    /* renamed from: a */
    private static final KiwiLogger f1164a = new KiwiLogger("SubmitCrashReportsTask");
    @Resource

    /* renamed from: b */
    private C0065d f1165b;

    /* renamed from: c */
    private List f1166c;

    /* access modifiers changed from: protected */
    public final Map getCommandData() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (C0063b a : this.f1166c) {
            arrayList.add(a.mo288a());
        }
        hashMap.put("reports", arrayList);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final String getCommandName() {
        return "submit_crash_reports";
    }

    /* access modifiers changed from: protected */
    public final String getCommandVersion() {
        return "1.0";
    }

    /* access modifiers changed from: protected */
    public final boolean isExecutionNeeded() {
        return !this.f1166c.isEmpty();
    }

    /* access modifiers changed from: protected */
    public final void onFailure(FailureResult failureResult) throws RemoteException, KiwiException {
    }

    /* access modifiers changed from: protected */
    public final void onSuccess(SuccessResult successResult) throws RemoteException, KiwiException {
        this.f1165b.mo286a(this.f1166c);
    }

    /* access modifiers changed from: protected */
    public final void preExecution() throws KiwiException {
        this.f1166c = this.f1165b.mo285a();
        if (KiwiLogger.TRACE_ON) {
            f1164a.trace("--------------- Crash Reports -------------------");
            f1164a.trace("Size: " + this.f1166c.size());
            f1164a.trace("--------------------------------------------------");
        }
    }
}
