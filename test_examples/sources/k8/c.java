package k8;

import h9.h;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12921a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f12922b;
    public static final String c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f12923d;

    /* renamed from: e  reason: collision with root package name */
    public static final h9.b f12924e;

    /* renamed from: f  reason: collision with root package name */
    public static final h9.c f12925f;

    /* renamed from: g  reason: collision with root package name */
    public static final h9.b f12926g;

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap<h9.d, h9.b> f12927h;

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap<h9.d, h9.b> f12928i;

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap<h9.d, h9.c> f12929j;

    /* renamed from: k  reason: collision with root package name */
    public static final HashMap<h9.d, h9.c> f12930k;

    /* renamed from: l  reason: collision with root package name */
    public static final HashMap<h9.b, h9.b> f12931l;

    /* renamed from: m  reason: collision with root package name */
    public static final HashMap<h9.b, h9.b> f12932m;
    public static final List<a> n;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final h9.b f12933a;

        /* renamed from: b  reason: collision with root package name */
        public final h9.b f12934b;
        public final h9.b c;

        public a(h9.b bVar, h9.b bVar2, h9.b bVar3) {
            this.f12933a = bVar;
            this.f12934b = bVar2;
            this.c = bVar3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return v7.g.a(this.f12933a, aVar.f12933a) && v7.g.a(this.f12934b, aVar.f12934b) && v7.g.a(this.c, aVar.c);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f12934b.hashCode();
            return this.c.hashCode() + ((hashCode + (this.f12933a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f12933a + ", kotlinReadOnly=" + this.f12934b + ", kotlinMutable=" + this.c + ')';
        }
    }

    static {
        JvmPrimitiveType[] values;
        StringBuilder sb = new StringBuilder();
        FunctionClassKind functionClassKind = FunctionClassKind.f13335l;
        sb.append(functionClassKind.f13339i.toString());
        sb.append('.');
        sb.append(functionClassKind.f13340j);
        f12921a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        FunctionClassKind functionClassKind2 = FunctionClassKind.n;
        sb2.append(functionClassKind2.f13339i.toString());
        sb2.append('.');
        sb2.append(functionClassKind2.f13340j);
        f12922b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionClassKind functionClassKind3 = FunctionClassKind.f13336m;
        sb3.append(functionClassKind3.f13339i.toString());
        sb3.append('.');
        sb3.append(functionClassKind3.f13340j);
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionClassKind functionClassKind4 = FunctionClassKind.f13337o;
        sb4.append(functionClassKind4.f13339i.toString());
        sb4.append('.');
        sb4.append(functionClassKind4.f13340j);
        f12923d = sb4.toString();
        h9.b l2 = h9.b.l(new h9.c("kotlin.jvm.functions.FunctionN"));
        f12924e = l2;
        h9.c b5 = l2.b();
        v7.g.e(b5, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f12925f = b5;
        f12926g = h.f11593o;
        d(Class.class);
        f12927h = new HashMap<>();
        f12928i = new HashMap<>();
        f12929j = new HashMap<>();
        f12930k = new HashMap<>();
        f12931l = new HashMap<>();
        f12932m = new HashMap<>();
        h9.b l4 = h9.b.l(g.a.A);
        h9.c cVar = g.a.I;
        h9.c h10 = l4.h();
        h9.c h11 = l4.h();
        v7.g.e(h11, "kotlinReadOnly.packageFqName");
        h9.c b10 = kotlin.reflect.jvm.internal.impl.name.a.b(cVar, h11);
        h9.b bVar = new h9.b(h10, b10, false);
        h9.b l7 = h9.b.l(g.a.f13383z);
        h9.c cVar2 = g.a.H;
        h9.c h12 = l7.h();
        h9.c h13 = l7.h();
        v7.g.e(h13, "kotlinReadOnly.packageFqName");
        h9.b bVar2 = new h9.b(h12, kotlin.reflect.jvm.internal.impl.name.a.b(cVar2, h13), false);
        h9.b l10 = h9.b.l(g.a.B);
        h9.c cVar3 = g.a.J;
        h9.c h14 = l10.h();
        h9.c h15 = l10.h();
        v7.g.e(h15, "kotlinReadOnly.packageFqName");
        h9.b bVar3 = new h9.b(h14, kotlin.reflect.jvm.internal.impl.name.a.b(cVar3, h15), false);
        h9.b l11 = h9.b.l(g.a.C);
        h9.c cVar4 = g.a.K;
        h9.c h16 = l11.h();
        h9.c h17 = l11.h();
        v7.g.e(h17, "kotlinReadOnly.packageFqName");
        h9.b bVar4 = new h9.b(h16, kotlin.reflect.jvm.internal.impl.name.a.b(cVar4, h17), false);
        h9.b l12 = h9.b.l(g.a.E);
        h9.c cVar5 = g.a.M;
        h9.c h18 = l12.h();
        h9.c h19 = l12.h();
        v7.g.e(h19, "kotlinReadOnly.packageFqName");
        h9.b bVar5 = new h9.b(h18, kotlin.reflect.jvm.internal.impl.name.a.b(cVar5, h19), false);
        h9.b l13 = h9.b.l(g.a.D);
        h9.c cVar6 = g.a.L;
        h9.c h20 = l13.h();
        h9.c h21 = l13.h();
        v7.g.e(h21, "kotlinReadOnly.packageFqName");
        h9.b bVar6 = new h9.b(h20, kotlin.reflect.jvm.internal.impl.name.a.b(cVar6, h21), false);
        h9.c cVar7 = g.a.F;
        h9.b l14 = h9.b.l(cVar7);
        h9.c cVar8 = g.a.N;
        h9.c h22 = l14.h();
        h9.c h23 = l14.h();
        v7.g.e(h23, "kotlinReadOnly.packageFqName");
        h9.b bVar7 = new h9.b(h22, kotlin.reflect.jvm.internal.impl.name.a.b(cVar8, h23), false);
        h9.b d5 = h9.b.l(cVar7).d(g.a.G.f());
        h9.c cVar9 = g.a.O;
        h9.c h24 = d5.h();
        h9.c h25 = d5.h();
        v7.g.e(h25, "kotlinReadOnly.packageFqName");
        List<a> O0 = a1.c.O0(new a(d(Iterable.class), l4, bVar), new a(d(Iterator.class), l7, bVar2), new a(d(Collection.class), l10, bVar3), new a(d(List.class), l11, bVar4), new a(d(Set.class), l12, bVar5), new a(d(ListIterator.class), l13, bVar6), new a(d(Map.class), l14, bVar7), new a(d(Map.Entry.class), d5, new h9.b(h24, kotlin.reflect.jvm.internal.impl.name.a.b(cVar9, h25), false)));
        n = O0;
        c(Object.class, g.a.f13358a);
        c(String.class, g.a.f13364f);
        c(CharSequence.class, g.a.f13363e);
        a(d(Throwable.class), h9.b.l(g.a.f13369k));
        c(Cloneable.class, g.a.c);
        c(Number.class, g.a.f13367i);
        a(d(Comparable.class), h9.b.l(g.a.f13370l));
        c(Enum.class, g.a.f13368j);
        a(d(Annotation.class), h9.b.l(g.a.f13376s));
        for (a aVar : O0) {
            h9.b bVar8 = aVar.f12933a;
            h9.b bVar9 = aVar.f12934b;
            a(bVar8, bVar9);
            h9.b bVar10 = aVar.c;
            h9.c b11 = bVar10.b();
            v7.g.e(b11, "mutableClassId.asSingleFqName()");
            b(b11, bVar8);
            f12931l.put(bVar10, bVar9);
            f12932m.put(bVar9, bVar10);
            h9.c b12 = bVar9.b();
            v7.g.e(b12, "readOnlyClassId.asSingleFqName()");
            h9.c b13 = bVar10.b();
            v7.g.e(b13, "mutableClassId.asSingleFqName()");
            h9.d i10 = bVar10.b().i();
            v7.g.e(i10, "mutableClassId.asSingleFqName().toUnsafe()");
            f12929j.put(i10, b12);
            h9.d i11 = b12.i();
            v7.g.e(i11, "readOnlyFqName.toUnsafe()");
            f12930k.put(i11, b13);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            h9.b l15 = h9.b.l(jvmPrimitiveType.k());
            PrimitiveType j2 = jvmPrimitiveType.j();
            v7.g.e(j2, "jvmType.primitiveType");
            a(l15, h9.b.l(kotlin.reflect.jvm.internal.impl.builtins.g.f13354k.c(j2.f13305i)));
        }
        for (h9.b bVar11 : kotlin.reflect.jvm.internal.impl.builtins.a.f13321a) {
            a(h9.b.l(new h9.c("kotlin.jvm.internal." + bVar11.j().b() + "CompanionObject")), bVar11.d(h9.g.f11576b));
        }
        for (int i12 = 0; i12 < 23; i12++) {
            a(h9.b.l(new h9.c(androidx.activity.e.g("kotlin.jvm.functions.Function", i12))), new h9.b(kotlin.reflect.jvm.internal.impl.builtins.g.f13354k, h9.e.k("Function" + i12)));
            b(new h9.c(f12922b + i12), f12926g);
        }
        for (int i13 = 0; i13 < 22; i13++) {
            FunctionClassKind functionClassKind5 = FunctionClassKind.f13337o;
            b(new h9.c((functionClassKind5.f13339i.toString() + '.' + functionClassKind5.f13340j) + i13), f12926g);
        }
        h9.c h26 = g.a.f13360b.h();
        v7.g.e(h26, "nothing.toSafe()");
        b(h26, d(Void.class));
    }

    public static void a(h9.b bVar, h9.b bVar2) {
        h9.d i10 = bVar.b().i();
        v7.g.e(i10, "javaClassId.asSingleFqName().toUnsafe()");
        f12927h.put(i10, bVar2);
        h9.c b5 = bVar2.b();
        v7.g.e(b5, "kotlinClassId.asSingleFqName()");
        b(b5, bVar);
    }

    public static void b(h9.c cVar, h9.b bVar) {
        h9.d i10 = cVar.i();
        v7.g.e(i10, "kotlinFqNameUnsafe.toUnsafe()");
        f12928i.put(i10, bVar);
    }

    public static void c(Class cls, h9.d dVar) {
        h9.c h10 = dVar.h();
        v7.g.e(h10, "kotlinFqName.toSafe()");
        a(d(cls), h9.b.l(h10));
    }

    public static h9.b d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        return declaringClass == null ? h9.b.l(new h9.c(cls.getCanonicalName())) : d(declaringClass).d(h9.e.k(cls.getSimpleName()));
    }

    public static boolean e(h9.d dVar, String str) {
        boolean z10;
        Integer P0;
        String str2 = dVar.f11569a;
        if (str2 != null) {
            String r1 = kotlin.text.b.r1(str2, str, "");
            if (r1.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !kotlin.text.b.o1(r1, '0') && (P0 = ha.h.P0(r1)) != null && P0.intValue() >= 23) {
                return true;
            }
            return false;
        }
        h9.d.a(4);
        throw null;
    }

    public static h9.b f(h9.c cVar) {
        return f12927h.get(cVar.i());
    }

    public static h9.b g(h9.d dVar) {
        if (!e(dVar, f12921a) && !e(dVar, c)) {
            if (!e(dVar, f12922b) && !e(dVar, f12923d)) {
                return f12928i.get(dVar);
            }
            return f12926g;
        }
        return f12924e;
    }
}
