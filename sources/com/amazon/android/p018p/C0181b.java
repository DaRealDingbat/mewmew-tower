package com.amazon.android.p018p;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amazon.android.p.b */
public class C0181b implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final Map f1161a = new HashMap();

    public C0181b(String str) {
        this.f1161a.put("name", str);
        this.f1161a.put("time", String.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public final C0181b mo461a(String str, String str2) {
        this.f1161a.put(str, str2);
        return this;
    }

    public String toString() {
        return "Metric: [" + this.f1161a.toString() + "]";
    }
}
