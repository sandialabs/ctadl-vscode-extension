package j$.util.concurrent;

import j$.util.AbstractC0261c;
import j$.util.H;
import j$.util.function.Consumer;
import j$.util.function.K;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class A implements H {

    /* renamed from: a  reason: collision with root package name */
    long f12112a;

    /* renamed from: b  reason: collision with root package name */
    final long f12113b;
    final int c;

    /* renamed from: d  reason: collision with root package name */
    final int f12114d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(long j2, long j10, int i10, int i11) {
        this.f12112a = j2;
        this.f12113b = j10;
        this.c = i10;
        this.f12114d = i11;
    }

    @Override // j$.util.H, j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.m(this, consumer);
    }

    @Override // j$.util.N
    /* renamed from: c */
    public final void forEachRemaining(K k3) {
        k3.getClass();
        long j2 = this.f12112a;
        long j10 = this.f12113b;
        if (j2 < j10) {
            this.f12112a = j10;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                k3.accept(current.d(this.c, this.f12114d));
                j2++;
            } while (j2 < j10);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.H, j$.util.N, j$.util.Spliterator
    /* renamed from: e */
    public final A trySplit() {
        long j2 = this.f12112a;
        long j10 = (this.f12113b + j2) >>> 1;
        if (j10 <= j2) {
            return null;
        }
        this.f12112a = j10;
        return new A(j2, j10, this.c, this.f12114d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f12113b - this.f12112a;
    }

    @Override // j$.util.H, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.g(this, consumer);
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
    /* renamed from: k */
    public final boolean tryAdvance(K k3) {
        k3.getClass();
        long j2 = this.f12112a;
        if (j2 < this.f12113b) {
            k3.accept(ThreadLocalRandom.current().d(this.c, this.f12114d));
            this.f12112a = j2 + 1;
            return true;
        }
        return false;
    }
}
