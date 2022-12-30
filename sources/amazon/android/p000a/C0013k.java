package amazon.android.p000a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: amazon.android.a.k */
public final class C0013k {

    /* renamed from: r */
    private static BitmapFactory.Options f348r = null;

    /* renamed from: a */
    final String f349a = "image/texture/";

    /* renamed from: b */
    public int f350b = 0;

    /* renamed from: c */
    public int f351c = 0;

    /* renamed from: d */
    public String f352d;

    /* renamed from: e */
    public Bitmap f353e;

    /* renamed from: f */
    public boolean f354f = false;

    /* renamed from: g */
    public boolean f355g = false;

    /* renamed from: h */
    public boolean f356h = false;

    /* renamed from: i */
    public boolean f357i = false;

    /* renamed from: j */
    public float f358j = 0.0f;

    /* renamed from: k */
    public float f359k = 0.0f;

    /* renamed from: l */
    public float f360l = 0.0f;

    /* renamed from: m */
    public float f361m = 0.0f;

    /* renamed from: n */
    public int f362n = 0;

    /* renamed from: o */
    public int f363o = 0;

    /* renamed from: p */
    public boolean f364p = false;

    /* renamed from: q */
    public ArrayList f365q;

    public C0013k(String str) {
        this.f352d = str;
        this.f365q = new ArrayList();
    }

    /* renamed from: a */
    private static Bitmap m57a(Context context, String str) {
        try {
            if (f348r == null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                f348r = options;
                options.inScaled = true;
                f348r.inPreferredConfig = Bitmap.Config.RGB_565;
            }
            InputStream open = context.getAssets().open("image/texture/" + str);
            Log.i("Texture2D", "Load from asset " + str + " ok.");
            return BitmapFactory.decodeStream(open, (Rect) null, f348r);
        } catch (Exception e) {
            Log.e("Texture2D", "Can not load from asset " + str + " err=" + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public final Bitmap mo52a() {
        return this.f353e;
    }

    /* renamed from: a */
    public final boolean mo53a(Context context) {
        if (!this.f354f) {
            if (context == null) {
                return false;
            }
            if (this.f352d != null) {
                this.f353e = m57a(context, this.f352d);
                if (this.f353e != null) {
                    this.f362n = this.f353e.getWidth();
                    this.f363o = this.f353e.getHeight();
                    Log.v("Texture2D", "load Bitmap(" + this.f362n + "," + this.f363o + ")");
                    this.f354f = true;
                }
            }
        }
        return this.f354f;
    }

    /* renamed from: b */
    public final void mo54b() {
        if (this.f353e != null) {
            this.f353e.recycle();
            this.f353e = null;
        }
    }
}
