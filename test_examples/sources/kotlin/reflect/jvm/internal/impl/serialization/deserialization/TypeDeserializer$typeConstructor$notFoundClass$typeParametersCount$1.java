package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import u7.l;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1 extends Lambda implements l<ProtoBuf$Type, ProtoBuf$Type> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TypeDeserializer f14816j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1(TypeDeserializer typeDeserializer) {
        super(1);
        this.f14816j = typeDeserializer;
    }

    @Override // u7.l
    public final ProtoBuf$Type U(ProtoBuf$Type protoBuf$Type) {
        ProtoBuf$Type protoBuf$Type2 = protoBuf$Type;
        g.f(protoBuf$Type2, "it");
        return f9.f.a(protoBuf$Type2, this.f14816j.f14805a.f17922d);
    }
}
