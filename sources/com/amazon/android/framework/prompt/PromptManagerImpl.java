package com.amazon.android.framework.prompt;

import android.app.Activity;
import android.app.Dialog;
import com.amazon.android.framework.context.ContextManager;
import com.amazon.android.framework.resource.C0098a;
import com.amazon.android.framework.resource.C0099b;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.TaskManager;
import com.amazon.android.framework.task.pipeline.TaskPipelineId;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p015m.C0170c;
import com.amazon.android.p015m.C0174g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class PromptManagerImpl implements PromptManager, C0099b {
    public static final KiwiLogger LOGGER = new KiwiLogger("PromptManagerImpl");
    @Resource
    private ContextManager contextManager;
    @Resource
    private C0174g eventManager;
    private final AtomicBoolean finished = new AtomicBoolean(false);
    private Set pending = new LinkedHashSet();
    @Resource
    private C0098a resourceManager;
    private Prompt showing;
    @Resource
    private TaskManager taskManager;

    /* access modifiers changed from: private */
    public void finish() {
        if (this.finished.compareAndSet(false, true)) {
            if (KiwiLogger.TRACE_ON) {
                LOGGER.trace("PromptManager finishing....");
            }
            Iterator it = this.pending.iterator();
            while (it.hasNext()) {
                it.remove();
                ((Prompt) it.next()).expire();
            }
            if (this.showing != null) {
                this.showing.dismiss();
            }
        }
    }

    private Prompt getNextPending() {
        if (this.pending.isEmpty()) {
            return null;
        }
        return (Prompt) this.pending.iterator().next();
    }

    /* access modifiers changed from: private */
    public void onResume(Activity activity) {
        if (this.showing != null) {
            show(this.showing, activity);
        } else {
            presentNextPending(activity);
        }
    }

    /* access modifiers changed from: private */
    public void presentImpl(Prompt prompt) {
        if (this.finished.get()) {
            if (KiwiLogger.ERROR_ON) {
                LOGGER.error("Prompt: " + prompt + " presented after app" + " destruction expiring it now!");
            }
            prompt.expire();
            return;
        }
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Presening Prompt: " + prompt);
        }
        prompt.register(this);
        this.pending.add(prompt);
        if (this.showing == null) {
            Activity visible = this.contextManager.getVisible();
            if (visible != null) {
                presentNextPending(visible);
            }
        } else if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Dialog currently showing, not presenting given dialog");
        }
    }

    private void presentNextPending(Activity activity) {
        Prompt nextPending = getNextPending();
        if (nextPending != null) {
            show(nextPending, activity);
        }
    }

    private void registerActivityResumedListener() {
        this.eventManager.mo442a((C0170c) new C0091j(this));
    }

    private void registerAppDestructionListener() {
        this.eventManager.mo442a((C0170c) new C0096o(this));
    }

    /* access modifiers changed from: private */
    public void removeExpiredPrompt(Prompt prompt) {
        this.pending.remove(prompt);
        if (this.showing == prompt) {
            this.showing = null;
            Activity visible = this.contextManager.getVisible();
            if (visible != null) {
                presentNextPending(visible);
            }
        }
    }

    private void show(Prompt prompt, Activity activity) {
        this.showing = prompt;
        prompt.show(activity);
    }

    public void observe(Prompt prompt) {
        this.taskManager.enqueue(TaskPipelineId.FOREGROUND, new C0089h(this, prompt));
    }

    public Dialog onCreateDialog(Activity activity, int i) {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("onCreateDialog, id: " + i + ", activity: " + activity);
        }
        if (this.showing == null) {
            if (KiwiLogger.TRACE_ON) {
                LOGGER.trace("Showing dialog is null, returning");
            }
            return null;
        } else if (this.showing.getIdentifier() != i) {
            if (KiwiLogger.TRACE_ON) {
                LOGGER.trace("Showing dialog id does not match given id: " + i + ", returning");
            }
            return null;
        } else {
            if (KiwiLogger.TRACE_ON) {
                LOGGER.trace("Creating dialog prompt: " + this.showing);
            }
            return this.showing.create(activity);
        }
    }

    public void onResourcesPopulated() {
        registerActivityResumedListener();
        registerAppDestructionListener();
    }

    public void onWindowFocusChanged(Activity activity, boolean z) {
        if (this.showing != null) {
            this.showing.onFocusChanged(activity, z);
        }
    }

    public void present(Prompt prompt) {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Scheduling presentation: " + prompt);
        }
        this.resourceManager.mo367b(prompt);
        if (this.finished.get()) {
            if (KiwiLogger.ERROR_ON) {
                LOGGER.error("Prompt: " + prompt + " presented after app" + " destruction expiring it now!");
            }
            prompt.expire();
            return;
        }
        this.taskManager.enqueue(TaskPipelineId.FOREGROUND, new C0094m(this, prompt));
    }
}
