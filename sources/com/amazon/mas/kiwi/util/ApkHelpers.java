package com.amazon.mas.kiwi.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.CodeSigner;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class ApkHelpers {
    private static final String CONTENT_PREFIX = "com.amazon.content.id.";

    public static String getContentID(JarFile apkSrc) {
        String contentID;
        if (apkSrc == null) {
            throw new IllegalArgumentException("apkSrc must not be null!");
        }
        Enumeration<JarEntry> entries = apkSrc.entries();
        while (entries.hasMoreElements()) {
            JarEntry ent = entries.nextElement();
            if (!ent.isDirectory() && (contentID = getContentIDFromName(ent.getName())) != null && contentID.length() != 0) {
                return contentID;
            }
        }
        return null;
    }

    public static String getContentIDFromName(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("name cannot be null or empty!");
        }
        int contentIdIndex = name.indexOf(CONTENT_PREFIX);
        if (contentIdIndex < 0) {
            return null;
        }
        if (name.length() <= CONTENT_PREFIX.length()) {
            return null;
        }
        return name.substring(CONTENT_PREFIX.length() + contentIdIndex);
    }

    public static boolean isSigned(JarFile jarFile) throws IOException {
        if (jarFile == null) {
            throw new IllegalArgumentException("apkSrc must not be null!");
        }
        try {
            scanJar(jarFile);
            if (getCodeSigners(jarFile) != null) {
                return true;
            }
            return false;
        } catch (SecurityException e) {
            return true;
        }
    }

    public static boolean isSigned(File file) throws IOException {
        JarFile jarFile = null;
        try {
            JarFile jarFile2 = new JarFile(file);
            try {
                boolean isSigned = isSigned(jarFile2);
                jarFile2.close();
                return isSigned;
            } catch (Throwable th) {
                th = th;
                jarFile = jarFile2;
                jarFile.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jarFile.close();
            throw th;
        }
    }

    public static byte[] getApkSignature(String apkFileName) throws IOException, ApkInvalidException {
        if (apkFileName == null || apkFileName.length() == 0) {
            throw new IllegalArgumentException("apkFileName cannot be null or empty!");
        }
        JarFile jarFile = new JarFile(apkFileName);
        try {
            scanJar(jarFile);
            Certificate cert = getFirstSigningCert(jarFile);
            if (cert == null) {
                return null;
            }
            byte[] certBytes = null;
            if (cert instanceof X509Certificate) {
                certBytes = ((X509Certificate) cert).getSignature();
            }
            return certBytes;
        } catch (SecurityException e) {
            return null;
        }
    }

    private static Certificate getFirstSigningCert(JarFile jarFile) {
        CodeSigner[] codeSigners = getCodeSigners(jarFile);
        if (codeSigners == null || codeSigners.length <= 0) {
            return null;
        }
        List<? extends Certificate> certs = codeSigners[0].getSignerCertPath().getCertificates();
        if (!certs.isEmpty()) {
            return (Certificate) certs.get(0);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0005 A[LOOP:0: B:1:0x0005->B:4:0x0015, LOOP_START, PHI: r2 
      PHI: (r2v1 'signers' java.security.CodeSigner[]) = (r2v0 'signers' java.security.CodeSigner[]), (r2v3 'signers' java.security.CodeSigner[]) binds: [B:0:0x0000, B:4:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.security.CodeSigner[] getCodeSigners(java.util.jar.JarFile r4) {
        /*
            r2 = 0
            java.util.Enumeration r0 = r4.entries()
        L_0x0005:
            boolean r3 = r0.hasMoreElements()
            if (r3 == 0) goto L_0x0017
            java.lang.Object r1 = r0.nextElement()
            java.util.jar.JarEntry r1 = (java.util.jar.JarEntry) r1
            java.security.CodeSigner[] r2 = r1.getCodeSigners()
            if (r2 == 0) goto L_0x0005
        L_0x0017:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.mas.kiwi.util.ApkHelpers.getCodeSigners(java.util.jar.JarFile):java.security.CodeSigner[]");
    }

    private static void scanJar(JarFile jarFile) throws IOException {
        Enumeration<JarEntry> entries = jarFile.entries();
        byte[] buffer = new byte[8192];
        while (entries.hasMoreElements()) {
            InputStream is = null;
            try {
                InputStream is2 = jarFile.getInputStream(entries.nextElement());
                do {
                } while (is2.read(buffer, 0, buffer.length) != -1);
                if (is2 != null) {
                    is2.close();
                }
            } catch (Exception e) {
                throw new ApkInvalidException((Throwable) e);
            } catch (Throwable th) {
                if (is != null) {
                    is.close();
                }
                throw th;
            }
        }
    }
}
