package amazon.android.p000a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;

/* renamed from: amazon.android.a.m */
public final class C0015m {

    /* renamed from: a */
    public static int f366a;

    /* renamed from: b */
    public static int f367b;

    /* renamed from: c */
    public static float f368c;

    /* renamed from: d */
    public static boolean f369d;

    /* renamed from: e */
    public static float f370e;

    /* renamed from: f */
    public static float f371f;

    /* renamed from: a */
    public static int m65a(int i) {
        float f = (((float) f366a) / f368c) / 480.0f;
        float f2 = (((float) f367b) / f368c) / 800.0f;
        if (f <= f2) {
            f2 = f;
        }
        return (int) ((f2 * ((float) i)) + 0.5f);
    }

    /* renamed from: a */
    public static void m66a(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        f366a = displayMetrics.widthPixels;
        f367b = displayMetrics.heightPixels;
        f368c = displayMetrics.density;
        f369d = m67a((Context) activity);
        f370e = ((float) f366a) / 800.0f;
        f371f = ((float) f367b) / 1280.0f;
    }

    /* renamed from: a */
    public static boolean m67a(Context context) {
        if (Build.MODEL.equals("KFJWI")) {
            return false;
        }
        return (Build.VERSION.SDK_INT >= 11) && (context.getResources().getConfiguration().screenLayout & 15) == 4;
    }
}
