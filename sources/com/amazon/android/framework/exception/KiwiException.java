package com.amazon.android.framework.exception;

public abstract class KiwiException extends Exception {
    private static final long serialVersionUID = 1;
    private final String context;
    private final String reason;
    private final String type;

    public KiwiException(String str) {
        this(str, (String) null);
    }

    public KiwiException(String str, String str2) {
        this(str, str2, (String) null);
    }

    public KiwiException(String str, String str2, String str3) {
        super(str + ": " + str2 + ": " + str3);
        this.type = str;
        this.reason = str2;
        this.context = str3;
    }

    public KiwiException(String str, String str2, Throwable th) {
        this(str, str2, getContext(th));
    }

    public KiwiException(String str, Throwable th) {
        this(str, getName(th), th);
    }

    private static String getContext(Throwable th) {
        if (th == null) {
            return null;
        }
        Throwable rootCause = getRootCause(th);
        StringBuilder sb = new StringBuilder();
        sb.append(getName(th)).append(":").append(th.getMessage());
        if (th != rootCause) {
            sb.append("/").append(getName(rootCause)).append(":").append(rootCause.getMessage());
        }
        return sb.toString();
    }

    private static String getName(Throwable th) {
        return th.getClass().getName();
    }

    private static Throwable getRootCause(Throwable th) {
        Throwable th2 = th;
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        return th2;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getType() {
        return this.type;
    }
}
