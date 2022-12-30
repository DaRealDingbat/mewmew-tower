package com.amazon.android.framework.context;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.amazon.android.framework.context.b */
final class C0079b extends BroadcastReceiver {

    /* renamed from: a */
    private /* synthetic */ C0081d f943a;

    C0079b(C0081d dVar) {
        this.f943a = dVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C0081d.m240a(this.f943a, intent);
    }
}
