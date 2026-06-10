package j$.util;

import j$.util.function.C0287k;
import j$.util.function.InterfaceC0293n;

/* renamed from: j$.util.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0313g implements InterfaceC0293n {

    /* renamed from: a  reason: collision with root package name */
    private double f12271a;

    /* renamed from: b  reason: collision with root package name */
    private double f12272b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final void a(C0313g c0313g) {
        this.count += c0313g.count;
        this.f12272b += c0313g.f12272b;
        double d5 = c0313g.sum - this.f12271a;
        double d10 = this.sum;
        double d11 = d10 + d5;
        double d12 = (d11 - d10) - d5;
        this.f12271a = d12;
        double d13 = c0313g.f12271a - d12;
        double d14 = d11 + d13;
        this.f12271a = (d14 - d11) - d13;
        this.sum = d14;
        this.min = Math.min(this.min, c0313g.min);
        this.max = Math.max(this.max, c0313g.max);
    }

    @Override // j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        this.count++;
        this.f12272b += d5;
        double d10 = d5 - this.f12271a;
        double d11 = this.sum;
        double d12 = d11 + d10;
        this.f12271a = (d12 - d11) - d10;
        this.sum = d12;
        this.min = Math.min(this.min, d5);
        this.max = Math.max(this.max, d5);
    }

    @Override // j$.util.function.InterfaceC0293n
    public final InterfaceC0293n n(InterfaceC0293n interfaceC0293n) {
        interfaceC0293n.getClass();
        return new C0287k(this, interfaceC0293n);
    }

    public final String toString() {
        double d5;
        Object[] objArr = new Object[6];
        objArr[0] = C0313g.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        double d10 = this.sum + this.f12271a;
        if (Double.isNaN(d10) && Double.isInfinite(this.f12272b)) {
            d10 = this.f12272b;
        }
        objArr[2] = Double.valueOf(d10);
        objArr[3] = Double.valueOf(this.min);
        if (this.count > 0) {
            double d11 = this.sum + this.f12271a;
            if (Double.isNaN(d11) && Double.isInfinite(this.f12272b)) {
                d11 = this.f12272b;
            }
            d5 = d11 / this.count;
        } else {
            d5 = 0.0d;
        }
        objArr[4] = Double.valueOf(d5);
        objArr[5] = Double.valueOf(this.max);
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", objArr);
    }
}
