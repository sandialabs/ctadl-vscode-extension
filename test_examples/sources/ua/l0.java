package ua;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l0 extends h1<int[]> {

    /* renamed from: a  reason: collision with root package name */
    public int[] f17988a;

    /* renamed from: b  reason: collision with root package name */
    public int f17989b;

    public l0(int[] iArr) {
        v7.g.f(iArr, "bufferWithData");
        this.f17988a = iArr;
        this.f17989b = iArr.length;
        b(10);
    }

    @Override // ua.h1
    public final int[] a() {
        int[] copyOf = Arrays.copyOf(this.f17988a, this.f17989b);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // ua.h1
    public final void b(int i10) {
        int[] iArr = this.f17988a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i10);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f17988a = copyOf;
        }
    }

    @Override // ua.h1
    public final int d() {
        return this.f17989b;
    }
}
