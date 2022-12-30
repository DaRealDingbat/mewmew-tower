package com.amazon.android.framework.prompt;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.amazon.android.framework.context.ContextManager;

/* renamed from: com.amazon.android.framework.prompt.g */
final class C0088g extends AsyncTask {

    /* renamed from: a */
    private final Context f973a;

    /* renamed from: b */
    private final ContextManager f974b;

    /* synthetic */ C0088g(Context context, ContextManager contextManager) {
        this(context, contextManager, (byte) 0);
    }

    private C0088g(Context context, ContextManager contextManager, byte b) {
        this.f973a = context;
        this.f974b = contextManager;
    }

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f973a.startActivity(((Intent[]) objArr)[0]);
        return null;
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        C0086e.m253b();
    }
}
