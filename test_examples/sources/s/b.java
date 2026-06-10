package s;

import androidx.compose.ui.platform.o0;
import kotlin.NoWhenBranchMatchedException;
import v0.c0;
import v0.h0;
import v0.x;

/* loaded from: classes.dex */
public final class b extends o0 implements s0.f {

    /* renamed from: j  reason: collision with root package name */
    public final v0.r f17196j;

    /* renamed from: k  reason: collision with root package name */
    public final v0.m f17197k;

    /* renamed from: l  reason: collision with root package name */
    public final float f17198l;

    /* renamed from: m  reason: collision with root package name */
    public final h0 f17199m;
    public u0.f n;

    /* renamed from: o  reason: collision with root package name */
    public x f17200o;

    public b() {
        throw null;
    }

    public b(v0.r rVar, h0 h0Var, u7.l lVar) {
        super(lVar);
        this.f17196j = rVar;
        this.f17197k = null;
        this.f17198l = 1.0f;
        this.f17199m = h0Var;
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        if (bVar != null && v7.g.a(this.f17196j, bVar.f17196j) && v7.g.a(this.f17197k, bVar.f17197k)) {
            return ((this.f17198l > bVar.f17198l ? 1 : (this.f17198l == bVar.f17198l ? 0 : -1)) == 0) && v7.g.a(this.f17199m, bVar.f17199m);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    @Override // s0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(x0.c cVar) {
        x a10;
        String str;
        String str2;
        x xVar;
        v0.h hVar;
        v0.h hVar2;
        v7.g.f(cVar, "<this>");
        c0.a aVar = c0.f18087a;
        v0.m mVar = this.f17197k;
        v0.r rVar = this.f17196j;
        h0 h0Var = this.f17199m;
        if (h0Var == aVar) {
            if (rVar != null) {
                x0.e.e(cVar, rVar.f18135a, 0L, 126);
            }
            if (mVar != null) {
                x0.e.d(cVar, mVar, 0L, 0L, this.f17198l, null, 118);
            }
        } else {
            long a11 = cVar.a();
            u0.f fVar = this.n;
            int i10 = u0.f.f17737d;
            boolean z10 = false;
            if ((fVar instanceof u0.f) && a11 == fVar.f17738a) {
                z10 = true;
            }
            if (z10 && cVar.getLayoutDirection() == null) {
                a10 = this.f17200o;
                v7.g.c(a10);
            } else {
                a10 = h0Var.a(cVar.a(), cVar.getLayoutDirection(), cVar);
            }
            x xVar2 = a10;
            if (rVar == null) {
                str = "outline";
            } else {
                long j2 = rVar.f18135a;
                x0.h hVar3 = x0.h.f18561i;
                v7.g.f(xVar2, "outline");
                v7.g.f(hVar3, "style");
                if (!(xVar2 instanceof x.b)) {
                    str = "outline";
                    if (!(xVar2 instanceof x.c)) {
                        str2 = "style";
                        xVar = xVar2;
                        if (xVar instanceof x.a) {
                            x.a aVar2 = (x.a) xVar;
                            hVar2 = null;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        x.c cVar2 = (x.c) xVar2;
                        hVar2 = cVar2.f18142b;
                        if (hVar2 != null) {
                            str2 = "style";
                            xVar = xVar2;
                        } else {
                            u0.e eVar = cVar2.f18141a;
                            float b5 = u0.a.b(eVar.f17735h);
                            float f10 = eVar.f17729a;
                            float f11 = eVar.f17730b;
                            str2 = "style";
                            xVar = xVar2;
                            cVar.X(j2, a1.c.s(f10, f11), a1.c.v(eVar.c - f10, eVar.f17731d - f11), a1.c.m(b5, b5), hVar3, 1.0f, null, 3);
                            if (mVar != null) {
                                float f12 = this.f17198l;
                                x0.h hVar4 = x0.h.f18561i;
                                v7.g.f(xVar, str);
                                v7.g.f(hVar4, str2);
                                if (xVar instanceof x.b) {
                                    u0.d dVar = ((x.b) xVar).f18140a;
                                    cVar.F(mVar, a1.c.s(dVar.f17726a, dVar.f17727b), a1.c.v(dVar.c - dVar.f17726a, dVar.f17728d - dVar.f17727b), f12, hVar4, null, 3);
                                } else {
                                    if (xVar instanceof x.c) {
                                        x.c cVar3 = (x.c) xVar;
                                        v0.h hVar5 = cVar3.f18142b;
                                        if (hVar5 != null) {
                                            hVar = hVar5;
                                        } else {
                                            u0.e eVar2 = cVar3.f18141a;
                                            float b10 = u0.a.b(eVar2.f17735h);
                                            float f13 = eVar2.f17729a;
                                            float f14 = eVar2.f17730b;
                                            cVar.j0(mVar, a1.c.s(f13, f14), a1.c.v(eVar2.c - f13, eVar2.f17731d - f14), a1.c.m(b10, b10), f12, hVar4, null, 3);
                                        }
                                    } else if (xVar instanceof x.a) {
                                        x.a aVar3 = (x.a) xVar;
                                        hVar = null;
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar.d0(hVar, mVar, f12, hVar4, null, 3);
                                }
                            }
                            this.f17200o = xVar;
                            this.n = new u0.f(cVar.a());
                        }
                    }
                    cVar.K(hVar2, j2, 1.0f, hVar3, null, 3);
                    if (mVar != null) {
                    }
                    this.f17200o = xVar;
                    this.n = new u0.f(cVar.a());
                } else {
                    u0.d dVar2 = ((x.b) xVar2).f18140a;
                    str = "outline";
                    cVar.Y(j2, a1.c.s(dVar2.f17726a, dVar2.f17727b), a1.c.v(dVar2.c - dVar2.f17726a, dVar2.f17728d - dVar2.f17727b), 1.0f, hVar3, null, 3);
                }
            }
            str2 = "style";
            xVar = xVar2;
            if (mVar != null) {
            }
            this.f17200o = xVar;
            this.n = new u0.f(cVar.a());
        }
        cVar.o0();
    }

    @Override // q0.d
    public final Object h0(Object obj, u7.p pVar) {
        v7.g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        v0.r rVar = this.f17196j;
        if (rVar != null) {
            i10 = m7.j.a(rVar.f18135a);
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        v0.m mVar = this.f17197k;
        if (mVar != null) {
            i11 = mVar.hashCode();
        }
        return this.f17199m.hashCode() + androidx.activity.e.e(this.f17198l, (i12 + i11) * 31, 31);
    }

    public final String toString() {
        return "Background(color=" + this.f17196j + ", brush=" + this.f17197k + ", alpha = " + this.f17198l + ", shape=" + this.f17199m + ')';
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(u7.l lVar) {
        return a4.b.a(this, lVar);
    }
}
