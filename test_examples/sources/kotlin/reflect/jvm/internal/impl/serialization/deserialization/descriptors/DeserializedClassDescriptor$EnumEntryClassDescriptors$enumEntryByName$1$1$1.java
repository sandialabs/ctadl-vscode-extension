package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import m8.c;

/* loaded from: classes.dex */
final class DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$1$1 extends Lambda implements u7.a<List<? extends c>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedClassDescriptor f14852j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ProtoBuf$EnumEntry f14853k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$1$1(DeserializedClassDescriptor deserializedClassDescriptor, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        super(0);
        this.f14852j = deserializedClassDescriptor;
        this.f14853k = protoBuf$EnumEntry;
    }

    @Override // u7.a
    public final List<? extends c> k0() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.f14852j;
        return kotlin.collections.c.L2(deserializedClassDescriptor.f14831t.f17920a.f17904e.b(deserializedClassDescriptor.E, this.f14853k));
    }
}
