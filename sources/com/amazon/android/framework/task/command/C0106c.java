package com.amazon.android.framework.task.command;

import android.app.Application;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.RemoteException;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p004b.C0058f;
import com.amazon.android.p004b.C0059g;
import com.amazon.android.p016n.C0175a;
import com.amazon.venezia.command.C0196f;
import com.amazon.venezia.command.C0198h;
import com.amazon.venezia.command.C0204n;
import com.amazon.venezia.command.C0208r;
import com.amazon.venezia.command.C0213w;
import com.amazon.venezia.command.C0215y;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.amazon.android.framework.task.command.c */
public final class C0106c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final KiwiLogger f1003a = new KiwiLogger("CommandServiceClient");

    /* renamed from: b */
    private C0198h f1004b;

    /* renamed from: c */
    private String f1005c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final BlockingQueue f1006d = new LinkedBlockingQueue();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final BlockingQueue f1007e = new LinkedBlockingQueue();
    @Resource

    /* renamed from: f */
    private Application f1008f;
    @Resource

    /* renamed from: g */
    private C0109f f1009g;
    @Resource

    /* renamed from: h */
    private C0175a f1010h;

    /* renamed from: i */
    private final ServiceConnection f1011i = new C0113j(this);

    /* renamed from: j */
    private final C0196f f1012j = new C0114k(this);

    /* renamed from: a */
    private static Intent m273a(String str) {
        Intent intent = new Intent();
        intent.setAction("com.amazon.venezia.CommandService");
        intent.setClassName(str, "com.amazon.venezia.service.command.CommandServiceImpl");
        return intent;
    }

    /* renamed from: a */
    private Intent m274a(List list) {
        int i = -1;
        int i2 = 0;
        String str = null;
        while (true) {
            try {
                if (i2 >= list.size()) {
                    break;
                }
                ResolveInfo resolveInfo = (ResolveInfo) list.get(i2);
                String str2 = resolveInfo.serviceInfo.applicationInfo.packageName;
                f1003a.trace("Examining package " + str2);
                f1003a.trace("Priority is " + resolveInfo.filter.getPriority());
                f1003a.trace("Checking signature of package " + str2);
                f1003a.trace("isPackageSignatureTrusted " + str2);
                if (this.f1009g.mo384a(str2, C0115l.f1033a)) {
                    f1003a.trace("Signature of package " + str2 + " is okay");
                    str = str2;
                    i = i2;
                    break;
                }
                f1003a.trace("Signature of package " + str2 + " is bad");
                i2++;
                str = str2;
            } catch (Exception e) {
                f1003a.trace("Caught exception " + e);
            }
        }
        if (i >= 0) {
            return m273a(str);
        }
        return null;
    }

    /* renamed from: a */
    private static void m276a(KiwiException kiwiException, C0104a aVar) {
        f1003a.error("CommandServiceException happened, retriesLeft=" + aVar.f996a, kiwiException);
        if (aVar.f996a == 0) {
            aVar.f997b = false;
            return;
        }
        aVar.f996a--;
        aVar.f997b = true;
        try {
            f1003a.trace("Sleeping for " + aVar.f998c + " ms");
            Thread.sleep(aVar.f998c);
        } catch (InterruptedException e) {
            aVar.f997b = false;
        }
        aVar.f998c *= 2;
    }

    /* renamed from: d */
    private C0116m m279d() throws RemoteException {
        try {
            f1003a.trace("Blocking for result from service");
            C0116m mVar = (C0116m) this.f1006d.take();
            f1003a.trace("Received result from service");
            return mVar;
        } catch (InterruptedException e) {
            f1003a.trace("TaskThread interrupted, returning null result");
            return null;
        }
    }

    /* renamed from: a */
    public final C0116m mo375a(C0204n nVar) throws RemoteException {
        nVar.mo569a((C0215y) null);
        return m279d();
    }

    /* renamed from: a */
    public final C0116m mo376a(C0208r rVar, C0105b bVar) throws RemoteException {
        rVar.mo574a(new C0112i(this, bVar));
        return m279d();
    }

    /* renamed from: a */
    public final C0116m mo377a(C0213w wVar) throws C0059g, C0058f, RemoteException {
        Intent a;
        C0104a aVar = new C0104a();
        aVar.f996a = 6;
        aVar.f998c = 100;
        while (true) {
            try {
                if (this.f1004b != null) {
                    break;
                }
                long currentTimeMillis = System.currentTimeMillis();
                f1003a.trace("Binding Service!!!");
                Intent intent = new Intent();
                intent.setAction("com.amazon.venezia.CommandService");
                f1003a.trace("Created intent with  action  com.amazon.venezia.CommandService");
                if (this.f1008f.getPackageManager().resolveService(intent, 64) != null) {
                    f1003a.trace("Found service on one or more packages");
                    if (this.f1005c != null) {
                        f1003a.trace("Using previously determined package " + this.f1005c);
                        a = m273a(this.f1005c);
                    } else {
                        f1003a.trace("No previously determined package found, checking for suitable package.");
                        a = m274a((List) this.f1008f.getPackageManager().queryIntentServices(intent, 64));
                        if (a == null) {
                            f1003a.trace("No app with valid signature was providing our service.");
                            throw new C0059g();
                        }
                    }
                    String packageName = a.getComponent().getPackageName();
                    f1003a.trace("Attempting to bind to service on " + packageName);
                    if (this.f1008f.bindService(a, this.f1011i, 1)) {
                        f1003a.trace("Blocking while service is being bound!!");
                        this.f1004b = (C0198h) this.f1007e.take();
                        f1003a.trace("service bound, returning!!");
                        if (KiwiLogger.TRACE_ON) {
                            f1003a.trace("Kiwi.BindService Time: " + (System.currentTimeMillis() - currentTimeMillis));
                        }
                        this.f1010h.mo448a("PACKAGE", packageName);
                        this.f1005c = packageName;
                        break;
                    }
                    throw new C0058f();
                }
                throw new C0059g();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new C0058f();
            } catch (C0058f e2) {
                m276a((KiwiException) e2, aVar);
                if (!aVar.f997b) {
                    throw e2;
                }
            } catch (C0059g e3) {
                m276a((KiwiException) e3, aVar);
                if (!aVar.f997b) {
                    throw e3;
                }
            }
        }
        this.f1010h.mo448a("COMMAND", wVar.mo385a());
        this.f1004b.mo589a(wVar, this.f1012j);
        return m279d();
    }

    /* renamed from: a */
    public final String mo378a() {
        return this.f1005c;
    }

    /* renamed from: b */
    public final void mo379b() {
        f1003a.trace("Finishing CommandServiceClient, unbinding service: " + (this.f1004b != null));
        if (this.f1004b != null) {
            this.f1008f.unbindService(this.f1011i);
            this.f1004b = null;
        }
    }
}
