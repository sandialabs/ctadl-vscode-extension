package v;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class g implements v {

    /* renamed from: a  reason: collision with root package name */
    public final v f18054a;

    /* renamed from: b  reason: collision with root package name */
    public final v f18055b;

    public g(v vVar, v vVar2) {
        this.f18054a = vVar;
        this.f18055b = vVar2;
    }

    @Override // v.v
    public final int a(b2.b bVar) {
        v7.g.f(bVar, "density");
        int a10 = this.f18054a.a(bVar) - this.f18055b.a(bVar);
        if (a10 < 0) {
            return 0;
        }
        return a10;
    }

    @Override // v.v
    public final int b(b2.b bVar, LayoutDirection layoutDirection) {
        v7.g.f(bVar, "density");
        v7.g.f(layoutDirection, "layoutDirection");
        int b5 = this.f18054a.b(bVar, layoutDirection) - this.f18055b.b(bVar, layoutDirection);
        if (b5 < 0) {
            return 0;
        }
        return b5;
    }

    @Override // v.v
    public final int c(b2.b bVar, LayoutDirection layoutDirection) {
        v7.g.f(bVar, "density");
        v7.g.f(layoutDirection, "layoutDirection");
        int c = this.f18054a.c(bVar, layoutDirection) - this.f18055b.c(bVar, layoutDirection);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // v.v
    public final int d(b2.b bVar) {
        v7.g.f(bVar, "density");
        int d5 = this.f18054a.d(bVar) - this.f18055b.d(bVar);
        if (d5 < 0) {
            return 0;
        }
        return d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return v7.g.a(gVar.f18054a, this.f18054a) && v7.g.a(gVar.f18055b, this.f18055b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18055b.hashCode() + (this.f18054a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f18054a + " - " + this.f18055b + ')';
    }
}
