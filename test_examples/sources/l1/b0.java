package l1;

import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import u1.d;
import u1.e;

/* loaded from: classes.dex */
public interface b0 {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f15728d = 0;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    void c(LayoutNode layoutNode, boolean z10, boolean z11);

    void e(LayoutNode layoutNode, boolean z10, boolean z11);

    void g(BackwardsCompatNode.a aVar);

    androidx.compose.ui.platform.h getAccessibilityManager();

    r0.b getAutofill();

    r0.h getAutofillTree();

    androidx.compose.ui.platform.f0 getClipboardManager();

    b2.b getDensity();

    t0.d getFocusManager();

    e.a getFontFamilyResolver();

    d.a getFontLoader();

    b1.a getHapticFeedBack();

    c1.b getInputModeManager();

    LayoutDirection getLayoutDirection();

    ModifierLocalManager getModifierLocalManager();

    g1.m getPointerIconService();

    o getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    v1.d getTextInputService();

    c1 getTextToolbar();

    j1 getViewConfiguration();

    n1 getWindowInfo();

    long i(long j2);

    void j();

    void k(LayoutNode layoutNode);

    void l();

    z n(u7.a aVar, u7.l lVar);

    void o(LayoutNode layoutNode);

    void p(LayoutNode layoutNode);

    void r(LayoutNode layoutNode);

    boolean requestFocus();

    void s(u7.a<m7.n> aVar);

    void setShowLayoutBounds(boolean z10);

    void t(LayoutNode layoutNode);
}
