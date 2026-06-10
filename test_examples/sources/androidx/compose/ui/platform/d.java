package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: e  reason: collision with root package name */
    public static d f3834e;
    public p1.n c;

    /* renamed from: d  reason: collision with root package name */
    public SemanticsNode f3835d;

    public d() {
        new Rect();
    }

    @Override // androidx.compose.ui.platform.f
    public final int[] a(int i10) {
        int i11;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.f3835d;
            if (semanticsNode != null) {
                u0.d d5 = semanticsNode.d();
                int g12 = m0.b.g1(d5.f17728d - d5.f17727b);
                int length = d().length();
                if (length <= i10) {
                    i10 = length;
                }
                p1.n nVar = this.c;
                if (nVar != null) {
                    int b5 = nVar.b(i10);
                    p1.n nVar2 = this.c;
                    if (nVar2 != null) {
                        float e10 = nVar2.e(b5) - g12;
                        if (e10 > 0.0f) {
                            p1.n nVar3 = this.c;
                            if (nVar3 != null) {
                                i11 = nVar3.c(e10);
                            } else {
                                v7.g.l("layoutResult");
                                throw null;
                            }
                        } else {
                            i11 = 0;
                        }
                        if (i10 == d().length() && i11 < b5) {
                            i11++;
                        }
                        return c(f(i11, ResolvedTextDirection.Rtl), i10);
                    }
                    v7.g.l("layoutResult");
                    throw null;
                }
                v7.g.l("layoutResult");
                throw null;
            }
            v7.g.l("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.platform.f
    public final int[] b(int i10) {
        int i11;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.f3835d;
            if (semanticsNode != null) {
                u0.d d5 = semanticsNode.d();
                int g12 = m0.b.g1(d5.f17728d - d5.f17727b);
                if (i10 <= 0) {
                    i10 = 0;
                }
                p1.n nVar = this.c;
                if (nVar != null) {
                    int b5 = nVar.b(i10);
                    p1.n nVar2 = this.c;
                    if (nVar2 != null) {
                        float e10 = nVar2.e(b5) + g12;
                        p1.n nVar3 = this.c;
                        if (nVar3 != null) {
                            if (e10 < nVar3.e(nVar3.f16697b.f16653f - 1)) {
                                p1.n nVar4 = this.c;
                                if (nVar4 != null) {
                                    i11 = nVar4.c(e10);
                                } else {
                                    v7.g.l("layoutResult");
                                    throw null;
                                }
                            } else {
                                p1.n nVar5 = this.c;
                                if (nVar5 != null) {
                                    i11 = nVar5.f16697b.f16653f;
                                } else {
                                    v7.g.l("layoutResult");
                                    throw null;
                                }
                            }
                            return c(i10, f(i11 - 1, ResolvedTextDirection.Ltr) + 1);
                        }
                        v7.g.l("layoutResult");
                        throw null;
                    }
                    v7.g.l("layoutResult");
                    throw null;
                }
                v7.g.l("layoutResult");
                throw null;
            }
            v7.g.l("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
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
