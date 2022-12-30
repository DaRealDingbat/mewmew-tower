package com.google.ads;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.amazon.android.Kiwi;
import com.google.ads.util.C0261b;

public class AdActivity extends Activity implements View.OnClickListener {

    /* renamed from: a */
    private static final Object f1181a = new Object();

    /* renamed from: b */
    private static AdActivity f1182b = null;

    /* renamed from: c */
    private static C0267w f1183c = null;

    /* renamed from: d */
    private static AdActivity f1184d = null;

    /* renamed from: e */
    private static AdActivity f1185e = null;

    /* renamed from: f */
    private C0246h f1186f;

    /* renamed from: g */
    private boolean f1187g;

    /* renamed from: h */
    private long f1188h;

    /* renamed from: i */
    private RelativeLayout f1189i;

    /* renamed from: j */
    private AdActivity f1190j = null;

    /* renamed from: k */
    private boolean f1191k;

    /* renamed from: l */
    private C0245g f1192l;

    /* renamed from: a */
    private void m473a(C0246h hVar, boolean z, int i) {
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        if (hVar.getParent() != null) {
            m476a("Interstitial created with an AdWebView that has a parent.");
        } else if (hVar.mo663b() != null) {
            m476a("Interstitial created with an AdWebView that is already in use by another AdActivity.");
        } else {
            setRequestedOrientation(i);
            hVar.mo662a(this);
            ImageButton imageButton = new ImageButton(getApplicationContext());
            imageButton.setImageResource(17301527);
            imageButton.setBackgroundColor(0);
            imageButton.setOnClickListener(this);
            imageButton.setPadding(0, 0, 0, 0);
            int applyDimension = (int) TypedValue.applyDimension(1, 32.0f, getResources().getDisplayMetrics());
            FrameLayout frameLayout = new FrameLayout(getApplicationContext());
            frameLayout.addView(imageButton, applyDimension, applyDimension);
            this.f1189i.addView(hVar, -1, -1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            this.f1189i.addView(frameLayout, layoutParams);
            this.f1189i.setKeepScreenOn(true);
            setContentView(this.f1189i);
            if (z) {
                C0248j.m520a((WebView) hVar);
            }
        }
    }

    /* renamed from: a */
    private void m474a(C0267w wVar) {
        this.f1186f = null;
        this.f1188h = SystemClock.elapsedRealtime();
        this.f1191k = true;
        synchronized (f1181a) {
            if (f1182b == null) {
                f1182b = this;
                wVar.mo714r();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        r1 = new android.content.Intent(r0.getApplicationContext(), com.google.ads.AdActivity.class);
        r1.putExtra("com.google.ads.AdOpener", r5.mo718a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        com.google.ads.util.C0261b.m574a("Launching AdActivity.");
        r0.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        com.google.ads.util.C0261b.m575a(r0.getMessage(), (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000a, code lost:
        r0 = r4.mo700d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        if (r0 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        com.google.ads.util.C0261b.m582e("activity was null while launching an AdActivity.");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m475a(com.google.ads.C0267w r4, com.google.ads.C0268x r5) {
        /*
            java.lang.Object r1 = f1181a
            monitor-enter(r1)
            com.google.ads.w r0 = f1183c     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x0016
            f1183c = r4     // Catch:{ all -> 0x0021 }
        L_0x0009:
            monitor-exit(r1)
            android.app.Activity r0 = r4.mo700d()
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "activity was null while launching an AdActivity."
            com.google.ads.util.C0261b.m582e(r0)
        L_0x0015:
            return
        L_0x0016:
            com.google.ads.w r0 = f1183c     // Catch:{ all -> 0x0021 }
            if (r0 == r4) goto L_0x0009
            java.lang.String r0 = "Tried to launch a new AdActivity with a different AdManager."
            com.google.ads.util.C0261b.m578b(r0)     // Catch:{ all -> 0x0021 }
            monitor-exit(r1)     // Catch:{ all -> 0x0021 }
            goto L_0x0015
        L_0x0021:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0024:
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r0.getApplicationContext()
            java.lang.Class<com.google.ads.AdActivity> r3 = com.google.ads.AdActivity.class
            r1.<init>(r2, r3)
            java.lang.String r2 = "com.google.ads.AdOpener"
            android.os.Bundle r3 = r5.mo718a()
            r1.putExtra(r2, r3)
            java.lang.String r2 = "Launching AdActivity."
            com.google.ads.util.C0261b.m574a((java.lang.String) r2)     // Catch:{ ActivityNotFoundException -> 0x0041 }
            r0.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x0041 }
            goto L_0x0015
        L_0x0041:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            com.google.ads.util.C0261b.m575a((java.lang.String) r1, (java.lang.Throwable) r0)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.AdActivity.m475a(com.google.ads.w, com.google.ads.x):void");
    }

    /* renamed from: a */
    private void m476a(String str) {
        C0261b.m578b(str);
        finish();
    }

    /* renamed from: a */
    private void m477a(String str, Throwable th) {
        C0261b.m575a(str, th);
        finish();
    }

    /* renamed from: c */
    private static RelativeLayout.LayoutParams m478c(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        return layoutParams;
    }

    /* renamed from: c */
    public static boolean m479c() {
        boolean z;
        synchronized (f1181a) {
            z = f1184d != null;
        }
        return z;
    }

    /* renamed from: d */
    private void m480d() {
        if (!this.f1187g) {
            if (this.f1186f != null) {
                C0248j.m526b((WebView) this.f1186f);
                this.f1186f.mo662a((AdActivity) null);
            }
            if (this.f1192l != null) {
                this.f1192l.mo656d();
                this.f1192l = null;
            }
            if (this == f1182b) {
                f1182b = null;
            }
            f1185e = this.f1190j;
            synchronized (f1181a) {
                if (!(f1183c == null || this.f1186f == null)) {
                    if (this.f1186f == f1183c.mo704h()) {
                        f1183c.mo689a();
                    }
                    this.f1186f.stopLoading();
                }
                if (this == f1184d) {
                    f1184d = null;
                    if (f1183c != null) {
                        f1183c.mo712p();
                        f1183c = null;
                    } else {
                        C0261b.m582e("currentAdManager is null while trying to destroy AdActivity.");
                    }
                }
            }
            this.f1187g = true;
            C0261b.m574a("AdActivity is closing.");
        }
    }

    private void onActivityResultAdActivity(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!(mo618b() == null || intent == null || intent.getExtras() == null || intent.getExtras().getString("com.google.circles.platform.result.extra.CONFIRMATION") == null || intent.getExtras().getString("com.google.circles.platform.result.extra.ACTION") == null)) {
            String string = intent.getExtras().getString("com.google.circles.platform.result.extra.CONFIRMATION");
            String string2 = intent.getExtras().getString("com.google.circles.platform.result.extra.ACTION");
            if (string.equals("yes")) {
                if (string2.equals("insert")) {
                    C0236aq.m503a(mo618b(), true);
                } else if (string2.equals("delete")) {
                    C0236aq.m503a(mo618b(), false);
                }
            }
        }
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        r9.f1189i = null;
        r9.f1191k = false;
        r9.f1192l = null;
        r0 = getIntent().getBundleExtra("com.google.ads.AdOpener");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r0 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        m476a("Could not get the Bundle used to create AdActivity.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        r1 = new com.google.ads.C0268x(r0);
        r0 = r1.mo719b();
        r7 = r1.mo720c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0077, code lost:
        if (r0.equals("plusone") == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        r1 = new android.content.Intent();
        r1.setComponent(new android.content.ComponentName("com.google.android.apps.plus", "com.google.android.apps.circles.platform.PlusOneActivity"));
        r1.addCategory("android.intent.category.LAUNCHER");
        r1.putExtras(getIntent().getExtras());
        r1.putExtra("com.google.circles.platform.intent.extra.ENTITY", (java.lang.String) r7.get("u"));
        r1.putExtra("com.google.circles.platform.intent.extra.ENTITY_TYPE", com.google.ads.C0252n.f1266a.f1269c);
        r1.putExtra("com.google.circles.platform.intent.extra.ACTION", (java.lang.String) r7.get("a"));
        m474a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        com.google.ads.util.C0261b.m574a("Launching Google+ intent from AdActivity.");
        startActivityForResult(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
        m477a(r0.getMessage(), (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d9, code lost:
        if (r0.equals("intent") == false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00db, code lost:
        if (r7 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dd, code lost:
        m476a("Could not get the paramMap in launchIntent()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e4, code lost:
        r0 = (java.lang.String) r7.get("u");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ec, code lost:
        if (r0 != null) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ee, code lost:
        m476a("Could not get the URL parameter in launchIntent().");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f5, code lost:
        r1 = (java.lang.String) r7.get("i");
        r2 = (java.lang.String) r7.get("m");
        r3 = android.net.Uri.parse(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0109, code lost:
        if (r1 != null) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010b, code lost:
        r0 = new android.content.Intent("android.intent.action.VIEW", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0112, code lost:
        if (r2 == null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0114, code lost:
        r0.setDataAndType(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0117, code lost:
        m474a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        com.google.ads.util.C0261b.m574a("Launching an intent from AdActivity.");
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0124, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0125, code lost:
        m477a(r0.getMessage(), (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012e, code lost:
        r0 = new android.content.Intent(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0134, code lost:
        r9.f1189i = new android.widget.RelativeLayout(getApplicationContext());
        r9.f1189i.setGravity(17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014c, code lost:
        if (r0.equals("webapp") == false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014e, code lost:
        r9.f1186f = new com.google.ads.C0246h(getApplicationContext(), (com.google.ads.C0244f) null);
        r0 = new com.google.ads.C0220aa(r6, com.google.ads.C0248j.f1265b, true, true);
        r0.mo635c();
        r9.f1186f.setWebViewClient(r0);
        r0 = (java.lang.String) r7.get("u");
        r1 = (java.lang.String) r7.get("baseurl");
        r2 = (java.lang.String) r7.get("html");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0180, code lost:
        if (r0 == null) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0182, code lost:
        r9.f1186f.loadUrl(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0187, code lost:
        r0 = (java.lang.String) r7.get("o");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0195, code lost:
        if ("p".equals(r0) == false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0197, code lost:
        r0 = com.google.ads.util.AdUtil.m560b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        m473a(r9.f1186f, false, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a2, code lost:
        if (r2 == null) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a4, code lost:
        r9.f1186f.loadDataWithBaseURL(r1, r2, "text/html", "utf-8", (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ae, code lost:
        m476a("Could not get the URL or HTML parameter to show a web app.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bb, code lost:
        if ("l".equals(r0) == false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01bd, code lost:
        r0 = com.google.ads.util.AdUtil.m547a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c4, code lost:
        if (r9 != f1184d) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c6, code lost:
        r0 = r6.mo708l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cb, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d3, code lost:
        if (r0.equals("interstitial") == false) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d5, code lost:
        r9.f1186f = r6.mo704h();
        m473a(r9.f1186f, true, r6.mo708l());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e6, code lost:
        m476a("Unknown AdOpener, <action: " + r0 + ">");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onCreateAdActivity(android.os.Bundle r10) {
        /*
            r9 = this;
            r3 = 1
            r5 = 0
            r8 = 0
            super.onCreate(r10)
            r9.f1187g = r8
            java.lang.Object r1 = f1181a
            monitor-enter(r1)
            com.google.ads.w r0 = f1183c     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x005a
            com.google.ads.w r6 = f1183c     // Catch:{ all -> 0x0061 }
            com.google.ads.AdActivity r0 = f1184d     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x001a
            f1184d = r9     // Catch:{ all -> 0x0061 }
            r6.mo713q()     // Catch:{ all -> 0x0061 }
        L_0x001a:
            com.google.ads.AdActivity r0 = r9.f1190j     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0026
            com.google.ads.AdActivity r0 = f1185e     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0026
            com.google.ads.AdActivity r0 = f1185e     // Catch:{ all -> 0x0061 }
            r9.f1190j = r0     // Catch:{ all -> 0x0061 }
        L_0x0026:
            f1185e = r9     // Catch:{ all -> 0x0061 }
            com.google.ads.a r0 = r6.mo701e()     // Catch:{ all -> 0x0061 }
            boolean r2 = r0 instanceof com.google.ads.AdView     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0034
            com.google.ads.AdActivity r2 = f1184d     // Catch:{ all -> 0x0061 }
            if (r2 == r9) goto L_0x003e
        L_0x0034:
            boolean r0 = r0 instanceof com.google.ads.C0247i     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0041
            com.google.ads.AdActivity r0 = r9.f1190j     // Catch:{ all -> 0x0061 }
            com.google.ads.AdActivity r2 = f1184d     // Catch:{ all -> 0x0061 }
            if (r0 != r2) goto L_0x0041
        L_0x003e:
            r6.mo715s()     // Catch:{ all -> 0x0061 }
        L_0x0041:
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            r9.f1189i = r5
            r9.f1191k = r8
            r9.f1192l = r5
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = "com.google.ads.AdOpener"
            android.os.Bundle r0 = r0.getBundleExtra(r1)
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "Could not get the Bundle used to create AdActivity."
            r9.m476a((java.lang.String) r0)
        L_0x0059:
            return
        L_0x005a:
            java.lang.String r0 = "Could not get currentAdManager."
            r9.m476a((java.lang.String) r0)     // Catch:{ all -> 0x0061 }
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            goto L_0x0059
        L_0x0061:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0064:
            com.google.ads.x r1 = new com.google.ads.x
            r1.<init>((android.os.Bundle) r0)
            java.lang.String r0 = r1.mo719b()
            java.util.HashMap r7 = r1.mo720c()
            java.lang.String r1 = "plusone"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d3
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r2 = "com.google.android.apps.plus"
            java.lang.String r3 = "com.google.android.apps.circles.platform.PlusOneActivity"
            r0.<init>(r2, r3)
            r1.setComponent(r0)
            java.lang.String r0 = "android.intent.category.LAUNCHER"
            r1.addCategory(r0)
            android.content.Intent r0 = r9.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r1.putExtras(r0)
            java.lang.String r2 = "com.google.circles.platform.intent.extra.ENTITY"
            java.lang.String r0 = "u"
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.putExtra(r2, r0)
            java.lang.String r0 = "com.google.circles.platform.intent.extra.ENTITY_TYPE"
            com.google.ads.n r2 = com.google.ads.C0252n.AD
            java.lang.String r2 = r2.f1269c
            r1.putExtra(r0, r2)
            java.lang.String r2 = "com.google.circles.platform.intent.extra.ACTION"
            java.lang.String r0 = "a"
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.putExtra(r2, r0)
            r9.m474a((com.google.ads.C0267w) r6)
            java.lang.String r0 = "Launching Google+ intent from AdActivity."
            com.google.ads.util.C0261b.m574a((java.lang.String) r0)     // Catch:{ ActivityNotFoundException -> 0x00ca }
            r0 = 0
            r9.startActivityForResult(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x00ca }
            goto L_0x0059
        L_0x00ca:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            r9.m477a((java.lang.String) r1, (java.lang.Throwable) r0)
            goto L_0x0059
        L_0x00d3:
            java.lang.String r1 = "intent"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0134
            if (r7 != 0) goto L_0x00e4
            java.lang.String r0 = "Could not get the paramMap in launchIntent()"
            r9.m476a((java.lang.String) r0)
            goto L_0x0059
        L_0x00e4:
            java.lang.String r0 = "u"
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00f5
            java.lang.String r0 = "Could not get the URL parameter in launchIntent()."
            r9.m476a((java.lang.String) r0)
            goto L_0x0059
        L_0x00f5:
            java.lang.String r1 = "i"
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "m"
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri r3 = android.net.Uri.parse(r0)
            if (r1 != 0) goto L_0x012e
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1, r3)
        L_0x0112:
            if (r2 == 0) goto L_0x0117
            r0.setDataAndType(r3, r2)
        L_0x0117:
            r9.m474a((com.google.ads.C0267w) r6)
            java.lang.String r1 = "Launching an intent from AdActivity."
            com.google.ads.util.C0261b.m574a((java.lang.String) r1)     // Catch:{ ActivityNotFoundException -> 0x0124 }
            r9.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x0124 }
            goto L_0x0059
        L_0x0124:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            r9.m477a((java.lang.String) r1, (java.lang.Throwable) r0)
            goto L_0x0059
        L_0x012e:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r3)
            goto L_0x0112
        L_0x0134:
            android.widget.RelativeLayout r1 = new android.widget.RelativeLayout
            android.content.Context r2 = r9.getApplicationContext()
            r1.<init>(r2)
            r9.f1189i = r1
            android.widget.RelativeLayout r1 = r9.f1189i
            r2 = 17
            r1.setGravity(r2)
            java.lang.String r1 = "webapp"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01cd
            com.google.ads.h r0 = new com.google.ads.h
            android.content.Context r1 = r9.getApplicationContext()
            r0.<init>(r1, r5)
            r9.f1186f = r0
            com.google.ads.aa r0 = new com.google.ads.aa
            java.util.Map r1 = com.google.ads.C0248j.f1265b
            r0.<init>(r6, r1, r3, r3)
            r0.mo635c()
            com.google.ads.h r1 = r9.f1186f
            r1.setWebViewClient(r0)
            java.lang.String r0 = "u"
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "baseurl"
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "html"
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r0 == 0) goto L_0x01a2
            com.google.ads.h r1 = r9.f1186f
            r1.loadUrl(r0)
        L_0x0187:
            java.lang.String r0 = "o"
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "p"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01b5
            int r0 = com.google.ads.util.AdUtil.m560b()
        L_0x019b:
            com.google.ads.h r1 = r9.f1186f
            r9.m473a(r1, r8, r0)
            goto L_0x0059
        L_0x01a2:
            if (r2 == 0) goto L_0x01ae
            com.google.ads.h r0 = r9.f1186f
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "utf-8"
            r0.loadDataWithBaseURL(r1, r2, r3, r4, r5)
            goto L_0x0187
        L_0x01ae:
            java.lang.String r0 = "Could not get the URL or HTML parameter to show a web app."
            r9.m476a((java.lang.String) r0)
            goto L_0x0059
        L_0x01b5:
            java.lang.String r1 = "l"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01c2
            int r0 = com.google.ads.util.AdUtil.m547a()
            goto L_0x019b
        L_0x01c2:
            com.google.ads.AdActivity r0 = f1184d
            if (r9 != r0) goto L_0x01cb
            int r0 = r6.mo708l()
            goto L_0x019b
        L_0x01cb:
            r0 = -1
            goto L_0x019b
        L_0x01cd:
            java.lang.String r1 = "interstitial"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01e6
            com.google.ads.h r0 = r6.mo704h()
            r9.f1186f = r0
            int r0 = r6.mo708l()
            com.google.ads.h r1 = r9.f1186f
            r9.m473a(r1, r3, r0)
            goto L_0x0059
        L_0x01e6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown AdOpener, <action: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ">"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.m476a((java.lang.String) r0)
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.AdActivity.onCreateAdActivity(android.os.Bundle):void");
    }

    private void onDestroyAdActivity() {
        if (this.f1189i != null) {
            this.f1189i.removeAllViews();
        }
        if (isFinishing()) {
            m480d();
            if (this.f1186f != null) {
                this.f1186f.stopLoading();
                this.f1186f.destroy();
                this.f1186f = null;
            }
        }
        super.onDestroy();
    }

    private void onPauseAdActivity() {
        if (isFinishing()) {
            m480d();
        }
        super.onPause();
    }

    /* renamed from: a */
    public final C0245g mo616a() {
        return this.f1192l;
    }

    /* renamed from: a */
    public final void mo617a(int i, int i2, int i3, int i4) {
        if (this.f1192l != null) {
            this.f1192l.setLayoutParams(m478c(i, i2, i3, i4));
            this.f1192l.requestLayout();
        }
    }

    /* renamed from: b */
    public final C0246h mo618b() {
        if (this.f1190j != null) {
            return this.f1190j.f1186f;
        }
        synchronized (f1181a) {
            if (f1183c == null) {
                C0261b.m582e("currentAdManager was null while trying to get the opening AdWebView.");
                return null;
            }
            C0246h h = f1183c.mo704h();
            if (h != this.f1186f) {
                return h;
            }
            return null;
        }
    }

    /* renamed from: b */
    public final void mo619b(int i, int i2, int i3, int i4) {
        if (this.f1192l == null) {
            this.f1192l = new C0245g(this, this.f1186f);
            this.f1189i.addView(this.f1192l, 0, m478c(i, i2, i3, i4));
            synchronized (f1181a) {
                if (f1183c == null) {
                    C0261b.m582e("currentAdManager was null while trying to get the opening AdWebView.");
                } else {
                    f1183c.mo705i().mo633a();
                }
            }
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!Kiwi.onActivityResult(this, requestCode, resultCode, data)) {
            onActivityResultAdActivity(requestCode, resultCode, data);
        }
    }

    public void onClick(View view) {
        finish();
    }

    public void onCreate(Bundle bundle) {
        onCreateAdActivity(bundle);
        Kiwi.onCreate((Activity) this, true);
    }

    public Dialog onCreateDialog(int i) {
        Dialog dialog = Kiwi.onCreateDialog(this, i);
        return dialog != null ? dialog : super.onCreateDialog(i);
    }

    public Dialog onCreateDialog(int i, Bundle bundle) {
        Dialog dialog = Kiwi.onCreateDialog(this, i);
        return dialog != null ? dialog : super.onCreateDialog(i, bundle);
    }

    public void onDestroy() {
        onDestroyAdActivity();
        Kiwi.onDestroy((Activity) this);
    }

    public void onPause() {
        onPauseAdActivity();
        Kiwi.onPause(this);
    }

    public void onResume() {
        super.onResume();
        Kiwi.onResume(this);
    }

    public void onStart() {
        super.onStart();
        Kiwi.onStart(this);
    }

    public void onStop() {
        super.onStop();
        Kiwi.onStop(this);
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f1191k && z && SystemClock.elapsedRealtime() - this.f1188h > 250) {
            C0261b.m581d("Launcher AdActivity got focus and is closing.");
            finish();
        }
        super.onWindowFocusChanged(z);
    }
}
