package o8;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;

/* loaded from: classes.dex */
public final class g implements u7.a<MemberScope> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ h f16424i;

    public g(h hVar) {
        this.f16424i = hVar;
    }

    @Override // u7.a
    public final MemberScope k0() {
        StringBuilder sb = new StringBuilder("Scope for type parameter ");
        h hVar = this.f16424i;
        sb.append(hVar.f16425i.b());
        return TypeIntersectionScope.a.a(sb.toString(), hVar.f16426j.getUpperBounds());
    }
}
