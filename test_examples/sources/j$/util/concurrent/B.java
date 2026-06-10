package j$.util.concurrent;

import j$.util.AbstractC0261c;
import j$.util.K;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class B implements K {

    /* renamed from: a  reason: collision with root package name */
    long f12115a;

    /* renamed from: b  reason: collision with root package name */
    final long f12116b;
    final long c;

    /* renamed from: d  reason: collision with root package name */
    final long f12117d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(long j2, long j10, long j11, long j12) {
        this.f12115a = j2;
        this.f12116b = j10;
        this.c = j11;
        this.f12117d = j12;
    }

    @Override // j$.util.K, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.n(this, consumer);
    }

    @Override // j$.util.N
    /* renamed from: b */
    public final void forEachRemaining(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        long j2 = this.f12115a;
        long j10 = this.f12116b;
        if (j2 < j10) {
            this.f12115a = j10;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                interfaceC0278f0.accept(current.e(this.c, this.f12117d));
                j2++;
            } while (j2 < j10);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.K, j$.util.N, j$.util.Spliterator
    /* renamed from: e */
    public final B trySplit() {
        long j2 = this.f12115a;
        long j10 = (this.f12116b + j2) >>> 1;
        if (j10 <= j2) {
            return null;
        }
        this.f12115a = j10;
        return new B(j2, j10, this.c, this.f12117d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f12116b - this.f12115a;
    }

    @Override // j$.util.N
    /* renamed from: f */
    public final boolean tryAdvance(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        long j2 = this.f12115a;
        if (j2 < this.f12116b) {
            interfaceC0278f0.accept(ThreadLocalRandom.current().e(this.c, this.f12117d));
            this.f12115a = j2 + 1;
            return true;
        }
        return false;
    }

    @Override // j$.util.K, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.h(this, consumer);
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
}
