package j8;

import b8.i;
import h9.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l8.d;
import l8.d0;
import l8.f;
import l8.g0;
import l8.i0;
import l8.l;
import l8.m;
import l8.s;
import l8.u;
import m7.n;
import m8.e;
import n7.l;
import o8.j0;
import x9.h;
import y9.e0;
import y9.h0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class a extends o8.b {

    /* renamed from: t  reason: collision with root package name */
    public static final h9.b f12744t = new h9.b(g.f13354k, e.k("Function"));

    /* renamed from: u  reason: collision with root package name */
    public static final h9.b f12745u = new h9.b(g.f13351h, e.k("KFunction"));

    /* renamed from: m  reason: collision with root package name */
    public final h f12746m;
    public final u n;

    /* renamed from: o  reason: collision with root package name */
    public final FunctionClassKind f12747o;

    /* renamed from: p  reason: collision with root package name */
    public final int f12748p;

    /* renamed from: q  reason: collision with root package name */
    public final C0138a f12749q;

    /* renamed from: r  reason: collision with root package name */
    public final b f12750r;

    /* renamed from: s  reason: collision with root package name */
    public final List<i0> f12751s;

    /* renamed from: j8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0138a extends y9.b {
        public C0138a() {
            super(a.this.f12746m);
        }

        @Override // y9.e0
        public final boolean a() {
            return true;
        }

        @Override // y9.b, y9.e, y9.e0
        public final d c() {
            return a.this;
        }

        @Override // y9.e0
        public final List<i0> e() {
            return a.this.f12751s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final Collection<r> h() {
            List<h9.b> N0;
            boolean z10;
            Iterable<i0> iterable;
            a aVar = a.this;
            int ordinal = aVar.f12747o.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        N0 = a1.c.O0(a.f12745u, new h9.b(g.f13348e, FunctionClassKind.f13336m.a(aVar.f12748p)));
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    N0 = a1.c.O0(a.f12745u, new h9.b(g.f13354k, FunctionClassKind.f13335l.a(aVar.f12748p)));
                }
            } else {
                N0 = a1.c.N0(a.f12744t);
            }
            s c = aVar.n.c();
            ArrayList arrayList = new ArrayList(l.Z1(N0, 10));
            for (h9.b bVar : N0) {
                l8.b a10 = FindClassInModuleKt.a(c, bVar);
                if (a10 != null) {
                    List<i0> list = aVar.f12751s;
                    int size = a10.o().e().size();
                    v7.g.f(list, "<this>");
                    if (size >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (size == 0) {
                            iterable = EmptyList.f12981i;
                        } else {
                            int size2 = list.size();
                            if (size >= size2) {
                                iterable = kotlin.collections.c.L2(list);
                            } else if (size == 1) {
                                iterable = a1.c.N0(kotlin.collections.c.v2(list));
                            } else {
                                ArrayList arrayList2 = new ArrayList(size);
                                if (list instanceof RandomAccess) {
                                    for (int i10 = size2 - size; i10 < size2; i10++) {
                                        arrayList2.add(list.get(i10));
                                    }
                                } else {
                                    ListIterator<i0> listIterator = list.listIterator(size2 - size);
                                    while (listIterator.hasNext()) {
                                        arrayList2.add(listIterator.next());
                                    }
                                }
                                iterable = arrayList2;
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(l.Z1(iterable, 10));
                        for (i0 i0Var : iterable) {
                            arrayList3.add(new h0(i0Var.r()));
                        }
                        kotlin.reflect.jvm.internal.impl.types.l.f15045j.getClass();
                        arrayList.add(KotlinTypeFactory.e(kotlin.reflect.jvm.internal.impl.types.l.f15046k, a10, arrayList3));
                    } else {
                        throw new IllegalArgumentException(a4.b.i("Requested element count ", size, " is less than zero.").toString());
                    }
                } else {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
            }
            return kotlin.collections.c.L2(arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final g0 k() {
            return g0.a.f15837a;
        }

        @Override // y9.b
        public final l8.b p() {
            return a.this;
        }

        public final String toString() {
            return a.this.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, i8.a aVar, FunctionClassKind functionClassKind, int i10) {
        super(hVar, functionClassKind.a(i10));
        v7.g.f(hVar, "storageManager");
        v7.g.f(aVar, "containingDeclaration");
        v7.g.f(functionClassKind, "functionKind");
        this.f12746m = hVar;
        this.n = aVar;
        this.f12747o = functionClassKind;
        this.f12748p = i10;
        this.f12749q = new C0138a();
        this.f12750r = new b(hVar, this);
        ArrayList arrayList = new ArrayList();
        i iVar = new i(1, i10);
        ArrayList arrayList2 = new ArrayList(l.Z1(iVar, 10));
        b8.h it = iVar.iterator();
        while (it.f6502k) {
            int nextInt = it.nextInt();
            Variance variance = Variance.IN_VARIANCE;
            arrayList.add(j0.W0(this, variance, e.k("P" + nextInt), arrayList.size(), this.f12746m));
            arrayList2.add(n.f16010a);
        }
        arrayList.add(j0.W0(this, Variance.OUT_VARIANCE, e.k("R"), arrayList.size(), this.f12746m));
        this.f12751s = kotlin.collections.c.L2(arrayList);
    }

    @Override // l8.b
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.b A0() {
        return null;
    }

    @Override // l8.b
    public final MemberScope B0() {
        return MemberScope.a.f14741b;
    }

    @Override // l8.r
    public final boolean D() {
        return false;
    }

    @Override // l8.b
    public final /* bridge */ /* synthetic */ l8.b E0() {
        return null;
    }

    @Override // l8.b
    public final boolean H() {
        return false;
    }

    @Override // l8.b
    public final Collection J() {
        return EmptyList.f12981i;
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

    @Override // l8.b, l8.g, l8.f
    public final f c() {
        return this.n;
    }

    @Override // o8.w
    public final MemberScope c0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        return this.f12750r;
    }

    @Override // l8.b
    public final Collection e0() {
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
        return ClassKind.f13432j;
    }

    @Override // l8.b
    public final boolean i() {
        return false;
    }

    @Override // l8.b
    public final boolean i0() {
        return false;
    }

    @Override // l8.i
    public final d0 j() {
        return d0.f15835a;
    }

    @Override // l8.r
    public final boolean l0() {
        return false;
    }

    @Override // l8.e
    public final boolean m0() {
        return false;
    }

    @Override // l8.d
    public final e0 o() {
        return this.f12749q;
    }

    @Override // l8.b, l8.r
    public final Modality p() {
        return Modality.ABSTRACT;
    }

    public final String toString() {
        String b5 = getName().b();
        v7.g.e(b5, "name.asString()");
        return b5;
    }

    @Override // l8.b, l8.e
    public final List<i0> x() {
        return this.f12751s;
    }

    @Override // l8.b
    public final l8.j0<v> x0() {
        return null;
    }
}
