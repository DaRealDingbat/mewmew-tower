package com.amazon.android.p005c;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.amazon.android.c.c */
final class C0064c implements FilenameFilter {

    /* renamed from: a */
    private /* synthetic */ C0062a f919a;

    C0064c(C0062a aVar) {
        this.f919a = aVar;
    }

    public final boolean accept(File file, String str) {
        return str.endsWith(".amzst") && !this.f919a.f916e.containsValue(str);
    }
}
