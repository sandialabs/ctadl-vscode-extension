package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import h9.e;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import l8.b;
import l8.d0;
import o8.q;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1 extends Lambda implements l<e, b> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedClassDescriptor.EnumEntryClassDescriptors f14850j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ DeserializedClassDescriptor f14851k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1(DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors, DeserializedClassDescriptor deserializedClassDescriptor) {
        super(1);
        this.f14850j = enumEntryClassDescriptors;
        this.f14851k = deserializedClassDescriptor;
    }

    @Override // u7.l
    public final b U(e eVar) {
        e eVar2 = eVar;
        g.f(eVar2, "name");
        DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.f14850j;
        ProtoBuf$EnumEntry protoBuf$EnumEntry = (ProtoBuf$EnumEntry) enumEntryClassDescriptors.f14847a.get(eVar2);
        if (protoBuf$EnumEntry != null) {
            DeserializedClassDescriptor deserializedClassDescriptor = this.f14851k;
            return q.S0(deserializedClassDescriptor.f14831t.f17920a.f17901a, deserializedClassDescriptor, eVar2, enumEntryClassDescriptors.c, new w9.a(deserializedClassDescriptor.f14831t.f17920a.f17901a, new DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$1$1(deserializedClassDescriptor, protoBuf$EnumEntry)), d0.f15835a);
        }
        return null;
    }
}
