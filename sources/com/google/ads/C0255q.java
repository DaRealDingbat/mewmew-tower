package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.google.ads.p023a.C0218a;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0261b;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.ads.q */
public final class C0255q implements Runnable {

    /* renamed from: a */
    private String f1276a = null;

    /* renamed from: b */
    private String f1277b = null;

    /* renamed from: c */
    private C0254p f1278c;

    /* renamed from: d */
    private C0267w f1279d;

    /* renamed from: e */
    private C0241c f1280e;

    /* renamed from: f */
    private WebView f1281f;

    /* renamed from: g */
    private String f1282g = null;

    /* renamed from: h */
    private LinkedList f1283h = new LinkedList();

    /* renamed from: i */
    private volatile boolean f1284i;

    /* renamed from: j */
    private C0242d f1285j = null;

    /* renamed from: k */
    private boolean f1286k = false;

    /* renamed from: l */
    private int f1287l = -1;

    /* renamed from: m */
    private Thread f1288m;

    /* renamed from: n */
    private boolean f1289n;

    public C0255q(C0267w wVar) {
        this.f1279d = wVar;
        Activity d = wVar.mo700d();
        if (d != null) {
            this.f1281f = new C0246h(d, (C0244f) null);
            this.f1281f.setWebViewClient(new C0220aa(wVar, C0248j.f1264a, false, false));
            this.f1281f.setVisibility(8);
            this.f1281f.setWillNotDraw(true);
            this.f1278c = new C0254p(this, wVar);
            return;
        }
        this.f1281f = null;
        this.f1278c = null;
        C0261b.m582e("activity was null while trying to create an AdLoader.");
    }

    /* renamed from: a */
    private String m537a(C0241c cVar, Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        Map a = cVar.mo631a(applicationContext);
        C0269y k = this.f1279d.mo707k();
        long h = k.mo730h();
        if (h > 0) {
            a.put("prl", Long.valueOf(h));
        }
        String g = k.mo729g();
        if (g != null) {
            a.put("ppcl", g);
        }
        String f = k.mo728f();
        if (f != null) {
            a.put("pcl", f);
        }
        long e = k.mo727e();
        if (e > 0) {
            a.put("pcc", Long.valueOf(e));
        }
        a.put("preqs", Long.valueOf(C0269y.m624i()));
        String j = k.mo731j();
        if (j != null) {
            a.put("pai", j);
        }
        if (k.mo732k()) {
            a.put("aoi_timeout", "true");
        }
        if (k.mo734m()) {
            a.put("aoi_nofill", "true");
        }
        String p = k.mo737p();
        if (p != null) {
            a.put("pit", p);
        }
        k.mo721a();
        k.mo726d();
        if (this.f1279d.mo701e() instanceof C0247i) {
            a.put("format", "interstitial_mb");
        } else {
            C0244f j2 = this.f1279d.mo706j();
            String fVar = j2.toString();
            if (fVar != null) {
                a.put("format", fVar);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("w", Integer.valueOf(j2.mo646a()));
                hashMap.put("h", Integer.valueOf(j2.mo647b()));
                a.put("ad_frame", hashMap);
            }
        }
        a.put("slotname", this.f1279d.mo703g());
        a.put("js", "afma-sdk-a-v4.3.1");
        try {
            int i = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionCode;
            String f2 = AdUtil.m571f(applicationContext);
            if (!TextUtils.isEmpty(f2)) {
                a.put("mv", f2);
            }
            a.put("msid", applicationContext.getPackageName());
            a.put("app_name", i + ".android." + applicationContext.getPackageName());
            a.put("isu", AdUtil.m550a(applicationContext));
            String d = AdUtil.m568d(applicationContext);
            if (d == null) {
                throw new C0259u(this, "NETWORK_ERROR");
            }
            a.put("net", d);
            String e2 = AdUtil.m570e(applicationContext);
            if (!(e2 == null || e2.length() == 0)) {
                a.put("cap", e2);
            }
            a.put("u_audio", Integer.valueOf(AdUtil.m572g(applicationContext).ordinal()));
            DisplayMetrics a2 = AdUtil.m549a(activity);
            a.put("u_sd", Float.valueOf(a2.density));
            a.put("u_h", Integer.valueOf(AdUtil.m548a(applicationContext, a2)));
            a.put("u_w", Integer.valueOf(AdUtil.m561b(applicationContext, a2)));
            a.put("hl", Locale.getDefault().getLanguage());
            if (AdUtil.m566c()) {
                a.put("simulator", 1);
            }
            String str = (this.f1280e instanceof C0218a ? "<html><head><script src=\"http://www.gstatic.com/safa/sdk-core-v40.js\"></script><script>" : "<html><head><script src=\"http://media.admob.com/sdk-core-v40.js\"></script><script>") + "AFMA_buildAdURL(" + AdUtil.m553a(a) + ");</script></head><body></body></html>";
            C0261b.m580c("adRequestUrlHtml: " + str);
            return str;
        } catch (PackageManager.NameNotFoundException e3) {
            throw new C0257s(this, "NameNotFoundException");
        }
    }

    /* renamed from: a */
    private void m538a(C0242d dVar, boolean z) {
        this.f1278c.mo671a();
        this.f1279d.mo694a((Runnable) new C0256r(this, this.f1279d, this.f1281f, this.f1278c, dVar, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo675a() {
        this.f1286k = true;
        notify();
    }

    /* renamed from: a */
    public final synchronized void mo676a(int i) {
        this.f1287l = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo677a(C0241c cVar) {
        this.f1280e = cVar;
        this.f1284i = false;
        this.f1288m = new Thread(this);
        this.f1288m.start();
    }

    /* renamed from: a */
    public final synchronized void mo678a(C0242d dVar) {
        this.f1285j = dVar;
        notify();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo679a(String str) {
        this.f1283h.add(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo680a(String str, String str2) {
        this.f1276a = str2;
        this.f1277b = str;
        notify();
    }

    /* renamed from: a */
    public final void mo681a(boolean z) {
        this.f1289n = z;
    }

    /* renamed from: b */
    public final synchronized void mo682b(String str) {
        this.f1282g = str;
        notify();
    }

    public final void run() {
        synchronized (this) {
            if (this.f1281f == null || this.f1278c == null) {
                C0261b.m582e("adRequestWebView was null while trying to load an ad.");
                m538a(C0242d.INTERNAL_ERROR, false);
                return;
            }
            Activity d = this.f1279d.mo700d();
            if (d == null) {
                C0261b.m582e("activity was null while forming an ad request.");
                m538a(C0242d.INTERNAL_ERROR, false);
                return;
            }
            long m = this.f1279d.mo709m();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Object obj = this.f1280e.mo631a(d).get("extras");
            if (obj instanceof Map) {
                Map map = (Map) obj;
                Object obj2 = map.get("_adUrl");
                if (obj2 instanceof String) {
                    this.f1276a = (String) obj2;
                }
                Object obj3 = map.get("_orientation");
                if (obj3 instanceof String) {
                    if (obj3.equals("p")) {
                        this.f1287l = 1;
                    } else if (obj3.equals("l")) {
                        this.f1287l = 0;
                    }
                }
            }
            if (this.f1276a == null) {
                try {
                    this.f1279d.mo694a((Runnable) new C0258t(this, this.f1281f, (String) null, m537a(this.f1280e, d)));
                    long elapsedRealtime2 = m - (SystemClock.elapsedRealtime() - elapsedRealtime);
                    if (elapsedRealtime2 > 0) {
                        try {
                            wait(elapsedRealtime2);
                        } catch (InterruptedException e) {
                            C0261b.m574a("AdLoader InterruptedException while getting the URL: " + e);
                            return;
                        }
                    }
                    try {
                        if (!this.f1284i) {
                            if (this.f1285j != null) {
                                m538a(this.f1285j, false);
                                return;
                            } else if (this.f1282g == null) {
                                C0261b.m580c("AdLoader timed out after " + m + "ms while getting the URL.");
                                m538a(C0242d.NETWORK_ERROR, false);
                                return;
                            } else {
                                this.f1278c.mo673a(this.f1289n);
                                this.f1278c.mo672a(this.f1282g);
                                long elapsedRealtime3 = m - (SystemClock.elapsedRealtime() - elapsedRealtime);
                                if (elapsedRealtime3 > 0) {
                                    try {
                                        wait(elapsedRealtime3);
                                    } catch (InterruptedException e2) {
                                        C0261b.m574a("AdLoader InterruptedException while getting the HTML: " + e2);
                                        return;
                                    }
                                }
                                if (!this.f1284i) {
                                    if (this.f1285j != null) {
                                        m538a(this.f1285j, false);
                                        return;
                                    } else if (this.f1277b == null) {
                                        C0261b.m580c("AdLoader timed out after " + m + "ms while getting the HTML.");
                                        m538a(C0242d.NETWORK_ERROR, false);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } catch (Exception e3) {
                        C0261b.m575a("An unknown error occurred in AdLoader.", (Throwable) e3);
                        m538a(C0242d.INTERNAL_ERROR, true);
                    }
                } catch (C0259u e4) {
                    C0261b.m580c("Unable to connect to network: " + e4);
                    m538a(C0242d.NETWORK_ERROR, false);
                    return;
                } catch (C0257s e5) {
                    C0261b.m580c("Caught internal exception: " + e5);
                    m538a(C0242d.INTERNAL_ERROR, false);
                    return;
                }
            }
            C0246h h = this.f1279d.mo704h();
            this.f1279d.mo705i().mo634b();
            this.f1279d.mo694a((Runnable) new C0258t(this, h, this.f1276a, this.f1277b));
            long elapsedRealtime4 = m - (SystemClock.elapsedRealtime() - elapsedRealtime);
            if (elapsedRealtime4 > 0) {
                try {
                    wait(elapsedRealtime4);
                } catch (InterruptedException e6) {
                    C0261b.m574a("AdLoader InterruptedException while loading the HTML: " + e6);
                    return;
                }
            }
            if (this.f1286k) {
                this.f1279d.mo694a((Runnable) new C0266v(this, this.f1279d, this.f1283h, this.f1287l));
            } else {
                C0261b.m580c("AdLoader timed out after " + m + "ms while loading the HTML.");
                m538a(C0242d.NETWORK_ERROR, true);
            }
        }
    }
}
