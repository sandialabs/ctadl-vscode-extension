package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final h9.e f13345a;

    /* renamed from: b  reason: collision with root package name */
    public static final h9.e f13346b;
    public static final h9.e c;

    /* renamed from: d  reason: collision with root package name */
    public static final h9.e f13347d;

    /* renamed from: e  reason: collision with root package name */
    public static final h9.c f13348e;

    /* renamed from: f  reason: collision with root package name */
    public static final h9.c f13349f;

    /* renamed from: g  reason: collision with root package name */
    public static final h9.c f13350g;

    /* renamed from: h  reason: collision with root package name */
    public static final h9.c f13351h;

    /* renamed from: i  reason: collision with root package name */
    public static final List<String> f13352i;

    /* renamed from: j  reason: collision with root package name */
    public static final h9.e f13353j;

    /* renamed from: k  reason: collision with root package name */
    public static final h9.c f13354k;

    /* renamed from: l  reason: collision with root package name */
    public static final h9.c f13355l;

    /* renamed from: m  reason: collision with root package name */
    public static final h9.c f13356m;
    public static final h9.c n;

    /* renamed from: o  reason: collision with root package name */
    public static final Set<h9.c> f13357o;

    /* loaded from: classes.dex */
    public static final class a {
        public static final h9.c A;
        public static final h9.c B;
        public static final h9.c C;
        public static final h9.c D;
        public static final h9.c E;
        public static final h9.c F;
        public static final h9.c G;
        public static final h9.c H;
        public static final h9.c I;
        public static final h9.c J;
        public static final h9.c K;
        public static final h9.c L;
        public static final h9.c M;
        public static final h9.c N;
        public static final h9.c O;
        public static final h9.d P;
        public static final h9.b Q;
        public static final h9.b R;
        public static final h9.b S;
        public static final h9.b T;
        public static final h9.b U;
        public static final h9.c V;
        public static final h9.c W;
        public static final h9.c X;
        public static final h9.c Y;
        public static final HashSet Z;

        /* renamed from: a0  reason: collision with root package name */
        public static final HashSet f13359a0;

        /* renamed from: b0  reason: collision with root package name */
        public static final HashMap f13361b0;
        public static final HashMap c0;

        /* renamed from: d  reason: collision with root package name */
        public static final h9.d f13362d;

        /* renamed from: e  reason: collision with root package name */
        public static final h9.d f13363e;

        /* renamed from: f  reason: collision with root package name */
        public static final h9.d f13364f;

        /* renamed from: g  reason: collision with root package name */
        public static final h9.d f13365g;

        /* renamed from: h  reason: collision with root package name */
        public static final h9.d f13366h;

        /* renamed from: i  reason: collision with root package name */
        public static final h9.d f13367i;

        /* renamed from: j  reason: collision with root package name */
        public static final h9.d f13368j;

        /* renamed from: k  reason: collision with root package name */
        public static final h9.c f13369k;

        /* renamed from: l  reason: collision with root package name */
        public static final h9.c f13370l;

        /* renamed from: m  reason: collision with root package name */
        public static final h9.c f13371m;
        public static final h9.c n;

        /* renamed from: o  reason: collision with root package name */
        public static final h9.c f13372o;

        /* renamed from: p  reason: collision with root package name */
        public static final h9.c f13373p;

        /* renamed from: q  reason: collision with root package name */
        public static final h9.c f13374q;

        /* renamed from: r  reason: collision with root package name */
        public static final h9.c f13375r;

        /* renamed from: s  reason: collision with root package name */
        public static final h9.c f13376s;

        /* renamed from: t  reason: collision with root package name */
        public static final h9.c f13377t;

        /* renamed from: u  reason: collision with root package name */
        public static final h9.c f13378u;

        /* renamed from: v  reason: collision with root package name */
        public static final h9.c f13379v;

        /* renamed from: w  reason: collision with root package name */
        public static final h9.c f13380w;

        /* renamed from: x  reason: collision with root package name */
        public static final h9.c f13381x;

        /* renamed from: y  reason: collision with root package name */
        public static final h9.c f13382y;

        /* renamed from: z  reason: collision with root package name */
        public static final h9.c f13383z;

        /* renamed from: a  reason: collision with root package name */
        public static final h9.d f13358a = d("Any");

        /* renamed from: b  reason: collision with root package name */
        public static final h9.d f13360b = d("Nothing");
        public static final h9.d c = d("Cloneable");

        static {
            int i10;
            int i11;
            int i12;
            PrimitiveType[] values;
            PrimitiveType[] values2;
            c("Suppress");
            f13362d = d("Unit");
            f13363e = d("CharSequence");
            f13364f = d("String");
            f13365g = d("Array");
            f13366h = d("Boolean");
            d("Char");
            d("Byte");
            d("Short");
            d("Int");
            d("Long");
            d("Float");
            d("Double");
            f13367i = d("Number");
            f13368j = d("Enum");
            d("Function");
            f13369k = c("Throwable");
            f13370l = c("Comparable");
            h9.c cVar = g.n;
            v7.g.e(cVar.c(h9.e.k("IntRange")).i(), "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
            v7.g.e(cVar.c(h9.e.k("LongRange")).i(), "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
            f13371m = c("Deprecated");
            c("DeprecatedSinceKotlin");
            n = c("DeprecationLevel");
            f13372o = c("ReplaceWith");
            f13373p = c("ExtensionFunctionType");
            f13374q = c("ContextFunctionTypeParams");
            h9.c c10 = c("ParameterName");
            f13375r = c10;
            h9.b.l(c10);
            f13376s = c("Annotation");
            h9.c a10 = a("Target");
            f13377t = a10;
            h9.b.l(a10);
            f13378u = a("AnnotationTarget");
            f13379v = a("AnnotationRetention");
            h9.c a11 = a("Retention");
            f13380w = a11;
            h9.b.l(a11);
            h9.b.l(a("Repeatable"));
            f13381x = a("MustBeDocumented");
            f13382y = c("UnsafeVariance");
            c("PublishedApi");
            f13383z = b("Iterator");
            A = b("Iterable");
            B = b("Collection");
            C = b("List");
            D = b("ListIterator");
            E = b("Set");
            h9.c b5 = b("Map");
            F = b5;
            G = b5.c(h9.e.k("Entry"));
            H = b("MutableIterator");
            I = b("MutableIterable");
            J = b("MutableCollection");
            K = b("MutableList");
            L = b("MutableListIterator");
            M = b("MutableSet");
            h9.c b10 = b("MutableMap");
            N = b10;
            O = b10.c(h9.e.k("MutableEntry"));
            P = e("KClass");
            e("KCallable");
            e("KProperty0");
            e("KProperty1");
            e("KProperty2");
            e("KMutableProperty0");
            e("KMutableProperty1");
            e("KMutableProperty2");
            h9.d e10 = e("KProperty");
            e("KMutableProperty");
            Q = h9.b.l(e10.h());
            e("KDeclarationContainer");
            h9.c c11 = c("UByte");
            h9.c c12 = c("UShort");
            h9.c c13 = c("UInt");
            h9.c c14 = c("ULong");
            R = h9.b.l(c11);
            S = h9.b.l(c12);
            T = h9.b.l(c13);
            U = h9.b.l(c14);
            V = c("UByteArray");
            W = c("UShortArray");
            X = c("UIntArray");
            Y = c("ULongArray");
            int length = PrimitiveType.values().length;
            int i13 = 3;
            if (length < 3) {
                i10 = 3;
            } else {
                i10 = (length / 3) + length + 1;
            }
            HashSet hashSet = new HashSet(i10);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                hashSet.add(primitiveType.f13305i);
            }
            Z = hashSet;
            int length2 = PrimitiveType.values().length;
            if (length2 < 3) {
                i11 = 3;
            } else {
                i11 = (length2 / 3) + length2 + 1;
            }
            HashSet hashSet2 = new HashSet(i11);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                hashSet2.add(primitiveType2.f13306j);
            }
            f13359a0 = hashSet2;
            int length3 = PrimitiveType.values().length;
            if (length3 < 3) {
                i12 = 3;
            } else {
                i12 = (length3 / 3) + length3 + 1;
            }
            HashMap hashMap = new HashMap(i12);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                String b11 = primitiveType3.f13305i.b();
                v7.g.e(b11, "primitiveType.typeName.asString()");
                hashMap.put(d(b11), primitiveType3);
            }
            f13361b0 = hashMap;
            int length4 = PrimitiveType.values().length;
            if (length4 >= 3) {
                i13 = (length4 / 3) + length4 + 1;
            }
            HashMap hashMap2 = new HashMap(i13);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                String b12 = primitiveType4.f13306j.b();
                v7.g.e(b12, "primitiveType.arrayTypeName.asString()");
                hashMap2.put(d(b12), primitiveType4);
            }
            c0 = hashMap2;
        }

        public static h9.c a(String str) {
            return g.f13355l.c(h9.e.k(str));
        }

        public static h9.c b(String str) {
            return g.f13356m.c(h9.e.k(str));
        }

        public static h9.c c(String str) {
            return g.f13354k.c(h9.e.k(str));
        }

        public static h9.d d(String str) {
            h9.d i10 = c(str).i();
            v7.g.e(i10, "fqName(simpleName).toUnsafe()");
            return i10;
        }

        public static final h9.d e(String str) {
            h9.d i10 = g.f13351h.c(h9.e.k(str)).i();
            v7.g.e(i10, "KOTLIN_REFLECT_FQ_NAME.c…r(simpleName)).toUnsafe()");
            return i10;
        }
    }

    static {
        h9.e.k("field");
        h9.e.k("value");
        f13345a = h9.e.k("values");
        f13346b = h9.e.k("entries");
        c = h9.e.k("valueOf");
        h9.e.k("copy");
        h9.e.k("hashCode");
        h9.e.k("code");
        f13347d = h9.e.k("count");
        new h9.c("<dynamic>");
        h9.c cVar = new h9.c("kotlin.coroutines");
        f13348e = cVar;
        new h9.c("kotlin.coroutines.jvm.internal");
        new h9.c("kotlin.coroutines.intrinsics");
        f13349f = cVar.c(h9.e.k("Continuation"));
        f13350g = new h9.c("kotlin.Result");
        h9.c cVar2 = new h9.c("kotlin.reflect");
        f13351h = cVar2;
        f13352i = a1.c.O0("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
        h9.e k3 = h9.e.k("kotlin");
        f13353j = k3;
        h9.c j2 = h9.c.j(k3);
        f13354k = j2;
        h9.c c10 = j2.c(h9.e.k("annotation"));
        f13355l = c10;
        h9.c c11 = j2.c(h9.e.k("collections"));
        f13356m = c11;
        h9.c c12 = j2.c(h9.e.k("ranges"));
        n = c12;
        j2.c(h9.e.k("text"));
        f13357o = a1.c.w1(j2, c11, c12, c10, cVar2, j2.c(h9.e.k("internal")), cVar);
    }
}
