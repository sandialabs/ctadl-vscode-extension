package v7;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import u7.m;
import u7.n;
import u7.o;
import u7.p;
import u7.q;
import u7.r;
import u7.s;
import u7.t;
import u7.u;
import u7.v;
import u7.w;

/* loaded from: classes.dex */
public final class l {
    public static Collection a(LinkedHashSet linkedHashSet) {
        if ((linkedHashSet instanceof w7.a) && !(linkedHashSet instanceof w7.b)) {
            f(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
        return linkedHashSet;
    }

    public static Map b(AbstractMap abstractMap) {
        if ((abstractMap instanceof w7.a) && !(abstractMap instanceof w7.c)) {
            f(abstractMap, "kotlin.collections.MutableMap");
            throw null;
        }
        return abstractMap;
    }

    public static Set c(Object obj) {
        if ((obj instanceof w7.a) && !(obj instanceof w7.d)) {
            f(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            g.j(l.class.getName(), e10);
            throw e10;
        }
    }

    public static void d(int i10, Object obj) {
        if (obj != null && !e(i10, obj)) {
            f(obj, "kotlin.jvm.functions.Function" + i10);
            throw null;
        }
    }

    public static boolean e(int i10, Object obj) {
        int i11;
        if (!(obj instanceof m7.c)) {
            return false;
        }
        if (obj instanceof f) {
            i11 = ((f) obj).D();
        } else if (obj instanceof u7.a) {
            i11 = 0;
        } else if (obj instanceof u7.l) {
            i11 = 1;
        } else if (obj instanceof p) {
            i11 = 2;
        } else if (obj instanceof q) {
            i11 = 3;
        } else if (obj instanceof r) {
            i11 = 4;
        } else if (obj instanceof s) {
            i11 = 5;
        } else if (obj instanceof t) {
            i11 = 6;
        } else if (obj instanceof u) {
            i11 = 7;
        } else if (obj instanceof v) {
            i11 = 8;
        } else if (obj instanceof w) {
            i11 = 9;
        } else if (obj instanceof u7.b) {
            i11 = 10;
        } else if (obj instanceof u7.c) {
            i11 = 11;
        } else if (obj instanceof u7.d) {
            i11 = 12;
        } else if (obj instanceof u7.e) {
            i11 = 13;
        } else if (obj instanceof u7.f) {
            i11 = 14;
        } else if (obj instanceof u7.g) {
            i11 = 15;
        } else if (obj instanceof u7.h) {
            i11 = 16;
        } else if (obj instanceof u7.i) {
            i11 = 17;
        } else if (obj instanceof u7.j) {
            i11 = 18;
        } else if (obj instanceof u7.k) {
            i11 = 19;
        } else if (obj instanceof m) {
            i11 = 20;
        } else if (obj instanceof n) {
            i11 = 21;
        } else if (obj instanceof o) {
            i11 = 22;
        } else {
            i11 = -1;
        }
        if (i11 != i10) {
            return false;
        }
        return true;
    }

    public static void f(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(name + " cannot be cast to " + str);
        g.j(l.class.getName(), classCastException);
        throw classCastException;
    }
}
