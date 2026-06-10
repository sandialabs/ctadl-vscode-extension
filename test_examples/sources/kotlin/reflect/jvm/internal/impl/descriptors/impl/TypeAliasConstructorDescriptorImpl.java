package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import c8.j;
import h9.g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import l8.d0;
import l8.h0;
import l8.k;
import o8.i0;
import v7.i;
import x9.f;
import x9.h;
import y9.r;

/* loaded from: classes.dex */
public final class TypeAliasConstructorDescriptorImpl extends b implements i0 {
    public final h M;
    public final h0 N;
    public final f O;
    public kotlin.reflect.jvm.internal.impl.descriptors.b P;
    public static final /* synthetic */ j<Object>[] R = {i.c(new PropertyReference1Impl(i.a(TypeAliasConstructorDescriptorImpl.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
    public static final a Q = new a();

    /* loaded from: classes.dex */
    public static final class a {
    }

    public /* synthetic */ TypeAliasConstructorDescriptorImpl() {
        throw null;
    }

    public TypeAliasConstructorDescriptorImpl(h hVar, h0 h0Var, kotlin.reflect.jvm.internal.impl.descriptors.b bVar, i0 i0Var, m8.e eVar, CallableMemberDescriptor.Kind kind, d0 d0Var) {
        super(kind, h0Var, i0Var, d0Var, eVar, g.f11578e);
        this.M = hVar;
        this.N = h0Var;
        this.A = h0Var.L0();
        this.O = hVar.g(new TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2(this, bVar));
        this.P = bVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c
    public final boolean O() {
        return this.P.O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c
    public final l8.b P() {
        l8.b P = this.P.P();
        v7.g.e(P, "underlyingConstructorDescriptor.constructedClass");
        return P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b
    public final b S0(CallableMemberDescriptor.Kind kind, l8.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, d0 d0Var, m8.e eVar2, h9.e eVar3) {
        v7.g.f(fVar, "newOwner");
        v7.g.f(kind, "kind");
        v7.g.f(eVar2, "annotations");
        return new TypeAliasConstructorDescriptorImpl(this.M, this.N, this.P, this, eVar2, CallableMemberDescriptor.Kind.DECLARATION, d0Var);
    }

    @Override // o8.i0
    public final kotlin.reflect.jvm.internal.impl.descriptors.b Y() {
        return this.P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: b1 */
    public final i0 y0(l8.f fVar, Modality modality, k kVar) {
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.FAKE_OVERRIDE;
        v7.g.f(fVar, "newOwner");
        v7.g.f(kVar, "visibility");
        b.a aVar = (b.a) v();
        aVar.c(fVar);
        aVar.k(modality);
        aVar.q(kVar);
        aVar.l(kind);
        aVar.f13553m = false;
        kotlin.reflect.jvm.internal.impl.descriptors.e build = aVar.build();
        v7.g.d(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (i0) build;
    }

    @Override // o8.o, l8.f
    public final l8.e c() {
        return this.N;
    }

    @Override // o8.o, l8.f
    public final l8.f c() {
        return this.N;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, o8.o
    /* renamed from: c1 */
    public final i0 z0() {
        kotlin.reflect.jvm.internal.impl.descriptors.e z02 = super.z0();
        v7.g.d(z02, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (i0) z02;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.e, l8.f0
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.c d(TypeSubstitutor typeSubstitutor) {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.e, l8.f0
    /* renamed from: d1 */
    public final TypeAliasConstructorDescriptorImpl d(TypeSubstitutor typeSubstitutor) {
        v7.g.f(typeSubstitutor, "substitutor");
        kotlin.reflect.jvm.internal.impl.descriptors.e d5 = super.d(typeSubstitutor);
        v7.g.d(d5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) d5;
        r rVar = typeAliasConstructorDescriptorImpl.f13530o;
        v7.g.c(rVar);
        kotlin.reflect.jvm.internal.impl.descriptors.b d10 = this.P.a().d(TypeSubstitutor.e(rVar));
        if (d10 == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.P = d10;
        return typeAliasConstructorDescriptorImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    public final r k() {
        r rVar = this.f13530o;
        v7.g.c(rVar);
        return rVar;
    }
}
