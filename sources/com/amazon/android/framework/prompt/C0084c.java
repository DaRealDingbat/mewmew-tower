package com.amazon.android.framework.prompt;

import com.amazon.android.framework.task.Task;

/* renamed from: com.amazon.android.framework.prompt.c */
final class C0084c implements Task {

    /* renamed from: a */
    private /* synthetic */ Prompt f965a;

    C0084c(Prompt prompt) {
        this.f965a = prompt;
    }

    public final void execute() {
        this.f965a.dismiss();
    }

    public final String toString() {
        return "DismissPromptTask: " + this.f965a.toString();
    }
}
