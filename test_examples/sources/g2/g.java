package g2;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {
    public static j a(ConstraintWidget constraintWidget, int i10, ArrayList<j> arrayList, j jVar) {
        int i11;
        boolean z10;
        ConstraintAnchor constraintAnchor;
        int i12;
        if (i10 == 0) {
            i11 = constraintWidget.f4266q0;
        } else {
            i11 = constraintWidget.f4268r0;
        }
        int i13 = 0;
        if (i11 != -1 && (jVar == null || i11 != jVar.f11218b)) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                j jVar2 = arrayList.get(i14);
                if (jVar2.f11218b == i11) {
                    if (jVar != null) {
                        jVar.c(i10, jVar2);
                        arrayList.remove(jVar);
                    }
                    jVar = jVar2;
                } else {
                    i14++;
                }
            }
        } else if (i11 != -1) {
            return jVar;
        }
        if (jVar == null) {
            if (constraintWidget instanceof f2.b) {
                f2.b bVar = (f2.b) constraintWidget;
                int i15 = 0;
                while (true) {
                    if (i15 < bVar.f10896t0) {
                        ConstraintWidget constraintWidget2 = bVar.f10895s0[i15];
                        if ((i10 != 0 || (i12 = constraintWidget2.f4266q0) == -1) && (i10 != 1 || (i12 = constraintWidget2.f4268r0) == -1)) {
                            i15++;
                        }
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 != -1) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList.size()) {
                            break;
                        }
                        j jVar3 = arrayList.get(i16);
                        if (jVar3.f11218b == i12) {
                            jVar = jVar3;
                            break;
                        }
                        i16++;
                    }
                }
            }
            if (jVar == null) {
                jVar = new j(i10);
            }
            arrayList.add(jVar);
        }
        ArrayList<ConstraintWidget> arrayList2 = jVar.f11217a;
        if (arrayList2.contains(constraintWidget)) {
            z10 = false;
        } else {
            arrayList2.add(constraintWidget);
            z10 = true;
        }
        if (z10) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                ConstraintAnchor constraintAnchor2 = fVar.f4366v0;
                if (fVar.f4367w0 == 0) {
                    i13 = 1;
                }
                constraintAnchor2.c(i13, jVar, arrayList);
            }
            int i17 = jVar.f11218b;
            if (i10 == 0) {
                constraintWidget.f4266q0 = i17;
                constraintWidget.K.c(i10, jVar, arrayList);
                constraintAnchor = constraintWidget.M;
            } else {
                constraintWidget.f4268r0 = i17;
                constraintWidget.L.c(i10, jVar, arrayList);
                constraintWidget.O.c(i10, jVar, arrayList);
                constraintAnchor = constraintWidget.N;
            }
            constraintAnchor.c(i10, jVar, arrayList);
            constraintWidget.R.c(i10, jVar, arrayList);
        }
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0022 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        boolean z10;
        boolean z11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour3 != dimensionBehaviour5 && dimensionBehaviour3 != dimensionBehaviour7 && (dimensionBehaviour3 != dimensionBehaviour6 || dimensionBehaviour == dimensionBehaviour7)) {
            z10 = false;
            if (dimensionBehaviour4 != dimensionBehaviour5 && dimensionBehaviour4 != dimensionBehaviour7 && (dimensionBehaviour4 != dimensionBehaviour6 || dimensionBehaviour2 == dimensionBehaviour7)) {
                z11 = false;
                return !z10 || z11;
            }
            z11 = true;
            if (z10) {
            }
        }
        z10 = true;
        if (dimensionBehaviour4 != dimensionBehaviour5) {
            z11 = false;
            if (z10) {
            }
        }
        z11 = true;
        if (z10) {
        }
    }
}
