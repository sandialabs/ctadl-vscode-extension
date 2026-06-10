package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class N0 extends Q0 implements B0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public N0(B0 b02, B0 b03) {
        super(b02, b03);
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

    @Override // j$.util.stream.E0
    public final Object newArray(int i10) {
        return new double[i10];
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 r(long j2, long j10, IntFunction intFunction) {
        return AbstractC0421w0.F0(this, j2, j10);
    }

    @Override // j$.util.stream.F0
    public final j$.util.N spliterator() {
        return new C0347e1(this);
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return new C0347e1(this);
    }
}
