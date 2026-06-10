package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public final class a extends f2.b {

    /* renamed from: u0  reason: collision with root package name */
    public int f4282u0 = 0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f4283v0 = true;

    /* renamed from: w0  reason: collision with root package name */
    public int f4284w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f4285x0 = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean A() {
        return this.f4285x0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean B() {
        return this.f4285x0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r7 != 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r4.A() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        r7 = r12.f4282u0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r7 == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (r7 == 3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        if (r4.B() == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R() {
        int i10;
        int i11;
        ConstraintAnchor j2;
        ConstraintAnchor j10;
        ConstraintAnchor j11;
        boolean z10 = true;
        while (true) {
            i11 = this.f10896t0;
            if (i10 >= i11) {
                break;
            }
            ConstraintWidget constraintWidget = this.f10895s0[i10];
            if (!this.f4283v0) {
                i10 = constraintWidget.d() ? 0 : i10 + 1;
            }
            int i12 = this.f4282u0;
            if (i12 != 0) {
            }
        }
        if (!z10 || i11 <= 0) {
            return false;
        }
        int i13 = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f10896t0; i14++) {
            ConstraintWidget constraintWidget2 = this.f10895s0[i14];
            if (this.f4283v0 || constraintWidget2.d()) {
                ConstraintAnchor.Type type = ConstraintAnchor.Type.BOTTOM;
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.LEFT;
                if (!z11) {
                    int i15 = this.f4282u0;
                    if (i15 == 0) {
                        j11 = constraintWidget2.j(type4);
                    } else if (i15 == 1) {
                        j11 = constraintWidget2.j(type3);
                    } else if (i15 == 2) {
                        j11 = constraintWidget2.j(type2);
                    } else {
                        if (i15 == 3) {
                            j11 = constraintWidget2.j(type);
                        }
                        z11 = true;
                    }
                    i13 = j11.d();
                    z11 = true;
                }
                int i16 = this.f4282u0;
                if (i16 == 0) {
                    j10 = constraintWidget2.j(type4);
                } else {
                    if (i16 == 1) {
                        j2 = constraintWidget2.j(type3);
                    } else if (i16 == 2) {
                        j10 = constraintWidget2.j(type2);
                    } else if (i16 == 3) {
                        j2 = constraintWidget2.j(type);
                    }
                    i13 = Math.max(i13, j2.d());
                }
                i13 = Math.min(i13, j10.d());
            }
        }
        int i17 = i13 + this.f4284w0;
        int i18 = this.f4282u0;
        if (i18 != 0 && i18 != 1) {
            J(i17, i17);
            this.f4285x0 = true;
            return true;
        }
        I(i17, i17);
        this.f4285x0 = true;
        return true;
    }

    public final int S() {
        int i10 = this.f4282u0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
        if (r14 != 1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(androidx.constraintlayout.core.c cVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        int i12;
        SolverVariable solverVariable;
        ConstraintAnchor constraintAnchor;
        int i13;
        int i14;
        SolverVariable solverVariable2;
        int i15;
        ConstraintAnchor[] constraintAnchorArr = this.S;
        ConstraintAnchor constraintAnchor2 = this.K;
        constraintAnchorArr[0] = constraintAnchor2;
        int i16 = 2;
        ConstraintAnchor constraintAnchor3 = this.L;
        constraintAnchorArr[2] = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = this.M;
        constraintAnchorArr[1] = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = this.N;
        constraintAnchorArr[3] = constraintAnchor5;
        for (ConstraintAnchor constraintAnchor6 : constraintAnchorArr) {
            constraintAnchor6.f4227i = cVar.l(constraintAnchor6);
        }
        int i17 = this.f4282u0;
        if (i17 >= 0 && i17 < 4) {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr[i17];
            if (!this.f4285x0) {
                R();
            }
            if (this.f4285x0) {
                this.f4285x0 = false;
                int i18 = this.f4282u0;
                if (i18 != 0 && i18 != 1) {
                    if (i18 == 2 || i18 == 3) {
                        cVar.d(constraintAnchor3.f4227i, this.c0);
                        solverVariable2 = constraintAnchor5.f4227i;
                        i15 = this.c0;
                        cVar.d(solverVariable2, i15);
                        return;
                    }
                    return;
                }
                cVar.d(constraintAnchor2.f4227i, this.f4239b0);
                solverVariable2 = constraintAnchor4.f4227i;
                i15 = this.f4239b0;
                cVar.d(solverVariable2, i15);
                return;
            }
            for (int i19 = 0; i19 < this.f10896t0; i19++) {
                ConstraintWidget constraintWidget = this.f10895s0[i19];
                if (this.f4283v0 || constraintWidget.d()) {
                    int i20 = this.f4282u0;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (i20 != 0) {
                    }
                    if (constraintWidget.V[0] == dimensionBehaviour && constraintWidget.K.f4224f != null && constraintWidget.M.f4224f != null) {
                        z11 = true;
                        break;
                    }
                    if ((i20 == 2 || i20 == 3) && constraintWidget.V[1] == dimensionBehaviour && constraintWidget.L.f4224f != null && constraintWidget.N.f4224f != null) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            if (!constraintAnchor2.g() && !constraintAnchor4.g()) {
                z12 = false;
                if (!constraintAnchor3.g() && !constraintAnchor5.g()) {
                    z13 = false;
                    if (z11 && (((i14 = this.f4282u0) == 0 && z12) || ((i14 == 2 && z13) || ((i14 == 1 && z12) || (i14 == 3 && z13))))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        i10 = 4;
                    } else {
                        i10 = 5;
                    }
                    i11 = 0;
                    while (i11 < this.f10896t0) {
                        ConstraintWidget constraintWidget2 = this.f10895s0[i11];
                        if (this.f4283v0 || constraintWidget2.d()) {
                            SolverVariable l2 = cVar.l(constraintWidget2.S[this.f4282u0]);
                            int i21 = this.f4282u0;
                            ConstraintAnchor constraintAnchor8 = constraintWidget2.S[i21];
                            constraintAnchor8.f4227i = l2;
                            ConstraintAnchor constraintAnchor9 = constraintAnchor8.f4224f;
                            if (constraintAnchor9 != null && constraintAnchor9.f4222d == this) {
                                i13 = constraintAnchor8.f4225g + 0;
                            } else {
                                i13 = 0;
                            }
                            if (i21 != 0 && i21 != i16) {
                                androidx.constraintlayout.core.b m10 = cVar.m();
                                SolverVariable n = cVar.n();
                                n.f4173l = 0;
                                m10.c(constraintAnchor7.f4227i, l2, n, this.f4284w0 + i13);
                                cVar.c(m10);
                                cVar.e(constraintAnchor7.f4227i, l2, this.f4284w0 + i13, i10);
                            }
                            androidx.constraintlayout.core.b m11 = cVar.m();
                            SolverVariable n10 = cVar.n();
                            n10.f4173l = 0;
                            m11.d(constraintAnchor7.f4227i, l2, n10, this.f4284w0 - i13);
                            cVar.c(m11);
                            cVar.e(constraintAnchor7.f4227i, l2, this.f4284w0 + i13, i10);
                        }
                        i11++;
                        i16 = 2;
                    }
                    i12 = this.f4282u0;
                    if (i12 != 0) {
                        cVar.e(constraintAnchor4.f4227i, constraintAnchor2.f4227i, 0, 8);
                        cVar.e(constraintAnchor2.f4227i, this.W.M.f4227i, 0, 4);
                        solverVariable = constraintAnchor2.f4227i;
                        constraintAnchor = this.W.K;
                    } else if (i12 == 1) {
                        cVar.e(constraintAnchor2.f4227i, constraintAnchor4.f4227i, 0, 8);
                        cVar.e(constraintAnchor2.f4227i, this.W.K.f4227i, 0, 4);
                        solverVariable = constraintAnchor2.f4227i;
                        constraintAnchor = this.W.M;
                    } else if (i12 == 2) {
                        cVar.e(constraintAnchor5.f4227i, constraintAnchor3.f4227i, 0, 8);
                        cVar.e(constraintAnchor3.f4227i, this.W.N.f4227i, 0, 4);
                        solverVariable = constraintAnchor3.f4227i;
                        constraintAnchor = this.W.L;
                    } else if (i12 == 3) {
                        cVar.e(constraintAnchor3.f4227i, constraintAnchor5.f4227i, 0, 8);
                        cVar.e(constraintAnchor3.f4227i, this.W.L.f4227i, 0, 4);
                        solverVariable = constraintAnchor3.f4227i;
                        constraintAnchor = this.W.N;
                    } else {
                        return;
                    }
                    cVar.e(solverVariable, constraintAnchor.f4227i, 0, 0);
                }
                z13 = true;
                if (z11) {
                }
                z14 = false;
                if (z14) {
                }
                i11 = 0;
                while (i11 < this.f10896t0) {
                }
                i12 = this.f4282u0;
                if (i12 != 0) {
                }
                cVar.e(solverVariable, constraintAnchor.f4227i, 0, 0);
            }
            z12 = true;
            if (!constraintAnchor3.g()) {
                z13 = false;
                if (z11) {
                }
                z14 = false;
                if (z14) {
                }
                i11 = 0;
                while (i11 < this.f10896t0) {
                }
                i12 = this.f4282u0;
                if (i12 != 0) {
                }
                cVar.e(solverVariable, constraintAnchor.f4227i, 0, 0);
            }
            z13 = true;
            if (z11) {
            }
            z14 = false;
            if (z14) {
            }
            i11 = 0;
            while (i11 < this.f10896t0) {
            }
            i12 = this.f4282u0;
            if (i12 != 0) {
            }
            cVar.e(solverVariable, constraintAnchor.f4227i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean d() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final String toString() {
        String k3 = androidx.activity.e.k(new StringBuilder("[Barrier] "), this.f4255k0, " {");
        for (int i10 = 0; i10 < this.f10896t0; i10++) {
            ConstraintWidget constraintWidget = this.f10895s0[i10];
            if (i10 > 0) {
                k3 = a4.b.l(k3, ", ");
            }
            k3 = k3 + constraintWidget.f4255k0;
        }
        return a4.b.l(k3, "}");
    }
}
