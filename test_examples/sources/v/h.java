package v;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class h implements v {

    /* renamed from: a  reason: collision with root package name */
    public final int f18056a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f18057b = 0;
    public final int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final int f18058d = 0;

    @Override // v.v
    public final int a(b2.b bVar) {
        v7.g.f(bVar, "density");
        return this.f18058d;
    }

    @Override // v.v
    public final int b(b2.b bVar, LayoutDirection layoutDirection) {
        v7.g.f(bVar, "density");
        v7.g.f(layoutDirection, "layoutDirection");
        return this.c;
    }

    @Override // v.v
    public final int c(b2.b bVar, LayoutDirection layoutDirection) {
        v7.g.f(bVar, "density");
        v7.g.f(layoutDirection, "layoutDirection");
        return this.f18056a;
    }

    @Override // v.v
    public final int d(b2.b bVar) {
        v7.g.f(bVar, "density");
        return this.f18057b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f18056a == hVar.f18056a && this.f18057b == hVar.f18057b && this.c == hVar.c && this.f18058d == hVar.f18058d;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f18056a * 31) + this.f18057b) * 31) + this.c) * 31) + this.f18058d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append(this.f18056a);
        sb.append(", top=");
        sb.append(this.f18057b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return androidx.activity.e.h(sb, this.f18058d, ')');
    }
}
