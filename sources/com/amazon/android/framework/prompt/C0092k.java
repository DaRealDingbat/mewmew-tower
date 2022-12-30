package com.amazon.android.framework.prompt;

import android.content.DialogInterface;

/* renamed from: com.amazon.android.framework.prompt.k */
final class C0092k implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private /* synthetic */ int f979a;

    /* renamed from: b */
    private /* synthetic */ SimplePrompt f980b;

    C0092k(SimplePrompt simplePrompt, int i) {
        this.f980b = simplePrompt;
        this.f979a = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f980b.dismiss()) {
            this.f980b.doAction(this.f979a);
        }
    }
}
