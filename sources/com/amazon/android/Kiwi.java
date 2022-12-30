package com.amazon.android;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import com.amazon.android.framework.context.C0081d;
import com.amazon.android.framework.context.ContextManager;
import com.amazon.android.framework.prompt.PromptManager;
import com.amazon.android.framework.prompt.PromptManagerImpl;
import com.amazon.android.framework.resource.C0099b;
import com.amazon.android.framework.resource.C0100c;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.C0101a;
import com.amazon.android.framework.task.Task;
import com.amazon.android.framework.task.TaskManager;
import com.amazon.android.framework.task.command.AbstractCommandTask;
import com.amazon.android.framework.task.command.C0106c;
import com.amazon.android.framework.task.command.C0109f;
import com.amazon.android.framework.task.pipeline.TaskPipelineId;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p005c.C0062a;
import com.amazon.android.p006d.C0067a;
import com.amazon.android.p008f.C0073b;
import com.amazon.android.p008f.C0074c;
import com.amazon.android.p008f.C0077f;
import com.amazon.android.p009g.C0133a;
import com.amazon.android.p014l.C0150a;
import com.amazon.android.p014l.C0152c;
import com.amazon.android.p015m.C0169b;
import com.amazon.android.p015m.C0170c;
import com.amazon.android.p015m.C0174g;
import com.amazon.android.p016n.C0175a;
import com.amazon.android.p018p.C0182c;

public final class Kiwi implements C0099b {
    protected static final String ACTIVITY_NAME = "ActivityName";
    protected static final String EVENT_NAME = "EventName";
    /* access modifiers changed from: private */
    public static Kiwi INSTANCE = null;
    /* access modifiers changed from: private */
    public static final KiwiLogger LOGGER = new KiwiLogger("Kiwi");
    protected static final String TIMESTAMP = "Timestamp";
    /* access modifiers changed from: private */
    @Resource
    public Application application;
    @Resource
    private C0152c authKeyLoader;
    @Resource
    private ContextManager contextManager;
    @Resource
    private C0175a dataStore;
    private final boolean drmEnabled;
    @Resource
    private C0174g eventManager;
    @Resource
    private PromptManager promptManager;
    @Resource
    private C0073b resultManager;
    @Resource
    private TaskManager taskManager;

    private Kiwi(Application application2, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        this.drmEnabled = z;
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Starting initialization process for application: " + application2.getPackageName());
            LOGGER.trace("DRM enabled: " + z);
        }
        instantiateTheWorld(application2);
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Kiwi.Constructor Time: " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Deprecated
    public static void addCommandToCommandTaskPipeline(AbstractCommandTask abstractCommandTask) {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("WARNING: Use of deprecated method detected.");
        }
        if (isInitialized()) {
            unsafeAddCommandToCommandTaskPipeline(abstractCommandTask);
        } else {
            LOGGER.error("Kiwi subsystem is not fully initialized.  Cannot process task.");
        }
    }

    public static void addCommandToCommandTaskPipeline(AbstractCommandTask abstractCommandTask, Context context) {
        if (!isInitialized()) {
            if (context == null || context.getApplicationContext() == null) {
                LOGGER.error("Kiwi subsystem cannot be initialized because of null context. Unable to enqueue task.");
                return;
            }
            INSTANCE = new Kiwi((Application) context.getApplicationContext(), false);
        }
        unsafeAddCommandToCommandTaskPipeline(abstractCommandTask);
    }

    /* access modifiers changed from: private */
    public void enqueueAppLaunchWorkflowTask() {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Enqueuing launch workflow");
        }
        this.taskManager.enqueue(TaskPipelineId.COMMAND, getLaunchWorkflow());
    }

    private Task getLaunchWorkflow() {
        return this.drmEnabled ? new C0049a() : new C0071f();
    }

    public static PromptManager getPromptManager() {
        return INSTANCE.promptManager;
    }

    private static void ignoreEvent(String str, Context context) {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace(str + " called on context: " + context + " when " + "Kiwi is dead, ignoring...");
        }
    }

    private void instantiateTheWorld(Application application2) {
        C0100c cVar = new C0100c();
        cVar.mo366a(application2);
        cVar.mo366a(new C0101a());
        cVar.mo366a(new C0175a());
        cVar.mo366a(new C0074c());
        cVar.mo366a(new C0081d());
        cVar.mo366a(new PromptManagerImpl());
        cVar.mo366a(new C0169b());
        cVar.mo366a(new C0062a());
        cVar.mo366a(new C0182c());
        cVar.mo366a(new C0106c());
        cVar.mo366a(new C0152c());
        cVar.mo366a(new C0109f());
        cVar.mo365a();
        cVar.mo367b(this);
    }

    private static boolean isInitialized() {
        return INSTANCE != null;
    }

    public static boolean isSignedByKiwi(String str, String str2) {
        if (isInitialized()) {
            try {
                return C0150a.m365a(str, str2, INSTANCE.authKeyLoader.mo437a());
            } catch (C0133a e) {
                LOGGER.trace("Unable to validate signature: " + e.getMessage());
            }
        } else {
            LOGGER.trace("Kiwi was not yet initialized - cannot do the IAP call");
            return false;
        }
    }

    public static boolean onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (!preProcess("onActivityResult", activity)) {
            return false;
        }
        return INSTANCE.resultManager.mo299a(new C0077f(activity, i, i2, intent));
    }

    public static void onCreate(Activity activity, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!isInitialized()) {
            INSTANCE = new Kiwi(activity.getApplication(), z);
        }
        if (preProcess("onCreate", activity)) {
            INSTANCE.contextManager.onCreate(activity);
        }
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Kiwi.ActivityOnCreate Time: " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void onCreate(Service service, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (preProcess("onCreate", service)) {
            INSTANCE.contextManager.onCreate(service);
        }
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Kiwi.ServiceOnCreate Time: " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static Dialog onCreateDialog(Activity activity, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (preProcess("onCreateDialog", activity)) {
            return INSTANCE.promptManager.onCreateDialog(activity, i);
        }
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Kiwi.ActivityOnCreateDialog Time: " + (System.currentTimeMillis() - currentTimeMillis));
        }
        return null;
    }

    public static void onDestroy(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (preProcess("onDestroy", activity)) {
            try {
                INSTANCE.contextManager.onDestroy(activity);
            } catch (Exception e) {
                LOGGER.error("Kiwi.ActivityOnDestroy Error: ", e);
            }
        }
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Kiwi.ActivityOnDestroy Time: " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void onDestroy(Service service) {
        long currentTimeMillis = System.currentTimeMillis();
        if (preProcess("onDestroy", service)) {
            INSTANCE.contextManager.onDestroy(service);
        }
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Kiwi.ServiceOnDestroy Time: " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void onPause(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (preProcess("onPause", activity)) {
            INSTANCE.contextManager.onPause(activity);
        }
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Kiwi.ActivityOnPause Time: " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void onResume(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (preProcess("onResume", activity)) {
            INSTANCE.contextManager.onResume(activity);
        }
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Kiwi.ActivityOnResume Time: " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void onStart(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (preProcess("onStart", activity)) {
            INSTANCE.contextManager.onStart(activity);
        }
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Kiwi.ActivityOnStart Time: " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void onStop(Activity activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (preProcess("onStop", activity)) {
            INSTANCE.contextManager.onStop(activity);
        }
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Kiwi.ActivityOnStop Time: " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void onWindowFocusChanged(Activity activity, boolean z) {
        if (preProcess("onWindowFocusChanged", activity)) {
            INSTANCE.promptManager.onWindowFocusChanged(activity, z);
        }
    }

    private static boolean preProcess(String str, Context context) {
        C0067a.m218a();
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace(str + ": " + context);
        }
        if (isInitialized()) {
            return true;
        }
        ignoreEvent(str, context);
        return false;
    }

    private void registerActivityLifeCyclePauseListener() {
        this.eventManager.mo442a((C0170c) new C0052b(this));
    }

    private void registerActivityLifeCycleResumeListener() {
        this.eventManager.mo442a((C0170c) new C0061c(this));
    }

    private void registerApplicationCreationListener() {
        this.eventManager.mo442a((C0170c) new C0066d(this));
    }

    private void registerApplicationDestructionListener() {
        this.eventManager.mo442a((C0170c) new C0069e(this));
    }

    /* access modifiers changed from: private */
    public static void unsafeAddCommandToCommandTaskPipeline(AbstractCommandTask abstractCommandTask) {
        INSTANCE.taskManager.enqueue(TaskPipelineId.COMMAND, abstractCommandTask);
    }

    public final void onResourcesPopulated() {
        registerApplicationCreationListener();
        registerApplicationDestructionListener();
        registerActivityLifeCyclePauseListener();
        registerActivityLifeCycleResumeListener();
    }
}
