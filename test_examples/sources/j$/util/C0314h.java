package j$.util;

/* renamed from: j$.util.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0314h implements j$.util.function.K {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public final void a(C0314h c0314h) {
        this.count += c0314h.count;
        this.sum += c0314h.sum;
        this.min = Math.min(this.min, c0314h.min);
        this.max = Math.max(this.max, c0314h.max);
    }

    @Override // j$.util.function.K
    public final void accept(int i10) {
        this.count++;
        this.sum += i10;
        this.min = Math.min(this.min, i10);
        this.max = Math.max(this.max, i10);
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        k3.getClass();
        return new j$.util.function.H(this, k3);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0314h.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Integer.valueOf(this.min);
        long j2 = this.count;
        objArr[4] = Double.valueOf(j2 > 0 ? this.sum / j2 : 0.0d);
        objArr[5] = Integer.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
