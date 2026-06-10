package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import i9.g;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.b;

/* loaded from: classes.dex */
public final class DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 extends Lambda implements u7.a {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g f14878j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ByteArrayInputStream f14879k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ DeserializedMemberScope f14880l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(b bVar, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.f14878j = bVar;
        this.f14879k = byteArrayInputStream;
        this.f14880l = deserializedMemberScope;
    }

    @Override // u7.a
    public final Object k0() {
        return ((b) this.f14878j).c(this.f14879k, this.f14880l.f14866b.f17920a.f17914p);
    }
}
