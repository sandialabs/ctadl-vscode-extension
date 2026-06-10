package u1;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final e f17768a;

    /* renamed from: b  reason: collision with root package name */
    public final m f17769b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17770d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f17771e;

    public w(e eVar, m mVar, int i10, int i11, Object obj) {
        this.f17768a = eVar;
        this.f17769b = mVar;
        this.c = i10;
        this.f17770d = i11;
        this.f17771e = obj;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!v7.g.a(this.f17768a, wVar.f17768a) || !v7.g.a(this.f17769b, wVar.f17769b)) {
            return false;
        }
        if (this.c == wVar.c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f17770d == wVar.f17770d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && v7.g.a(this.f17771e, wVar.f17771e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        e eVar = this.f17768a;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        int i11 = ((((((hashCode * 31) + this.f17769b.f17759i) * 31) + this.c) * 31) + this.f17770d) * 31;
        Object obj = this.f17771e;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "TypefaceRequest(fontFamily=" + this.f17768a + ", fontWeight=" + this.f17769b + ", fontStyle=" + ((Object) i.a(this.c)) + ", fontSynthesis=" + ((Object) j.a(this.f17770d)) + ", resourceLoaderCacheKey=" + this.f17771e + ')';
    }
}
