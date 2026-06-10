package v;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class n implements v {

    /* renamed from: a  reason: collision with root package name */
    public final v f18070a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18071b;

    public n(a aVar, int i10) {
        this.f18070a = aVar;
        this.f18071b = i10;
    }

    @Override // v.v
    public final int a(b2.b bVar) {
        boolean z10;
        v7.g.f(bVar, "density");
        if ((this.f18071b & 32) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return 0;
        }
        return this.f18070a.a(bVar);
    }

    @Override // v.v
    public final int b(b2.b bVar, LayoutDirection layoutDirection) {
        int i10;
        v7.g.f(bVar, "density");
        v7.g.f(layoutDirection, "layoutDirection");
        boolean z10 = true;
        if (layoutDirection == LayoutDirection.Ltr) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        if ((i10 & this.f18071b) == 0) {
            z10 = false;
        }
        if (!z10) {
            return 0;
        }
        return this.f18070a.b(bVar, layoutDirection);
    }

    @Override // v.v
    public final int c(b2.b bVar, LayoutDirection layoutDirection) {
        int i10;
        boolean z10;
        v7.g.f(bVar, "density");
        v7.g.f(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            i10 = 8;
        } else {
            i10 = 2;
        }
        if ((i10 & this.f18071b) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return 0;
        }
        return this.f18070a.c(bVar, layoutDirection);
    }

    @Override // v.v
    public final int d(b2.b bVar) {
        boolean z10;
        v7.g.f(bVar, "density");
        if ((this.f18071b & 16) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return 0;
        }
        return this.f18070a.d(bVar);
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (v7.g.a(this.f18070a, nVar.f18070a)) {
            if (this.f18071b == nVar.f18071b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18070a.hashCode() * 31) + this.f18071b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f18070a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i10 = this.f18071b;
        int i11 = ma.i.f16046m;
        if ((i10 & i11) == i11) {
            ma.i.W("Start", sb3);
        }
        int i12 = ma.i.f16047o;
        if ((i10 & i12) == i12) {
            ma.i.W("Left", sb3);
        }
        if ((i10 & 16) == 16) {
            ma.i.W("Top", sb3);
        }
        int i13 = ma.i.n;
        if ((i10 & i13) == i13) {
            ma.i.W("End", sb3);
        }
        int i14 = ma.i.f16048p;
        if ((i10 & i14) == i14) {
            ma.i.W("Right", sb3);
        }
        if ((i10 & 32) == 32) {
            ma.i.W("Bottom", sb3);
        }
        String sb4 = sb3.toString();
        v7.g.e(sb4, "StringBuilder().apply(builderAction).toString()");
        sb2.append(sb4);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
