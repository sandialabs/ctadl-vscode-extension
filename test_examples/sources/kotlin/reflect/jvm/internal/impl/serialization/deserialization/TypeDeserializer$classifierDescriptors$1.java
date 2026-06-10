package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import u7.l;
import u9.g;

/* loaded from: classes.dex */
public final class TypeDeserializer$classifierDescriptors$1 extends Lambda implements l<Integer, l8.d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TypeDeserializer f14811j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$classifierDescriptors$1(TypeDeserializer typeDeserializer) {
        super(1);
        this.f14811j = typeDeserializer;
    }

    @Override // u7.l
    public final l8.d U(Integer num) {
        int intValue = num.intValue();
        g gVar = this.f14811j.f14805a;
        h9.b j02 = m0.b.j0(gVar.f17921b, intValue);
        boolean z10 = j02.c;
        u9.e eVar = gVar.f17920a;
        if (z10) {
            return eVar.b(j02);
        }
        return FindClassInModuleKt.b(eVar.f17902b, j02);
    }
}
