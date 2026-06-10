package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.NoWhenBranchMatchedException;
import l1.b0;
import t0.c;
import t0.d;
import v7.g;

/* loaded from: classes.dex */
public final class FocusTransactionsKt {
    public static final boolean a(FocusModifier focusModifier) {
        FocusModifier focusModifier2 = focusModifier.f3020m;
        if (focusModifier2 != null) {
            if (!b(focusModifier2, false)) {
                return false;
            }
            focusModifier.f3020m = null;
            return true;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final boolean b(FocusModifier focusModifier, boolean z10) {
        g.f(focusModifier, "<this>");
        int ordinal = focusModifier.f3019l.ordinal();
        FocusStateImpl focusStateImpl = FocusStateImpl.Inactive;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (a(focusModifier)) {
                            focusModifier.c(FocusStateImpl.Deactivated);
                        }
                    }
                    return true;
                } else if (z10) {
                    focusModifier.c(focusStateImpl);
                    return z10;
                } else {
                    return z10;
                }
            } else if (a(focusModifier)) {
            }
            return false;
        }
        focusModifier.c(focusStateImpl);
        return true;
    }

    public static final void c(FocusModifier focusModifier) {
        LayoutNode layoutNode;
        b0 b0Var;
        d focusManager;
        g.f(focusModifier, "<this>");
        int ordinal = focusModifier.f3019l.ordinal();
        FocusStateImpl focusStateImpl = FocusStateImpl.Deactivated;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 5) {
                        return;
                    }
                    focusModifier.c(focusStateImpl);
                }
            } else {
                focusModifier.c(FocusStateImpl.DeactivatedParent);
                return;
            }
        }
        NodeCoordinator nodeCoordinator = focusModifier.f3027u;
        if (nodeCoordinator != null && (layoutNode = nodeCoordinator.f3499o) != null && (b0Var = layoutNode.f3420p) != null && (focusManager = b0Var.getFocusManager()) != null) {
            focusManager.b(true);
        }
        focusModifier.c(focusStateImpl);
    }

    public static final void d(FocusModifier focusModifier) {
        FocusStateImpl focusStateImpl;
        int ordinal = focusModifier.f3019l.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3 && ordinal != 4) {
                    if (ordinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    throw new IllegalStateException("Granting focus to a deactivated node.".toString());
                }
            } else {
                focusStateImpl = FocusStateImpl.Captured;
                focusModifier.c(focusStateImpl);
            }
        }
        focusStateImpl = FocusStateImpl.Active;
        focusModifier.c(focusStateImpl);
    }

    public static final void e(FocusModifier focusModifier) {
        b0 b0Var;
        LayoutNode layoutNode;
        g.f(focusModifier, "<this>");
        NodeCoordinator nodeCoordinator = focusModifier.f3027u;
        if (nodeCoordinator != null && (layoutNode = nodeCoordinator.f3499o) != null) {
            b0Var = layoutNode.f3420p;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            focusModifier.f3028v = true;
            return;
        }
        int ordinal = focusModifier.f3019l.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3 && ordinal != 4) {
                        if (ordinal == 5) {
                            FocusModifier focusModifier2 = focusModifier.f3017j;
                            if (focusModifier2 != null) {
                                f(focusModifier2, focusModifier);
                                return;
                            } else if (!g(focusModifier)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        TwoDimensionalFocusSearchKt.d(focusModifier, 7, FocusTransactionsKt$requestFocus$1.f3066j);
                        return;
                    }
                }
            } else if (!a(focusModifier)) {
                return;
            }
            d(focusModifier);
            return;
        }
        c cVar = focusModifier.n;
        if (cVar != null) {
            cVar.d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (f(r0, r5) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean f(FocusModifier focusModifier, FocusModifier focusModifier2) {
        if (focusModifier.f3018k.h(focusModifier2)) {
            int ordinal = focusModifier.f3019l.ordinal();
            FocusStateImpl focusStateImpl = FocusStateImpl.ActiveParent;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5) {
                                    FocusModifier focusModifier3 = focusModifier.f3017j;
                                    if (focusModifier3 == null && g(focusModifier)) {
                                        focusModifier.c(FocusStateImpl.Active);
                                    } else if (focusModifier3 != null) {
                                    }
                                    return f(focusModifier, focusModifier2);
                                }
                                throw new NoWhenBranchMatchedException();
                            } else if (focusModifier.f3020m != null) {
                                if (a(focusModifier)) {
                                }
                            }
                        } else {
                            int ordinal2 = focusModifier.f3019l.ordinal();
                            if (ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    boolean f10 = f(focusModifier, focusModifier2);
                                    c(focusModifier);
                                    return f10;
                                }
                            } else {
                                focusStateImpl = FocusStateImpl.Inactive;
                            }
                            focusModifier.c(focusStateImpl);
                            boolean f102 = f(focusModifier, focusModifier2);
                            c(focusModifier);
                            return f102;
                        }
                    }
                    return false;
                }
                if (a(focusModifier)) {
                }
                return false;
            }
            focusModifier.c(focusStateImpl);
            focusModifier.f3020m = focusModifier2;
            d(focusModifier2);
            return true;
        }
        throw new IllegalStateException("Non child node cannot request focus.".toString());
    }

    public static final boolean g(FocusModifier focusModifier) {
        LayoutNode layoutNode;
        b0 b0Var;
        NodeCoordinator nodeCoordinator = focusModifier.f3027u;
        if (nodeCoordinator != null && (layoutNode = nodeCoordinator.f3499o) != null && (b0Var = layoutNode.f3420p) != null) {
            return b0Var.requestFocus();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }
}
