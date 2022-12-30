package com.amazon.mas.kiwi.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class KiwiVersionEncrypter {
    private static final String SECRET_KEY = "Kiwi__Version__Obfuscator";

    private KiwiVersionEncrypter() {
    }

    public static String encrypt(String text) {
        checkInput(text, "text");
        return Base64.encodeBytes(performXOR(text.getBytes()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030 A[SYNTHETIC, Splitter:B:10:0x0030] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void encryptToFile(java.lang.String r5, java.lang.String r6) throws java.io.IOException {
        /*
            java.lang.String r3 = "text"
            checkInput(r5, r3)
            java.lang.String r3 = "file"
            checkInput(r6, r3)
            byte[] r3 = r5.getBytes()
            byte[] r3 = performXOR(r3)
            java.lang.String r2 = com.amazon.mas.kiwi.util.Base64.encodeBytes(r3)
            r0 = 0
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x002d }
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ all -> 0x002d }
            r3.<init>(r6)     // Catch:{ all -> 0x002d }
            r1.<init>(r3)     // Catch:{ all -> 0x002d }
            r1.write(r2)     // Catch:{ all -> 0x0038 }
            r1.flush()     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x002c
            r1.close()     // Catch:{ IOException -> 0x0034 }
        L_0x002c:
            return
        L_0x002d:
            r3 = move-exception
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0033:
            throw r3
        L_0x0034:
            r3 = move-exception
            goto L_0x002c
        L_0x0036:
            r4 = move-exception
            goto L_0x0033
        L_0x0038:
            r3 = move-exception
            r0 = r1
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.mas.kiwi.util.KiwiVersionEncrypter.encryptToFile(java.lang.String, java.lang.String):void");
    }

    public static String decrypt(String text) throws IOException {
        checkInput(text, "text");
        return new String(performXOR(Base64.decode(text.getBytes())), "UTF-8");
    }

    public static String decryptFromFile(String file) throws IOException {
        checkInput(file, "file");
        BufferedReader br = null;
        try {
            BufferedReader br2 = new BufferedReader(new FileReader(file));
            try {
                String encrypted = br2.readLine();
                if (br2 != null) {
                    try {
                        br2.close();
                    } catch (IOException e) {
                    }
                }
                return new String(performXOR(Base64.decode(encrypted.getBytes())), "UTF-8");
            } catch (Throwable th) {
                th = th;
                br = br2;
            }
        } catch (Throwable th2) {
            th = th2;
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e2) {
                }
            }
            throw th;
        }
    }

    private static void checkInput(String input, String inputName) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("input '" + inputName + "' cannot be null or empty");
        }
    }

    private static byte[] performXOR(byte[] input) {
        byte[] output = new byte[input.length];
        byte[] secret = SECRET_KEY.getBytes();
        int spos = 0;
        for (int pos = 0; pos < input.length; pos++) {
            output[pos] = (byte) (input[pos] ^ secret[spos]);
            spos++;
            if (spos >= secret.length) {
                spos = 0;
            }
        }
        return output;
    }

    public static void main(String[] args) throws Exception {
        if (args == null || args.length == 0) {
            System.out.println("Usage: com.amazon.mas.kiwi.util.KiwiVersionEncrypter <textToBeEncrypted> [<encryptToFileName>]");
        } else if (args.length > 1) {
            encryptToFile(args[0], args[1]);
        } else {
            System.out.println(encrypt(args[0]));
        }
    }
}
