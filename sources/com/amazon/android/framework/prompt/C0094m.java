package com.amazon.android.framework.prompt;

import com.amazon.android.framework.task.Task;

/* renamed from: com.amazon.android.framework.prompt.m */
final class C0094m implements Task {

    /* renamed from: a */
    private /* synthetic */ Prompt f982a;

    /* renamed from: b */
    private /* synthetic */ PromptManagerImpl f983b;

    C0094m(PromptManagerImpl promptManagerImpl, Prompt prompt) {
        this.f983b = promptManagerImpl;
        this.f982a = prompt;
    }

    public final void execute() {
        this.f983b.presentImpl(this.f982a);
    }

    public final String toString() {
        return "Prompt Presentation on Main Thread: " + this.f982a + ", " + this.f982a.getExpiration();
    }
}
