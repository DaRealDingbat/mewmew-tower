package com.amazon.android.p008f;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.amazon.android.f.f */
public final class C0077f {

    /* renamed from: a */
    final int f938a;

    /* renamed from: b */
    public final int f939b;

    /* renamed from: c */
    private final Activity f940c;

    /* renamed from: d */
    private final Intent f941d;

    public C0077f(Activity activity, int i, int i2, Intent intent) {
        this.f940c = activity;
        this.f938a = i;
        this.f939b = i2;
        this.f941d = intent;
    }

    public final String toString() {
        return "ActivtyResult: [ requestCode: " + this.f938a + ", resultCode: " + this.f939b + ", activity: " + this.f940c + ", intent: " + this.f941d + "]";
    }
}
