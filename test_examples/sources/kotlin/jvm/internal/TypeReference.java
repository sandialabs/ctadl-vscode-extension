package kotlin.jvm.internal;

import c8.b;
import c8.c;
import c8.k;
import c8.m;
import java.util.List;
import v7.g;

/* loaded from: classes.dex */
public final class TypeReference implements k {

    /* renamed from: a  reason: collision with root package name */
    public final c f13061a;

    /* renamed from: b  reason: collision with root package name */
    public final List<m> f13062b;
    public final k c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13063d;

    public TypeReference() {
        throw null;
    }

    public TypeReference(b bVar, List list) {
        g.f(bVar, "classifier");
        g.f(list, "arguments");
        this.f13061a = bVar;
        this.f13062b = list;
        this.c = null;
        this.f13063d = 0;
    }

    @Override // c8.k
    public final List<m> a() {
        return this.f13062b;
    }

    @Override // c8.k
    public final boolean b() {
        return (this.f13063d & 1) != 0;
    }

    @Override // c8.k
    public final c c() {
        return this.f13061a;
    }

    public final String d(boolean z10) {
        b bVar;
        String name;
        String t22;
        c cVar = this.f13061a;
        Class cls = null;
        if (cVar instanceof b) {
            bVar = (b) cVar;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            cls = a1.c.y0(bVar);
        }
        if (cls == null) {
            name = cVar.toString();
        } else if ((this.f13063d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (cls.isArray()) {
            if (g.a(cls, boolean[].class)) {
                name = "kotlin.BooleanArray";
            } else if (g.a(cls, char[].class)) {
                name = "kotlin.CharArray";
            } else if (g.a(cls, byte[].class)) {
                name = "kotlin.ByteArray";
            } else if (g.a(cls, short[].class)) {
                name = "kotlin.ShortArray";
            } else if (g.a(cls, int[].class)) {
                name = "kotlin.IntArray";
            } else if (g.a(cls, float[].class)) {
                name = "kotlin.FloatArray";
            } else if (g.a(cls, long[].class)) {
                name = "kotlin.LongArray";
            } else if (g.a(cls, double[].class)) {
                name = "kotlin.DoubleArray";
            } else {
                name = "kotlin.Array";
            }
        } else if (z10 && cls.isPrimitive()) {
            g.d(cVar, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = a1.c.z0((b) cVar).getName();
        } else {
            name = cls.getName();
        }
        String str = "";
        if (this.f13062b.isEmpty()) {
            t22 = "";
        } else {
            t22 = kotlin.collections.c.t2(this.f13062b, ", ", "<", ">", new TypeReference$asString$args$1(this), 24);
        }
        if (b()) {
            str = "?";
        }
        String str2 = name + t22 + str;
        k kVar = this.c;
        if (kVar instanceof TypeReference) {
            String d5 = ((TypeReference) kVar).d(true);
            if (!g.a(d5, str2)) {
                if (g.a(d5, str2 + '?')) {
                    return str2 + '!';
                }
                return "(" + str2 + ".." + d5 + ')';
            }
            return str2;
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeReference) {
            TypeReference typeReference = (TypeReference) obj;
            if (g.a(this.f13061a, typeReference.f13061a)) {
                if (g.a(this.f13062b, typeReference.f13062b) && g.a(this.c, typeReference.c) && this.f13063d == typeReference.f13063d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13062b.hashCode() + (this.f13061a.hashCode() * 31)) * 31) + this.f13063d;
    }

    public final String toString() {
        return d(false) + " (Kotlin reflection is not available)";
    }
}
