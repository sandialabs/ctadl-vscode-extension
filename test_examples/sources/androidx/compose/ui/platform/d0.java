package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class d0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f3836a = new int[2];

    /* renamed from: b  reason: collision with root package name */
    public final float[] f3837b = v0.p.k();

    @Override // androidx.compose.ui.platform.c0
    public final void a(View view, float[] fArr) {
        v7.g.f(view, "view");
        v7.g.f(fArr, "matrix");
        v0.p.G(fArr);
        c(view, fArr);
    }

    public final void b(float[] fArr, float f10, float f11) {
        float[] fArr2 = this.f3837b;
        v0.p.G(fArr2);
        v0.p.I(fArr2, f10, f11);
        AndroidComposeView_androidKt.a(fArr, fArr2);
    }

    public final void c(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            c((View) parent, fArr);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.f3836a;
            view.getLocationInWindow(iArr);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, iArr[0], iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr2 = this.f3837b;
            a1.c.t1(matrix, fArr2);
            AndroidComposeView_androidKt.a(fArr, fArr2);
        }
    }
}
