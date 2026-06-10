package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class e0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f3838a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final int[] f3839b = new int[2];

    @Override // androidx.compose.ui.platform.c0
    public void a(View view, float[] fArr) {
        v7.g.f(view, "view");
        v7.g.f(fArr, "matrix");
        Matrix matrix = this.f3838a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                int[] iArr = this.f3839b;
                view.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                view.getLocationInWindow(iArr);
                matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
                a1.c.t1(matrix, fArr);
                return;
            }
            view = (View) parent;
        }
    }
}
