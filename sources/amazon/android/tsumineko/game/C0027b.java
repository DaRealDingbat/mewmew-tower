package amazon.android.tsumineko.game;

import android.content.DialogInterface;

/* renamed from: amazon.android.tsumineko.game.b */
final class C0027b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0023a f584a;

    C0027b(C0023a aVar) {
        this.f584a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f584a.f565a.f563i.mo139h();
        this.f584a.f565a.f555a.mo95d();
        this.f584a.f565a.f555a.mo89a();
        this.f584a.f565a.moveTaskToBack(true);
        this.f584a.f565a.finish();
    }
}
