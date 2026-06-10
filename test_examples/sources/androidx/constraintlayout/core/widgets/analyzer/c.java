package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends WidgetRun {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f4318k = new int[2];

    public c(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f4311h.f4289e = DependencyNode.Type.LEFT;
        this.f4312i.f4289e = DependencyNode.Type.RIGHT;
        this.f4309f = 0;
    }

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else if (i14 != 1) {
                return;
            } else {
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, g2.d
    public final void a(g2.d dVar) {
        float f10;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int g10;
        float f11;
        int g11;
        float f12;
        int i11;
        int i12;
        a aVar;
        int g12;
        float f13;
        int g13;
        float f14;
        int i13;
        float f15;
        if (this.f4313j.ordinal() != 3) {
            a aVar2 = this.f4308e;
            boolean z14 = aVar2.f4294j;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            DependencyNode dependencyNode = this.f4311h;
            DependencyNode dependencyNode2 = this.f4312i;
            if (!z14 && this.f4307d == dimensionBehaviour) {
                ConstraintWidget constraintWidget = this.f4306b;
                int i14 = constraintWidget.f4269s;
                if (i14 != 2) {
                    if (i14 == 3) {
                        int i15 = constraintWidget.f4270t;
                        if (i15 != 0 && i15 != 3) {
                            int i16 = constraintWidget.f4237a0;
                            if (i16 != -1) {
                                if (i16 != 0) {
                                    if (i16 != 1) {
                                        i10 = 0;
                                    }
                                } else {
                                    f15 = constraintWidget.f4242e.f4308e.f4291g / constraintWidget.Z;
                                    f10 = f15 + 0.5f;
                                    i10 = (int) f10;
                                }
                            }
                            f15 = constraintWidget.f4242e.f4308e.f4291g * constraintWidget.Z;
                            f10 = f15 + 0.5f;
                            i10 = (int) f10;
                        }
                        d dVar2 = constraintWidget.f4242e;
                        DependencyNode dependencyNode3 = dVar2.f4311h;
                        DependencyNode dependencyNode4 = dVar2.f4312i;
                        if (constraintWidget.K.f4224f != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (constraintWidget.L.f4224f != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (constraintWidget.M.f4224f != null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (constraintWidget.N.f4224f != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        int i17 = constraintWidget.f4237a0;
                        if (z10 && z11 && z12 && z13) {
                            float f16 = constraintWidget.Z;
                            boolean z15 = dependencyNode3.f4294j;
                            int[] iArr = f4318k;
                            if (z15 && dependencyNode4.f4294j) {
                                if (dependencyNode.c && dependencyNode2.c) {
                                    m(iArr, ((DependencyNode) dependencyNode.f4296l.get(0)).f4291g + dependencyNode.f4290f, ((DependencyNode) dependencyNode2.f4296l.get(0)).f4291g - dependencyNode2.f4290f, dependencyNode3.f4291g + dependencyNode3.f4290f, dependencyNode4.f4291g - dependencyNode4.f4290f, f16, i17);
                                    aVar2.d(iArr[0]);
                                    this.f4306b.f4242e.f4308e.d(iArr[1]);
                                    return;
                                }
                                return;
                            }
                            boolean z16 = dependencyNode.f4294j;
                            ArrayList arrayList = dependencyNode3.f4296l;
                            if (z16 && dependencyNode2.f4294j) {
                                if (dependencyNode3.c && dependencyNode4.c) {
                                    m(iArr, dependencyNode.f4291g + dependencyNode.f4290f, dependencyNode2.f4291g - dependencyNode2.f4290f, ((DependencyNode) arrayList.get(0)).f4291g + dependencyNode3.f4290f, ((DependencyNode) dependencyNode4.f4296l.get(0)).f4291g - dependencyNode4.f4290f, f16, i17);
                                    aVar2.d(iArr[0]);
                                    this.f4306b.f4242e.f4308e.d(iArr[1]);
                                }
                                return;
                            }
                            if (dependencyNode.c && dependencyNode2.c && dependencyNode3.c && dependencyNode4.c) {
                                m(iArr, ((DependencyNode) dependencyNode.f4296l.get(0)).f4291g + dependencyNode.f4290f, ((DependencyNode) dependencyNode2.f4296l.get(0)).f4291g - dependencyNode2.f4290f, ((DependencyNode) arrayList.get(0)).f4291g + dependencyNode3.f4290f, ((DependencyNode) dependencyNode4.f4296l.get(0)).f4291g - dependencyNode4.f4290f, f16, i17);
                                aVar2.d(iArr[0]);
                                aVar = this.f4306b.f4242e.f4308e;
                                i12 = iArr[1];
                            }
                            return;
                        } else if (z10 && z12) {
                            if (dependencyNode.c && dependencyNode2.c) {
                                float f17 = constraintWidget.Z;
                                int i18 = ((DependencyNode) dependencyNode.f4296l.get(0)).f4291g + dependencyNode.f4290f;
                                int i19 = ((DependencyNode) dependencyNode2.f4296l.get(0)).f4291g - dependencyNode2.f4290f;
                                if (i17 != -1 && i17 != 0) {
                                    if (i17 == 1) {
                                        g12 = g(i19 - i18, 0);
                                        int i20 = (int) ((g12 / f17) + 0.5f);
                                        i13 = g(i20, 1);
                                        if (i20 != i13) {
                                            f14 = i13 * f17;
                                            g13 = i13;
                                            f13 = 0.5f;
                                        }
                                        aVar2.d(g12);
                                        this.f4306b.f4242e.f4308e.d(i13);
                                    }
                                } else {
                                    g12 = g(i19 - i18, 0);
                                    f13 = 0.5f;
                                    int i21 = (int) ((g12 * f17) + 0.5f);
                                    g13 = g(i21, 1);
                                    if (i21 != g13) {
                                        f14 = g13 / f17;
                                    }
                                    i13 = g13;
                                    aVar2.d(g12);
                                    this.f4306b.f4242e.f4308e.d(i13);
                                }
                                g12 = (int) (f14 + f13);
                                i13 = g13;
                                aVar2.d(g12);
                                this.f4306b.f4242e.f4308e.d(i13);
                            }
                            return;
                        } else if (z11 && z13) {
                            if (dependencyNode3.c && dependencyNode4.c) {
                                float f18 = constraintWidget.Z;
                                int i22 = ((DependencyNode) dependencyNode3.f4296l.get(0)).f4291g + dependencyNode3.f4290f;
                                int i23 = ((DependencyNode) dependencyNode4.f4296l.get(0)).f4291g - dependencyNode4.f4290f;
                                if (i17 != -1) {
                                    if (i17 != 0) {
                                        if (i17 != 1) {
                                        }
                                    } else {
                                        int g14 = g(i23 - i22, 1);
                                        int i24 = (int) ((g14 * f18) + 0.5f);
                                        i11 = g(i24, 0);
                                        if (i24 != i11) {
                                            f12 = i11 / f18;
                                            g11 = i11;
                                            f11 = 0.5f;
                                            g10 = (int) (f12 + f11);
                                            i12 = g10;
                                            i11 = g11;
                                            aVar2.d(i11);
                                            aVar = this.f4306b.f4242e.f4308e;
                                        } else {
                                            i12 = g14;
                                            aVar2.d(i11);
                                            aVar = this.f4306b.f4242e.f4308e;
                                        }
                                    }
                                }
                                g10 = g(i23 - i22, 1);
                                f11 = 0.5f;
                                int i25 = (int) ((g10 / f18) + 0.5f);
                                g11 = g(i25, 0);
                                if (i25 != g11) {
                                    f12 = g11 * f18;
                                    g10 = (int) (f12 + f11);
                                }
                                i12 = g10;
                                i11 = g11;
                                aVar2.d(i11);
                                aVar = this.f4306b.f4242e.f4308e;
                            }
                            return;
                        }
                        aVar.d(i12);
                    }
                } else {
                    ConstraintWidget constraintWidget2 = constraintWidget.W;
                    if (constraintWidget2 != null) {
                        a aVar3 = constraintWidget2.f4240d.f4308e;
                        if (aVar3.f4294j) {
                            f10 = (aVar3.f4291g * constraintWidget.f4274x) + 0.5f;
                            i10 = (int) f10;
                        }
                    }
                }
                aVar2.d(i10);
            }
            if (dependencyNode.c && dependencyNode2.c) {
                if (dependencyNode.f4294j && dependencyNode2.f4294j && aVar2.f4294j) {
                    return;
                }
                boolean z17 = aVar2.f4294j;
                ArrayList arrayList2 = dependencyNode.f4296l;
                ArrayList arrayList3 = dependencyNode2.f4296l;
                if (!z17 && this.f4307d == dimensionBehaviour) {
                    ConstraintWidget constraintWidget3 = this.f4306b;
                    if (constraintWidget3.f4269s == 0 && !constraintWidget3.x()) {
                        int i26 = ((DependencyNode) arrayList2.get(0)).f4291g + dependencyNode.f4290f;
                        int i27 = ((DependencyNode) arrayList3.get(0)).f4291g + dependencyNode2.f4290f;
                        dependencyNode.d(i26);
                        dependencyNode2.d(i27);
                        aVar2.d(i27 - i26);
                        return;
                    }
                }
                if (!aVar2.f4294j && this.f4307d == dimensionBehaviour && this.f4305a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((DependencyNode) arrayList3.get(0)).f4291g + dependencyNode2.f4290f) - (((DependencyNode) arrayList2.get(0)).f4291g + dependencyNode.f4290f), aVar2.f4317m);
                    ConstraintWidget constraintWidget4 = this.f4306b;
                    int i28 = constraintWidget4.f4273w;
                    int max = Math.max(constraintWidget4.f4272v, min);
                    if (i28 > 0) {
                        max = Math.min(i28, max);
                    }
                    aVar2.d(max);
                }
                if (!aVar2.f4294j) {
                    return;
                }
                DependencyNode dependencyNode5 = (DependencyNode) arrayList2.get(0);
                DependencyNode dependencyNode6 = (DependencyNode) arrayList3.get(0);
                int i29 = dependencyNode5.f4291g;
                int i30 = dependencyNode.f4290f + i29;
                int i31 = dependencyNode6.f4291g;
                int i32 = dependencyNode2.f4290f + i31;
                float f19 = this.f4306b.f4247g0;
                if (dependencyNode5 == dependencyNode6) {
                    f19 = 0.5f;
                } else {
                    i29 = i30;
                    i31 = i32;
                }
                dependencyNode.d((int) ((((i31 - i29) - aVar2.f4291g) * f19) + i29 + 0.5f));
                dependencyNode2.d(dependencyNode.f4291g + aVar2.f4291g);
                return;
            }
            return;
        }
        ConstraintWidget constraintWidget5 = this.f4306b;
        l(constraintWidget5.K, constraintWidget5.M, 0);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget constraintWidget3;
        ConstraintAnchor constraintAnchor;
        ArrayList arrayList;
        ConstraintWidget constraintWidget4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget constraintWidget5 = this.f4306b;
        boolean z10 = constraintWidget5.f4236a;
        a aVar = this.f4308e;
        if (z10) {
            aVar.d(constraintWidget5.q());
        }
        boolean z11 = aVar.f4294j;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        DependencyNode dependencyNode = this.f4312i;
        DependencyNode dependencyNode2 = this.f4311h;
        if (!z11) {
            ConstraintWidget constraintWidget6 = this.f4306b;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidget6.V[0];
            this.f4307d = dimensionBehaviour6;
            if (dimensionBehaviour6 != dimensionBehaviour3) {
                if (dimensionBehaviour6 == dimensionBehaviour4 && (constraintWidget4 = constraintWidget6.W) != null && ((dimensionBehaviour2 = constraintWidget4.V[0]) == dimensionBehaviour5 || dimensionBehaviour2 == dimensionBehaviour4)) {
                    int q10 = (constraintWidget4.q() - this.f4306b.K.e()) - this.f4306b.M.e();
                    WidgetRun.b(dependencyNode2, constraintWidget4.f4240d.f4311h, this.f4306b.K.e());
                    WidgetRun.b(dependencyNode, constraintWidget4.f4240d.f4312i, -this.f4306b.M.e());
                    aVar.d(q10);
                    return;
                } else if (dimensionBehaviour6 == dimensionBehaviour5) {
                    aVar.d(constraintWidget6.q());
                }
            }
        } else if (this.f4307d == dimensionBehaviour4 && (constraintWidget2 = (constraintWidget = this.f4306b).W) != null && ((dimensionBehaviour = constraintWidget2.V[0]) == dimensionBehaviour5 || dimensionBehaviour == dimensionBehaviour4)) {
            WidgetRun.b(dependencyNode2, constraintWidget2.f4240d.f4311h, constraintWidget.K.e());
            WidgetRun.b(dependencyNode, constraintWidget2.f4240d.f4312i, -this.f4306b.M.e());
            return;
        }
        if (aVar.f4294j) {
            ConstraintWidget constraintWidget7 = this.f4306b;
            if (constraintWidget7.f4236a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.S;
                ConstraintAnchor constraintAnchor2 = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor3 = constraintAnchor2.f4224f;
                if (constraintAnchor3 != null && constraintAnchorArr[1].f4224f != null) {
                    if (constraintWidget7.x()) {
                        dependencyNode2.f4290f = this.f4306b.S[0].e();
                        constraintAnchor = this.f4306b.S[1];
                        dependencyNode.f4290f = -constraintAnchor.e();
                        return;
                    }
                    DependencyNode h10 = WidgetRun.h(this.f4306b.S[0]);
                    if (h10 != null) {
                        WidgetRun.b(dependencyNode2, h10, this.f4306b.S[0].e());
                    }
                    DependencyNode h11 = WidgetRun.h(this.f4306b.S[1]);
                    if (h11 != null) {
                        WidgetRun.b(dependencyNode, h11, -this.f4306b.S[1].e());
                    }
                    dependencyNode2.f4287b = true;
                    dependencyNode.f4287b = true;
                    return;
                }
                if (constraintAnchor3 != null) {
                    DependencyNode h12 = WidgetRun.h(constraintAnchor2);
                    if (h12 != null) {
                        WidgetRun.b(dependencyNode2, h12, this.f4306b.S[0].e());
                    } else {
                        return;
                    }
                } else {
                    ConstraintAnchor constraintAnchor4 = constraintAnchorArr[1];
                    if (constraintAnchor4.f4224f != null) {
                        DependencyNode h13 = WidgetRun.h(constraintAnchor4);
                        if (h13 != null) {
                            WidgetRun.b(dependencyNode, h13, -this.f4306b.S[1].e());
                            WidgetRun.b(dependencyNode2, dependencyNode, -aVar.f4291g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget7 instanceof f2.a) && constraintWidget7.W != null && constraintWidget7.j(ConstraintAnchor.Type.CENTER).f4224f == null) {
                        ConstraintWidget constraintWidget8 = this.f4306b;
                        WidgetRun.b(dependencyNode2, constraintWidget8.W.f4240d.f4311h, constraintWidget8.r());
                    } else {
                        return;
                    }
                }
                WidgetRun.b(dependencyNode, dependencyNode2, aVar.f4291g);
                return;
            }
        }
        if (this.f4307d == dimensionBehaviour3) {
            ConstraintWidget constraintWidget9 = this.f4306b;
            int i10 = constraintWidget9.f4269s;
            ArrayList arrayList2 = aVar.f4295k;
            ArrayList arrayList3 = aVar.f4296l;
            if (i10 != 2) {
                if (i10 == 3) {
                    if (constraintWidget9.f4270t == 3) {
                        dependencyNode2.f4286a = this;
                        dependencyNode.f4286a = this;
                        d dVar = constraintWidget9.f4242e;
                        dVar.f4311h.f4286a = this;
                        dVar.f4312i.f4286a = this;
                        aVar.f4286a = this;
                        if (constraintWidget9.y()) {
                            arrayList3.add(this.f4306b.f4242e.f4308e);
                            this.f4306b.f4242e.f4308e.f4295k.add(aVar);
                            d dVar2 = this.f4306b.f4242e;
                            dVar2.f4308e.f4286a = this;
                            arrayList3.add(dVar2.f4311h);
                            arrayList3.add(this.f4306b.f4242e.f4312i);
                            this.f4306b.f4242e.f4311h.f4295k.add(aVar);
                            arrayList = this.f4306b.f4242e.f4312i.f4295k;
                        } else if (this.f4306b.x()) {
                            this.f4306b.f4242e.f4308e.f4296l.add(aVar);
                            arrayList2.add(this.f4306b.f4242e.f4308e);
                        } else {
                            arrayList = this.f4306b.f4242e.f4308e.f4296l;
                        }
                    } else {
                        a aVar2 = constraintWidget9.f4242e.f4308e;
                        arrayList3.add(aVar2);
                        aVar2.f4295k.add(aVar);
                        this.f4306b.f4242e.f4311h.f4295k.add(aVar);
                        this.f4306b.f4242e.f4312i.f4295k.add(aVar);
                        aVar.f4287b = true;
                        arrayList2.add(dependencyNode2);
                        arrayList2.add(dependencyNode);
                        dependencyNode2.f4296l.add(aVar);
                        arrayList = dependencyNode.f4296l;
                    }
                    arrayList.add(aVar);
                }
            } else {
                ConstraintWidget constraintWidget10 = constraintWidget9.W;
                if (constraintWidget10 != null) {
                    a aVar3 = constraintWidget10.f4242e.f4308e;
                    arrayList3.add(aVar3);
                    aVar3.f4295k.add(aVar);
                    aVar.f4287b = true;
                    arrayList2.add(dependencyNode2);
                    arrayList2.add(dependencyNode);
                }
            }
        }
        ConstraintWidget constraintWidget11 = this.f4306b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget11.S;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f4224f;
        if (constraintAnchor6 != null && constraintAnchorArr2[1].f4224f != null) {
            if (constraintWidget11.x()) {
                dependencyNode2.f4290f = this.f4306b.S[0].e();
                constraintAnchor = this.f4306b.S[1];
                dependencyNode.f4290f = -constraintAnchor.e();
                return;
            }
            DependencyNode h14 = WidgetRun.h(this.f4306b.S[0]);
            DependencyNode h15 = WidgetRun.h(this.f4306b.S[1]);
            if (h14 != null) {
                h14.b(this);
            }
            if (h15 != null) {
                h15.b(this);
            }
            this.f4313j = WidgetRun.RunType.CENTER;
            return;
        }
        if (constraintAnchor6 != null) {
            DependencyNode h16 = WidgetRun.h(constraintAnchor5);
            if (h16 != null) {
                WidgetRun.b(dependencyNode2, h16, this.f4306b.S[0].e());
            } else {
                return;
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[1];
            if (constraintAnchor7.f4224f != null) {
                DependencyNode h17 = WidgetRun.h(constraintAnchor7);
                if (h17 != null) {
                    WidgetRun.b(dependencyNode, h17, -this.f4306b.S[1].e());
                    c(dependencyNode2, dependencyNode, -1, aVar);
                    return;
                }
                return;
            } else if (!(constraintWidget11 instanceof f2.a) && (constraintWidget3 = constraintWidget11.W) != null) {
                WidgetRun.b(dependencyNode2, constraintWidget3.f4240d.f4311h, constraintWidget11.r());
            } else {
                return;
            }
        }
        c(dependencyNode, dependencyNode2, 1, aVar);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.f4311h;
        if (dependencyNode.f4294j) {
            this.f4306b.f4239b0 = dependencyNode.f4291g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.c = null;
        this.f4311h.c();
        this.f4312i.c();
        this.f4308e.c();
        this.f4310g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return this.f4307d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f4306b.f4269s == 0;
    }

    public final void n() {
        this.f4310g = false;
        DependencyNode dependencyNode = this.f4311h;
        dependencyNode.c();
        dependencyNode.f4294j = false;
        DependencyNode dependencyNode2 = this.f4312i;
        dependencyNode2.c();
        dependencyNode2.f4294j = false;
        this.f4308e.f4294j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4306b.f4255k0;
    }
}
