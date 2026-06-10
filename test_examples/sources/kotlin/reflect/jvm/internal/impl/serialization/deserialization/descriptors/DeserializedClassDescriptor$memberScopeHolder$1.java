package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import c8.d;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import u7.l;
import v7.g;
import v7.i;

/* loaded from: classes.dex */
public /* synthetic */ class DeserializedClassDescriptor$memberScopeHolder$1 extends FunctionReference implements l<e, DeserializedClassDescriptor.DeserializedClassMemberScope> {
    public DeserializedClassDescriptor$memberScopeHolder$1(Object obj) {
        super(1, obj);
    }

    @Override // u7.l
    public final DeserializedClassDescriptor.DeserializedClassMemberScope U(e eVar) {
        e eVar2 = eVar;
        g.f(eVar2, "p0");
        return new DeserializedClassDescriptor.DeserializedClassMemberScope((DeserializedClassDescriptor) this.f13048j, eVar2);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final d d() {
        return i.a(DeserializedClassDescriptor.DeserializedClassMemberScope.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String e() {
        return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
    }

    @Override // kotlin.jvm.internal.CallableReference, c8.a
    public final String getName() {
        return "<init>";
    }
}
