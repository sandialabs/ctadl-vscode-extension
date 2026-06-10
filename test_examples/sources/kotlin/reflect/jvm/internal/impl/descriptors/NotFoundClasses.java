package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l8.d0;
import l8.i0;
import l8.l;
import l8.m;
import l8.s;
import l8.u;
import m8.e;
import n7.l;
import o8.j0;
import o8.k;
import y9.e0;
import y9.v;

/* loaded from: classes.dex */
public final class NotFoundClasses {

    /* renamed from: a  reason: collision with root package name */
    public final x9.h f13444a;

    /* renamed from: b  reason: collision with root package name */
    public final s f13445b;
    public final x9.c<h9.c, u> c;

    /* renamed from: d  reason: collision with root package name */
    public final x9.c<a, l8.b> f13446d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final h9.b f13447a;

        /* renamed from: b  reason: collision with root package name */
        public final List<Integer> f13448b;

        public a(h9.b bVar, List<Integer> list) {
            v7.g.f(bVar, "classId");
            v7.g.f(list, "typeParametersCount");
            this.f13447a = bVar;
            this.f13448b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return v7.g.a(this.f13447a, aVar.f13447a) && v7.g.a(this.f13448b, aVar.f13448b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13448b.hashCode() + (this.f13447a.hashCode() * 31);
        }

        public final String toString() {
            return "ClassRequest(classId=" + this.f13447a + ", typeParametersCount=" + this.f13448b + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends k {

        /* renamed from: p  reason: collision with root package name */
        public final boolean f13449p;

        /* renamed from: q  reason: collision with root package name */
        public final ArrayList f13450q;

        /* renamed from: r  reason: collision with root package name */
        public final y9.d f13451r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x9.h hVar, l8.c cVar, h9.e eVar, boolean z10, int i10) {
            super(hVar, cVar, eVar, d0.f15835a);
            v7.g.f(hVar, "storageManager");
            v7.g.f(cVar, "container");
            this.f13449p = z10;
            b8.i V1 = a1.c.V1(0, i10);
            ArrayList arrayList = new ArrayList(l.Z1(V1, 10));
            b8.h it = V1.iterator();
            while (it.f6502k) {
                int nextInt = it.nextInt();
                Variance variance = Variance.INVARIANT;
                arrayList.add(j0.W0(this, variance, h9.e.k("T" + nextInt), nextInt, hVar));
            }
            this.f13450q = arrayList;
            this.f13451r = new y9.d(this, TypeParameterUtilsKt.b(this), a1.c.v1(DescriptorUtilsKt.j(this).u().f()), hVar);
        }

        @Override // l8.b
        public final kotlin.reflect.jvm.internal.impl.descriptors.b A0() {
            return null;
        }

        @Override // l8.b
        public final MemberScope B0() {
            return MemberScope.a.f14741b;
        }

        @Override // o8.k, l8.r
        public final boolean D() {
            return false;
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
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> J() {
            return EmptySet.f12983i;
        }

        @Override // l8.r
        public final boolean L0() {
            return false;
        }

        @Override // l8.b
        public final boolean Q0() {
            return false;
        }

        @Override // l8.b
        public final boolean T() {
            return false;
        }

        @Override // o8.w
        public final MemberScope c0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
            v7.g.f(eVar, "kotlinTypeRefiner");
            return MemberScope.a.f14741b;
        }

        @Override // l8.b
        public final Collection<l8.b> e0() {
            return EmptyList.f12981i;
        }

        @Override // l8.b, l8.j, l8.r
        public final m g() {
            l.h hVar = l8.l.f15842e;
            v7.g.e(hVar, "PUBLIC");
            return hVar;
        }

        @Override // m8.a
        public final m8.e getAnnotations() {
            return e.a.f16014a;
        }

        @Override // l8.b
        public final ClassKind h() {
            return ClassKind.f13431i;
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
            return this.f13449p;
        }

        @Override // l8.d
        public final e0 o() {
            return this.f13451r;
        }

        @Override // l8.b, l8.r
        public final Modality p() {
            return Modality.FINAL;
        }

        public final String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // l8.b, l8.e
        public final List<i0> x() {
            return this.f13450q;
        }

        @Override // l8.b
        public final l8.j0<v> x0() {
            return null;
        }
    }

    public NotFoundClasses(x9.h hVar, s sVar) {
        v7.g.f(hVar, "storageManager");
        v7.g.f(sVar, "module");
        this.f13444a = hVar;
        this.f13445b = sVar;
        this.c = hVar.e(new NotFoundClasses$packageFragments$1(this));
        this.f13446d = hVar.e(new NotFoundClasses$classes$1(this));
    }

    public final l8.b a(h9.b bVar, List<Integer> list) {
        v7.g.f(bVar, "classId");
        v7.g.f(list, "typeParametersCount");
        return (l8.b) ((LockBasedStorageManager.k) this.f13446d).U(new a(bVar, list));
    }
}
