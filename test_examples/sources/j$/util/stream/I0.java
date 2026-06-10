package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class I0 implements F0 {

    /* renamed from: a  reason: collision with root package name */
    final Object[] f12327a;

    /* renamed from: b  reason: collision with root package name */
    int f12328b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I0(long j2, IntFunction intFunction) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f12327a = (Object[]) intFunction.apply((int) j2);
        this.f12328b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public I0(Object[] objArr) {
        this.f12327a = objArr;
        this.f12328b = objArr.length;
    }

    @Override // j$.util.stream.F0
    public final F0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.f12328b;
    }

    @Override // j$.util.stream.F0
    public final void f(Object[] objArr, int i10) {
        System.arraycopy(this.f12327a, 0, objArr, i10, this.f12328b);
    }

    @Override // j$.util.stream.F0
    public final void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.f12328b; i10++) {
            consumer.accept(this.f12327a[i10]);
        }
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int k() {
        return 0;
    }

    @Override // j$.util.stream.F0
    public final Object[] p(IntFunction intFunction) {
        Object[] objArr = this.f12327a;
        if (objArr.length == this.f12328b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 r(long j2, long j10, IntFunction intFunction) {
        return AbstractC0421w0.I0(this, j2, j10, intFunction);
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return j$.util.d0.m(this.f12327a, 0, this.f12328b);
    }

    public String toString() {
        Object[] objArr = this.f12327a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f12328b), Arrays.toString(objArr));
    }
}
