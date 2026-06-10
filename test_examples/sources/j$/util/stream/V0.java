package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class V0 extends Z0 implements B0 {
    @Override // j$.util.stream.Z0, j$.util.stream.F0
    public final E0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.Z0, j$.util.stream.F0
    public final /* bridge */ /* synthetic */ F0 a(int i10) {
        a(i10);
        throw null;
    }

    @Override // j$.util.stream.E0
    public final Object b() {
        double[] dArr;
        dArr = AbstractC0421w0.f12569g;
        return dArr;
    }

    @Override // j$.util.stream.F0
    /* renamed from: e */
    public final /* synthetic */ void f(Double[] dArr, int i10) {
        AbstractC0421w0.z0(this, dArr, i10);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0421w0.C0(this, consumer);
    }

    @Override // j$.util.stream.Z0, j$.util.stream.F0
    public final /* synthetic */ F0 r(long j2, long j10, IntFunction intFunction) {
        return AbstractC0421w0.F0(this, j2, j10);
    }

    @Override // j$.util.stream.F0
    public final j$.util.N spliterator() {
        return j$.util.d0.b();
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return j$.util.d0.b();
    }
}
