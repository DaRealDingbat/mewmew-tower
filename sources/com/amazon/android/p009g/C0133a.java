package com.amazon.android.p009g;

import com.amazon.android.framework.exception.KiwiException;

/* renamed from: com.amazon.android.g.a */
public class C0133a extends KiwiException {
    private static final long serialVersionUID = 1;

    public C0133a(String str, Throwable th) {
        super("DATA_AUTH_KEY_LOAD_FAILURE", str, th);
    }

    /* renamed from: a */
    public static C0133a m354a(Throwable th) {
        return new C0133a("CERT_FAILED_TO_LOAD", th);
    }
}
