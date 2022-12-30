package amazon.android.p000a;

import amazon.android.tsumineko.game.EAGLView;

/* renamed from: amazon.android.a.g */
public final class C0009g extends C0008f {
    public C0009g(EAGLView eAGLView) {
        super(eAGLView);
    }

    /* renamed from: a */
    public final void mo23a(int i) {
        float f = ((float) this.f273j) / 1280.0f;
        if (i != 0) {
            this.f264a.glRotatef(0.0f, 0.0f, 0.0f, 0.0f);
            this.f264a.glTranslatef(0.0f, 0.0f, 0.0f);
            this.f264a.glViewport(0, (int) (((((float) this.f274k) - 2.0f) / 2.0f) - (800.0f * f)), (int) (1280.0f * f), (int) (f * 800.0f));
            this.f264a.glMatrixMode(5889);
            this.f264a.glLoadIdentity();
            this.f264a.glOrthof(0.0f, 1280.0f, 0.0f, 800.0f, 0.5f, -0.5f);
            this.f264a.glMatrixMode(5888);
            this.f264a.glLoadIdentity();
            this.f264a.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
            this.f264a.glTranslatef(-800.0f, 0.0f, 0.0f);
        } else {
            this.f264a.glRotatef(0.0f, 0.0f, 0.0f, 0.0f);
            this.f264a.glTranslatef(0.0f, 0.0f, 0.0f);
            this.f264a.glViewport(0, (int) ((((float) this.f274k) / 2.0f) + 1.0f), (int) (1280.0f * f), (int) (f * 800.0f));
            this.f264a.glMatrixMode(5889);
            this.f264a.glLoadIdentity();
            this.f264a.glOrthof(0.0f, 1280.0f, 0.0f, 800.0f, 0.5f, -0.5f);
            this.f264a.glMatrixMode(5888);
            this.f264a.glLoadIdentity();
            this.f264a.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
            this.f264a.glTranslatef(0.0f, -1280.0f, 0.0f);
        }
        this.f264a.glBlendFunc(1, 771);
        this.f264a.glEnable(3553);
        this.f264a.glEnableClientState(32884);
        this.f264a.glEnableClientState(32888);
        this.f264a.glBlendFunc(770, 771);
    }

    /* renamed from: d */
    public final void mo28d() {
    }
}
