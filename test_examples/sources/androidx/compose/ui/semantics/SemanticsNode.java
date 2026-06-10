package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import l1.h0;
import m0.b;
import m7.n;
import o1.j;
import o1.o;
import q0.d;
import u7.l;
import v0.p;
import v7.g;

/* loaded from: classes.dex */
public final class SemanticsNode {

    /* renamed from: a  reason: collision with root package name */
    public final h0 f3935a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3936b;
    public final LayoutNode c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3937d;

    /* renamed from: e  reason: collision with root package name */
    public SemanticsNode f3938e;

    /* renamed from: f  reason: collision with root package name */
    public final j f3939f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3940g;

    /* loaded from: classes.dex */
    public static final class a extends d.c implements h0 {

        /* renamed from: p  reason: collision with root package name */
        public final j f3941p;

        public a(l<? super o, n> lVar) {
            j jVar = new j();
            jVar.f16207j = false;
            jVar.f16208k = false;
            lVar.U(jVar);
            this.f3941p = jVar;
        }

        @Override // l1.h0
        public final j t() {
            return this.f3941p;
        }
    }

    public /* synthetic */ SemanticsNode(h0 h0Var, boolean z10) {
        this(h0Var, z10, p.E(h0Var));
    }

    public SemanticsNode(h0 h0Var, boolean z10, LayoutNode layoutNode) {
        g.f(h0Var, "outerSemanticsNode");
        g.f(layoutNode, "layoutNode");
        this.f3935a = h0Var;
        this.f3936b = z10;
        this.c = layoutNode;
        this.f3939f = b.E(h0Var);
        this.f3940g = layoutNode.f3415j;
    }

    public static List c(SemanticsNode semanticsNode, List list, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        semanticsNode.getClass();
        List<SemanticsNode> j2 = semanticsNode.j(z10, false);
        int size = j2.size();
        for (int i11 = 0; i11 < size; i11++) {
            SemanticsNode semanticsNode2 = j2.get(i11);
            if (semanticsNode2.h()) {
                list.add(semanticsNode2);
            } else if (!semanticsNode2.f3939f.f16208k) {
                c(semanticsNode2, list, false, 2);
            }
        }
        return list;
    }

    public final SemanticsNode a(o1.g gVar, l<? super o, n> lVar) {
        SemanticsNode semanticsNode = new SemanticsNode(new a(lVar), false, new LayoutNode(this.f3940g + (gVar != null ? 1000000000 : 2000000000), true));
        semanticsNode.f3937d = true;
        semanticsNode.f3938e = this;
        return semanticsNode;
    }

    public final NodeCoordinator b() {
        h0 q10;
        boolean z10 = this.f3939f.f16207j;
        h0 h0Var = this.f3935a;
        if (z10 && (q10 = p.q(this.c)) != null) {
            h0Var = q10;
        }
        return p.D(h0Var, 8);
    }

    public final u0.d d() {
        return !this.c.z() ? u0.d.f17725e : b.y(b());
    }

    public final List e(boolean z10) {
        if (this.f3939f.f16208k) {
            return EmptyList.f12981i;
        }
        if (h()) {
            return c(this, null, z10, 1);
        }
        return j(z10, true);
    }

    public final j f() {
        boolean h10 = h();
        j jVar = this.f3939f;
        if (h10) {
            jVar.getClass();
            j jVar2 = new j();
            jVar2.f16207j = jVar.f16207j;
            jVar2.f16208k = jVar.f16208k;
            jVar2.f16206i.putAll(jVar.f16206i);
            i(jVar2);
            return jVar2;
        }
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SemanticsNode g() {
        LayoutNode layoutNode;
        h0 h0Var;
        SemanticsNode semanticsNode = this.f3938e;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        boolean z10 = this.f3936b;
        LayoutNode layoutNode2 = this.c;
        if (z10) {
            SemanticsNode$parent$1 semanticsNode$parent$1 = SemanticsNode$parent$1.f3944j;
            layoutNode = layoutNode2;
            do {
                layoutNode = layoutNode.p();
                if (layoutNode != null) {
                }
            } while (!((Boolean) semanticsNode$parent$1.U(layoutNode)).booleanValue());
            if (layoutNode == null) {
                SemanticsNode$parent$2 semanticsNode$parent$2 = SemanticsNode$parent$2.f3945j;
                while (true) {
                    layoutNode2 = layoutNode2.p();
                    if (layoutNode2 != null) {
                        if (((Boolean) semanticsNode$parent$2.U(layoutNode2)).booleanValue()) {
                            layoutNode = layoutNode2;
                            break;
                        }
                    } else {
                        layoutNode = null;
                        break;
                    }
                }
            }
            if (layoutNode == null) {
                h0Var = p.r(layoutNode);
            } else {
                h0Var = null;
            }
            if (h0Var != null) {
                return null;
            }
            return new SemanticsNode(h0Var, z10, p.E(h0Var));
        }
        layoutNode = null;
        if (layoutNode == null) {
        }
        if (layoutNode == null) {
        }
        if (h0Var != null) {
        }
    }

    public final boolean h() {
        if (this.f3936b && this.f3939f.f16207j) {
            return true;
        }
        return false;
    }

    public final void i(j jVar) {
        if (!this.f3939f.f16208k) {
            List<SemanticsNode> j2 = j(false, false);
            int size = j2.size();
            for (int i10 = 0; i10 < size; i10++) {
                SemanticsNode semanticsNode = j2.get(i10);
                if (!semanticsNode.h()) {
                    j jVar2 = semanticsNode.f3939f;
                    g.f(jVar2, "child");
                    for (Map.Entry entry : jVar2.f16206i.entrySet()) {
                        androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) entry.getKey();
                        Object value = entry.getValue();
                        LinkedHashMap linkedHashMap = jVar.f16206i;
                        Object obj = linkedHashMap.get(aVar);
                        g.d(aVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object R = aVar.f3980b.R(obj, value);
                        if (R != null) {
                            linkedHashMap.put(aVar, R);
                        }
                    }
                    semanticsNode.i(jVar);
                }
            }
        }
    }

    public final List<SemanticsNode> j(boolean z10, boolean z11) {
        ArrayList arrayList;
        String str;
        if (this.f3937d) {
            return EmptyList.f12981i;
        }
        ArrayList arrayList2 = new ArrayList();
        LayoutNode layoutNode = this.c;
        if (z10) {
            arrayList = new ArrayList();
            b.d0(layoutNode, arrayList);
        } else {
            arrayList = new ArrayList();
            p.m(layoutNode, arrayList);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(new SemanticsNode((h0) arrayList.get(i10), this.f3936b));
        }
        if (z11) {
            androidx.compose.ui.semantics.a<o1.g> aVar = SemanticsProperties.f3958o;
            j jVar = this.f3939f;
            o1.g gVar = (o1.g) SemanticsConfigurationKt.a(jVar, aVar);
            if (gVar != null && jVar.f16207j && (!arrayList2.isEmpty())) {
                arrayList2.add(a(gVar, new SemanticsNode$emitFakeNodes$fakeNode$1(gVar)));
            }
            androidx.compose.ui.semantics.a<List<String>> aVar2 = SemanticsProperties.f3946a;
            if (jVar.d(aVar2) && (!arrayList2.isEmpty()) && jVar.f16207j) {
                List list = (List) SemanticsConfigurationKt.a(jVar, aVar2);
                if (list != null) {
                    str = (String) c.p2(list);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList2.add(0, a(null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
                }
            }
        }
        return arrayList2;
    }
}
