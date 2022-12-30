package com.amazon.android.framework.resource;

import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p006d.C0067a;
import com.amazon.android.p006d.C0068b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.amazon.android.framework.resource.c */
public final class C0100c implements C0098a {

    /* renamed from: a */
    private static KiwiLogger f987a = new KiwiLogger("ResourceManagerImpl");

    /* renamed from: b */
    private List f988b = new ArrayList();

    /* renamed from: c */
    private boolean f989c = false;

    public C0100c() {
        mo366a((Object) this);
    }

    /* renamed from: a */
    private Object m264a(Class cls) {
        for (Object next : this.f988b) {
            if (cls.isAssignableFrom(next.getClass())) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo365a() {
        for (Object b : this.f988b) {
            mo367b(b);
        }
    }

    /* renamed from: a */
    public final void mo366a(Object obj) {
        if (KiwiLogger.TRACE_ON) {
            f987a.trace("Registering resource: " + obj);
        }
        C0067a.m218a();
        if (this.f989c) {
            throw new IllegalStateException("Attempt made to register resource after population has begun!");
        }
        C0067a.m219a(obj, "resource");
        C0067a.m222b(m264a((Class) obj.getClass()) != null, "Resource already registered: " + obj);
        this.f988b.add(obj);
    }

    /* renamed from: b */
    public final void mo367b(Object obj) {
        C0067a.m219a(obj, "target");
        if (KiwiLogger.TRACE_ON) {
            f987a.trace("Populating: " + obj);
        }
        if (!obj.getClass().getName().startsWith("com.amazon.")) {
            f987a.trace("Ignoring: " + obj + ", not a kiwi class");
            return;
        }
        for (Class cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getAnnotation(Resource.class) != null) {
                    Class<?> type = field.getType();
                    Object a = m264a((Class) type);
                    C0067a.m221a(a != null, "no resource found for type: " + type);
                    field.setAccessible(true);
                    try {
                        field.set(obj, a);
                    } catch (Exception e) {
                        throw new C0068b("Failed to populate field: " + field, e);
                    }
                }
            }
        }
        if (obj instanceof C0099b) {
            ((C0099b) obj).onResourcesPopulated();
        }
    }
}
