package com.google.ads;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0261b;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.ads.w */
public final class C0267w {

    /* renamed from: a */
    private static final Object f1335a = new Object();

    /* renamed from: b */
    private WeakReference f1336b;

    /* renamed from: c */
    private C0217a f1337c;

    /* renamed from: d */
    private C0240b f1338d;

    /* renamed from: e */
    private C0255q f1339e;

    /* renamed from: f */
    private C0241c f1340f;

    /* renamed from: g */
    private C0244f f1341g;

    /* renamed from: h */
    private C0269y f1342h;

    /* renamed from: i */
    private String f1343i;

    /* renamed from: j */
    private C0246h f1344j;

    /* renamed from: k */
    private C0220aa f1345k;

    /* renamed from: l */
    private Handler f1346l;

    /* renamed from: m */
    private long f1347m;

    /* renamed from: n */
    private boolean f1348n;

    /* renamed from: o */
    private boolean f1349o;

    /* renamed from: p */
    private SharedPreferences f1350p;

    /* renamed from: q */
    private long f1351q;

    /* renamed from: r */
    private C0234ao f1352r;

    /* renamed from: s */
    private boolean f1353s;

    /* renamed from: t */
    private LinkedList f1354t;

    /* renamed from: u */
    private LinkedList f1355u;

    /* renamed from: v */
    private int f1356v;

    /* renamed from: a */
    private synchronized void m588a(C0241c cVar) {
        boolean z = false;
        synchronized (this) {
            if (m589v()) {
                C0261b.m582e("loadAd called while the ad is already loading, so aborting.");
            } else if (AdActivity.m479c()) {
                C0261b.m582e("loadAd called while an interstitial or landing page is displayed, so aborting");
            } else {
                Activity d = mo700d();
                if (d == null) {
                    C0261b.m582e("activity is null while trying to load an ad.");
                } else if (AdUtil.m567c(d.getApplicationContext()) && AdUtil.m565b(d.getApplicationContext())) {
                    long j = this.f1350p.getLong("GoogleAdMobDoritosLife", 60000);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(d.getApplicationContext());
                    if (C0249k.m529a(d) && (!defaultSharedPreferences.contains("drt") || !defaultSharedPreferences.contains("drt_ts") || defaultSharedPreferences.getLong("drt_ts", 0) < new Date().getTime() - j)) {
                        z = true;
                    }
                    if (z) {
                        new Thread(new C0237ar(d)).start();
                    }
                    this.f1348n = false;
                    this.f1354t.clear();
                    this.f1340f = cVar;
                    this.f1339e = new C0255q(this);
                    this.f1339e.mo677a(cVar);
                }
            }
        }
    }

    /* renamed from: v */
    private synchronized boolean m589v() {
        return this.f1339e != null;
    }

    /* renamed from: w */
    private synchronized void m590w() {
        Activity activity = (Activity) this.f1336b.get();
        if (activity == null) {
            C0261b.m582e("activity was null while trying to ping tracking URLs.");
        } else {
            Iterator it = this.f1354t.iterator();
            while (it.hasNext()) {
                new Thread(new C0233an((String) it.next(), activity.getApplicationContext())).start();
            }
        }
    }

    /* renamed from: x */
    private synchronized void m591x() {
        Activity activity = (Activity) this.f1336b.get();
        if (activity == null) {
            C0261b.m582e("activity was null while trying to ping click tracking URLs.");
        } else {
            Iterator it = this.f1355u.iterator();
            while (it.hasNext()) {
                new Thread(new C0233an((String) it.next(), activity.getApplicationContext())).start();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo689a() {
        Activity d = mo700d();
        if (d == null) {
            C0261b.m574a("activity was null while trying to create an AdWebView.");
        } else {
            this.f1344j = new C0246h(d.getApplicationContext(), this.f1341g);
            this.f1344j.setVisibility(8);
            if (this.f1337c instanceof AdView) {
                this.f1345k = new C0220aa(this, C0248j.f1265b, true, false);
            } else {
                this.f1345k = new C0220aa(this, C0248j.f1265b, true, true);
            }
            this.f1344j.setWebViewClient(this.f1345k);
        }
    }

    /* renamed from: a */
    public final synchronized void mo690a(float f) {
        this.f1351q = (long) (1000.0f * f);
    }

    /* renamed from: a */
    public final synchronized void mo691a(int i) {
        this.f1356v = i;
    }

    /* renamed from: a */
    public final void mo692a(long j) {
        synchronized (f1335a) {
            SharedPreferences.Editor edit = this.f1350p.edit();
            edit.putLong("Timeout" + this.f1343i, j);
            edit.commit();
            if (this.f1353s) {
                this.f1347m = j;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo693a(C0242d dVar) {
        this.f1339e = null;
        if (this.f1337c instanceof C0247i) {
            if (dVar == C0242d.NO_FILL) {
                this.f1342h.mo735n();
            } else if (dVar == C0242d.NETWORK_ERROR) {
                this.f1342h.mo733l();
            }
        }
        C0261b.m580c("onFailedToReceiveAd(" + dVar + ")");
        if (this.f1338d != null) {
            C0240b bVar = this.f1338d;
            C0217a aVar = this.f1337c;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo694a(Runnable runnable) {
        this.f1346l.post(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo695a(String str) {
        C0261b.m574a("Adding a tracking URL: " + str);
        this.f1354t.add(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo696a(LinkedList linkedList) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C0261b.m574a("Adding a click tracking URL: " + ((String) it.next()));
        }
        this.f1355u = linkedList;
    }

    /* renamed from: b */
    public final synchronized void mo697b() {
        if (this.f1349o) {
            C0261b.m574a("Disabling refreshing.");
            this.f1346l.removeCallbacks(this.f1352r);
            this.f1349o = false;
        } else {
            C0261b.m574a("Refreshing is already disabled.");
        }
    }

    /* renamed from: b */
    public final synchronized void mo698b(long j) {
        if (j > 0) {
            this.f1350p.edit().putLong("GoogleAdMobDoritosLife", j).commit();
        }
    }

    /* renamed from: c */
    public final synchronized void mo699c() {
        if (!(this.f1337c instanceof AdView)) {
            C0261b.m574a("Tried to enable refreshing on something other than an AdView.");
        } else if (!this.f1349o) {
            C0261b.m574a("Enabling refreshing every " + this.f1351q + " milliseconds.");
            this.f1346l.postDelayed(this.f1352r, this.f1351q);
            this.f1349o = true;
        } else {
            C0261b.m574a("Refreshing is already enabled.");
        }
    }

    /* renamed from: d */
    public final Activity mo700d() {
        return (Activity) this.f1336b.get();
    }

    /* renamed from: e */
    public final C0217a mo701e() {
        return this.f1337c;
    }

    /* renamed from: f */
    public final synchronized C0255q mo702f() {
        return this.f1339e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final String mo703g() {
        return this.f1343i;
    }

    /* renamed from: h */
    public final synchronized C0246h mo704h() {
        return this.f1344j;
    }

    /* renamed from: i */
    public final synchronized C0220aa mo705i() {
        return this.f1345k;
    }

    /* renamed from: j */
    public final C0244f mo706j() {
        return this.f1341g;
    }

    /* renamed from: k */
    public final C0269y mo707k() {
        return this.f1342h;
    }

    /* renamed from: l */
    public final synchronized int mo708l() {
        return this.f1356v;
    }

    /* renamed from: m */
    public final long mo709m() {
        return this.f1347m;
    }

    /* renamed from: n */
    public final synchronized boolean mo710n() {
        return this.f1349o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final synchronized void mo711o() {
        this.f1339e = null;
        this.f1348n = true;
        this.f1344j.setVisibility(0);
        this.f1342h.mo725c();
        if (this.f1337c instanceof AdView) {
            m590w();
        }
        C0261b.m580c("onReceiveAd()");
        if (this.f1338d != null) {
            C0240b bVar = this.f1338d;
            C0217a aVar = this.f1337c;
        }
    }

    /* renamed from: p */
    public final synchronized void mo712p() {
        this.f1342h.mo736o();
        C0261b.m580c("onDismissScreen()");
        if (this.f1338d != null) {
            C0240b bVar = this.f1338d;
            C0217a aVar = this.f1337c;
        }
    }

    /* renamed from: q */
    public final synchronized void mo713q() {
        C0261b.m580c("onPresentScreen()");
        if (this.f1338d != null) {
            C0240b bVar = this.f1338d;
            C0217a aVar = this.f1337c;
        }
    }

    /* renamed from: r */
    public final synchronized void mo714r() {
        C0261b.m580c("onLeaveApplication()");
        if (this.f1338d != null) {
            C0240b bVar = this.f1338d;
            C0217a aVar = this.f1337c;
        }
    }

    /* renamed from: s */
    public final void mo715s() {
        this.f1342h.mo723b();
        m591x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final synchronized boolean mo716t() {
        return !this.f1355u.isEmpty();
    }

    /* renamed from: u */
    public final synchronized void mo717u() {
        if (this.f1340f == null) {
            C0261b.m574a("Tried to refresh before calling loadAd().");
        } else if (this.f1337c instanceof AdView) {
            if (!((AdView) this.f1337c).isShown() || !AdUtil.m569d()) {
                C0261b.m574a("Not refreshing because the ad is not visible.");
            } else {
                C0261b.m580c("Refreshing ad.");
                m588a(this.f1340f);
            }
            this.f1346l.postDelayed(this.f1352r, this.f1351q);
        } else {
            C0261b.m574a("Tried to refresh an ad that wasn't an AdView.");
        }
    }
}
