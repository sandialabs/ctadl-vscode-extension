package f2;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import g2.g;
import g2.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b extends ConstraintWidget implements a {

    /* renamed from: s0  reason: collision with root package name */
    public ConstraintWidget[] f10895s0 = new ConstraintWidget[4];

    /* renamed from: t0  reason: collision with root package name */
    public int f10896t0 = 0;

    public final void Q(int i10, j jVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f10896t0; i11++) {
            ConstraintWidget constraintWidget = this.f10895s0[i11];
            ArrayList<ConstraintWidget> arrayList2 = jVar.f11217a;
            if (!arrayList2.contains(constraintWidget)) {
                arrayList2.add(constraintWidget);
            }
        }
        for (int i12 = 0; i12 < this.f10896t0; i12++) {
            g.a(this.f10895s0[i12], i10, arrayList, jVar);
        }
    }

    public void a() {
    }
}
