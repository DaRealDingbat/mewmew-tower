package com.amazon.android.licensing;

import com.amazon.android.framework.prompt.C0086e;
import com.amazon.android.framework.prompt.PromptContent;
import com.amazon.android.framework.prompt.PromptManager;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p013k.C0149c;
import com.amazon.android.p016n.C0175a;

/* renamed from: com.amazon.android.licensing.b */
public final class C0155b extends C0149c {

    /* renamed from: a */
    private static final KiwiLogger f1107a = new KiwiLogger("LicenseKillTask");
    @Resource

    /* renamed from: b */
    private C0175a f1108b;
    @Resource

    /* renamed from: c */
    private PromptManager f1109c;

    public final void execute() {
        if (KiwiLogger.TRACE_ON) {
            f1107a.trace("License Kill Task Executing!!!");
        }
        if (this.f1108b.mo449b("APPLICATION_LICENSE")) {
            f1107a.test("license verification succeeded");
            return;
        }
        if (KiwiLogger.TRACE_ON) {
            f1107a.trace("License Kill Task determined app is not licensed, killing app");
        }
        if (isWorkflowChild()) {
            quitParentWorkflow();
        }
        PromptContent promptContent = (PromptContent) this.f1108b.mo447a("LICENSE_FAILURE_CONTENT");
        if (promptContent != null) {
            if (KiwiLogger.TRACE_ON) {
                f1107a.trace("Fetched failure content from store: " + promptContent);
            }
            this.f1108b.f1152a.mo455c("LICENSE_FAILURE_CONTENT");
        } else {
            promptContent = C0162i.f1126e;
        }
        this.f1109c.present(new C0086e(promptContent));
    }
}
