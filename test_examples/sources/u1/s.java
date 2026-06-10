package u1;

/* loaded from: classes.dex */
public final class s implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f17762a;

    /* renamed from: b  reason: collision with root package name */
    public final m f17763b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final l f17764d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17765e;

    public s(int i10, m mVar, int i11, l lVar, int i12) {
        this.f17762a = i10;
        this.f17763b = mVar;
        this.c = i11;
        this.f17764d = lVar;
        this.f17765e = i12;
    }

    @Override // u1.d
    public final int a() {
        return this.c;
    }

    @Override // u1.d
    public final int b() {
        return this.f17765e;
    }

    @Override // u1.d
    public final m c() {
        return this.f17763b;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f17762a != sVar.f17762a) {
            return false;
        }
        if (!v7.g.a(this.f17763b, sVar.f17763b)) {
            return false;
        }
        if (this.c == sVar.c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !v7.g.a(this.f17764d, sVar.f17764d)) {
            return false;
        }
        if (this.f17765e == sVar.f17765e) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17764d.hashCode() + (((((((this.f17762a * 31) + this.f17763b.f17759i) * 31) + this.c) * 31) + this.f17765e) * 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f17762a + ", weight=" + this.f17763b + ", style=" + ((Object) i.a(this.c)) + ", loadingStrategy=" + ((Object) ma.i.V(this.f17765e)) + ')';
    }
}
