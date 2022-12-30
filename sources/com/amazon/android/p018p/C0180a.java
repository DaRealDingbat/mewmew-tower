package com.amazon.android.p018p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.amazon.android.p.a */
public final class C0180a implements Serializable, Iterable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    final List f1160a = new ArrayList();

    /* renamed from: a */
    public final boolean mo457a() {
        return this.f1160a.isEmpty();
    }

    /* renamed from: b */
    public final int mo458b() {
        return this.f1160a.size();
    }

    public final Iterator iterator() {
        return this.f1160a.iterator();
    }

    public final String toString() {
        return "MetricBatch: [" + this.f1160a + "]";
    }
}
