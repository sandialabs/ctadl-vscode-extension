package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import m8.c;
import u9.g;

/* loaded from: classes.dex */
public final class DeserializedTypeParameterDescriptor$annotations$1 extends Lambda implements u7.a<List<? extends c>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedTypeParameterDescriptor f14893j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedTypeParameterDescriptor$annotations$1(DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor) {
        super(0);
        this.f14893j = deserializedTypeParameterDescriptor;
    }

    @Override // u7.a
    public final List<? extends c> k0() {
        DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor = this.f14893j;
        g gVar = deserializedTypeParameterDescriptor.f14890s;
        return kotlin.collections.c.L2(gVar.f17920a.f17904e.a(deserializedTypeParameterDescriptor.f14891t, gVar.f17921b));
    }
}
