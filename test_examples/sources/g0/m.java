package g0;

import android.view.Choreographer;
import androidx.compose.runtime.DefaultChoreographerFrameClock;

/* loaded from: classes.dex */
public final class m implements Choreographer.FrameCallback {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ja.i<Object> f11062i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u7.l<Long, Object> f11063j;

    public m(ja.j jVar, u7.l lVar) {
        this.f11062i = jVar;
        this.f11063j = lVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        Object Q;
        DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.f2755i;
        try {
            Q = this.f11063j.U(Long.valueOf(j2));
        } catch (Throwable th) {
            Q = m0.b.Q(th);
        }
        this.f11062i.t(Q);
    }
}
