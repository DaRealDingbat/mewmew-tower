package com.amazon.android.framework.task.command;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p004b.C0056d;
import com.amazon.android.p004b.C0059g;
import com.amazon.android.p009g.C0133a;
import com.amazon.android.p014l.C0150a;
import com.amazon.android.p014l.C0152c;
import com.amazon.mas.kiwi.util.Base64;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.amazon.android.framework.task.command.f */
public final class C0109f {

    /* renamed from: a */
    private static final KiwiLogger f1019a = new KiwiLogger("CommandResultVerifier");
    @Resource

    /* renamed from: b */
    private Application f1020b;
    @Resource

    /* renamed from: c */
    private C0152c f1021c;

    /* renamed from: a */
    private PackageInfo m293a(String str) throws C0059g {
        try {
            return this.f1020b.getPackageManager().getPackageInfo(str, 64);
        } catch (PackageManager.NameNotFoundException e) {
            f1019a.trace("getPackageInfo() caught exception" + e);
            throw new C0059g();
        }
    }

    /* renamed from: a */
    private static String m294a(Signature signature) throws CertificateException {
        return Base64.encodeBytes(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getSignature());
    }

    /* renamed from: a */
    private boolean m295a(String str, Signature signature) throws C0133a {
        try {
            return C0150a.m365a(m294a(signature), str, this.f1021c.mo437a());
        } catch (CertificateException e) {
            if (KiwiLogger.ERROR_ON) {
                f1019a.error("Failed to extract fingerprint from signature: " + signature);
            }
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m296b(String str, Signature signature) {
        boolean z = false;
        try {
            z = str.equals(m294a(signature));
            f1019a.trace("Signature valid: " + z);
            return z;
        } catch (CertificateException e) {
            f1019a.error("Failed to extract fingerprint from signature");
            return z;
        }
    }

    /* renamed from: a */
    public final void mo383a(String str, String str2) throws KiwiException {
        if (KiwiLogger.TRACE_ON) {
            f1019a.trace("Verifying auth token: " + str);
        }
        Signature[] signatureArr = m293a(str2).signatures;
        int length = signatureArr.length;
        int i = 0;
        while (i < length) {
            if (!m295a(str, signatureArr[i])) {
                i++;
            } else {
                return;
            }
        }
        throw new C0056d();
    }

    /* renamed from: a */
    public final boolean mo384a(String str, List list) {
        f1019a.trace("checkSignatures(" + str + ", " + list);
        try {
            for (Signature signature : m293a(str).signatures) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (m296b((String) it.next(), signature)) {
                        return true;
                    }
                }
            }
        } catch (C0059g e) {
            f1019a.error("isPackageSignatureValid: caught exception while checking", e);
        }
        return false;
    }
}
