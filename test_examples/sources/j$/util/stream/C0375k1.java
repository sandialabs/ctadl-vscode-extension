package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0278f0;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.k1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0375k1 implements D0 {

    /* renamed from: a  reason: collision with root package name */
    final long[] f12489a;

    /* renamed from: b  reason: collision with root package name */
    int f12490b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0375k1(long j2) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f12489a = new long[(int) j2];
        this.f12490b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0375k1(long[] jArr) {
        this.f12489a = jArr;
        this.f12490b = jArr.length;
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
        long[] jArr = this.f12489a;
        int length = jArr.length;
        int i10 = this.f12490b;
        return length == i10 ? jArr : Arrays.copyOf(jArr, i10);
    }

    @Override // j$.util.stream.E0
    public final void c(int i10, Object obj) {
        int i11 = this.f12490b;
        System.arraycopy(this.f12489a, 0, (long[]) obj, i10, i11);
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.f12490b;
    }

    @Override // j$.util.stream.E0
    public final void d(Object obj) {
        InterfaceC0278f0 interfaceC0278f0 = (InterfaceC0278f0) obj;
        for (int i10 = 0; i10 < this.f12490b; i10++) {
            interfaceC0278f0.accept(this.f12489a[i10]);
        }
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0421w0.E0(this, consumer);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int k() {
        return 0;
    }

    @Override // j$.util.stream.F0
    /* renamed from: n */
    public final /* synthetic */ void f(Long[] lArr, int i10) {
        AbstractC0421w0.B0(this, lArr, i10);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0421w0.y0(this, intFunction);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 r(long j2, long j10, IntFunction intFunction) {
        return AbstractC0421w0.H0(this, j2, j10);
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final j$.util.N spliterator() {
        return j$.util.d0.l(this.f12489a, 0, this.f12490b);
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final Spliterator spliterator() {
        return j$.util.d0.l(this.f12489a, 0, this.f12490b);
    }

    public String toString() {
        long[] jArr = this.f12489a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f12490b), Arrays.toString(jArr));
    }
}
