package com.google.ads;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.google.ads.x */
public final class C0268x {

    /* renamed from: a */
    private String f1357a;

    /* renamed from: b */
    private HashMap f1358b;

    public C0268x(Bundle bundle) {
        this.f1357a = bundle.getString("action");
        Serializable serializable = bundle.getSerializable("params");
        this.f1358b = serializable instanceof HashMap ? (HashMap) serializable : null;
    }

    private C0268x(String str) {
        this.f1357a = str;
    }

    public C0268x(String str, HashMap hashMap) {
        this(str);
        this.f1358b = hashMap;
    }

    /* renamed from: a */
    public final Bundle mo718a() {
        Bundle bundle = new Bundle();
        bundle.putString("action", this.f1357a);
        bundle.putSerializable("params", this.f1358b);
        return bundle;
    }

    /* renamed from: b */
    public final String mo719b() {
        return this.f1357a;
    }

    /* renamed from: c */
    public final HashMap mo720c() {
        return this.f1358b;
    }
}
