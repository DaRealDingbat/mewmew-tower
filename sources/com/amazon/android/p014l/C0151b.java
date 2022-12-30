package com.amazon.android.p014l;

import com.amazon.android.framework.util.KiwiLogger;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.amazon.android.l.b */
public final class C0151b {

    /* renamed from: a */
    private static final KiwiLogger f1094a = new KiwiLogger("CertVerifier");

    /* renamed from: e */
    private static final byte[][] f1095e = {new byte[]{-123, 55, 28, -90, -27, 80, 20, 61, -50, 40, 3, 71, 27, -34, 58, 9, -24, -8, 119, 15}, new byte[]{-95, -37, 99, -109, -111, 111, 23, -28, 24, 85, 9, 64, 4, 21, -57, 2, 64, -80, -82, 107}, new byte[]{78, -74, -43, 120, 73, -101, 28, -49, 95, 88, 30, -83, 86, -66, 61, -101, 103, 68, -91, -27}, new byte[]{19, 45, 13, 69, 83, 75, 105, -105, -51, -78, -43, -61, 57, -30, 85, 118, 96, -101, 92, -58}, new byte[]{34, -43, -40, -33, -113, 2, 49, -47, -115, -9, -99, -73, -49, -118, 45, 100, -55, 63, 108, 58}, new byte[]{97, -17, 67, -41, Byte.MAX_VALUE, -54, -44, 97, 81, -68, -104, -32, -61, 89, 18, -81, -97, -21, 99, 17}, new byte[]{-77, -22, -60, 71, 118, -55, -56, 28, -22, -14, -99, -107, -74, -52, -96, 8, 27, 103, -20, -99}, new byte[]{-112, -82, -94, 105, -123, -1, 20, Byte.MIN_VALUE, 76, 67, 73, 82, -20, -23, 96, -124, 119, -81, 85, 111}, new byte[]{32, 66, -123, -36, -9, -21, 118, 65, -107, 87, -114, 19, 107, -44, -73, -47, -23, -114, 70, -91}, new byte[]{54, 121, -54, 53, 102, -121, 114, 48, 77, 48, -91, -5, -121, 59, 15, -89, 123, -73, 13, 84}, new byte[]{-56, -20, -116, -121, -110, 105, -53, 75, -85, 57, -23, -115, 126, 87, 103, -13, 20, -107, 115, -99}, new byte[]{81, Byte.MAX_VALUE, 97, 30, 41, -111, 107, 83, -126, -5, 114, -25, 68, -39, -115, -61, -52, 83, 109, 100}, new byte[]{64, -77, 49, -96, -23, -65, -24, 85, -68, 57, -109, -54, 112, 79, 78, -62, 81, -44, 29, -113}};

    /* renamed from: f */
    private static final byte[][] f1096f = {new byte[]{-111, -58, -42, -18, 62, -118, -56, 99, -124, -27, 72, -62, -103, 41, 92, 117, 108, -127, 123, -127}, new byte[]{-32, -85, 5, -108, 32, 114, 84, -109, 5, 96, 98, 2, 54, 112, -9, -51, 46, -4, 102, 102}, new byte[]{-97, -83, -111, -90, -50, 106, -58, -59, 0, 71, -60, 78, -55, -44, -91, 13, -110, -40, 73, 121}, new byte[]{-86, -37, -68, 34, 35, -113, -60, 1, -95, 39, -69, 56, -35, -12, 29, -37, 8, -98, -16, 18}, new byte[]{-15, -117, 83, -115, 27, -23, 3, -74, -90, -16, 86, 67, 91, 23, 21, -119, -54, -13, 107, -14}};

    /* renamed from: g */
    private static final byte[][] f1097g = {new byte[]{-35, -5, 22, -51, 73, 49, -55, 115, -94, 3, 125, 63, -56, 58, 77, 125, 119, 93, 5, -28}};

    /* renamed from: b */
    private final PKIXParameters f1098b;

    /* renamed from: c */
    private final CertPathValidator f1099c;

    /* renamed from: d */
    private final Set f1100d = new HashSet();

    public C0151b() throws GeneralSecurityException {
        X509Certificate[] acceptedIssuers;
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        for (TrustManager trustManager : instance.getTrustManagers()) {
            if ((trustManager instanceof X509TrustManager) && (acceptedIssuers = ((X509TrustManager) trustManager).getAcceptedIssuers()) != null) {
                int i = 0;
                for (X509Certificate x509Certificate : acceptedIssuers) {
                    if (m366a(x509Certificate)) {
                        if (KiwiLogger.TRACE_ON) {
                            f1094a.trace("Trusted Cert: " + x509Certificate.getSubjectX500Principal().getName());
                        }
                        this.f1100d.add(new TrustAnchor(x509Certificate, (byte[]) null));
                        i++;
                    }
                }
                if (KiwiLogger.TRACE_ON) {
                    f1094a.trace(String.format("loaded %d certs\n", new Object[]{Integer.valueOf(i)}));
                }
            }
        }
        if (this.f1100d.isEmpty()) {
            f1094a.error("TrustManager did not return valid accepted issuers, likely 3P custom TrustManager implementation issue.");
        }
        this.f1098b = new PKIXParameters(this.f1100d);
        this.f1098b.setRevocationEnabled(false);
        this.f1099c = CertPathValidator.getInstance("PKIX");
    }

    /* renamed from: a */
    private static boolean m366a(X509Certificate x509Certificate) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getEncoded());
            return m367a(f1097g, digest) || m367a(f1095e, digest) || m367a(f1096f, digest);
        } catch (NoSuchAlgorithmException e) {
            f1094a.error("Signature algorithm unrecognized", e);
            return false;
        } catch (CertificateEncodingException e2) {
            f1094a.error("Cant get fingerprint", e2);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m367a(byte[][] bArr, byte[] bArr2) {
        for (byte[] equals : bArr) {
            if (Arrays.equals(equals, bArr2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo436a(CertPath certPath) {
        try {
            Date notBefore = ((X509Certificate) certPath.getCertificates().get(0)).getNotBefore();
            f1094a.trace("Verifying CertPath with " + notBefore);
            this.f1098b.setDate(notBefore);
            this.f1099c.validate(certPath, this.f1098b);
            return true;
        } catch (Exception e) {
            if (KiwiLogger.TRACE_ON) {
                f1094a.error("Failed to verify cert path: " + e, e);
            }
            return false;
        }
    }
}
