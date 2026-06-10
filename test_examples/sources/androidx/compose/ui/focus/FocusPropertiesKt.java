package androidx.compose.ui.focus;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import k1.h;
import l1.b0;
import m0.b;
import v7.g;

/* loaded from: classes.dex */
public final class FocusPropertiesKt {

    /* renamed from: a  reason: collision with root package name */
    public static final h<t0.h> f3049a = b.R0(FocusPropertiesKt$ModifierLocalFocusProperties$1.f3050j);

    public static final void a(FocusModifier focusModifier) {
        FocusStateImpl focusStateImpl;
        OwnerSnapshotObserver snapshotObserver;
        g.f(focusModifier, "<this>");
        NodeCoordinator nodeCoordinator = focusModifier.f3027u;
        if (nodeCoordinator == null) {
            return;
        }
        FocusPropertiesImpl focusPropertiesImpl = focusModifier.f3025s;
        g.f(focusPropertiesImpl, "<this>");
        focusPropertiesImpl.f3037a = true;
        FocusRequester focusRequester = FocusRequester.f3054b;
        focusPropertiesImpl.d(focusRequester);
        focusPropertiesImpl.c = focusRequester;
        focusPropertiesImpl.f3039d = focusRequester;
        focusPropertiesImpl.f3040e = focusRequester;
        focusPropertiesImpl.f3041f = focusRequester;
        focusPropertiesImpl.f3042g = focusRequester;
        focusPropertiesImpl.f3043h = focusRequester;
        focusPropertiesImpl.f3044i = focusRequester;
        focusPropertiesImpl.b(FocusPropertiesKt$clear$1.f3051j);
        focusPropertiesImpl.c(FocusPropertiesKt$clear$2.f3052j);
        b0 b0Var = nodeCoordinator.f3499o.f3420p;
        if (b0Var != null && (snapshotObserver = b0Var.getSnapshotObserver()) != null) {
            snapshotObserver.b(focusModifier, FocusModifier.f3016y, new FocusPropertiesKt$refreshFocusProperties$1(focusModifier));
        }
        if (focusPropertiesImpl.f3037a) {
            int ordinal = focusModifier.f3019l.ordinal();
            if (ordinal != 3) {
                if (ordinal == 4) {
                    focusStateImpl = FocusStateImpl.ActiveParent;
                } else {
                    return;
                }
            } else {
                focusStateImpl = FocusStateImpl.Inactive;
            }
            focusModifier.c(focusStateImpl);
            return;
        }
        FocusTransactionsKt.c(focusModifier);
    }
}
