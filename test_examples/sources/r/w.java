package r;

/* loaded from: classes.dex */
public final class w<T> implements d {

    /* renamed from: a  reason: collision with root package name */
    public final float f17027a;

    /* renamed from: b  reason: collision with root package name */
    public final float f17028b;
    public final T c;

    public w() {
        this(null, 7);
    }

    public w(float f10, float f11, T t10) {
        this.f17027a = f10;
        this.f17028b = f11;
        this.c = t10;
    }

    public /* synthetic */ w(Object obj, int i10) {
        this((i10 & 1) != 0 ? 1.0f : 0.0f, (i10 & 2) != 0 ? 1500.0f : 0.0f, (i10 & 4) != 0 ? null : obj);
    }

    @Override // r.d
    public final b0 a(z zVar) {
        i iVar;
        v7.g.f(zVar, "converter");
        T t10 = this.c;
        if (t10 == null) {
            iVar = null;
        } else {
            iVar = (i) zVar.a().U(t10);
        }
        return new h0(this.f17027a, this.f17028b, iVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (wVar.f17027a == this.f17027a) {
                return ((wVar.f17028b > this.f17028b ? 1 : (wVar.f17028b == this.f17028b ? 0 : -1)) == 0) && v7.g.a(wVar.c, this.c);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        T t10 = this.c;
        if (t10 != null) {
            i10 = t10.hashCode();
        } else {
            i10 = 0;
        }
        return Float.floatToIntBits(this.f17028b) + androidx.activity.e.e(this.f17027a, i10 * 31, 31);
    }
}
