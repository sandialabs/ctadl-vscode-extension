package b2;

/* loaded from: classes.dex */
public final class d implements Comparable<d> {

    /* renamed from: i  reason: collision with root package name */
    public final float f6339i;

    public static final boolean a(float f10, float f11) {
        return v7.g.a(Float.valueOf(f10), Float.valueOf(f11));
    }

    public static String b(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        return Float.compare(this.f6339i, dVar.f6339i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (!v7.g.a(Float.valueOf(this.f6339i), Float.valueOf(((d) obj).f6339i))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6339i);
    }

    public final String toString() {
        return b(this.f6339i);
    }
}
