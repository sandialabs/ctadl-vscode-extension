package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class O0 extends Q0 implements C0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public O0(C0 c0, C0 c02) {
        super(c0, c02);
    }

    @Override // j$.util.stream.F0
    /* renamed from: e */
    public final /* synthetic */ void f(Integer[] numArr, int i10) {
        AbstractC0421w0.A0(this, numArr, i10);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0421w0.D0(this, consumer);
    }

    @Override // j$.util.stream.E0
    public final Object newArray(int i10) {
        return new int[i10];
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 r(long j2, long j10, IntFunction intFunction) {
        return AbstractC0421w0.G0(this, j2, j10);
    }

    @Override // j$.util.stream.F0
    public final j$.util.N spliterator() {
        return new C0352f1(this);
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return new C0352f1(this);
    }
}
