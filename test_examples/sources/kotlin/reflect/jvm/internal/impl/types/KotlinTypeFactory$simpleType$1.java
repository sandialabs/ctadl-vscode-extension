package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import y9.e0;
import y9.f0;
import y9.v;

/* loaded from: classes.dex */
public final class KotlinTypeFactory$simpleType$1 extends Lambda implements u7.l<kotlin.reflect.jvm.internal.impl.types.checker.e, v> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e0 f14949j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ List<f0> f14950k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinTypeFactory$simpleType$1(List list, l lVar, e0 e0Var, boolean z10) {
        super(1);
        this.f14949j = e0Var;
        this.f14950k = list;
    }

    @Override // u7.l
    public final v U(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        kotlin.reflect.jvm.internal.impl.types.checker.e eVar2 = eVar;
        v7.g.f(eVar2, "refiner");
        int i10 = KotlinTypeFactory.f14947a;
        KotlinTypeFactory.a(this.f14949j, eVar2, this.f14950k);
        return null;
    }
}
