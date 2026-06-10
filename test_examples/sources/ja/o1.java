package ja;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes.dex */
public final class o1<U, T extends U> extends kotlinx.coroutines.internal.p<T> implements Runnable {

    /* renamed from: l  reason: collision with root package name */
    public final long f12789l;

    public o1(long j2, ContinuationImpl continuationImpl) {
        super(continuationImpl, continuationImpl.f());
        this.f12789l = j2;
    }

    @Override // ja.a, ja.y0
    public final String p0() {
        return super.p0() + "(timeMillis=" + this.f12789l + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        V(new TimeoutCancellationException(androidx.activity.e.i(new StringBuilder("Timed out waiting for "), this.f12789l, " ms"), this));
    }
}
