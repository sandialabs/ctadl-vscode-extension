package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import h9.e;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import l8.z;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
final class LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1 extends Lambda implements l<MemberScope, Collection<? extends z>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e f13819j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1(e eVar) {
        super(1);
        this.f13819j = eVar;
    }

    @Override // u7.l
    public final Collection<? extends z> U(MemberScope memberScope) {
        MemberScope memberScope2 = memberScope;
        g.f(memberScope2, "it");
        return memberScope2.b(this.f13819j, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
    }
}
