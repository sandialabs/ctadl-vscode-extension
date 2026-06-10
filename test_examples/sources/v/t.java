package v;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class t implements v {

    /* renamed from: a  reason: collision with root package name */
    public final v f18078a;

    /* renamed from: b  reason: collision with root package name */
    public final v f18079b;

    public t(v vVar, v vVar2) {
        v7.g.f(vVar2, "second");
        this.f18078a = vVar;
        this.f18079b = vVar2;
    }

    @Override // v.v
    public final int a(b2.b bVar) {
        v7.g.f(bVar, "density");
        return Math.max(this.f18078a.a(bVar), this.f18079b.a(bVar));
    }

    @Override // v.v
    public final int b(b2.b bVar, LayoutDirection layoutDirection) {
        v7.g.f(bVar, "density");
        v7.g.f(layoutDirection, "layoutDirection");
        return Math.max(this.f18078a.b(bVar, layoutDirection), this.f18079b.b(bVar, layoutDirection));
    }

    @Override // v.v
    public final int c(b2.b bVar, LayoutDirection layoutDirection) {
        v7.g.f(bVar, "density");
        v7.g.f(layoutDirection, "layoutDirection");
        return Math.max(this.f18078a.c(bVar, layoutDirection), this.f18079b.c(bVar, layoutDirection));
    }

    @Override // v.v
    public final int d(b2.b bVar) {
        v7.g.f(bVar, "density");
        return Math.max(this.f18078a.d(bVar), this.f18079b.d(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return v7.g.a(tVar.f18078a, this.f18078a) && v7.g.a(tVar.f18079b, this.f18079b);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18079b.hashCode() * 31) + this.f18078a.hashCode();
    }

    public final String toString() {
        return "(" + this.f18078a + " ∪ " + this.f18079b + ')';
    }
}
