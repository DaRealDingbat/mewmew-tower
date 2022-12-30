package com.amazon.android.licensing;

import com.amazon.android.framework.util.C0129b;
import com.amazon.android.p009g.C0134b;
import com.amazon.android.p014l.C0153d;
import java.util.Date;

/* renamed from: com.amazon.android.licensing.f */
public final class C0159f {

    /* renamed from: a */
    final String f1115a;

    /* renamed from: b */
    final String f1116b;

    /* renamed from: c */
    final String f1117c;

    /* renamed from: d */
    final Date f1118d;

    /* renamed from: e */
    final String f1119e;

    public C0159f(C0153d dVar) throws C0134b {
        this.f1115a = m380a("checksum", dVar);
        this.f1116b = m380a("customerId", dVar);
        this.f1117c = m380a("deviceId", dVar);
        this.f1119e = m380a("packageName", dVar);
        this.f1118d = m381b("expiration", dVar);
    }

    /* renamed from: a */
    private static String m380a(String str, C0153d dVar) throws C0134b {
        String a = dVar.mo438a(str);
        if (!C0129b.m347a(a)) {
            return a;
        }
        throw new C0134b("MISSING_FIELD", str);
    }

    /* renamed from: b */
    private static Date m381b(String str, C0153d dVar) throws C0134b {
        String a = m380a(str, dVar);
        try {
            return new Date(Long.parseLong(a));
        } catch (NumberFormatException e) {
            throw new C0134b("INVALID_FIELD_VALUE", str + ":" + a);
        }
    }
}
