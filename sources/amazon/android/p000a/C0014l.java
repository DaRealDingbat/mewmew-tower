package amazon.android.p000a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: amazon.android.a.l */
public final class C0014l {
    /* renamed from: a */
    public static Bitmap m61a(Context context, int i) {
        return BitmapFactory.decodeResource(context.getResources(), i);
    }

    /* renamed from: a */
    public static Bitmap m62a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(height, width, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.rotate(90.0f, 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, (float) (-height), (Paint) null);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m63a(Bitmap bitmap, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        bitmapDrawable.setBounds(0, 0, i, i2);
        bitmapDrawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: b */
    public static Bitmap m64b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getHeight(), width, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.rotate(270.0f, 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, (float) (-width), 0.0f, (Paint) null);
        return createBitmap;
    }
}
