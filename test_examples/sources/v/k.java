package v;

import androidx.compose.ui.unit.LayoutDirection;
import j1.f0;

/* loaded from: classes.dex */
public final class k implements o {

    /* renamed from: a  reason: collision with root package name */
    public final v f18063a;

    /* renamed from: b  reason: collision with root package name */
    public final b2.b f18064b;

    public k(v vVar, f0 f0Var) {
        this.f18063a = vVar;
        this.f18064b = f0Var;
    }

    @Override // v.o
    public final float a() {
        v vVar = this.f18063a;
        b2.b bVar = this.f18064b;
        return bVar.r0(vVar.a(bVar));
    }

    @Override // v.o
    public final float b(LayoutDirection layoutDirection) {
        v7.g.f(layoutDirection, "layoutDirection");
        v vVar = this.f18063a;
        b2.b bVar = this.f18064b;
        return bVar.r0(vVar.c(bVar, layoutDirection));
    }

    @Override // v.o
    public final float c() {
        v vVar = this.f18063a;
        b2.b bVar = this.f18064b;
        return bVar.r0(vVar.d(bVar));
    }

    @Override // v.o
    public final float d(LayoutDirection layoutDirection) {
        v7.g.f(layoutDirection, "layoutDirection");
        v vVar = this.f18063a;
        b2.b bVar = this.f18064b;
        return bVar.r0(vVar.b(bVar, layoutDirection));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return v7.g.a(this.f18063a, kVar.f18063a) && v7.g.a(this.f18064b, kVar.f18064b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18064b.hashCode() + (this.f18063a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f18063a + ", density=" + this.f18064b + ')';
    }
}
