package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import u9.g;

/* loaded from: classes.dex */
public final class TypeDeserializer$simpleType$annotations$1 extends Lambda implements u7.a<List<? extends m8.c>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TypeDeserializer f14812j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ProtoBuf$Type f14813k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$simpleType$annotations$1(ProtoBuf$Type protoBuf$Type, TypeDeserializer typeDeserializer) {
        super(0);
        this.f14812j = typeDeserializer;
        this.f14813k = protoBuf$Type;
    }

    @Override // u7.a
    public final List<? extends m8.c> k0() {
        g gVar = this.f14812j.f14805a;
        return gVar.f17920a.f17904e.j(this.f14813k, gVar.f17921b);
    }
}
