package m7;

/* loaded from: classes.dex */
public final class l implements Comparable<l> {

    /* renamed from: i  reason: collision with root package name */
    public final short f16006i;

    public static String a(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(l lVar) {
        return v7.g.h(this.f16006i & 65535, lVar.f16006i & 65535);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (this.f16006i != ((l) obj).f16006i) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16006i;
    }

    public final String toString() {
        return a(this.f16006i);
    }
}
