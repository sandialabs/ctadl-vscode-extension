package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0278f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.m1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0383m1 extends O2 implements D0, InterfaceC0433z0 {
    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final E0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final /* bridge */ /* synthetic */ F0 a(int i10) {
        a(i10);
        throw null;
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

    @Override // j$.util.stream.O2, j$.util.function.InterfaceC0278f0
    public final void accept(long j2) {
        super.accept(j2);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Long) obj);
    }

    @Override // j$.util.stream.Q2, j$.util.stream.E0
    public final Object b() {
        return (long[]) super.b();
    }

    @Override // j$.util.stream.InterfaceC0433z0, j$.util.stream.A0
    public final D0 build() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0433z0, j$.util.stream.A0
    public final F0 build() {
        return this;
    }

    @Override // j$.util.stream.Q2, j$.util.stream.E0
    public final void c(int i10, Object obj) {
        super.c(i10, (long[]) obj);
    }

    @Override // j$.util.stream.Q2, j$.util.stream.E0
    public final void d(Object obj) {
        super.d((InterfaceC0278f0) obj);
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        consumer.getClass();
        return new j$.util.concurrent.u(3, this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void end() {
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        clear();
        v(j2);
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int k() {
        return 0;
    }

    @Override // j$.util.stream.InterfaceC0358g2
    public final /* synthetic */ void m(Long l2) {
        AbstractC0421w0.u0(this, l2);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0421w0.y0(this, intFunction);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 r(long j2, long j10, IntFunction intFunction) {
        return AbstractC0421w0.H0(this, j2, j10);
    }

    @Override // j$.util.stream.O2, j$.util.stream.Q2, java.lang.Iterable
    public final j$.util.N spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.O2, j$.util.stream.Q2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.O2
    public final j$.util.K y() {
        return super.spliterator();
    }

    @Override // j$.util.stream.F0
    /* renamed from: z */
    public final /* synthetic */ void f(Long[] lArr, int i10) {
        AbstractC0421w0.B0(this, lArr, i10);
    }
}
