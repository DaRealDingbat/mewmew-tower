package com.google.ads;

import android.webkit.WebView;
import com.google.ads.util.C0261b;
import java.util.HashMap;

/* renamed from: com.google.ads.ai */
public final class C0228ai implements C0221ab {
    /* renamed from: a */
    public final void mo638a(C0267w wVar, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("url");
        boolean equals = "1".equals(hashMap.get("drt_include"));
        C0261b.m580c("Received ad url: <\"url\": \"" + str + "\", \"afmaNotifyDt\": \"" + ((String) hashMap.get("afma_notify_dt")) + "\">");
        C0255q f = wVar.mo702f();
        if (f != null) {
            f.mo681a(equals);
            f.mo682b(str);
        }
    }
}
