package r;

/* loaded from: classes.dex */
public final class y<T> implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f17037a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17038b;
    public final p c;

    public y() {
        this(0, (p) null, 7);
    }

    public y(int i10, int i11, p pVar) {
        v7.g.f(pVar, "easing");
        this.f17037a = i10;
        this.f17038b = i11;
        this.c = pVar;
    }

    public y(int i10, p pVar, int i11) {
        this((i11 & 1) != 0 ? 300 : i10, 0, (i11 & 4) != 0 ? q.f17012a : pVar);
    }

    @Override // r.d
    public final b0 a(z zVar) {
        v7.g.f(zVar, "converter");
        return new i0(this.f17037a, this.f17038b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            return yVar.f17037a == this.f17037a && yVar.f17038b == this.f17038b && v7.g.a(yVar.c, this.c);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.f17037a * 31)) * 31) + this.f17038b;
    }
}
