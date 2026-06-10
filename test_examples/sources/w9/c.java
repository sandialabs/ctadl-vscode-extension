package w9;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import l8.d0;

/* loaded from: classes.dex */
public final class c extends o8.j implements b {
    public final ProtoBuf$Constructor N;
    public final f9.c O;
    public final f9.g P;
    public final f9.h Q;
    public final d R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l8.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.c cVar, m8.e eVar, boolean z10, CallableMemberDescriptor.Kind kind, ProtoBuf$Constructor protoBuf$Constructor, f9.c cVar2, f9.g gVar, f9.h hVar, d dVar, d0 d0Var) {
        super(bVar, cVar, eVar, z10, kind, d0Var == null ? d0.f15835a : d0Var);
        v7.g.f(bVar, "containingDeclaration");
        v7.g.f(eVar, "annotations");
        v7.g.f(kind, "kind");
        v7.g.f(protoBuf$Constructor, "proto");
        v7.g.f(cVar2, "nameResolver");
        v7.g.f(gVar, "typeTable");
        v7.g.f(hVar, "versionRequirementTable");
        this.N = protoBuf$Constructor;
        this.O = cVar2;
        this.P = gVar;
        this.Q = hVar;
        this.R = dVar;
    }

    @Override // w9.e
    public final d B() {
        return this.R;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, l8.r
    public final boolean D() {
        return false;
    }

    @Override // w9.e
    public final f9.g D0() {
        return this.P;
    }

    @Override // w9.e
    public final f9.c P0() {
        return this.O;
    }

    @Override // o8.j, kotlin.reflect.jvm.internal.impl.descriptors.impl.b
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.b S0(CallableMemberDescriptor.Kind kind, l8.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, d0 d0Var, m8.e eVar2, h9.e eVar3) {
        return f1(kind, fVar, eVar, d0Var, eVar2);
    }

    @Override // w9.e
    public final kotlin.reflect.jvm.internal.impl.protobuf.h V() {
        return this.N;
    }

    @Override // o8.j
    public final /* bridge */ /* synthetic */ o8.j b1(CallableMemberDescriptor.Kind kind, l8.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, d0 d0Var, m8.e eVar2, h9.e eVar3) {
        return f1(kind, fVar, eVar, d0Var, eVar2);
    }

    public final c f1(CallableMemberDescriptor.Kind kind, l8.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, d0 d0Var, m8.e eVar2) {
        v7.g.f(fVar, "newOwner");
        v7.g.f(kind, "kind");
        v7.g.f(eVar2, "annotations");
        c cVar = new c((l8.b) fVar, (kotlin.reflect.jvm.internal.impl.descriptors.c) eVar, eVar2, this.M, kind, this.N, this.O, this.P, this.Q, this.R, d0Var);
        cVar.E = this.E;
        return cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean i() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean r0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean u0() {
        return false;
    }
}
