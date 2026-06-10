package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import y9.r;

/* loaded from: classes.dex */
public final class DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1 extends Lambda implements u7.a<Collection<? extends r>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedClassDescriptor.DeserializedClassMemberScope f14844j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1(DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope) {
        super(0);
        this.f14844j = deserializedClassMemberScope;
    }

    @Override // u7.a
    public final Collection<? extends r> k0() {
        DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope = this.f14844j;
        return deserializedClassMemberScope.f14838g.O0(deserializedClassMemberScope.f14841j);
    }
}
