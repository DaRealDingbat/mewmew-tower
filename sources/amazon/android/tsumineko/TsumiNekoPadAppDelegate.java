package amazon.android.tsumineko;

import amazon.android.p000a.C0007e;
import amazon.android.p000a.C0010h;
import amazon.android.p000a.p001a.C0001a;
import amazon.android.p000a.p001a.C0002b;
import amazon.android.p000a.p001a.C0003c;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.reflect.Array;
import java.util.HashMap;

public class TsumiNekoPadAppDelegate extends Application implements C0007e {

    /* renamed from: I */
    private static BitmapFactory.Options f377I = null;

    /* renamed from: A */
    public C0003c[] f378A = null;

    /* renamed from: B */
    public boolean f379B = false;

    /* renamed from: C */
    public boolean f380C;

    /* renamed from: D */
    public int f381D = 0;

    /* renamed from: E */
    public boolean f382E = false;

    /* renamed from: F */
    public int f383F = 0;

    /* renamed from: G */
    public int f384G = 0;

    /* renamed from: H */
    public boolean f385H = true;

    /* renamed from: l */
    public HashMap f386l = new HashMap();

    /* renamed from: m */
    public HashMap f387m = new HashMap();

    /* renamed from: n */
    public HashMap f388n = new HashMap();

    /* renamed from: o */
    public HashMap f389o = new HashMap();

    /* renamed from: p */
    public HashMap f390p = new HashMap();

    /* renamed from: q */
    public String f391q = "bY5FQ930E4AazImLY07Fg";

    /* renamed from: r */
    public String f392r = "NOVC4PjQaYSXsMHQ5KJRdkEvGOWmkes4N0XqHKk4HA0";

    /* renamed from: s */
    public String f393s = "http://www.tsumineko.com/android/callback";

    /* renamed from: t */
    public boolean f394t = false;

    /* renamed from: u */
    public boolean f395u = true;

    /* renamed from: v */
    public boolean f396v = false;

    /* renamed from: w */
    public C0010h[] f397w = new C0010h[39];

    /* renamed from: x */
    public C0003c f398x = new C0003c();

    /* renamed from: y */
    public C0003c f399y = new C0003c();

    /* renamed from: z */
    public C0001a f400z;

    /* renamed from: a */
    private C0010h m69a(Context context, String str, boolean z) {
        int identifier = context.getResources().getIdentifier(String.valueOf(getPackageName()) + ":raw/" + str, (String) null, (String) null);
        if (identifier != 0) {
            Log.i("TsumiNekoPadAppDelegate", "Get Sound " + str + " ok.");
            return new C0010h(context, identifier, z);
        }
        Log.e("TsumiNekoPadAppDelegate", "Can not get Sound " + str);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026 A[SYNTHETIC, Splitter:B:11:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032 A[SYNTHETIC, Splitter:B:19:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m70a(int r8) {
        /*
            r7 = this;
            r1 = 0
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ Throwable -> 0x0022, all -> 0x002e }
            android.content.res.Resources r0 = r7.getResources()     // Catch:{ Throwable -> 0x0022, all -> 0x002e }
            java.io.InputStream r0 = r0.openRawResource(r8)     // Catch:{ Throwable -> 0x0022, all -> 0x002e }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x0022, all -> 0x002e }
            r0 = 153600(0x25800, float:2.1524E-40)
            byte[] r3 = new byte[r0]     // Catch:{ Throwable -> 0x003c, all -> 0x003a }
            int r4 = r2.read(r3)     // Catch:{ Throwable -> 0x003c, all -> 0x003a }
            byte[] r0 = new byte[r4]     // Catch:{ Throwable -> 0x003c, all -> 0x003a }
            r5 = 0
            r6 = 0
            java.lang.System.arraycopy(r3, r5, r0, r6, r4)     // Catch:{ Throwable -> 0x003c, all -> 0x003a }
            r2.close()     // Catch:{ Throwable -> 0x0038 }
        L_0x0021:
            return r0
        L_0x0022:
            r0 = move-exception
            r0 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003f
            r0.close()     // Catch:{ Throwable -> 0x002b }
            r0 = r1
            goto L_0x0021
        L_0x002b:
            r0 = move-exception
            r0 = r1
            goto L_0x0021
        L_0x002e:
            r0 = move-exception
            r2 = r1
        L_0x0030:
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch:{ Throwable -> 0x0036 }
        L_0x0035:
            throw r0
        L_0x0036:
            r1 = move-exception
            goto L_0x0035
        L_0x0038:
            r1 = move-exception
            goto L_0x0021
        L_0x003a:
            r0 = move-exception
            goto L_0x0030
        L_0x003c:
            r0 = move-exception
            r0 = r2
            goto L_0x0024
        L_0x003f:
            r0 = r1
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: amazon.android.tsumineko.TsumiNekoPadAppDelegate.m70a(int):byte[]");
    }

    /* renamed from: b */
    private void m71b(Context context, ViewGroup viewGroup, float f, float f2) {
        if (context != null && viewGroup != null) {
            try {
                Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i);
                        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                        if (layoutParams.width > 0) {
                            layoutParams.width = (int) (((float) layoutParams.width) * f);
                        }
                        if (layoutParams.height > 0) {
                            layoutParams.height = (int) (((float) layoutParams.height) * f2);
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins((int) (((float) marginLayoutParams.leftMargin) * f), (int) (((float) marginLayoutParams.topMargin) * f2), (int) (((float) marginLayoutParams.rightMargin) * f), (int) (((float) marginLayoutParams.bottomMargin) * f2));
                        m71b(context, viewGroup2, f, f2);
                    } else if (viewGroup.getChildAt(i) instanceof View) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                            if (layoutParams2.width > 0) {
                                layoutParams3.width = (int) (((float) layoutParams2.width) * f);
                            } else {
                                layoutParams3.width = layoutParams2.width;
                            }
                            if (layoutParams2.height > 0) {
                                layoutParams3.height = (int) (((float) layoutParams2.height) * f2);
                            } else {
                                layoutParams3.height = layoutParams2.height;
                            }
                            layoutParams3.setMargins((int) (((float) layoutParams2.leftMargin) * f), (int) (((float) layoutParams2.topMargin) * f2), (int) (((float) layoutParams2.rightMargin) * f), (int) (((float) layoutParams2.bottomMargin) * f2));
                            childAt.setLayoutParams(layoutParams3);
                            layoutParams3.gravity = layoutParams2.gravity;
                            viewGroup.updateViewLayout(childAt, layoutParams3);
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                            if (layoutParams4.width > 0) {
                                layoutParams4.width = (int) (((float) layoutParams4.width) * f);
                            }
                            if (layoutParams4.height > 0) {
                                layoutParams4.height = (int) (((float) layoutParams4.height) * f2);
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                            marginLayoutParams2.setMargins((int) (((float) marginLayoutParams2.leftMargin) * f), (int) (((float) marginLayoutParams2.topMargin) * f2), (int) (((float) marginLayoutParams2.rightMargin) * f), (int) (((float) marginLayoutParams2.bottomMargin) * f2));
                        }
                        if (childAt instanceof TextView) {
                            ((TextView) childAt).setTextSize((((TextView) childAt).getTextSize() / displayMetrics.scaledDensity) * f2);
                        }
                    }
                }
            } catch (Exception e) {
                Log.e("TsumiNekoPadAppDelegate", "adjustViewGroup error");
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    private void m72e() {
        for (int i = 0; i < f259h.length; i++) {
            int i2 = f259h[i];
            int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, new int[]{f258g[i].length, 2});
            for (int i3 = 0; i3 < f258g[i].length; i3++) {
                if (f258g[i][i3] == null) {
                    iArr[i3][0] = 0;
                    iArr[i3][1] = 0;
                } else {
                    int[] b = mo93b(f258g[i][i3]);
                    iArr[i3][0] = b[3];
                    iArr[i3][1] = b[4];
                }
            }
            Integer valueOf = Integer.valueOf(i);
            this.f388n.put(valueOf, new C0002b(i, i2, iArr[0][0], iArr[0][1], f258g[i][0], iArr[1][0], iArr[1][1], f258g[i][1], iArr[2][0], iArr[2][1], f258g[i][2], iArr[3][0], iArr[3][1], f258g[i][3], iArr[4][0], iArr[4][1], f258g[i][4], iArr[5][0], iArr[5][1], f258g[i][5], iArr[6][0], iArr[6][1], f258g[i][6], iArr[7][0], iArr[7][1], f258g[i][7], iArr[8][0], iArr[8][1], f258g[i][8], iArr[9][0], iArr[9][1], f258g[i][9]));
        }
    }

    /* renamed from: a */
    public final void mo89a() {
        this.f400z.mo2a();
        for (int i = 0; i < this.f397w.length; i++) {
            if (this.f397w[i] != null) {
                this.f397w[i].mo36c();
                this.f397w[i] = null;
            }
        }
        for (int i2 = 0; i2 < this.f388n.size(); i2++) {
            C0002b bVar = (C0002b) this.f388n.get(Integer.valueOf(i2));
            bVar.f24e = null;
            bVar.f27h = null;
            bVar.f30k = null;
            bVar.f33n = null;
            bVar.f36q = null;
            bVar.f39t = null;
            bVar.f42w = null;
            bVar.f45z = null;
            bVar.f16C = null;
            bVar.f19F = null;
        }
        this.f388n.clear();
        this.f388n = null;
    }

    /* renamed from: a */
    public final void mo90a(Context context, ViewGroup viewGroup, float f, float f2) {
        if (context != null && viewGroup != null) {
            try {
                Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
                defaultDisplay.getMetrics(new DisplayMetrics());
                if (f < 0.0f) {
                    f = (float) defaultDisplay.getWidth();
                }
                if (f2 < 0.0f) {
                    f2 = (float) defaultDisplay.getHeight();
                }
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                float f3 = f / ((float) layoutParams.width);
                float f4 = f2 / ((float) layoutParams.height);
                layoutParams.width = (int) (((float) layoutParams.width) * f3);
                layoutParams.height = (int) (((float) layoutParams.height) * f4);
                m71b(context, viewGroup, f3, f4);
            } catch (Exception e) {
                Log.e("TsumiNekoPadAppDelegate", "adjustWindow error");
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final int[] mo91a(String str) {
        if (str == null || !this.f389o.containsKey(str)) {
            return null;
        }
        return (int[]) this.f389o.get(str);
    }

    /* renamed from: b */
    public final void mo92b() {
        for (C0010h hVar : this.f397w) {
            if (hVar != null) {
                C0010h[] hVarArr = this.f397w;
            }
        }
    }

    /* renamed from: b */
    public final int[] mo93b(String str) {
        if (str != null && this.f389o.containsKey(str)) {
            return (int[]) this.f389o.get(str);
        }
        Log.e("TsumiNekoPadAppDelegate", "Error!!!! atras not found.[" + str + "]");
        return null;
    }

    /* renamed from: c */
    public final void mo94c() {
        for (int i = 0; i < this.f397w.length; i++) {
            if ((i < 0 || i >= 17) && i != 36) {
                this.f397w[i].mo37d();
            } else {
                this.f397w[i].mo38e();
            }
        }
        System.gc();
    }

    /* renamed from: d */
    public final void mo95d() {
        for (int i = 0; i < this.f397w.length; i++) {
            if ((i <= 0 || i >= 17) && i != 36) {
                this.f397w[i].mo38e();
            } else {
                this.f397w[i].mo37d();
            }
        }
        System.gc();
    }

    public void onCreate() {
        super.onCreate();
        Log.d("", "--- initTextureAtras_");
        if (this.f389o.size() <= 0) {
            for (int i = 0; i < f260i.length; i++) {
                String[] split = new String(m70a(f261j[i])).split(",");
                String[][] strArr = (String[][]) Array.newInstance(String.class, new int[]{split.length / 5, 5});
                for (int i2 = 0; i2 < split.length; i2++) {
                    strArr[i2 / 5][i2 % 5] = split[i2];
                }
                for (int i3 = 0; i3 < strArr.length; i3++) {
                    int[] iArr = {i, Integer.parseInt(strArr[i3][1]), Integer.parseInt(strArr[i3][2]), Integer.parseInt(strArr[i3][3]), Integer.parseInt(strArr[i3][4])};
                    if (strArr[i3][0].equals("sleep_otona.png")) {
                        iArr = new int[]{i, Integer.parseInt(strArr[i3][1]), Integer.parseInt(strArr[i3][2]), Integer.parseInt(strArr[i3][3]), Integer.parseInt(strArr[i3][4]), Integer.parseInt(strArr[i3][3]) / 2, Integer.parseInt(strArr[i3][4]) / 2};
                    }
                    this.f389o.put(strArr[i3][0], iArr);
                    int[] iArr2 = (int[]) this.f389o.get(strArr[i3][0]);
                    Log.d(strArr[i3][0], iArr2[1] + "," + iArr2[2] + "," + iArr2[3] + "," + iArr2[4]);
                }
            }
        }
        m72e();
        if (this.f397w[0] == null) {
            this.f397w[0] = m69a(getApplicationContext(), "se01", false);
        }
        if (this.f397w[1] == null) {
            this.f397w[1] = m69a(getApplicationContext(), "se02_s", false);
        }
        if (this.f397w[2] == null) {
            this.f397w[2] = m69a(getApplicationContext(), "se02_m", false);
        }
        if (this.f397w[3] == null) {
            this.f397w[3] = m69a(getApplicationContext(), "se02_l", false);
        }
        if (this.f397w[4] == null) {
            this.f397w[4] = m69a(getApplicationContext(), "se03", false);
        }
        if (this.f397w[5] == null) {
            this.f397w[5] = m69a(getApplicationContext(), "l_cat01", false);
        }
        if (this.f397w[6] == null) {
            this.f397w[6] = m69a(getApplicationContext(), "m_cat02", false);
        }
        if (this.f397w[7] == null) {
            this.f397w[7] = m69a(getApplicationContext(), "m_cat03", false);
        }
        if (this.f397w[8] == null) {
            this.f397w[8] = m69a(getApplicationContext(), "s_cat02", false);
        }
        if (this.f397w[9] == null) {
            this.f397w[9] = m69a(getApplicationContext(), "s_cat03", false);
        }
        if (this.f397w[10] == null) {
            this.f397w[10] = m69a(getApplicationContext(), "trash", false);
        }
        if (this.f397w[11] == null) {
            this.f397w[11] = m69a(getApplicationContext(), "otona01", false);
        }
        if (this.f397w[12] == null) {
            this.f397w[12] = m69a(getApplicationContext(), "otona02", false);
        }
        if (this.f397w[13] == null) {
            this.f397w[13] = m69a(getApplicationContext(), "koneko01", false);
        }
        if (this.f397w[14] == null) {
            this.f397w[14] = m69a(getApplicationContext(), "koneko02", false);
        }
        if (this.f397w[15] == null) {
            this.f397w[15] = m69a(getApplicationContext(), "debu01", false);
        }
        if (this.f397w[16] == null) {
            this.f397w[16] = m69a(getApplicationContext(), "debu02", false);
        }
        if (this.f397w[17] == null) {
            this.f397w[17] = m69a(getApplicationContext(), "menu", false);
        }
        if (this.f397w[18] == null) {
            this.f397w[18] = m69a(getApplicationContext(), "tim2", true);
        }
        if (this.f397w[19] == null) {
            this.f397w[19] = m69a(getApplicationContext(), "rank01", false);
        }
        if (this.f397w[20] == null) {
            this.f397w[20] = m69a(getApplicationContext(), "rank02", false);
        }
        if (this.f397w[21] == null) {
            this.f397w[21] = m69a(getApplicationContext(), "rank03", false);
        }
        if (this.f397w[22] == null) {
            this.f397w[22] = m69a(getApplicationContext(), "rank04", false);
        }
        if (this.f397w[23] == null) {
            this.f397w[23] = m69a(getApplicationContext(), "rank05", false);
        }
        if (this.f397w[24] == null) {
            this.f397w[24] = m69a(getApplicationContext(), "rank06", false);
        }
        if (this.f397w[25] == null) {
            this.f397w[25] = m69a(getApplicationContext(), "rank07", false);
        }
        if (this.f397w[26] == null) {
            this.f397w[26] = m69a(getApplicationContext(), "rank08", false);
        }
        if (this.f397w[27] == null) {
            this.f397w[27] = m69a(getApplicationContext(), "rank09", false);
        }
        if (this.f397w[28] == null) {
            this.f397w[28] = m69a(getApplicationContext(), "rank10", false);
        }
        if (this.f397w[29] == null) {
            this.f397w[29] = m69a(getApplicationContext(), "rank11", false);
        }
        if (this.f397w[30] == null) {
            this.f397w[30] = m69a(getApplicationContext(), "rank12", false);
        }
        if (this.f397w[31] == null) {
            this.f397w[31] = m69a(getApplicationContext(), "rank13", false);
        }
        if (this.f397w[32] == null) {
            this.f397w[32] = m69a(getApplicationContext(), "rank14", false);
        }
        if (this.f397w[33] == null) {
            this.f397w[33] = m69a(getApplicationContext(), "rank15", false);
        }
        if (this.f397w[34] == null) {
            this.f397w[34] = m69a(getApplicationContext(), "rank16", false);
        }
        if (this.f397w[35] == null) {
            this.f397w[35] = m69a(getApplicationContext(), "rank17", false);
        }
        if (this.f397w[36] == null) {
            this.f397w[36] = m69a(getApplicationContext(), "whistle_gun", false);
        }
        if (this.f397w[37] == null) {
            this.f397w[37] = m69a(getApplicationContext(), "hi_mono", false);
        }
        if (this.f397w[38] == null) {
            this.f397w[38] = m69a(getApplicationContext(), "mid_mono", false);
        }
        this.f397w[0].mo38e();
        this.f397w[17].mo38e();
        this.f400z = new C0001a(this);
        this.f400z.mo6b();
        this.f400z.mo4a(this.f386l);
        this.f400z.mo9c();
        this.f400z.mo10c(this.f387m);
    }

    public void onTerminate() {
        super.onTerminate();
    }
}
