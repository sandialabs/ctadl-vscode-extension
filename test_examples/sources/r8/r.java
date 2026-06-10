package r8;

import java.util.Collection;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class r extends l implements b9.t {

    /* renamed from: a  reason: collision with root package name */
    public final h9.c f17160a;

    public r(h9.c cVar) {
        v7.g.f(cVar, "fqName");
        this.f17160a = cVar;
    }

    @Override // b9.t
    public final h9.c e() {
        return this.f17160a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (v7.g.a(this.f17160a, ((r) obj).f17160a)) {
                return true;
            }
        }
        return false;
    }

    @Override // b9.d
    public final Collection getAnnotations() {
        return EmptyList.f12981i;
    }

    public final int hashCode() {
        return this.f17160a.hashCode();
    }

    @Override // b9.d
    public final b9.a j(h9.c cVar) {
        v7.g.f(cVar, "fqName");
        return null;
    }

    @Override // b9.t
    public final EmptyList n() {
        return EmptyList.f12981i;
    }

    @Override // b9.t
    public final EmptyList o(u7.l lVar) {
        v7.g.f(lVar, "nameFilter");
        return EmptyList.f12981i;
    }

    @Override // b9.d
    public final void s() {
    }

    public final String toString() {
        return r.class.getName() + ": " + this.f17160a;
    }
}
