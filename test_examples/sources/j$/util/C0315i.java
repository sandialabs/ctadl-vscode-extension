package j$.util;

import j$.util.function.C0272c0;
import j$.util.function.InterfaceC0278f0;

/* renamed from: j$.util.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0315i implements InterfaceC0278f0, j$.util.function.K {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    public final void a(C0315i c0315i) {
        this.count += c0315i.count;
        this.sum += c0315i.sum;
        this.min = Math.min(this.min, c0315i.min);
        this.max = Math.max(this.max, c0315i.max);
    }

    @Override // j$.util.function.K
    public final void accept(int i10) {
        accept(i10);
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final void accept(long j2) {
        this.count++;
        this.sum += j2;
        this.min = Math.min(this.min, j2);
        this.max = Math.max(this.max, j2);
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final InterfaceC0278f0 j(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        return new C0272c0(this, interfaceC0278f0);
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        k3.getClass();
        return new j$.util.function.H(this, k3);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0315i.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Long.valueOf(this.min);
        long j2 = this.count;
        objArr[4] = Double.valueOf(j2 > 0 ? this.sum / j2 : 0.0d);
        objArr[5] = Long.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
