package com.amazon.android.p008f;

import android.content.Intent;
import com.amazon.android.framework.context.ContextManager;
import com.amazon.android.framework.resource.C0099b;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.task.TaskManager;
import com.amazon.android.framework.task.pipeline.TaskPipelineId;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p015m.C0170c;
import com.amazon.android.p015m.C0174g;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.amazon.android.f.c */
public final class C0074c implements C0073b, C0099b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final KiwiLogger f928a = new KiwiLogger("ActivityResultManagerImpl");

    /* renamed from: b */
    private static final Random f929b = new Random();
    @Resource

    /* renamed from: c */
    private TaskManager f930c;
    /* access modifiers changed from: private */
    @Resource

    /* renamed from: d */
    public ContextManager f931d;
    @Resource

    /* renamed from: e */
    private C0174g f932e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AtomicReference f933f = new AtomicReference();

    /* renamed from: g */
    private BlockingQueue f934g = new LinkedBlockingQueue();

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final C0077f mo298a(Intent intent) {
        C0072a aVar = new C0072a(intent, f929b.nextInt(65535) + 1);
        if (!this.f933f.compareAndSet((Object) null, aVar)) {
            f928a.error("StartActivityForResult called while ActivityResultManager is already awaiting a result");
            return null;
        }
        f928a.trace("Starting activity for result: " + intent + ", " + intent.getFlags() + ", requestId: " + aVar.f925a);
        this.f930c.enqueueAtFront(TaskPipelineId.FOREGROUND, new C0075d(this, aVar));
        try {
            f928a.trace("Blocking for request: " + aVar.f925a);
            C0077f fVar = (C0077f) this.f934g.take();
            f928a.trace("Received Response: " + aVar.f925a);
            this.f933f.set((Object) null);
            return fVar;
        } catch (InterruptedException e) {
            f928a.trace("Interrupted while awaiting for request, returning null");
            f928a.trace("Received Response: " + aVar.f925a);
            this.f933f.set((Object) null);
            return null;
        } catch (Throwable th) {
            f928a.trace("Received Response: " + aVar.f925a);
            this.f933f.set((Object) null);
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo299a(C0077f fVar) {
        if (KiwiLogger.TRACE_ON) {
            f928a.trace("Recieved ActivityResult: " + fVar);
        }
        C0072a aVar = (C0072a) this.f933f.get();
        if (aVar == null) {
            if (KiwiLogger.TRACE_ON) {
                f928a.trace("We don't have a current open request, returning");
            }
            return false;
        } else if (aVar.f925a != fVar.f938a) {
            if (KiwiLogger.TRACE_ON) {
                f928a.trace("We don't have a request with code: " + fVar.f938a + ", returning");
            }
            return false;
        } else {
            if (KiwiLogger.TRACE_ON) {
                f928a.trace("Signaling thread waiting for request: " + fVar.f938a);
            }
            this.f934g.add(fVar);
            return true;
        }
    }

    public final void onResourcesPopulated() {
        this.f932e.mo442a((C0170c) new C0076e(this));
    }
}
