package com.google.ads;

import android.content.DialogInterface;
import java.util.HashMap;

/* renamed from: com.google.ads.o */
final class C0253o implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private C0267w f1270a;

    public C0253o(C0267w wVar) {
        this.f1270a = wVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("u", "market://details?id=com.google.android.apps.plus");
        AdActivity.m475a(this.f1270a, new C0268x("intent", hashMap));
    }
}
