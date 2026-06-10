package j$.util.stream;

import j$.util.function.C0272c0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0278f0;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class O2 extends Q2 implements InterfaceC0278f0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public O2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public O2(int i10) {
        super(i10);
    }

    @Override // j$.util.function.InterfaceC0278f0
    public void accept(long j2) {
        x();
        int i10 = this.f12456b;
        this.f12456b = i10 + 1;
        ((long[]) this.f12371e)[i10] = j2;
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof InterfaceC0278f0) {
            d((InterfaceC0278f0) consumer);
        } else if (H3.f12326a) {
            H3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        } else {
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.d0.h(spliterator());
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final InterfaceC0278f0 j(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        return new C0272c0(this, interfaceC0278f0);
    }

    @Override // j$.util.stream.Q2
    public final Object newArray(int i10) {
        return new long[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Q2
    public final void s(Object obj, int i10, int i11, Object obj2) {
        long[] jArr = (long[]) obj;
        InterfaceC0278f0 interfaceC0278f0 = (InterfaceC0278f0) obj2;
        while (i10 < i11) {
            interfaceC0278f0.accept(jArr[i10]);
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Q2
    public final int t(Object obj) {
        return ((long[]) obj).length;
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        return jArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(jArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }

    @Override // j$.util.stream.Q2
    protected final Object[] w() {
        return new long[8];
    }

    @Override // j$.util.stream.Q2, java.lang.Iterable
    /* renamed from: y */
    public j$.util.K spliterator() {
        return new N2(this, 0, this.c, 0, this.f12456b);
    }
}
