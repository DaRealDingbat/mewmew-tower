package com.google.ads.util;

import com.amazon.mas.kiwi.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: com.google.ads.util.c */
public class C0262c {

    /* renamed from: a */
    static final /* synthetic */ boolean f1318a = (!C0262c.class.desiredAssertionStatus());

    private C0262c() {
    }

    /* renamed from: a */
    public static String m583a(byte[] bArr) {
        int i;
        try {
            int length = bArr.length;
            C0264e eVar = new C0264e();
            int i2 = (length / 3) * 4;
            if (!eVar.f1325d) {
                switch (length % 3) {
                    case 0:
                        break;
                    case Base64.ENCODE:
                        i2 += 2;
                        break;
                    case Base64.GZIP:
                        i2 += 3;
                        break;
                }
            } else if (length % 3 > 0) {
                i2 += 4;
            }
            if (!eVar.f1326e || length <= 0) {
                i = i2;
            } else {
                i = ((eVar.f1327f ? 2 : 1) * (((length - 1) / 57) + 1)) + i2;
            }
            eVar.f1319a = new byte[i];
            eVar.mo687a(bArr, length);
            if (f1318a || eVar.f1320b == i) {
                return new String(eVar.f1319a, "US-ASCII");
            }
            throw new AssertionError();
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
