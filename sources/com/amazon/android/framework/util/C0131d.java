package com.amazon.android.framework.util;

import com.amazon.android.p006d.C0067a;
import java.lang.reflect.Method;

/* renamed from: com.amazon.android.framework.util.d */
public final class C0131d {

    /* renamed from: a */
    private static final KiwiLogger f1066a = new KiwiLogger("Reflection");

    /* renamed from: a */
    public static Class m350a(String str) {
        C0067a.m219a((Object) str, "String className");
        try {
            return Thread.currentThread().getContextClassLoader().loadClass(str);
        } catch (ClassNotFoundException e) {
            if (KiwiLogger.TRACE_ON) {
                f1066a.trace("ClassNoFound: " + str);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m351a(Method method) {
        C0067a.m219a((Object) method, "Method m");
        return method.getParameterTypes().length > 0;
    }

    /* renamed from: b */
    public static boolean m352b(Method method) {
        C0067a.m219a((Object) method, "Method m");
        return method.getReturnType().equals(Void.TYPE);
    }

    /* renamed from: c */
    public static boolean m353c(Method method) {
        C0067a.m219a((Object) method, "Method m");
        return (method.getModifiers() & 8) != 0;
    }
}
