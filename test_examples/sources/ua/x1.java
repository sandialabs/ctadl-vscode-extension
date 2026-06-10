package ua;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class x1 extends h1<m7.i> {

    /* renamed from: a  reason: collision with root package name */
    public int[] f18031a;

    /* renamed from: b  reason: collision with root package name */
    public int f18032b;

    public x1(int[] iArr) {
        this.f18031a = iArr;
        this.f18032b = iArr.length;
        b(10);
    }

    @Override // ua.h1
    public final m7.i a() {
        int[] copyOf = Arrays.copyOf(this.f18031a, this.f18032b);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        return new m7.i(copyOf);
    }

    @Override // ua.h1
    public final void b(int i10) {
        int[] iArr = this.f18031a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i10);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f18031a = copyOf;
        }
    }

    @Override // ua.h1
    public final int d() {
        return this.f18032b;
    }
}
