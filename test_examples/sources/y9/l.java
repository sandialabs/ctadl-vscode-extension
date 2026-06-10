package y9;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: l  reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.types.l f18956l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(kotlin.reflect.jvm.internal.impl.builtins.e eVar, kotlin.reflect.jvm.internal.impl.types.l lVar) {
        super(r0, r3);
        v7.g.f(lVar, "attributes");
        v o10 = eVar.o();
        v7.g.e(o10, "builtIns.nothingType");
        v p10 = eVar.p();
        v7.g.e(p10, "builtIns.nullableAnyType");
        this.f18956l = lVar;
    }

    @Override // y9.n, y9.r
    public final kotlin.reflect.jvm.internal.impl.types.l T0() {
        return this.f18956l;
    }

    @Override // y9.n, y9.r
    public final boolean V0() {
        return false;
    }

    @Override // y9.r
    public final r W0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // y9.m0
    public final m0 Y0(boolean z10) {
        return this;
    }

    @Override // y9.m0
    public final m0 Z0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // y9.m0
    public final m0 a1(kotlin.reflect.jvm.internal.impl.types.l lVar) {
        v7.g.f(lVar, "newAttributes");
        return new l(TypeUtilsKt.g(this.f18959k), lVar);
    }

    @Override // y9.n
    public final v b1() {
        return this.f18959k;
    }

    @Override // y9.n
    public final String c1(DescriptorRenderer descriptorRenderer, kotlin.reflect.jvm.internal.impl.renderer.b bVar) {
        v7.g.f(descriptorRenderer, "renderer");
        v7.g.f(bVar, "options");
        return "dynamic";
    }
}
