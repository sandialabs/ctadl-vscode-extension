package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class R0 extends H0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public R0(F0 f02, F0 f03) {
        super(f02, f03);
    }

    @Override // j$.util.stream.F0
    public final void f(Object[] objArr, int i10) {
        objArr.getClass();
        F0 f02 = this.f12320a;
        f02.f(objArr, i10);
        this.f12321b.f(objArr, i10 + ((int) f02.count()));
    }

    @Override // j$.util.stream.F0
    public final void forEach(Consumer consumer) {
        this.f12320a.forEach(consumer);
        this.f12321b.forEach(consumer);
    }

    @Override // j$.util.stream.F0
    public final Object[] p(IntFunction intFunction) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            f(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.F0
    public final F0 r(long j2, long j10, IntFunction intFunction) {
        if (j2 == 0 && j10 == count()) {
            return this;
        }
        long count = this.f12320a.count();
        return j2 >= count ? this.f12321b.r(j2 - count, j10 - count, intFunction) : j10 <= count ? this.f12320a.r(j2, j10, intFunction) : AbstractC0421w0.U0(W2.REFERENCE, this.f12320a.r(j2, count, intFunction), this.f12321b.r(0L, j10 - count, intFunction));
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return new C0367i1(this);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f12320a, this.f12321b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
