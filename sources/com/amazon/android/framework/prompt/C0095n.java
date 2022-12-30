package com.amazon.android.framework.prompt;

import android.content.DialogInterface;

/* renamed from: com.amazon.android.framework.prompt.n */
final class C0095n implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private /* synthetic */ SimplePrompt f984a;

    C0095n(SimplePrompt simplePrompt) {
        this.f984a = simplePrompt;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f984a.dismiss()) {
            this.f984a.doAction(0);
        }
    }
}
