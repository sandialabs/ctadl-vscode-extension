package androidx.compose.ui.platform;

import android.view.RenderNode;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public static final x0 f3919a = new x0();

    public final void a(RenderNode renderNode) {
        v7.g.f(renderNode, "renderNode");
        renderNode.destroyDisplayListData();
    }
}
