package com.amazon.android.framework.prompt;

import com.amazon.android.framework.task.Task;

/* renamed from: com.amazon.android.framework.prompt.h */
final class C0089h implements Task {

    /* renamed from: a */
    private /* synthetic */ Prompt f975a;

    /* renamed from: b */
    private /* synthetic */ PromptManagerImpl f976b;

    C0089h(PromptManagerImpl promptManagerImpl, Prompt prompt) {
        this.f976b = promptManagerImpl;
        this.f975a = prompt;
    }

    public final void execute() {
        this.f976b.removeExpiredPrompt(this.f975a);
    }

    public final String toString() {
        return "PromptManager:removeExpiredPrompt: " + this.f975a;
    }
}
