package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0335c extends AbstractC0421w0 implements InterfaceC0365i {

    /* renamed from: h  reason: collision with root package name */
    private final AbstractC0335c f12439h;

    /* renamed from: i  reason: collision with root package name */
    private final AbstractC0335c f12440i;

    /* renamed from: j  reason: collision with root package name */
    protected final int f12441j;

    /* renamed from: k  reason: collision with root package name */
    private AbstractC0335c f12442k;

    /* renamed from: l  reason: collision with root package name */
    private int f12443l;

    /* renamed from: m  reason: collision with root package name */
    private int f12444m;
    private Spliterator n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f12445o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12446p;

    /* renamed from: q  reason: collision with root package name */
    private Runnable f12447q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f12448r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0335c(Spliterator spliterator, int i10, boolean z10) {
        this.f12440i = null;
        this.n = spliterator;
        this.f12439h = this;
        int i11 = V2.f12399g & i10;
        this.f12441j = i11;
        this.f12444m = (~(i11 << 1)) & V2.f12404l;
        this.f12443l = 0;
        this.f12448r = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0335c(AbstractC0335c abstractC0335c, int i10) {
        if (abstractC0335c.f12445o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC0335c.f12445o = true;
        abstractC0335c.f12442k = this;
        this.f12440i = abstractC0335c;
        this.f12441j = V2.f12400h & i10;
        this.f12444m = V2.e(i10, abstractC0335c.f12444m);
        AbstractC0335c abstractC0335c2 = abstractC0335c.f12439h;
        this.f12439h = abstractC0335c2;
        if (J1()) {
            abstractC0335c2.f12446p = true;
        }
        this.f12443l = abstractC0335c.f12443l + 1;
    }

    private Spliterator L1(int i10) {
        int i11;
        int i12;
        AbstractC0335c abstractC0335c = this.f12439h;
        Spliterator spliterator = abstractC0335c.n;
        if (spliterator != null) {
            abstractC0335c.n = null;
            if (abstractC0335c.f12448r && abstractC0335c.f12446p) {
                AbstractC0335c abstractC0335c2 = abstractC0335c.f12442k;
                int i13 = 1;
                while (abstractC0335c != this) {
                    int i14 = abstractC0335c2.f12441j;
                    if (abstractC0335c2.J1()) {
                        if (V2.SHORT_CIRCUIT.i(i14)) {
                            i14 &= ~V2.f12412u;
                        }
                        spliterator = abstractC0335c2.I1(abstractC0335c, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i11 = (~V2.f12411t) & i14;
                            i12 = V2.f12410s;
                        } else {
                            i11 = (~V2.f12410s) & i14;
                            i12 = V2.f12411t;
                        }
                        i14 = i12 | i11;
                        i13 = 0;
                    }
                    abstractC0335c2.f12443l = i13;
                    abstractC0335c2.f12444m = V2.e(i14, abstractC0335c.f12444m);
                    i13++;
                    AbstractC0335c abstractC0335c3 = abstractC0335c2;
                    abstractC0335c2 = abstractC0335c2.f12442k;
                    abstractC0335c = abstractC0335c3;
                }
            }
            if (i10 != 0) {
                this.f12444m = V2.e(i10, this.f12444m);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final F0 A1(IntFunction intFunction) {
        AbstractC0335c abstractC0335c;
        if (this.f12445o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f12445o = true;
        if (this.f12439h.f12448r && (abstractC0335c = this.f12440i) != null && J1()) {
            this.f12443l = 0;
            return H1(abstractC0335c.L1(0), intFunction, abstractC0335c);
        }
        return y1(L1(0), true, intFunction);
    }

    abstract F0 B1(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, boolean z10, IntFunction intFunction);

    abstract void C1(Spliterator spliterator, InterfaceC0363h2 interfaceC0363h2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract W2 D1();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final W2 E1() {
        AbstractC0335c abstractC0335c = this;
        while (abstractC0335c.f12443l > 0) {
            abstractC0335c = abstractC0335c.f12440i;
        }
        return abstractC0335c.D1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F1() {
        return V2.ORDERED.i(this.f12444m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Spliterator G1() {
        return L1(0);
    }

    F0 H1(Spliterator spliterator, IntFunction intFunction, AbstractC0335c abstractC0335c) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator I1(AbstractC0335c abstractC0335c, Spliterator spliterator) {
        return H1(spliterator, new C0330b(0), abstractC0335c).spliterator();
    }

    abstract boolean J1();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC0363h2 K1(int i10, InterfaceC0363h2 interfaceC0363h2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator M1() {
        AbstractC0335c abstractC0335c = this.f12439h;
        if (this == abstractC0335c) {
            if (this.f12445o) {
                throw new IllegalStateException("stream has already been operated upon or closed");
            }
            this.f12445o = true;
            Spliterator spliterator = abstractC0335c.n;
            if (spliterator != null) {
                abstractC0335c.n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        throw new IllegalStateException();
    }

    abstract Spliterator N1(AbstractC0421w0 abstractC0421w0, C0325a c0325a, boolean z10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator O1(Spliterator spliterator) {
        return this.f12443l == 0 ? spliterator : N1(this, new C0325a(0, spliterator), this.f12439h.f12448r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0421w0
    public final void V0(Spliterator spliterator, InterfaceC0363h2 interfaceC0363h2) {
        interfaceC0363h2.getClass();
        if (V2.SHORT_CIRCUIT.i(this.f12444m)) {
            W0(spliterator, interfaceC0363h2);
            return;
        }
        interfaceC0363h2.g(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(interfaceC0363h2);
        interfaceC0363h2.end();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0421w0
    public final void W0(Spliterator spliterator, InterfaceC0363h2 interfaceC0363h2) {
        AbstractC0335c abstractC0335c = this;
        while (abstractC0335c.f12443l > 0) {
            abstractC0335c = abstractC0335c.f12440i;
        }
        interfaceC0363h2.g(spliterator.getExactSizeIfKnown());
        abstractC0335c.C1(spliterator, interfaceC0363h2);
        interfaceC0363h2.end();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0421w0
    public final long a1(Spliterator spliterator) {
        if (V2.SIZED.i(this.f12444m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.stream.InterfaceC0365i, java.lang.AutoCloseable
    public final void close() {
        this.f12445o = true;
        this.n = null;
        AbstractC0335c abstractC0335c = this.f12439h;
        Runnable runnable = abstractC0335c.f12447q;
        if (runnable != null) {
            abstractC0335c.f12447q = null;
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0421w0
    public final int g1() {
        return this.f12444m;
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final boolean isParallel() {
        return this.f12439h.f12448r;
    }

    @Override // j$.util.stream.InterfaceC0365i
    public final InterfaceC0365i onClose(Runnable runnable) {
        AbstractC0335c abstractC0335c = this.f12439h;
        Runnable runnable2 = abstractC0335c.f12447q;
        if (runnable2 != null) {
            runnable = new D3(runnable2, runnable);
        }
        abstractC0335c.f12447q = runnable;
        return this;
    }

    public final InterfaceC0365i parallel() {
        this.f12439h.f12448r = true;
        return this;
    }

    public final InterfaceC0365i sequential() {
        this.f12439h.f12448r = false;
        return this;
    }

    public Spliterator spliterator() {
        if (this.f12445o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f12445o = true;
        AbstractC0335c abstractC0335c = this.f12439h;
        if (this == abstractC0335c) {
            Spliterator spliterator = abstractC0335c.n;
            if (spliterator != null) {
                abstractC0335c.n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return N1(this, new C0325a(1, this), abstractC0335c.f12448r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0421w0
    public final InterfaceC0363h2 w1(Spliterator spliterator, InterfaceC0363h2 interfaceC0363h2) {
        interfaceC0363h2.getClass();
        V0(spliterator, x1(interfaceC0363h2));
        return interfaceC0363h2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0421w0
    public final InterfaceC0363h2 x1(InterfaceC0363h2 interfaceC0363h2) {
        interfaceC0363h2.getClass();
        AbstractC0335c abstractC0335c = this;
        while (abstractC0335c.f12443l > 0) {
            AbstractC0335c abstractC0335c2 = abstractC0335c.f12440i;
            interfaceC0363h2 = abstractC0335c.K1(abstractC0335c2.f12444m, interfaceC0363h2);
            abstractC0335c = abstractC0335c2;
        }
        return interfaceC0363h2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final F0 y1(Spliterator spliterator, boolean z10, IntFunction intFunction) {
        if (this.f12439h.f12448r) {
            return B1(this, spliterator, z10, intFunction);
        }
        A0 r1 = r1(a1(spliterator), intFunction);
        w1(spliterator, r1);
        return r1.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object z1(E3 e32) {
        if (this.f12445o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f12445o = true;
        return this.f12439h.f12448r ? e32.y(this, L1(e32.P())) : e32.n0(this, L1(e32.P()));
    }
}
