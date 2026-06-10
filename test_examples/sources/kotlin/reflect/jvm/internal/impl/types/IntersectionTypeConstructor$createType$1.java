package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;
import y9.v;

/* loaded from: classes.dex */
public final class IntersectionTypeConstructor$createType$1 extends Lambda implements u7.l<kotlin.reflect.jvm.internal.impl.types.checker.e, v> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ IntersectionTypeConstructor f14944j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntersectionTypeConstructor$createType$1(IntersectionTypeConstructor intersectionTypeConstructor) {
        super(1);
        this.f14944j = intersectionTypeConstructor;
    }

    @Override // u7.l
    public final v U(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        kotlin.reflect.jvm.internal.impl.types.checker.e eVar2 = eVar;
        v7.g.f(eVar2, "kotlinTypeRefiner");
        return this.f14944j.i(eVar2).g();
    }
}
