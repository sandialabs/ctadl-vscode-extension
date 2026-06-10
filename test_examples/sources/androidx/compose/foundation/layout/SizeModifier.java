package androidx.compose.foundation.layout;

import androidx.activity.e;
import androidx.compose.ui.platform.o0;
import j1.b0;
import j1.k;
import j1.r;
import j1.t;
import q0.d;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class SizeModifier extends o0 implements k {

    /* renamed from: j  reason: collision with root package name */
    public final float f1973j;

    /* renamed from: k  reason: collision with root package name */
    public final float f1974k;

    /* renamed from: l  reason: collision with root package name */
    public final float f1975l;

    /* renamed from: m  reason: collision with root package name */
    public final float f1976m;
    public final boolean n;

    public SizeModifier() {
        throw null;
    }

    public /* synthetic */ SizeModifier(float f10, float f11, float f12, float f13, l lVar, int i10) {
        this((i10 & 1) != 0 ? Float.NaN : f10, (i10 & 2) != 0 ? Float.NaN : f11, (i10 & 4) != 0 ? Float.NaN : f12, (i10 & 8) != 0 ? Float.NaN : f13, true, lVar);
    }

    public SizeModifier(float f10, float f11, float f12, float f13, boolean z10, l lVar) {
        super(lVar);
        this.f1973j = f10;
        this.f1974k = f11;
        this.f1975l = f12;
        this.f1976m = f13;
        this.n = z10;
    }

    @Override // q0.d
    public final /* synthetic */ d Z(d dVar) {
        return e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SizeModifier) {
            SizeModifier sizeModifier = (SizeModifier) obj;
            return b2.d.a(this.f1973j, sizeModifier.f1973j) && b2.d.a(this.f1974k, sizeModifier.f1974k) && b2.d.a(this.f1975l, sizeModifier.f1975l) && b2.d.a(this.f1976m, sizeModifier.f1976m) && this.n == sizeModifier.n;
        }
        return false;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return e.e(this.f1976m, e.e(this.f1975l, e.e(this.f1974k, Float.floatToIntBits(this.f1973j) * 31, 31), 31), 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    @Override // j1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r n(t tVar, j1.p pVar, long j2) {
        int i10;
        int i11;
        int i12;
        float f10;
        int h10;
        int f11;
        int g10;
        int e10;
        long b5;
        r m02;
        g.f(tVar, "$this$measure");
        float f12 = this.f1975l;
        int i13 = 0;
        if (!b2.d.a(f12, Float.NaN)) {
            b2.d dVar = new b2.d(f12);
            b2.d dVar2 = new b2.d(0);
            if (dVar.compareTo(dVar2) < 0) {
                dVar = dVar2;
            }
            i10 = tVar.a0(dVar.f6339i);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        float f13 = this.f1976m;
        if (!b2.d.a(f13, Float.NaN)) {
            b2.d dVar3 = new b2.d(f13);
            b2.d dVar4 = new b2.d(0);
            if (dVar3.compareTo(dVar4) < 0) {
                dVar3 = dVar4;
            }
            i11 = tVar.a0(dVar3.f6339i);
        } else {
            i11 = Integer.MAX_VALUE;
        }
        float f14 = this.f1973j;
        if (!b2.d.a(f14, Float.NaN)) {
            i12 = tVar.a0(f14);
            if (i12 > i10) {
                i12 = i10;
            }
            if (i12 < 0) {
                i12 = 0;
            }
            if (i12 != Integer.MAX_VALUE) {
                f10 = this.f1974k;
                if (!b2.d.a(f10, Float.NaN)) {
                    int a02 = tVar.a0(f10);
                    if (a02 > i11) {
                        a02 = i11;
                    }
                    if (a02 < 0) {
                        a02 = 0;
                    }
                    if (a02 != Integer.MAX_VALUE) {
                        i13 = a02;
                    }
                }
                long b10 = v8.b.b(i12, i10, i13, i11);
                if (!this.n) {
                    b5 = v8.b.b(a1.c.c0(b2.a.h(b10), b2.a.h(j2), b2.a.f(j2)), a1.c.c0(b2.a.f(b10), b2.a.h(j2), b2.a.f(j2)), a1.c.c0(b2.a.g(b10), b2.a.g(j2), b2.a.e(j2)), a1.c.c0(b2.a.e(b10), b2.a.g(j2), b2.a.e(j2)));
                } else {
                    if (!b2.d.a(f14, Float.NaN)) {
                        h10 = b2.a.h(b10);
                    } else {
                        h10 = b2.a.h(j2);
                        int f15 = b2.a.f(b10);
                        if (h10 > f15) {
                            h10 = f15;
                        }
                    }
                    if (!b2.d.a(f12, Float.NaN)) {
                        f11 = b2.a.f(b10);
                    } else {
                        f11 = b2.a.f(j2);
                        int h11 = b2.a.h(b10);
                        if (f11 < h11) {
                            f11 = h11;
                        }
                    }
                    if (!b2.d.a(f10, Float.NaN)) {
                        g10 = b2.a.g(b10);
                    } else {
                        g10 = b2.a.g(j2);
                        int e11 = b2.a.e(b10);
                        if (g10 > e11) {
                            g10 = e11;
                        }
                    }
                    if (!b2.d.a(f13, Float.NaN)) {
                        e10 = b2.a.e(b10);
                    } else {
                        e10 = b2.a.e(j2);
                        int g11 = b2.a.g(b10);
                        if (e10 < g11) {
                            e10 = g11;
                        }
                    }
                    b5 = v8.b.b(h10, f11, g10, e10);
                }
                b0 b11 = pVar.b(b5);
                m02 = tVar.m0(b11.f12640i, b11.f12641j, kotlin.collections.d.K1(), new SizeModifier$measure$1(b11));
                return m02;
            }
        }
        i12 = 0;
        f10 = this.f1974k;
        if (!b2.d.a(f10, Float.NaN)) {
        }
        long b102 = v8.b.b(i12, i10, i13, i11);
        if (!this.n) {
        }
        b0 b112 = pVar.b(b5);
        m02 = tVar.m0(b112.f12640i, b112.f12641j, kotlin.collections.d.K1(), new SizeModifier$measure$1(b112));
        return m02;
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
