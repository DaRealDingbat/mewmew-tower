package amazon.android.p000a;

import amazon.android.tsumineko.game.EAGLView;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.util.Log;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11ExtensionPack;

/* renamed from: amazon.android.a.f */
public class C0008f implements GLSurfaceView.Renderer {

    /* renamed from: q */
    private static FloatBuffer f263q;

    /* renamed from: a */
    GL10 f264a = null;

    /* renamed from: b */
    GL11ExtensionPack f265b = null;

    /* renamed from: c */
    int f266c;

    /* renamed from: d */
    IntBuffer f267d;

    /* renamed from: e */
    IntBuffer f268e;

    /* renamed from: f */
    IntBuffer f269f;

    /* renamed from: g */
    IntBuffer f270g;

    /* renamed from: h */
    Rect f271h;

    /* renamed from: i */
    public boolean f272i = true;

    /* renamed from: j */
    public int f273j;

    /* renamed from: k */
    public int f274k;

    /* renamed from: l */
    private boolean f275l = true;

    /* renamed from: m */
    private long f276m = 0;

    /* renamed from: n */
    private float f277n = 0.0f;

    /* renamed from: o */
    private long f278o;

    /* renamed from: p */
    private EAGLView f279p;

    public C0008f(EAGLView eAGLView) {
        this.f279p = eAGLView;
        this.f267d = IntBuffer.allocate(4);
        this.f268e = IntBuffer.allocate(4);
        this.f269f = IntBuffer.allocate(4);
        this.f270g = IntBuffer.allocate(4);
        FloatBuffer allocate = FloatBuffer.allocate(16);
        f263q = allocate;
        allocate.position(0);
        f263q.put(0.0f);
        f263q.put(0.0f);
        f263q.put(0.0f);
        f263q.put(0.0f);
        f263q.position(0);
    }

    /* renamed from: a */
    private void m23a(GL10 gl10) {
        try {
            this.f264a = gl10;
            this.f265b = (GL11ExtensionPack) gl10;
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public final GL10 mo22a() {
        return this.f264a;
    }

    /* renamed from: a */
    public void mo23a(int i) {
    }

    /* renamed from: a */
    public final void mo24a(Rect rect) {
        this.f271h = rect;
    }

    /* renamed from: a */
    public final boolean mo25a(C0013k kVar) {
        if (kVar == null) {
            return false;
        }
        try {
            int[] iArr = new int[1];
            this.f264a.glGenTextures(1, iArr, 0);
            kVar.f350b = iArr[0];
            this.f264a.glBindTexture(3553, kVar.f350b);
            GLUtils.texImage2D(3553, 0, kVar.mo52a(), 0);
            this.f264a.glBindTexture(3553, 0);
            return true;
        } catch (Exception e) {
            Log.e("EAGLRenderer", "genTexture Error. " + e.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public final Object mo26b() {
        this.f266c = 0;
        return this;
    }

    /* renamed from: c */
    public final boolean mo27c() {
        try {
            Log.e("ES1Renderer", "resizeFromLayer(layer)");
            if (this.f268e != null) {
                this.f265b.glBindRenderbufferOES(36161, this.f268e.get(0));
            }
            this.f265b.glGetRenderbufferParameterivOES(36161, 36162, this.f269f);
            this.f265b.glGetRenderbufferParameterivOES(36161, 36163, this.f270g);
            if (this.f265b.glCheckFramebufferStatusOES(36160) != 36053) {
                Log.d("Failed 2 to make complete framebuffer object ", new StringBuilder().append(this.f265b.glCheckFramebufferStatusOES(36160)).toString());
                this.f265b.glCheckFramebufferStatusOES(36160);
                return false;
            }
        } catch (Exception e) {
            Log.e("ES1Renderer", "resizeFromLayer error");
        }
        return true;
    }

    /* renamed from: d */
    public void mo28d() {
        this.f264a.glEnable(3553);
        this.f264a.glEnableClientState(32884);
        this.f264a.glEnableClientState(32888);
        this.f264a.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        this.f264a.glDisableClientState(32886);
        this.f264a.glDisable(2903);
        this.f264a.glClear(16640);
        this.f264a.glBlendFunc(770, 771);
        this.f264a.glEnable(7425);
        this.f264a.glEnable(3024);
        this.f264a.glHint(3152, 4354);
        this.f264a.glMaterialfv(1032, 5632, f263q);
        this.f264a.glMaterialfv(1032, 4610, f263q);
        this.f264a.glMaterialfv(1032, 4608, f263q);
        this.f264a.glMaterialfv(1032, 4609, f263q);
        this.f264a.glMaterialf(1032, 5633, 80.0f);
    }

    /* renamed from: e */
    public final void mo29e() {
        this.f272i = true;
    }

    public void onDrawFrame(GL10 gl10) {
        m23a(gl10);
        if (this.f279p != null) {
            this.f264a.glMatrixMode(5889);
            this.f264a.glLoadIdentity();
            this.f264a.glOrthof(0.0f, 800.0f, 0.0f, 1280.0f, 0.5f, -0.5f);
            this.f264a.glMatrixMode(5888);
            this.f264a.glLoadIdentity();
            this.f279p.mo132d();
        }
        this.f276m++;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.f278o;
        if (j >= 5000) {
            this.f277n = ((float) this.f276m) / (((float) j) / 1000.0f);
            this.f278o = currentTimeMillis;
            this.f276m = 0;
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        m23a(gl10);
        Log.e("ES1Renderer", "onSurfaceChanged");
        if (this.f279p != null) {
            this.f279p.mo130c();
        }
        this.f264a.glViewport(0, 0, i, i2);
        this.f273j = i;
        this.f274k = i2;
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        m23a(gl10);
        Log.e("ES1Renderer", "onSurfaceCreated");
    }
}
