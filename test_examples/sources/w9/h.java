package w9;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import l8.d0;
import o8.g0;

/* loaded from: classes.dex */
public final class h extends g0 implements b {
    public final ProtoBuf$Function M;
    public final f9.c N;
    public final f9.g O;
    public final f9.h P;
    public final d Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l8.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.g gVar, m8.e eVar, h9.e eVar2, CallableMemberDescriptor.Kind kind, ProtoBuf$Function protoBuf$Function, f9.c cVar, f9.g gVar2, f9.h hVar, d dVar, d0 d0Var) {
        super(fVar, gVar, eVar, eVar2, kind, d0Var == null ? d0.f15835a : d0Var);
        v7.g.f(fVar, "containingDeclaration");
        v7.g.f(eVar, "annotations");
        v7.g.f(kind, "kind");
        v7.g.f(protoBuf$Function, "proto");
        v7.g.f(cVar, "nameResolver");
        v7.g.f(gVar2, "typeTable");
        v7.g.f(hVar, "versionRequirementTable");
        this.M = protoBuf$Function;
        this.N = cVar;
        this.O = gVar2;
        this.P = hVar;
        this.Q = dVar;
    }

    @Override // w9.e
    public final d B() {
        return this.Q;
    }

    @Override // w9.e
    public final f9.g D0() {
        return this.O;
    }

    @Override // w9.e
    public final f9.c P0() {
        return this.N;
    }

    @Override // o8.g0, kotlin.reflect.jvm.internal.impl.descriptors.impl.b
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.b S0(CallableMemberDescriptor.Kind kind, l8.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, d0 d0Var, m8.e eVar2, h9.e eVar3) {
        h9.e eVar4;
        v7.g.f(fVar, "newOwner");
        v7.g.f(kind, "kind");
        v7.g.f(eVar2, "annotations");
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar = (kotlin.reflect.jvm.internal.impl.descriptors.g) eVar;
        if (eVar3 == null) {
            h9.e name = getName();
            v7.g.e(name, "name");
            eVar4 = name;
        } else {
            eVar4 = eVar3;
        }
        h hVar = new h(fVar, gVar, eVar2, eVar4, kind, this.M, this.N, this.O, this.P, this.Q, d0Var);
        hVar.E = this.E;
        return hVar;
    }

    @Override // w9.e
    public final kotlin.reflect.jvm.internal.impl.protobuf.h V() {
        return this.M;
    }
}
