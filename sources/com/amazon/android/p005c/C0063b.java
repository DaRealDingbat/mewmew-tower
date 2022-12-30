package com.amazon.android.p005c;

import android.app.ActivityManager;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import com.amazon.android.framework.util.C0129b;
import com.amazon.android.framework.util.KiwiLogger;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.amazon.android.c.b */
public final class C0063b implements Serializable {

    /* renamed from: a */
    private static final KiwiLogger f917a = new KiwiLogger("CrashReport");
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private final HashMap f918b = new LinkedHashMap();

    public C0063b(Application application, Throwable th) {
        try {
            this.f918b.put("crashTime", new Date().toString());
            PackageInfo a = m208a(application);
            if (a != null) {
                this.f918b.put("packageVersionName", a.versionName);
                this.f918b.put("packageName", a.packageName);
                this.f918b.put("packageFilePath", application.getFilesDir().getAbsolutePath());
            }
            this.f918b.put("deviceModel", Build.MODEL);
            this.f918b.put("androidVersion", Build.VERSION.RELEASE);
            this.f918b.put("deviceBoard", Build.BOARD);
            this.f918b.put("deviceBrand", Build.BRAND);
            this.f918b.put("deviceDisplay", Build.DISPLAY);
            this.f918b.put("deviceFingerPrint", Build.FINGERPRINT);
            this.f918b.put("deviceHost", Build.HOST);
            this.f918b.put("deviceId", Build.ID);
            this.f918b.put("deviceManufacturer", Build.MANUFACTURER);
            this.f918b.put("deviceProduct", Build.PRODUCT);
            this.f918b.put("deviceTags", Build.TAGS);
            this.f918b.put("deviceTime", Long.toString(Build.TIME));
            this.f918b.put("deviceType", Build.TYPE);
            this.f918b.put("deviceUser", Build.USER);
            HashMap hashMap = this.f918b;
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            hashMap.put("totalInternalMemorySize", Long.toString(((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())));
            HashMap hashMap2 = this.f918b;
            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
            hashMap2.put("availableInternalMemorySize", Long.toString(((long) statFs2.getAvailableBlocks()) * ((long) statFs2.getBlockSize())));
            ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                this.f918b.put("memLowFlag", Boolean.toString(memoryInfo.lowMemory));
                this.f918b.put("memLowThreshold", Long.toString(memoryInfo.threshold));
            }
            this.f918b.put("nativeHeapSize", Long.toString(Debug.getNativeHeapSize()));
            this.f918b.put("nativeHeapFreeSize", Long.toString(Debug.getNativeHeapAllocatedSize()));
            this.f918b.put("threadAllocCount", Long.toString((long) Debug.getThreadAllocCount()));
            this.f918b.put("threadAllocSize", Long.toString((long) Debug.getThreadAllocSize()));
            m209a(th);
            m210b();
            m211c();
        } catch (Throwable th2) {
            if (KiwiLogger.ERROR_ON) {
                f917a.error("Error collection crash report details", th2);
            }
        }
    }

    /* renamed from: a */
    private static PackageInfo m208a(Application application) {
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (KiwiLogger.ERROR_ON) {
                f917a.error("Unable to fetch package info", e);
            }
            return null;
        }
    }

    /* renamed from: a */
    private void m209a(Throwable th) {
        StringBuilder sb = new StringBuilder();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        sb.append(stringWriter.toString());
        sb.append("\n");
        Throwable cause = th.getCause();
        while (cause != null) {
            cause.printStackTrace(printWriter);
            sb.append(stringWriter.toString());
            cause = cause.getCause();
            sb.append("\n\n");
        }
        printWriter.close();
        this.f918b.put("stackTrace", sb.toString());
    }

    /* renamed from: b */
    private void m210b() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
            Thread thread = (Thread) next.getKey();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
            sb.append("Thread : " + thread.getId());
            if (!C0129b.m347a(thread.getName())) {
                sb.append("/" + thread.getName());
            }
            sb.append("\n");
            sb.append("isAlive : " + thread.isAlive() + "\n");
            sb.append("isInterrupted : " + thread.isInterrupted() + "\n");
            sb.append("isDaemon : " + thread.isDaemon() + "\n");
            for (int i = 0; i < stackTraceElementArr.length; i++) {
                sb.append("\tat " + stackTraceElementArr[i] + "\n");
            }
            sb.append("\n\n");
        }
        this.f918b.put("threadDump", sb.toString());
    }

    /* renamed from: c */
    private void m211c() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.f918b.get("packageName")).append((String) this.f918b.get("packageVersionName")).append((String) this.f918b.get("androidVersion"));
            String str = (String) this.f918b.get("stackTrace");
            if (str != null) {
                Matcher matcher = Pattern.compile("([a-zA-Z0-9_.]+(Exception|Error))|(at\\s.*\\(.*\\))").matcher(str);
                while (matcher.find()) {
                    sb.append(matcher.group());
                }
            }
            this.f918b.put("crashId", new BigInteger(MessageDigest.getInstance("SHA1").digest(sb.toString().getBytes("UTF-8"))).abs().toString(16));
        } catch (Exception e) {
            if (KiwiLogger.ERROR_ON) {
                f917a.error("Error capturing crash id", e);
            }
        }
    }

    /* renamed from: a */
    public final Map mo288a() {
        return this.f918b;
    }
}
