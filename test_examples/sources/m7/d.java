package m7;

/* loaded from: classes.dex */
public final class d implements Comparable<d> {

    /* renamed from: m  reason: collision with root package name */
    public static final d f15989m = new d(8, 10);

    /* renamed from: i  reason: collision with root package name */
    public final int f15990i;

    /* renamed from: j  reason: collision with root package name */
    public final int f15991j;

    /* renamed from: k  reason: collision with root package name */
    public final int f15992k;

    /* renamed from: l  reason: collision with root package name */
    public final int f15993l;

    public d() {
        throw null;
    }

    public d(int i10, int i11) {
        boolean z10 = true;
        this.f15990i = 1;
        this.f15991j = i10;
        this.f15992k = i11;
        if (!new b8.i(0, 255).s(1) || !new b8.i(0, 255).s(i10) || !new b8.i(0, 255).s(i11)) {
            z10 = false;
        }
        if (z10) {
            this.f15993l = 65536 + (i10 << 8) + i11;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: 1." + i10 + '.' + i11).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d dVar2 = dVar;
        v7.g.f(dVar2, "other");
        return this.f15993l - dVar2.f15993l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        d dVar = obj instanceof d ? (d) obj : null;
        return dVar != null && this.f15993l == dVar.f15993l;
    }

    public final int hashCode() {
        return this.f15993l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15990i);
        sb.append('.');
        sb.append(this.f15991j);
        sb.append('.');
        sb.append(this.f15992k);
        return sb.toString();
    }
}
