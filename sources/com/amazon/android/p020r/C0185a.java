package com.amazon.android.p020r;

import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.p006d.C0067a;
import com.amazon.android.p011i.C0140a;
import com.amazon.android.p011i.C0141b;
import java.util.Iterator;

/* renamed from: com.amazon.android.r.a */
public class C0185a extends KiwiException {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final C0140a f1167a;

    public C0185a(C0140a aVar) {
        super("LICENSE_VERIFICATION_FAILURE", "VERIFICATION_ERRORS", m415a(aVar));
        C0067a.m221a(aVar.mo423a(), "Created a verification exception with a Verifier that has no errors");
        this.f1167a = aVar;
    }

    /* renamed from: a */
    private static String m415a(C0140a aVar) {
        StringBuilder sb = new StringBuilder();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            C0141b bVar = (C0141b) it.next();
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(bVar.f1071a.mo427a());
        }
        return sb.toString();
    }

    public String toString() {
        return this.f1167a.toString();
    }
}
