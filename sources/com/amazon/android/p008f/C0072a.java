package com.amazon.android.p008f;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.amazon.android.f.a */
final class C0072a {

    /* renamed from: a */
    final int f925a;

    /* renamed from: b */
    Activity f926b;

    /* renamed from: c */
    private final Intent f927c;

    public C0072a(Intent intent, int i) {
        this.f927c = intent;
        this.f925a = i;
    }

    /* renamed from: a */
    public final void mo297a(Activity activity) {
        C0074c.f928a.trace("Calling startActivityForResult from: " + activity);
        activity.startActivityForResult(this.f927c, this.f925a);
        this.f926b = activity;
    }
}
