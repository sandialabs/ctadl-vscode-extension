package androidx.compose.foundation.layout;

import androidx.activity.e;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import g0.k0;
import j1.b0;
import j1.k;
import j1.r;
import j1.t;
import k1.d;
import k1.f;
import k1.h;
import m7.n;
import u7.l;
import u7.p;
import v.v;
import v7.g;

/* loaded from: classes.dex */
public final class InsetsPaddingModifier extends o0 implements k, d, f<v> {

    /* renamed from: j  reason: collision with root package name */
    public final v f1915j;

    /* renamed from: k  reason: collision with root package name */
    public final k0 f1916k;

    /* renamed from: l  reason: collision with root package name */
    public final k0 f1917l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsetsPaddingModifier(v vVar, l<? super n0, n> lVar) {
        super(lVar);
        g.f(lVar, "inspectorInfo");
        this.f1915j = vVar;
        this.f1916k = a1.c.V0(vVar);
        this.f1917l = a1.c.V0(vVar);
    }

    @Override // k1.d
    public final void T(k1.g gVar) {
        g.f(gVar, "scope");
        v vVar = (v) gVar.i(WindowInsetsPaddingKt.f1985a);
        v vVar2 = this.f1915j;
        g.f(vVar2, "<this>");
        g.f(vVar, "insets");
        this.f1916k.setValue(new v.g(vVar2, vVar));
        this.f1917l.setValue(a1.c.U1(vVar, vVar2));
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InsetsPaddingModifier) {
            return g.a(((InsetsPaddingModifier) obj).f1915j, this.f1915j);
        }
        return false;
    }

    @Override // k1.f
    public final h<v> getKey() {
        return WindowInsetsPaddingKt.f1985a;
    }

    @Override // k1.f
    public final v getValue() {
        return (v) this.f1917l.getValue();
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        return this.f1915j.hashCode();
    }

    @Override // j1.k
    public final r n(t tVar, j1.p pVar, long j2) {
        r m02;
        g.f(tVar, "$this$measure");
        k0 k0Var = this.f1916k;
        int c = ((v) k0Var.getValue()).c(tVar, tVar.getLayoutDirection());
        int d5 = ((v) k0Var.getValue()).d(tVar);
        int b5 = ((v) k0Var.getValue()).b(tVar, tVar.getLayoutDirection()) + c;
        int a10 = ((v) k0Var.getValue()).a(tVar) + d5;
        b0 b10 = pVar.b(v8.b.A(j2, -b5, -a10));
        m02 = tVar.m0(v8.b.q(j2, b10.f12640i + b5), v8.b.p(j2, b10.f12641j + a10), kotlin.collections.d.K1(), new InsetsPaddingModifier$measure$1(c, d5, b10));
        return m02;
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
