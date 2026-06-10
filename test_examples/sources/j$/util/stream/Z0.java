package j$.util.stream;

import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class Z0 implements F0 {
    @Override // j$.util.stream.F0
    public F0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public final void c(int i10, Object obj) {
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return 0L;
    }

    public final void d(Object obj) {
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int k() {
        return 0;
    }

    @Override // j$.util.stream.F0
    public final Object[] p(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.F0
    public /* synthetic */ F0 r(long j2, long j10, IntFunction intFunction) {
        return AbstractC0421w0.I0(this, j2, j10, intFunction);
    }
}
