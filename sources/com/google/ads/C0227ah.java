package com.google.ads;

import android.webkit.WebView;
import com.google.ads.util.C0261b;
import java.util.HashMap;

/* renamed from: com.google.ads.ah */
public final class C0227ah implements C0221ab {
    /* renamed from: a */
    public final void mo638a(C0267w wVar, HashMap hashMap, WebView webView) {
        C0261b.m582e("Invalid " + ((String) hashMap.get("type")) + " request error: " + ((String) hashMap.get("errors")));
        C0255q f = wVar.mo702f();
        if (f != null) {
            f.mo678a(C0242d.INVALID_REQUEST);
        }
    }
}
