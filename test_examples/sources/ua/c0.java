package ua;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 extends h1<float[]> {

    /* renamed from: a  reason: collision with root package name */
    public float[] f17953a;

    /* renamed from: b  reason: collision with root package name */
    public int f17954b;

    public c0(float[] fArr) {
        v7.g.f(fArr, "bufferWithData");
        this.f17953a = fArr;
        this.f17954b = fArr.length;
        b(10);
    }

    @Override // ua.h1
    public final float[] a() {
        float[] copyOf = Arrays.copyOf(this.f17953a, this.f17954b);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @Override // ua.h1
    public final void b(int i10) {
        float[] fArr = this.f17953a;
        if (fArr.length < i10) {
            int length = fArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i10);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f17953a = copyOf;
        }
    }

    @Override // ua.h1
    public final int d() {
        return this.f17954b;
    }
}
