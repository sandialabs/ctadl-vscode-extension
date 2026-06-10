package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import l8.b;
import l8.d;

/* loaded from: classes.dex */
public final class DeserializedClassDescriptor$companionObjectDescriptor$1 extends Lambda implements u7.a<b> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedClassDescriptor f14856j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$companionObjectDescriptor$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.f14856j = deserializedClassDescriptor;
    }

    @Override // u7.a
    public final b k0() {
        boolean z10;
        DeserializedClassDescriptor deserializedClassDescriptor = this.f14856j;
        ProtoBuf$Class protoBuf$Class = deserializedClassDescriptor.f14825m;
        if ((protoBuf$Class.f14048k & 4) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            d e10 = deserializedClassDescriptor.S0().e(m0.b.r0(deserializedClassDescriptor.f14831t.f17921b, protoBuf$Class.n), NoLookupLocation.FROM_DESERIALIZATION);
            if (e10 instanceof b) {
                return (b) e10;
            }
        }
        return null;
    }
}
