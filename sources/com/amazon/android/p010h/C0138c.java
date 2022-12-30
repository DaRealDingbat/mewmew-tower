package com.amazon.android.p010h;

import com.amazon.android.framework.util.KiwiLogger;
import java.util.Date;

/* renamed from: com.amazon.android.h.c */
public abstract class C0138c extends C0137b {
    private static final KiwiLogger LOGGER = new KiwiLogger("RelativeExpirable");
    private static final long MILLISECONDS_PER_SECOND = 1000;
    private final Date instantiation = new Date();

    public final Date getExpiration() {
        LOGGER.trace("RelativeExpiration duration: " + getExpirationDurationInSeconds() + ", expirable: " + this);
        Date date = new Date(this.instantiation.getTime() + (MILLISECONDS_PER_SECOND * getExpirationDurationInSeconds()));
        LOGGER.trace("Expiration should occur at time: " + date);
        return date;
    }

    /* access modifiers changed from: protected */
    public abstract long getExpirationDurationInSeconds();
}
