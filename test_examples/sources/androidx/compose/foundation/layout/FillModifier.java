package androidx.compose.foundation.layout;

import androidx.activity.e;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import j1.b0;
import j1.k;
import j1.r;
import j1.t;
import m7.n;
import q0.d;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class FillModifier extends o0 implements k {

    /* renamed from: j  reason: collision with root package name */
    public final Direction f1912j;

    /* renamed from: k  reason: collision with root package name */
    public final float f1913k;

    public FillModifier(Direction direction, float f10, l<? super n0, n> lVar) {
        super(lVar);
        this.f1912j = direction;
        this.f1913k = f10;
    }

    @Override // q0.d
    public final /* synthetic */ d Z(d dVar) {
        return e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FillModifier) {
            FillModifier fillModifier = (FillModifier) obj;
            if (this.f1912j == fillModifier.f1912j) {
                return (this.f1913k > fillModifier.f1913k ? 1 : (this.f1913k == fillModifier.f1913k ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1913k) + (this.f1912j.hashCode() * 31);
    }

    @Override // j1.k
    public final r n(t tVar, j1.p pVar, long j2) {
        int h10;
        int f10;
        int e10;
        int i10;
        r m02;
        g.f(tVar, "$this$measure");
        boolean d5 = b2.a.d(j2);
        float f11 = this.f1913k;
        Direction direction = this.f1912j;
        if (d5 && direction != Direction.Vertical) {
            h10 = a1.c.c0(m0.b.g1(b2.a.f(j2) * f11), b2.a.h(j2), b2.a.f(j2));
            f10 = h10;
        } else {
            h10 = b2.a.h(j2);
            f10 = b2.a.f(j2);
        }
        if (b2.a.c(j2) && direction != Direction.Horizontal) {
            i10 = a1.c.c0(m0.b.g1(b2.a.e(j2) * f11), b2.a.g(j2), b2.a.e(j2));
            e10 = i10;
        } else {
            int g10 = b2.a.g(j2);
            e10 = b2.a.e(j2);
            i10 = g10;
        }
        b0 b5 = pVar.b(v8.b.b(h10, f10, i10, e10));
        m02 = tVar.m0(b5.f12640i, b5.f12641j, kotlin.collections.d.K1(), new FillModifier$measure$1(b5));
        return m02;
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
