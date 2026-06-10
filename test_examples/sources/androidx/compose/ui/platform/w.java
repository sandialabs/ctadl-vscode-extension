package androidx.compose.ui.platform;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class w implements Choreographer.FrameCallback {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ja.i<Object> f3914i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u7.l<Long, Object> f3915j;

    public w(ja.j jVar, x xVar, u7.l lVar) {
        this.f3914i = jVar;
        this.f3915j = lVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        Object Q;
        try {
            Q = this.f3915j.U(Long.valueOf(j2));
        } catch (Throwable th) {
            Q = m0.b.Q(th);
        }
        this.f3914i.t(Q);
    }
}
