package g2;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final WidgetRun f11214a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<WidgetRun> f11215b = new ArrayList<>();

    public i(WidgetRun widgetRun) {
        this.f11214a = null;
        this.f11214a = widgetRun;
    }

    public static long a(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.f4288d;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.b) {
            return j2;
        }
        ArrayList arrayList = dependencyNode.f4295k;
        int size = arrayList.size();
        long j10 = j2;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f4288d != widgetRun) {
                    j10 = Math.min(j10, a(dependencyNode2, dependencyNode2.f4290f + j2));
                }
            }
        }
        if (dependencyNode == widgetRun.f4312i) {
            long j11 = widgetRun.j();
            DependencyNode dependencyNode3 = widgetRun.f4311h;
            long j12 = j2 - j11;
            return Math.min(Math.min(j10, a(dependencyNode3, j12)), j12 - dependencyNode3.f4290f);
        }
        return j10;
    }

    public static long b(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.f4288d;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.b) {
            return j2;
        }
        ArrayList arrayList = dependencyNode.f4295k;
        int size = arrayList.size();
        long j10 = j2;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f4288d != widgetRun) {
                    j10 = Math.max(j10, b(dependencyNode2, dependencyNode2.f4290f + j2));
                }
            }
        }
        if (dependencyNode == widgetRun.f4311h) {
            long j11 = widgetRun.j();
            DependencyNode dependencyNode3 = widgetRun.f4312i;
            long j12 = j2 + j11;
            return Math.max(Math.max(j10, b(dependencyNode3, j12)), j12 - dependencyNode3.f4290f);
        }
        return j10;
    }
}
