package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends WidgetRun {
    public b(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, g2.d
    public final void a(g2.d dVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.f4306b;
        int i10 = aVar.f4282u0;
        DependencyNode dependencyNode = this.f4311h;
        Iterator it = dependencyNode.f4296l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((DependencyNode) it.next()).f4291g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 != 0 && i10 != 2) {
            dependencyNode.d(i11 + aVar.f4284w0);
            return;
        }
        dependencyNode.d(i12 + aVar.f4284w0);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        WidgetRun widgetRun;
        ConstraintWidget constraintWidget = this.f4306b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            DependencyNode dependencyNode = this.f4311h;
            dependencyNode.f4287b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int i10 = aVar.f4282u0;
            boolean z10 = aVar.f4283v0;
            ArrayList arrayList = dependencyNode.f4296l;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            dependencyNode.f4289e = DependencyNode.Type.BOTTOM;
                            while (i11 < aVar.f10896t0) {
                                ConstraintWidget constraintWidget2 = aVar.f10895s0[i11];
                                if (z10 || constraintWidget2.f4253j0 != 8) {
                                    DependencyNode dependencyNode2 = constraintWidget2.f4242e.f4312i;
                                    dependencyNode2.f4295k.add(dependencyNode);
                                    arrayList.add(dependencyNode2);
                                }
                                i11++;
                            }
                        } else {
                            return;
                        }
                    } else {
                        dependencyNode.f4289e = DependencyNode.Type.TOP;
                        while (i11 < aVar.f10896t0) {
                            ConstraintWidget constraintWidget3 = aVar.f10895s0[i11];
                            if (z10 || constraintWidget3.f4253j0 != 8) {
                                DependencyNode dependencyNode3 = constraintWidget3.f4242e.f4311h;
                                dependencyNode3.f4295k.add(dependencyNode);
                                arrayList.add(dependencyNode3);
                            }
                            i11++;
                        }
                    }
                    m(this.f4306b.f4242e.f4311h);
                    widgetRun = this.f4306b.f4242e;
                    m(widgetRun.f4312i);
                }
                dependencyNode.f4289e = DependencyNode.Type.RIGHT;
                while (i11 < aVar.f10896t0) {
                    ConstraintWidget constraintWidget4 = aVar.f10895s0[i11];
                    if (z10 || constraintWidget4.f4253j0 != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.f4240d.f4312i;
                        dependencyNode4.f4295k.add(dependencyNode);
                        arrayList.add(dependencyNode4);
                    }
                    i11++;
                }
            } else {
                dependencyNode.f4289e = DependencyNode.Type.LEFT;
                while (i11 < aVar.f10896t0) {
                    ConstraintWidget constraintWidget5 = aVar.f10895s0[i11];
                    if (z10 || constraintWidget5.f4253j0 != 8) {
                        DependencyNode dependencyNode5 = constraintWidget5.f4240d.f4311h;
                        dependencyNode5.f4295k.add(dependencyNode);
                        arrayList.add(dependencyNode5);
                    }
                    i11++;
                }
            }
            m(this.f4306b.f4240d.f4311h);
            widgetRun = this.f4306b.f4240d;
            m(widgetRun.f4312i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.f4306b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int i10 = ((androidx.constraintlayout.core.widgets.a) constraintWidget).f4282u0;
            DependencyNode dependencyNode = this.f4311h;
            if (i10 != 0 && i10 != 1) {
                constraintWidget.c0 = dependencyNode.f4291g;
                return;
            }
            constraintWidget.f4239b0 = dependencyNode.f4291g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.c = null;
        this.f4311h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        return false;
    }

    public final void m(DependencyNode dependencyNode) {
        DependencyNode dependencyNode2 = this.f4311h;
        dependencyNode2.f4295k.add(dependencyNode);
        dependencyNode.f4296l.add(dependencyNode2);
    }
}
