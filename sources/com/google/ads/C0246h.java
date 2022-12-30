package com.google.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0261b;
import java.lang.ref.WeakReference;

/* renamed from: com.google.ads.h */
public final class C0246h extends WebView {

    /* renamed from: a */
    private WeakReference f1262a = null;

    /* renamed from: b */
    private C0244f f1263b;

    public C0246h(Context context, C0244f fVar) {
        super(context);
        this.f1263b = fVar;
        setBackgroundColor(0);
        AdUtil.m555a((WebView) this);
        getSettings().setJavaScriptEnabled(true);
        setScrollBarStyle(0);
    }

    /* renamed from: a */
    public final void mo661a() {
        AdActivity b = mo663b();
        if (b != null) {
            b.finish();
        }
    }

    /* renamed from: a */
    public final void mo662a(AdActivity adActivity) {
        this.f1262a = new WeakReference(adActivity);
    }

    /* renamed from: b */
    public final AdActivity mo663b() {
        if (this.f1262a != null) {
            return (AdActivity) this.f1262a.get();
        }
        return null;
    }

    public final void destroy() {
        try {
            super.destroy();
        } catch (Exception e) {
            C0261b.m575a("An error occurred while destroying an AdWebView:", (Throwable) e);
        }
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception e) {
            C0261b.m575a("An error occurred while loading data in AdWebView:", (Throwable) e);
        }
    }

    public final void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception e) {
            C0261b.m575a("An error occurred while loading a URL in AdWebView:", (Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (isInEditMode()) {
            super.onMeasure(i, i2);
        } else if (this.f1263b == null) {
            super.onMeasure(i, i2);
        } else {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            float f = getContext().getResources().getDisplayMetrics().density;
            int a = (int) (((float) this.f1263b.mo646a()) * f);
            int b = (int) (((float) this.f1263b.mo647b()) * f);
            if (mode == 0 || mode2 == 0) {
                super.onMeasure(i, i2);
            } else if (((float) a) - (6.0f * f) > ((float) size) || b > size2) {
                C0261b.m582e("Not enough space to show ad! Wants: <" + a + ", " + b + ">, Has: <" + size + ", " + size2 + ">");
                setVisibility(8);
                setMeasuredDimension(0, 0);
            } else {
                super.onMeasure(i, i2);
            }
        }
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            C0261b.m575a("An error occurred while stopping loading in AdWebView:", (Throwable) e);
        }
    }
}
