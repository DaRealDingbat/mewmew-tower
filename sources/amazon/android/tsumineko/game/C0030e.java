package amazon.android.tsumineko.game;

import amazon.android.tsumineko.game.gameover.GameOver;
import android.content.Intent;

/* renamed from: amazon.android.tsumineko.game.e */
final class C0030e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0023a f587a;

    C0030e(C0023a aVar) {
        this.f587a = aVar;
    }

    public final void run() {
        Intent intent = new Intent(this.f587a.f565a, GameOver.class);
        intent.setFlags(67108864);
        this.f587a.f565a.startActivity(intent);
    }
}
