package ua;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o extends h1<char[]> {

    /* renamed from: a  reason: collision with root package name */
    public char[] f17997a;

    /* renamed from: b  reason: collision with root package name */
    public int f17998b;

    public o(char[] cArr) {
        v7.g.f(cArr, "bufferWithData");
        this.f17997a = cArr;
        this.f17998b = cArr.length;
        b(10);
    }

    @Override // ua.h1
    public final char[] a() {
        char[] copyOf = Arrays.copyOf(this.f17997a, this.f17998b);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // ua.h1
    public final void b(int i10) {
        char[] cArr = this.f17997a;
        if (cArr.length < i10) {
            int length = cArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i10);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f17997a = copyOf;
        }
    }

    @Override // ua.h1
    public final int d() {
        return this.f17998b;
    }
}
