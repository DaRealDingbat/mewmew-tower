package com.google.ads;

import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.VideoView;
import com.google.ads.util.C0261b;
import java.lang.ref.WeakReference;

/* renamed from: com.google.ads.g */
public final class C0245g extends FrameLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {

    /* renamed from: a */
    public MediaController f1256a = null;

    /* renamed from: b */
    private WeakReference f1257b;

    /* renamed from: c */
    private C0246h f1258c;

    /* renamed from: d */
    private long f1259d = 0;

    /* renamed from: e */
    private VideoView f1260e;

    /* renamed from: f */
    private String f1261f = null;

    public C0245g(AdActivity adActivity, C0246h hVar) {
        super(adActivity);
        this.f1257b = new WeakReference(adActivity);
        this.f1258c = hVar;
        this.f1260e = new VideoView(adActivity);
        addView(this.f1260e, new FrameLayout.LayoutParams(-1, -1, 17));
        new C0270z(this).mo738a();
        this.f1260e.setOnCompletionListener(this);
        this.f1260e.setOnPreparedListener(this);
        this.f1260e.setOnErrorListener(this);
    }

    /* renamed from: a */
    public final void mo649a() {
        if (!TextUtils.isEmpty(this.f1261f)) {
            this.f1260e.setVideoPath(this.f1261f);
        } else {
            C0248j.m522a(this.f1258c, "onVideoEvent", "{'event': 'error', 'what': 'no_src'}");
        }
    }

    /* renamed from: a */
    public final void mo650a(int i) {
        this.f1260e.seekTo(i);
    }

    /* renamed from: a */
    public final void mo651a(MotionEvent motionEvent) {
        this.f1260e.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo652a(String str) {
        this.f1261f = str;
    }

    /* renamed from: a */
    public final void mo653a(boolean z) {
        AdActivity adActivity = (AdActivity) this.f1257b.get();
        if (adActivity == null) {
            C0261b.m582e("adActivity was null while trying to enable controls on a video.");
        } else if (z) {
            if (this.f1256a == null) {
                this.f1256a = new MediaController(adActivity);
            }
            this.f1260e.setMediaController(this.f1256a);
        } else {
            if (this.f1256a != null) {
                this.f1256a.hide();
            }
            this.f1260e.setMediaController((MediaController) null);
        }
    }

    /* renamed from: b */
    public final void mo654b() {
        this.f1260e.pause();
    }

    /* renamed from: c */
    public final void mo655c() {
        this.f1260e.start();
    }

    /* renamed from: d */
    public final void mo656d() {
        this.f1260e.stopPlayback();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo657e() {
        long currentPosition = (long) this.f1260e.getCurrentPosition();
        if (this.f1259d != currentPosition) {
            C0248j.m522a(this.f1258c, "onVideoEvent", "{'event': 'timeupdate', 'time': " + (((float) currentPosition) / 1000.0f) + "}");
            this.f1259d = currentPosition;
        }
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C0248j.m522a(this.f1258c, "onVideoEvent", "{'event': 'ended'}");
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C0261b.m582e("Video threw error! <what:" + i + ", extra:" + i2 + ">");
        C0248j.m522a(this.f1258c, "onVideoEvent", "{'event': 'error', 'what': '" + i + "', 'extra': '" + i2 + "'}");
        return true;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        C0248j.m522a(this.f1258c, "onVideoEvent", "{'event': 'canplaythrough', 'duration': '" + (((float) this.f1260e.getDuration()) / 1000.0f) + "'}");
    }
}
