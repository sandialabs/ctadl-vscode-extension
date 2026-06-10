package r;

import androidx.compose.animation.core.VectorConvertersKt;

/* loaded from: classes.dex */
public final class t implements r {

    /* renamed from: a  reason: collision with root package name */
    public final int f17015a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17016b;
    public final p c;

    public t(int i10, int i11, p pVar) {
        v7.g.f(pVar, "easing");
        this.f17015a = i10;
        this.f17016b = i11;
        this.c = pVar;
    }

    @Override // r.r
    public final float b(long j2, float f10, float f11, float f12) {
        float f13;
        long j10 = (j2 / 1000000) - this.f17016b;
        int i10 = this.f17015a;
        long d02 = a1.c.d0(j10, 0L, i10);
        if (i10 == 0) {
            f13 = 1.0f;
        } else {
            f13 = ((float) d02) / i10;
        }
        float a10 = this.c.a(a1.c.b0(f13, 0.0f, 1.0f));
        a0 a0Var = VectorConvertersKt.f1327a;
        return (f11 * a10) + ((1 - a10) * f10);
    }

    @Override // r.r
    public final float c(long j2, float f10, float f11, float f12) {
        long d02 = a1.c.d0((j2 / 1000000) - this.f17016b, 0L, this.f17015a);
        int i10 = (d02 > 0L ? 1 : (d02 == 0L ? 0 : -1));
        if (i10 < 0) {
            return 0.0f;
        }
        if (i10 == 0) {
            return f12;
        }
        return (b(d02 * 1000000, f10, f11, f12) - b((d02 - 1) * 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // r.r
    public final long d(float f10, float f11, float f12) {
        return (this.f17016b + this.f17015a) * 1000000;
    }

    @Override // r.r
    public final float e(float f10, float f11, float f12) {
        return c(d(f10, f11, f12), f10, f11, f12);
    }

    @Override // r.d
    /* renamed from: f */
    public final f0 a(z zVar) {
        v7.g.f(zVar, "converter");
        return new f0(this);
    }
}
