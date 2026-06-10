package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import u1.d;

/* loaded from: classes.dex */
public final class p implements d.a {
    public /* synthetic */ p(Context context) {
    }

    public static final boolean a(SemanticsNode semanticsNode) {
        if (SemanticsConfigurationKt.a(semanticsNode.f(), SemanticsProperties.f3953i) == null) {
            return true;
        }
        return false;
    }

    public static final boolean b(SemanticsNode semanticsNode) {
        boolean z10;
        o1.j E;
        if (f(semanticsNode)) {
            if (!v7.g.a(SemanticsConfigurationKt.a(semanticsNode.f3939f, SemanticsProperties.f3955k), Boolean.TRUE)) {
                return true;
            }
        }
        LayoutNode d5 = d(semanticsNode.c, AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1.f3652j);
        if (d5 == null) {
            return false;
        }
        l1.h0 r3 = v0.p.r(d5);
        if (r3 != null && (E = m0.b.E(r3)) != null) {
            z10 = v7.g.a(SemanticsConfigurationKt.a(E, SemanticsProperties.f3955k), Boolean.TRUE);
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        return true;
    }

    public static final a1 c(int i10, ArrayList arrayList) {
        v7.g.f(arrayList, "<this>");
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((a1) arrayList.get(i11)).f3822i == i10) {
                return (a1) arrayList.get(i11);
            }
        }
        return null;
    }

    public static final LayoutNode d(LayoutNode layoutNode, u7.l lVar) {
        do {
            layoutNode = layoutNode.p();
            if (layoutNode == null) {
                return null;
            }
        } while (!((Boolean) lVar.U(layoutNode)).booleanValue());
        return layoutNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(Region region, SemanticsNode semanticsNode, LinkedHashMap linkedHashMap, SemanticsNode semanticsNode2) {
        boolean z10;
        boolean isEmpty;
        int i10;
        int i11;
        l1.h0 h0Var;
        boolean z11;
        boolean z12;
        Region region2;
        u0.d dVar;
        LayoutNode layoutNode;
        LayoutNode layoutNode2 = semanticsNode2.c;
        boolean z13 = false;
        if (layoutNode2.A && layoutNode2.z()) {
            z10 = false;
            isEmpty = region.isEmpty();
            i10 = semanticsNode.f3940g;
            i11 = semanticsNode2.f3940g;
            if (isEmpty || i11 == i10) {
                if (!z10 && !semanticsNode2.f3937d) {
                    return;
                }
                if (semanticsNode2.f3939f.f16207j || (h0Var = v0.p.q(semanticsNode2.c)) == null) {
                    h0Var = semanticsNode2.f3935a;
                }
                v7.g.f(h0Var, "<this>");
                z11 = h0Var.e().f16830o;
                u0.d dVar2 = u0.d.f17725e;
                if (z11) {
                    if (SemanticsConfigurationKt.a(h0Var.t(), o1.i.f16194b) != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    NodeCoordinator D = v0.p.D(h0Var, 8);
                    if (!z12) {
                        dVar2 = m0.b.y(D);
                    } else if (D.P()) {
                        j1.h e02 = m0.b.e0(D);
                        u0.b bVar = D.B;
                        if (bVar == null) {
                            bVar = new u0.b();
                            D.B = bVar;
                        }
                        long J0 = D.J0(D.S0());
                        bVar.f17718a = -u0.f.d(J0);
                        bVar.f17719b = -u0.f.b(J0);
                        bVar.c = u0.f.d(J0) + D.q0();
                        bVar.f17720d = u0.f.b(J0) + D.n0();
                        while (true) {
                            if (D != e02) {
                                D.i1(bVar, false, true);
                                if (bVar.b()) {
                                    break;
                                }
                                D = D.f3501q;
                                v7.g.c(D);
                            } else {
                                dVar2 = new u0.d(bVar.f17718a, bVar.f17719b, bVar.c, bVar.f17720d);
                                break;
                            }
                        }
                    }
                }
                Rect q12 = m0.b.q1(dVar2);
                region2 = new Region();
                region2.set(q12);
                if (i11 == i10) {
                    i11 = -1;
                }
                if (!region2.op(region, region2, Region.Op.INTERSECT)) {
                    Integer valueOf = Integer.valueOf(i11);
                    Rect bounds = region2.getBounds();
                    v7.g.e(bounds, "region.bounds");
                    linkedHashMap.put(valueOf, new b1(semanticsNode2, bounds));
                    List e10 = semanticsNode2.e(false);
                    for (int size = e10.size() - 1; -1 < size; size--) {
                        e(region, semanticsNode, linkedHashMap, (SemanticsNode) e10.get(size));
                    }
                    region.op(q12, region, Region.Op.REVERSE_DIFFERENCE);
                    return;
                } else if (semanticsNode2.f3937d) {
                    SemanticsNode g10 = semanticsNode2.g();
                    if (g10 != null && (layoutNode = g10.c) != null && layoutNode.A) {
                        z13 = true;
                    }
                    if (z13) {
                        dVar = g10.d();
                    } else {
                        dVar = new u0.d(0.0f, 0.0f, 10.0f, 10.0f);
                    }
                    linkedHashMap.put(Integer.valueOf(i11), new b1(semanticsNode2, m0.b.q1(dVar)));
                    return;
                } else if (i11 == -1) {
                    Integer valueOf2 = Integer.valueOf(i11);
                    Rect bounds2 = region2.getBounds();
                    v7.g.e(bounds2, "region.bounds");
                    linkedHashMap.put(valueOf2, new b1(semanticsNode2, bounds2));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        z10 = true;
        isEmpty = region.isEmpty();
        i10 = semanticsNode.f3940g;
        i11 = semanticsNode2.f3940g;
        if (isEmpty) {
        }
        if (!z10) {
        }
        if (semanticsNode2.f3939f.f16207j) {
        }
        h0Var = semanticsNode2.f3935a;
        v7.g.f(h0Var, "<this>");
        z11 = h0Var.e().f16830o;
        u0.d dVar22 = u0.d.f17725e;
        if (z11) {
        }
        Rect q122 = m0.b.q1(dVar22);
        region2 = new Region();
        region2.set(q122);
        if (i11 == i10) {
        }
        if (!region2.op(region, region2, Region.Op.INTERSECT)) {
        }
    }

    public static final boolean f(SemanticsNode semanticsNode) {
        o1.j jVar = semanticsNode.f3939f;
        androidx.compose.ui.semantics.a<o1.a<u7.l<List<p1.n>, Boolean>>> aVar = o1.i.f16193a;
        return jVar.d(o1.i.f16198g);
    }
}
