package ua;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class v0 extends h1<long[]> {

    /* renamed from: a  reason: collision with root package name */
    public long[] f18021a;

    /* renamed from: b  reason: collision with root package name */
    public int f18022b;

    public v0(long[] jArr) {
        v7.g.f(jArr, "bufferWithData");
        this.f18021a = jArr;
        this.f18022b = jArr.length;
        b(10);
    }

    @Override // ua.h1
    public final long[] a() {
        long[] copyOf = Arrays.copyOf(this.f18021a, this.f18022b);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // ua.h1
    public final void b(int i10) {
        long[] jArr = this.f18021a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i10);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f18021a = copyOf;
        }
    }

    @Override // ua.h1
    public final int d() {
        return this.f18022b;
    }
}
