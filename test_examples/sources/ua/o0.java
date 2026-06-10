package ua;

import java.util.List;

/* loaded from: classes.dex */
public final class o0 implements c8.k {

    /* renamed from: a  reason: collision with root package name */
    public final c8.k f17999a;

    public o0(c8.k kVar) {
        v7.g.f(kVar, "origin");
        this.f17999a = kVar;
    }

    @Override // c8.k
    public final List<c8.m> a() {
        return this.f17999a.a();
    }

    @Override // c8.k
    public final boolean b() {
        return this.f17999a.b();
    }

    @Override // c8.k
    public final c8.c c() {
        return this.f17999a.c();
    }

    public final boolean equals(Object obj) {
        if (obj != null && v7.g.a(this.f17999a, obj)) {
            c8.c c = c();
            if (c instanceof c8.b) {
                c8.k kVar = obj instanceof c8.k ? (c8.k) obj : null;
                c8.c c10 = kVar != null ? kVar.c() : null;
                if (c10 != null && (c10 instanceof c8.b)) {
                    return v7.g.a(a1.c.y0((c8.b) c), a1.c.y0((c8.b) c10));
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17999a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f17999a;
    }
}
