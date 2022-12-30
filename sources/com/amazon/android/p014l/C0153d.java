package com.amazon.android.p014l;

import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p006d.C0067a;
import com.amazon.android.p009g.C0134b;
import com.amazon.android.p009g.C0135c;
import com.amazon.mas.kiwi.util.Base64;
import java.io.IOException;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* renamed from: com.amazon.android.l.d */
public final class C0153d {

    /* renamed from: a */
    private static final KiwiLogger f1104a = new KiwiLogger("SignedToken");

    /* renamed from: b */
    private final Map f1105b = new HashMap();

    public C0153d(String str, PublicKey publicKey) throws C0134b, C0135c {
        String b = m374b(str);
        int lastIndexOf = b.lastIndexOf("|");
        if (lastIndexOf == -1) {
            throw C0134b.m355a();
        }
        String substring = b.substring(0, lastIndexOf);
        String substring2 = b.substring(lastIndexOf + 1);
        if (KiwiLogger.TRACE_ON) {
            f1104a.trace("Token data: " + substring);
            f1104a.trace("Signature: " + substring2);
        }
        if (!C0150a.m365a(substring, substring2, publicKey)) {
            throw new C0135c();
        }
        m375c(substring);
    }

    /* renamed from: b */
    private static String m374b(String str) throws C0134b {
        try {
            return new String(Base64.decode(str.getBytes()));
        } catch (IOException e) {
            throw new C0134b("DECODE", e.getMessage());
        }
    }

    /* renamed from: c */
    private void m375c(String str) throws C0134b {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreElements()) {
            String nextToken = stringTokenizer.nextToken();
            f1104a.trace("Field: " + nextToken);
            int indexOf = nextToken.indexOf("=");
            if (indexOf == -1) {
                throw C0134b.m355a();
            }
            String substring = nextToken.substring(0, indexOf);
            String substring2 = nextToken.substring(indexOf + 1);
            f1104a.trace("FieldName: " + substring);
            f1104a.trace("FieldValue: " + substring2);
            this.f1105b.put(substring, substring2);
        }
    }

    /* renamed from: a */
    public final String mo438a(String str) {
        C0067a.m219a((Object) str, "key");
        return (String) this.f1105b.get(str);
    }

    public final String toString() {
        return "Signed Token: " + this.f1105b;
    }
}
