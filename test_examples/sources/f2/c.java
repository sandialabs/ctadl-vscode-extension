package f2;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends ConstraintWidget {

    /* renamed from: s0  reason: collision with root package name */
    public ArrayList<ConstraintWidget> f10897s0 = new ArrayList<>();

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void C() {
        this.f10897s0.clear();
        super.C();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void F(d2.a aVar) {
        super.F(aVar);
        int size = this.f10897s0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f10897s0.get(i10).F(aVar);
        }
    }

    public void Q() {
        ArrayList<ConstraintWidget> arrayList = this.f10897s0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f10897s0.get(i10);
            if (constraintWidget instanceof c) {
                ((c) constraintWidget).Q();
            }
        }
    }
}
