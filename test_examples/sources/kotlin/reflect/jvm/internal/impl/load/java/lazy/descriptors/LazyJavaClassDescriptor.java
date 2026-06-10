package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b8.h;
import b9.g;
import b9.j;
import b9.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l8.g0;
import l8.i0;
import l8.j0;
import l8.l;
import l8.m;
import l8.n0;
import l8.s;
import n7.l;
import o8.i;
import o8.k;
import r9.e;
import u8.f;
import u8.k;
import u8.q;
import u8.t;
import v8.f;
import y9.e0;
import y9.h0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class LazyJavaClassDescriptor extends k implements w8.c {
    public static final Set<String> F = a1.c.w1("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    public final ScopesHolderForClass<LazyJavaClassMemberScope> A;
    public final e B;
    public final c C;
    public final LazyJavaAnnotations D;
    public final x9.e<List<i0>> E;

    /* renamed from: p  reason: collision with root package name */
    public final x8.c f13725p;

    /* renamed from: q  reason: collision with root package name */
    public final g f13726q;

    /* renamed from: r  reason: collision with root package name */
    public final l8.b f13727r;

    /* renamed from: s  reason: collision with root package name */
    public final x8.c f13728s;

    /* renamed from: t  reason: collision with root package name */
    public final m7.e f13729t;

    /* renamed from: u  reason: collision with root package name */
    public final ClassKind f13730u;

    /* renamed from: v  reason: collision with root package name */
    public final Modality f13731v;

    /* renamed from: w  reason: collision with root package name */
    public final n0 f13732w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f13733x;

    /* renamed from: y  reason: collision with root package name */
    public final LazyJavaClassTypeConstructor f13734y;

    /* renamed from: z  reason: collision with root package name */
    public final LazyJavaClassMemberScope f13735z;

    /* loaded from: classes.dex */
    public final class LazyJavaClassTypeConstructor extends y9.b {
        public final x9.e<List<i0>> c;

        public LazyJavaClassTypeConstructor() {
            super(LazyJavaClassDescriptor.this.f13728s.f18762a.f18739a);
            this.c = LazyJavaClassDescriptor.this.f13728s.f18762a.f18739a.a(new LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1(LazyJavaClassDescriptor.this));
        }

        @Override // y9.e0
        public final boolean a() {
            return true;
        }

        @Override // y9.b, y9.e, y9.e0
        public final l8.d c() {
            return LazyJavaClassDescriptor.this;
        }

        @Override // y9.e0
        public final List<i0> e() {
            return this.c.k0();
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0225  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x022a  */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Collection<r> h() {
            m9.r rVar;
            String str;
            h9.c cVar;
            h9.c cVar2;
            l8.d e10;
            l8.b bVar;
            ArrayList arrayList;
            v e11;
            l8.b bVar2;
            r rVar2;
            e0 e0Var;
            boolean z10;
            LazyJavaClassDescriptor lazyJavaClassDescriptor = LazyJavaClassDescriptor.this;
            Collection<j> f10 = lazyJavaClassDescriptor.f13726q.f();
            ArrayList arrayList2 = new ArrayList(f10.size());
            ArrayList arrayList3 = new ArrayList(0);
            h9.c cVar3 = q.n;
            v7.g.e(cVar3, "PURELY_IMPLEMENTS_ANNOTATION");
            m8.c j2 = lazyJavaClassDescriptor.D.j(cVar3);
            i iVar = null;
            if (j2 != null) {
                Object D2 = kotlin.collections.c.D2(j2.a().values());
                if (D2 instanceof m9.r) {
                    rVar = (m9.r) D2;
                } else {
                    rVar = null;
                }
                if (rVar != null && (str = (String) rVar.f16022a) != null && kotlin.reflect.jvm.internal.impl.name.a.a(str)) {
                    cVar = new h9.c(str);
                    if (cVar != null) {
                        if (!cVar.d() && cVar.h(kotlin.reflect.jvm.internal.impl.builtins.g.f13353j)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            Variance variance = Variance.INVARIANT;
                            x8.c cVar4 = lazyJavaClassDescriptor.f13728s;
                            if (cVar == null) {
                                LinkedHashMap linkedHashMap = f.f17845a;
                                cVar2 = f.f17846b.get(DescriptorUtilsKt.g(lazyJavaClassDescriptor));
                                if (cVar2 == null) {
                                    e11 = null;
                                    for (j jVar : f10) {
                                        r e12 = cVar4.f18765e.e(jVar, m0.b.r1(TypeUsage.SUPERTYPE, false, false, iVar, 7));
                                        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c cVar5 = cVar4.f18762a.f18754r;
                                        cVar5.getClass();
                                        x8.c cVar6 = cVar4;
                                        r a10 = cVar5.a(new c9.g(null, false, cVar4, AnnotationQualifierApplicabilityType.f13608m, true), e12, EmptyList.f12981i, null, false);
                                        if (a10 == null) {
                                            a10 = e12;
                                        }
                                        if (a10.U0().c() instanceof NotFoundClasses.b) {
                                            arrayList3.add(jVar);
                                        }
                                        e0 U0 = a10.U0();
                                        if (e11 != null) {
                                            e0Var = e11.U0();
                                        } else {
                                            e0Var = null;
                                        }
                                        if (!v7.g.a(U0, e0Var) && !kotlin.reflect.jvm.internal.impl.builtins.e.y(a10)) {
                                            arrayList2.add(a10);
                                        }
                                        cVar4 = cVar6;
                                        iVar = null;
                                    }
                                    x8.c cVar7 = cVar4;
                                    bVar2 = lazyJavaClassDescriptor.f13727r;
                                    if (bVar2 != null) {
                                        rVar2 = TypeSubstitutor.d(k8.g.a(bVar2, lazyJavaClassDescriptor)).k(bVar2.r(), variance);
                                    } else {
                                        rVar2 = null;
                                    }
                                    m0.b.u(arrayList2, rVar2);
                                    m0.b.u(arrayList2, e11);
                                    if (!arrayList3.isEmpty()) {
                                        u9.j jVar2 = cVar7.f18762a.f18743f;
                                        ArrayList arrayList4 = new ArrayList(l.Z1(arrayList3, 10));
                                        Iterator it = arrayList3.iterator();
                                        while (it.hasNext()) {
                                            w wVar = (w) it.next();
                                            v7.g.d(wVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                                            arrayList4.add(((j) wVar).y());
                                        }
                                        jVar2.b(lazyJavaClassDescriptor, arrayList4);
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        return kotlin.collections.c.L2(arrayList2);
                                    }
                                    return a1.c.N0(cVar7.f18762a.f18751o.u().f());
                                }
                            } else {
                                cVar2 = cVar;
                            }
                            s sVar = cVar4.f18762a.f18751o;
                            NoLookupLocation noLookupLocation = NoLookupLocation.FROM_JAVA_LOADER;
                            int i10 = DescriptorUtilsKt.f14713a;
                            v7.g.f(sVar, "<this>");
                            cVar2.d();
                            h9.c e13 = cVar2.e();
                            v7.g.e(e13, "topLevelClassFqName.parent()");
                            MemberScope w10 = sVar.t0(e13).w();
                            h9.e f11 = cVar2.f();
                            v7.g.e(f11, "topLevelClassFqName.shortName()");
                            e10 = w10.e(f11, noLookupLocation);
                            if (e10 instanceof l8.b) {
                                bVar = (l8.b) e10;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                int size = bVar.o().e().size();
                                List<i0> e14 = lazyJavaClassDescriptor.f13734y.e();
                                v7.g.e(e14, "getTypeConstructor().parameters");
                                int size2 = e14.size();
                                if (size2 == size) {
                                    arrayList = new ArrayList(l.Z1(e14, 10));
                                    for (i0 i0Var : e14) {
                                        arrayList.add(new h0(i0Var.r(), variance));
                                    }
                                } else if (size2 == 1 && size > 1 && cVar == null) {
                                    h0 h0Var = new h0(((i0) kotlin.collections.c.C2(e14)).r(), variance);
                                    b8.i iVar2 = new b8.i(1, size);
                                    ArrayList arrayList5 = new ArrayList(l.Z1(iVar2, 10));
                                    h it2 = iVar2.iterator();
                                    while (it2.f6502k) {
                                        it2.nextInt();
                                        arrayList5.add(h0Var);
                                    }
                                    arrayList = arrayList5;
                                }
                                kotlin.reflect.jvm.internal.impl.types.l.f15045j.getClass();
                                e11 = KotlinTypeFactory.e(kotlin.reflect.jvm.internal.impl.types.l.f15046k, bVar, arrayList);
                                while (r2.hasNext()) {
                                }
                                x8.c cVar72 = cVar4;
                                bVar2 = lazyJavaClassDescriptor.f13727r;
                                if (bVar2 != null) {
                                }
                                m0.b.u(arrayList2, rVar2);
                                m0.b.u(arrayList2, e11);
                                if (!arrayList3.isEmpty()) {
                                }
                                if (!arrayList2.isEmpty()) {
                                }
                            }
                            e11 = null;
                            while (r2.hasNext()) {
                            }
                            x8.c cVar722 = cVar4;
                            bVar2 = lazyJavaClassDescriptor.f13727r;
                            if (bVar2 != null) {
                            }
                            m0.b.u(arrayList2, rVar2);
                            m0.b.u(arrayList2, e11);
                            if (!arrayList3.isEmpty()) {
                            }
                            if (!arrayList2.isEmpty()) {
                            }
                        }
                    }
                    cVar = null;
                    Variance variance2 = Variance.INVARIANT;
                    x8.c cVar42 = lazyJavaClassDescriptor.f13728s;
                    if (cVar == null) {
                    }
                    s sVar2 = cVar42.f18762a.f18751o;
                    NoLookupLocation noLookupLocation2 = NoLookupLocation.FROM_JAVA_LOADER;
                    int i102 = DescriptorUtilsKt.f14713a;
                    v7.g.f(sVar2, "<this>");
                    cVar2.d();
                    h9.c e132 = cVar2.e();
                    v7.g.e(e132, "topLevelClassFqName.parent()");
                    MemberScope w102 = sVar2.t0(e132).w();
                    h9.e f112 = cVar2.f();
                    v7.g.e(f112, "topLevelClassFqName.shortName()");
                    e10 = w102.e(f112, noLookupLocation2);
                    if (e10 instanceof l8.b) {
                    }
                    if (bVar != null) {
                    }
                    e11 = null;
                    while (r2.hasNext()) {
                    }
                    x8.c cVar7222 = cVar42;
                    bVar2 = lazyJavaClassDescriptor.f13727r;
                    if (bVar2 != null) {
                    }
                    m0.b.u(arrayList2, rVar2);
                    m0.b.u(arrayList2, e11);
                    if (!arrayList3.isEmpty()) {
                    }
                    if (!arrayList2.isEmpty()) {
                    }
                }
            }
            cVar = null;
            if (cVar != null) {
            }
            cVar = null;
            Variance variance22 = Variance.INVARIANT;
            x8.c cVar422 = lazyJavaClassDescriptor.f13728s;
            if (cVar == null) {
            }
            s sVar22 = cVar422.f18762a.f18751o;
            NoLookupLocation noLookupLocation22 = NoLookupLocation.FROM_JAVA_LOADER;
            int i1022 = DescriptorUtilsKt.f14713a;
            v7.g.f(sVar22, "<this>");
            cVar2.d();
            h9.c e1322 = cVar2.e();
            v7.g.e(e1322, "topLevelClassFqName.parent()");
            MemberScope w1022 = sVar22.t0(e1322).w();
            h9.e f1122 = cVar2.f();
            v7.g.e(f1122, "topLevelClassFqName.shortName()");
            e10 = w1022.e(f1122, noLookupLocation22);
            if (e10 instanceof l8.b) {
            }
            if (bVar != null) {
            }
            e11 = null;
            while (r2.hasNext()) {
            }
            x8.c cVar72222 = cVar422;
            bVar2 = lazyJavaClassDescriptor.f13727r;
            if (bVar2 != null) {
            }
            m0.b.u(arrayList2, rVar2);
            m0.b.u(arrayList2, e11);
            if (!arrayList3.isEmpty()) {
            }
            if (!arrayList2.isEmpty()) {
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final g0 k() {
            return LazyJavaClassDescriptor.this.f13728s.f18762a.f18750m;
        }

        @Override // y9.b
        public final l8.b p() {
            return LazyJavaClassDescriptor.this;
        }

        public final String toString() {
            String b5 = LazyJavaClassDescriptor.this.getName().b();
            v7.g.e(b5, "name.asString()");
            return b5;
        }
    }

    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return a1.c.g0(DescriptorUtilsKt.g((l8.b) t10).b(), DescriptorUtilsKt.g((l8.b) t11).b());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LazyJavaClassDescriptor(x8.c cVar, l8.f fVar, g gVar, l8.b bVar) {
        super(r0.f18739a, fVar, gVar.getName(), r0.f18747j.a(gVar));
        ClassKind classKind;
        boolean z10;
        boolean z11;
        boolean z12;
        Modality modality;
        v7.g.f(cVar, "outerContext");
        v7.g.f(fVar, "containingDeclaration");
        v7.g.f(gVar, "jClass");
        x8.a aVar = cVar.f18762a;
        this.f13725p = cVar;
        this.f13726q = gVar;
        this.f13727r = bVar;
        x8.c a10 = ContextKt.a(cVar, this, gVar, 4);
        this.f13728s = a10;
        x8.a aVar2 = a10.f18762a;
        ((f.a) aVar2.f18744g).getClass();
        gVar.D();
        this.f13729t = kotlin.a.b(new LazyJavaClassDescriptor$moduleAnnotations$2(this));
        if (gVar.z()) {
            classKind = ClassKind.f13435m;
        } else if (gVar.B()) {
            classKind = ClassKind.f13432j;
        } else if (gVar.p()) {
            classKind = ClassKind.f13433k;
        } else {
            classKind = ClassKind.f13431i;
        }
        this.f13730u = classKind;
        boolean z13 = gVar.z();
        Modality modality2 = Modality.FINAL;
        if (!z13 && !gVar.p()) {
            boolean u10 = gVar.u();
            if (!gVar.u() && !gVar.C() && !gVar.B()) {
                z12 = false;
                boolean z14 = !gVar.w();
                if (!u10) {
                    modality = Modality.SEALED;
                } else if (z12) {
                    modality = Modality.ABSTRACT;
                } else if (z14) {
                    modality = Modality.OPEN;
                }
                modality2 = modality;
            }
            z12 = true;
            boolean z142 = !gVar.w();
            if (!u10) {
            }
            modality2 = modality;
        }
        this.f13731v = modality2;
        this.f13732w = gVar.g();
        if (gVar.A() != null && !gVar.S()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13733x = z10;
        this.f13734y = new LazyJavaClassTypeConstructor();
        if (bVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(a10, this, gVar, z11, null);
        this.f13735z = lazyJavaClassMemberScope;
        ScopesHolderForClass.a aVar3 = ScopesHolderForClass.f13457e;
        kotlin.reflect.jvm.internal.impl.types.checker.e b5 = aVar2.f18757u.b();
        LazyJavaClassDescriptor$scopeHolder$1 lazyJavaClassDescriptor$scopeHolder$1 = new LazyJavaClassDescriptor$scopeHolder$1(this);
        aVar3.getClass();
        x9.h hVar = aVar2.f18739a;
        this.A = ScopesHolderForClass.a.a(lazyJavaClassDescriptor$scopeHolder$1, this, hVar, b5);
        this.B = new e(lazyJavaClassMemberScope);
        this.C = new c(a10, gVar, this);
        this.D = m0.b.e1(a10, gVar);
        this.E = hVar.a(new LazyJavaClassDescriptor$declaredParameters$1(this));
    }

    @Override // l8.b
    public final kotlin.reflect.jvm.internal.impl.descriptors.b A0() {
        return null;
    }

    @Override // l8.b
    public final MemberScope B0() {
        return this.C;
    }

    @Override // l8.b
    public final l8.b E0() {
        return null;
    }

    @Override // l8.b
    public final boolean H() {
        return false;
    }

    @Override // l8.b
    public final Collection J() {
        return this.f13735z.f13743q.k0();
    }

    @Override // l8.r
    public final boolean L0() {
        return false;
    }

    @Override // l8.b
    public final boolean Q0() {
        return false;
    }

    @Override // o8.b, l8.b
    /* renamed from: S0 */
    public final LazyJavaClassMemberScope I0() {
        MemberScope I0 = super.I0();
        v7.g.d(I0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (LazyJavaClassMemberScope) I0;
    }

    @Override // l8.b
    public final boolean T() {
        return false;
    }

    @Override // o8.w
    public final MemberScope c0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        return this.A.a(eVar);
    }

    @Override // l8.b
    public final Collection<l8.b> e0() {
        l8.b bVar;
        if (this.f13731v == Modality.SEALED) {
            z8.a r1 = m0.b.r1(TypeUsage.COMMON, false, false, null, 7);
            Collection<j> L = this.f13726q.L();
            ArrayList arrayList = new ArrayList();
            for (j jVar : L) {
                l8.d c = this.f13728s.f18765e.e(jVar, r1).U0().c();
                if (c instanceof l8.b) {
                    bVar = (l8.b) c;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            return kotlin.collections.c.G2(arrayList, new a());
        }
        return EmptyList.f12981i;
    }

    @Override // l8.b, l8.j, l8.r
    public final m g() {
        l.d dVar = l8.l.f15839a;
        n0 n0Var = this.f13732w;
        if (v7.g.a(n0Var, dVar) && this.f13726q.A() == null) {
            k.a aVar = u8.k.f17852a;
            v7.g.e(aVar, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
            return aVar;
        }
        return t.a(n0Var);
    }

    @Override // m8.a
    public final m8.e getAnnotations() {
        return this.D;
    }

    @Override // l8.b
    public final ClassKind h() {
        return this.f13730u;
    }

    @Override // l8.b
    public final boolean i() {
        return false;
    }

    @Override // l8.b
    public final boolean i0() {
        return false;
    }

    @Override // l8.r
    public final boolean l0() {
        return false;
    }

    @Override // l8.e
    public final boolean m0() {
        return this.f13733x;
    }

    @Override // l8.d
    public final e0 o() {
        return this.f13734y;
    }

    @Override // l8.b, l8.r
    public final Modality p() {
        return this.f13731v;
    }

    public final String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.h(this);
    }

    @Override // o8.b, l8.b
    public final MemberScope w0() {
        return this.B;
    }

    @Override // l8.b, l8.e
    public final List<i0> x() {
        return this.E.k0();
    }

    @Override // l8.b
    public final j0<v> x0() {
        return null;
    }
}
