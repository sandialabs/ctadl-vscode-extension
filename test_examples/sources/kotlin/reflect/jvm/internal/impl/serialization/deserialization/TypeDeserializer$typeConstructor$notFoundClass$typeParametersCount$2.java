package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
final class TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2 extends Lambda implements l<ProtoBuf$Type, Integer> {

    /* renamed from: j  reason: collision with root package name */
    public static final TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2 f14817j = new TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2();

    public TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2() {
        super(1);
    }

    @Override // u7.l
    public final Integer U(ProtoBuf$Type protoBuf$Type) {
        ProtoBuf$Type protoBuf$Type2 = protoBuf$Type;
        g.f(protoBuf$Type2, "it");
        return Integer.valueOf(protoBuf$Type2.f14281l.size());
    }
}
