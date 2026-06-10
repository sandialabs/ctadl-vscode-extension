package y9;

/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: j  reason: collision with root package name */
    public final v f18940j;

    /* renamed from: k  reason: collision with root package name */
    public final v f18941k;

    public a(v vVar, v vVar2) {
        v7.g.f(vVar, "delegate");
        v7.g.f(vVar2, "abbreviation");
        this.f18940j = vVar;
        this.f18941k = vVar2;
    }

    @Override // y9.v
    public final v c1(kotlin.reflect.jvm.internal.impl.types.l lVar) {
        v7.g.f(lVar, "newAttributes");
        return new a(this.f18940j.a1(lVar), this.f18941k);
    }

    @Override // y9.i
    public final v d1() {
        return this.f18940j;
    }

    @Override // y9.i
    public final i f1(v vVar) {
        return new a(vVar, this.f18941k);
    }

    @Override // y9.v
    /* renamed from: g1 */
    public final a b1(boolean z10) {
        return new a(this.f18940j.Y0(z10), this.f18941k.Y0(z10));
    }

    @Override // y9.i
    /* renamed from: h1 */
    public final a e1(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        r P0 = eVar.P0(this.f18940j);
        v7.g.d(P0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        r P02 = eVar.P0(this.f18941k);
        v7.g.d(P02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new a((v) P0, (v) P02);
    }
}
