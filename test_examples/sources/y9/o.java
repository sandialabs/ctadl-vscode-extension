package y9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes.dex */
public final class o extends n implements f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v vVar, v vVar2) {
        super(vVar, vVar2);
        v7.g.f(vVar, "lowerBound");
        v7.g.f(vVar2, "upperBound");
    }

    @Override // y9.f
    public final m0 K(r rVar) {
        m0 c;
        v7.g.f(rVar, "replacement");
        m0 X0 = rVar.X0();
        if (X0 instanceof n) {
            c = X0;
        } else if (!(X0 instanceof v)) {
            throw new NoWhenBranchMatchedException();
        } else {
            v vVar = (v) X0;
            c = KotlinTypeFactory.c(vVar, vVar.Y0(true));
        }
        return a1.b.f0(c, X0);
    }

    @Override // y9.m0
    public final m0 Y0(boolean z10) {
        return KotlinTypeFactory.c(this.f18958j.Y0(z10), this.f18959k.Y0(z10));
    }

    @Override // y9.m0
    public final m0 a1(kotlin.reflect.jvm.internal.impl.types.l lVar) {
        v7.g.f(lVar, "newAttributes");
        return KotlinTypeFactory.c(this.f18958j.a1(lVar), this.f18959k.a1(lVar));
    }

    @Override // y9.n
    public final v b1() {
        return this.f18958j;
    }

    @Override // y9.n
    public final String c1(DescriptorRenderer descriptorRenderer, kotlin.reflect.jvm.internal.impl.renderer.b bVar) {
        v7.g.f(descriptorRenderer, "renderer");
        v7.g.f(bVar, "options");
        boolean j2 = bVar.j();
        v vVar = this.f18959k;
        v vVar2 = this.f18958j;
        if (j2) {
            return "(" + descriptorRenderer.u(vVar2) + ".." + descriptorRenderer.u(vVar) + ')';
        }
        return descriptorRenderer.r(descriptorRenderer.u(vVar2), descriptorRenderer.u(vVar), TypeUtilsKt.g(this));
    }

    @Override // y9.m0
    /* renamed from: d1 */
    public final n Z0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        r P0 = eVar.P0(this.f18958j);
        v7.g.d(P0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        r P02 = eVar.P0(this.f18959k);
        v7.g.d(P02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new o((v) P0, (v) P02);
    }

    @Override // y9.n
    public final String toString() {
        return "(" + this.f18958j + ".." + this.f18959k + ')';
    }

    @Override // y9.f
    public final boolean z0() {
        v vVar = this.f18958j;
        return (vVar.U0().c() instanceof l8.i0) && v7.g.a(vVar.U0(), this.f18959k.U0());
    }
}
