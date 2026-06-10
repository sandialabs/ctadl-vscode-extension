package androidx.compose.ui.node;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import l1.b0;
import l1.i;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Lm7/n;", "invoke", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class NodeCoordinator$Companion$onCommitAffectingLayerParams$1 extends Lambda implements l<NodeCoordinator, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final NodeCoordinator$Companion$onCommitAffectingLayerParams$1 f3512j = new NodeCoordinator$Companion$onCommitAffectingLayerParams$1();

    public NodeCoordinator$Companion$onCommitAffectingLayerParams$1() {
        super(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n U(NodeCoordinator nodeCoordinator) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        NodeCoordinator nodeCoordinator2 = nodeCoordinator;
        g.f(nodeCoordinator2, "coordinator");
        if (nodeCoordinator2.w()) {
            i iVar = nodeCoordinator2.C;
            if (iVar == null) {
                nodeCoordinator2.m1();
            } else {
                i iVar2 = NodeCoordinator.J;
                iVar2.getClass();
                iVar2.f15742a = iVar.f15742a;
                iVar2.f15743b = iVar.f15743b;
                iVar2.c = iVar.c;
                iVar2.f15744d = iVar.f15744d;
                iVar2.f15745e = iVar.f15745e;
                iVar2.f15746f = iVar.f15746f;
                iVar2.f15747g = iVar.f15747g;
                iVar2.f15748h = iVar.f15748h;
                iVar2.f15749i = iVar.f15749i;
                nodeCoordinator2.m1();
                boolean z19 = true;
                if (iVar2.f15742a == iVar.f15742a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (iVar2.f15743b == iVar.f15743b) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (iVar2.c == iVar.c) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (iVar2.f15744d == iVar.f15744d) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                if (iVar2.f15745e == iVar.f15745e) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    if (iVar2.f15746f == iVar.f15746f) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        if (iVar2.f15747g == iVar.f15747g) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (z16) {
                                            if (iVar2.f15748h == iVar.f15748h) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            if (z17) {
                                                if (iVar2.f15749i == iVar.f15749i) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                if (z18) {
                                                    if (!z19) {
                                                        LayoutNode layoutNode = nodeCoordinator2.f3499o;
                                                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.K;
                                                        if (layoutNodeLayoutDelegate.f3451j > 0) {
                                                            if (layoutNodeLayoutDelegate.f3450i) {
                                                                layoutNode.L(false);
                                                            }
                                                            layoutNodeLayoutDelegate.f3452k.x0();
                                                        }
                                                        b0 b0Var = layoutNode.f3420p;
                                                        if (b0Var != null) {
                                                            b0Var.k(layoutNode);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z19 = false;
                if (!z19) {
                }
            }
        }
        return n.f16010a;
    }
}
