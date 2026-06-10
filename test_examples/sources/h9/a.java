package h9;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f11559a;

    /* renamed from: b  reason: collision with root package name */
    public final c f11560b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final c f11561d;

    static {
        c.j(g.f11579f);
    }

    public a(c cVar, e eVar) {
        v7.g.f(cVar, "packageName");
        this.f11559a = cVar;
        this.f11560b = null;
        this.c = eVar;
        this.f11561d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return v7.g.a(this.f11559a, aVar.f11559a) && v7.g.a(this.f11560b, aVar.f11560b) && v7.g.a(this.c, aVar.c) && v7.g.a(this.f11561d, aVar.f11561d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f11559a.hashCode() * 31;
        int i10 = 0;
        c cVar = this.f11560b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
        c cVar2 = this.f11561d;
        if (cVar2 != null) {
            i10 = cVar2.hashCode();
        }
        return hashCode2 + i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ha.i.V0(this.f11559a.b(), '.', '/'));
        sb.append("/");
        c cVar = this.f11560b;
        if (cVar != null) {
            sb.append(cVar);
            sb.append(".");
        }
        sb.append(this.c);
        String sb2 = sb.toString();
        v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
