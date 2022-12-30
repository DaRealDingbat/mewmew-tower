package amazon.android.tsumineko.battle;

import android.content.DialogInterface;

/* renamed from: amazon.android.tsumineko.battle.c */
final class C0020c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0019b f439a;

    C0020c(C0019b bVar) {
        this.f439a = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f439a.f437a.f403a.mo139h();
        this.f439a.f437a.f404b.mo95d();
        this.f439a.f437a.f404b.mo89a();
        this.f439a.f437a.moveTaskToBack(true);
        this.f439a.f437a.finish();
    }
}
