package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends ConstraintWidget {

    /* renamed from: s0  reason: collision with root package name */
    public float f4363s0 = -1.0f;

    /* renamed from: t0  reason: collision with root package name */
    public int f4364t0 = -1;

    /* renamed from: u0  reason: collision with root package name */
    public int f4365u0 = -1;

    /* renamed from: v0  reason: collision with root package name */
    public ConstraintAnchor f4366v0 = this.L;

    /* renamed from: w0  reason: collision with root package name */
    public int f4367w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f4368x0;

    public f() {
        this.T.clear();
        this.T.add(this.f4366v0);
        int length = this.S.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.S[i10] = this.f4366v0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean A() {
        return this.f4368x0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean B() {
        return this.f4368x0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void P(androidx.constraintlayout.core.c cVar, boolean z10) {
        if (this.W == null) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.f4366v0;
        cVar.getClass();
        int o10 = androidx.constraintlayout.core.c.o(constraintAnchor);
        if (this.f4367w0 == 1) {
            this.f4239b0 = o10;
            this.c0 = 0;
            K(this.W.l());
            N(0);
            return;
        }
        this.f4239b0 = 0;
        this.c0 = o10;
        N(this.W.q());
        K(0);
    }

    public final void Q(int i10) {
        if (this.f4367w0 == i10) {
            return;
        }
        this.f4367w0 = i10;
        ArrayList<ConstraintAnchor> arrayList = this.T;
        arrayList.clear();
        this.f4366v0 = this.f4367w0 == 1 ? this.K : this.L;
        arrayList.add(this.f4366v0);
        ConstraintAnchor[] constraintAnchorArr = this.S;
        int length = constraintAnchorArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            constraintAnchorArr[i11] = this.f4366v0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void c(androidx.constraintlayout.core.c cVar, boolean z10) {
        boolean z11;
        d dVar = (d) this.W;
        if (dVar == null) {
            return;
        }
        Object j2 = dVar.j(ConstraintAnchor.Type.LEFT);
        Object j10 = dVar.j(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.W;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z12 = true;
        if (constraintWidget != null && constraintWidget.V[0] == dimensionBehaviour) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f4367w0 == 0) {
            j2 = dVar.j(ConstraintAnchor.Type.TOP);
            j10 = dVar.j(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.W;
            if (constraintWidget2 == null || constraintWidget2.V[1] != dimensionBehaviour) {
                z12 = false;
            }
            z11 = z12;
        }
        if (this.f4368x0) {
            ConstraintAnchor constraintAnchor = this.f4366v0;
            if (constraintAnchor.c) {
                SolverVariable l2 = cVar.l(constraintAnchor);
                cVar.d(l2, this.f4366v0.d());
                if (this.f4364t0 != -1) {
                    if (z11) {
                        cVar.f(cVar.l(j10), l2, 0, 5);
                    }
                } else if (this.f4365u0 != -1 && z11) {
                    SolverVariable l4 = cVar.l(j10);
                    cVar.f(l2, cVar.l(j2), 0, 5);
                    cVar.f(l4, l2, 0, 5);
                }
                this.f4368x0 = false;
                return;
            }
        }
        if (this.f4364t0 != -1) {
            SolverVariable l7 = cVar.l(this.f4366v0);
            cVar.e(l7, cVar.l(j2), this.f4364t0, 8);
            if (z11) {
                cVar.f(cVar.l(j10), l7, 0, 5);
            }
        } else if (this.f4365u0 != -1) {
            SolverVariable l10 = cVar.l(this.f4366v0);
            SolverVariable l11 = cVar.l(j10);
            cVar.e(l10, l11, -this.f4365u0, 8);
            if (z11) {
                cVar.f(l10, cVar.l(j2), 0, 5);
                cVar.f(l11, l10, 0, 5);
            }
        } else if (this.f4363s0 != -1.0f) {
            SolverVariable l12 = cVar.l(this.f4366v0);
            SolverVariable l13 = cVar.l(j10);
            float f10 = this.f4363s0;
            androidx.constraintlayout.core.b m10 = cVar.m();
            m10.f4197d.g(l12, -1.0f);
            m10.f4197d.g(l13, f10);
            cVar.c(m10);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean d() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final ConstraintAnchor j(ConstraintAnchor.Type type) {
        int ordinal = type.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f4367w0 == 0) {
                return this.f4366v0;
            }
            return null;
        }
        if (this.f4367w0 == 1) {
            return this.f4366v0;
        }
        return null;
    }
}
