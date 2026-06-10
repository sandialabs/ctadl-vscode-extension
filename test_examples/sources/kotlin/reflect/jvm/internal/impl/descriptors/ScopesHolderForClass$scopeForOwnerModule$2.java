package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes.dex */
public final class ScopesHolderForClass$scopeForOwnerModule$2 extends Lambda implements u7.a<T> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ScopesHolderForClass<T> f13462j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopesHolderForClass$scopeForOwnerModule$2(ScopesHolderForClass<T> scopesHolderForClass) {
        super(0);
        this.f13462j = scopesHolderForClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u7.a
    public final Object k0() {
        ScopesHolderForClass<T> scopesHolderForClass = this.f13462j;
        return (MemberScope) scopesHolderForClass.f13460b.U(scopesHolderForClass.c);
    }
}
