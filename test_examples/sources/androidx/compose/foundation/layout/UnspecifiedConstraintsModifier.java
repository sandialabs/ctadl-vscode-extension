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
public final class UnspecifiedConstraintsModifier extends o0 implements k {

    /* renamed from: j  reason: collision with root package name */
    public final float f1980j;

    /* renamed from: k  reason: collision with root package name */
    public final float f1981k;

    public UnspecifiedConstraintsModifier() {
        throw null;
    }

    public UnspecifiedConstraintsModifier(float f10, float f11, l lVar) {
        super(lVar);
        this.f1980j = f10;
        this.f1981k = f11;
    }

    @Override // q0.d
    public final /* synthetic */ d Z(d dVar) {
        return e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UnspecifiedConstraintsModifier) {
            UnspecifiedConstraintsModifier unspecifiedConstraintsModifier = (UnspecifiedConstraintsModifier) obj;
            return b2.d.a(this.f1980j, unspecifiedConstraintsModifier.f1980j) && b2.d.a(this.f1981k, unspecifiedConstraintsModifier.f1981k);
        }
        return false;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1981k) + (Float.floatToIntBits(this.f1980j) * 31);
    }

    @Override // j1.k
    public final r n(t tVar, j1.p pVar, long j2) {
        int h10;
        r m02;
        g.f(tVar, "$this$measure");
        float f10 = this.f1980j;
        int i10 = 0;
        if (!b2.d.a(f10, Float.NaN) && b2.a.h(j2) == 0) {
            h10 = tVar.a0(f10);
            int f11 = b2.a.f(j2);
            if (h10 > f11) {
                h10 = f11;
            }
            if (h10 < 0) {
                h10 = 0;
            }
        } else {
            h10 = b2.a.h(j2);
        }
        int f12 = b2.a.f(j2);
        float f13 = this.f1981k;
        if (!b2.d.a(f13, Float.NaN) && b2.a.g(j2) == 0) {
            int a02 = tVar.a0(f13);
            int e10 = b2.a.e(j2);
            if (a02 > e10) {
                a02 = e10;
            }
            if (a02 >= 0) {
                i10 = a02;
            }
        } else {
            i10 = b2.a.g(j2);
        }
        b0 b5 = pVar.b(v8.b.b(h10, f12, i10, b2.a.e(j2)));
        m02 = tVar.m0(b5.f12640i, b5.f12641j, kotlin.collections.d.K1(), new UnspecifiedConstraintsModifier$measure$1(b5));
        return m02;
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
