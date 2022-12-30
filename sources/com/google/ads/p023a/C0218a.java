package com.google.ads.p023a;

import android.content.Context;
import android.graphics.Color;
import android.util.Pair;
import com.google.ads.C0241c;
import java.util.Map;

/* renamed from: com.google.ads.a.a */
public final class C0218a extends C0241c {

    /* renamed from: b */
    private String f1193b;

    /* renamed from: c */
    private int f1194c;

    /* renamed from: d */
    private Pair f1195d;

    /* renamed from: e */
    private int f1196e;

    /* renamed from: f */
    private int f1197f;

    /* renamed from: g */
    private int f1198g;

    /* renamed from: h */
    private String f1199h;

    /* renamed from: i */
    private int f1200i;

    /* renamed from: j */
    private int f1201j;

    /* renamed from: k */
    private C0219b f1202k;

    /* renamed from: l */
    private int f1203l;

    /* renamed from: a */
    private static String m485a(int i) {
        return String.format("#%06x", new Object[]{Integer.valueOf(16777215 & i)});
    }

    /* renamed from: a */
    public final Map mo631a(Context context) {
        if (this.f1193b != null) {
            mo644a("q", this.f1193b);
        }
        if (Color.alpha(this.f1194c) != 0) {
            mo644a("bgcolor", m485a(this.f1194c));
        }
        if (!(this.f1195d == null || this.f1195d.first == null || this.f1195d.second == null)) {
            mo644a("gradientfrom", m485a(((Integer) this.f1195d.first).intValue()));
            mo644a("gradientto", m485a(((Integer) this.f1195d.second).intValue()));
        }
        if (Color.alpha(this.f1196e) != 0) {
            mo644a("hcolor", m485a(this.f1196e));
        }
        if (Color.alpha(this.f1197f) != 0) {
            mo644a("dcolor", m485a(this.f1197f));
        }
        if (Color.alpha(this.f1198g) != 0) {
            mo644a("acolor", m485a(this.f1198g));
        }
        if (this.f1199h != null) {
            mo644a("font", this.f1199h);
        }
        mo644a("headersize", Integer.toString(this.f1200i));
        if (Color.alpha(this.f1201j) != 0) {
            mo644a("bcolor", m485a(this.f1201j));
        }
        if (this.f1202k != null) {
            mo644a("btype", this.f1202k.toString());
        }
        mo644a("bthick", Integer.toString(this.f1203l));
        return super.mo631a(context);
    }
}
