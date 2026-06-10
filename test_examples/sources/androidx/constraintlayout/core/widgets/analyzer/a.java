package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a extends DependencyNode {

    /* renamed from: m  reason: collision with root package name */
    public int f4317m;

    public a(WidgetRun widgetRun) {
        super(widgetRun);
        this.f4289e = widgetRun instanceof c ? DependencyNode.Type.HORIZONTAL_DIMENSION : DependencyNode.Type.VERTICAL_DIMENSION;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public final void d(int i10) {
        if (this.f4294j) {
            return;
        }
        this.f4294j = true;
        this.f4291g = i10;
        Iterator it = this.f4295k.iterator();
        while (it.hasNext()) {
            g2.d dVar = (g2.d) it.next();
            dVar.a(dVar);
        }
    }
}
