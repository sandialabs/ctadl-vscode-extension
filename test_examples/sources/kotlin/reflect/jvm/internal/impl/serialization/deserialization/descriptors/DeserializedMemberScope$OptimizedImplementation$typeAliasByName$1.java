package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import h9.e;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import l8.h0;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class DeserializedMemberScope$OptimizedImplementation$typeAliasByName$1 extends Lambda implements l<e, h0> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedMemberScope.OptimizedImplementation f14885j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$typeAliasByName$1(DeserializedMemberScope.OptimizedImplementation optimizedImplementation) {
        super(1);
        this.f14885j = optimizedImplementation;
    }

    @Override // u7.l
    public final h0 U(e eVar) {
        e eVar2 = eVar;
        g.f(eVar2, "it");
        DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.f14885j;
        byte[] bArr = optimizedImplementation.c.get(eVar2);
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
            ProtoBuf$TypeAlias protoBuf$TypeAlias = (ProtoBuf$TypeAlias) ProtoBuf$TypeAlias.f14327x.c(byteArrayInputStream, deserializedMemberScope.f14866b.f17920a.f17914p);
            if (protoBuf$TypeAlias != null) {
                return deserializedMemberScope.f14866b.f17927i.g(protoBuf$TypeAlias);
            }
        }
        return null;
    }
}
