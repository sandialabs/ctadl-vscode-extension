package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import h9.e;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import n7.l;

/* loaded from: classes.dex */
public final class DeserializedMemberScope$OptimizedImplementation$variableNames$2 extends Lambda implements u7.a<Set<? extends e>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedMemberScope.OptimizedImplementation f14886j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ DeserializedMemberScope f14887k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$variableNames$2(DeserializedMemberScope.OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.f14886j = optimizedImplementation;
        this.f14887k = deserializedMemberScope;
    }

    @Override // u7.a
    public final Set<? extends e> k0() {
        return l.c2(this.f14886j.f14871b.keySet(), this.f14887k.p());
    }
}
