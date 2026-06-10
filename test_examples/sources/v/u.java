package v;

import androidx.compose.ui.unit.LayoutDirection;
import g0.k0;

/* loaded from: classes.dex */
public final class u implements v {

    /* renamed from: a  reason: collision with root package name */
    public final String f18080a;

    /* renamed from: b  reason: collision with root package name */
    public final k0 f18081b;

    public u(l lVar, String str) {
        this.f18080a = str;
        this.f18081b = a1.c.V0(lVar);
    }

    @Override // v.v
    public final int a(b2.b bVar) {
        v7.g.f(bVar, "density");
        return e().f18067d;
    }

    @Override // v.v
    public final int b(b2.b bVar, LayoutDirection layoutDirection) {
        v7.g.f(bVar, "density");
        v7.g.f(layoutDirection, "layoutDirection");
        return e().c;
    }

    @Override // v.v
    public final int c(b2.b bVar, LayoutDirection layoutDirection) {
        v7.g.f(bVar, "density");
        v7.g.f(layoutDirection, "layoutDirection");
        return e().f18065a;
    }

    @Override // v.v
    public final int d(b2.b bVar) {
        v7.g.f(bVar, "density");
        return e().f18066b;
    }

    public final l e() {
        return (l) this.f18081b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return v7.g.a(e(), ((u) obj).e());
        }
        return false;
    }

    public final int hashCode() {
        return this.f18080a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18080a);
        sb.append("(left=");
        sb.append(e().f18065a);
        sb.append(", top=");
        sb.append(e().f18066b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return androidx.activity.e.h(sb, e().f18067d, ')');
    }
}
