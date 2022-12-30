package com.google.ads;

import android.content.Context;

/* renamed from: com.google.ads.an */
public final class C0233an implements Runnable {

    /* renamed from: a */
    private Context f1216a;

    /* renamed from: b */
    private String f1217b;

    public C0233an(String str, Context context) {
        this.f1217b = str;
        this.f1216a = context;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0060 }
            java.lang.String r1 = "Pinging URL: "
            r0.<init>(r1)     // Catch:{ IOException -> 0x0060 }
            java.lang.String r1 = r4.f1217b     // Catch:{ IOException -> 0x0060 }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ IOException -> 0x0060 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0060 }
            com.google.ads.util.C0261b.m574a((java.lang.String) r0)     // Catch:{ IOException -> 0x0060 }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0060 }
            java.lang.String r1 = r4.f1217b     // Catch:{ IOException -> 0x0060 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0060 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x0060 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0060 }
            android.content.Context r1 = r4.f1216a     // Catch:{ all -> 0x005b }
            com.google.ads.util.AdUtil.m556a((java.net.HttpURLConnection) r0, (android.content.Context) r1)     // Catch:{ all -> 0x005b }
            r1 = 1
            r0.setInstanceFollowRedirects(r1)     // Catch:{ all -> 0x005b }
            r0.connect()     // Catch:{ all -> 0x005b }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x005b }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 < r2) goto L_0x0039
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 < r2) goto L_0x0057
        L_0x0039:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            java.lang.String r3 = "Did not receive 2XX (got "
            r2.<init>(r3)     // Catch:{ all -> 0x005b }
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ all -> 0x005b }
            java.lang.String r2 = ") from pinging URL: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x005b }
            java.lang.String r2 = r4.f1217b     // Catch:{ all -> 0x005b }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x005b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x005b }
            com.google.ads.util.C0261b.m582e(r1)     // Catch:{ all -> 0x005b }
        L_0x0057:
            r0.disconnect()     // Catch:{ IOException -> 0x0060 }
        L_0x005a:
            return
        L_0x005b:
            r1 = move-exception
            r0.disconnect()     // Catch:{ IOException -> 0x0060 }
            throw r1     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to ping the URL: "
            r1.<init>(r2)
            java.lang.String r2 = r4.f1217b
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.ads.util.C0261b.m579b(r1, r0)
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.C0233an.run():void");
    }
}
