package g2;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* loaded from: classes.dex */
public final class h extends WidgetRun {
    public h(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f4240d.f();
        constraintWidget.f4242e.f();
        this.f4309f = ((androidx.constraintlayout.core.widgets.f) constraintWidget).f4367w0;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, g2.d
    public final void a(d dVar) {
        DependencyNode dependencyNode = this.f4311h;
        if (!dependencyNode.c || dependencyNode.f4294j) {
            return;
        }
        dependencyNode.d((int) ((((DependencyNode) dependencyNode.f4296l.get(0)).f4291g * ((androidx.constraintlayout.core.widgets.f) this.f4306b).f4363s0) + 0.5f));
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        WidgetRun widgetRun;
        ConstraintWidget constraintWidget = this.f4306b;
        androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
        int i10 = fVar.f4364t0;
        int i11 = fVar.f4365u0;
        int i12 = fVar.f4367w0;
        DependencyNode dependencyNode = this.f4311h;
        if (i12 == 1) {
            if (i10 != -1) {
                dependencyNode.f4296l.add(constraintWidget.W.f4240d.f4311h);
                this.f4306b.W.f4240d.f4311h.f4295k.add(dependencyNode);
                dependencyNode.f4290f = i10;
            } else if (i11 != -1) {
                dependencyNode.f4296l.add(constraintWidget.W.f4240d.f4312i);
                this.f4306b.W.f4240d.f4312i.f4295k.add(dependencyNode);
                dependencyNode.f4290f = -i11;
            } else {
                dependencyNode.f4287b = true;
                dependencyNode.f4296l.add(constraintWidget.W.f4240d.f4312i);
                this.f4306b.W.f4240d.f4312i.f4295k.add(dependencyNode);
            }
            m(this.f4306b.f4240d.f4311h);
            widgetRun = this.f4306b.f4240d;
        } else {
            if (i10 != -1) {
                dependencyNode.f4296l.add(constraintWidget.W.f4242e.f4311h);
                this.f4306b.W.f4242e.f4311h.f4295k.add(dependencyNode);
                dependencyNode.f4290f = i10;
            } else if (i11 != -1) {
                dependencyNode.f4296l.add(constraintWidget.W.f4242e.f4312i);
                this.f4306b.W.f4242e.f4312i.f4295k.add(dependencyNode);
                dependencyNode.f4290f = -i11;
            } else {
                dependencyNode.f4287b = true;
                dependencyNode.f4296l.add(constraintWidget.W.f4242e.f4312i);
                this.f4306b.W.f4242e.f4312i.f4295k.add(dependencyNode);
            }
            m(this.f4306b.f4242e.f4311h);
            widgetRun = this.f4306b.f4242e;
        }
        m(widgetRun.f4312i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        ConstraintWidget constraintWidget = this.f4306b;
        int i10 = ((androidx.constraintlayout.core.widgets.f) constraintWidget).f4367w0;
        DependencyNode dependencyNode = this.f4311h;
        if (i10 == 1) {
            constraintWidget.f4239b0 = dependencyNode.f4291g;
        } else {
            constraintWidget.c0 = dependencyNode.f4291g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
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
