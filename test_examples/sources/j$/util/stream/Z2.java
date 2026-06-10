package j$.util.stream;

/* loaded from: classes2.dex */
final class Z2 extends AbstractC0334b3 implements j$.util.function.K {
    final int[] c = new int[128];

    @Override // j$.util.stream.AbstractC0334b3
    public final void a(Object obj, long j2) {
        j$.util.function.K k3 = (j$.util.function.K) obj;
        for (int i10 = 0; i10 < j2; i10++) {
            k3.accept(this.c[i10]);
        }
    }

    @Override // j$.util.function.K
    public final void accept(int i10) {
        int i11 = this.f12438b;
        this.f12438b = i11 + 1;
        this.c[i11] = i10;
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        k3.getClass();
        return new j$.util.function.H(this, k3);
    }
}
