package w4;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f18317a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f18318b;

    public d(String str, Long l2) {
        this.f18317a = str;
        this.f18318b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return v7.g.a(this.f18317a, dVar.f18317a) && v7.g.a(this.f18318b, dVar.f18318b);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f18317a.hashCode() * 31;
        Long l2 = this.f18318b;
        return hashCode + (l2 == null ? 0 : l2.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f18317a + ", value=" + this.f18318b + ')';
    }
}
