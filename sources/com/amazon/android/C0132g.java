package com.amazon.android;

import android.os.RemoteException;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.prompt.C0086e;
import com.amazon.android.framework.prompt.PromptContent;
import com.amazon.android.framework.prompt.PromptManager;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.command.AbstractCommandTask;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.venezia.command.FailureResult;
import com.amazon.venezia.command.SuccessResult;
import java.util.Map;

/* renamed from: com.amazon.android.g */
public final class C0132g extends AbstractCommandTask {

    /* renamed from: a */
    private static final KiwiLogger f1067a = new KiwiLogger("CheckIfAppisBlockedTask");
    @Resource

    /* renamed from: b */
    private PromptManager f1068b;

    /* access modifiers changed from: protected */
    public final Map getCommandData() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final String getCommandName() {
        return "check_blocked_status";
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
        if (isWorkflowChild()) {
            quitParentWorkflow();
        }
        f1067a.test("app is blocked, killing");
        this.f1068b.present(new C0086e(new PromptContent(failureResult.getDisplayableName(), failureResult.getDisplayableMessage(), failureResult.getButtonLabel(), failureResult.show())));
    }

    /* access modifiers changed from: protected */
    public final void onSuccess(SuccessResult successResult) throws RemoteException, KiwiException {
        if (successResult.getData() != null && successResult.getData().containsKey("verbose")) {
            boolean booleanValue = ((Boolean) successResult.getData().get("verbose")).booleanValue();
            KiwiLogger.ERROR_ON = booleanValue;
            KiwiLogger.TRACE_ON = booleanValue;
        }
    }
}
