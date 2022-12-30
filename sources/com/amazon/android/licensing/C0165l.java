package com.amazon.android.licensing;

import android.app.Application;
import android.os.RemoteException;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.prompt.PromptContent;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.TaskManager;
import com.amazon.android.framework.task.command.AbstractCommandTask;
import com.amazon.android.framework.task.pipeline.TaskPipelineId;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p011i.C0140a;
import com.amazon.android.p011i.C0141b;
import com.amazon.android.p014l.C0152c;
import com.amazon.android.p014l.C0153d;
import com.amazon.android.p016n.C0175a;
import com.amazon.android.p016n.C0176b;
import com.amazon.android.p017o.C0179a;
import com.amazon.android.p018p.C0183d;
import com.amazon.android.p020r.C0185a;
import com.amazon.mas.kiwi.util.BC1;
import com.amazon.venezia.command.FailureResult;
import com.amazon.venezia.command.SuccessResult;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

/* renamed from: com.amazon.android.licensing.l */
public final class C0165l extends AbstractCommandTask {

    /* renamed from: a */
    private static final KiwiLogger f1135a = new KiwiLogger("VerifyApplicationEntitlmentTask");

    /* renamed from: b */
    private LicenseFailurePromptContentMapper f1136b = new LicenseFailurePromptContentMapper();
    @Resource

    /* renamed from: c */
    private C0183d f1137c;
    @Resource

    /* renamed from: d */
    private Application f1138d;
    @Resource

    /* renamed from: e */
    private TaskManager f1139e;
    @Resource

    /* renamed from: f */
    private C0175a f1140f;
    @Resource

    /* renamed from: g */
    private C0152c f1141g;

    /* access modifiers changed from: protected */
    public final Map getCommandData() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final String getCommandName() {
        return "get_license";
    }

    /* access modifiers changed from: protected */
    public final String getCommandVersion() {
        return "1.0";
    }

    /* access modifiers changed from: protected */
    public final boolean isExecutionNeeded() {
        return this.f1140f.mo447a("APPLICATION_LICENSE") == null;
    }

    /* access modifiers changed from: protected */
    public final void onException(KiwiException kiwiException) {
        PromptContent map = this.f1136b.map(kiwiException);
        if (map == null && KiwiLogger.ERROR_ON) {
            f1135a.error("No mapping specified for exception: " + kiwiException, kiwiException);
        }
        this.f1140f.mo448a("LICENSE_FAILURE_CONTENT", map);
        this.f1140f.mo448a("LICENSE_FAILURE_RAW_EXCEPTION", kiwiException.getClass().getName());
    }

    /* access modifiers changed from: protected */
    public final void onFailure(FailureResult failureResult) throws RemoteException, KiwiException {
        PromptContent promptContent = new PromptContent(failureResult.getDisplayableName(), failureResult.getDisplayableMessage(), failureResult.getButtonLabel(), failureResult.show());
        f1135a.trace("onFailure: " + promptContent);
        this.f1140f.mo448a("LICENSE_FAILURE_CONTENT", promptContent);
    }

    /* access modifiers changed from: protected */
    public final void onSuccess(SuccessResult successResult) throws RemoteException, KiwiException {
        C0156c cVar = new C0156c(successResult.getData());
        C0159f fVar = new C0159f(new C0153d(cVar.f1110a, this.f1141g.mo437a()));
        C0140a aVar = new C0140a();
        aVar.mo422a(cVar.f1111b, fVar.f1116b, C0164k.CUSTOMER_ID);
        aVar.mo422a(cVar.f1112c, fVar.f1117c, C0164k.DEVICE_ID);
        aVar.mo422a(fVar.f1119e, this.f1138d.getPackageName(), C0164k.PACKAGE_NAME);
        Date date = fVar.f1118d;
        Date date2 = new Date();
        C0164k kVar = C0164k.EXPIRATION;
        if (date.compareTo(date2) <= 0) {
            aVar.f1070a.put(kVar, new C0141b(kVar, "'" + date + "' <= '" + date2 + "'"));
        }
        try {
            aVar.mo422a(fVar.f1115a, BC1.getBC1ChecksumBase64(this.f1138d.getPackageCodePath()), C0164k.CHECKSUM);
        } catch (IOException e) {
            C0164k kVar2 = C0164k.CHECKSUM;
            aVar.f1070a.put(kVar2, new C0141b(kVar2, "Exception: " + e));
        }
        if (aVar.mo423a()) {
            throw new C0185a(aVar);
        }
        f1135a.trace("License Verification succeeded!");
        this.f1140f.f1152a.mo451a("APPLICATION_LICENSE", (C0176b) new C0157d(this, fVar, fVar.f1118d));
        this.f1137c.mo464a(new C0179a());
        this.f1139e.enqueue(TaskPipelineId.BACKGROUND, new C0167n());
    }
}
