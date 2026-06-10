package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0293n;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class S0 implements B0 {

    /* renamed from: a  reason: collision with root package name */
    final double[] f12377a;

    /* renamed from: b  reason: collision with root package name */
    int f12378b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S0(long j2) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f12377a = new double[(int) j2];
        this.f12378b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public S0(double[] dArr) {
        this.f12377a = dArr;
        this.f12378b = dArr.length;
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final E0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final /* bridge */ /* synthetic */ F0 a(int i10) {
        a(i10);
        throw null;
    }

    @Override // j$.util.stream.E0
    public final Object b() {
        double[] dArr = this.f12377a;
        int length = dArr.length;
        int i10 = this.f12378b;
        return length == i10 ? dArr : Arrays.copyOf(dArr, i10);
    }

    @Override // j$.util.stream.E0
    public final void c(int i10, Object obj) {
        int i11 = this.f12378b;
        System.arraycopy(this.f12377a, 0, (double[]) obj, i10, i11);
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.f12378b;
    }

    @Override // j$.util.stream.E0
    public final void d(Object obj) {
        InterfaceC0293n interfaceC0293n = (InterfaceC0293n) obj;
        for (int i10 = 0; i10 < this.f12378b; i10++) {
            interfaceC0293n.accept(this.f12377a[i10]);
        }
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0421w0.C0(this, consumer);
    }

    @Override // j$.util.stream.F0
    /* renamed from: j */
    public final /* synthetic */ void f(Double[] dArr, int i10) {
        AbstractC0421w0.z0(this, dArr, i10);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int k() {
        return 0;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0421w0.y0(this, intFunction);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 r(long j2, long j10, IntFunction intFunction) {
        return AbstractC0421w0.F0(this, j2, j10);
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final j$.util.N spliterator() {
        return j$.util.d0.j(this.f12377a, 0, this.f12378b);
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final Spliterator spliterator() {
        return j$.util.d0.j(this.f12377a, 0, this.f12378b);
    }

    public String toString() {
        double[] dArr = this.f12377a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f12378b), Arrays.toString(dArr));
    }
}
