package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class P0 extends Q0 implements D0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public P0(D0 d02, D0 d03) {
        super(d02, d03);
    }

    @Override // j$.util.stream.F0
    /* renamed from: e */
    public final /* synthetic */ void f(Long[] lArr, int i10) {
        AbstractC0421w0.B0(this, lArr, i10);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0421w0.E0(this, consumer);
    }

    @Override // j$.util.stream.E0
    public final Object newArray(int i10) {
        return new long[i10];
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 r(long j2, long j10, IntFunction intFunction) {
        return AbstractC0421w0.H0(this, j2, j10);
    }

    @Override // j$.util.stream.F0
    public final j$.util.N spliterator() {
        return new C0357g1(this);
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return new C0357g1(this);
    }
}
