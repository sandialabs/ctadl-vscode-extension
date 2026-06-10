package ja;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class s0 extends v0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(s0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: m  reason: collision with root package name */
    public final u7.l<Throwable, m7.n> f12802m;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(u7.l<? super Throwable, m7.n> lVar) {
        this.f12802m = lVar;
    }

    @Override // ja.u
    public final void M(Throwable th) {
        if (n.compareAndSet(this, 0, 1)) {
            this.f12802m.U(th);
        }
    }

    @Override // u7.l
    public final /* bridge */ /* synthetic */ m7.n U(Throwable th) {
        M(th);
        return m7.n.f16010a;
    }
}
