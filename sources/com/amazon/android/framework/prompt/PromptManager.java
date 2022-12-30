package com.amazon.android.framework.prompt;

import android.app.Activity;
import android.app.Dialog;
import com.amazon.android.p010h.C0139d;

public interface PromptManager extends C0139d {
    Dialog onCreateDialog(Activity activity, int i);

    void onWindowFocusChanged(Activity activity, boolean z);

    void present(Prompt prompt);
}
