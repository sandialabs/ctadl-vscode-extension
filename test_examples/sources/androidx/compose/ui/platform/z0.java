package androidx.compose.ui.platform;

import android.view.RenderNode;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    public static final z0 f3923a = new z0();

    public final int a(RenderNode renderNode) {
        v7.g.f(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        v7.g.f(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i10) {
        v7.g.f(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i10);
    }

    public final void d(RenderNode renderNode, int i10) {
        v7.g.f(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i10);
    }
}
