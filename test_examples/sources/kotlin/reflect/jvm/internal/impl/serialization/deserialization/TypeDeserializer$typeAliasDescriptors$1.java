package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import l8.h0;
import l8.s;
import u7.l;
import u9.g;

/* loaded from: classes.dex */
public final class TypeDeserializer$typeAliasDescriptors$1 extends Lambda implements l<Integer, l8.d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TypeDeserializer f14814j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$typeAliasDescriptors$1(TypeDeserializer typeDeserializer) {
        super(1);
        this.f14814j = typeDeserializer;
    }

    @Override // u7.l
    public final l8.d U(Integer num) {
        int intValue = num.intValue();
        g gVar = this.f14814j.f14805a;
        h9.b j02 = m0.b.j0(gVar.f17921b, intValue);
        if (!j02.c) {
            s sVar = gVar.f17920a.f17902b;
            v7.g.f(sVar, "<this>");
            l8.d b5 = FindClassInModuleKt.b(sVar, j02);
            if (b5 instanceof h0) {
                return (h0) b5;
            }
        }
        return null;
    }
}
