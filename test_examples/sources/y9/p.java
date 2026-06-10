package y9;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

/* loaded from: classes.dex */
public final class p extends n implements l0 {

    /* renamed from: l  reason: collision with root package name */
    public final n f18960l;

    /* renamed from: m  reason: collision with root package name */
    public final r f18961m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar, r rVar) {
        super(nVar.f18958j, nVar.f18959k);
        v7.g.f(nVar, "origin");
        v7.g.f(rVar, "enhancement");
        this.f18960l = nVar;
        this.f18961m = rVar;
    }

    @Override // y9.l0
    public final m0 M0() {
        return this.f18960l;
    }

    @Override // y9.m0
    public final m0 Y0(boolean z10) {
        return a1.b.M0(this.f18960l.Y0(z10), this.f18961m.X0().Y0(z10));
    }

    @Override // y9.m0
    public final m0 a1(kotlin.reflect.jvm.internal.impl.types.l lVar) {
        v7.g.f(lVar, "newAttributes");
        return a1.b.M0(this.f18960l.a1(lVar), this.f18961m);
    }

    @Override // y9.n
    public final v b1() {
        return this.f18960l.b1();
    }

    @Override // y9.l0
    public final r c0() {
        return this.f18961m;
    }

    @Override // y9.n
    public final String c1(DescriptorRenderer descriptorRenderer, kotlin.reflect.jvm.internal.impl.renderer.b bVar) {
        v7.g.f(descriptorRenderer, "renderer");
        v7.g.f(bVar, "options");
        return bVar.h() ? descriptorRenderer.u(this.f18961m) : this.f18960l.c1(descriptorRenderer, bVar);
    }

    @Override // y9.m0
    /* renamed from: d1 */
    public final p Z0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        r P0 = eVar.P0(this.f18960l);
        v7.g.d(P0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new p((n) P0, eVar.P0(this.f18961m));
    }

    @Override // y9.n
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f18961m + ")] " + this.f18960l;
    }
}
