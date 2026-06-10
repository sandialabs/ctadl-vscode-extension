package l1;

import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.b;
import l1.w;
import q0.d;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final LayoutNode f15778a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.compose.ui.node.b f15779b;
    public NodeCoordinator c;

    /* renamed from: d  reason: collision with root package name */
    public final b.C0024b f15780d;

    /* renamed from: e  reason: collision with root package name */
    public d.c f15781e;

    /* renamed from: f  reason: collision with root package name */
    public h0.e<d.b> f15782f;

    /* renamed from: g  reason: collision with root package name */
    public h0.e<d.b> f15783g;

    /* renamed from: h  reason: collision with root package name */
    public a f15784h;

    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public d.c f15785a;

        /* renamed from: b  reason: collision with root package name */
        public int f15786b;
        public h0.e<d.b> c;

        /* renamed from: d  reason: collision with root package name */
        public h0.e<d.b> f15787d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ v f15788e;

        public a(v vVar, d.c cVar, int i10, h0.e<d.b> eVar, h0.e<d.b> eVar2) {
            v7.g.f(cVar, "node");
            this.f15788e = vVar;
            this.f15785a = cVar;
            this.f15786b = i10;
            this.c = eVar;
            this.f15787d = eVar2;
        }

        public final void a(int i10) {
            d.c cVar = this.f15785a;
            this.f15788e.getClass();
            d.c b5 = v.b(this.f15787d.f11332i[i10], cVar);
            this.f15785a = b5;
            int i11 = this.f15786b | b5.f16826j;
            this.f15786b = i11;
            b5.f16827k = i11;
        }

        public final void b() {
            d.c cVar = this.f15785a.f16828l;
            v7.g.c(cVar);
            this.f15785a = cVar;
            this.f15788e.getClass();
            d.c cVar2 = this.f15785a;
            if (cVar2.f16830o) {
                cVar2.p();
            }
            d.c cVar3 = cVar2.f16829m;
            d.c cVar4 = cVar2.f16828l;
            if (cVar3 != null) {
                cVar3.f16828l = cVar4;
                cVar2.f16829m = null;
            }
            if (cVar4 != null) {
                cVar4.f16829m = cVar3;
                cVar2.f16828l = null;
            }
            v7.g.c(cVar3);
            this.f15785a = cVar3;
        }

        public final void c(int i10, int i11) {
            d.c cVar = this.f15785a.f16828l;
            v7.g.c(cVar);
            this.f15785a = cVar;
            d.b bVar = this.c.f11332i[i10];
            d.b bVar2 = this.f15787d.f11332i[i11];
            boolean a10 = v7.g.a(bVar, bVar2);
            v vVar = this.f15788e;
            if (!a10) {
                d.c cVar2 = this.f15785a;
                vVar.getClass();
                this.f15785a = v.c(bVar, bVar2, cVar2);
            }
            vVar.getClass();
            int i12 = this.f15786b;
            d.c cVar3 = this.f15785a;
            int i13 = i12 | cVar3.f16826j;
            this.f15786b = i13;
            cVar3.f16827k = i13;
        }
    }

    public v(LayoutNode layoutNode) {
        v7.g.f(layoutNode, "layoutNode");
        this.f15778a = layoutNode;
        androidx.compose.ui.node.b bVar = new androidx.compose.ui.node.b(layoutNode);
        this.f15779b = bVar;
        this.c = bVar;
        b.C0024b c0024b = bVar.M;
        this.f15780d = c0024b;
        this.f15781e = c0024b;
    }

    public static d.c b(d.b bVar, d.c cVar) {
        d.c backwardsCompatNode;
        int i10;
        if (bVar instanceof t) {
            backwardsCompatNode = ((t) bVar).c();
            v7.g.f(backwardsCompatNode, "node");
            if (backwardsCompatNode instanceof k) {
                i10 = 3;
            } else {
                i10 = 1;
            }
            if (backwardsCompatNode instanceof d) {
                i10 |= 4;
            }
            if (backwardsCompatNode instanceof h0) {
                i10 |= 8;
            }
            if (backwardsCompatNode instanceof e0) {
                i10 |= 16;
            }
            if (backwardsCompatNode instanceof k1.e) {
                i10 |= 32;
            }
            if (backwardsCompatNode instanceof d0) {
                i10 |= 64;
            }
            if (backwardsCompatNode instanceof j) {
                i10 |= 128;
            }
            if (backwardsCompatNode instanceof e) {
                i10 |= 256;
            }
            if (backwardsCompatNode instanceof g) {
                i10 |= 512;
            }
            backwardsCompatNode.f16826j = i10;
        } else {
            backwardsCompatNode = new BackwardsCompatNode(bVar);
        }
        d.c cVar2 = cVar.f16828l;
        if (cVar2 != null) {
            cVar2.f16829m = backwardsCompatNode;
            backwardsCompatNode.f16828l = cVar2;
        }
        cVar.f16828l = backwardsCompatNode;
        backwardsCompatNode.f16829m = cVar;
        return backwardsCompatNode;
    }

    public static d.c c(d.b bVar, d.b bVar2, d.c cVar) {
        if ((bVar instanceof t) && (bVar2 instanceof t)) {
            w.a aVar = w.f15789a;
            v7.g.d(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            d.c d5 = ((t) bVar2).d();
            if (d5 != cVar) {
                cVar.p();
                d.c cVar2 = cVar.f16828l;
                if (cVar2 != null) {
                    d5.f16828l = cVar2;
                    cVar2.f16829m = d5;
                    cVar.f16828l = null;
                }
                d.c cVar3 = cVar.f16829m;
                if (cVar3 != null) {
                    d5.f16829m = cVar3;
                    cVar3.f16828l = d5;
                    cVar.f16829m = null;
                }
                d5.n = cVar.n;
            }
            return d5;
        }
        if (cVar instanceof BackwardsCompatNode) {
            BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) cVar;
            backwardsCompatNode.getClass();
            v7.g.f(bVar2, "value");
            if (backwardsCompatNode.f16830o) {
                backwardsCompatNode.x();
            }
            backwardsCompatNode.f3381p = bVar2;
            backwardsCompatNode.f16826j = m0.b.A(bVar2);
            if (backwardsCompatNode.f16830o) {
                backwardsCompatNode.u(false);
            }
            return cVar;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void a() {
        boolean z10;
        for (d.c cVar = this.f15781e; cVar != null; cVar = cVar.f16829m) {
            boolean z11 = cVar.f16830o;
            if (!z11) {
                if (!z11) {
                    if (cVar.n != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        cVar.f16830o = true;
                        cVar.q();
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        d.c cVar = this.f15781e;
        b.C0024b c0024b = this.f15780d;
        if (cVar != c0024b) {
            while (cVar != null && cVar != c0024b) {
                sb.append(String.valueOf(cVar));
                if (cVar.f16829m != c0024b) {
                    sb.append(",");
                    cVar = cVar.f16829m;
                }
            }
            String sb2 = sb.toString();
            v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append("]");
        String sb22 = sb.toString();
        v7.g.e(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }
}
