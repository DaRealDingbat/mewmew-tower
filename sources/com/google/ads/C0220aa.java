package com.google.ads;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0261b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.aa */
public final class C0220aa extends WebViewClient {

    /* renamed from: a */
    private C0267w f1210a;

    /* renamed from: b */
    private Map f1211b;

    /* renamed from: c */
    private boolean f1212c;

    /* renamed from: d */
    private boolean f1213d;

    /* renamed from: e */
    private boolean f1214e = false;

    /* renamed from: f */
    private boolean f1215f = false;

    public C0220aa(C0267w wVar, Map map, boolean z, boolean z2) {
        this.f1210a = wVar;
        this.f1211b = map;
        this.f1212c = z;
        this.f1213d = z2;
    }

    /* renamed from: a */
    public final void mo633a() {
        this.f1213d = false;
    }

    /* renamed from: b */
    public final void mo634b() {
        this.f1214e = true;
    }

    /* renamed from: c */
    public final void mo635c() {
        this.f1215f = true;
    }

    public final void onPageFinished(WebView webView, String str) {
        if (this.f1214e) {
            C0255q f = this.f1210a.mo702f();
            if (f != null) {
                f.mo675a();
            } else {
                C0261b.m574a("adLoader was null while trying to setFinishedLoadingHtml().");
            }
            this.f1214e = false;
        }
        if (this.f1215f) {
            C0248j.m520a(webView);
            this.f1215f = false;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C0261b.m574a("shouldOverrideUrlLoading(\"" + str + "\")");
        Uri parse = Uri.parse(str);
        HashMap b = AdUtil.m563b(parse);
        if (b == null) {
            C0261b.m582e("An error occurred while parsing the url parameters.");
            return true;
        }
        String str2 = (String) b.get("ai");
        if (str2 != null) {
            this.f1210a.mo707k().mo722a(str2);
        }
        if (C0248j.m525a(parse)) {
            C0248j.m524a(this.f1210a, this.f1211b, parse, webView);
            return true;
        } else if (this.f1213d) {
            if (AdUtil.m559a(parse)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("u", str);
            AdActivity.m475a(this.f1210a, new C0268x("intent", hashMap));
            return true;
        } else if (this.f1212c) {
            String str3 = (!this.f1210a.mo716t() || !AdUtil.m559a(parse)) ? "intent" : "webapp";
            HashMap hashMap2 = new HashMap();
            hashMap2.put("u", parse.toString());
            AdActivity.m475a(this.f1210a, new C0268x(str3, hashMap2));
            return true;
        } else {
            C0261b.m582e("URL is not a GMSG and can't handle URL: " + str);
            return true;
        }
    }
}
