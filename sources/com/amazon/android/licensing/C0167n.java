package com.amazon.android.licensing;

import com.amazon.android.framework.task.Task;
import com.amazon.android.framework.util.C0131d;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p006d.C0067a;
import java.lang.reflect.Method;

/* renamed from: com.amazon.android.licensing.n */
public final class C0167n implements Task {

    /* renamed from: a */
    private static final KiwiLogger f1143a = new KiwiLogger("DRMSuccessTask");

    /* renamed from: a */
    private static Method m387a(Class cls, String str) {
        C0067a.m219a((Object) cls, "Class<?> target");
        C0067a.m219a((Object) str, "String methodName");
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, new Class[0]);
            if (declaredMethod == null) {
                if (KiwiLogger.TRACE_ON) {
                    f1143a.trace("No exception thrown, but method '" + str + "' was not found, this should not happen. ");
                }
                return null;
            }
            declaredMethod.setAccessible(true);
            if (!C0131d.m353c(declaredMethod)) {
                if (KiwiLogger.TRACE_ON) {
                    f1143a.trace("Callback " + str + " isn't static, ignoring...");
                }
                return null;
            } else if (!C0131d.m352b(declaredMethod)) {
                if (KiwiLogger.TRACE_ON) {
                    f1143a.trace("Callback " + str + " returns a value, ignoring...");
                }
                return null;
            } else if (!C0131d.m351a(declaredMethod)) {
                return declaredMethod;
            } else {
                if (KiwiLogger.TRACE_ON) {
                    f1143a.trace("Callback " + str + " takes parameters, ignoring...");
                }
                return null;
            }
        } catch (NoSuchMethodException e) {
            if (KiwiLogger.TRACE_ON) {
                f1143a.trace("Did not find method " + str);
            }
            return null;
        }
    }

    public final void execute() {
        Method a;
        Class a2 = C0131d.m350a("com.amazon.drm.AmazonLicenseVerificationCallback");
        if (a2 != null && (a = m387a(a2, "onDRMSuccess")) != null) {
            if (KiwiLogger.TRACE_ON) {
                f1143a.trace("Invoking callback: " + a.getName());
            }
            try {
                a.invoke((Object) null, new Object[0]);
                if (KiwiLogger.TRACE_ON) {
                    f1143a.trace("Callback invoked.");
                }
            } catch (Exception e) {
            }
        }
    }
}
