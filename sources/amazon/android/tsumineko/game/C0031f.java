package amazon.android.tsumineko.game;

import amazon.android.p000a.C0006d;
import java.util.Random;

/* renamed from: amazon.android.tsumineko.game.f */
public final class C0031f {

    /* renamed from: a */
    public static final float f588a = (C0006d.f75E - 116.0f);

    /* renamed from: b */
    public static final float f589b = (C0006d.f76F - 38.0f);

    /* renamed from: c */
    public static final float f590c = (C0006d.f76F - 65.0f);

    /* renamed from: d */
    public static Random f591d;

    /* renamed from: a */
    public static void m137a() {
        f591d = new Random(System.currentTimeMillis());
    }

    /* renamed from: b */
    public static float m138b() {
        if (f591d == null) {
            m137a();
        }
        return Math.abs(f591d.nextFloat() % 1.0f);
    }

    /* renamed from: c */
    public static int m139c() {
        if (f591d == null) {
            m137a();
        }
        return Math.abs(f591d.nextInt());
    }
}
