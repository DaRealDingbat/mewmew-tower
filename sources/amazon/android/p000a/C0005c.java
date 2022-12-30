package amazon.android.p000a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: amazon.android.a.c */
public final class C0005c {

    /* renamed from: a */
    C0004b f61a;

    /* renamed from: b */
    C0000a f62b;

    /* renamed from: c */
    boolean f63c = true;

    /* renamed from: d */
    float f64d = 1.0f;

    /* renamed from: e */
    float f65e = 1.0f;

    /* renamed from: f */
    float f66f = 1.0f;

    /* renamed from: g */
    float[] f67g;

    /* renamed from: h */
    float[] f68h;

    /* renamed from: i */
    ArrayList f69i;

    /* renamed from: j */
    ArrayList f70j;

    public C0005c(Bitmap bitmap, float f, float f2) {
        this.f61a = new C0004b((float) bitmap.getWidth(), (float) bitmap.getHeight());
        this.f62b = new C0000a(0.0f, 0.0f);
        this.f69i = new ArrayList();
        this.f70j = new ArrayList();
        this.f65e = f;
        this.f66f = f2;
        this.f67g = new float[4];
        this.f67g[0] = 0.0f;
        this.f67g[1] = 0.0f;
        this.f67g[2] = 1.0f;
        this.f67g[3] = 1.0f;
        this.f68h = new float[3];
        this.f68h[0] = 0.0f;
        this.f68h[1] = 0.0f;
        this.f68h[2] = 0.0f;
        mo17a(bitmap);
    }

    /* renamed from: a */
    public final C0000a mo16a() {
        return this.f62b;
    }

    /* renamed from: a */
    public final void mo17a(Bitmap bitmap) {
        this.f69i.add(bitmap);
    }

    /* renamed from: a */
    public final void mo18a(Canvas canvas, Paint paint) {
        if (this.f63c) {
            canvas.save();
            for (int i = 0; i < this.f69i.size(); i++) {
                Bitmap bitmap = (Bitmap) this.f69i.get(i);
                paint.setAlpha((int) (this.f64d * 255.0f));
                Matrix matrix = new Matrix();
                if (this.f68h != null) {
                    matrix.postRotate(this.f68h[2], this.f68h[0] + this.f62b.f0a, this.f68h[1] + this.f62b.f1b);
                }
                if (this.f67g != null) {
                    matrix.postScale(this.f67g[2], this.f67g[3], this.f67g[0] + this.f62b.f0a, this.f67g[1] + this.f62b.f1b);
                }
                canvas.concat(matrix);
                canvas.drawBitmap(bitmap, this.f62b.f0a, this.f62b.f1b, paint);
            }
            canvas.restore();
        }
    }

    /* renamed from: a */
    public final void mo19a(Canvas canvas, Paint paint, int i) {
        if (this.f63c) {
            int save = canvas.save();
            if (i >= 0 && this.f69i.size() > i) {
                Bitmap bitmap = (Bitmap) this.f69i.get(i);
                paint.setAlpha((int) (this.f64d * 255.0f));
                Matrix matrix = new Matrix();
                if (this.f68h != null) {
                    matrix.postRotate(this.f68h[2], this.f68h[0] + this.f62b.f0a, this.f68h[1] + this.f62b.f1b);
                }
                if (this.f67g != null) {
                    matrix.postScale(this.f67g[2], this.f67g[3], this.f67g[0] + this.f62b.f0a, this.f67g[1] + this.f62b.f1b);
                }
                canvas.concat(matrix);
                canvas.drawBitmap(bitmap, this.f62b.f0a, this.f62b.f1b, paint);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: b */
    public final C0004b mo20b() {
        return this.f61a;
    }

    /* renamed from: c */
    public final void mo21c() {
        if (this.f69i != null) {
            for (int size = this.f69i.size() - 1; size >= 0; size--) {
                ((Bitmap) this.f69i.get(size)).recycle();
                this.f69i.remove(size);
            }
        }
        this.f69i.clear();
        if (this.f70j != null) {
            for (int size2 = this.f70j.size() - 1; size2 >= 0; size2--) {
                this.f70j.get(size2);
                this.f70j.remove(size2);
            }
        }
        this.f70j.clear();
    }
}
