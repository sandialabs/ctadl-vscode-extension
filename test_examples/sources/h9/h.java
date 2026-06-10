package h9;

import java.util.LinkedHashMap;
import java.util.Set;
import n7.l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final c f11581a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f11582b;
    public static final c c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f11583d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f11584e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f11585f;

    /* renamed from: g  reason: collision with root package name */
    public static final c f11586g;

    /* renamed from: h  reason: collision with root package name */
    public static final Set<c> f11587h;

    /* renamed from: i  reason: collision with root package name */
    public static final b f11588i;

    /* renamed from: j  reason: collision with root package name */
    public static final b f11589j;

    /* renamed from: k  reason: collision with root package name */
    public static final b f11590k;

    /* renamed from: l  reason: collision with root package name */
    public static final b f11591l;

    /* renamed from: m  reason: collision with root package name */
    public static final b f11592m;
    public static final b n;

    /* renamed from: o  reason: collision with root package name */
    public static final b f11593o;

    /* renamed from: p  reason: collision with root package name */
    public static final Set<b> f11594p;

    /* renamed from: q  reason: collision with root package name */
    public static final Set<b> f11595q;

    /* renamed from: r  reason: collision with root package name */
    public static final b f11596r;

    /* renamed from: s  reason: collision with root package name */
    public static final b f11597s;

    /* renamed from: t  reason: collision with root package name */
    public static final b f11598t;

    /* renamed from: u  reason: collision with root package name */
    public static final b f11599u;

    static {
        c cVar = new c("kotlin");
        f11581a = cVar;
        c c10 = cVar.c(e.k("reflect"));
        f11582b = c10;
        c c11 = cVar.c(e.k("collections"));
        c = c11;
        c c12 = cVar.c(e.k("ranges"));
        f11583d = c12;
        cVar.c(e.k("jvm")).c(e.k("internal"));
        c c13 = cVar.c(e.k("annotation"));
        f11584e = c13;
        c c14 = cVar.c(e.k("internal"));
        c14.c(e.k("ir"));
        c c15 = cVar.c(e.k("coroutines"));
        f11585f = c15;
        f11586g = cVar.c(e.k("enums"));
        f11587h = a1.c.w1(cVar, c11, c12, c13, c10, c14, c15);
        i.a("Nothing");
        i.a("Unit");
        i.a("Any");
        i.a("Enum");
        i.a("Annotation");
        f11588i = i.a("Array");
        b a10 = i.a("Boolean");
        b a11 = i.a("Char");
        b a12 = i.a("Byte");
        b a13 = i.a("Short");
        b a14 = i.a("Int");
        b a15 = i.a("Long");
        b a16 = i.a("Float");
        b a17 = i.a("Double");
        f11589j = i.g(a12);
        f11590k = i.g(a13);
        f11591l = i.g(a14);
        f11592m = i.g(a15);
        n = i.a("String");
        i.a("Throwable");
        i.a("Cloneable");
        i.f("KProperty");
        i.f("KMutableProperty");
        i.f("KProperty0");
        i.f("KMutableProperty0");
        i.f("KProperty1");
        i.f("KMutableProperty1");
        i.f("KProperty2");
        i.f("KMutableProperty2");
        f11593o = i.f("KFunction");
        i.f("KClass");
        i.f("KCallable");
        i.a("Comparable");
        i.a("Number");
        i.a("Function");
        Set<b> w12 = a1.c.w1(a10, a11, a12, a13, a14, a15, a16, a17);
        f11594p = w12;
        int O0 = m0.b.O0(l.Z1(w12, 10));
        int i10 = 16;
        if (O0 < 16) {
            O0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(O0);
        for (Object obj : w12) {
            e j2 = ((b) obj).j();
            v7.g.e(j2, "id.shortClassName");
            linkedHashMap.put(obj, i.d(j2));
        }
        i.c(linkedHashMap);
        Set<b> w13 = a1.c.w1(f11589j, f11590k, f11591l, f11592m);
        f11595q = w13;
        int O02 = m0.b.O0(l.Z1(w13, 10));
        if (O02 >= 16) {
            i10 = O02;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i10);
        for (Object obj2 : w13) {
            e j10 = ((b) obj2).j();
            v7.g.e(j10, "id.shortClassName");
            linkedHashMap2.put(obj2, i.d(j10));
        }
        i.c(linkedHashMap2);
        l.b2(l.c2(f11594p, f11595q), n);
        c cVar2 = f11585f;
        e k3 = e.k("Continuation");
        if (cVar2 != null) {
            c.j(k3);
            i.b("Iterator");
            i.b("Iterable");
            i.b("Collection");
            i.b("List");
            i.b("ListIterator");
            i.b("Set");
            b b5 = i.b("Map");
            i.b("MutableIterator");
            i.b("MutableIterable");
            i.b("MutableCollection");
            f11596r = i.b("MutableList");
            i.b("MutableListIterator");
            f11597s = i.b("MutableSet");
            b b10 = i.b("MutableMap");
            f11598t = b10;
            b5.d(e.k("Entry"));
            b10.d(e.k("MutableEntry"));
            i.a("Result");
            i.e("IntRange");
            i.e("LongRange");
            i.e("CharRange");
            c cVar3 = f11584e;
            e k10 = e.k("AnnotationRetention");
            if (cVar3 != null) {
                c.j(k10);
                c.j(e.k("AnnotationTarget"));
                f11599u = new b(f11586g, e.k("EnumEntries"));
                return;
            }
            b.a(3);
            throw null;
        }
        b.a(3);
        throw null;
    }
}
