package u1;

/* loaded from: classes.dex */
public final class b implements q {

    /* renamed from: a  reason: collision with root package name */
    public final int f17739a;

    public b(int i10) {
        this.f17739a = i10;
    }

    @Override // u1.q
    public final int a(int i10) {
        return i10;
    }

    @Override // u1.q
    public final int b(int i10) {
        return i10;
    }

    @Override // u1.q
    public final m c(m mVar) {
        v7.g.f(mVar, "fontWeight");
        int i10 = this.f17739a;
        if (i10 != 0 && i10 != Integer.MAX_VALUE) {
            return new m(a1.c.c0(mVar.f17759i + i10, 1, 1000));
        }
        return mVar;
    }

    @Override // u1.q
    public final e d(e eVar) {
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f17739a == ((b) obj).f17739a;
    }

    public final int hashCode() {
        return this.f17739a;
    }

    public final String toString() {
        return androidx.activity.e.h(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f17739a, ')');
    }
}
