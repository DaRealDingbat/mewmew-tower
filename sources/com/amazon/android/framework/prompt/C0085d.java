package com.amazon.android.framework.prompt;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: com.amazon.android.framework.prompt.d */
final class C0085d implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    private /* synthetic */ Prompt f966a;

    C0085d(Prompt prompt) {
        this.f966a = prompt;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 84;
    }
}
