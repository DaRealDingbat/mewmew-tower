package com.google.ads;

import com.google.ads.util.C0261b;
import java.lang.ref.WeakReference;

/* renamed from: com.google.ads.ao */
public final class C0234ao implements Runnable {

    /* renamed from: a */
    private WeakReference f1218a;

    public final void run() {
        C0267w wVar = (C0267w) this.f1218a.get();
        if (wVar == null) {
            C0261b.m574a("The ad must be gone, so cancelling the refresh timer.");
        } else {
            wVar.mo717u();
        }
    }
}
