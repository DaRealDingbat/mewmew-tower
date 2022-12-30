package com.google.ads;

/* renamed from: com.google.ads.d */
public enum C0242d {
    INVALID_REQUEST("Invalid Google Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");
    

    /* renamed from: e */
    private String f1244e;

    private C0242d(String str) {
        this.f1244e = str;
    }

    public final String toString() {
        return this.f1244e;
    }
}
