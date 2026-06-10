package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import h9.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import l8.f;
import l8.z;
import m0.b;
import n7.l;
import u9.g;
import y9.r;

/* loaded from: classes.dex */
public final class DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1 extends Lambda implements u7.a<Set<? extends e>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedClassDescriptor.EnumEntryClassDescriptors f14854j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1(DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors) {
        super(0);
        this.f14854j = enumEntryClassDescriptors;
    }

    @Override // u7.a
    public final Set<? extends e> k0() {
        g gVar;
        DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.f14854j;
        enumEntryClassDescriptors.getClass();
        HashSet hashSet = new HashSet();
        DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
        for (r rVar : deserializedClassDescriptor.f14833v.f()) {
            for (f fVar : c.a.a(rVar.w(), null, 3)) {
                if ((fVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) || (fVar instanceof z)) {
                    hashSet.add(fVar.getName());
                }
            }
        }
        ProtoBuf$Class protoBuf$Class = deserializedClassDescriptor.f14825m;
        List<ProtoBuf$Function> list = protoBuf$Class.f14061y;
        v7.g.e(list, "classProto.functionList");
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            gVar = deserializedClassDescriptor.f14831t;
            if (!hasNext) {
                break;
            }
            hashSet.add(b.r0(gVar.f17921b, ((ProtoBuf$Function) it.next()).n));
        }
        List<ProtoBuf$Property> list2 = protoBuf$Class.f14062z;
        v7.g.e(list2, "classProto.propertyList");
        for (ProtoBuf$Property protoBuf$Property : list2) {
            hashSet.add(b.r0(gVar.f17921b, protoBuf$Property.n));
        }
        return l.c2(hashSet, hashSet);
    }
}
