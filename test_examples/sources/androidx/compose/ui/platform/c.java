package androidx.compose.ui.platform;

import androidx.compose.ui.text.style.ResolvedTextDirection;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public static c f3833d;
    public p1.n c;

    @Override // androidx.compose.ui.platform.f
    public final int[] a(int i10) {
        int i11;
        if (d().length() > 0 && i10 > 0) {
            int length = d().length();
            ResolvedTextDirection resolvedTextDirection = ResolvedTextDirection.Ltr;
            if (i10 > length) {
                p1.n nVar = this.c;
                if (nVar == null) {
                    v7.g.l("layoutResult");
                    throw null;
                }
                i11 = nVar.b(d().length());
            } else {
                p1.n nVar2 = this.c;
                if (nVar2 == null) {
                    v7.g.l("layoutResult");
                    throw null;
                }
                int b5 = nVar2.b(i10);
                i11 = f(b5, resolvedTextDirection) + 1 == i10 ? b5 : b5 - 1;
            }
            if (i11 < 0) {
                return null;
            }
            return c(f(i11, ResolvedTextDirection.Rtl), f(i11, resolvedTextDirection) + 1);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.f
    public final int[] b(int i10) {
        int i11;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        ResolvedTextDirection resolvedTextDirection = ResolvedTextDirection.Rtl;
        if (i10 < 0) {
            p1.n nVar = this.c;
            if (nVar != null) {
                i11 = nVar.b(0);
            } else {
                v7.g.l("layoutResult");
                throw null;
            }
        } else {
            p1.n nVar2 = this.c;
            if (nVar2 != null) {
                int b5 = nVar2.b(i10);
                if (f(b5, resolvedTextDirection) == i10) {
                    i11 = b5;
                } else {
                    i11 = b5 + 1;
                }
            } else {
                v7.g.l("layoutResult");
                throw null;
            }
        }
        p1.n nVar3 = this.c;
        if (nVar3 != null) {
            if (i11 >= nVar3.f16697b.f16653f) {
                return null;
            }
            return c(f(i11, resolvedTextDirection), f(i11, ResolvedTextDirection.Ltr) + 1);
        }
        v7.g.l("layoutResult");
        throw null;
    }

    public final int f(int i10, ResolvedTextDirection resolvedTextDirection) {
        p1.n nVar = this.c;
        if (nVar == null) {
            v7.g.l("layoutResult");
            throw null;
        }
        int d5 = nVar.d(i10);
        p1.n nVar2 = this.c;
        if (nVar2 == null) {
            v7.g.l("layoutResult");
            throw null;
        } else if (resolvedTextDirection != nVar2.g(d5)) {
            p1.n nVar3 = this.c;
            if (nVar3 != null) {
                return nVar3.d(i10);
            }
            v7.g.l("layoutResult");
            throw null;
        } else {
            p1.n nVar4 = this.c;
            if (nVar4 != null) {
                return p1.n.a(nVar4, i10) - 1;
            }
            v7.g.l("layoutResult");
            throw null;
        }
    }
}
