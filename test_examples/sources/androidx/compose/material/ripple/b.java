package androidx.compose.material.ripple;

import a1.c;
import androidx.activity.e;
import g0.d;
import g0.g0;
import g0.g1;
import g0.s;
import s.m;
import s.n;
import u.i;
import v0.r;
import v7.g;

/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2180a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2181b;
    public final g1<r> c;

    public b() {
        throw null;
    }

    public b(boolean z10, float f10, g0 g0Var) {
        this.f2180a = z10;
        this.f2181b = f10;
        this.c = g0Var;
    }

    @Override // s.m
    public final n a(i iVar, d dVar) {
        boolean z10;
        long a10;
        g.f(iVar, "interactionSource");
        dVar.f(-1524341367);
        d0.i iVar2 = (d0.i) dVar.w(RippleThemeKt.f2163a);
        g1<r> g1Var = this.c;
        if (g1Var.getValue().f18135a != r.f18133g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            dVar.f(-1524341137);
            dVar.u();
            a10 = g1Var.getValue().f18135a;
        } else {
            dVar.f(-1524341088);
            a10 = iVar2.a(dVar);
            dVar.u();
        }
        d0.g b5 = b(iVar, this.f2180a, this.f2181b, c.l1(new r(a10), dVar), c.l1(iVar2.b(dVar), dVar), dVar);
        s.b(b5, iVar, new Ripple$rememberUpdatedInstance$1(iVar, b5, null), dVar);
        dVar.u();
        return b5;
    }

    public abstract d0.g b(i iVar, boolean z10, float f10, g0 g0Var, g0 g0Var2, d dVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f2180a == bVar.f2180a && b2.d.a(this.f2181b, bVar.f2181b) && g.a(this.c, bVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f2180a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return this.c.hashCode() + e.e(this.f2181b, i10 * 31, 31);
    }
}
