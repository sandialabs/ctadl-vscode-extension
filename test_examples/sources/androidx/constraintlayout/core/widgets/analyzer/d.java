package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends WidgetRun {

    /* renamed from: k  reason: collision with root package name */
    public final DependencyNode f4319k;

    /* renamed from: l  reason: collision with root package name */
    public g2.a f4320l;

    public d(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f4319k = dependencyNode;
        this.f4320l = null;
        this.f4311h.f4289e = DependencyNode.Type.TOP;
        this.f4312i.f4289e = DependencyNode.Type.BOTTOM;
        dependencyNode.f4289e = DependencyNode.Type.BASELINE;
        this.f4309f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, g2.d
    public final void a(g2.d dVar) {
        float f10;
        float f11;
        float f12;
        int i10;
        if (this.f4313j.ordinal() != 3) {
            a aVar = this.f4308e;
            boolean z10 = aVar.c;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (z10 && !aVar.f4294j && this.f4307d == dimensionBehaviour) {
                ConstraintWidget constraintWidget = this.f4306b;
                int i11 = constraintWidget.f4270t;
                if (i11 != 2) {
                    if (i11 == 3) {
                        a aVar2 = constraintWidget.f4240d.f4308e;
                        if (aVar2.f4294j) {
                            int i12 = constraintWidget.f4237a0;
                            if (i12 != -1) {
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        i10 = 0;
                                        aVar.d(i10);
                                    }
                                } else {
                                    f11 = aVar2.f4291g;
                                    f10 = constraintWidget.Z;
                                    f12 = f11 * f10;
                                }
                            }
                            f12 = aVar2.f4291g / constraintWidget.Z;
                        }
                    }
                } else {
                    ConstraintWidget constraintWidget2 = constraintWidget.W;
                    if (constraintWidget2 != null) {
                        a aVar3 = constraintWidget2.f4242e.f4308e;
                        if (aVar3.f4294j) {
                            f10 = constraintWidget.A;
                            f11 = aVar3.f4291g;
                            f12 = f11 * f10;
                        }
                    }
                }
                i10 = (int) (f12 + 0.5f);
                aVar.d(i10);
            }
            DependencyNode dependencyNode = this.f4311h;
            if (dependencyNode.c) {
                DependencyNode dependencyNode2 = this.f4312i;
                if (dependencyNode2.c) {
                    if (dependencyNode.f4294j && dependencyNode2.f4294j && aVar.f4294j) {
                        return;
                    }
                    boolean z11 = aVar.f4294j;
                    ArrayList arrayList = dependencyNode.f4296l;
                    ArrayList arrayList2 = dependencyNode2.f4296l;
                    if (!z11 && this.f4307d == dimensionBehaviour) {
                        ConstraintWidget constraintWidget3 = this.f4306b;
                        if (constraintWidget3.f4269s == 0 && !constraintWidget3.y()) {
                            int i13 = ((DependencyNode) arrayList.get(0)).f4291g + dependencyNode.f4290f;
                            int i14 = ((DependencyNode) arrayList2.get(0)).f4291g + dependencyNode2.f4290f;
                            dependencyNode.d(i13);
                            dependencyNode2.d(i14);
                            aVar.d(i14 - i13);
                            return;
                        }
                    }
                    if (!aVar.f4294j && this.f4307d == dimensionBehaviour && this.f4305a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                        int i15 = (((DependencyNode) arrayList2.get(0)).f4291g + dependencyNode2.f4290f) - (((DependencyNode) arrayList.get(0)).f4291g + dependencyNode.f4290f);
                        int i16 = aVar.f4317m;
                        if (i15 < i16) {
                            aVar.d(i15);
                        } else {
                            aVar.d(i16);
                        }
                    }
                    if (aVar.f4294j && arrayList.size() > 0 && arrayList2.size() > 0) {
                        DependencyNode dependencyNode3 = (DependencyNode) arrayList.get(0);
                        DependencyNode dependencyNode4 = (DependencyNode) arrayList2.get(0);
                        int i17 = dependencyNode3.f4291g;
                        int i18 = dependencyNode.f4290f + i17;
                        int i19 = dependencyNode4.f4291g;
                        int i20 = dependencyNode2.f4290f + i19;
                        float f13 = this.f4306b.f4249h0;
                        if (dependencyNode3 == dependencyNode4) {
                            f13 = 0.5f;
                        } else {
                            i17 = i18;
                            i19 = i20;
                        }
                        dependencyNode.d((int) ((((i19 - i17) - aVar.f4291g) * f13) + i17 + 0.5f));
                        dependencyNode2.d(dependencyNode.f4291g + aVar.f4291g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ConstraintWidget constraintWidget4 = this.f4306b;
        l(constraintWidget4.L, constraintWidget4.N, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c2, code lost:
        if (r16.f4306b.F != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0314, code lost:
        if (r1.f4307d == r5) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        c cVar;
        WidgetRun widgetRun;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        ConstraintWidget constraintWidget6 = this.f4306b;
        boolean z10 = constraintWidget6.f4236a;
        a aVar = this.f4308e;
        if (z10) {
            aVar.d(constraintWidget6.l());
        }
        boolean z11 = aVar.f4294j;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        DependencyNode dependencyNode = this.f4312i;
        DependencyNode dependencyNode2 = this.f4311h;
        if (!z11) {
            ConstraintWidget constraintWidget7 = this.f4306b;
            this.f4307d = constraintWidget7.V[1];
            if (constraintWidget7.F) {
                this.f4320l = new g2.a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f4307d;
            if (dimensionBehaviour4 != dimensionBehaviour3) {
                if (dimensionBehaviour4 == dimensionBehaviour && (constraintWidget5 = this.f4306b.W) != null && constraintWidget5.V[1] == dimensionBehaviour2) {
                    int l2 = (constraintWidget5.l() - this.f4306b.L.e()) - this.f4306b.N.e();
                    WidgetRun.b(dependencyNode2, constraintWidget5.f4242e.f4311h, this.f4306b.L.e());
                    WidgetRun.b(dependencyNode, constraintWidget5.f4242e.f4312i, -this.f4306b.N.e());
                    aVar.d(l2);
                    return;
                } else if (dimensionBehaviour4 == dimensionBehaviour2) {
                    aVar.d(this.f4306b.l());
                }
            }
        } else if (this.f4307d == dimensionBehaviour && (constraintWidget2 = (constraintWidget = this.f4306b).W) != null && constraintWidget2.V[1] == dimensionBehaviour2) {
            WidgetRun.b(dependencyNode2, constraintWidget2.f4242e.f4311h, constraintWidget.L.e());
            WidgetRun.b(dependencyNode, constraintWidget2.f4242e.f4312i, -this.f4306b.N.e());
            return;
        }
        boolean z12 = aVar.f4294j;
        DependencyNode dependencyNode3 = this.f4319k;
        if (z12) {
            ConstraintWidget constraintWidget8 = this.f4306b;
            if (constraintWidget8.f4236a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget8.S;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f4224f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f4224f != null) {
                    if (constraintWidget8.y()) {
                        dependencyNode2.f4290f = this.f4306b.S[2].e();
                        dependencyNode.f4290f = -this.f4306b.S[3].e();
                    } else {
                        DependencyNode h10 = WidgetRun.h(this.f4306b.S[2]);
                        if (h10 != null) {
                            WidgetRun.b(dependencyNode2, h10, this.f4306b.S[2].e());
                        }
                        DependencyNode h11 = WidgetRun.h(this.f4306b.S[3]);
                        if (h11 != null) {
                            WidgetRun.b(dependencyNode, h11, -this.f4306b.S[3].e());
                        }
                        dependencyNode2.f4287b = true;
                        dependencyNode.f4287b = true;
                    }
                    constraintWidget4 = this.f4306b;
                    if (!constraintWidget4.F) {
                        return;
                    }
                } else if (constraintAnchor2 != null) {
                    DependencyNode h12 = WidgetRun.h(constraintAnchor);
                    if (h12 != null) {
                        WidgetRun.b(dependencyNode2, h12, this.f4306b.S[2].e());
                        WidgetRun.b(dependencyNode, dependencyNode2, aVar.f4291g);
                        constraintWidget4 = this.f4306b;
                        if (!constraintWidget4.F) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                    if (constraintAnchor3.f4224f != null) {
                        DependencyNode h13 = WidgetRun.h(constraintAnchor3);
                        if (h13 != null) {
                            WidgetRun.b(dependencyNode, h13, -this.f4306b.S[3].e());
                            WidgetRun.b(dependencyNode2, dependencyNode, -aVar.f4291g);
                        }
                        constraintWidget4 = this.f4306b;
                        if (!constraintWidget4.F) {
                            return;
                        }
                    } else {
                        ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                        if (constraintAnchor4.f4224f != null) {
                            DependencyNode h14 = WidgetRun.h(constraintAnchor4);
                            if (h14 != null) {
                                WidgetRun.b(dependencyNode3, h14, 0);
                                WidgetRun.b(dependencyNode2, dependencyNode3, -this.f4306b.f4241d0);
                                WidgetRun.b(dependencyNode, dependencyNode2, aVar.f4291g);
                                return;
                            }
                            return;
                        } else if (!(constraintWidget8 instanceof f2.a) && constraintWidget8.W != null && constraintWidget8.j(ConstraintAnchor.Type.CENTER).f4224f == null) {
                            ConstraintWidget constraintWidget9 = this.f4306b;
                            WidgetRun.b(dependencyNode2, constraintWidget9.W.f4242e.f4311h, constraintWidget9.s());
                            WidgetRun.b(dependencyNode, dependencyNode2, aVar.f4291g);
                            constraintWidget4 = this.f4306b;
                            if (!constraintWidget4.F) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget4.f4241d0);
                return;
            }
        }
        ArrayList arrayList = aVar.f4296l;
        if (!z12 && this.f4307d == dimensionBehaviour3) {
            ConstraintWidget constraintWidget10 = this.f4306b;
            int i10 = constraintWidget10.f4270t;
            if (i10 != 2) {
                if (i10 == 3 && !constraintWidget10.y()) {
                    ConstraintWidget constraintWidget11 = this.f4306b;
                    if (constraintWidget11.f4269s != 3) {
                        widgetRun = constraintWidget11.f4240d;
                        a aVar2 = widgetRun.f4308e;
                        arrayList.add(aVar2);
                        aVar2.f4295k.add(aVar);
                        aVar.f4287b = true;
                        ArrayList arrayList2 = aVar.f4295k;
                        arrayList2.add(dependencyNode2);
                        arrayList2.add(dependencyNode);
                    }
                }
            } else {
                ConstraintWidget constraintWidget12 = constraintWidget10.W;
                if (constraintWidget12 != null) {
                    widgetRun = constraintWidget12.f4242e;
                    a aVar22 = widgetRun.f4308e;
                    arrayList.add(aVar22);
                    aVar22.f4295k.add(aVar);
                    aVar.f4287b = true;
                    ArrayList arrayList22 = aVar.f4295k;
                    arrayList22.add(dependencyNode2);
                    arrayList22.add(dependencyNode);
                }
            }
        } else {
            aVar.b(this);
        }
        ConstraintWidget constraintWidget13 = this.f4306b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget13.S;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f4224f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f4224f != null) {
            if (constraintWidget13.y()) {
                dependencyNode2.f4290f = this.f4306b.S[2].e();
                dependencyNode.f4290f = -this.f4306b.S[3].e();
            } else {
                DependencyNode h15 = WidgetRun.h(this.f4306b.S[2]);
                DependencyNode h16 = WidgetRun.h(this.f4306b.S[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.f4313j = WidgetRun.RunType.CENTER;
            }
            if (this.f4306b.F) {
                c(dependencyNode3, dependencyNode2, 1, this.f4320l);
            }
            if (arrayList.size() != 0) {
            }
        } else {
            if (constraintAnchor6 != null) {
                DependencyNode h17 = WidgetRun.h(constraintAnchor5);
                if (h17 != null) {
                    WidgetRun.b(dependencyNode2, h17, this.f4306b.S[2].e());
                    c(dependencyNode, dependencyNode2, 1, aVar);
                    if (this.f4306b.F) {
                        c(dependencyNode3, dependencyNode2, 1, this.f4320l);
                    }
                    if (this.f4307d == dimensionBehaviour3) {
                        ConstraintWidget constraintWidget14 = this.f4306b;
                        if (constraintWidget14.Z > 0.0f) {
                            cVar = constraintWidget14.f4240d;
                            if (cVar.f4307d == dimensionBehaviour3) {
                                cVar.f4308e.f4295k.add(aVar);
                                arrayList.add(this.f4306b.f4240d.f4308e);
                                aVar.f4286a = this;
                            }
                        }
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
                if (constraintAnchor7.f4224f != null) {
                    DependencyNode h18 = WidgetRun.h(constraintAnchor7);
                    if (h18 != null) {
                        WidgetRun.b(dependencyNode, h18, -this.f4306b.S[3].e());
                        c(dependencyNode2, dependencyNode, -1, aVar);
                    }
                } else {
                    ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                    if (constraintAnchor8.f4224f != null) {
                        DependencyNode h19 = WidgetRun.h(constraintAnchor8);
                        if (h19 != null) {
                            WidgetRun.b(dependencyNode3, h19, 0);
                            c(dependencyNode2, dependencyNode3, -1, this.f4320l);
                            c(dependencyNode, dependencyNode2, 1, aVar);
                        }
                    } else if (!(constraintWidget13 instanceof f2.a) && (constraintWidget3 = constraintWidget13.W) != null) {
                        WidgetRun.b(dependencyNode2, constraintWidget3.f4242e.f4311h, constraintWidget13.s());
                        c(dependencyNode, dependencyNode2, 1, aVar);
                        if (this.f4306b.F) {
                            c(dependencyNode3, dependencyNode2, 1, this.f4320l);
                        }
                        if (this.f4307d == dimensionBehaviour3) {
                            ConstraintWidget constraintWidget15 = this.f4306b;
                            if (constraintWidget15.Z > 0.0f) {
                                cVar = constraintWidget15.f4240d;
                            }
                        }
                    }
                }
            }
            if (arrayList.size() != 0) {
                aVar.c = true;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.f4311h;
        if (dependencyNode.f4294j) {
            this.f4306b.c0 = dependencyNode.f4291g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.c = null;
        this.f4311h.c();
        this.f4312i.c();
        this.f4319k.c();
        this.f4308e.c();
        this.f4310g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return this.f4307d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f4306b.f4270t == 0;
    }

    public final void m() {
        this.f4310g = false;
        DependencyNode dependencyNode = this.f4311h;
        dependencyNode.c();
        dependencyNode.f4294j = false;
        DependencyNode dependencyNode2 = this.f4312i;
        dependencyNode2.c();
        dependencyNode2.f4294j = false;
        DependencyNode dependencyNode3 = this.f4319k;
        dependencyNode3.c();
        dependencyNode3.f4294j = false;
        this.f4308e.f4294j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4306b.f4255k0;
    }
}
