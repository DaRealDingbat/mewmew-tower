package amazon.android.tsumineko.game;

import amazon.android.p000a.C0000a;
import amazon.android.p000a.C0004b;
import amazon.android.p000a.C0007e;
import amazon.android.p000a.C0011i;
import amazon.android.p000a.C0012j;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: amazon.android.tsumineko.game.h */
public abstract class C0036h implements C0007e {
    /* renamed from: a */
    public static int m171a(int i) {
        return (int) ((((float) i) * 2.5f) + 0.5f);
    }

    /* renamed from: a */
    public static int m172a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            return 0;
        }
    }

    /* renamed from: a */
    public static String m173a(Calendar calendar, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        if (calendar == null) {
            calendar = Calendar.getInstance();
        }
        return simpleDateFormat.format(calendar.getTime());
    }

    /* renamed from: b */
    public static int m174b(int i) {
        return (int) ((((float) i) * 2.666f) + 0.5f);
    }

    /* renamed from: c */
    public static C0000a m175c(float f, float f2) {
        return new C0000a(f, f2);
    }

    /* renamed from: h */
    public static int m176h() {
        int i;
        int c = (C0031f.m139c() % 420) + 1;
        if (168 >= c) {
            i = (c / 24) + 0;
            if (c % 24 != 0) {
                i++;
            }
        } else if (336 >= c) {
            int i2 = c - 168;
            i = (i2 / 28) + 7 + 0;
            if (i2 % 28 != 0) {
                i++;
            }
        } else {
            int i3 = c - 336;
            i = (i3 / 21) + 13;
            if (i3 % 21 != 0) {
                i++;
            }
        }
        return Math.abs(i - 1);
    }

    /* renamed from: a */
    public final C0037i mo213a(C0012j jVar, C0011i iVar, C0011i iVar2, int i, int i2) {
        return new C0037i(this, jVar, new C0000a((float) i, (float) i2), C0004b.m16a((float) jVar.f335g, (float) jVar.f336h), iVar, iVar2);
    }

    /* renamed from: a */
    public final C0037i mo214a(C0012j jVar, C0011i iVar, C0011i iVar2, int i, int i2, int i3, int i4) {
        return new C0037i(this, jVar, new C0000a((float) i, (float) i2), C0004b.m16a((float) i3, (float) i4), iVar, iVar2);
    }

    /* renamed from: a */
    public final C0038j mo215a(C0012j jVar, C0011i iVar, int i, int i2) {
        return new C0038j(this, jVar, new C0000a((float) i, (float) i2), C0004b.m16a((float) jVar.f335g, (float) jVar.f336h), iVar);
    }

    /* renamed from: a */
    public final C0038j mo216a(C0012j jVar, C0011i iVar, int i, int i2, int i3, int i4) {
        return new C0038j(this, jVar, new C0000a((float) i, (float) i2), C0004b.m16a((float) i3, (float) i4), iVar);
    }
}
