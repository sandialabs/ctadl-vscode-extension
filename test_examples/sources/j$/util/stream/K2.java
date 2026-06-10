package j$.util.stream;

import j$.util.function.C0287k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0293n;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class K2 extends Q2 implements InterfaceC0293n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public K2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public K2(int i10) {
        super(i10);
    }

    @Override // j$.util.function.InterfaceC0293n
    public void accept(double d5) {
        x();
        int i10 = this.f12456b;
        this.f12456b = i10 + 1;
        ((double[]) this.f12371e)[i10] = d5;
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof InterfaceC0293n) {
            d((InterfaceC0293n) consumer);
        } else if (H3.f12326a) {
            H3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        } else {
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.d0.f(spliterator());
    }

    @Override // j$.util.function.InterfaceC0293n
    public final InterfaceC0293n n(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        return new C0287k(this, interfaceC0293n);
    }

    @Override // j$.util.stream.Q2
    public final Object newArray(int i10) {
        return new double[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Q2
    public final void s(Object obj, int i10, int i11, Object obj2) {
        double[] dArr = (double[]) obj;
        InterfaceC0293n interfaceC0293n = (InterfaceC0293n) obj2;
        while (i10 < i11) {
            interfaceC0293n.accept(dArr[i10]);
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Q2
    public final int t(Object obj) {
        return ((double[]) obj).length;
    }

    public final String toString() {
        double[] dArr = (double[]) b();
        return dArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(dArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }

    @Override // j$.util.stream.Q2
    protected final Object[] w() {
        return new double[8];
    }

    @Override // j$.util.stream.Q2, java.lang.Iterable
    /* renamed from: y */
    public j$.util.E spliterator() {
        return new J2(this, 0, this.c, 0, this.f12456b);
    }
}
