package com.amazon.android.framework.prompt;

import android.content.DialogInterface;

/* renamed from: com.amazon.android.framework.prompt.l */
final class C0093l implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private /* synthetic */ SimplePrompt f981a;

    C0093l(SimplePrompt simplePrompt) {
        this.f981a = simplePrompt;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f981a.dismiss()) {
            this.f981a.doAction();
        }
    }
}
