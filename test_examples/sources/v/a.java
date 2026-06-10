package v;

import a3.b1;
import androidx.compose.ui.unit.LayoutDirection;
import g0.k0;

/* loaded from: classes.dex */
public final class a implements v {

    /* renamed from: a  reason: collision with root package name */
    public final int f18042a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18043b;
    public final k0 c = a1.c.V0(q2.b.f16870e);

    /* renamed from: d  reason: collision with root package name */
    public final k0 f18044d = a1.c.V0(Boolean.TRUE);

    public a(String str, int i10) {
        this.f18042a = i10;
        this.f18043b = str;
    }

    @Override // v.v
    public final int a(b2.b bVar) {
        v7.g.f(bVar, "density");
        return e().f16873d;
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
        return e().f16871a;
    }

    @Override // v.v
    public final int d(b2.b bVar) {
        v7.g.f(bVar, "density");
        return e().f16872b;
    }

    public final q2.b e() {
        return (q2.b) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f18042a == ((a) obj).f18042a;
        }
        return false;
    }

    public final void f(b1 b1Var, int i10) {
        v7.g.f(b1Var, "windowInsetsCompat");
        int i11 = this.f18042a;
        if (i10 == 0 || (i10 & i11) != 0) {
            q2.b a10 = b1Var.a(i11);
            v7.g.f(a10, "<set-?>");
            this.c.setValue(a10);
            this.f18044d.setValue(Boolean.valueOf(b1Var.f140a.p(i11)));
        }
    }

    public final int hashCode() {
        return this.f18042a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18043b);
        sb.append('(');
        sb.append(e().f16871a);
        sb.append(", ");
        sb.append(e().f16872b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return androidx.activity.e.h(sb, e().f16873d, ')');
    }
}
