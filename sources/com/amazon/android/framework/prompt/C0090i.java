package com.amazon.android.framework.prompt;

import android.content.DialogInterface;

/* renamed from: com.amazon.android.framework.prompt.i */
final class C0090i implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private /* synthetic */ SimplePrompt f977a;

    C0090i(SimplePrompt simplePrompt) {
        this.f977a = simplePrompt;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f977a.dismiss()) {
            this.f977a.doAction(1);
        }
    }
}
