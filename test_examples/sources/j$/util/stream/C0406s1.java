package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0406s1 extends R2 implements F0, A0 {
    @Override // j$.util.stream.F0
    public final F0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final /* synthetic */ void accept(double d5) {
        AbstractC0421w0.p0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void accept(int i10) {
        AbstractC0421w0.w0();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ void accept(long j2) {
        AbstractC0421w0.x0();
        throw null;
    }

    @Override // j$.util.stream.R2, j$.util.function.Consumer
    public final void accept(Object obj) {
        super.accept(obj);
    }

    @Override // j$.util.stream.A0
    public final F0 build() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void end() {
    }

    @Override // j$.util.stream.F0
    public final void f(Object[] objArr, int i10) {
        long j2 = i10;
        long count = count() + j2;
        if (count > objArr.length || count < j2) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.f12374e, 0, objArr, i10, this.f12456b);
            return;
        }
        for (int i11 = 0; i11 < this.c; i11++) {
            Object[] objArr2 = this.f12375f[i11];
            System.arraycopy(objArr2, 0, objArr, i10, objArr2.length);
            i10 += this.f12375f[i11].length;
        }
        int i12 = this.f12456b;
        if (i12 > 0) {
            System.arraycopy(this.f12374e, 0, objArr, i10, i12);
        }
    }

    @Override // j$.util.stream.R2, j$.util.stream.F0
    public final void forEach(Consumer consumer) {
        super.forEach(consumer);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        clear();
        s(j2);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int k() {
        return 0;
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
    public final /* synthetic */ F0 r(long j2, long j10, IntFunction intFunction) {
        return AbstractC0421w0.I0(this, j2, j10, intFunction);
    }

    @Override // j$.util.stream.R2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }
}
