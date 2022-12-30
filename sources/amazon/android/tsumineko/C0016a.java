package amazon.android.tsumineko;

import android.content.DialogInterface;

/* renamed from: amazon.android.tsumineko.a */
final class C0016a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TsumiNekoAndActivity f401a;

    C0016a(TsumiNekoAndActivity tsumiNekoAndActivity) {
        this.f401a = tsumiNekoAndActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f401a.finish();
    }
}
