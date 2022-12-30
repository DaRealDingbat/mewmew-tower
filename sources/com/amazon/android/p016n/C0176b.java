package com.amazon.android.p016n;

import com.amazon.android.p010h.C0137b;
import java.util.Date;

/* renamed from: com.amazon.android.n.b */
public abstract class C0176b extends C0137b {

    /* renamed from: a */
    final Object f1154a;

    /* renamed from: b */
    private final Date f1155b;

    public C0176b(Object obj, Date date) {
        this.f1154a = obj;
        this.f1155b = date;
    }

    public final Date getExpiration() {
        return this.f1155b;
    }
}
