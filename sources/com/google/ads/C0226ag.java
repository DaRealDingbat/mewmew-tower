package com.google.ads;

import android.webkit.WebView;
import com.google.ads.util.C0261b;
import java.util.HashMap;

/* renamed from: com.google.ads.ag */
public final class C0226ag implements C0221ab {
    /* renamed from: a */
    public final void mo638a(C0267w wVar, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("u");
        if (str == null) {
            C0261b.m582e("Could not get URL from click gmsg.");
        } else {
            new Thread(new C0233an(str, webView.getContext().getApplicationContext())).start();
        }
    }
}
