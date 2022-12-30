package amazon.android.p000a;

import amazon.android.tsumineko.TsumiNekoPadAppDelegate;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.SoundPool;

/* renamed from: amazon.android.a.h */
public final class C0010h {

    /* renamed from: a */
    public int f280a = 1;

    /* renamed from: b */
    int f281b = 1;

    /* renamed from: c */
    int f282c;

    /* renamed from: d */
    SoundPool f283d;

    /* renamed from: e */
    MediaPlayer f284e;

    /* renamed from: f */
    Context f285f;

    /* renamed from: g */
    int f286g;

    /* renamed from: h */
    TsumiNekoPadAppDelegate f287h;

    /* renamed from: i */
    int f288i;

    /* renamed from: j */
    int f289j = 0;

    /* renamed from: k */
    boolean f290k = false;

    public C0010h(Context context, int i, boolean z) {
        this.f287h = (TsumiNekoPadAppDelegate) context;
        if (z) {
            this.f284e = MediaPlayer.create(context, i);
        } else {
            this.f283d = new SoundPool(this.f281b, 3, 0);
        }
        this.f285f = context;
        this.f286g = i;
    }

    /* renamed from: a */
    public final void mo33a() {
        if (((this.f287h == null || this.f287h.f386l == null || !this.f287h.f386l.containsKey("sound")) ? true : ((Integer) this.f287h.f386l.get("sound")).intValue() == 1) && this.f290k) {
            if (this.f284e != null) {
                if (this.f289j == -1) {
                    this.f284e.setLooping(true);
                }
                try {
                    this.f284e.prepare();
                } catch (Exception e) {
                }
                this.f284e.start();
            } else if (this.f283d != null) {
                this.f288i = this.f283d.play(this.f282c, 1.0f, 1.0f, 0, this.f289j, 1.0f);
            }
        }
    }

    /* renamed from: a */
    public final void mo34a(int i) {
        this.f289j = i;
    }

    /* renamed from: b */
    public final void mo35b() {
        if (this.f284e != null) {
            if (this.f284e.isPlaying()) {
                this.f284e.stop();
                this.f284e.prepareAsync();
                this.f284e.seekTo(0);
            }
        } else if (this.f283d != null) {
            this.f283d.stop(this.f288i);
            this.f283d.unload(this.f282c);
            this.f283d.release();
            this.f283d = new SoundPool(this.f281b, 3, 0);
            this.f282c = this.f283d.load(this.f285f, this.f286g, 1);
        }
    }

    /* renamed from: c */
    public final void mo36c() {
        if (this.f284e != null) {
            mo35b();
            this.f284e.release();
        } else if (this.f283d != null) {
            this.f283d.unload(this.f282c);
            this.f283d.release();
        }
        this.f290k = false;
    }

    /* renamed from: d */
    public final void mo37d() {
        try {
            if (this.f290k) {
                if (this.f284e == null && this.f283d != null) {
                    this.f283d.unload(this.f282c);
                    this.f283d.release();
                    this.f283d = new SoundPool(this.f281b, 3, 0);
                }
                this.f290k = false;
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: e */
    public final void mo38e() {
        try {
            if (!this.f290k) {
                if (this.f284e == null && this.f283d != null) {
                    this.f282c = this.f283d.load(this.f285f, this.f286g, 1);
                }
                this.f290k = true;
            }
        } catch (Exception e) {
        }
    }
}
