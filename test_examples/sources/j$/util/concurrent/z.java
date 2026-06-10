package j$.util.concurrent;

import j$.util.AbstractC0261c;
import j$.util.E;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class z implements E {

    /* renamed from: a  reason: collision with root package name */
    long f12176a;

    /* renamed from: b  reason: collision with root package name */
    final long f12177b;
    final double c;

    /* renamed from: d  reason: collision with root package name */
    final double f12178d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(long j2, long j10, double d5, double d10) {
        this.f12176a = j2;
        this.f12177b = j10;
        this.c = d5;
        this.f12178d = d10;
    }

    @Override // j$.util.E, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.l(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.N
    /* renamed from: d */
    public final void forEachRemaining(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        long j2 = this.f12176a;
        long j10 = this.f12177b;
        if (j2 < j10) {
            this.f12176a = j10;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                interfaceC0293n.accept(current.c(this.c, this.f12178d));
                j2++;
            } while (j2 < j10);
        }
    }

    @Override // j$.util.E, j$.util.N, j$.util.Spliterator
    /* renamed from: e */
    public final z trySplit() {
        long j2 = this.f12176a;
        long j10 = (this.f12177b + j2) >>> 1;
        if (j10 <= j2) {
            return null;
        }
        this.f12176a = j10;
        return new z(j2, j10, this.c, this.f12178d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f12177b - this.f12176a;
    }

    @Override // j$.util.E, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0261c.i(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0261c.j(this, i10);
    }

    @Override // j$.util.N
    /* renamed from: p */
    public final boolean tryAdvance(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        long j2 = this.f12176a;
        if (j2 < this.f12177b) {
            interfaceC0293n.accept(ThreadLocalRandom.current().c(this.c, this.f12178d));
            this.f12176a = j2 + 1;
            return true;
        }
        return false;
    }
}
