package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o3 extends r3 implements j$.util.H {
    /* JADX INFO: Access modifiers changed from: package-private */
    public o3(j$.util.H h10, long j2, long j10) {
        super(h10, j2, j10);
    }

    o3(j$.util.H h10, long j2, long j10, long j11, long j12) {
        super(h10, j2, j10, j11, j12);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.m(this, consumer);
    }

    @Override // j$.util.stream.t3
    protected final Spliterator e(Spliterator spliterator, long j2, long j10, long j11, long j12) {
        return new o3((j$.util.H) spliterator, j2, j10, j11, j12);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.g(this, consumer);
    }

    @Override // j$.util.stream.r3
    protected final Object g() {
        return new n3(0);
    }
}
