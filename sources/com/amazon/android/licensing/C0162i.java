package com.amazon.android.licensing;

import com.amazon.android.framework.prompt.C0082a;
import com.amazon.android.framework.prompt.PromptContent;

/* renamed from: com.amazon.android.licensing.i */
public final class C0162i {

    /* renamed from: a */
    public static final PromptContent f1122a = new PromptContent(new String[]{"Amazon Appstore required"}, "Amazon Appstore is not installed on your device. Please install Amazon Appstore and sign in to Amazon to use this app.", new String[]{"Quit", "Help"}, new C0082a[]{C0082a.DEFAULT, C0082a.HELP}, true, true, 1, 1);

    /* renamed from: b */
    public static final PromptContent f1123b = new PromptContent("Amazon Appstore connection failure", "An error occurred connecting to Amazon Appstore. Please try opening this app again", "Quit", true, false);

    /* renamed from: c */
    public static final PromptContent f1124c = new PromptContent(new String[]{"New Appstore version required", "Amazon Appstore Update Required"}, "Amazon Appstore is out of date.  Please visit the Amazon website to install the latest version of the Appstore. ", new String[]{"Quit", "Help"}, new C0082a[]{C0082a.DEFAULT, C0082a.HELP}, true, true, 1, 2);

    /* renamed from: d */
    public static final PromptContent f1125d = new PromptContent("Internet connection required", "An internet connection is required to open this app. Please connect to the internet and reopen this app.", "Quit", true, false);

    /* renamed from: e */
    public static final PromptContent f1126e = new PromptContent(new String[]{"Connection error"}, "An unknown error occurred connecting to Amazon Appstore.", new String[]{"Quit", "Help"}, new C0082a[]{C0082a.DEFAULT, C0082a.HELP}, true, true, 1, 3);

    /* renamed from: f */
    public static final PromptContent f1127f = new PromptContent("Internal error", "An internal error occurred, please try opening this app again", "Quit", true, false);

    /* renamed from: g */
    public static final PromptContent f1128g = new PromptContent("App update required", "Please update this app from the Amazon Appstore.", new String[]{"Quit", "Update"}, new C0082a[]{C0082a.DEFAULT, C0082a.DEEPLINK}, true, false, 0);

    private C0162i() {
    }
}
