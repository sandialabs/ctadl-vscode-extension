package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;

/* loaded from: classes.dex */
public final class s0 implements g0 {

    /* renamed from: g  reason: collision with root package name */
    public static boolean f3897g = true;

    /* renamed from: a  reason: collision with root package name */
    public final RenderNode f3898a;

    /* renamed from: b  reason: collision with root package name */
    public int f3899b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f3900d;

    /* renamed from: e  reason: collision with root package name */
    public int f3901e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3902f;

    public s0(AndroidComposeView androidComposeView) {
        v7.g.f(androidComposeView, "ownerView");
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        v7.g.e(create, "create(\"Compose\", ownerView)");
        this.f3898a = create;
        if (f3897g) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                z0 z0Var = z0.f3923a;
                z0Var.c(create, z0Var.a(create));
                z0Var.d(create, z0Var.b(create));
            }
            if (i10 >= 24) {
                y0.f3921a.a(create);
            } else {
                x0.f3919a.a(create);
            }
            f3897g = false;
        }
    }

    @Override // androidx.compose.ui.platform.g0
    public final int A() {
        return this.c;
    }

    @Override // androidx.compose.ui.platform.g0
    public final int B() {
        return this.f3899b;
    }

    @Override // androidx.compose.ui.platform.g0
    public final void C(float f10) {
        this.f3898a.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void D(boolean z10) {
        this.f3902f = z10;
        this.f3898a.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final boolean E(int i10, int i11, int i12, int i13) {
        this.f3899b = i10;
        this.c = i11;
        this.f3900d = i12;
        this.f3901e = i13;
        return this.f3898a.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void F() {
        int i10 = Build.VERSION.SDK_INT;
        RenderNode renderNode = this.f3898a;
        if (i10 >= 24) {
            y0.f3921a.a(renderNode);
        } else {
            x0.f3919a.a(renderNode);
        }
    }

    @Override // androidx.compose.ui.platform.g0
    public final void G(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            z0.f3923a.c(this.f3898a, i10);
        }
    }

    @Override // androidx.compose.ui.platform.g0
    public final void H(float f10) {
        this.f3898a.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void I(float f10) {
        this.f3898a.setElevation(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final int J() {
        return this.f3900d;
    }

    @Override // androidx.compose.ui.platform.g0
    public final boolean K() {
        return this.f3898a.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.g0
    public final void L(int i10) {
        this.c += i10;
        this.f3901e += i10;
        this.f3898a.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void M(boolean z10) {
        this.f3898a.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final boolean N() {
        return this.f3898a.isValid();
    }

    @Override // androidx.compose.ui.platform.g0
    public final void O(Outline outline) {
        this.f3898a.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void P(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            z0.f3923a.d(this.f3898a, i10);
        }
    }

    @Override // androidx.compose.ui.platform.g0
    public final boolean Q() {
        return this.f3898a.setHasOverlappingRendering(true);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void R(Matrix matrix) {
        v7.g.f(matrix, "matrix");
        this.f3898a.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.g0
    public final float S() {
        return this.f3898a.getElevation();
    }

    @Override // androidx.compose.ui.platform.g0
    public final int a() {
        return this.f3901e - this.c;
    }

    @Override // androidx.compose.ui.platform.g0
    public final int b() {
        return this.f3900d - this.f3899b;
    }

    @Override // androidx.compose.ui.platform.g0
    public final void c(float f10) {
        this.f3898a.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void d(float f10) {
        this.f3898a.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void e() {
    }

    @Override // androidx.compose.ui.platform.g0
    public final void g(float f10) {
        this.f3898a.setRotation(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void h(float f10) {
        this.f3898a.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void i(float f10) {
        this.f3898a.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void k(float f10) {
        this.f3898a.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void m(float f10) {
        this.f3898a.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final float n() {
        return this.f3898a.getAlpha();
    }

    @Override // androidx.compose.ui.platform.g0
    public final void q(float f10) {
        this.f3898a.setCameraDistance(-f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void u(float f10) {
        this.f3898a.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final void v(int i10) {
        this.f3899b += i10;
        this.f3900d += i10;
        this.f3898a.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.ui.platform.g0
    public final int w() {
        return this.f3901e;
    }

    @Override // androidx.compose.ui.platform.g0
    public final void x(j0.c cVar, v0.z zVar, u7.l<? super v0.o, m7.n> lVar) {
        v7.g.f(cVar, "canvasHolder");
        int i10 = this.f3900d - this.f3899b;
        int i11 = this.f3901e - this.c;
        RenderNode renderNode = this.f3898a;
        DisplayListCanvas start = renderNode.start(i10, i11);
        v7.g.e(start, "renderNode.start(width, height)");
        Canvas r3 = cVar.a().r();
        cVar.a().s((Canvas) start);
        v0.c a10 = cVar.a();
        if (zVar != null) {
            a10.m();
            a10.j(zVar, 1);
        }
        lVar.U(a10);
        if (zVar != null) {
            a10.l();
        }
        cVar.a().s(r3);
        renderNode.end(start);
    }

    @Override // androidx.compose.ui.platform.g0
    public final boolean y() {
        return this.f3902f;
    }

    @Override // androidx.compose.ui.platform.g0
    public final void z(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f3898a);
    }
}
