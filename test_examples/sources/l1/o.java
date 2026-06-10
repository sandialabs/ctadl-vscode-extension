package l1;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.LayoutDirection;
import q0.d;
import x0.a;

/* loaded from: classes.dex */
public final class o implements x0.f, x0.c {

    /* renamed from: i  reason: collision with root package name */
    public final x0.a f15757i = new x0.a();

    /* renamed from: j  reason: collision with root package name */
    public d f15758j;

    @Override // x0.f
    public final void F(v0.m mVar, long j2, long j10, float f10, androidx.datastore.preferences.protobuf.k kVar, v0.s sVar, int i10) {
        v7.g.f(mVar, "brush");
        v7.g.f(kVar, "style");
        this.f15757i.F(mVar, j2, j10, f10, kVar, sVar, i10);
    }

    @Override // b2.b
    public final float H(float f10) {
        return this.f15757i.H(f10);
    }

    @Override // x0.f
    public final void K(v0.h hVar, long j2, float f10, androidx.datastore.preferences.protobuf.k kVar, v0.s sVar, int i10) {
        v7.g.f(hVar, "path");
        v7.g.f(kVar, "style");
        this.f15757i.K(hVar, j2, f10, kVar, sVar, i10);
    }

    @Override // x0.f
    public final void L(long j2, float f10, long j10, float f11, androidx.datastore.preferences.protobuf.k kVar, v0.s sVar, int i10) {
        v7.g.f(kVar, "style");
        this.f15757i.L(j2, f10, j10, f11, kVar, sVar, i10);
    }

    @Override // x0.f
    public final a.b N() {
        return this.f15757i.f18550j;
    }

    @Override // x0.f
    public final void X(long j2, long j10, long j11, long j12, androidx.datastore.preferences.protobuf.k kVar, float f10, v0.s sVar, int i10) {
        this.f15757i.X(j2, j10, j11, j12, kVar, f10, sVar, i10);
    }

    @Override // x0.f
    public final void Y(long j2, long j10, long j11, float f10, androidx.datastore.preferences.protobuf.k kVar, v0.s sVar, int i10) {
        v7.g.f(kVar, "style");
        this.f15757i.Y(j2, j10, j11, f10, kVar, sVar, i10);
    }

    @Override // x0.f
    public final long a() {
        return this.f15757i.a();
    }

    @Override // b2.b
    public final int a0(float f10) {
        x0.a aVar = this.f15757i;
        aVar.getClass();
        return androidx.activity.e.a(f10, aVar);
    }

    public final void b(v0.o oVar, long j2, NodeCoordinator nodeCoordinator, d dVar) {
        v7.g.f(oVar, "canvas");
        v7.g.f(nodeCoordinator, "coordinator");
        d dVar2 = this.f15758j;
        this.f15758j = dVar;
        LayoutDirection layoutDirection = nodeCoordinator.f3499o.f3429y;
        x0.a aVar = this.f15757i;
        a.C0237a c0237a = aVar.f18549i;
        b2.b bVar = c0237a.f18553a;
        LayoutDirection layoutDirection2 = c0237a.f18554b;
        v0.o oVar2 = c0237a.c;
        long j10 = c0237a.f18555d;
        c0237a.f18553a = nodeCoordinator;
        v7.g.f(layoutDirection, "<set-?>");
        c0237a.f18554b = layoutDirection;
        c0237a.c = oVar;
        c0237a.f18555d = j2;
        oVar.m();
        dVar.f(this);
        oVar.l();
        a.C0237a c0237a2 = aVar.f18549i;
        c0237a2.getClass();
        v7.g.f(bVar, "<set-?>");
        c0237a2.f18553a = bVar;
        v7.g.f(layoutDirection2, "<set-?>");
        c0237a2.f18554b = layoutDirection2;
        v7.g.f(oVar2, "<set-?>");
        c0237a2.c = oVar2;
        c0237a2.f18555d = j10;
        this.f15758j = dVar2;
    }

    @Override // x0.f
    public final void d0(v0.z zVar, v0.m mVar, float f10, androidx.datastore.preferences.protobuf.k kVar, v0.s sVar, int i10) {
        v7.g.f(zVar, "path");
        v7.g.f(mVar, "brush");
        v7.g.f(kVar, "style");
        this.f15757i.d0(zVar, mVar, f10, kVar, sVar, i10);
    }

    @Override // x0.f
    public final long e0() {
        return this.f15757i.e0();
    }

    @Override // b2.b
    public final long g0(long j2) {
        x0.a aVar = this.f15757i;
        aVar.getClass();
        return androidx.activity.e.d(j2, aVar);
    }

    @Override // b2.b
    public final float getDensity() {
        return this.f15757i.getDensity();
    }

    @Override // x0.f
    public final LayoutDirection getLayoutDirection() {
        return this.f15757i.f18549i.f18554b;
    }

    @Override // b2.b
    public final float i0(long j2) {
        x0.a aVar = this.f15757i;
        aVar.getClass();
        return androidx.activity.e.c(j2, aVar);
    }

    @Override // x0.f
    public final void j0(v0.m mVar, long j2, long j10, long j11, float f10, androidx.datastore.preferences.protobuf.k kVar, v0.s sVar, int i10) {
        v7.g.f(mVar, "brush");
        v7.g.f(kVar, "style");
        this.f15757i.j0(mVar, j2, j10, j11, f10, kVar, sVar, i10);
    }

    @Override // x0.c
    public final void o0() {
        d dVar;
        v0.o b5 = this.f15757i.f18550j.b();
        d dVar2 = this.f15758j;
        v7.g.c(dVar2);
        d.c cVar = dVar2.e().f16829m;
        if (cVar != null && (cVar.f16827k & 4) != 0) {
            while (cVar != null) {
                int i10 = cVar.f16826j;
                if ((i10 & 2) != 0) {
                    break;
                } else if ((i10 & 4) != 0) {
                    dVar = (d) cVar;
                    break;
                } else {
                    cVar = cVar.f16829m;
                }
            }
        }
        dVar = null;
        d dVar3 = dVar;
        if (dVar3 != null) {
            v7.g.f(b5, "canvas");
            NodeCoordinator D = v0.p.D(dVar3, 4);
            long M = v8.b.M(D.f12642k);
            LayoutNode layoutNode = D.f3499o;
            layoutNode.getClass();
            m0.b.b1(layoutNode).getSharedDrawScope().b(b5, M, D, dVar3);
            return;
        }
        NodeCoordinator D2 = v0.p.D(dVar2, 4);
        if (D2.U0() == dVar2) {
            D2 = D2.f3500p;
            v7.g.c(D2);
        }
        D2.h1(b5);
    }

    @Override // x0.f
    public final void p0(v0.w wVar, long j2, long j10, long j11, long j12, float f10, androidx.datastore.preferences.protobuf.k kVar, v0.s sVar, int i10, int i11) {
        v7.g.f(wVar, "image");
        v7.g.f(kVar, "style");
        this.f15757i.p0(wVar, j2, j10, j11, j12, f10, kVar, sVar, i10, i11);
    }

    @Override // b2.b
    public final float r0(int i10) {
        return this.f15757i.r0(i10);
    }

    @Override // b2.b
    public final float t0(float f10) {
        return f10 / this.f15757i.getDensity();
    }

    @Override // b2.b
    public final float y() {
        return this.f15757i.y();
    }
}
