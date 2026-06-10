package ua;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d2 extends h1<m7.m> {

    /* renamed from: a  reason: collision with root package name */
    public short[] f17961a;

    /* renamed from: b  reason: collision with root package name */
    public int f17962b;

    public d2(short[] sArr) {
        this.f17961a = sArr;
        this.f17962b = sArr.length;
        b(10);
    }

    @Override // ua.h1
    public final m7.m a() {
        short[] copyOf = Arrays.copyOf(this.f17961a, this.f17962b);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        return new m7.m(copyOf);
    }

    @Override // ua.h1
    public final void b(int i10) {
        short[] sArr = this.f17961a;
        if (sArr.length < i10) {
            int length = sArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i10);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f17961a = copyOf;
        }
    }

    @Override // ua.h1
    public final int d() {
        return this.f17962b;
    }
}
