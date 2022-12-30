package com.amazon.android.framework.context;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import com.amazon.android.framework.resource.C0099b;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.TaskManager;
import com.amazon.android.framework.task.pipeline.TaskPipelineId;
import com.amazon.android.framework.util.C0130c;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p006d.C0067a;
import com.amazon.android.p012j.C0143a;
import com.amazon.android.p012j.C0144b;
import com.amazon.android.p012j.C0145c;
import com.amazon.android.p012j.C0146d;
import com.amazon.android.p015m.C0171d;
import com.amazon.android.p015m.C0174g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.amazon.android.framework.context.d */
public final class C0081d implements ContextManager, C0099b {

    /* renamed from: a */
    public static final KiwiLogger f945a = new KiwiLogger("ContextManagerImpl");

    /* renamed from: b */
    private final AtomicReference f946b = new AtomicReference();

    /* renamed from: c */
    private final List f947c = new ArrayList();

    /* renamed from: d */
    private final C0130c f948d = new C0130c();

    /* renamed from: e */
    private final C0130c f949e = new C0130c();

    /* renamed from: f */
    private final AtomicBoolean f950f = new AtomicBoolean(false);

    /* renamed from: g */
    private final AtomicBoolean f951g = new AtomicBoolean(false);

    /* renamed from: h */
    private final AtomicBoolean f952h = new AtomicBoolean(false);
    @Resource

    /* renamed from: i */
    private Application f953i;
    @Resource

    /* renamed from: j */
    private TaskManager f954j;
    @Resource

    /* renamed from: k */
    private C0174g f955k;

    /* renamed from: l */
    private String f956l;

    /* renamed from: m */
    private boolean f957m = false;

    /* renamed from: a */
    private static Activity m238a(Activity activity) {
        Activity activity2 = activity;
        while (activity2.isChild()) {
            activity2 = activity2.getParent();
        }
        return activity2;
    }

    /* renamed from: a */
    static /* synthetic */ void m239a(C0081d dVar) {
        if (KiwiLogger.TRACE_ON) {
            f945a.trace("----------- EXECUTING FINISH ACTIVITIES -----------");
            f945a.trace(dVar.f953i.getPackageName());
            f945a.trace("---------------------------------------------------");
        }
        Activity root = dVar.getRoot();
        for (Activity activity : dVar.f947c) {
            if (!activity.equals(root) && activity != null) {
                if (activity.isChild()) {
                    f945a.trace("Not finishing activity: " + activity + ", it is a child of: " + activity.getParent());
                } else {
                    f945a.trace("Finishing Activity: " + activity);
                    activity.finish();
                }
            }
        }
        Activity root2 = dVar.getRoot();
        if (root2 == null) {
            f945a.trace("Shutdown found no root, no activities to pop off stack!");
        } else {
            f945a.trace("Moving task to background");
            root2.moveTaskToBack(true);
            f945a.trace("Popping activity stack, root: " + root2);
            Intent intent = new Intent(root2, root2.getClass());
            intent.addFlags(67108864);
            intent.addFlags(536870912);
            root2.startActivity(intent);
        }
        dVar.f954j.enqueue(TaskPipelineId.FOREGROUND, new C0078a(dVar));
    }

    /* renamed from: a */
    static /* synthetic */ void m240a(C0081d dVar, Intent intent) {
        if (KiwiLogger.TRACE_ON) {
            f945a.trace("Received broadcast intent: " + intent);
        }
        if (!intent.getAction().equals(dVar.f956l)) {
            if (KiwiLogger.ERROR_ON) {
                f945a.error("Received broadcast for unrequested action: " + intent.getAction());
            }
        } else if (!dVar.f951g.get()) {
            if (KiwiLogger.ERROR_ON) {
                f945a.error("Received intent to shutdown app when we are not in shutdown state: " + intent);
            }
        } else if (dVar.f952h.compareAndSet(false, true)) {
            if (KiwiLogger.TRACE_ON) {
                f945a.trace("Stopping services in response to broadcast");
                f945a.trace("Service to stop: " + dVar.f948d.f1065a.size());
            }
            Iterator it = dVar.f948d.iterator();
            while (it.hasNext()) {
                Service service = (Service) it.next();
                if (service != null) {
                    if (KiwiLogger.TRACE_ON) {
                        f945a.trace("Stopping service: " + service);
                    }
                    service.stopSelf();
                }
            }
        } else if (KiwiLogger.TRACE_ON) {
            f945a.trace("shutdown broadcast already received, ignoring");
        }
    }

    /* renamed from: a */
    private void m241a(C0145c cVar, Activity activity) {
        this.f955k.mo443a((C0171d) new C0144b(cVar, activity));
    }

    /* renamed from: a */
    private void m242a(C0146d dVar) {
        this.f955k.mo443a((C0171d) new C0143a(dVar, this.f953i));
    }

    public final void finishActivities() {
        if (this.f950f.compareAndSet(false, true)) {
            if (KiwiLogger.TRACE_ON) {
                f945a.trace("---------- SCHEDULING FINISH ACTIVITIES -----------");
                f945a.trace(this.f953i.getPackageName());
                f945a.trace(Thread.currentThread().toString());
                f945a.trace("---------------------------------------------------");
            }
            this.f954j.enqueue(TaskPipelineId.FOREGROUND, new C0080c(this));
        }
    }

    public final Activity getRoot() {
        C0067a.m218a();
        for (int size = this.f947c.size() - 1; size >= 0; size--) {
            Activity activity = (Activity) this.f947c.get(size);
            if (activity == null ? false : activity.isTaskRoot()) {
                return activity;
            }
        }
        return null;
    }

    public final Activity getVisible() {
        C0067a.m218a();
        return (Activity) this.f946b.get();
    }

    public final boolean hasAppShutdownBeenRequested() {
        return this.f951g.get() || this.f950f.get();
    }

    public final boolean isVisible() {
        return this.f946b.get() != null;
    }

    public final void onCreate(Activity activity) {
        C0067a.m219a((Object) activity, "activity");
        C0067a.m218a();
        this.f947c.add(activity);
        if (KiwiLogger.TRACE_ON) {
            f945a.trace("Activity->onCreate.  Activity: " + activity + ", Total Activities: " + this.f947c.size());
        }
        m241a(C0145c.CREATE, activity);
        if (!this.f957m && this.f947c.size() == 1) {
            this.f957m = true;
            m242a(C0146d.CREATE);
        }
    }

    public final void onCreate(Service service) {
        C0067a.m218a();
        if (KiwiLogger.TRACE_ON) {
            f945a.trace("Service->onCreate: " + service);
        }
        this.f948d.mo412a(service);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroy(android.app.Activity r5) {
        /*
            r4 = this;
            r3 = 0
            java.lang.String r0 = "activity"
            com.amazon.android.p006d.C0067a.m219a((java.lang.Object) r5, (java.lang.String) r0)
            com.amazon.android.p006d.C0067a.m218a()
            java.util.List r0 = r4.f947c
            r0.remove(r5)
            boolean r0 = com.amazon.android.framework.util.KiwiLogger.TRACE_ON
            if (r0 == 0) goto L_0x003a
            com.amazon.android.framework.util.KiwiLogger r0 = f945a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Activity->onDestroy.  Activity: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = ", Total Activities: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.util.List r2 = r4.f947c
            int r2 = r2.size()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.trace(r1)
        L_0x003a:
            com.amazon.android.j.c r0 = com.amazon.android.p012j.C0145c.DESTROY
            r4.m241a((com.amazon.android.p012j.C0145c) r0, (android.app.Activity) r5)
            boolean r0 = com.amazon.android.framework.util.KiwiLogger.TRACE_ON
            if (r0 == 0) goto L_0x004a
            com.amazon.android.framework.util.KiwiLogger r0 = f945a
            java.lang.String r1 = "Checking if application is destroyed"
            r0.trace(r1)
        L_0x004a:
            java.util.List r0 = r4.f947c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0093
            com.amazon.android.framework.util.KiwiLogger r0 = f945a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "App is destroyed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            boolean r2 = r5.isTaskRoot()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = r1.append(r2)
            boolean r2 = r5.isFinishing()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.trace(r1)
            boolean r0 = r5.isTaskRoot()
            if (r0 == 0) goto L_0x0093
            boolean r0 = r5.isFinishing()
            if (r0 == 0) goto L_0x0093
            r0 = 1
        L_0x0089:
            if (r0 == 0) goto L_0x0092
            r4.f957m = r3
            com.amazon.android.j.d r0 = com.amazon.android.p012j.C0146d.DESTROY
            r4.m242a((com.amazon.android.p012j.C0146d) r0)
        L_0x0092:
            return
        L_0x0093:
            r0 = r3
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.android.framework.context.C0081d.onDestroy(android.app.Activity):void");
    }

    public final void onDestroy(Service service) {
        C0067a.m218a();
        this.f948d.mo413b(service);
    }

    public final void onPause(Activity activity) {
        C0067a.m218a();
        if (KiwiLogger.TRACE_ON) {
            f945a.trace("Activity paused: " + activity + ", visible activity: " + getVisible());
        }
        if (getVisible() == activity) {
            if (KiwiLogger.TRACE_ON) {
                f945a.trace("Setting visible activity to null");
            }
            this.f946b.set((Object) null);
            m241a(C0145c.PAUSE, activity);
        }
    }

    public final void onResourcesPopulated() {
        this.f956l = "com.amazon." + this.f953i.getPackageName() + ".shutdown";
        this.f953i.registerReceiver(new C0079b(this), new IntentFilter(this.f956l));
    }

    public final void onResume(Activity activity) {
        C0067a.m218a();
        f945a.trace("Activity resumed: " + activity + ", is child: " + activity.isChild());
        Activity a = m238a(activity);
        f945a.trace("Setting visible to: " + a);
        this.f946b.set(a);
        if (KiwiLogger.TRACE_ON) {
            f945a.trace("Activity now visible: " + activity + ", " + "publishing resume event");
        }
        m241a(C0145c.RESUME, activity);
    }

    public final void onStart(Activity activity) {
        C0067a.m219a((Object) activity, "activity");
        C0067a.m218a();
        f945a.trace("Activity started: " + activity);
        this.f949e.mo412a(activity);
        m241a(C0145c.START, activity);
        if (this.f949e.f1065a.size() == 1) {
            m242a(C0146d.START);
        }
    }

    public final void onStop(Activity activity) {
        C0067a.m219a((Object) activity, "activity");
        C0067a.m218a();
        f945a.trace("Activity stopped: " + activity);
        this.f949e.mo413b(activity);
        m241a(C0145c.STOP, activity);
        if (this.f949e.f1065a.isEmpty()) {
            m242a(C0146d.STOP);
        }
    }

    public final void stopServices() {
        if (!this.f951g.compareAndSet(false, true) && KiwiLogger.TRACE_ON) {
            f945a.trace("Ignoring duplicate stopServices request");
        }
        if (KiwiLogger.TRACE_ON) {
            f945a.trace("------------- STOPPING SERVICES -------------------");
            f945a.trace(this.f953i.getPackageName());
            f945a.trace("---------------------------------------------------");
        }
        Intent intent = new Intent(this.f956l);
        intent.setPackage(this.f953i.getPackageName());
        if (KiwiLogger.TRACE_ON) {
            f945a.trace("Sending Broadcast!!!!: " + intent + ", Thread: " + Thread.currentThread());
        }
        this.f953i.sendBroadcast(intent);
    }
}
