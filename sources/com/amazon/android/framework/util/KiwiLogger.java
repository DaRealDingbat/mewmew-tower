package com.amazon.android.framework.util;

import android.util.Log;

public class KiwiLogger {
    public static boolean ERROR_ON = true;
    private static final String TAG = "Kiwi";
    private static boolean TEST_ON = false;
    public static boolean TRACE_ON = true;
    private String componentName;

    public KiwiLogger(String str) {
        this.componentName = str;
    }

    public static void enableTest() {
        TEST_ON = true;
    }

    private String getComponentMessage(String str) {
        return this.componentName + ": " + str;
    }

    public static boolean isTestEnabled() {
        return TEST_ON;
    }

    public void error(String str) {
        if (ERROR_ON) {
            Log.e(TAG, getComponentMessage(str));
        }
    }

    public void error(String str, Throwable th) {
        if (ERROR_ON) {
            Log.e(TAG, getComponentMessage(str), th);
        }
    }

    public void test(String str) {
        if (TEST_ON) {
            Log.e(TAG, "TEST-" + getComponentMessage(str));
        }
    }

    public void trace(String str) {
        if (TRACE_ON) {
            Log.d(TAG, getComponentMessage(str));
        }
    }

    public void trace(String str, Throwable th) {
        if (TRACE_ON) {
            Log.d(TAG, getComponentMessage(str), th);
        }
    }
}
