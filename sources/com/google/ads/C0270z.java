package com.google.ads;

import android.os.Handler;
import com.google.ads.util.C0261b;
import java.lang.ref.WeakReference;

/* renamed from: com.google.ads.z */
final class C0270z implements Runnable {

    /* renamed from: a */
    private WeakReference f1368a;

    /* renamed from: b */
    private Handler f1369b = new Handler();

    public C0270z(C0245g gVar) {
        this.f1368a = new WeakReference(gVar);
    }

    /* renamed from: a */
    public final void mo738a() {
        this.f1369b.postDelayed(this, 250);
    }

    public final void run() {
        C0245g gVar = (C0245g) this.f1368a.get();
        if (gVar == null) {
            C0261b.m581d("The video must be gone, so cancelling the timeupdate task.");
            return;
        }
        gVar.mo657e();
        this.f1369b.postDelayed(this, 250);
    }
}
