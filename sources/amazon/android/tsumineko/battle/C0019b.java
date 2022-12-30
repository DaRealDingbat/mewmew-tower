package amazon.android.tsumineko.battle;

import amazon.android.tsumineko.R;
import amazon.android.tsumineko.game.gameover.GameOverMini;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.amazon.mas.kiwi.util.Base64;

/* renamed from: amazon.android.tsumineko.battle.b */
final class C0019b extends Handler {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public final /* synthetic */ BattleActivity f437a;

    /* renamed from: b */
    private final /* synthetic */ AlertDialog.Builder f438b;

    C0019b(BattleActivity battleActivity, AlertDialog.Builder builder) {
        this.f437a = battleActivity;
        this.f438b = builder;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f438b.setTitle("TEST1").setMessage("Hello, Wolrd!1").setPositiveButton("OK", (DialogInterface.OnClickListener) null).show();
                return;
            case Base64.ENCODE /*1*/:
                this.f437a.f403a.f532b = false;
                this.f438b.setTitle(this.f437a.getText(R.string.app_name));
                this.f438b.setMessage(this.f437a.getText(R.string.dlgEndGameMessage));
                this.f438b.setPositiveButton(this.f437a.getText(R.string.dlgEndGameBtnYes), new C0020c(this));
                this.f438b.setNegativeButton(this.f437a.getText(R.string.dlgEndGameBtnNo), new C0021d(this));
                this.f438b.show();
                return;
            case Base64.GZIP /*2*/:
                this.f437a.f403a.requestRender();
                return;
            case 3:
                this.f437a.f403a.mo139h();
                this.f437a.f404b.mo95d();
                Intent intent = new Intent(this.f437a, GameOverMini.class);
                intent.setFlags(67108864);
                this.f437a.startActivity(intent);
                return;
            default:
                return;
        }
    }
}
