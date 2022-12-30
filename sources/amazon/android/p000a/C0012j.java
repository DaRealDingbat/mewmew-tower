package amazon.android.p000a;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: amazon.android.a.j */
public final class C0012j {

    /* renamed from: a */
    public float f329a;

    /* renamed from: b */
    public float f330b;

    /* renamed from: c */
    public int f331c;

    /* renamed from: d */
    public C0004b f332d;

    /* renamed from: e */
    public float f333e;

    /* renamed from: f */
    public float f334f;

    /* renamed from: g */
    public int f335g;

    /* renamed from: h */
    public int f336h;

    /* renamed from: i */
    public float f337i = 0.0f;

    /* renamed from: j */
    public float f338j = 0.0f;

    /* renamed from: k */
    public float f339k = 0.0f;

    /* renamed from: l */
    public float f340l = 0.0f;

    /* renamed from: m */
    public int f341m;

    /* renamed from: n */
    public int f342n = 1;

    /* renamed from: o */
    FloatBuffer f343o;

    /* renamed from: p */
    FloatBuffer f344p;

    /* renamed from: q */
    FloatBuffer f345q;

    /* renamed from: r */
    public int[][] f346r = null;

    /* renamed from: s */
    private GL10 f347s;

    /* renamed from: a */
    public static C0012j m46a(GL10 gl10, C0013k[] kVarArr, int[] iArr, int i) {
        C0012j jVar = new C0012j();
        if (kVarArr == null || iArr == null) {
            try {
                jVar.mo45a();
                Log.e("Texture2D", "NULL Error!!!!");
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                Log.d("Texture2D", "Make atras=[" + iArr[0] + "," + iArr[1] + "," + iArr[2] + "," + iArr[3] + "]");
                Log.e("Texture2D", "Error!!!! atras=[" + kVarArr[0] + "," + kVarArr[1] + "," + kVarArr[2] + kVarArr[3] + "] data=" + iArr);
                return jVar;
            }
        } else {
            C0004b a = C0004b.m16a((float) iArr[3], (float) iArr[4]);
            C0004b a2 = iArr.length >= 6 ? C0004b.m16a((float) iArr[5], (float) iArr[6]) : a;
            jVar.f329a = a.f59a;
            jVar.f330b = a.f60b;
            int i2 = (int) a.f59a;
            int i3 = (int) a.f60b;
            C0013k kVar = kVarArr[iArr[0]];
            C0000a aVar = new C0000a((float) iArr[1], (float) iArr[2]);
            jVar.f347s = gl10;
            jVar.f341m = i;
            jVar.f331c = kVar.f350b;
            aVar.f0a += 0.5f;
            aVar.f1b += 0.5f;
            a2.f59a -= 0.5f;
            a2.f60b -= 0.5f;
            if (kVar.f362n > 0 && kVar.f363o > 0) {
                jVar.f337i = aVar.f0a / ((float) kVar.f362n);
                jVar.f338j = aVar.f1b / ((float) kVar.f363o);
                jVar.f339k = a2.f59a / ((float) kVar.f362n);
                jVar.f340l = a2.f60b / ((float) kVar.f363o);
            }
            jVar.f332d = a;
            jVar.f335g = (int) a.f59a;
            jVar.f336h = (int) a.f60b;
            jVar.f333e = 1.0f;
            jVar.f334f = 1.0f;
            jVar.f344p = m47a(new float[]{0.001f, jVar.f334f - 0.001f, jVar.f333e - 0.001f, jVar.f334f - 0.001f, 0.001f, 0.001f, jVar.f333e - 0.001f, 0.001f});
            jVar.f345q = m47a(new float[]{jVar.f333e, jVar.f334f, 0.0f, jVar.f334f, jVar.f333e, 0.0f, 0.0f, 0.0f});
            jVar.f343o = m47a(new float[]{(-jVar.f329a) / 2.0f, (-jVar.f330b) / 2.0f, 0.0f, jVar.f329a / 2.0f, (-jVar.f330b) / 2.0f, 0.0f, (-jVar.f329a) / 2.0f, jVar.f330b / 2.0f, 0.0f, jVar.f329a / 2.0f, jVar.f330b / 2.0f, 0.0f});
            Log.d("Texture2D", "Make tex=" + iArr[0] + " ok[" + i2 + "," + i3 + " aw:" + a2.f59a + " ah:" + a2.f60b + "]");
            return jVar;
        }
    }

    /* renamed from: a */
    private static FloatBuffer m47a(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    /* renamed from: d */
    private void m48d() {
        int i = 10497;
        this.f347s.glPushMatrix();
        this.f347s.glEnable(3042);
        this.f347s.glDisable(2929);
        this.f347s.glBindTexture(3553, this.f331c);
        this.f347s.glEnable(3553);
        this.f347s.glEnableClientState(32888);
        this.f347s.glTexParameterf(3553, 6406, 3413.0f);
        if (this.f342n == 0) {
            this.f347s.glBlendFunc(770, 771);
        } else {
            this.f347s.glBlendFunc(1, 771);
        }
        this.f347s.glTexParameterf(3553, 10241, 9728.0f);
        this.f347s.glTexParameterf(3553, 10240, 9729.0f);
        this.f347s.glTexParameterx(3553, 10242, this.f341m == 0 ? 10497 : 33071);
        GL10 gl10 = this.f347s;
        if (this.f341m != 0) {
            i = 33071;
        }
        gl10.glTexParameterx(3553, 10243, i);
        this.f347s.glMatrixMode(5890);
        this.f347s.glLoadIdentity();
        this.f347s.glTranslatef(this.f337i, this.f338j, 0.0f);
        this.f347s.glScalef(this.f339k, this.f340l, 1.0f);
        this.f347s.glMatrixMode(5888);
        this.f347s.glPopMatrix();
    }

    /* renamed from: e */
    private void m49e() {
        this.f347s.glBindTexture(3553, 0);
        this.f347s.glDisable(3553);
        this.f347s.glDisableClientState(32888);
    }

    /* renamed from: a */
    public final void mo45a() {
        if (this.f346r != null) {
            for (int i = 0; i < this.f346r.length; i++) {
                if (this.f346r[i] != null) {
                    this.f346r[i] = null;
                }
            }
            this.f346r = null;
        }
        if (this.f343o != null) {
            this.f343o.clear();
            this.f343o = null;
        }
        if (this.f344p != null) {
            this.f344p.clear();
            this.f344p = null;
        }
        if (this.f345q != null) {
            this.f345q.clear();
            this.f345q = null;
        }
    }

    /* renamed from: a */
    public final void mo46a(float f) {
        m48d();
        this.f347s.glTexCoordPointer(2, 5126, 0, this.f344p);
        this.f347s.glPushMatrix();
        this.f347s.glScalef(f, f, 1.0f);
        this.f347s.glVertexPointer(3, 5126, 0, this.f343o);
        this.f347s.glEnableClientState(32884);
        this.f347s.glDrawArrays(5, 0, 4);
        this.f347s.glPopMatrix();
        m49e();
    }

    /* renamed from: a */
    public final void mo47a(float f, float f2) {
        m48d();
        this.f347s.glTexCoordPointer(2, 5126, 0, this.f344p);
        this.f347s.glPushMatrix();
        this.f347s.glScalef(f, f2, 1.0f);
        this.f347s.glVertexPointer(3, 5126, 0, this.f343o);
        this.f347s.glEnableClientState(32884);
        this.f347s.glDrawArrays(5, 0, 4);
        this.f347s.glPopMatrix();
        m49e();
    }

    /* renamed from: a */
    public final void mo48a(C0000a aVar) {
        m48d();
        this.f347s.glTexCoordPointer(2, 5126, 0, this.f344p);
        this.f347s.glPushMatrix();
        this.f347s.glTranslatef(aVar.f0a, aVar.f1b, 0.0f);
        this.f347s.glVertexPointer(3, 5126, 0, this.f343o);
        this.f347s.glEnableClientState(32884);
        this.f347s.glDrawArrays(5, 0, 4);
        this.f347s.glPopMatrix();
        m49e();
    }

    /* renamed from: a */
    public final void mo49a(C0000a aVar, float f) {
        m48d();
        this.f347s.glPushMatrix();
        this.f347s.glTranslatef(aVar.f0a, aVar.f1b, 0.0f);
        this.f347s.glScalef(f, f, 1.0f);
        this.f347s.glTexCoordPointer(2, 5126, 0, this.f344p);
        this.f347s.glVertexPointer(3, 5126, 0, this.f343o);
        this.f347s.glEnableClientState(32884);
        this.f347s.glDrawArrays(5, 0, 4);
        this.f347s.glPopMatrix();
        m49e();
    }

    /* renamed from: b */
    public final void mo50b() {
        m48d();
        this.f347s.glTexCoordPointer(2, 5126, 0, this.f344p);
        this.f347s.glVertexPointer(3, 5126, 0, this.f343o);
        this.f347s.glEnableClientState(32884);
        this.f347s.glDrawArrays(5, 0, 4);
        m49e();
    }

    /* renamed from: c */
    public final void mo51c() {
        m48d();
        this.f347s.glTexCoordPointer(2, 5126, 0, this.f345q);
        this.f347s.glVertexPointer(3, 5126, 0, this.f343o);
        this.f347s.glEnableClientState(32884);
        this.f347s.glDrawArrays(5, 0, 4);
        m49e();
    }
}
