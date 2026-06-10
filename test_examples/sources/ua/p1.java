package ua;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p1 extends h1<short[]> {

    /* renamed from: a  reason: collision with root package name */
    public short[] f18002a;

    /* renamed from: b  reason: collision with root package name */
    public int f18003b;

    public p1(short[] sArr) {
        v7.g.f(sArr, "bufferWithData");
        this.f18002a = sArr;
        this.f18003b = sArr.length;
        b(10);
    }

    @Override // ua.h1
    public final short[] a() {
        short[] copyOf = Arrays.copyOf(this.f18002a, this.f18003b);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // ua.h1
    public final void b(int i10) {
        short[] sArr = this.f18002a;
        if (sArr.length < i10) {
            int length = sArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i10);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f18002a = copyOf;
        }
    }

    @Override // ua.h1
    public final int d() {
        return this.f18003b;
    }
}
