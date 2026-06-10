package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0332b1 implements C0 {

    /* renamed from: a  reason: collision with root package name */
    final int[] f12435a;

    /* renamed from: b  reason: collision with root package name */
    int f12436b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0332b1(long j2) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f12435a = new int[(int) j2];
        this.f12436b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0332b1(int[] iArr) {
        this.f12435a = iArr;
        this.f12436b = iArr.length;
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
        int[] iArr = this.f12435a;
        int length = iArr.length;
        int i10 = this.f12436b;
        return length == i10 ? iArr : Arrays.copyOf(iArr, i10);
    }

    @Override // j$.util.stream.E0
    public final void c(int i10, Object obj) {
        int i11 = this.f12436b;
        System.arraycopy(this.f12435a, 0, (int[]) obj, i10, i11);
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.f12436b;
    }

    @Override // j$.util.stream.E0
    public final void d(Object obj) {
        j$.util.function.K k3 = (j$.util.function.K) obj;
        for (int i10 = 0; i10 < this.f12436b; i10++) {
            k3.accept(this.f12435a[i10]);
        }
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0421w0.D0(this, consumer);
    }

    @Override // j$.util.stream.F0
    /* renamed from: j */
    public final /* synthetic */ void f(Integer[] numArr, int i10) {
        AbstractC0421w0.A0(this, numArr, i10);
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
        return AbstractC0421w0.G0(this, j2, j10);
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final j$.util.N spliterator() {
        return j$.util.d0.k(this.f12435a, 0, this.f12436b);
    }

    @Override // j$.util.stream.E0, j$.util.stream.F0
    public final Spliterator spliterator() {
        return j$.util.d0.k(this.f12435a, 0, this.f12436b);
    }

    public String toString() {
        int[] iArr = this.f12435a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f12436b), Arrays.toString(iArr));
    }
}
