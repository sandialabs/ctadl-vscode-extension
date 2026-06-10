package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class M2 extends Q2 implements j$.util.function.K {
    /* JADX INFO: Access modifiers changed from: package-private */
    public M2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public M2(int i10) {
        super(i10);
    }

    @Override // j$.util.function.K
    public void accept(int i10) {
        x();
        int i11 = this.f12456b;
        this.f12456b = i11 + 1;
        ((int[]) this.f12371e)[i11] = i10;
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof j$.util.function.K) {
            d((j$.util.function.K) consumer);
        } else if (H3.f12326a) {
            H3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        } else {
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.d0.g(spliterator());
    }

    @Override // j$.util.stream.Q2
    public final Object newArray(int i10) {
        return new int[i10];
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        k3.getClass();
        return new j$.util.function.H(this, k3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Q2
    public final void s(Object obj, int i10, int i11, Object obj2) {
        int[] iArr = (int[]) obj;
        j$.util.function.K k3 = (j$.util.function.K) obj2;
        while (i10 < i11) {
            k3.accept(iArr[i10]);
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Q2
    public final int t(Object obj) {
        return ((int[]) obj).length;
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        return iArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(iArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    @Override // j$.util.stream.Q2
    protected final Object[] w() {
        return new int[8];
    }

    @Override // j$.util.stream.Q2, java.lang.Iterable
    /* renamed from: y */
    public j$.util.H spliterator() {
        return new L2(this, 0, this.c, 0, this.f12456b);
    }
}
