package androidx.navigation;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final v f5475a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5476b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f5477d;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r4 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        throw new java.lang.IllegalArgumentException("Argument with type " + r2.b() + " has null value but is not nullable.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r5 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(v<?> vVar, boolean z10, Object obj, boolean z11) {
        if (!vVar.f5551a && z10) {
            throw new IllegalArgumentException(vVar.b() + " does not allow nullable values");
        }
        this.f5475a = vVar;
        this.f5476b = z10;
        this.f5477d = obj;
        this.c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f5476b == hVar.f5476b && this.c == hVar.c && this.f5475a.equals(hVar.f5475a)) {
                Object obj2 = hVar.f5477d;
                Object obj3 = this.f5477d;
                return obj3 != null ? obj3.equals(obj2) : obj2 == null;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f5475a.hashCode() * 31) + (this.f5476b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.f5477d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
