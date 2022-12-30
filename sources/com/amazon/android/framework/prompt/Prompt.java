package com.amazon.android.framework.prompt;

import android.app.Activity;
import android.app.Dialog;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.pipeline.TaskPipelineId;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p006d.C0067a;
import com.amazon.android.p010h.C0138c;
import com.amazon.android.p016n.C0175a;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Prompt extends C0138c {
    private static final KiwiLogger LOGGER = new KiwiLogger("Prompt");
    private Activity context;
    @Resource
    private C0175a dataStore;
    private Dialog dialog;
    private final AtomicBoolean dismissed = new AtomicBoolean(false);
    private final int identifier = createIdentifier();
    private C0087f manualExpirationReason;

    public Prompt() {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Creating Prompt: " + this.identifier);
        }
    }

    private int createIdentifier() {
        int nextInt = new Random().nextInt(2146249079) + 1234567;
        if (nextInt <= 1234567) {
            return 1234567;
        }
        return nextInt;
    }

    private void dismissDialog() {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.error("Dismissing dialog: " + this.identifier);
        }
        try {
            this.context.dismissDialog(this.identifier);
            this.context.removeDialog(this.identifier);
        } catch (Exception e) {
            if (KiwiLogger.TRACE_ON) {
                LOGGER.error("Unable to remove dialog: " + this.identifier);
            }
        }
        this.context = null;
        this.dialog = null;
    }

    private void expire(C0087f fVar) {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Expiring prompt pre-maturely: id: " + getIdentifier() + ", prompt: " + this + "," + ", reason: " + fVar);
        }
        this.manualExpirationReason = fVar;
        expire();
    }

    private boolean isCompatible(Activity activity) {
        if (this.dataStore.mo449b("TEST_MODE")) {
            return false;
        }
        return doCompatibilityCheck(activity);
    }

    private void showDialog(Activity activity) {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Showing prompt, id: " + getIdentifier() + ", prompt: " + this + ", activity: " + activity);
        }
        if (this.context != null) {
            dismissDialog();
        }
        activity.showDialog(getIdentifier());
    }

    public final Dialog create(Activity activity) {
        this.context = activity;
        this.dialog = doCreate(activity);
        this.dialog.setCancelable(false);
        this.dialog.setOnKeyListener(new C0085d(this));
        return this.dialog;
    }

    /* access modifiers changed from: protected */
    public final boolean dismiss() {
        C0067a.m218a();
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Dismissing Prompt: " + this.identifier);
        }
        if (!this.dismissed.compareAndSet(false, true)) {
            if (KiwiLogger.TRACE_ON) {
                LOGGER.error("Prompt has already been dismissed");
            }
            return false;
        }
        if (this.context != null) {
            dismissDialog();
        }
        discard();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean doCompatibilityCheck(Activity activity) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract Dialog doCreate(Activity activity);

    /* access modifiers changed from: protected */
    public final void doExpiration() {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Expiring prompt: " + this);
        }
        this.taskManager.enqueue(TaskPipelineId.FOREGROUND, new C0084c(this));
        doExpiration(getExpirationReason());
    }

    /* access modifiers changed from: protected */
    public abstract void doExpiration(C0087f fVar);

    /* access modifiers changed from: protected */
    public C0087f getExpirationReason() {
        if (!isExpired()) {
            return null;
        }
        return this.manualExpirationReason == null ? C0087f.EXPIRATION_DURATION_ELAPSED : this.manualExpirationReason;
    }

    public int getIdentifier() {
        return this.identifier;
    }

    public void onFocusChanged(Activity activity, boolean z) {
        if (activity != this.context) {
            if (KiwiLogger.TRACE_ON) {
                LOGGER.trace("Unrecognized context");
            }
        } else if (z && !this.dialog.isShowing()) {
            if (KiwiLogger.TRACE_ON) {
                LOGGER.trace("showing dialog because it was not showing");
            }
            this.dialog.show();
        }
    }

    public final void show(Activity activity) {
        C0067a.m219a((Object) activity, "activity");
        C0067a.m218a();
        if (isCompatible(activity)) {
            showDialog(activity);
        } else {
            expire(C0087f.NOT_COMPATIBLE);
        }
    }
}
