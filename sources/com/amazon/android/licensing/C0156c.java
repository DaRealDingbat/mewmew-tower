package com.amazon.android.licensing;

import com.amazon.android.p004b.C0060h;
import java.util.Map;

/* renamed from: com.amazon.android.licensing.c */
public final class C0156c {

    /* renamed from: a */
    final String f1110a;

    /* renamed from: b */
    final String f1111b;

    /* renamed from: c */
    final String f1112c;

    public C0156c(Map map) throws C0060h {
        if (map == null) {
            throw new C0060h("EMPTY", (String) null);
        }
        this.f1110a = m377a("license", map);
        this.f1111b = m377a("customerId", map);
        this.f1112c = m377a("deviceId", map);
    }

    /* renamed from: a */
    private static String m377a(String str, Map map) throws C0060h {
        String str2 = (String) map.get(str);
        if (!(str2 == null || str2.length() == 0)) {
            return str2;
        }
        throw new C0060h("MISSING_FIELD", str);
    }
}
