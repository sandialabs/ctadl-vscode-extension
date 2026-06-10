package m7;

/* loaded from: classes.dex */
public final class h implements Comparable<h> {

    /* renamed from: i  reason: collision with root package name */
    public final int f15998i;

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        return v7.g.h(this.f15998i ^ Integer.MIN_VALUE, hVar.f15998i ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (this.f15998i != ((h) obj).f15998i) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15998i;
    }

    public final String toString() {
        return String.valueOf(this.f15998i & 4294967295L);
    }
}
