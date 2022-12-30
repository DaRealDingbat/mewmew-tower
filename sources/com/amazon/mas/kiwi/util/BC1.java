package com.amazon.mas.kiwi.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipFile;

public class BC1 {
    private static String CHECKSUM_ALGORITHM = "MD5";
    private static final int DIGEST_UPDATE_BUFFER_SIZE = 10240;
    private static final Set<String> DIRECTORIES_TO_IGNORE_FOR_PARTIAL_CHECKSUM = new HashSet<String>() {
        {
            add("assets/");
            add("res/");
        }
    };
    private static final int MAX_SIZE_FOR_FULL_CHECKSUM = 20971520;

    public static byte[] getBC1Checksum(String path) throws IOException {
        if (path == null) {
            throw new IllegalArgumentException("Given path is null");
        }
        File file = new File(path);
        if (file.exists()) {
            return getBC1Checksum(file);
        }
        throw new IOException("Cannot calculate checksum, file does not exist: " + path);
    }

    public static byte[] getBC1Checksum(File file) throws IOException {
        MessageDigest digest = getMessageDigest();
        if (isTooLargeForFullChecksum(file)) {
            calculatePartialChecksum(file, digest, new byte[DIGEST_UPDATE_BUFFER_SIZE]);
        } else {
            calculateFullChecksum(file, digest);
        }
        return digest.digest();
    }

    private static MessageDigest getMessageDigest() {
        try {
            return MessageDigest.getInstance(CHECKSUM_ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    private static void calculateFullChecksum(File file, MessageDigest digest) throws IOException {
        updateMessageDigestWithInputStream(new FileInputStream(file), digest);
    }

    private static void calculatePartialChecksum(File file, MessageDigest digest, byte[] buffer) throws IOException {
        JarFile jar = new JarFile(file);
        Enumeration<JarEntry> entries = jar.entries();
        while (entries.hasMoreElements()) {
            JarEntry entry = entries.nextElement();
            if (!isInDirectoryToIgnore(entry)) {
                InputStream is = null;
                try {
                    is = jar.getInputStream(entry);
                    updateMessageDigestWithInputStream(is, digest, buffer);
                } finally {
                    closeIgnoreException(is);
                }
            }
        }
        closeIgnoreException((ZipFile) jar);
    }

    private static void closeIgnoreException(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
            }
        }
    }

    private static void closeIgnoreException(ZipFile file) {
        if (file != null) {
            try {
                file.close();
            } catch (IOException e) {
            }
        }
    }

    private static boolean isInDirectoryToIgnore(JarEntry entry) {
        for (String ignoreDir : DIRECTORIES_TO_IGNORE_FOR_PARTIAL_CHECKSUM) {
            if (entry.getName().startsWith(ignoreDir)) {
                return true;
            }
        }
        return false;
    }

    private static void updateMessageDigestWithInputStream(InputStream is, MessageDigest md) throws FileNotFoundException, IOException {
        updateMessageDigestWithInputStream(is, md, new byte[DIGEST_UPDATE_BUFFER_SIZE]);
    }

    private static void updateMessageDigestWithInputStream(InputStream is, MessageDigest md, byte[] byteArray) throws FileNotFoundException, IOException {
        while (true) {
            int i = is.read(byteArray);
            if (i != -1) {
                md.update(byteArray, 0, i);
            } else {
                return;
            }
        }
    }

    private static boolean isTooLargeForFullChecksum(File file) {
        return file.length() >= 20971520;
    }

    public static String getBC1ChecksumBase64(String path) throws IOException {
        return toBase64(getBC1Checksum(path));
    }

    private static String toBase64(byte[] raw) {
        return new String(Base64.encodeBytes(raw));
    }
}
