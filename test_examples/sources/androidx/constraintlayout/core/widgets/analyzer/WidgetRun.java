package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import g2.i;

/* loaded from: classes.dex */
public abstract class WidgetRun implements g2.d {

    /* renamed from: a  reason: collision with root package name */
    public int f4305a;

    /* renamed from: b  reason: collision with root package name */
    public ConstraintWidget f4306b;
    public i c;

    /* renamed from: d  reason: collision with root package name */
    public ConstraintWidget.DimensionBehaviour f4307d;

    /* renamed from: e  reason: collision with root package name */
    public final a f4308e = new a(this);

    /* renamed from: f  reason: collision with root package name */
    public int f4309f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4310g = false;

    /* renamed from: h  reason: collision with root package name */
    public final DependencyNode f4311h = new DependencyNode(this);

    /* renamed from: i  reason: collision with root package name */
    public final DependencyNode f4312i = new DependencyNode(this);

    /* renamed from: j  reason: collision with root package name */
    public RunType f4313j = RunType.NONE;

    /* loaded from: classes.dex */
    public enum RunType {
        NONE,
        /* JADX INFO: Fake field, exist only in values array */
        START,
        /* JADX INFO: Fake field, exist only in values array */
        END,
        CENTER
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f4306b = constraintWidget;
    }

    public static void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10) {
        dependencyNode.f4296l.add(dependencyNode2);
        dependencyNode.f4290f = i10;
        dependencyNode2.f4295k.add(dependencyNode);
    }

    public static DependencyNode h(ConstraintAnchor constraintAnchor) {
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f4224f;
        if (constraintAnchor2 == null) {
            return null;
        }
        int ordinal = constraintAnchor2.f4223e.ordinal();
        ConstraintWidget constraintWidget = constraintAnchor2.f4222d;
        if (ordinal == 1) {
            widgetRun = constraintWidget.f4240d;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                widgetRun2 = constraintWidget.f4240d;
            } else if (ordinal != 4) {
                if (ordinal != 5) {
                    return null;
                }
                return constraintWidget.f4242e.f4319k;
            } else {
                widgetRun2 = constraintWidget.f4242e;
            }
            return widgetRun2.f4312i;
        } else {
            widgetRun = constraintWidget.f4242e;
        }
        return widgetRun.f4311h;
    }

    public static DependencyNode i(ConstraintAnchor constraintAnchor, int i10) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f4224f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f4222d;
        WidgetRun widgetRun = i10 == 0 ? constraintWidget.f4240d : constraintWidget.f4242e;
        int ordinal = constraintAnchor2.f4223e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return widgetRun.f4311h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return widgetRun.f4312i;
        }
        return null;
    }

    @Override // g2.d
    public void a(g2.d dVar) {
    }

    public final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10, a aVar) {
        dependencyNode.f4296l.add(dependencyNode2);
        dependencyNode.f4296l.add(this.f4308e);
        dependencyNode.f4292h = i10;
        dependencyNode.f4293i = aVar;
        dependencyNode2.f4295k.add(dependencyNode);
        aVar.f4295k.add(dependencyNode);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            ConstraintWidget constraintWidget = this.f4306b;
            int i12 = constraintWidget.f4273w;
            max = Math.max(constraintWidget.f4272v, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max == i10) {
                return i10;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f4306b;
            int i13 = constraintWidget2.f4276z;
            max = Math.max(constraintWidget2.f4275y, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max == i10) {
                return i10;
            }
        }
        return max;
    }

    public long j() {
        a aVar = this.f4308e;
        if (aVar.f4294j) {
            return aVar.f4291g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        float f10;
        int i11;
        int g10;
        WidgetRun widgetRun;
        float f11;
        DependencyNode h10 = h(constraintAnchor);
        DependencyNode h11 = h(constraintAnchor2);
        if (h10.f4294j && h11.f4294j) {
            int e10 = constraintAnchor.e() + h10.f4291g;
            int e11 = h11.f4291g - constraintAnchor2.e();
            int i12 = e11 - e10;
            a aVar = this.f4308e;
            if (!aVar.f4294j) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f4307d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    int i13 = this.f4305a;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 == 3) {
                                    ConstraintWidget constraintWidget = this.f4306b;
                                    WidgetRun widgetRun2 = constraintWidget.f4240d;
                                    if (widgetRun2.f4307d == dimensionBehaviour2 && widgetRun2.f4305a == 3) {
                                        d dVar = constraintWidget.f4242e;
                                        if (dVar.f4307d == dimensionBehaviour2 && dVar.f4305a == 3) {
                                        }
                                    }
                                    if (i10 == 0) {
                                        widgetRun2 = constraintWidget.f4242e;
                                    }
                                    a aVar2 = widgetRun2.f4308e;
                                    if (aVar2.f4294j) {
                                        float f12 = constraintWidget.Z;
                                        if (i10 == 1) {
                                            g10 = (int) ((aVar2.f4291g / f12) + 0.5f);
                                        } else {
                                            g10 = (int) ((f12 * aVar2.f4291g) + 0.5f);
                                        }
                                    }
                                }
                            } else {
                                ConstraintWidget constraintWidget2 = this.f4306b;
                                ConstraintWidget constraintWidget3 = constraintWidget2.W;
                                if (constraintWidget3 != null) {
                                    if (i10 == 0) {
                                        widgetRun = constraintWidget3.f4240d;
                                    } else {
                                        widgetRun = constraintWidget3.f4242e;
                                    }
                                    a aVar3 = widgetRun.f4308e;
                                    if (aVar3.f4294j) {
                                        if (i10 == 0) {
                                            f11 = constraintWidget2.f4274x;
                                        } else {
                                            f11 = constraintWidget2.A;
                                        }
                                        i11 = (int) ((aVar3.f4291g * f11) + 0.5f);
                                    }
                                }
                            }
                        } else {
                            g10 = Math.min(g(aVar.f4317m, i10), i12);
                        }
                        aVar.d(g10);
                    } else {
                        i11 = i12;
                    }
                    g10 = g(i11, i10);
                    aVar.d(g10);
                }
            }
            if (!aVar.f4294j) {
                return;
            }
            int i14 = aVar.f4291g;
            DependencyNode dependencyNode = this.f4312i;
            DependencyNode dependencyNode2 = this.f4311h;
            if (i14 == i12) {
                dependencyNode2.d(e10);
                dependencyNode.d(e11);
                return;
            }
            ConstraintWidget constraintWidget4 = this.f4306b;
            if (i10 == 0) {
                f10 = constraintWidget4.f4247g0;
            } else {
                f10 = constraintWidget4.f4249h0;
            }
            if (h10 == h11) {
                e10 = h10.f4291g;
                e11 = h11.f4291g;
                f10 = 0.5f;
            }
            dependencyNode2.d((int) ((((e11 - e10) - i14) * f10) + e10 + 0.5f));
            dependencyNode.d(dependencyNode2.f4291g + aVar.f4291g);
        }
    }
}
