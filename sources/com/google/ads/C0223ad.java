package com.google.ads;

import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.util.C0261b;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.google.ads.ad */
public final class C0223ad implements C0221ab {
    /* renamed from: a */
    public final void mo638a(C0267w wVar, HashMap hashMap, WebView webView) {
        Uri parse;
        String host;
        String str = (String) hashMap.get("u");
        if (str == null) {
            C0261b.m582e("Could not get URL from click gmsg.");
            return;
        }
        C0269y k = wVar.mo707k();
        if (!(k == null || (host = parse.getHost()) == null || !host.toLowerCase(Locale.US).endsWith(".admob.com"))) {
            String str2 = null;
            String path = (parse = Uri.parse(str)).getPath();
            if (path != null) {
                String[] split = path.split("/");
                if (split.length >= 4) {
                    str2 = split[2] + "/" + split[3];
                }
            }
            k.mo724b(str2);
        }
        new Thread(new C0233an(str, webView.getContext().getApplicationContext())).start();
    }
}
