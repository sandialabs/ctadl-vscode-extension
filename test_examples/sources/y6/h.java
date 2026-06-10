package y6;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final t6.c f18912a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18913b;

    public h(t6.c cVar, boolean z10) {
        v7.g.f(cVar, "label");
        this.f18912a = cVar;
        this.f18913b = z10;
    }

    public static h a(h hVar, boolean z10) {
        t6.c cVar = hVar.f18912a;
        hVar.getClass();
        v7.g.f(cVar, "label");
        return new h(cVar, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return v7.g.a(this.f18912a, hVar.f18912a) && this.f18913b == hVar.f18913b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f18912a.hashCode() * 31;
        boolean z10 = this.f18913b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "LabelItemModel(label=" + this.f18912a + ", isSelected=" + this.f18913b + ")";
    }
}
