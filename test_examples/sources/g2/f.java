package g2;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import g2.b;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a f11213a = new b.a();

    /* JADX WARN: Removed duplicated region for block: B:52:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(ConstraintWidget constraintWidget) {
        androidx.constraintlayout.core.widgets.d dVar;
        boolean z10;
        boolean z11;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
        ConstraintWidget constraintWidget2 = constraintWidget.W;
        if (constraintWidget2 != null) {
            dVar = (androidx.constraintlayout.core.widgets.d) constraintWidget2;
        } else {
            dVar = null;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar.V[0];
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dVar.V[1];
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour3 && !constraintWidget.A() && dimensionBehaviour != dimensionBehaviour7 && ((dimensionBehaviour != dimensionBehaviour6 || constraintWidget.f4269s != 0 || constraintWidget.Z != 0.0f || !constraintWidget.t(0)) && (dimensionBehaviour != dimensionBehaviour6 || constraintWidget.f4269s != 1 || !constraintWidget.u(0, constraintWidget.q())))) {
            z10 = false;
            if (dimensionBehaviour2 != dimensionBehaviour3 && !constraintWidget.B() && dimensionBehaviour2 != dimensionBehaviour7 && ((dimensionBehaviour2 != dimensionBehaviour6 || constraintWidget.f4270t != 0 || constraintWidget.Z != 0.0f || !constraintWidget.t(1)) && (dimensionBehaviour2 != dimensionBehaviour6 || constraintWidget.f4270t != 1 || !constraintWidget.u(1, constraintWidget.l())))) {
                z11 = false;
                if (constraintWidget.Z <= 0.0f && (z10 || z11)) {
                    return true;
                }
                if (!z10 && z11) {
                    return true;
                }
            }
            z11 = true;
            if (constraintWidget.Z <= 0.0f) {
            }
            return !z10 ? false : false;
        }
        z10 = true;
        if (dimensionBehaviour2 != dimensionBehaviour3) {
            z11 = false;
            if (constraintWidget.Z <= 0.0f) {
            }
            if (!z10) {
            }
        }
        z11 = true;
        if (constraintWidget.Z <= 0.0f) {
        }
        if (!z10) {
        }
    }

    public static void b(int i10, ConstraintWidget constraintWidget, b.InterfaceC0121b interfaceC0121b, boolean z10) {
        boolean z11;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        Iterator<ConstraintAnchor> it;
        boolean z12;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.n) {
            return;
        }
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.z() && a(constraintWidget)) {
            androidx.constraintlayout.core.widgets.d.U(constraintWidget, interfaceC0121b, new b.a());
        }
        ConstraintAnchor j2 = constraintWidget.j(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor j10 = constraintWidget.j(ConstraintAnchor.Type.RIGHT);
        int d5 = j2.d();
        int d10 = j10.d();
        HashSet<ConstraintAnchor> hashSet = j2.f4220a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (hashSet != null && j2.c) {
            Iterator<ConstraintAnchor> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next = it2.next();
                ConstraintWidget constraintWidget2 = next.f4222d;
                int i11 = i10 + 1;
                boolean a10 = a(constraintWidget2);
                if (constraintWidget2.z() && a10) {
                    androidx.constraintlayout.core.widgets.d.U(constraintWidget2, interfaceC0121b, new b.a());
                }
                ConstraintAnchor constraintAnchor5 = constraintWidget2.K;
                ConstraintAnchor constraintAnchor6 = constraintWidget2.M;
                if ((next == constraintAnchor5 && (constraintAnchor4 = constraintAnchor6.f4224f) != null && constraintAnchor4.c) || (next == constraintAnchor6 && (constraintAnchor3 = constraintAnchor5.f4224f) != null && constraintAnchor3.c)) {
                    it = it2;
                    z12 = true;
                } else {
                    it = it2;
                    z12 = false;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.V[0];
                if (dimensionBehaviour2 == dimensionBehaviour && !a10) {
                    if (dimensionBehaviour2 == dimensionBehaviour && constraintWidget2.f4273w >= 0 && constraintWidget2.f4272v >= 0 && ((constraintWidget2.f4253j0 == 8 || (constraintWidget2.f4269s == 0 && constraintWidget2.Z == 0.0f)) && !constraintWidget2.x() && !constraintWidget2.H && z12 && !constraintWidget2.x())) {
                        d(i11, constraintWidget, interfaceC0121b, constraintWidget2, z10);
                    }
                    it2 = it;
                }
                if (!constraintWidget2.z()) {
                    if (next == constraintAnchor5 && constraintAnchor6.f4224f == null) {
                        int e10 = constraintAnchor5.e() + d5;
                        constraintWidget2.I(e10, constraintWidget2.q() + e10);
                    } else if (next == constraintAnchor6 && constraintAnchor5.f4224f == null) {
                        int e11 = d5 - constraintAnchor6.e();
                        constraintWidget2.I(e11 - constraintWidget2.q(), e11);
                    } else if (z12 && !constraintWidget2.x()) {
                        c(i11, constraintWidget2, interfaceC0121b, z10);
                    }
                    b(i11, constraintWidget2, interfaceC0121b, z10);
                }
                it2 = it;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = j10.f4220a;
        if (hashSet2 != null && j10.c) {
            Iterator<ConstraintAnchor> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintAnchor next2 = it3.next();
                ConstraintWidget constraintWidget3 = next2.f4222d;
                int i12 = i10 + 1;
                boolean a11 = a(constraintWidget3);
                if (constraintWidget3.z() && a11) {
                    androidx.constraintlayout.core.widgets.d.U(constraintWidget3, interfaceC0121b, new b.a());
                }
                ConstraintAnchor constraintAnchor7 = constraintWidget3.K;
                ConstraintAnchor constraintAnchor8 = constraintWidget3.M;
                if ((next2 == constraintAnchor7 && (constraintAnchor2 = constraintAnchor8.f4224f) != null && constraintAnchor2.c) || (next2 == constraintAnchor8 && (constraintAnchor = constraintAnchor7.f4224f) != null && constraintAnchor.c)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.V[0];
                if (dimensionBehaviour3 == dimensionBehaviour && !a11) {
                    if (dimensionBehaviour3 == dimensionBehaviour && constraintWidget3.f4273w >= 0 && constraintWidget3.f4272v >= 0) {
                        if (constraintWidget3.f4253j0 != 8) {
                            if (constraintWidget3.f4269s == 0) {
                                if (constraintWidget3.Z == 0.0f) {
                                }
                            }
                        }
                        if (!constraintWidget3.x() && !constraintWidget3.H && z11 && !constraintWidget3.x()) {
                            d(i12, constraintWidget, interfaceC0121b, constraintWidget3, z10);
                        }
                    }
                }
                if (!constraintWidget3.z()) {
                    if (next2 == constraintAnchor7 && constraintAnchor8.f4224f == null) {
                        int e12 = constraintAnchor7.e() + d10;
                        constraintWidget3.I(e12, constraintWidget3.q() + e12);
                    } else if (next2 == constraintAnchor8 && constraintAnchor7.f4224f == null) {
                        int e13 = d10 - constraintAnchor8.e();
                        constraintWidget3.I(e13 - constraintWidget3.q(), e13);
                    } else if (z11 && !constraintWidget3.x()) {
                        c(i12, constraintWidget3, interfaceC0121b, z10);
                    }
                    b(i12, constraintWidget3, interfaceC0121b, z10);
                }
            }
        }
        constraintWidget.n = true;
    }

    public static void c(int i10, ConstraintWidget constraintWidget, b.InterfaceC0121b interfaceC0121b, boolean z10) {
        float f10;
        float f11 = constraintWidget.f4247g0;
        ConstraintAnchor constraintAnchor = constraintWidget.K;
        int d5 = constraintAnchor.f4224f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.M;
        int d10 = constraintAnchor2.f4224f.d();
        int e10 = constraintAnchor.e() + d5;
        int e11 = d10 - constraintAnchor2.e();
        if (d5 == d10) {
            f11 = 0.5f;
        } else {
            d5 = e10;
            d10 = e11;
        }
        int q10 = constraintWidget.q();
        int i11 = (d10 - d5) - q10;
        if (d5 > d10) {
            i11 = (d5 - d10) - q10;
        }
        if (i11 > 0) {
            f10 = (f11 * i11) + 0.5f;
        } else {
            f10 = f11 * i11;
        }
        int i12 = ((int) f10) + d5;
        int i13 = i12 + q10;
        if (d5 > d10) {
            i13 = i12 - q10;
        }
        constraintWidget.I(i12, i13);
        b(i10 + 1, constraintWidget, interfaceC0121b, z10);
    }

    public static void d(int i10, ConstraintWidget constraintWidget, b.InterfaceC0121b interfaceC0121b, ConstraintWidget constraintWidget2, boolean z10) {
        float f10 = constraintWidget2.f4247g0;
        ConstraintAnchor constraintAnchor = constraintWidget2.K;
        int e10 = constraintAnchor.e() + constraintAnchor.f4224f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.M;
        int d5 = constraintAnchor2.f4224f.d() - constraintAnchor2.e();
        if (d5 >= e10) {
            int q10 = constraintWidget2.q();
            if (constraintWidget2.f4253j0 != 8) {
                int i11 = constraintWidget2.f4269s;
                if (i11 == 2) {
                    if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d)) {
                        constraintWidget = constraintWidget.W;
                    }
                    q10 = (int) (constraintWidget2.f4247g0 * 0.5f * constraintWidget.q());
                } else if (i11 == 0) {
                    q10 = d5 - e10;
                }
                q10 = Math.max(constraintWidget2.f4272v, q10);
                int i12 = constraintWidget2.f4273w;
                if (i12 > 0) {
                    q10 = Math.min(i12, q10);
                }
            }
            int i13 = e10 + ((int) ((f10 * ((d5 - e10) - q10)) + 0.5f));
            constraintWidget2.I(i13, q10 + i13);
            b(i10 + 1, constraintWidget2, interfaceC0121b, z10);
        }
    }

    public static void e(int i10, ConstraintWidget constraintWidget, b.InterfaceC0121b interfaceC0121b) {
        float f10;
        float f11 = constraintWidget.f4249h0;
        ConstraintAnchor constraintAnchor = constraintWidget.L;
        int d5 = constraintAnchor.f4224f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.N;
        int d10 = constraintAnchor2.f4224f.d();
        int e10 = constraintAnchor.e() + d5;
        int e11 = d10 - constraintAnchor2.e();
        if (d5 == d10) {
            f11 = 0.5f;
        } else {
            d5 = e10;
            d10 = e11;
        }
        int l2 = constraintWidget.l();
        int i11 = (d10 - d5) - l2;
        if (d5 > d10) {
            i11 = (d5 - d10) - l2;
        }
        if (i11 > 0) {
            f10 = (f11 * i11) + 0.5f;
        } else {
            f10 = f11 * i11;
        }
        int i12 = (int) f10;
        int i13 = d5 + i12;
        int i14 = i13 + l2;
        if (d5 > d10) {
            i13 = d5 - i12;
            i14 = i13 - l2;
        }
        constraintWidget.J(i13, i14);
        g(i10 + 1, constraintWidget, interfaceC0121b);
    }

    public static void f(int i10, ConstraintWidget constraintWidget, b.InterfaceC0121b interfaceC0121b, ConstraintWidget constraintWidget2) {
        float f10 = constraintWidget2.f4249h0;
        ConstraintAnchor constraintAnchor = constraintWidget2.L;
        int e10 = constraintAnchor.e() + constraintAnchor.f4224f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.N;
        int d5 = constraintAnchor2.f4224f.d() - constraintAnchor2.e();
        if (d5 >= e10) {
            int l2 = constraintWidget2.l();
            if (constraintWidget2.f4253j0 != 8) {
                int i11 = constraintWidget2.f4270t;
                if (i11 == 2) {
                    if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d)) {
                        constraintWidget = constraintWidget.W;
                    }
                    l2 = (int) (f10 * 0.5f * constraintWidget.l());
                } else if (i11 == 0) {
                    l2 = d5 - e10;
                }
                l2 = Math.max(constraintWidget2.f4275y, l2);
                int i12 = constraintWidget2.f4276z;
                if (i12 > 0) {
                    l2 = Math.min(i12, l2);
                }
            }
            int i13 = e10 + ((int) ((f10 * ((d5 - e10) - l2)) + 0.5f));
            constraintWidget2.J(i13, l2 + i13);
            g(i10 + 1, constraintWidget2, interfaceC0121b);
        }
    }

    public static void g(int i10, ConstraintWidget constraintWidget, b.InterfaceC0121b interfaceC0121b) {
        ConstraintAnchor constraintAnchor;
        boolean z10;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        boolean z11;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        if (constraintWidget.f4261o) {
            return;
        }
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.z() && a(constraintWidget)) {
            androidx.constraintlayout.core.widgets.d.U(constraintWidget, interfaceC0121b, new b.a());
        }
        ConstraintAnchor j2 = constraintWidget.j(ConstraintAnchor.Type.TOP);
        ConstraintAnchor j10 = constraintWidget.j(ConstraintAnchor.Type.BOTTOM);
        int d5 = j2.d();
        int d10 = j10.d();
        HashSet<ConstraintAnchor> hashSet = j2.f4220a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (hashSet != null && j2.c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f4222d;
                int i11 = i10 + 1;
                boolean a10 = a(constraintWidget2);
                if (constraintWidget2.z() && a10) {
                    androidx.constraintlayout.core.widgets.d.U(constraintWidget2, interfaceC0121b, new b.a());
                }
                ConstraintAnchor constraintAnchor6 = constraintWidget2.L;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.N;
                if ((next == constraintAnchor6 && (constraintAnchor5 = constraintAnchor7.f4224f) != null && constraintAnchor5.c) || (next == constraintAnchor7 && (constraintAnchor4 = constraintAnchor6.f4224f) != null && constraintAnchor4.c)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.V[1];
                if (dimensionBehaviour2 == dimensionBehaviour && !a10) {
                    if (dimensionBehaviour2 == dimensionBehaviour && constraintWidget2.f4276z >= 0 && constraintWidget2.f4275y >= 0 && (constraintWidget2.f4253j0 == 8 || (constraintWidget2.f4270t == 0 && constraintWidget2.Z == 0.0f))) {
                        if (!constraintWidget2.y() && !constraintWidget2.H && z11 && !constraintWidget2.y()) {
                            f(i11, constraintWidget, interfaceC0121b, constraintWidget2);
                        }
                    }
                }
                if (!constraintWidget2.z()) {
                    if (next == constraintAnchor6 && constraintAnchor7.f4224f == null) {
                        int e10 = constraintAnchor6.e() + d5;
                        constraintWidget2.J(e10, constraintWidget2.l() + e10);
                    } else if (next == constraintAnchor7 && constraintAnchor6.f4224f == null) {
                        int e11 = d5 - constraintAnchor7.e();
                        constraintWidget2.J(e11 - constraintWidget2.l(), e11);
                    } else if (z11 && !constraintWidget2.y()) {
                        e(i11, constraintWidget2, interfaceC0121b);
                    }
                    g(i11, constraintWidget2, interfaceC0121b);
                }
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = j10.f4220a;
        if (hashSet2 != null && j10.c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f4222d;
                int i12 = i10 + 1;
                boolean a11 = a(constraintWidget3);
                if (constraintWidget3.z() && a11) {
                    androidx.constraintlayout.core.widgets.d.U(constraintWidget3, interfaceC0121b, new b.a());
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget3.L;
                ConstraintAnchor constraintAnchor9 = constraintWidget3.N;
                if ((next2 == constraintAnchor8 && (constraintAnchor3 = constraintAnchor9.f4224f) != null && constraintAnchor3.c) || (next2 == constraintAnchor9 && (constraintAnchor2 = constraintAnchor8.f4224f) != null && constraintAnchor2.c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.V[1];
                if (dimensionBehaviour3 == dimensionBehaviour && !a11) {
                    if (dimensionBehaviour3 == dimensionBehaviour && constraintWidget3.f4276z >= 0 && constraintWidget3.f4275y >= 0) {
                        if (constraintWidget3.f4253j0 != 8) {
                            if (constraintWidget3.f4270t == 0) {
                                if (constraintWidget3.Z == 0.0f) {
                                }
                            }
                        }
                        if (!constraintWidget3.y() && !constraintWidget3.H && z10 && !constraintWidget3.y()) {
                            f(i12, constraintWidget, interfaceC0121b, constraintWidget3);
                        }
                    }
                }
                if (!constraintWidget3.z()) {
                    if (next2 == constraintAnchor8 && constraintAnchor9.f4224f == null) {
                        int e12 = constraintAnchor8.e() + d10;
                        constraintWidget3.J(e12, constraintWidget3.l() + e12);
                    } else if (next2 == constraintAnchor9 && constraintAnchor8.f4224f == null) {
                        int e13 = d10 - constraintAnchor9.e();
                        constraintWidget3.J(e13 - constraintWidget3.l(), e13);
                    } else if (z10 && !constraintWidget3.y()) {
                        e(i12, constraintWidget3, interfaceC0121b);
                    }
                    g(i12, constraintWidget3, interfaceC0121b);
                }
            }
        }
        ConstraintAnchor j11 = constraintWidget.j(ConstraintAnchor.Type.BASELINE);
        if (j11.f4220a != null && j11.c) {
            int d11 = j11.d();
            Iterator<ConstraintAnchor> it3 = j11.f4220a.iterator();
            while (it3.hasNext()) {
                ConstraintAnchor next3 = it3.next();
                ConstraintWidget constraintWidget4 = next3.f4222d;
                int i13 = i10 + 1;
                boolean a12 = a(constraintWidget4);
                if (constraintWidget4.z() && a12) {
                    androidx.constraintlayout.core.widgets.d.U(constraintWidget4, interfaceC0121b, new b.a());
                }
                if (constraintWidget4.V[1] != dimensionBehaviour || a12) {
                    if (!constraintWidget4.z() && next3 == (constraintAnchor = constraintWidget4.O)) {
                        int e14 = next3.e() + d11;
                        if (constraintWidget4.F) {
                            int i14 = e14 - constraintWidget4.f4241d0;
                            int i15 = constraintWidget4.Y + i14;
                            constraintWidget4.c0 = i14;
                            constraintWidget4.L.l(i14);
                            constraintWidget4.N.l(i15);
                            constraintAnchor.l(e14);
                            constraintWidget4.f4258m = true;
                        }
                        g(i13, constraintWidget4, interfaceC0121b);
                    }
                }
            }
        }
        constraintWidget.f4261o = true;
    }
}
