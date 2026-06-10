package g0;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11101a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11102b;

    public x(Integer num, Object obj) {
        this.f11101a = num;
        this.f11102b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return v7.g.a(this.f11101a, xVar.f11101a) && v7.g.a(this.f11102b, xVar.f11102b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f11101a;
        int i10 = 0;
        int ordinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f11102b;
        if (obj2 instanceof Enum) {
            i10 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 + ordinal;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f11101a + ", right=" + this.f11102b + ')';
    }
}
