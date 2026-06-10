package w9;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import l8.d0;
import l8.m;
import l8.z;
import o8.c0;

/* loaded from: classes.dex */
public final class g extends c0 implements b {
    public final ProtoBuf$Property J;
    public final f9.c K;
    public final f9.g L;
    public final f9.h M;
    public final d N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l8.f fVar, z zVar, m8.e eVar, Modality modality, m mVar, boolean z10, h9.e eVar2, CallableMemberDescriptor.Kind kind, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, ProtoBuf$Property protoBuf$Property, f9.c cVar, f9.g gVar, f9.h hVar, d dVar) {
        super(fVar, zVar, eVar, modality, mVar, z10, eVar2, kind, d0.f15835a, z11, z12, z15, false, z13, z14);
        v7.g.f(fVar, "containingDeclaration");
        v7.g.f(eVar, "annotations");
        v7.g.f(modality, "modality");
        v7.g.f(mVar, "visibility");
        v7.g.f(eVar2, "name");
        v7.g.f(kind, "kind");
        v7.g.f(protoBuf$Property, "proto");
        v7.g.f(cVar, "nameResolver");
        v7.g.f(gVar, "typeTable");
        v7.g.f(hVar, "versionRequirementTable");
        this.J = protoBuf$Property;
        this.K = cVar;
        this.L = gVar;
        this.M = hVar;
        this.N = dVar;
    }

    @Override // w9.e
    public final d B() {
        return this.N;
    }

    @Override // o8.c0, l8.r
    public final boolean D() {
        return a4.b.v(f9.b.D, this.J.f14220l, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
    }

    @Override // w9.e
    public final f9.g D0() {
        return this.L;
    }

    @Override // w9.e
    public final f9.c P0() {
        return this.K;
    }

    @Override // o8.c0
    public final c0 U0(l8.f fVar, Modality modality, m mVar, z zVar, CallableMemberDescriptor.Kind kind, h9.e eVar) {
        v7.g.f(fVar, "newOwner");
        v7.g.f(modality, "newModality");
        v7.g.f(mVar, "newVisibility");
        v7.g.f(kind, "kind");
        v7.g.f(eVar, "newName");
        return new g(fVar, zVar, getAnnotations(), modality, mVar, this.n, eVar, kind, this.f16399v, this.f16400w, D(), this.A, this.f16401x, this.J, this.K, this.L, this.M, this.N);
    }

    @Override // w9.e
    public final kotlin.reflect.jvm.internal.impl.protobuf.h V() {
        return this.J;
    }
}
