package com.google.ads;

import android.content.Context;
import android.location.Location;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0261b;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.c */
public class C0241c {

    /* renamed from: a */
    public static final String f1229a = AdUtil.m552a("emulator");

    /* renamed from: b */
    private C0243e f1230b = null;

    /* renamed from: c */
    private String f1231c = null;

    /* renamed from: d */
    private Set f1232d = null;

    /* renamed from: e */
    private boolean f1233e = false;

    /* renamed from: f */
    private Map f1234f = null;

    /* renamed from: g */
    private Location f1235g = null;

    /* renamed from: h */
    private boolean f1236h = false;

    /* renamed from: i */
    private boolean f1237i = false;

    /* renamed from: j */
    private Set f1238j = null;

    /* renamed from: a */
    public Map mo631a(Context context) {
        String a;
        boolean z = false;
        HashMap hashMap = new HashMap();
        if (this.f1232d != null) {
            hashMap.put("kw", this.f1232d);
        }
        if (this.f1230b != null) {
            hashMap.put("cust_gender", Integer.valueOf(this.f1230b.ordinal()));
        }
        if (this.f1231c != null) {
            hashMap.put("cust_age", this.f1231c);
        }
        if (this.f1235g != null) {
            hashMap.put("uule", AdUtil.m551a(this.f1235g));
        }
        if (this.f1236h) {
            hashMap.put("testing", 1);
        }
        if (this.f1233e) {
            hashMap.put("pto", 1);
        } else {
            hashMap.put("cipa", Integer.valueOf(C0249k.m529a(context) ? 1 : 0));
        }
        if (!(this.f1238j == null || (a = AdUtil.m550a(context)) == null || !this.f1238j.contains(a))) {
            z = true;
        }
        if (z) {
            hashMap.put("adtest", "on");
        } else if (!this.f1237i) {
            C0261b.m580c("To get test ads on this device, call adRequest.addTestDevice(" + (AdUtil.m566c() ? "AdRequest.TEST_EMULATOR" : "\"" + AdUtil.m550a(context) + "\"") + ");");
            this.f1237i = true;
        }
        if (this.f1234f != null) {
            hashMap.put("extras", this.f1234f);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo644a(String str, Object obj) {
        if (this.f1234f == null) {
            this.f1234f = new HashMap();
        }
        this.f1234f.put(str, obj);
    }
}
