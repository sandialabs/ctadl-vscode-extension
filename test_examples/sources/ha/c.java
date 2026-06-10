package ha;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f11609a;

    /* renamed from: b  reason: collision with root package name */
    public final b8.i f11610b;

    public c(String str, b8.i iVar) {
        this.f11609a = str;
        this.f11610b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return v7.g.a(this.f11609a, cVar.f11609a) && v7.g.a(this.f11610b, cVar.f11610b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11610b.hashCode() + (this.f11609a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f11609a + ", range=" + this.f11610b + ')';
    }
}
