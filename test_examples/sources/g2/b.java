package g2;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f11193a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final a f11194b = new a();
    public final androidx.constraintlayout.core.widgets.d c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f11195a;

        /* renamed from: b  reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f11196b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f11197d;

        /* renamed from: e  reason: collision with root package name */
        public int f11198e;

        /* renamed from: f  reason: collision with root package name */
        public int f11199f;

        /* renamed from: g  reason: collision with root package name */
        public int f11200g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f11201h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f11202i;

        /* renamed from: j  reason: collision with root package name */
        public int f11203j;
    }

    /* renamed from: g2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0121b {
    }

    public b(androidx.constraintlayout.core.widgets.d dVar) {
        this.c = dVar;
    }

    public final boolean a(int i10, ConstraintWidget constraintWidget, InterfaceC0121b interfaceC0121b) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        a aVar = this.f11194b;
        aVar.f11195a = dimensionBehaviour;
        boolean z14 = true;
        aVar.f11196b = dimensionBehaviourArr[1];
        aVar.c = constraintWidget.q();
        aVar.f11197d = constraintWidget.l();
        aVar.f11202i = false;
        aVar.f11203j = i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.f11195a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour2 == dimensionBehaviour3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (aVar.f11196b == dimensionBehaviour3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && constraintWidget.Z > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && constraintWidget.Z > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        int[] iArr = constraintWidget.f4271u;
        if (z12 && iArr[0] == 4) {
            aVar.f11195a = dimensionBehaviour4;
        }
        if (z13 && iArr[1] == 4) {
            aVar.f11196b = dimensionBehaviour4;
        }
        ((ConstraintLayout.b) interfaceC0121b).b(constraintWidget, aVar);
        constraintWidget.N(aVar.f11198e);
        constraintWidget.K(aVar.f11199f);
        constraintWidget.F = aVar.f11201h;
        int i11 = aVar.f11200g;
        constraintWidget.f4241d0 = i11;
        if (i11 <= 0) {
            z14 = false;
        }
        constraintWidget.F = z14;
        aVar.f11203j = 0;
        return aVar.f11202i;
    }

    public final void b(androidx.constraintlayout.core.widgets.d dVar, int i10, int i11, int i12) {
        int i13 = dVar.f4243e0;
        int i14 = dVar.f4245f0;
        dVar.f4243e0 = 0;
        dVar.f4245f0 = 0;
        dVar.N(i11);
        dVar.K(i12);
        if (i13 < 0) {
            i13 = 0;
        }
        dVar.f4243e0 = i13;
        if (i14 < 0) {
            i14 = 0;
        }
        dVar.f4245f0 = i14;
        androidx.constraintlayout.core.widgets.d dVar2 = this.c;
        dVar2.f4338v0 = i10;
        dVar2.Q();
    }

    public final void c(androidx.constraintlayout.core.widgets.d dVar) {
        ArrayList<ConstraintWidget> arrayList = this.f11193a;
        arrayList.clear();
        int size = dVar.f10897s0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = dVar.f10897s0.get(i10);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2) {
                arrayList.add(constraintWidget);
            }
        }
        dVar.f4337u0.f11207b = true;
    }
}
