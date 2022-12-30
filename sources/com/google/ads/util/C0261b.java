package com.google.ads.util;

import android.util.Log;

/* renamed from: com.google.ads.util.b */
public final class C0261b {
    /* renamed from: a */
    public static void m574a(String str) {
        if (m577a("Ads", 3)) {
            Log.d("Ads", str);
        }
    }

    /* renamed from: a */
    public static void m575a(String str, Throwable th) {
        if (m577a("Ads", 6)) {
            Log.e("Ads", str, th);
        }
    }

    /* renamed from: a */
    public static void m576a(Throwable th) {
        if (m577a("Ads", 5)) {
            Log.w("Ads", th);
        }
    }

    /* renamed from: a */
    private static boolean m577a(String str, int i) {
        return (i >= 5) || Log.isLoggable(str, i);
    }

    /* renamed from: b */
    public static void m578b(String str) {
        if (m577a("Ads", 6)) {
            Log.e("Ads", str);
        }
    }

    /* renamed from: b */
    public static void m579b(String str, Throwable th) {
        if (m577a("Ads", 5)) {
            Log.w("Ads", str, th);
        }
    }

    /* renamed from: c */
    public static void m580c(String str) {
        if (m577a("Ads", 4)) {
            Log.i("Ads", str);
        }
    }

    /* renamed from: d */
    public static void m581d(String str) {
        if (m577a("Ads", 2)) {
            Log.v("Ads", str);
        }
    }

    /* renamed from: e */
    public static void m582e(String str) {
        if (m577a("Ads", 5)) {
            Log.w("Ads", str);
        }
    }
}
