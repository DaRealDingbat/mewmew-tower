package com.amazon.android.framework.util;

import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: com.amazon.android.framework.util.c */
public final class C0130c implements Iterable {

    /* renamed from: a */
    public WeakHashMap f1065a = new WeakHashMap();

    /* renamed from: a */
    public final void mo412a(Object obj) {
        this.f1065a.put(obj, (Object) null);
    }

    /* renamed from: b */
    public final void mo413b(Object obj) {
        this.f1065a.remove(obj);
    }

    public final Iterator iterator() {
        return this.f1065a.keySet().iterator();
    }

    public final String toString() {
        return this.f1065a.keySet().toString();
    }
}
