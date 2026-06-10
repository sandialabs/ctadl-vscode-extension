package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0287k;
import j$.util.function.InterfaceC0293n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.n1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0387n1 extends AbstractC0402r1 implements InterfaceC0348e2 {

    /* renamed from: h  reason: collision with root package name */
    private final double[] f12502h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0387n1(Spliterator spliterator, AbstractC0421w0 abstractC0421w0, double[] dArr) {
        super(dArr.length, spliterator, abstractC0421w0);
        this.f12502h = dArr;
    }

    C0387n1(C0387n1 c0387n1, Spliterator spliterator, long j2, long j10) {
        super(c0387n1, spliterator, j2, j10, c0387n1.f12502h.length);
        this.f12502h = c0387n1.f12502h;
    }

    @Override // j$.util.stream.AbstractC0402r1
    final AbstractC0402r1 a(Spliterator spliterator, long j2, long j10) {
        return new C0387n1(this, spliterator, j2, j10);
    }

    @Override // j$.util.stream.AbstractC0402r1, j$.util.stream.InterfaceC0363h2, j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        int i10 = this.f12528f;
        if (i10 >= this.f12529g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f12528f));
        }
        double[] dArr = this.f12502h;
        this.f12528f = i10 + 1;
        dArr[i10] = d5;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        q((Double) obj);
    }

    @Override // j$.util.function.InterfaceC0293n
    public final InterfaceC0293n n(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        return new C0287k(this, interfaceC0293n);
    }

    @Override // j$.util.stream.InterfaceC0348e2
    public final /* synthetic */ void q(Double d5) {
        AbstractC0421w0.q0(this, d5);
    }
}
