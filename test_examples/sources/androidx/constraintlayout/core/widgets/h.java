package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import g2.b;

/* loaded from: classes.dex */
public class h extends f2.b {

    /* renamed from: u0  reason: collision with root package name */
    public int f4370u0 = 0;

    /* renamed from: v0  reason: collision with root package name */
    public int f4371v0 = 0;

    /* renamed from: w0  reason: collision with root package name */
    public int f4372w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public int f4373x0 = 0;

    /* renamed from: y0  reason: collision with root package name */
    public int f4374y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public int f4375z0 = 0;
    public boolean A0 = false;
    public int B0 = 0;
    public int C0 = 0;
    public final b.a D0 = new b.a();
    public b.InterfaceC0121b E0 = null;

    public void R(int i10, int i11, int i12, int i13) {
    }

    public final void S(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        b.InterfaceC0121b interfaceC0121b;
        boolean z10;
        ConstraintWidget constraintWidget2;
        while (true) {
            interfaceC0121b = this.E0;
            if (interfaceC0121b != null || (constraintWidget2 = this.W) == null) {
                break;
            }
            this.E0 = ((d) constraintWidget2).f4339w0;
        }
        b.a aVar = this.D0;
        aVar.f11195a = dimensionBehaviour;
        aVar.f11196b = dimensionBehaviour2;
        aVar.c = i10;
        aVar.f11197d = i11;
        ((ConstraintLayout.b) interfaceC0121b).b(constraintWidget, aVar);
        constraintWidget.N(aVar.f11198e);
        constraintWidget.K(aVar.f11199f);
        constraintWidget.F = aVar.f11201h;
        int i12 = aVar.f11200g;
        constraintWidget.f4241d0 = i12;
        if (i12 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        constraintWidget.F = z10;
    }

    @Override // f2.b, f2.a
    public final void a() {
        for (int i10 = 0; i10 < this.f10896t0; i10++) {
            ConstraintWidget constraintWidget = this.f10895s0[i10];
            if (constraintWidget != null) {
                constraintWidget.H = true;
            }
        }
    }
}
