package com.amazon.android.p022t;

import com.amazon.android.framework.util.KiwiLogger;

/* renamed from: com.amazon.android.t.a */
public final class C0187a {

    /* renamed from: a */
    private static final KiwiLogger f1169a = new KiwiLogger("Serializer");

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039 A[Catch:{ all -> 0x005c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m416a(java.lang.String r6) {
        /*
            r5 = 0
            if (r6 == 0) goto L_0x0009
            int r0 = r6.length()
            if (r0 != 0) goto L_0x000b
        L_0x0009:
            r0 = r5
        L_0x000a:
            return r0
        L_0x000b:
            byte[] r0 = r6.getBytes()     // Catch:{ IOException -> 0x0025 }
            byte[] r0 = com.amazon.mas.kiwi.util.Base64.decode((byte[]) r0)     // Catch:{ IOException -> 0x0025 }
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0033, all -> 0x0056 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0033, all -> 0x0056 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0033, all -> 0x0056 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0033, all -> 0x0056 }
            java.lang.Object r0 = r1.readObject()     // Catch:{ Exception -> 0x005e }
            com.amazon.android.framework.util.C0128a.m344a((java.io.InputStream) r1)
            goto L_0x000a
        L_0x0025:
            r0 = move-exception
            boolean r1 = com.amazon.android.framework.util.KiwiLogger.ERROR_ON
            if (r1 == 0) goto L_0x0031
            com.amazon.android.framework.util.KiwiLogger r1 = f1169a
            java.lang.String r2 = "Could not decode string"
            r1.error(r2, r0)
        L_0x0031:
            r0 = r5
            goto L_0x000a
        L_0x0033:
            r0 = move-exception
            r1 = r5
        L_0x0035:
            boolean r2 = com.amazon.android.framework.util.KiwiLogger.ERROR_ON     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0051
            com.amazon.android.framework.util.KiwiLogger r2 = f1169a     // Catch:{ all -> 0x005c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r3.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r4 = "Could not read object from string: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ all -> 0x005c }
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch:{ all -> 0x005c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x005c }
            r2.error(r3, r0)     // Catch:{ all -> 0x005c }
        L_0x0051:
            com.amazon.android.framework.util.C0128a.m344a((java.io.InputStream) r1)
            r0 = r5
            goto L_0x000a
        L_0x0056:
            r0 = move-exception
            r1 = r5
        L_0x0058:
            com.amazon.android.framework.util.C0128a.m344a((java.io.InputStream) r1)
            throw r0
        L_0x005c:
            r0 = move-exception
            goto L_0x0058
        L_0x005e:
            r0 = move-exception
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.android.p022t.C0187a.m416a(java.lang.String):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024 A[Catch:{ all -> 0x0047 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m417a(java.io.Serializable r6) {
        /*
            r5 = 0
            if (r6 != 0) goto L_0x0005
            r0 = r5
        L_0x0004:
            return r0
        L_0x0005:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x001e, all -> 0x0041 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x001e, all -> 0x0041 }
            r1.writeObject(r6)     // Catch:{ IOException -> 0x0049 }
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x0049 }
            java.lang.String r0 = com.amazon.mas.kiwi.util.Base64.encodeBytes(r0)     // Catch:{ IOException -> 0x0049 }
            com.amazon.android.framework.util.C0128a.m345a((java.io.OutputStream) r1)
            goto L_0x0004
        L_0x001e:
            r0 = move-exception
            r1 = r5
        L_0x0020:
            boolean r2 = com.amazon.android.framework.util.KiwiLogger.ERROR_ON     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x003c
            com.amazon.android.framework.util.KiwiLogger r2 = f1169a     // Catch:{ all -> 0x0047 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r3.<init>()     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = "Could not serialize object: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ all -> 0x0047 }
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0047 }
            r2.error(r3, r0)     // Catch:{ all -> 0x0047 }
        L_0x003c:
            com.amazon.android.framework.util.C0128a.m345a((java.io.OutputStream) r1)
            r0 = r5
            goto L_0x0004
        L_0x0041:
            r0 = move-exception
            r1 = r5
        L_0x0043:
            com.amazon.android.framework.util.C0128a.m345a((java.io.OutputStream) r1)
            throw r0
        L_0x0047:
            r0 = move-exception
            goto L_0x0043
        L_0x0049:
            r0 = move-exception
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.android.p022t.C0187a.m417a(java.io.Serializable):java.lang.String");
    }
}
