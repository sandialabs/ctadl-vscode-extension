package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import a1.c;
import h9.e;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.sequences.SequencesKt__SequencesKt;
import l8.z;
import m0.b;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class DeserializedMemberScope$OptimizedImplementation$properties$1 extends Lambda implements l<e, Collection<? extends z>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedMemberScope.OptimizedImplementation f14884j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$properties$1(DeserializedMemberScope.OptimizedImplementation optimizedImplementation) {
        super(1);
        this.f14884j = optimizedImplementation;
    }

    @Override // u7.l
    public final Collection<? extends z> U(e eVar) {
        Collection<ProtoBuf$Property> collection;
        e eVar2 = eVar;
        g.f(eVar2, "it");
        DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.f14884j;
        LinkedHashMap linkedHashMap = optimizedImplementation.f14871b;
        ProtoBuf$Property.a aVar = ProtoBuf$Property.D;
        g.e(aVar, "PARSER");
        byte[] bArr = (byte[]) linkedHashMap.get(eVar2);
        DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
        if (bArr == null || (collection = c.a1(kotlin.sequences.a.Z0(SequencesKt__SequencesKt.P0(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(aVar, new ByteArrayInputStream(bArr), deserializedMemberScope))))) == null) {
            collection = EmptyList.f12981i;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (ProtoBuf$Property protoBuf$Property : collection) {
            MemberDeserializer memberDeserializer = deserializedMemberScope.f14866b.f17927i;
            g.e(protoBuf$Property, "it");
            arrayList.add(memberDeserializer.f(protoBuf$Property));
        }
        deserializedMemberScope.k(eVar2, arrayList);
        return b.G(arrayList);
    }
}
