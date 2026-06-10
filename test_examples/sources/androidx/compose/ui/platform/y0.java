package androidx.compose.ui.platform;

import android.view.RenderNode;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final y0 f3921a = new y0();

    public final void a(RenderNode renderNode) {
        v7.g.f(renderNode, "renderNode");
        renderNode.discardDisplayList();
    }
}
