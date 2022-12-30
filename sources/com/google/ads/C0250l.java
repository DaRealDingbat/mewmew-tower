package com.google.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.util.C0261b;
import java.util.HashMap;

/* renamed from: com.google.ads.l */
public final class C0250l implements C0221ab {
    /* renamed from: a */
    public final void mo638a(C0267w wVar, HashMap hashMap, WebView webView) {
        String str = (String) hashMap.get("a");
        if (str != null) {
            if (str.equals("resize")) {
                C0248j.m521a(webView, "(G_resizeIframe(" + ((String) hashMap.get("u")) + "))");
                return;
            } else if (str.equals("state")) {
                new Thread(new C0238as(wVar.mo700d(), webView, (String) hashMap.get("u"))).start();
                return;
            }
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.google.android.apps.plus", "com.google.android.apps.circles.platform.PlusOneActivity"));
        Activity d = wVar.mo700d();
        if (d == null) {
            C0261b.m582e("Activity was null when responding to +1 action");
        } else if (C0249k.m530a(intent, d.getApplicationContext())) {
            AdActivity.m475a(wVar, new C0268x("plusone", hashMap));
        } else if (!C0249k.m530a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.apps.plus")), d.getApplicationContext())) {
        } else {
            if (TextUtils.isEmpty((CharSequence) hashMap.get("d")) || TextUtils.isEmpty((CharSequence) hashMap.get("o")) || TextUtils.isEmpty((CharSequence) hashMap.get("c"))) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("u", "market://details?id=com.google.android.apps.plus");
                AdActivity.m475a(wVar, new C0268x("intent", hashMap2));
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(d);
            builder.setMessage((CharSequence) hashMap.get("d")).setPositiveButton((CharSequence) hashMap.get("o"), new C0253o(wVar)).setNegativeButton((CharSequence) hashMap.get("c"), new C0251m());
            builder.create().show();
        }
    }
}
