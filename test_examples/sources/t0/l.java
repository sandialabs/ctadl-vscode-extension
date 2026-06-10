package t0;

import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class l implements Comparator<FocusModifier> {

    /* renamed from: a  reason: collision with root package name */
    public static final l f17553a = new l();

    @Override // java.util.Comparator
    public final int compare(FocusModifier focusModifier, FocusModifier focusModifier2) {
        LayoutNode layoutNode;
        FocusModifier focusModifier3 = focusModifier;
        FocusModifier focusModifier4 = focusModifier2;
        if (focusModifier3 != null) {
            if (focusModifier4 != null) {
                int i10 = 0;
                if (m0.b.B0(focusModifier3) && m0.b.B0(focusModifier4)) {
                    NodeCoordinator nodeCoordinator = focusModifier3.f3027u;
                    LayoutNode layoutNode2 = null;
                    if (nodeCoordinator != null) {
                        layoutNode = nodeCoordinator.f3499o;
                    } else {
                        layoutNode = null;
                    }
                    if (layoutNode != null) {
                        NodeCoordinator nodeCoordinator2 = focusModifier4.f3027u;
                        if (nodeCoordinator2 != null) {
                            layoutNode2 = nodeCoordinator2.f3499o;
                        }
                        if (layoutNode2 != null) {
                            if (v7.g.a(layoutNode, layoutNode2)) {
                                return 0;
                            }
                            Object[] objArr = new LayoutNode[16];
                            int i11 = 0;
                            while (layoutNode != null) {
                                int i12 = i11 + 1;
                                if (objArr.length < i12) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i12, objArr.length * 2));
                                    v7.g.e(objArr, "copyOf(this, newSize)");
                                }
                                if (i11 != 0) {
                                    n7.i.b2(objArr, objArr, 0 + 1, 0, i11);
                                }
                                objArr[0] = layoutNode;
                                i11++;
                                layoutNode = layoutNode.p();
                            }
                            Object[] objArr2 = new LayoutNode[16];
                            int i13 = 0;
                            while (layoutNode2 != null) {
                                int i14 = i13 + 1;
                                if (objArr2.length < i14) {
                                    objArr2 = Arrays.copyOf(objArr2, Math.max(i14, objArr2.length * 2));
                                    v7.g.e(objArr2, "copyOf(this, newSize)");
                                }
                                if (i13 != 0) {
                                    n7.i.b2(objArr2, objArr2, 0 + 1, 0, i13);
                                }
                                objArr2[0] = layoutNode2;
                                i13++;
                                layoutNode2 = layoutNode2.p();
                            }
                            int min = Math.min(i11 - 1, i13 - 1);
                            if (min >= 0) {
                                while (v7.g.a(objArr[i10], objArr2[i10])) {
                                    if (i10 != min) {
                                        i10++;
                                    }
                                }
                                return v7.g.h(((LayoutNode) objArr[i10]).B, ((LayoutNode) objArr2[i10]).B);
                            }
                            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                return 0;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
