package ua;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i extends h1<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f17977a;

    /* renamed from: b  reason: collision with root package name */
    public int f17978b;

    public i(byte[] bArr) {
        v7.g.f(bArr, "bufferWithData");
        this.f17977a = bArr;
        this.f17978b = bArr.length;
        b(10);
    }

    @Override // ua.h1
    public final byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.f17977a, this.f17978b);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // ua.h1
    public final void b(int i10) {
        byte[] bArr = this.f17977a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i10);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f17977a = copyOf;
        }
    }

    @Override // ua.h1
    public final int d() {
        return this.f17978b;
    }
}
