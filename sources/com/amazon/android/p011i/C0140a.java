package com.amazon.android.p011i;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.amazon.android.i.a */
public final class C0140a implements Iterable {

    /* renamed from: a */
    public Map f1070a = new HashMap();

    /* renamed from: a */
    public final C0140a mo422a(Object obj, Object obj2, C0142c cVar) {
        if (!(obj == null ? obj2 == null : obj.equals(obj2))) {
            this.f1070a.put(cVar, new C0141b(cVar, "'" + obj + "' != '" + obj2 + "'"));
        }
        return this;
    }

    /* renamed from: a */
    public final boolean mo423a() {
        return !this.f1070a.isEmpty();
    }

    public final Iterator iterator() {
        return this.f1070a.values().iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Verifier:");
        for (C0141b bVar : this.f1070a.values()) {
            sb.append("\n\t" + bVar);
        }
        return sb.toString();
    }
}
