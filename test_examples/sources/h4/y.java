package h4;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class y extends x {
    @Override // h4.u
    public final float Z1(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // h4.u
    public final void a2(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // h4.v
    public final void b2(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // h4.v
    public final void c2(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // h4.w, a1.c
    public final void u1(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // h4.x, a1.c
    public final void x1(View view, int i10) {
        view.setTransitionVisibility(i10);
    }
}
