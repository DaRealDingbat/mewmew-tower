package com.amazon.android.p014l;

import android.app.Application;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p009g.C0133a;
import com.amazon.android.p016n.C0175a;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.CertPath;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* renamed from: com.amazon.android.l.c */
public final class C0152c {

    /* renamed from: a */
    private static final KiwiLogger f1101a = new KiwiLogger("DataAuthenticationKeyLoader");
    @Resource

    /* renamed from: b */
    private Application f1102b;
    @Resource

    /* renamed from: c */
    private C0175a f1103c;

    /* renamed from: a */
    private static CertPath m369a(JarFile jarFile, JarEntry jarEntry) throws C0133a {
        try {
            if (KiwiLogger.TRACE_ON) {
                f1101a.trace("Extracting cert from entry: " + jarEntry.getName());
            }
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            if (KiwiLogger.TRACE_ON) {
                f1101a.trace("Generating certificates from entry input stream");
            }
            return instance.generateCertPath(new ArrayList(instance.generateCertificates(jarFile.getInputStream(jarEntry))));
        } catch (Exception e) {
            throw C0133a.m354a(e);
        }
    }

    /* renamed from: a */
    private static JarEntry m370a(JarFile jarFile) throws C0133a {
        if (KiwiLogger.TRACE_ON) {
            f1101a.trace("Searching for cert in apk");
        }
        Enumeration<JarEntry> entries = jarFile.entries();
        while (entries.hasMoreElements()) {
            JarEntry nextElement = entries.nextElement();
            if (!nextElement.isDirectory() && nextElement.getName().equals("kiwi")) {
                return nextElement;
            }
        }
        throw new C0133a("CERT_NOT_FOUND", (Throwable) null);
    }

    /* renamed from: b */
    private JarFile m371b() throws C0133a {
        String packageCodePath = this.f1102b.getPackageCodePath();
        if (KiwiLogger.TRACE_ON) {
            f1101a.trace("Opening apk: " + packageCodePath);
        }
        try {
            return new JarFile(packageCodePath, false);
        } catch (IOException e) {
            throw C0133a.m354a(e);
        }
    }

    /* renamed from: c */
    private static C0151b m372c() throws C0133a {
        try {
            return new C0151b();
        } catch (GeneralSecurityException e) {
            throw new C0133a("FAILED_TO_ESTABLISH_TRUST", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.security.PublicKey mo437a() throws com.amazon.android.p009g.C0133a {
        /*
            r9 = this;
            r7 = 0
            r6 = 1
            r5 = 0
            java.lang.String r8 = "DATA_AUTHENTICATION_KEY"
            boolean r0 = com.amazon.android.framework.util.KiwiLogger.TRACE_ON
            if (r0 == 0) goto L_0x0010
            com.amazon.android.framework.util.KiwiLogger r0 = f1101a
            java.lang.String r1 = "Loading data authentication key..."
            r0.trace(r1)
        L_0x0010:
            boolean r0 = com.amazon.android.framework.util.KiwiLogger.TRACE_ON
            if (r0 == 0) goto L_0x001b
            com.amazon.android.framework.util.KiwiLogger r0 = f1101a
            java.lang.String r1 = "Checking KiwiDataStore for key..."
            r0.trace(r1)
        L_0x001b:
            com.amazon.android.n.a r0 = r9.f1103c
            java.lang.String r1 = "DATA_AUTHENTICATION_KEY"
            java.lang.Object r0 = r0.mo447a(r8)
            java.security.PublicKey r0 = (java.security.PublicKey) r0
            boolean r1 = com.amazon.android.framework.util.KiwiLogger.TRACE_ON
            if (r1 == 0) goto L_0x0044
            com.amazon.android.framework.util.KiwiLogger r1 = f1101a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Key was cached: "
            java.lang.StringBuilder r2 = r2.append(r3)
            if (r0 == 0) goto L_0x0047
            r3 = r6
        L_0x0039:
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.trace(r2)
        L_0x0044:
            if (r0 == 0) goto L_0x0049
        L_0x0046:
            return r0
        L_0x0047:
            r3 = r5
            goto L_0x0039
        L_0x0049:
            boolean r0 = com.amazon.android.framework.util.KiwiLogger.TRACE_ON
            if (r0 == 0) goto L_0x0054
            com.amazon.android.framework.util.KiwiLogger r0 = f1101a
            java.lang.String r1 = "Loading authentication key from apk..."
            r0.trace(r1)
        L_0x0054:
            java.util.jar.JarFile r0 = r9.m371b()
            java.util.jar.JarEntry r1 = m370a(r0)
            java.security.cert.CertPath r1 = m369a(r0, r1)
            if (r1 == 0) goto L_0x00cd
            java.util.List r0 = r1.getCertificates()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00cd
            java.util.List r0 = r1.getCertificates()
            java.lang.Object r0 = r0.get(r5)
            java.security.cert.Certificate r0 = (java.security.cert.Certificate) r0
            boolean r2 = r0 instanceof java.security.cert.X509Certificate
            if (r2 == 0) goto L_0x00cd
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            javax.security.auth.x500.X500Principal r0 = r0.getSubjectX500Principal()
            java.lang.String r0 = r0.getName()
            boolean r2 = com.amazon.android.framework.util.KiwiLogger.TRACE_ON
            if (r2 == 0) goto L_0x00a0
            com.amazon.android.framework.util.KiwiLogger r2 = f1101a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Kiwi Cert Details: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.trace(r3)
        L_0x00a0:
            java.lang.String r2 = "O=Amazon.com\\, Inc."
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x00cb
            java.lang.String r2 = "C=US"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x00cb
            java.lang.String r2 = "ST=Washington"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x00cb
            java.lang.String r2 = "L=Seattle"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x00cb
            r0 = r6
        L_0x00c1:
            if (r0 != 0) goto L_0x00cf
            com.amazon.android.g.a r0 = new com.amazon.android.g.a
            java.lang.String r1 = "CERT_INVALID"
            r0.<init>(r1, r7)
            throw r0
        L_0x00cb:
            r0 = r5
            goto L_0x00c1
        L_0x00cd:
            r0 = r5
            goto L_0x00c1
        L_0x00cf:
            com.amazon.android.l.b r0 = m372c()
            boolean r0 = r0.mo436a((java.security.cert.CertPath) r1)
            if (r0 != 0) goto L_0x00e1
            com.amazon.android.g.a r0 = new com.amazon.android.g.a
            java.lang.String r1 = "VERIFICATION_FAILED"
            r0.<init>(r1, r7)
            throw r0
        L_0x00e1:
            java.util.List r0 = r1.getCertificates()
            java.lang.Object r0 = r0.get(r5)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.security.PublicKey r0 = r0.getPublicKey()
            boolean r1 = com.amazon.android.framework.util.KiwiLogger.TRACE_ON
            if (r1 == 0) goto L_0x00fa
            com.amazon.android.framework.util.KiwiLogger r1 = f1101a
            java.lang.String r2 = "Placing auth key into storage"
            r1.trace(r2)
        L_0x00fa:
            com.amazon.android.n.a r1 = r9.f1103c
            java.lang.String r2 = "DATA_AUTHENTICATION_KEY"
            r1.mo448a(r8, r0)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.android.p014l.C0152c.mo437a():java.security.PublicKey");
    }
}
