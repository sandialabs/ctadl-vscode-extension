package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import y9.e0;
import y9.f0;
import y9.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1 extends Lambda implements u7.l<kotlin.reflect.jvm.internal.impl.types.checker.e, v> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e0 f14951j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ List<f0> f14952k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ MemberScope f14953l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1(List list, MemberScope memberScope, l lVar, e0 e0Var, boolean z10) {
        super(1);
        this.f14951j = e0Var;
        this.f14952k = list;
        this.f14953l = memberScope;
    }

    @Override // u7.l
    public final v U(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        kotlin.reflect.jvm.internal.impl.types.checker.e eVar2 = eVar;
        v7.g.f(eVar2, "kotlinTypeRefiner");
        int i10 = KotlinTypeFactory.f14947a;
        KotlinTypeFactory.a(this.f14951j, eVar2, this.f14952k);
        return null;
    }
}
