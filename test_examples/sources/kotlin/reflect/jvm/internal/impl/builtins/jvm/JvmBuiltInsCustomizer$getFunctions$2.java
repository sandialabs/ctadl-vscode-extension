package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import h9.e;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import u7.l;

/* loaded from: classes.dex */
final class JvmBuiltInsCustomizer$getFunctions$2 extends Lambda implements l<MemberScope, Collection<? extends g>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e f13409j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$getFunctions$2(e eVar) {
        super(1);
        this.f13409j = eVar;
    }

    @Override // u7.l
    public final Collection<? extends g> U(MemberScope memberScope) {
        MemberScope memberScope2 = memberScope;
        v7.g.f(memberScope2, "it");
        return memberScope2.a(this.f13409j, NoLookupLocation.FROM_BUILTINS);
    }
}
