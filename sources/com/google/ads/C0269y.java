package com.google.ads;

import android.os.SystemClock;
import com.google.ads.util.C0261b;
import java.util.LinkedList;

/* renamed from: com.google.ads.y */
public final class C0269y {

    /* renamed from: f */
    private static long f1359f = 0;

    /* renamed from: a */
    public String f1360a;

    /* renamed from: b */
    private LinkedList f1361b;

    /* renamed from: c */
    private long f1362c;

    /* renamed from: d */
    private long f1363d;

    /* renamed from: e */
    private LinkedList f1364e;

    /* renamed from: g */
    private String f1365g;

    /* renamed from: h */
    private boolean f1366h;

    /* renamed from: i */
    private boolean f1367i;

    /* renamed from: i */
    static long m624i() {
        return f1359f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo721a() {
        this.f1361b.clear();
        this.f1362c = 0;
        this.f1363d = 0;
        this.f1364e.clear();
        this.f1365g = null;
        this.f1366h = false;
        this.f1367i = false;
    }

    /* renamed from: a */
    public final void mo722a(String str) {
        C0261b.m581d("Prior ad identifier = " + str);
        this.f1365g = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo723b() {
        C0261b.m581d("Ad clicked.");
        this.f1361b.add(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* renamed from: b */
    public final void mo724b(String str) {
        C0261b.m581d("Prior impression ticket = " + str);
        this.f1360a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo725c() {
        C0261b.m581d("Ad request loaded.");
        this.f1362c = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo726d() {
        C0261b.m581d("Ad request started.");
        this.f1363d = SystemClock.elapsedRealtime();
        f1359f++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo727e() {
        if (this.f1361b.size() != this.f1364e.size()) {
            return -1;
        }
        return (long) this.f1361b.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final String mo728f() {
        if (this.f1361b.isEmpty() || this.f1361b.size() != this.f1364e.size()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f1361b.size()) {
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(((Long) this.f1364e.get(i2)).longValue() - ((Long) this.f1361b.get(i2)).longValue()));
            i = i2 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final String mo729g() {
        if (this.f1361b.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f1361b.size()) {
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(((Long) this.f1361b.get(i2)).longValue() - this.f1362c));
            i = i2 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final long mo730h() {
        return this.f1362c - this.f1363d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final String mo731j() {
        return this.f1365g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo732k() {
        return this.f1366h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo733l() {
        C0261b.m581d("Interstitial network error.");
        this.f1366h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo734m() {
        return this.f1367i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo735n() {
        C0261b.m581d("Interstitial no fill.");
        this.f1367i = true;
    }

    /* renamed from: o */
    public final void mo736o() {
        C0261b.m581d("Landing page dismissed.");
        this.f1364e.add(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final String mo737p() {
        return this.f1360a;
    }
}
