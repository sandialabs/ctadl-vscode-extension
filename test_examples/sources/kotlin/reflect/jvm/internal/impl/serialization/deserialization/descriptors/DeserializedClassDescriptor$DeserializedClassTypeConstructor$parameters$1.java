package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import l8.i0;

/* loaded from: classes.dex */
public final class DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1 extends Lambda implements u7.a<List<? extends i0>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedClassDescriptor f14846j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.f14846j = deserializedClassDescriptor;
    }

    @Override // u7.a
    public final List<? extends i0> k0() {
        return TypeParameterUtilsKt.b(this.f14846j);
    }
}
