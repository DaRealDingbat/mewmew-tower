package com.google.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.ads.k */
public final class C0249k {
    /* renamed from: a */
    public static boolean m529a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.google.android.apps.plus", "com.google.android.apps.circles.platform.PlusOneActivity"));
        return m530a(intent, context);
    }

    /* renamed from: a */
    public static boolean m530a(Intent intent, Context context) {
        return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }
}
