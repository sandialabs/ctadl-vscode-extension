package l1;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class q extends j1.b0 implements j1.t {

    /* renamed from: m  reason: collision with root package name */
    public boolean f15759m;
    public boolean n;

    public static void F0(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode;
        n nVar;
        v7.g.f(nodeCoordinator, "<this>");
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f3500p;
        if (nodeCoordinator2 != null) {
            layoutNode = nodeCoordinator2.f3499o;
        } else {
            layoutNode = null;
        }
        boolean a10 = v7.g.a(layoutNode, nodeCoordinator.f3499o);
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = (LayoutNodeLayoutDelegate.MeasurePassDelegate) nodeCoordinator.R0();
        if (!a10) {
            nVar = measurePassDelegate.f3479t;
        } else {
            a v3 = measurePassDelegate.v();
            if (v3 == null || (nVar = ((LayoutNodeLayoutDelegate.MeasurePassDelegate) v3).f3479t) == null) {
                return;
            }
        }
        nVar.g();
    }

    public abstract boolean A0();

    public abstract LayoutNode B0();

    public abstract j1.r C0();

    public abstract q D0();

    public abstract long E0();

    public abstract void G0();

    @Override // b2.b
    public final float H(float f10) {
        return getDensity() * f10;
    }

    @Override // b2.b
    public final /* synthetic */ int a0(float f10) {
        return androidx.activity.e.a(f10, this);
    }

    @Override // j1.u
    public final int f0(j1.a aVar) {
        int x02;
        v7.g.f(aVar, "alignmentLine");
        if (A0() && (x02 = x0(aVar)) != Integer.MIN_VALUE) {
            return b2.g.a(h0()) + x02;
        }
        return Integer.MIN_VALUE;
    }

    @Override // b2.b
    public final /* synthetic */ long g0(long j2) {
        return androidx.activity.e.d(j2, this);
    }

    @Override // b2.b
    public final /* synthetic */ float i0(long j2) {
        return androidx.activity.e.c(j2, this);
    }

    @Override // j1.t
    public final j1.s m0(int i10, int i11, Map map, u7.l lVar) {
        v7.g.f(map, "alignmentLines");
        v7.g.f(lVar, "placementBlock");
        return new j1.s(i10, i11, this, map, lVar);
    }

    @Override // b2.b
    public final float r0(int i10) {
        return i10 / getDensity();
    }

    @Override // b2.b
    public final float t0(float f10) {
        return f10 / getDensity();
    }

    public abstract int x0(j1.a aVar);

    public abstract q y0();

    public abstract j1.h z0();
}
