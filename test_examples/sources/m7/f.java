package m7;

/* loaded from: classes.dex */
public final class f implements Comparable<f> {

    /* renamed from: i  reason: collision with root package name */
    public final byte f15994i;

    public static String a(byte b5) {
        return String.valueOf(b5 & 255);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(f fVar) {
        return v7.g.h(this.f15994i & 255, fVar.f15994i & 255);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (this.f15994i != ((f) obj).f15994i) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15994i;
    }

    public final String toString() {
        return a(this.f15994i);
    }
}
