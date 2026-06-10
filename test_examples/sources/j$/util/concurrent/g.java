package j$.util.concurrent;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g extends q implements Spliterator {

    /* renamed from: i  reason: collision with root package name */
    final ConcurrentHashMap f12142i;

    /* renamed from: j  reason: collision with root package name */
    long f12143j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(m[] mVarArr, int i10, int i11, int i12, long j2, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i10, i11, i12);
        this.f12142i = concurrentHashMap;
        this.f12143j = j2;
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        consumer.getClass();
        m e10 = e();
        if (e10 == null) {
            return false;
        }
        consumer.accept(new l(e10.f12151b, e10.c, this.f12142i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f12143j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            m e10 = e();
            if (e10 == null) {
                return;
            }
            consumer.accept(new l(e10.f12151b, e10.c, this.f12142i));
        }
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

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.f12160f;
        int i11 = this.f12161g;
        int i12 = (i10 + i11) >>> 1;
        if (i12 <= i10) {
            return null;
        }
        m[] mVarArr = this.f12156a;
        int i13 = this.f12162h;
        this.f12161g = i12;
        long j2 = this.f12143j >>> 1;
        this.f12143j = j2;
        return new g(mVarArr, i13, i12, i11, j2, this.f12142i);
    }
}
