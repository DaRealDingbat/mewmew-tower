package com.amazon.android.licensing;

import android.os.Build;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.prompt.PromptContent;
import com.amazon.android.p004b.C0053a;
import com.amazon.android.p004b.C0054b;
import com.amazon.android.p004b.C0056d;
import com.amazon.android.p004b.C0057e;
import com.amazon.android.p004b.C0058f;
import com.amazon.android.p004b.C0059g;
import com.amazon.android.p004b.C0060h;
import com.amazon.android.p006d.C0067a;
import com.amazon.android.p009g.C0133a;
import com.amazon.android.p009g.C0134b;
import com.amazon.android.p009g.C0135c;
import com.amazon.android.p020r.C0185a;
import java.util.HashMap;
import java.util.Map;

public class LicenseFailurePromptContentMapper {
    private final Map mappings = new HashMap();

    public LicenseFailurePromptContentMapper() {
        Class<C0059g> cls = C0059g.class;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            Class<C0059g> cls2 = C0059g.class;
            register((Class) cls, C0162i.f1123b);
        } else {
            Class<C0059g> cls3 = C0059g.class;
            register((Class) cls, C0162i.f1122a);
        }
        register(C0058f.class, C0162i.f1123b);
        register(C0053a.class, C0162i.f1123b);
        register(C0056d.class, C0162i.f1124c);
        register(C0057e.class, (C0161h) new C0166m());
        register(C0060h.class, C0162i.f1126e);
        register(C0054b.class, C0162i.f1126e);
        register(C0185a.class, (C0161h) new C0163j());
        register(C0133a.class, C0162i.f1128g);
        register(C0134b.class, C0162i.f1126e);
        register(C0135c.class, C0162i.f1126e);
    }

    private void register(Class cls, PromptContent promptContent) {
        register(cls, (C0161h) new C0160g(this, promptContent));
    }

    private void register(Class cls, C0161h hVar) {
        C0067a.m222b(this.mappings.containsKey(cls), "mapping exists for type: " + cls);
        this.mappings.put(cls, hVar);
    }

    public PromptContent map(KiwiException kiwiException) {
        C0161h hVar = (C0161h) this.mappings.get(kiwiException.getClass());
        if (hVar == null) {
            return null;
        }
        return hVar.mo441a(kiwiException);
    }
}
