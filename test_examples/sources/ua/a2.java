package ua;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a2 extends h1<m7.k> {

    /* renamed from: a  reason: collision with root package name */
    public long[] f17947a;

    /* renamed from: b  reason: collision with root package name */
    public int f17948b;

    public a2(long[] jArr) {
        this.f17947a = jArr;
        this.f17948b = jArr.length;
        b(10);
    }

    @Override // ua.h1
    public final m7.k a() {
        long[] copyOf = Arrays.copyOf(this.f17947a, this.f17948b);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        return new m7.k(copyOf);
    }

    @Override // ua.h1
    public final void b(int i10) {
        long[] jArr = this.f17947a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i10);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f17947a = copyOf;
        }
    }

    @Override // ua.h1
    public final int d() {
        return this.f17948b;
    }
}
