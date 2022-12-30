package com.google.ads;

import android.webkit.WebView;
import com.google.ads.util.C0261b;
import java.util.HashMap;

/* renamed from: com.google.ads.ak */
public final class C0230ak implements C0221ab {
    /* renamed from: a */
    public final void mo638a(C0267w wVar, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("a");
        if (str == null) {
            C0261b.m574a("Could not get the action parameter for open GMSG.");
        } else if (str.equals("webapp")) {
            AdActivity.m475a(wVar, new C0268x("webapp", hashMap));
        } else {
            AdActivity.m475a(wVar, new C0268x("intent", hashMap));
        }
    }
}
