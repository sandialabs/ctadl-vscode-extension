package ua;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class x extends h1<double[]> {

    /* renamed from: a  reason: collision with root package name */
    public double[] f18027a;

    /* renamed from: b  reason: collision with root package name */
    public int f18028b;

    public x(double[] dArr) {
        v7.g.f(dArr, "bufferWithData");
        this.f18027a = dArr;
        this.f18028b = dArr.length;
        b(10);
    }

    @Override // ua.h1
    public final double[] a() {
        double[] copyOf = Arrays.copyOf(this.f18027a, this.f18028b);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // ua.h1
    public final void b(int i10) {
        double[] dArr = this.f18027a;
        if (dArr.length < i10) {
            int length = dArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i10);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f18027a = copyOf;
        }
    }

    @Override // ua.h1
    public final int d() {
        return this.f18028b;
    }
}
