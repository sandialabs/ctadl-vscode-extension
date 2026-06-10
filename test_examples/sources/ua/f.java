package ua;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends h1<boolean[]> {

    /* renamed from: a  reason: collision with root package name */
    public boolean[] f17968a;

    /* renamed from: b  reason: collision with root package name */
    public int f17969b;

    public f(boolean[] zArr) {
        v7.g.f(zArr, "bufferWithData");
        this.f17968a = zArr;
        this.f17969b = zArr.length;
        b(10);
    }

    @Override // ua.h1
    public final boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.f17968a, this.f17969b);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // ua.h1
    public final void b(int i10) {
        boolean[] zArr = this.f17968a;
        if (zArr.length < i10) {
            int length = zArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i10);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f17968a = copyOf;
        }
    }

    @Override // ua.h1
    public final int d() {
        return this.f17969b;
    }
}
