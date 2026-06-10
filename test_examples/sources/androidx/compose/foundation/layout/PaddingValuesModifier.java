package androidx.compose.foundation.layout;

import androidx.activity.e;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.unit.LayoutDirection;
import j1.b0;
import j1.k;
import j1.r;
import j1.t;
import m7.n;
import q0.d;
import u7.l;
import u7.p;
import v.o;
import v7.g;

/* loaded from: classes.dex */
public final class PaddingValuesModifier extends o0 implements k {

    /* renamed from: j  reason: collision with root package name */
    public final o f1936j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingValuesModifier(o oVar, l<? super n0, n> lVar) {
        super(lVar);
        g.f(oVar, "paddingValues");
        g.f(lVar, "inspectorInfo");
        this.f1936j = oVar;
    }

    @Override // q0.d
    public final /* synthetic */ d Z(d dVar) {
        return e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        PaddingValuesModifier paddingValuesModifier = obj instanceof PaddingValuesModifier ? (PaddingValuesModifier) obj : null;
        if (paddingValuesModifier == null) {
            return false;
        }
        return g.a(this.f1936j, paddingValuesModifier.f1936j);
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return this.f1936j.hashCode();
    }

    @Override // j1.k
    public final r n(t tVar, j1.p pVar, long j2) {
        r m02;
        g.f(tVar, "$this$measure");
        LayoutDirection layoutDirection = tVar.getLayoutDirection();
        o oVar = this.f1936j;
        boolean z10 = false;
        float f10 = 0;
        if (Float.compare(oVar.b(layoutDirection), f10) >= 0 && Float.compare(oVar.c(), f10) >= 0 && Float.compare(oVar.d(tVar.getLayoutDirection()), f10) >= 0 && Float.compare(oVar.a(), f10) >= 0) {
            z10 = true;
        }
        if (z10) {
            int a02 = tVar.a0(oVar.d(tVar.getLayoutDirection())) + tVar.a0(oVar.b(tVar.getLayoutDirection()));
            int a03 = tVar.a0(oVar.a()) + tVar.a0(oVar.c());
            b0 b5 = pVar.b(v8.b.A(j2, -a02, -a03));
            m02 = tVar.m0(v8.b.q(j2, b5.f12640i + a02), v8.b.p(j2, b5.f12641j + a03), kotlin.collections.d.K1(), new PaddingValuesModifier$measure$2(b5, tVar, this));
            return m02;
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
