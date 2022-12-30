package com.google.ads.util;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: com.google.ads.util.f */
public final class C0265f {
    /* renamed from: a */
    private static int m585a(Context context, float f, int i) {
        return (context.getApplicationInfo().flags & 8192) != 0 ? (int) (((float) i) / f) : i;
    }

    /* renamed from: a */
    public static int m586a(Context context, DisplayMetrics displayMetrics) {
        return m585a(context, displayMetrics.density, displayMetrics.heightPixels);
    }

    /* renamed from: b */
    public static int m587b(Context context, DisplayMetrics displayMetrics) {
        return m585a(context, displayMetrics.density, displayMetrics.widthPixels);
    }
}
