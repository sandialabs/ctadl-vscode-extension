package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean[] f4369a = new boolean[3];

    public static void a(d dVar, androidx.constraintlayout.core.c cVar, ConstraintWidget constraintWidget) {
        constraintWidget.f4263p = -1;
        constraintWidget.f4265q = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.V[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        if (dimensionBehaviour != dimensionBehaviour2 && dimensionBehaviourArr[0] == dimensionBehaviour3) {
            ConstraintAnchor constraintAnchor = constraintWidget.K;
            int i10 = constraintAnchor.f4225g;
            int q10 = dVar.q();
            ConstraintAnchor constraintAnchor2 = constraintWidget.M;
            int i11 = q10 - constraintAnchor2.f4225g;
            constraintAnchor.f4227i = cVar.l(constraintAnchor);
            constraintAnchor2.f4227i = cVar.l(constraintAnchor2);
            cVar.d(constraintAnchor.f4227i, i10);
            cVar.d(constraintAnchor2.f4227i, i11);
            constraintWidget.f4263p = 2;
            constraintWidget.f4239b0 = i10;
            int i12 = i11 - i10;
            constraintWidget.X = i12;
            int i13 = constraintWidget.f4243e0;
            if (i12 < i13) {
                constraintWidget.X = i13;
            }
        }
        if (dVar.V[1] != dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour3) {
            ConstraintAnchor constraintAnchor3 = constraintWidget.L;
            int i14 = constraintAnchor3.f4225g;
            int l2 = dVar.l();
            ConstraintAnchor constraintAnchor4 = constraintWidget.N;
            int i15 = l2 - constraintAnchor4.f4225g;
            constraintAnchor3.f4227i = cVar.l(constraintAnchor3);
            constraintAnchor4.f4227i = cVar.l(constraintAnchor4);
            cVar.d(constraintAnchor3.f4227i, i14);
            cVar.d(constraintAnchor4.f4227i, i15);
            if (constraintWidget.f4241d0 > 0 || constraintWidget.f4253j0 == 8) {
                ConstraintAnchor constraintAnchor5 = constraintWidget.O;
                constraintAnchor5.f4227i = cVar.l(constraintAnchor5);
                cVar.d(constraintAnchor5.f4227i, constraintWidget.f4241d0 + i14);
            }
            constraintWidget.f4265q = 2;
            constraintWidget.c0 = i14;
            int i16 = i15 - i14;
            constraintWidget.Y = i16;
            int i17 = constraintWidget.f4245f0;
            if (i16 < i17) {
                constraintWidget.Y = i17;
            }
        }
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
