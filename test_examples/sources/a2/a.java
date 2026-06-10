package a2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f89a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (!v7.g.a(Float.valueOf(this.f89a), Float.valueOf(((a) obj).f89a))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f89a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f89a + ')';
    }
}
