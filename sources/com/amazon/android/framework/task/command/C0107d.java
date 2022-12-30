package com.amazon.android.framework.task.command;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.amazon.android.framework.prompt.C0087f;
import com.amazon.android.framework.prompt.Prompt;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p004b.C0055c;
import com.amazon.venezia.command.C0204n;
import com.amazon.venezia.command.C0208r;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.amazon.android.framework.task.command.d */
public final class C0107d extends Prompt {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final KiwiLogger f1013a = new KiwiLogger("DecisionDialog");

    /* renamed from: b */
    private final Thread f1014b = Thread.currentThread();

    /* renamed from: c */
    private final C0110g f1015c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final BlockingQueue f1016d = new LinkedBlockingQueue();

    public C0107d(C0208r rVar) throws RemoteException {
        this.f1015c = new C0110g(rVar);
    }

    /* renamed from: a */
    private static ActivityInfo m285a(Activity activity) {
        try {
            return activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            if (KiwiLogger.ERROR_ON) {
                f1013a.error("Unable to get info for activity: " + activity);
            }
            return null;
        }
    }

    /* renamed from: a */
    private void m286a(AlertDialog alertDialog, C0117n nVar, int i) {
        if (nVar != null) {
            alertDialog.setButton(i, nVar.f1042b, new C0108e(this, nVar));
        }
    }

    /* renamed from: a */
    private static boolean m288a(C0117n nVar) {
        return (nVar == null || nVar.f1043c == null) ? false : true;
    }

    /* renamed from: c */
    private C0204n m291c() throws C0055c {
        try {
            if (KiwiLogger.TRACE_ON) {
                f1013a.trace("Blocking while awaiting customer decision: " + Thread.currentThread());
            }
            return ((C0117n) this.f1016d.take()).f1041a;
        } catch (InterruptedException e) {
            if (KiwiLogger.TRACE_ON) {
                f1013a.trace("Interrupted while awaiting decision, throwing decision expired!");
            }
            throw new C0055c(getExpirationReason() == C0087f.NOT_COMPATIBLE ? C0105b.APP_NOT_COMPATIBLE : C0105b.EXPIRATION_DURATION_ELAPSED);
        }
    }

    /* renamed from: a */
    public final C0204n mo380a() throws C0055c {
        if (KiwiLogger.TRACE_ON) {
            f1013a.trace("GetCustomerDecision: " + this.f1014b);
        }
        return m291c();
    }

    public final boolean doCompatibilityCheck(Activity activity) {
        if (!(m288a(this.f1015c.f1025d) || m288a(this.f1015c.f1026e) || m288a(this.f1015c.f1027f))) {
            return true;
        }
        ActivityInfo a = m285a(activity);
        if (a == null) {
            return false;
        }
        boolean z = a.launchMode == 3;
        f1013a.trace("Single instance: " + z);
        boolean z2 = (a.flags & 2) != 0;
        f1013a.trace("Finish on task launch:" + z2);
        boolean z3 = (a.flags & 128) != 0;
        f1013a.trace("No History: " + z3);
        return !z && !z2 && !z3;
    }

    public final Dialog doCreate(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f1015c.f1022a).setMessage(this.f1015c.f1023b).setCancelable(false);
        AlertDialog create = builder.create();
        m286a(create, this.f1015c.f1025d, -1);
        m286a(create, this.f1015c.f1026e, -3);
        m286a(create, this.f1015c.f1027f, -2);
        return create;
    }

    /* access modifiers changed from: protected */
    public final void doExpiration(C0087f fVar) {
        if (KiwiLogger.TRACE_ON) {
            f1013a.trace("Expiring Decision Dialog: Thread: " + Thread.currentThread());
        }
        this.f1014b.interrupt();
    }

    /* access modifiers changed from: protected */
    public final long getExpirationDurationInSeconds() {
        return this.f1015c.f1024c;
    }

    public final String toString() {
        return "DecisionDialog: " + this.f1015c.f1022a;
    }
}
