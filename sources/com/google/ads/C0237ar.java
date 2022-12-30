package com.google.ads;

import android.app.Activity;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.util.C0261b;
import java.lang.ref.WeakReference;
import java.util.Date;

/* renamed from: com.google.ads.ar */
final class C0237ar implements Runnable {

    /* renamed from: a */
    private WeakReference f1223a;

    public C0237ar(Activity activity) {
        this.f1223a = new WeakReference(activity);
    }

    public final void run() {
        String str;
        try {
            Activity activity = (Activity) this.f1223a.get();
            if (activity == null) {
                C0261b.m574a("Activity was null while making a doritos cookie request.");
                return;
            }
            Cursor query = activity.getContentResolver().query(C0235ap.f1220b, C0235ap.f1222d, (String) null, (String[]) null, (String) null);
            if (query == null || !query.moveToFirst() || query.getColumnNames().length <= 0) {
                C0261b.m574a("Google+ app not installed, not storing doritos cookie");
                str = null;
            } else {
                str = query.getString(query.getColumnIndex(query.getColumnName(0)));
            }
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(activity.getApplicationContext()).edit();
            if (!TextUtils.isEmpty(str)) {
                edit.putString("drt", str);
                edit.putLong("drt_ts", new Date().getTime());
            } else {
                edit.putString("drt", "");
                edit.putLong("drt_ts", 0);
            }
            edit.commit();
        } catch (Exception e) {
            C0261b.m575a("An unknown error occurred while sending a doritos request.", (Throwable) e);
        }
    }
}
