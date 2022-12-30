package com.amazon.android.p005c;

import android.app.Application;
import com.amazon.android.framework.resource.C0099b;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.util.C0128a;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p003a.C0051b;
import com.amazon.android.p006d.C0067a;
import com.amazon.android.p015m.C0171d;
import com.amazon.android.p015m.C0174g;
import com.amazon.android.p022t.C0187a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.amazon.android.c.a */
public final class C0062a implements C0065d, C0099b, Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static final KiwiLogger f912a = new KiwiLogger("CrashManagerImpl");
    @Resource

    /* renamed from: b */
    private C0174g f913b;
    @Resource

    /* renamed from: c */
    private Application f914c;

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f915d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Map f916e = new HashMap();

    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0046=Splitter:B:17:0x0046, B:23:0x004e=Splitter:B:23:0x004e} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m201a(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Random r0 = new java.util.Random     // Catch:{ all -> 0x004a }
            r0.<init>()     // Catch:{ all -> 0x004a }
            r1 = 99999(0x1869f, float:1.40128E-40)
            int r0 = r0.nextInt(r1)     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r1.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "s-"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x004a }
            java.lang.String r1 = ".amzst"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004a }
            r1 = 0
            android.app.Application r2 = r5.f914c     // Catch:{ Exception -> 0x003a }
            r3 = 0
            java.io.FileOutputStream r0 = r2.openFileOutput(r0, r3)     // Catch:{ Exception -> 0x003a }
            byte[] r1 = r6.getBytes()     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            r0.write(r1)     // Catch:{ Exception -> 0x0057, all -> 0x0052 }
            com.amazon.android.framework.util.C0128a.m345a((java.io.OutputStream) r0)     // Catch:{ all -> 0x004a }
        L_0x0038:
            monitor-exit(r5)
            return
        L_0x003a:
            r0 = move-exception
        L_0x003b:
            boolean r2 = com.amazon.android.framework.util.KiwiLogger.ERROR_ON     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x0046
            com.amazon.android.framework.util.KiwiLogger r2 = f912a     // Catch:{ all -> 0x004d }
            java.lang.String r3 = "Coud not save crash report to file"
            r2.error(r3, r0)     // Catch:{ all -> 0x004d }
        L_0x0046:
            com.amazon.android.framework.util.C0128a.m345a((java.io.OutputStream) r1)     // Catch:{ all -> 0x004a }
            goto L_0x0038
        L_0x004a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x004d:
            r0 = move-exception
        L_0x004e:
            com.amazon.android.framework.util.C0128a.m345a((java.io.OutputStream) r1)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x0052:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x004e
        L_0x0057:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.android.p005c.C0062a.m201a(java.lang.String):void");
    }

    /* renamed from: b */
    private static C0063b m202b(String str) {
        try {
            return (C0063b) C0187a.m416a(m204c(str));
        } catch (Exception e) {
            if (KiwiLogger.ERROR_ON) {
                f912a.error("Failed to load crash report: " + str);
            }
            return null;
        }
    }

    /* renamed from: b */
    private boolean m203b() {
        return this.f916e.size() >= 5;
    }

    /* renamed from: c */
    private static String m204c(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
            while (bufferedReader2.ready()) {
                try {
                    sb.append(bufferedReader2.readLine());
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    C0128a.m346a((Reader) bufferedReader);
                    throw th;
                }
            }
            C0128a.m346a((Reader) bufferedReader2);
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
            C0128a.m346a((Reader) bufferedReader);
            throw th;
        }
    }

    /* renamed from: d */
    private static void m205d(String str) {
        try {
            new File(str).delete();
        } catch (Exception e) {
            if (KiwiLogger.ERROR_ON) {
                f912a.error("Cannot delete file: " + str, e);
            }
        }
    }

    /* renamed from: a */
    public final List mo285a() {
        if (m203b()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] list = new File(this.f914c.getFilesDir().getAbsolutePath() + "/").list(new C0064c(this));
        for (int i = 0; i < list.length && !m203b(); i++) {
            String str = this.f914c.getFilesDir().getAbsolutePath() + "/" + list[i];
            C0063b b = m202b(str);
            if (b != null) {
                this.f916e.put(b, str);
                arrayList.add(b);
            } else {
                m205d(str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo286a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0063b bVar = (C0063b) it.next();
            m205d((String) this.f916e.get(bVar));
            this.f916e.remove(bVar);
        }
    }

    public final void onResourcesPopulated() {
        C0067a.m218a();
        if (!(Thread.getDefaultUncaughtExceptionHandler() instanceof C0065d)) {
            if (KiwiLogger.TRACE_ON) {
                f912a.trace("Registering Crash Handler");
            }
            this.f915d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (KiwiLogger.TRACE_ON) {
            f912a.trace("Crash detected", th);
        }
        try {
            m201a(C0187a.m417a((Serializable) new C0063b(this.f914c, th)));
        } catch (Throwable th2) {
            if (KiwiLogger.TRACE_ON) {
                f912a.trace("Error occured while handling exception", th2);
            }
        }
        this.f913b.mo443a((C0171d) new C0051b());
        if (KiwiLogger.TRACE_ON) {
            f912a.trace("Calling previous handler");
        }
        if (this.f915d != null) {
            this.f915d.uncaughtException(thread, th);
        }
    }
}
