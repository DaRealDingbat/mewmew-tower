package com.amazon.android.p007e;

import android.os.RemoteException;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.command.AbstractCommandTask;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p018p.C0180a;
import com.amazon.android.p018p.C0181b;
import com.amazon.android.p018p.C0183d;
import com.amazon.venezia.command.FailureResult;
import com.amazon.venezia.command.SuccessResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.amazon.android.e.a */
public final class C0070a extends AbstractCommandTask {

    /* renamed from: a */
    private static final KiwiLogger f922a = new KiwiLogger("SubmitMetricsTask");
    @Resource

    /* renamed from: b */
    private C0183d f923b;

    /* renamed from: c */
    private C0180a f924c;

    /* access modifiers changed from: protected */
    public final Map getCommandData() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(this.f924c.mo458b());
        Iterator it = this.f924c.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0181b) it.next()).f1161a);
        }
        hashMap.put("metrics", arrayList);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final String getCommandName() {
        return "submit_metrics";
    }

    /* access modifiers changed from: protected */
    public final String getCommandVersion() {
        return "1.0";
    }

    /* access modifiers changed from: protected */
    public final boolean isExecutionNeeded() {
        return !this.f924c.mo457a();
    }

    /* access modifiers changed from: protected */
    public final void onFailure(FailureResult failureResult) throws RemoteException, KiwiException {
    }

    /* access modifiers changed from: protected */
    public final void onSuccess(SuccessResult successResult) throws RemoteException, KiwiException {
    }

    /* access modifiers changed from: protected */
    public final void preExecution() throws KiwiException {
        this.f924c = this.f923b.mo463a();
        if (KiwiLogger.TRACE_ON) {
            f922a.trace("--------------- SUBMIT METRICS -------------------");
            f922a.trace("Size: " + this.f924c.mo458b());
            f922a.trace("--------------------------------------------------");
        }
    }
}
