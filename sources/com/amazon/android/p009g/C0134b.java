package com.amazon.android.p009g;

import com.amazon.android.framework.exception.KiwiException;

/* renamed from: com.amazon.android.g.b */
public class C0134b extends KiwiException {
    private static final long serialVersionUID = 1;

    public C0134b(String str, String str2) {
        super("SIGNED_TOKEN_PARSE_FAILURE", str, str2);
    }

    /* renamed from: a */
    public static C0134b m355a() {
        return new C0134b("INVALID_FORMAT", (String) null);
    }
}
