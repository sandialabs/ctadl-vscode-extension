package a5;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b8.g;
import b8.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.c;

/* loaded from: classes.dex */
public final class a<P> extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public i f240a;

    /* renamed from: b  reason: collision with root package name */
    public g f241b;
    public int c;

    public a() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(int i10, RecyclerView recyclerView) {
        v7.g.f(recyclerView, "recyclerView");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3  */
    @Override // androidx.recyclerview.widget.RecyclerView.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        int i13;
        int i14;
        g gVar;
        Collection<?> L2;
        Iterator it;
        v7.g.f(recyclerView, "recyclerView");
        if (i10 == 0 && i11 == 0) {
            return;
        }
        int i15 = 1;
        if (Math.abs(i10) > 75) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (Math.abs(i11) > 75) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    i12 = adapter.d();
                } else {
                    i12 = 0;
                }
                this.c = i12;
                RecyclerView.l layoutManager = recyclerView.getLayoutManager();
                v7.g.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int T0 = linearLayoutManager.T0();
                int U0 = linearLayoutManager.U0();
                if (T0 != -1 && T0 < this.c) {
                    z12 = false;
                    if (!z12) {
                        if (U0 != -1 && U0 < this.c) {
                            z13 = false;
                            if (z13) {
                                i iVar = new i(T0, U0);
                                if (v7.g.a(iVar, this.f240a)) {
                                    return;
                                }
                                i iVar2 = this.f240a;
                                if (T0 <= iVar2.f6497i) {
                                    if (iVar.f6498j <= iVar2.f6498j) {
                                        z14 = false;
                                        if (!z14) {
                                            i13 = U0 + 1;
                                        } else {
                                            i13 = T0 - 1;
                                        }
                                        if (!z14) {
                                            i14 = -1;
                                        } else {
                                            i14 = 1;
                                        }
                                        int i16 = i14 + i13;
                                        int min = Math.min(this.c - 1, Math.max(i13, 0));
                                        int min2 = Math.min(this.c - 1, Math.max(i16, 0));
                                        if (z14) {
                                            i15 = -1;
                                        }
                                        g gVar2 = new g(min, min2, i15);
                                        gVar = this.f241b;
                                        v7.g.f(gVar, "other");
                                        Set P2 = c.P2(gVar2);
                                        if (!(gVar instanceof Collection)) {
                                            L2 = (Collection) gVar;
                                        } else {
                                            L2 = c.L2(gVar);
                                        }
                                        P2.removeAll(L2);
                                        it = P2.iterator();
                                        if (it.hasNext()) {
                                            this.f240a = iVar;
                                            this.f241b = gVar2;
                                            return;
                                        }
                                        ((Number) it.next()).intValue();
                                        v7.g.f(null, "<this>");
                                        throw null;
                                    }
                                }
                                z14 = true;
                                if (!z14) {
                                }
                                if (!z14) {
                                }
                                int i162 = i14 + i13;
                                int min3 = Math.min(this.c - 1, Math.max(i13, 0));
                                int min22 = Math.min(this.c - 1, Math.max(i162, 0));
                                if (z14) {
                                }
                                g gVar22 = new g(min3, min22, i15);
                                gVar = this.f241b;
                                v7.g.f(gVar, "other");
                                Set P22 = c.P2(gVar22);
                                if (!(gVar instanceof Collection)) {
                                }
                                P22.removeAll(L2);
                                it = P22.iterator();
                                if (it.hasNext()) {
                                }
                            }
                        }
                        z13 = true;
                        if (z13) {
                        }
                    }
                    i iVar3 = i.f6504l;
                    this.f240a = iVar3;
                    this.f241b = iVar3;
                }
                z12 = true;
                if (!z12) {
                }
                i iVar32 = i.f6504l;
                this.f240a = iVar32;
                this.f241b = iVar32;
            }
        }
    }
}
