package amazon.android.tsumineko.game.rank;

import java.util.TimerTask;

/* renamed from: amazon.android.tsumineko.game.rank.a */
final class C0040a extends TimerTask {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public final /* synthetic */ RankActivity f881a;

    C0040a(RankActivity rankActivity) {
        this.f881a = rankActivity;
    }

    public final void run() {
        this.f881a.f866g = this.f881a.f866g == 0 ? 4 : 0;
        if (this.f881a.f867h != null) {
            this.f881a.f867h.getHandler().post(new C0041b(this));
        }
        if (this.f881a.f868i != null) {
            this.f881a.f868i.getHandler().post(new C0042c(this));
        }
        if (this.f881a.f869j != null) {
            this.f881a.f869j.getHandler().post(new C0043d(this));
        }
        if (this.f881a.f870k != null) {
            this.f881a.f870k.getHandler().post(new C0044e(this));
        }
        if (this.f881a.f871l != null) {
            this.f881a.f871l.getHandler().post(new C0045f(this));
        }
    }
}
