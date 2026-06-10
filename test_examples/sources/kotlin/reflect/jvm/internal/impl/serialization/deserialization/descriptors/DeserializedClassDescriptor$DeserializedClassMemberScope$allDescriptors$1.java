package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import l8.f;
import r9.c;

/* loaded from: classes.dex */
public final class DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1 extends Lambda implements u7.a<Collection<? extends f>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedClassDescriptor.DeserializedClassMemberScope f14843j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1(DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope) {
        super(0);
        this.f14843j = deserializedClassMemberScope;
    }

    @Override // u7.a
    public final Collection<? extends f> k0() {
        c cVar = c.f17182m;
        MemberScope.f14737a.getClass();
        return this.f14843j.i(cVar, MemberScope.Companion.f14739b);
    }
}
