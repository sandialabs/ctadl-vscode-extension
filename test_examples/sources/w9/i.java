package w9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l8.c0;
import l8.d0;
import l8.m;
import m8.e;
import n7.l;
import o8.f0;
import o8.i0;
import y9.j0;
import y9.r;
import y9.v;
import y9.y;

/* loaded from: classes.dex */
public final class i extends AbstractTypeAliasDescriptor implements e {

    /* renamed from: p  reason: collision with root package name */
    public final x9.h f18487p;

    /* renamed from: q  reason: collision with root package name */
    public final ProtoBuf$TypeAlias f18488q;

    /* renamed from: r  reason: collision with root package name */
    public final f9.c f18489r;

    /* renamed from: s  reason: collision with root package name */
    public final f9.g f18490s;

    /* renamed from: t  reason: collision with root package name */
    public final f9.h f18491t;

    /* renamed from: u  reason: collision with root package name */
    public final d f18492u;

    /* renamed from: v  reason: collision with root package name */
    public Collection<? extends i0> f18493v;

    /* renamed from: w  reason: collision with root package name */
    public v f18494w;

    /* renamed from: x  reason: collision with root package name */
    public v f18495x;

    /* renamed from: y  reason: collision with root package name */
    public List<? extends l8.i0> f18496y;

    /* renamed from: z  reason: collision with root package name */
    public v f18497z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x9.h hVar, l8.f fVar, m8.e eVar, h9.e eVar2, m mVar, ProtoBuf$TypeAlias protoBuf$TypeAlias, f9.c cVar, f9.g gVar, f9.h hVar2, d dVar) {
        super(fVar, eVar, eVar2, mVar);
        v7.g.f(hVar, "storageManager");
        v7.g.f(fVar, "containingDeclaration");
        v7.g.f(mVar, "visibility");
        v7.g.f(protoBuf$TypeAlias, "proto");
        v7.g.f(cVar, "nameResolver");
        v7.g.f(gVar, "typeTable");
        v7.g.f(hVar2, "versionRequirementTable");
        this.f18487p = hVar;
        this.f18488q = protoBuf$TypeAlias;
        this.f18489r = cVar;
        this.f18490s = gVar;
        this.f18491t = hVar2;
        this.f18492u = dVar;
    }

    @Override // w9.e
    public final d B() {
        return this.f18492u;
    }

    @Override // w9.e
    public final f9.g D0() {
        throw null;
    }

    @Override // l8.h0
    public final v F() {
        v vVar = this.f18494w;
        if (vVar != null) {
            return vVar;
        }
        v7.g.l("underlyingType");
        throw null;
    }

    @Override // l8.h0
    public final v H0() {
        v vVar = this.f18495x;
        if (vVar != null) {
            return vVar;
        }
        v7.g.l("expandedType");
        throw null;
    }

    @Override // w9.e
    public final f9.c P0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public final void S0(List<? extends l8.i0> list, v vVar, v vVar2) {
        Collection<? extends i0> collection;
        TypeSubstitutor e10;
        kotlin.reflect.jvm.internal.impl.descriptors.b d5;
        EmptyList emptyList;
        v7.g.f(list, "declaredTypeParameters");
        v7.g.f(vVar, "underlyingType");
        v7.g.f(vVar2, "expandedType");
        this.n = list;
        this.f18494w = vVar;
        this.f18495x = vVar2;
        this.f18496y = TypeParameterUtilsKt.b(this);
        this.f18497z = M0();
        l8.b n = n();
        if (n == null) {
            collection = EmptyList.f12981i;
        } else {
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> J = n.J();
            v7.g.e(J, "classDescriptor.constructors");
            ArrayList arrayList = new ArrayList();
            for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar : J) {
                TypeAliasConstructorDescriptorImpl.a aVar = TypeAliasConstructorDescriptorImpl.Q;
                v7.g.e(bVar, "it");
                aVar.getClass();
                x9.h hVar = this.f18487p;
                v7.g.f(hVar, "storageManager");
                f0 f0Var = null;
                if (n() == null) {
                    e10 = null;
                } else {
                    e10 = TypeSubstitutor.e(H0());
                }
                if (e10 != null && (d5 = bVar.d(e10)) != null) {
                    m8.e annotations = bVar.getAnnotations();
                    CallableMemberDescriptor.Kind h10 = bVar.h();
                    v7.g.e(h10, "constructor.kind");
                    d0 j2 = j();
                    v7.g.e(j2, "typeAliasDescriptor.source");
                    ?? typeAliasConstructorDescriptorImpl = new TypeAliasConstructorDescriptorImpl(hVar, this, d5, null, annotations, h10, j2);
                    List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = bVar.m();
                    if (m10 != null) {
                        ArrayList U0 = kotlin.reflect.jvm.internal.impl.descriptors.impl.b.U0(typeAliasConstructorDescriptorImpl, m10, e10, false, false, null);
                        if (U0 != null) {
                            v c = y.c(a1.b.q0(d5.k().X0()), r());
                            c0 E = bVar.E();
                            e.a.C0187a c0187a = e.a.f16014a;
                            Variance variance = Variance.INVARIANT;
                            if (E != null) {
                                f0Var = k9.c.h(typeAliasConstructorDescriptorImpl, e10.i(E.b(), variance), c0187a);
                            }
                            f0 f0Var2 = f0Var;
                            l8.b n10 = n();
                            if (n10 != null) {
                                List<c0> b02 = bVar.b0();
                                v7.g.e(b02, "constructor.contextReceiverParameters");
                                ?? arrayList2 = new ArrayList(l.Z1(b02, 10));
                                for (c0 c0Var : b02) {
                                    r i10 = e10.i(c0Var.b(), variance);
                                    s9.g value = c0Var.getValue();
                                    v7.g.d(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                                    arrayList2.add(new f0(n10, new s9.b(n10, i10, ((s9.f) value).a()), c0187a));
                                }
                                emptyList = arrayList2;
                            } else {
                                emptyList = EmptyList.f12981i;
                            }
                            typeAliasConstructorDescriptorImpl.V0(f0Var2, null, emptyList, x(), U0, c, Modality.FINAL, this.f13510m);
                            f0Var = typeAliasConstructorDescriptorImpl;
                        }
                    } else {
                        kotlin.reflect.jvm.internal.impl.descriptors.impl.b.K(28);
                        throw null;
                    }
                }
                if (f0Var != null) {
                    arrayList.add(f0Var);
                }
            }
            collection = arrayList;
        }
        this.f18493v = collection;
    }

    @Override // l8.f0
    public final l8.g d(TypeSubstitutor typeSubstitutor) {
        v7.g.f(typeSubstitutor, "substitutor");
        if (typeSubstitutor.h()) {
            return this;
        }
        x9.h hVar = this.f18487p;
        l8.f c = c();
        v7.g.e(c, "containingDeclaration");
        m8.e annotations = getAnnotations();
        v7.g.e(annotations, "annotations");
        h9.e name = getName();
        v7.g.e(name, "name");
        i iVar = new i(hVar, c, annotations, name, this.f13510m, this.f18488q, this.f18489r, this.f18490s, this.f18491t, this.f18492u);
        List<l8.i0> x3 = x();
        v F = F();
        Variance variance = Variance.INVARIANT;
        iVar.S0(x3, j0.a(typeSubstitutor.i(F, variance)), j0.a(typeSubstitutor.i(H0(), variance)));
        return iVar;
    }

    @Override // l8.h0
    public final l8.b n() {
        if (m0.b.D0(H0())) {
            return null;
        }
        l8.d c = H0().U0().c();
        if (c instanceof l8.b) {
            return (l8.b) c;
        }
        return null;
    }

    @Override // l8.d
    public final v r() {
        v vVar = this.f18497z;
        if (vVar != null) {
            return vVar;
        }
        v7.g.l("defaultTypeImpl");
        throw null;
    }
}
