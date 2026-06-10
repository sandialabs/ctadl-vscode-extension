package y9;

/* loaded from: classes.dex */
public final class x extends i implements l0 {

    /* renamed from: j  reason: collision with root package name */
    public final v f18966j;

    /* renamed from: k  reason: collision with root package name */
    public final r f18967k;

    public x(v vVar, r rVar) {
        v7.g.f(vVar, "delegate");
        v7.g.f(rVar, "enhancement");
        this.f18966j = vVar;
        this.f18967k = rVar;
    }

    @Override // y9.l0
    public final m0 M0() {
        return this.f18966j;
    }

    @Override // y9.v
    public final v b1(boolean z10) {
        m0 M0 = a1.b.M0(this.f18966j.Y0(z10), this.f18967k.X0().Y0(z10));
        v7.g.d(M0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (v) M0;
    }

    @Override // y9.l0
    public final r c0() {
        return this.f18967k;
    }

    @Override // y9.v
    public final v c1(kotlin.reflect.jvm.internal.impl.types.l lVar) {
        v7.g.f(lVar, "newAttributes");
        m0 M0 = a1.b.M0(this.f18966j.a1(lVar), this.f18967k);
        v7.g.d(M0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (v) M0;
    }

    @Override // y9.i
    public final v d1() {
        return this.f18966j;
    }

    @Override // y9.i
    public final i f1(v vVar) {
        return new x(vVar, this.f18967k);
    }

    @Override // y9.i
    /* renamed from: g1 */
    public final x e1(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        r P0 = eVar.P0(this.f18966j);
        v7.g.d(P0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new x((v) P0, eVar.P0(this.f18967k));
    }

    @Override // y9.v
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f18967k + ")] " + this.f18966j;
    }
}
