package com.amazon.android.p006d;

import android.os.Looper;

/* renamed from: com.amazon.android.d.a */
public final class C0067a {
    /* renamed from: a */
    public static void m218a() {
        long id = Looper.getMainLooper().getThread().getId();
        if (Thread.currentThread().getId() != id) {
            m220a("Executing thread must be thread: " + id + ", was: " + Thread.currentThread().getId());
        }
    }

    /* renamed from: a */
    public static void m219a(Object obj, String str) {
        if (obj == null) {
            m220a("Argument: " + str + " cannot be null");
        }
    }

    /* renamed from: a */
    private static void m220a(String str) {
        throw new C0068b(str);
    }

    /* renamed from: a */
    public static void m221a(boolean z, String str) {
        if (!z) {
            m220a(str);
        }
    }

    /* renamed from: b */
    public static void m222b(boolean z, String str) {
        if (z) {
            m220a(str);
        }
    }
}
