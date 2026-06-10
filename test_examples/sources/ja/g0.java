package ja;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class g0 implements h0 {

    /* renamed from: i  reason: collision with root package name */
    public final Future<?> f12768i;

    public g0(ScheduledFuture scheduledFuture) {
        this.f12768i = scheduledFuture;
    }

    @Override // ja.h0
    public final void a() {
        this.f12768i.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f12768i + ']';
    }
}
