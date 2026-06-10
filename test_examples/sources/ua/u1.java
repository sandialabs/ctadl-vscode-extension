package ua;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class u1 extends h1<m7.g> {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f18017a;

    /* renamed from: b  reason: collision with root package name */
    public int f18018b;

    public u1(byte[] bArr) {
        this.f18017a = bArr;
        this.f18018b = bArr.length;
        b(10);
    }

    @Override // ua.h1
    public final m7.g a() {
        byte[] copyOf = Arrays.copyOf(this.f18017a, this.f18018b);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        return new m7.g(copyOf);
    }

    @Override // ua.h1
    public final void b(int i10) {
        byte[] bArr = this.f18017a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i10);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f18017a = copyOf;
        }
    }

    @Override // ua.h1
    public final int d() {
        return this.f18018b;
    }
}
