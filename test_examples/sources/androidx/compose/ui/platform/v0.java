package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* loaded from: classes.dex */
public final class v0 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final RenderNode f3912a;

    public v0(AndroidComposeView androidComposeView) {
        v7.g.f(androidComposeView, "ownerView");
        this.f3912a = new RenderNode("Compose");
    }

    @Override // androidx.compose.ui.platform.g0
    public final int A() {
        int top;
        top = this.f3912a.getTop();
        return top;
    }

    @Override // androidx.compose.ui.platform.g0
    public final int B() {
        int left;
        left = this.f3912a.getLeft();
        return left;
    }

    @Override // androidx.compose.ui.platform.g0
    public final void C(float f10) {
        this.f3912a.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void D(boolean z10) {
        this.f3912a.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final boolean E(int i10, int i11, int i12, int i13) {
        boolean position;
        position = this.f3912a.setPosition(i10, i11, i12, i13);
        return position;
    }

    @Override // androidx.compose.ui.platform.g0
    public final void F() {
        this.f3912a.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.g0
    public final void G(int i10) {
        this.f3912a.setAmbientShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void H(float f10) {
        this.f3912a.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void I(float f10) {
        this.f3912a.setElevation(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final int J() {
        int right;
        right = this.f3912a.getRight();
        return right;
    }

    @Override // androidx.compose.ui.platform.g0
    public final boolean K() {
        boolean clipToOutline;
        clipToOutline = this.f3912a.getClipToOutline();
        return clipToOutline;
    }

    @Override // androidx.compose.ui.platform.g0
    public final void L(int i10) {
        this.f3912a.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void M(boolean z10) {
        this.f3912a.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final boolean N() {
        boolean hasDisplayList;
        hasDisplayList = this.f3912a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // androidx.compose.ui.platform.g0
    public final void O(Outline outline) {
        this.f3912a.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void P(int i10) {
        this.f3912a.setSpotShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final boolean Q() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f3912a.setHasOverlappingRendering(true);
        return hasOverlappingRendering;
    }

    @Override // androidx.compose.ui.platform.g0
    public final void R(Matrix matrix) {
        v7.g.f(matrix, "matrix");
        this.f3912a.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.g0
    public final float S() {
        float elevation;
        elevation = this.f3912a.getElevation();
        return elevation;
    }

    @Override // androidx.compose.ui.platform.g0
    public final int a() {
        int height;
        height = this.f3912a.getHeight();
        return height;
    }

    @Override // androidx.compose.ui.platform.g0
    public final int b() {
        int width;
        width = this.f3912a.getWidth();
        return width;
    }

    @Override // androidx.compose.ui.platform.g0
    public final void c(float f10) {
        this.f3912a.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void d(float f10) {
        this.f3912a.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void e() {
        if (Build.VERSION.SDK_INT >= 31) {
            w0.f3916a.a(this.f3912a, null);
        }
    }

    @Override // androidx.compose.ui.platform.g0
    public final void g(float f10) {
        this.f3912a.setRotationZ(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void h(float f10) {
        this.f3912a.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void i(float f10) {
        this.f3912a.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void k(float f10) {
        this.f3912a.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void m(float f10) {
        this.f3912a.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final float n() {
        float alpha;
        alpha = this.f3912a.getAlpha();
        return alpha;
    }

    @Override // androidx.compose.ui.platform.g0
    public final void q(float f10) {
        this.f3912a.setCameraDistance(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void u(float f10) {
        this.f3912a.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void v(int i10) {
        this.f3912a.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final int w() {
        int bottom;
        bottom = this.f3912a.getBottom();
        return bottom;
    }

    @Override // androidx.compose.ui.platform.g0
    public final void x(j0.c cVar, v0.z zVar, u7.l<? super v0.o, m7.n> lVar) {
        RecordingCanvas beginRecording;
        v7.g.f(cVar, "canvasHolder");
        RenderNode renderNode = this.f3912a;
        beginRecording = renderNode.beginRecording();
        v7.g.e(beginRecording, "renderNode.beginRecording()");
        v0.c cVar2 = (v0.c) cVar.f12625b;
        Canvas canvas = cVar2.f18085a;
        cVar2.getClass();
        cVar2.f18085a = beginRecording;
        v0.c cVar3 = (v0.c) cVar.f12625b;
        if (zVar != null) {
            cVar3.m();
            cVar3.j(zVar, 1);
        }
        lVar.U(cVar3);
        if (zVar != null) {
            cVar3.l();
        }
        ((v0.c) cVar.f12625b).s(canvas);
        renderNode.endRecording();
    }

    @Override // androidx.compose.ui.platform.g0
    public final boolean y() {
        boolean clipToBounds;
        clipToBounds = this.f3912a.getClipToBounds();
        return clipToBounds;
    }

    @Override // androidx.compose.ui.platform.g0
    public final void z(Canvas canvas) {
        canvas.drawRenderNode(this.f3912a);
    }
}
