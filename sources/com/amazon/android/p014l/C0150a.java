package com.amazon.android.p014l;

import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.mas.kiwi.util.Base64;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Signature;

/* renamed from: com.amazon.android.l.a */
public final class C0150a {

    /* renamed from: a */
    private static final KiwiLogger f1093a = new KiwiLogger("SignatureVerifier");

    /* renamed from: a */
    public static boolean m365a(String str, String str2, PublicKey publicKey) {
        if (KiwiLogger.TRACE_ON) {
            f1093a.trace("Verifying signature of data: '" + str + "', signature: '" + str2 + "', with key: '" + publicKey.toString());
        }
        try {
            byte[] decode = Base64.decode(str2.getBytes());
            Signature instance = Signature.getInstance("SHA1withRSA");
            instance.initVerify(publicKey);
            instance.update(str.getBytes());
            return instance.verify(decode);
        } catch (GeneralSecurityException e) {
            return false;
        } catch (IOException e2) {
            return false;
        }
    }
}
