package com.google.ads;

import java.util.LinkedList;

/* renamed from: com.google.ads.v */
final class C0266v implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0255q f1331a;

    /* renamed from: b */
    private final C0267w f1332b;

    /* renamed from: c */
    private final LinkedList f1333c;

    /* renamed from: d */
    private final int f1334d;

    public C0266v(C0255q qVar, C0267w wVar, LinkedList linkedList, int i) {
        this.f1331a = qVar;
        this.f1332b = wVar;
        this.f1333c = linkedList;
        this.f1334d = i;
    }

    public final void run() {
        this.f1332b.mo696a(this.f1333c);
        this.f1332b.mo691a(this.f1334d);
        this.f1332b.mo711o();
    }
}
