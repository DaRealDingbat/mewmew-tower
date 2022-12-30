package amazon.android.tsumineko.game;

import amazon.android.tsumineko.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.amazon.mas.kiwi.util.Base64;

/* renamed from: amazon.android.tsumineko.game.a */
final class C0023a extends Handler {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public final /* synthetic */ GameActivity f565a;

    /* renamed from: b */
    private final /* synthetic */ AlertDialog.Builder f566b;

    C0023a(GameActivity gameActivity, AlertDialog.Builder builder) {
        this.f565a = gameActivity;
        this.f566b = builder;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f566b.setTitle(this.f565a.getText(R.string.app_name)).setMessage("Can not load resources.").setPositiveButton("OK", (DialogInterface.OnClickListener) null).show();
                return;
            case Base64.ENCODE /*1*/:
                this.f565a.f563i.f532b = false;
                this.f566b.setTitle(this.f565a.getText(R.string.app_name));
                this.f566b.setMessage(this.f565a.getText(R.string.dlgEndGameMessage));
                this.f566b.setPositiveButton(this.f565a.getText(R.string.dlgEndGameBtnYes), new C0027b(this));
                this.f566b.setNegativeButton(this.f565a.getText(R.string.dlgEndGameBtnNo), new C0028c(this));
                this.f566b.show();
                return;
            case Base64.GZIP /*2*/:
                this.f565a.f563i.requestRender();
                return;
            case 3:
                Log.d("GameActivity", "GAME_END OK");
                new Handler().postDelayed(new C0029d(this), 100);
                this.f565a.f555a.mo95d();
                new Handler().postDelayed(new C0030e(this), 100);
                return;
            default:
                return;
        }
    }
}
