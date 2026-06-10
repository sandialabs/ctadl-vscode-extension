package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import a1.c;
import h9.e;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.sequences.SequencesKt__SequencesKt;
import m0.b;
import u7.l;
import w9.h;

/* loaded from: classes.dex */
public final class DeserializedMemberScope$OptimizedImplementation$functions$1 extends Lambda implements l<e, Collection<? extends g>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedMemberScope.OptimizedImplementation f14883j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$functions$1(DeserializedMemberScope.OptimizedImplementation optimizedImplementation) {
        super(1);
        this.f14883j = optimizedImplementation;
    }

    @Override // u7.l
    public final Collection<? extends g> U(e eVar) {
        Collection<ProtoBuf$Function> collection;
        e eVar2 = eVar;
        v7.g.f(eVar2, "it");
        DeserializedMemberScope.OptimizedImplementation optimizedImplementation = this.f14883j;
        LinkedHashMap linkedHashMap = optimizedImplementation.f14870a;
        ProtoBuf$Function.a aVar = ProtoBuf$Function.D;
        v7.g.e(aVar, "PARSER");
        byte[] bArr = (byte[]) linkedHashMap.get(eVar2);
        DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
        if (bArr == null || (collection = c.a1(kotlin.sequences.a.Z0(SequencesKt__SequencesKt.P0(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(aVar, new ByteArrayInputStream(bArr), deserializedMemberScope))))) == null) {
            collection = EmptyList.f12981i;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (ProtoBuf$Function protoBuf$Function : collection) {
            MemberDeserializer memberDeserializer = deserializedMemberScope.f14866b.f17927i;
            v7.g.e(protoBuf$Function, "it");
            h e10 = memberDeserializer.e(protoBuf$Function);
            if (!deserializedMemberScope.r(e10)) {
                e10 = null;
            }
            if (e10 != null) {
                arrayList.add(e10);
            }
        }
        deserializedMemberScope.j(eVar2, arrayList);
        return b.G(arrayList);
    }
}
