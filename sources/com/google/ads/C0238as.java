package com.google.ads;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.util.C0261b;
import java.lang.ref.WeakReference;

/* renamed from: com.google.ads.as */
final class C0238as implements Runnable {

    /* renamed from: a */
    private WeakReference f1224a;

    /* renamed from: b */
    private WebView f1225b;

    /* renamed from: c */
    private String f1226c;

    public C0238as(Activity activity, WebView webView, String str) {
        this.f1224a = new WeakReference(activity);
        this.f1226c = str;
        this.f1225b = webView;
    }

    public final void run() {
        boolean z;
        try {
            Uri withAppendedPath = Uri.withAppendedPath(C0235ap.f1219a, this.f1226c);
            Activity activity = (Activity) this.f1224a.get();
            if (activity == null) {
                C0261b.m574a("Activity was null while getting the +1 button state.");
                return;
            }
            Cursor query = activity.getContentResolver().query(withAppendedPath, C0235ap.f1221c, (String) null, (String[]) null, (String) null);
            if (query == null || !query.moveToFirst()) {
                C0261b.m574a("Google+ app not installed, showing ad as not +1'd");
                z = false;
            } else {
                z = query.getInt(query.getColumnIndex("has_plus1")) == 1;
            }
            this.f1225b.post(new C0239at(this.f1225b, z));
        } catch (Exception e) {
            C0261b.m575a("An unknown error occurred while updating the +1 state.", (Throwable) e);
        }
    }
}
