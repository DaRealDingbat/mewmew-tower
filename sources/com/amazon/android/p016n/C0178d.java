package com.amazon.android.p016n;

import com.amazon.android.framework.resource.C0098a;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p006d.C0067a;
import com.amazon.android.p010h.C0139d;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.amazon.android.n.d */
public final class C0178d implements C0139d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final KiwiLogger f1157a = new KiwiLogger("ExpirableValueDataStore");
    @Resource

    /* renamed from: b */
    private C0098a f1158b;

    /* renamed from: c */
    private final Map f1159c = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void observe(C0176b bVar) {
        if (KiwiLogger.TRACE_ON) {
            f1157a.trace("Observed expiration: " + bVar + " removing from store!");
        }
        Iterator it = this.f1159c.entrySet().iterator();
        while (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() == bVar) {
                if (KiwiLogger.TRACE_ON) {
                    f1157a.trace("Removing entry from store: " + bVar);
                }
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo451a(String str, C0176b bVar) {
        C0067a.m219a((Object) str, "key");
        C0067a.m219a((Object) bVar, "value");
        if (KiwiLogger.TRACE_ON) {
            f1157a.trace("Placing value into store with key: " + str + ", expiration: " + bVar.getExpiration());
        }
        this.f1158b.mo367b(bVar);
        bVar.register(this);
        this.f1159c.put(str, bVar);
    }

    /* renamed from: a */
    public final synchronized void mo452a(String str, Object obj) {
        if (KiwiLogger.TRACE_ON) {
            f1157a.trace("Placing non-expiring value into store with key: " + str);
        }
        this.f1159c.put(str, new C0177c(this, obj, new Date()));
    }

    /* renamed from: a */
    public final synchronized boolean mo453a(String str) {
        return mo454b(str) != null;
    }

    /* renamed from: b */
    public final synchronized Object mo454b(String str) {
        Object obj;
        if (KiwiLogger.TRACE_ON) {
            f1157a.trace("Fetching value: " + str);
        }
        C0176b bVar = (C0176b) this.f1159c.get(str);
        if (bVar == null) {
            if (KiwiLogger.TRACE_ON) {
                f1157a.trace("Value not present in store, returning null");
            }
            obj = null;
        } else {
            obj = bVar.f1154a;
        }
        return obj;
    }

    /* renamed from: c */
    public final synchronized void mo455c(String str) {
        C0176b bVar = (C0176b) this.f1159c.get(str);
        if (bVar != null) {
            if (KiwiLogger.TRACE_ON) {
                f1157a.trace("Removing value associated with key: " + str + ", value: " + bVar);
            }
            this.f1159c.remove(str);
            bVar.discard();
        }
    }

    public final String toString() {
        return this.f1159c.toString();
    }
}
