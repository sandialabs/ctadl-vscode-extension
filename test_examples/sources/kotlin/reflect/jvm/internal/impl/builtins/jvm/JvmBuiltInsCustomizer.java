package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import c8.j;
import g0.l0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k8.d;
import k8.f;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.b;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import l8.s;
import o8.l;
import v7.g;
import v7.i;
import x9.e;
import x9.h;
import y9.v;

/* loaded from: classes.dex */
public final class JvmBuiltInsCustomizer implements n8.a, n8.c {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ j<Object>[] f13392h = {i.c(new PropertyReference1Impl(i.a(JvmBuiltInsCustomizer.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), i.c(new PropertyReference1Impl(i.a(JvmBuiltInsCustomizer.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), i.c(new PropertyReference1Impl(i.a(JvmBuiltInsCustomizer.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* renamed from: a  reason: collision with root package name */
    public final s f13393a;

    /* renamed from: b  reason: collision with root package name */
    public final a1.b f13394b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final v f13395d;

    /* renamed from: e  reason: collision with root package name */
    public final e f13396e;

    /* renamed from: f  reason: collision with root package name */
    public final x9.a<h9.c, l8.b> f13397f;

    /* renamed from: g  reason: collision with root package name */
    public final e f13398g;

    /* loaded from: classes.dex */
    public enum JDKMemberStatus {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    public JvmBuiltInsCustomizer(kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar, h hVar, u7.a aVar) {
        g.f(hVar, "storageManager");
        this.f13393a = cVar;
        this.f13394b = a1.b.N0;
        this.c = hVar.a(aVar);
        l lVar = new l(new d(cVar, new h9.c("java.io")), h9.e.k("Serializable"), Modality.ABSTRACT, ClassKind.f13432j, a1.c.N0(new kotlin.reflect.jvm.internal.impl.types.g(hVar, new JvmBuiltInsCustomizer$createMockJavaIoSerializableType$superTypes$1(this))), hVar);
        lVar.S0(MemberScope.a.f14741b, EmptySet.f12983i, null);
        this.f13395d = lVar.r();
        this.f13396e = hVar.a(new JvmBuiltInsCustomizer$cloneableType$2(this, hVar));
        this.f13397f = hVar.d();
        this.f13398g = hVar.a(new JvmBuiltInsCustomizer$notConsideredDeprecation$2(this));
    }

    @Override // n8.a
    public final Collection a(DeserializedClassDescriptor deserializedClassDescriptor) {
        g.f(deserializedClassDescriptor, "classDescriptor");
        h9.d h10 = DescriptorUtilsKt.h(deserializedClassDescriptor);
        LinkedHashSet linkedHashSet = f.f12935a;
        boolean a10 = f.a(h10);
        v vVar = this.f13395d;
        boolean z10 = true;
        if (a10) {
            v vVar2 = (v) m0.b.u0(this.f13396e, f13392h[1]);
            g.e(vVar2, "cloneableType");
            return a1.c.O0(vVar2, vVar);
        }
        if (!f.a(h10)) {
            String str = k8.c.f12921a;
            h9.b g10 = k8.c.g(h10);
            if (g10 != null) {
                try {
                    z10 = Serializable.class.isAssignableFrom(Class.forName(g10.b().b()));
                } catch (ClassNotFoundException unused) {
                }
            }
            z10 = false;
        }
        if (z10) {
            return a1.c.N0(vVar);
        }
        return EmptyList.f12981i;
    }

    @Override // n8.a
    public final Collection b(DeserializedClassDescriptor deserializedClassDescriptor) {
        LazyJavaClassDescriptor f10;
        Set<h9.e> c;
        g.f(deserializedClassDescriptor, "classDescriptor");
        if (g().f13423b && (f10 = f(deserializedClassDescriptor)) != null && (c = f10.I0().c()) != null) {
            return c;
        }
        return EmptySet.f12983i;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x024d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0261  */
    @Override // n8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection c(h9.e eVar, DeserializedClassDescriptor deserializedClassDescriptor) {
        Iterable<l8.b> O0;
        Object next;
        Object obj;
        l8.b bVar;
        Iterable<kotlin.reflect.jvm.internal.impl.descriptors.g> iterable;
        boolean z10;
        boolean booleanValue;
        boolean z11;
        boolean z12;
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar;
        boolean z13;
        g.f(eVar, "name");
        g.f(deserializedClassDescriptor, "classDescriptor");
        boolean a10 = g.a(eVar, k8.a.f12919e);
        j<Object>[] jVarArr = f13392h;
        boolean z14 = false;
        if (a10) {
            h9.e eVar2 = kotlin.reflect.jvm.internal.impl.builtins.e.f13324e;
            if (!kotlin.reflect.jvm.internal.impl.builtins.e.c(deserializedClassDescriptor, g.a.f13365g) && kotlin.reflect.jvm.internal.impl.builtins.e.s(deserializedClassDescriptor) == null) {
                z13 = false;
                if (z13) {
                    List<ProtoBuf$Function> list = deserializedClassDescriptor.f14825m.f14061y;
                    v7.g.e(list, "classDescriptor.classProto.functionList");
                    if (!list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (v7.g.a(m0.b.r0(deserializedClassDescriptor.f14831t.f17921b, ((ProtoBuf$Function) it.next()).n), k8.a.f12919e)) {
                                    z14 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (z14) {
                        return EmptyList.f12981i;
                    }
                    e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> v3 = ((kotlin.reflect.jvm.internal.impl.descriptors.g) kotlin.collections.c.B2(((v) m0.b.u0(this.f13396e, jVarArr[1])).w().a(eVar, NoLookupLocation.FROM_BUILTINS))).v();
                    v3.c(deserializedClassDescriptor);
                    v3.q(l8.l.f15842e);
                    v3.m(deserializedClassDescriptor.r());
                    v3.i(deserializedClassDescriptor.R0());
                    kotlin.reflect.jvm.internal.impl.descriptors.g build = v3.build();
                    v7.g.c(build);
                    return a1.c.N0(build);
                }
            }
            z13 = true;
            if (z13) {
            }
        }
        if (!g().f13423b) {
            return EmptyList.f12981i;
        }
        JvmBuiltInsCustomizer$getFunctions$2 jvmBuiltInsCustomizer$getFunctions$2 = new JvmBuiltInsCustomizer$getFunctions$2(eVar);
        LazyJavaClassDescriptor f10 = f(deserializedClassDescriptor);
        if (f10 != null) {
            h9.c g10 = DescriptorUtilsKt.g(f10);
            k8.b bVar2 = k8.b.f12920f;
            a1.b bVar3 = this.f13394b;
            bVar3.getClass();
            v7.g.f(bVar2, "builtIns");
            l8.b r02 = a1.b.r0(bVar3, g10, bVar2);
            if (r02 == null) {
                O0 = EmptySet.f12983i;
            } else {
                String str = k8.c.f12921a;
                h9.c cVar = k8.c.f12930k.get(DescriptorUtilsKt.h(r02));
                if (cVar == null) {
                    O0 = a1.c.v1(r02);
                } else {
                    O0 = a1.c.O0(r02, bVar2.j(cVar));
                }
            }
            v7.g.f(O0, "<this>");
            if (O0 instanceof List) {
                List list2 = (List) O0;
                if (!list2.isEmpty()) {
                    obj = list2.get(list2.size() - 1);
                    bVar = (l8.b) obj;
                    if (bVar != null) {
                    }
                } else {
                    obj = null;
                    bVar = (l8.b) obj;
                    if (bVar != null) {
                        int i10 = fa.d.f11017k;
                        ArrayList arrayList = new ArrayList(n7.l.Z1(O0, 10));
                        for (l8.b bVar4 : O0) {
                            arrayList.add(DescriptorUtilsKt.g(bVar4));
                        }
                        fa.d dVar = new fa.d();
                        dVar.addAll(arrayList);
                        String str2 = k8.c.f12921a;
                        boolean containsKey = k8.c.f12929j.containsKey(k9.d.g(deserializedClassDescriptor));
                        MemberScope I0 = ((l8.b) ((LockBasedStorageManager.b) this.f13397f).d(DescriptorUtilsKt.g(f10), new JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1(f10, bVar))).I0();
                        v7.g.e(I0, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : jvmBuiltInsCustomizer$getFunctions$2.U(I0)) {
                            kotlin.reflect.jvm.internal.impl.descriptors.g gVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.g) obj2;
                            if (gVar2.h() == CallableMemberDescriptor.Kind.DECLARATION && gVar2.g().a().f15856b && !kotlin.reflect.jvm.internal.impl.builtins.e.D(gVar2)) {
                                Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> f11 = gVar2.f();
                                v7.g.e(f11, "analogueMember.overriddenDescriptors");
                                if (!f11.isEmpty()) {
                                    for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar3 : f11) {
                                        l8.f c = eVar3.c();
                                        v7.g.e(c, "it.containingDeclaration");
                                        if (dVar.contains(DescriptorUtilsKt.g(c))) {
                                            z10 = true;
                                            break;
                                        }
                                    }
                                }
                                z10 = false;
                                if (!z10) {
                                    l8.f c10 = gVar2.c();
                                    v7.g.d(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                    if (f.f12937d.contains(a1.c.y1((l8.b) c10, d9.j.a(gVar2, 3))) ^ containsKey) {
                                        booleanValue = true;
                                    } else {
                                        Boolean d5 = fa.b.d(a1.c.N0(gVar2), a1.c.G, new JvmBuiltInsCustomizer$isMutabilityViolation$2(this));
                                        v7.g.e(d5, "private fun SimpleFuncti…scriptor)\n        }\n    }");
                                        booleanValue = d5.booleanValue();
                                    }
                                    if (!booleanValue) {
                                        z11 = true;
                                        if (!z11) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                }
                            }
                            z11 = false;
                            if (!z11) {
                            }
                        }
                        iterable = arrayList2;
                        ArrayList arrayList3 = new ArrayList();
                        for (kotlin.reflect.jvm.internal.impl.descriptors.g gVar3 : iterable) {
                            l8.f c11 = gVar3.c();
                            v7.g.d(c11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            kotlin.reflect.jvm.internal.impl.descriptors.e d10 = gVar3.d(TypeSubstitutor.d(k8.g.a((l8.b) c11, deserializedClassDescriptor)));
                            v7.g.d(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
                            e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> v10 = ((kotlin.reflect.jvm.internal.impl.descriptors.g) d10).v();
                            v10.c(deserializedClassDescriptor);
                            v10.i(deserializedClassDescriptor.R0());
                            v10.n();
                            l8.f c12 = gVar3.c();
                            v7.g.d(c12, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            Object b5 = fa.b.b(a1.c.N0((l8.b) c12), new l0(this), new c(d9.j.a(gVar3, 3), new Ref$ObjectRef()));
                            v7.g.e(b5, "jvmDescriptor = computeJ…CONSIDERED\n            })");
                            int ordinal = ((JDKMemberStatus) b5).ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                    }
                                    gVar = null;
                                } else {
                                    v10.g((m8.e) m0.b.u0(this.f13398g, jVarArr[2]));
                                }
                                kotlin.reflect.jvm.internal.impl.descriptors.g build2 = v10.build();
                                v7.g.c(build2);
                                gVar = build2;
                            } else {
                                if (deserializedClassDescriptor.p() == Modality.FINAL && deserializedClassDescriptor.h() != ClassKind.f13433k) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (!z12) {
                                    v10.o();
                                    kotlin.reflect.jvm.internal.impl.descriptors.g build22 = v10.build();
                                    v7.g.c(build22);
                                    gVar = build22;
                                }
                                gVar = null;
                            }
                            if (gVar != null) {
                                arrayList3.add(gVar);
                            }
                        }
                        return arrayList3;
                    }
                }
            } else {
                Iterator it2 = O0.iterator();
                if (it2.hasNext()) {
                    while (true) {
                        next = it2.next();
                        if (!it2.hasNext()) {
                            break;
                        }
                    }
                    obj = next;
                    bVar = (l8.b) obj;
                    if (bVar != null) {
                    }
                }
                obj = null;
                bVar = (l8.b) obj;
                if (bVar != null) {
                }
            }
        }
        iterable = EmptyList.f12981i;
        ArrayList arrayList32 = new ArrayList();
        while (r1.hasNext()) {
        }
        return arrayList32;
    }

    @Override // n8.c
    public final boolean d(DeserializedClassDescriptor deserializedClassDescriptor, w9.h hVar) {
        v7.g.f(deserializedClassDescriptor, "classDescriptor");
        LazyJavaClassDescriptor f10 = f(deserializedClassDescriptor);
        if (f10 == null || !hVar.getAnnotations().i(n8.d.f16137a)) {
            return true;
        }
        if (!g().f13423b) {
            return false;
        }
        String a10 = d9.j.a(hVar, 3);
        LazyJavaClassMemberScope I0 = f10.I0();
        h9.e name = hVar.getName();
        v7.g.e(name, "functionDescriptor.name");
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> a11 = I0.a(name, NoLookupLocation.FROM_BUILTINS);
        if (!(a11 instanceof Collection) || !a11.isEmpty()) {
            for (kotlin.reflect.jvm.internal.impl.descriptors.g gVar : a11) {
                if (v7.g.a(d9.j.a(gVar, 3), a10)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // n8.a
    public final Collection e(DeserializedClassDescriptor deserializedClassDescriptor) {
        boolean z10;
        boolean z11;
        boolean z12;
        h9.d dVar;
        if (deserializedClassDescriptor.f14830s == ClassKind.f13431i && g().f13423b) {
            LazyJavaClassDescriptor f10 = f(deserializedClassDescriptor);
            if (f10 == null) {
                return EmptyList.f12981i;
            }
            l8.b r02 = a1.b.r0(this.f13394b, DescriptorUtilsKt.g(f10), k8.b.f12920f);
            if (r02 == null) {
                return EmptyList.f12981i;
            }
            TypeSubstitutor d5 = TypeSubstitutor.d(k8.g.a(r02, f10));
            ArrayList arrayList = new ArrayList();
            for (Object obj : f10.f13735z.f13743q.k0()) {
                kotlin.reflect.jvm.internal.impl.descriptors.b bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) obj;
                boolean z13 = false;
                if (bVar.g().a().f15856b) {
                    Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> J = r02.J();
                    v7.g.e(J, "defaultKotlinVersion.constructors");
                    if (!J.isEmpty()) {
                        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : J) {
                            v7.g.e(bVar2, "it");
                            if (OverridingUtil.j(bVar2, bVar.d(d5)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                                z10 = true;
                                continue;
                            } else {
                                z10 = false;
                                continue;
                            }
                            if (z10) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    z11 = true;
                    if (z11) {
                        if (bVar.m().size() == 1) {
                            List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = bVar.m();
                            v7.g.e(m10, "valueParameters");
                            l8.d c = ((kotlin.reflect.jvm.internal.impl.descriptors.h) kotlin.collections.c.C2(m10)).b().U0().c();
                            if (c != null) {
                                dVar = DescriptorUtilsKt.h(c);
                            } else {
                                dVar = null;
                            }
                            if (v7.g.a(dVar, DescriptorUtilsKt.h(deserializedClassDescriptor))) {
                                z12 = true;
                                if (!z12 && !kotlin.reflect.jvm.internal.impl.builtins.e.D(bVar) && !f.f12938e.contains(a1.c.y1(f10, d9.j.a(bVar, 3)))) {
                                    z13 = true;
                                }
                            }
                        }
                        z12 = false;
                        if (!z12) {
                            z13 = true;
                        }
                    }
                }
                if (z13) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(n7.l.Z1(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.b bVar3 = (kotlin.reflect.jvm.internal.impl.descriptors.b) it.next();
                e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> v3 = bVar3.v();
                v3.c(deserializedClassDescriptor);
                v3.m(deserializedClassDescriptor.r());
                v3.n();
                v3.e(d5.g());
                if (!f.f12939f.contains(a1.c.y1(f10, d9.j.a(bVar3, 3)))) {
                    v3.g((m8.e) m0.b.u0(this.f13398g, f13392h[2]));
                }
                kotlin.reflect.jvm.internal.impl.descriptors.e build = v3.build();
                v7.g.d(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                arrayList2.add((kotlin.reflect.jvm.internal.impl.descriptors.b) build);
            }
            return arrayList2;
        }
        return EmptyList.f12981i;
    }

    public final LazyJavaClassDescriptor f(l8.b bVar) {
        h9.c b5;
        if (bVar != null) {
            h9.e eVar = kotlin.reflect.jvm.internal.impl.builtins.e.f13324e;
            if (kotlin.reflect.jvm.internal.impl.builtins.e.c(bVar, g.a.f13358a) || !kotlin.reflect.jvm.internal.impl.builtins.e.L(bVar)) {
                return null;
            }
            h9.d h10 = DescriptorUtilsKt.h(bVar);
            if (!h10.e()) {
                return null;
            }
            String str = k8.c.f12921a;
            h9.b g10 = k8.c.g(h10);
            if (g10 != null && (b5 = g10.b()) != null) {
                l8.b f12 = m0.b.f1(g().f13422a, b5);
                if (!(f12 instanceof LazyJavaClassDescriptor)) {
                    return null;
                }
                return (LazyJavaClassDescriptor) f12;
            }
            return null;
        }
        kotlin.reflect.jvm.internal.impl.builtins.e.a(108);
        throw null;
    }

    public final b.a g() {
        return (b.a) m0.b.u0(this.c, f13392h[0]);
    }
}
