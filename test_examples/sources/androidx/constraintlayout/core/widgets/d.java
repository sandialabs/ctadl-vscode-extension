package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.widget.ConstraintLayout;
import g2.b;
import g2.j;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends f2.c {
    public int A0;

    /* renamed from: v0  reason: collision with root package name */
    public int f4338v0;

    /* renamed from: z0  reason: collision with root package name */
    public int f4342z0;

    /* renamed from: t0  reason: collision with root package name */
    public final g2.b f4336t0 = new g2.b(this);

    /* renamed from: u0  reason: collision with root package name */
    public final g2.e f4337u0 = new g2.e(this);

    /* renamed from: w0  reason: collision with root package name */
    public b.InterfaceC0121b f4339w0 = null;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f4340x0 = false;

    /* renamed from: y0  reason: collision with root package name */
    public final androidx.constraintlayout.core.c f4341y0 = new androidx.constraintlayout.core.c();
    public int B0 = 0;
    public int C0 = 0;
    public c[] D0 = new c[4];
    public c[] E0 = new c[4];
    public int F0 = 257;
    public boolean G0 = false;
    public boolean H0 = false;
    public WeakReference<ConstraintAnchor> I0 = null;
    public WeakReference<ConstraintAnchor> J0 = null;
    public WeakReference<ConstraintAnchor> K0 = null;
    public WeakReference<ConstraintAnchor> L0 = null;
    public final HashSet<ConstraintWidget> M0 = new HashSet<>();
    public final b.a N0 = new b.a();

    public static void U(ConstraintWidget constraintWidget, b.InterfaceC0121b interfaceC0121b, b.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        if (interfaceC0121b == null) {
            return;
        }
        if (constraintWidget.f4253j0 != 8 && !(constraintWidget instanceof f) && !(constraintWidget instanceof a)) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
            aVar.f11195a = dimensionBehaviourArr[0];
            boolean z14 = true;
            aVar.f11196b = dimensionBehaviourArr[1];
            aVar.c = constraintWidget.q();
            aVar.f11197d = constraintWidget.l();
            aVar.f11202i = false;
            aVar.f11203j = 0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f11195a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (aVar.f11196b == dimensionBehaviour2) {
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
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
            if (z10 && constraintWidget.t(0) && constraintWidget.f4269s == 0 && !z12) {
                aVar.f11195a = dimensionBehaviour3;
                if (z11 && constraintWidget.f4270t == 0) {
                    aVar.f11195a = dimensionBehaviour4;
                }
                z10 = false;
            }
            if (z11 && constraintWidget.t(1) && constraintWidget.f4270t == 0 && !z13) {
                aVar.f11196b = dimensionBehaviour3;
                if (z10 && constraintWidget.f4269s == 0) {
                    aVar.f11196b = dimensionBehaviour4;
                }
                z11 = false;
            }
            if (constraintWidget.A()) {
                aVar.f11195a = dimensionBehaviour4;
                z10 = false;
            }
            if (constraintWidget.B()) {
                aVar.f11196b = dimensionBehaviour4;
                z11 = false;
            }
            int[] iArr = constraintWidget.f4271u;
            if (z12) {
                if (iArr[0] == 4) {
                    aVar.f11195a = dimensionBehaviour4;
                } else if (!z11) {
                    if (aVar.f11196b == dimensionBehaviour4) {
                        i12 = aVar.f11197d;
                    } else {
                        aVar.f11195a = dimensionBehaviour3;
                        ((ConstraintLayout.b) interfaceC0121b).b(constraintWidget, aVar);
                        i12 = aVar.f11199f;
                    }
                    aVar.f11195a = dimensionBehaviour4;
                    aVar.c = (int) (constraintWidget.Z * i12);
                }
            }
            if (z13) {
                if (iArr[1] == 4) {
                    aVar.f11196b = dimensionBehaviour4;
                } else if (!z10) {
                    if (aVar.f11195a == dimensionBehaviour4) {
                        i10 = aVar.c;
                    } else {
                        aVar.f11196b = dimensionBehaviour3;
                        ((ConstraintLayout.b) interfaceC0121b).b(constraintWidget, aVar);
                        i10 = aVar.f11198e;
                    }
                    aVar.f11196b = dimensionBehaviour4;
                    if (constraintWidget.f4237a0 == -1) {
                        i11 = (int) (i10 / constraintWidget.Z);
                    } else {
                        i11 = (int) (constraintWidget.Z * i10);
                    }
                    aVar.f11197d = i11;
                }
            }
            ((ConstraintLayout.b) interfaceC0121b).b(constraintWidget, aVar);
            constraintWidget.N(aVar.f11198e);
            constraintWidget.K(aVar.f11199f);
            constraintWidget.F = aVar.f11201h;
            int i13 = aVar.f11200g;
            constraintWidget.f4241d0 = i13;
            if (i13 <= 0) {
                z14 = false;
            }
            constraintWidget.F = z14;
            aVar.f11203j = 0;
            return;
        }
        aVar.f11198e = 0;
        aVar.f11199f = 0;
    }

    @Override // f2.c, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void C() {
        this.f4341y0.u();
        this.f4342z0 = 0;
        this.A0 = 0;
        super.C();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void O(boolean z10, boolean z11) {
        super.O(z10, z11);
        int size = this.f10897s0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f10897s0.get(i10).O(z10, z11);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:225|(9:226|227|228|229|230|(1:232)|233|234|(2:235|236))|(3:351|352|(30:354|355|356|357|358|359|360|361|239|240|(2:244|245)|246|(10:250|251|252|253|254|255|256|257|258|259)|338|(1:347)(3:342|343|344)|345|346|265|(4:267|(5:269|(3:274|(2:276|277)(1:279)|278)|280|(0)(0)|278)|281|282)(4:329|(1:331)|332|333)|283|(6:288|(1:290)|291|292|(1:296)|(1:300))|301|(1:303)|304|(1:306)(1:328)|(4:308|(1:313)|314|(5:317|(3:319|(2:321|322)(2:324|325)|323)|326|(0)(0)|323))|327|326|(0)(0)|323))|238|239|240|(3:242|244|245)|246|(11:248|250|251|252|253|254|255|256|257|258|259)|338|(1:340)|347|345|346|265|(0)(0)|283|(7:286|288|(0)|291|292|(2:294|296)|(2:298|300))|301|(0)|304|(0)(0)|(0)|327|326|(0)(0)|323) */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x07c9, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x086c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0878 A[LOOP:13: B:517:0x0876->B:518:0x0878, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:530:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0842 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v13 */
    @Override // f2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        int i10;
        int i11;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintAnchor constraintAnchor;
        int i12;
        androidx.constraintlayout.core.c cVar;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        int i13;
        int i14;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintAnchor constraintAnchor2;
        boolean z10;
        boolean z11;
        char c;
        boolean z12;
        int i15;
        int i16;
        boolean z13;
        boolean z14;
        ArrayList<ConstraintWidget> arrayList;
        boolean z15;
        ConstraintAnchor constraintAnchor3;
        boolean z16;
        int i17;
        boolean z17;
        int max;
        int max2;
        ?? r82;
        int i18;
        int i19;
        int i20;
        int max3;
        int max4;
        boolean z18;
        WeakReference<ConstraintAnchor> weakReference;
        WeakReference<ConstraintAnchor> weakReference2;
        WeakReference<ConstraintAnchor> weakReference3;
        WeakReference<ConstraintAnchor> weakReference4;
        ConstraintAnchor constraintAnchor4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7;
        int i21;
        j jVar;
        j jVar2;
        boolean z19;
        int b5;
        androidx.constraintlayout.core.c cVar2;
        boolean z20;
        j jVar3;
        j jVar4;
        ArrayList arrayList2;
        a aVar;
        a aVar2;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z21;
        int i26;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour8;
        this.f4239b0 = 0;
        this.c0 = 0;
        this.G0 = false;
        this.H0 = false;
        int size = this.f10897s0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, l());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviourArr2[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviourArr2[0];
        int i27 = this.f4338v0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintAnchor constraintAnchor5 = this.L;
        ConstraintAnchor constraintAnchor6 = this.K;
        if (i27 == 0 && g.b(this.F0, 1)) {
            b.InterfaceC0121b interfaceC0121b = this.f4339w0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = dimensionBehaviourArr2[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = dimensionBehaviourArr2[1];
            E();
            ArrayList<ConstraintWidget> arrayList3 = this.f10897s0;
            int size2 = arrayList3.size();
            i11 = max6;
            for (int i28 = 0; i28 < size2; i28++) {
                arrayList3.get(i28).E();
            }
            boolean z22 = this.f4340x0;
            if (dimensionBehaviour13 == dimensionBehaviour12) {
                dimensionBehaviourArr = dimensionBehaviourArr2;
                I(0, q());
            } else {
                dimensionBehaviourArr = dimensionBehaviourArr2;
                constraintAnchor6.l(0);
                this.f4239b0 = 0;
            }
            boolean z23 = false;
            int i29 = 0;
            boolean z24 = false;
            while (i29 < size2) {
                ConstraintAnchor constraintAnchor7 = constraintAnchor6;
                ConstraintWidget constraintWidget = arrayList3.get(i29);
                int i30 = max5;
                if (constraintWidget instanceof f) {
                    f fVar = (f) constraintWidget;
                    dimensionBehaviour8 = dimensionBehaviour9;
                    if (fVar.f4367w0 == 1) {
                        int i31 = fVar.f4364t0;
                        if (i31 == -1) {
                            if (fVar.f4365u0 != -1 && A()) {
                                i31 = q() - fVar.f4365u0;
                            } else {
                                if (A()) {
                                    i31 = (int) ((fVar.f4363s0 * q()) + 0.5f);
                                }
                                z23 = true;
                            }
                        }
                        fVar.f4366v0.l(i31);
                        fVar.f4368x0 = true;
                        z23 = true;
                    }
                } else {
                    dimensionBehaviour8 = dimensionBehaviour9;
                    if ((constraintWidget instanceof a) && ((a) constraintWidget).S() == 0) {
                        z24 = true;
                    }
                }
                i29++;
                max5 = i30;
                constraintAnchor6 = constraintAnchor7;
                dimensionBehaviour9 = dimensionBehaviour8;
            }
            i10 = max5;
            dimensionBehaviour = dimensionBehaviour9;
            constraintAnchor = constraintAnchor6;
            if (z23) {
                for (int i32 = 0; i32 < size2; i32++) {
                    ConstraintWidget constraintWidget2 = arrayList3.get(i32);
                    if (constraintWidget2 instanceof f) {
                        f fVar2 = (f) constraintWidget2;
                        if (fVar2.f4367w0 == 1) {
                            g2.f.b(0, fVar2, interfaceC0121b, z22);
                        }
                    }
                }
            }
            g2.f.b(0, this, interfaceC0121b, z22);
            if (z24) {
                for (int i33 = 0; i33 < size2; i33++) {
                    ConstraintWidget constraintWidget3 = arrayList3.get(i33);
                    if (constraintWidget3 instanceof a) {
                        a aVar3 = (a) constraintWidget3;
                        if (aVar3.S() == 0 && aVar3.R()) {
                            g2.f.b(1, aVar3, interfaceC0121b, z22);
                        }
                    }
                }
            }
            if (dimensionBehaviour14 == dimensionBehaviour12) {
                J(0, l());
            } else {
                constraintAnchor5.l(0);
                this.c0 = 0;
            }
            boolean z25 = false;
            boolean z26 = false;
            for (int i34 = 0; i34 < size2; i34++) {
                ConstraintWidget constraintWidget4 = arrayList3.get(i34);
                if (constraintWidget4 instanceof f) {
                    f fVar3 = (f) constraintWidget4;
                    if (fVar3.f4367w0 == 0) {
                        int i35 = fVar3.f4364t0;
                        if (i35 == -1) {
                            if (fVar3.f4365u0 != -1 && B()) {
                                i35 = l() - fVar3.f4365u0;
                            } else if (B()) {
                                i35 = (int) ((fVar3.f4363s0 * l()) + 0.5f);
                            } else {
                                z25 = true;
                            }
                        }
                        fVar3.f4366v0.l(i35);
                        fVar3.f4368x0 = true;
                        z25 = true;
                    }
                } else if ((constraintWidget4 instanceof a) && ((a) constraintWidget4).S() == 1) {
                    z26 = true;
                }
            }
            if (z25) {
                for (int i36 = 0; i36 < size2; i36++) {
                    ConstraintWidget constraintWidget5 = arrayList3.get(i36);
                    if (constraintWidget5 instanceof f) {
                        f fVar4 = (f) constraintWidget5;
                        if (fVar4.f4367w0 == 0) {
                            g2.f.g(1, fVar4, interfaceC0121b);
                        }
                    }
                }
            }
            g2.f.g(0, this, interfaceC0121b);
            if (z26) {
                for (int i37 = 0; i37 < size2; i37++) {
                    ConstraintWidget constraintWidget6 = arrayList3.get(i37);
                    if (constraintWidget6 instanceof a) {
                        a aVar4 = (a) constraintWidget6;
                        if (aVar4.S() == 1 && aVar4.R()) {
                            g2.f.g(1, aVar4, interfaceC0121b);
                        }
                    }
                }
            }
            for (int i38 = 0; i38 < size2; i38++) {
                ConstraintWidget constraintWidget7 = arrayList3.get(i38);
                if (constraintWidget7.z() && g2.f.a(constraintWidget7)) {
                    U(constraintWidget7, interfaceC0121b, g2.f.f11213a);
                    if (constraintWidget7 instanceof f) {
                        if (((f) constraintWidget7).f4367w0 == 0) {
                            i26 = 0;
                        } else {
                            g2.f.b(0, constraintWidget7, interfaceC0121b, z22);
                        }
                    } else {
                        i26 = 0;
                        g2.f.b(0, constraintWidget7, interfaceC0121b, z22);
                    }
                    g2.f.g(i26, constraintWidget7, interfaceC0121b);
                }
            }
            for (int i39 = 0; i39 < size; i39++) {
                ConstraintWidget constraintWidget8 = this.f10897s0.get(i39);
                if (constraintWidget8.z() && !(constraintWidget8 instanceof f) && !(constraintWidget8 instanceof a) && !(constraintWidget8 instanceof h) && !constraintWidget8.H) {
                    ConstraintWidget.DimensionBehaviour k3 = constraintWidget8.k(0);
                    ConstraintWidget.DimensionBehaviour k10 = constraintWidget8.k(1);
                    if (k3 == dimensionBehaviour11 && constraintWidget8.f4269s != 1 && k10 == dimensionBehaviour11 && constraintWidget8.f4270t != 1) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (!z21) {
                        U(constraintWidget8, this.f4339w0, new b.a());
                    }
                }
            }
        } else {
            i10 = max5;
            i11 = max6;
            dimensionBehaviourArr = dimensionBehaviourArr2;
            dimensionBehaviour = dimensionBehaviour9;
            constraintAnchor = constraintAnchor6;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        androidx.constraintlayout.core.c cVar3 = this.f4341y0;
        if (size > 2) {
            dimensionBehaviour3 = dimensionBehaviour;
            if ((dimensionBehaviour10 == dimensionBehaviour15 || dimensionBehaviour3 == dimensionBehaviour15) && g.b(this.F0, 1024)) {
                b.InterfaceC0121b interfaceC0121b2 = this.f4339w0;
                ArrayList<ConstraintWidget> arrayList4 = this.f10897s0;
                int size3 = arrayList4.size();
                int i40 = 0;
                while (i40 < size3) {
                    ConstraintWidget constraintWidget9 = arrayList4.get(i40);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = dimensionBehaviourArr[1];
                    constraintAnchor2 = constraintAnchor5;
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = constraintWidget9.V;
                    i12 = size;
                    if (g2.g.b(dimensionBehaviour16, dimensionBehaviour17, dimensionBehaviourArr3[0], dimensionBehaviourArr3[1]) && !(constraintWidget9 instanceof e)) {
                        i40++;
                        constraintAnchor5 = constraintAnchor2;
                        size = i12;
                    }
                    cVar = cVar3;
                    dimensionBehaviour6 = dimensionBehaviour3;
                    dimensionBehaviour7 = dimensionBehaviour10;
                    z19 = false;
                    dimensionBehaviour4 = dimensionBehaviour15;
                    dimensionBehaviour5 = dimensionBehaviour12;
                    break;
                }
                i12 = size;
                constraintAnchor2 = constraintAnchor5;
                int i41 = 0;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                ArrayList arrayList7 = null;
                ArrayList arrayList8 = null;
                ArrayList arrayList9 = null;
                ArrayList arrayList10 = null;
                while (i41 < size3) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = dimensionBehaviour3;
                    ConstraintWidget constraintWidget10 = arrayList4.get(i41);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = dimensionBehaviour10;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = dimensionBehaviour12;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = dimensionBehaviourArr[1];
                    androidx.constraintlayout.core.c cVar4 = cVar3;
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = constraintWidget10.V;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour23 = dimensionBehaviour15;
                    if (!g2.g.b(dimensionBehaviour20, dimensionBehaviour22, dimensionBehaviourArr4[0], dimensionBehaviourArr4[1])) {
                        U(constraintWidget10, interfaceC0121b2, this.N0);
                    }
                    boolean z27 = constraintWidget10 instanceof f;
                    if (z27) {
                        f fVar5 = (f) constraintWidget10;
                        if (fVar5.f4367w0 == 0) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(fVar5);
                        }
                        if (fVar5.f4367w0 == 1) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(fVar5);
                        }
                    }
                    if (constraintWidget10 instanceof f2.b) {
                        if (constraintWidget10 instanceof a) {
                            a aVar5 = (a) constraintWidget10;
                            if (aVar5.S() == 0) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(aVar5);
                            }
                            int S = aVar5.S();
                            aVar = aVar5;
                            if (S == 1) {
                                if (arrayList8 == null) {
                                    arrayList2 = new ArrayList();
                                    aVar2 = aVar5;
                                    arrayList8 = arrayList2;
                                    aVar = aVar2;
                                }
                                arrayList8.add(aVar);
                            }
                        } else {
                            f2.b bVar = (f2.b) constraintWidget10;
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(bVar);
                            aVar = bVar;
                            if (arrayList8 == null) {
                                arrayList2 = new ArrayList();
                                aVar2 = bVar;
                                arrayList8 = arrayList2;
                                aVar = aVar2;
                            }
                            arrayList8.add(aVar);
                        }
                    }
                    if (constraintWidget10.K.f4224f == null && constraintWidget10.M.f4224f == null && !z27 && !(constraintWidget10 instanceof a)) {
                        if (arrayList9 == null) {
                            arrayList9 = new ArrayList();
                        }
                        arrayList9.add(constraintWidget10);
                    }
                    if (constraintWidget10.L.f4224f == null && constraintWidget10.N.f4224f == null && constraintWidget10.O.f4224f == null && !z27 && !(constraintWidget10 instanceof a)) {
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                        }
                        ArrayList arrayList11 = arrayList10;
                        arrayList11.add(constraintWidget10);
                        arrayList10 = arrayList11;
                    }
                    i41++;
                    dimensionBehaviour10 = dimensionBehaviour19;
                    dimensionBehaviour3 = dimensionBehaviour18;
                    dimensionBehaviour12 = dimensionBehaviour21;
                    cVar3 = cVar4;
                    dimensionBehaviour15 = dimensionBehaviour23;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour24 = dimensionBehaviour15;
                androidx.constraintlayout.core.c cVar5 = cVar3;
                dimensionBehaviour6 = dimensionBehaviour3;
                dimensionBehaviour7 = dimensionBehaviour10;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour25 = dimensionBehaviour12;
                ArrayList<j> arrayList12 = new ArrayList<>();
                if (arrayList5 != null) {
                    Iterator it = arrayList5.iterator();
                    while (it.hasNext()) {
                        g2.g.a((f) it.next(), 0, arrayList12, null);
                    }
                }
                j jVar5 = null;
                int i42 = 0;
                if (arrayList6 != null) {
                    Iterator it2 = arrayList6.iterator();
                    while (it2.hasNext()) {
                        f2.b bVar2 = (f2.b) it2.next();
                        j a10 = g2.g.a(bVar2, i42, arrayList12, jVar5);
                        bVar2.Q(i42, a10, arrayList12);
                        a10.a(arrayList12);
                        jVar5 = null;
                        i42 = 0;
                    }
                }
                HashSet<ConstraintAnchor> hashSet = j(ConstraintAnchor.Type.LEFT).f4220a;
                if (hashSet != null) {
                    Iterator<ConstraintAnchor> it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        g2.g.a(it3.next().f4222d, 0, arrayList12, null);
                    }
                }
                HashSet<ConstraintAnchor> hashSet2 = j(ConstraintAnchor.Type.RIGHT).f4220a;
                if (hashSet2 != null) {
                    Iterator<ConstraintAnchor> it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        g2.g.a(it4.next().f4222d, 0, arrayList12, null);
                    }
                }
                ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
                HashSet<ConstraintAnchor> hashSet3 = j(type).f4220a;
                if (hashSet3 != null) {
                    Iterator<ConstraintAnchor> it5 = hashSet3.iterator();
                    while (it5.hasNext()) {
                        g2.g.a(it5.next().f4222d, 0, arrayList12, null);
                    }
                }
                j jVar6 = null;
                if (arrayList9 != null) {
                    Iterator it6 = arrayList9.iterator();
                    while (it6.hasNext()) {
                        g2.g.a((ConstraintWidget) it6.next(), 0, arrayList12, null);
                    }
                }
                if (arrayList7 != null) {
                    Iterator it7 = arrayList7.iterator();
                    while (it7.hasNext()) {
                        g2.g.a((f) it7.next(), 1, arrayList12, null);
                    }
                }
                int i43 = 1;
                if (arrayList8 != null) {
                    Iterator it8 = arrayList8.iterator();
                    while (it8.hasNext()) {
                        f2.b bVar3 = (f2.b) it8.next();
                        j a11 = g2.g.a(bVar3, i43, arrayList12, jVar6);
                        bVar3.Q(i43, a11, arrayList12);
                        a11.a(arrayList12);
                        jVar6 = null;
                        i43 = 1;
                    }
                }
                HashSet<ConstraintAnchor> hashSet4 = j(ConstraintAnchor.Type.TOP).f4220a;
                if (hashSet4 != null) {
                    Iterator<ConstraintAnchor> it9 = hashSet4.iterator();
                    while (it9.hasNext()) {
                        g2.g.a(it9.next().f4222d, 1, arrayList12, null);
                    }
                }
                HashSet<ConstraintAnchor> hashSet5 = j(ConstraintAnchor.Type.BASELINE).f4220a;
                if (hashSet5 != null) {
                    Iterator<ConstraintAnchor> it10 = hashSet5.iterator();
                    while (it10.hasNext()) {
                        g2.g.a(it10.next().f4222d, 1, arrayList12, null);
                    }
                }
                HashSet<ConstraintAnchor> hashSet6 = j(ConstraintAnchor.Type.BOTTOM).f4220a;
                if (hashSet6 != null) {
                    Iterator<ConstraintAnchor> it11 = hashSet6.iterator();
                    while (it11.hasNext()) {
                        g2.g.a(it11.next().f4222d, 1, arrayList12, null);
                    }
                }
                HashSet<ConstraintAnchor> hashSet7 = j(type).f4220a;
                if (hashSet7 != null) {
                    Iterator<ConstraintAnchor> it12 = hashSet7.iterator();
                    while (it12.hasNext()) {
                        g2.g.a(it12.next().f4222d, 1, arrayList12, null);
                    }
                }
                char c10 = 1;
                if (arrayList10 != null) {
                    Iterator it13 = arrayList10.iterator();
                    while (it13.hasNext()) {
                        g2.g.a((ConstraintWidget) it13.next(), 1, arrayList12, null);
                    }
                }
                int i44 = 0;
                while (i44 < size3) {
                    ConstraintWidget constraintWidget11 = arrayList4.get(i44);
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr5 = constraintWidget11.V;
                    if (dimensionBehaviourArr5[0] == dimensionBehaviour11 && dimensionBehaviourArr5[c10] == dimensionBehaviour11) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if (z20) {
                        int i45 = constraintWidget11.f4266q0;
                        int size4 = arrayList12.size();
                        int i46 = 0;
                        while (true) {
                            if (i46 < size4) {
                                jVar3 = arrayList12.get(i46);
                                if (i45 == jVar3.f11218b) {
                                    break;
                                }
                                i46++;
                            } else {
                                jVar3 = null;
                                break;
                            }
                        }
                        int i47 = constraintWidget11.f4268r0;
                        int size5 = arrayList12.size();
                        int i48 = 0;
                        while (true) {
                            if (i48 < size5) {
                                jVar4 = arrayList12.get(i48);
                                if (i47 == jVar4.f11218b) {
                                    break;
                                }
                                i48++;
                            } else {
                                jVar4 = null;
                                break;
                            }
                        }
                        if (jVar3 != null && jVar4 != null) {
                            jVar3.c(0, jVar4);
                            jVar4.c = 2;
                            arrayList12.remove(jVar3);
                        }
                    }
                    i44++;
                    c10 = 1;
                }
                int i49 = 1;
                if (arrayList12.size() <= 1) {
                    dimensionBehaviour5 = dimensionBehaviour25;
                    cVar = cVar5;
                    dimensionBehaviour4 = dimensionBehaviour24;
                } else {
                    int i50 = 0;
                    dimensionBehaviour4 = dimensionBehaviour24;
                    if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                        Iterator<j> it14 = arrayList12.iterator();
                        int i51 = 0;
                        jVar = null;
                        while (it14.hasNext()) {
                            j next = it14.next();
                            if (next.c == i49) {
                                cVar2 = cVar5;
                            } else {
                                cVar2 = cVar5;
                                int b10 = next.b(cVar2, i50);
                                if (b10 > i51) {
                                    jVar = next;
                                    i51 = b10;
                                }
                            }
                            cVar5 = cVar2;
                            i50 = 0;
                            i49 = 1;
                        }
                        cVar = cVar5;
                        dimensionBehaviour5 = dimensionBehaviour25;
                        if (jVar != null) {
                            L(dimensionBehaviour5);
                            N(i51);
                            i21 = 1;
                            if (dimensionBehaviourArr[i21] == dimensionBehaviour4) {
                                Iterator<j> it15 = arrayList12.iterator();
                                int i52 = 0;
                                jVar2 = null;
                                while (it15.hasNext()) {
                                    j next2 = it15.next();
                                    if (next2.c != 0 && (b5 = next2.b(cVar, i21)) > i52) {
                                        jVar2 = next2;
                                        i52 = b5;
                                    }
                                    i21 = 1;
                                }
                                if (jVar2 != null) {
                                    M(dimensionBehaviour5);
                                    K(i52);
                                    if (jVar == null) {
                                        if (jVar2 == null) {
                                        }
                                    }
                                    z19 = true;
                                    if (!z19) {
                                        dimensionBehaviour2 = dimensionBehaviour7;
                                        if (dimensionBehaviour2 == dimensionBehaviour4) {
                                            i22 = i10;
                                            if (i22 < q() && i22 > 0) {
                                                N(i22);
                                                this.G0 = true;
                                            } else {
                                                i23 = q();
                                                dimensionBehaviour3 = dimensionBehaviour6;
                                                if (dimensionBehaviour3 != dimensionBehaviour4) {
                                                    i24 = i11;
                                                    if (i24 < l() && i24 > 0) {
                                                        K(i24);
                                                        this.H0 = true;
                                                    } else {
                                                        i25 = l();
                                                        i13 = i25;
                                                        i14 = i23;
                                                        z10 = true;
                                                        if (!V(64) && !V(128)) {
                                                            z11 = false;
                                                            cVar.getClass();
                                                            cVar.f4206g = false;
                                                            if (this.F0 == 0 && z11) {
                                                                c = 1;
                                                                cVar.f4206g = true;
                                                            } else {
                                                                c = 1;
                                                            }
                                                            ArrayList<ConstraintWidget> arrayList13 = this.f10897s0;
                                                            if (dimensionBehaviourArr[0] != dimensionBehaviour4 && dimensionBehaviourArr[c] != dimensionBehaviour4) {
                                                                z12 = false;
                                                                this.B0 = 0;
                                                                this.C0 = 0;
                                                                i15 = i12;
                                                                for (i16 = 0; i16 < i15; i16++) {
                                                                    ConstraintWidget constraintWidget12 = this.f10897s0.get(i16);
                                                                    if (constraintWidget12 instanceof f2.c) {
                                                                        ((f2.c) constraintWidget12).Q();
                                                                    }
                                                                }
                                                                boolean V = V(64);
                                                                boolean z28 = z10;
                                                                int i53 = 0;
                                                                z13 = true;
                                                                while (z13) {
                                                                    int i54 = i53 + 1;
                                                                    try {
                                                                        cVar.u();
                                                                        z15 = z13;
                                                                        try {
                                                                            this.B0 = 0;
                                                                            this.C0 = 0;
                                                                            h(cVar);
                                                                            for (int i55 = 0; i55 < i15; i55++) {
                                                                                this.f10897s0.get(i55).h(cVar);
                                                                            }
                                                                            S(cVar);
                                                                            try {
                                                                                weakReference = this.I0;
                                                                            } catch (Exception e10) {
                                                                                e = e10;
                                                                                arrayList = arrayList13;
                                                                                constraintAnchor3 = constraintAnchor2;
                                                                                z16 = z28;
                                                                            }
                                                                        } catch (Exception e11) {
                                                                            e = e11;
                                                                            arrayList = arrayList13;
                                                                            constraintAnchor3 = constraintAnchor2;
                                                                            z16 = z28;
                                                                            e.printStackTrace();
                                                                            PrintStream printStream = System.out;
                                                                            printStream.println("EXCEPTION : " + e);
                                                                            boolean[] zArr = g.f4369a;
                                                                            if (!z15) {
                                                                            }
                                                                            if (z12) {
                                                                            }
                                                                            max = Math.max(this.f4243e0, q());
                                                                            if (max > q()) {
                                                                            }
                                                                            max2 = Math.max(this.f4245f0, l());
                                                                            if (max2 <= l()) {
                                                                            }
                                                                            if (!z16) {
                                                                            }
                                                                            i18 = i17;
                                                                            z28 = z16;
                                                                            i19 = 8;
                                                                            if (i54 <= i19) {
                                                                            }
                                                                            i53 = i54;
                                                                            i13 = i18;
                                                                            constraintAnchor2 = constraintAnchor3;
                                                                            arrayList13 = arrayList;
                                                                        }
                                                                    } catch (Exception e12) {
                                                                        e = e12;
                                                                        arrayList = arrayList13;
                                                                        z15 = z13;
                                                                    }
                                                                    if (weakReference != null) {
                                                                        try {
                                                                        } catch (Exception e13) {
                                                                            e = e13;
                                                                            arrayList = arrayList13;
                                                                            constraintAnchor3 = constraintAnchor2;
                                                                            z16 = z28;
                                                                        }
                                                                        if (weakReference.get() != null) {
                                                                            ConstraintAnchor constraintAnchor8 = constraintAnchor2;
                                                                            z16 = z28;
                                                                            try {
                                                                                arrayList = arrayList13;
                                                                                constraintAnchor3 = constraintAnchor8;
                                                                            } catch (Exception e14) {
                                                                                e = e14;
                                                                                arrayList = arrayList13;
                                                                                constraintAnchor3 = constraintAnchor8;
                                                                            }
                                                                            try {
                                                                                cVar.f(cVar.l(this.I0.get()), cVar.l(constraintAnchor8), 0, 5);
                                                                                this.I0 = null;
                                                                                weakReference2 = this.K0;
                                                                                if (weakReference2 != null && weakReference2.get() != null) {
                                                                                    cVar.f(cVar.l(this.N), cVar.l(this.K0.get()), 0, 5);
                                                                                    this.K0 = null;
                                                                                }
                                                                                weakReference3 = this.J0;
                                                                                if (weakReference3 != null && weakReference3.get() != null) {
                                                                                    constraintAnchor4 = constraintAnchor;
                                                                                    try {
                                                                                        constraintAnchor = constraintAnchor4;
                                                                                        cVar.f(cVar.l(this.J0.get()), cVar.l(constraintAnchor4), 0, 5);
                                                                                    } catch (Exception e15) {
                                                                                        e = e15;
                                                                                        constraintAnchor = constraintAnchor4;
                                                                                        z15 = true;
                                                                                        e.printStackTrace();
                                                                                        PrintStream printStream2 = System.out;
                                                                                        printStream2.println("EXCEPTION : " + e);
                                                                                        boolean[] zArr2 = g.f4369a;
                                                                                        if (!z15) {
                                                                                        }
                                                                                        if (z12) {
                                                                                        }
                                                                                        max = Math.max(this.f4243e0, q());
                                                                                        if (max > q()) {
                                                                                        }
                                                                                        max2 = Math.max(this.f4245f0, l());
                                                                                        if (max2 <= l()) {
                                                                                        }
                                                                                        if (!z16) {
                                                                                        }
                                                                                        i18 = i17;
                                                                                        z28 = z16;
                                                                                        i19 = 8;
                                                                                        if (i54 <= i19) {
                                                                                        }
                                                                                        i53 = i54;
                                                                                        i13 = i18;
                                                                                        constraintAnchor2 = constraintAnchor3;
                                                                                        arrayList13 = arrayList;
                                                                                    }
                                                                                    try {
                                                                                        this.J0 = null;
                                                                                    } catch (Exception e16) {
                                                                                        e = e16;
                                                                                        z15 = true;
                                                                                        e.printStackTrace();
                                                                                        PrintStream printStream22 = System.out;
                                                                                        printStream22.println("EXCEPTION : " + e);
                                                                                        boolean[] zArr22 = g.f4369a;
                                                                                        if (!z15) {
                                                                                        }
                                                                                        if (z12) {
                                                                                        }
                                                                                        max = Math.max(this.f4243e0, q());
                                                                                        if (max > q()) {
                                                                                        }
                                                                                        max2 = Math.max(this.f4245f0, l());
                                                                                        if (max2 <= l()) {
                                                                                        }
                                                                                        if (!z16) {
                                                                                        }
                                                                                        i18 = i17;
                                                                                        z28 = z16;
                                                                                        i19 = 8;
                                                                                        if (i54 <= i19) {
                                                                                        }
                                                                                        i53 = i54;
                                                                                        i13 = i18;
                                                                                        constraintAnchor2 = constraintAnchor3;
                                                                                        arrayList13 = arrayList;
                                                                                    }
                                                                                }
                                                                                weakReference4 = this.L0;
                                                                                if (weakReference4 == null && weakReference4.get() != null) {
                                                                                    cVar.f(cVar.l(this.M), cVar.l(this.L0.get()), 0, 5);
                                                                                    this.L0 = null;
                                                                                }
                                                                                cVar.q();
                                                                                z15 = true;
                                                                            } catch (Exception e17) {
                                                                                e = e17;
                                                                                z15 = true;
                                                                                e.printStackTrace();
                                                                                PrintStream printStream222 = System.out;
                                                                                printStream222.println("EXCEPTION : " + e);
                                                                                boolean[] zArr222 = g.f4369a;
                                                                                if (!z15) {
                                                                                }
                                                                                if (z12) {
                                                                                }
                                                                                max = Math.max(this.f4243e0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f4245f0, l());
                                                                                if (max2 <= l()) {
                                                                                }
                                                                                if (!z16) {
                                                                                }
                                                                                i18 = i17;
                                                                                z28 = z16;
                                                                                i19 = 8;
                                                                                if (i54 <= i19) {
                                                                                }
                                                                                i53 = i54;
                                                                                i13 = i18;
                                                                                constraintAnchor2 = constraintAnchor3;
                                                                                arrayList13 = arrayList;
                                                                            }
                                                                            boolean[] zArr2222 = g.f4369a;
                                                                            if (!z15) {
                                                                                zArr2222[2] = false;
                                                                                boolean V2 = V(64);
                                                                                P(cVar, V2);
                                                                                int size6 = this.f10897s0.size();
                                                                                int i56 = 0;
                                                                                z17 = false;
                                                                                while (i56 < size6) {
                                                                                    int i57 = size6;
                                                                                    ConstraintWidget constraintWidget13 = this.f10897s0.get(i56);
                                                                                    constraintWidget13.P(cVar, V2);
                                                                                    boolean z29 = V2;
                                                                                    int i58 = i13;
                                                                                    if (constraintWidget13.f4250i == -1 && constraintWidget13.f4252j == -1) {
                                                                                        z18 = false;
                                                                                        if (!z18) {
                                                                                            z17 = true;
                                                                                        }
                                                                                        i56++;
                                                                                        size6 = i57;
                                                                                        V2 = z29;
                                                                                        i13 = i58;
                                                                                    }
                                                                                    z18 = true;
                                                                                    if (!z18) {
                                                                                    }
                                                                                    i56++;
                                                                                    size6 = i57;
                                                                                    V2 = z29;
                                                                                    i13 = i58;
                                                                                }
                                                                                i17 = i13;
                                                                            } else {
                                                                                i17 = i13;
                                                                                P(cVar, V);
                                                                                for (int i59 = 0; i59 < i15; i59++) {
                                                                                    this.f10897s0.get(i59).P(cVar, V);
                                                                                }
                                                                                z17 = false;
                                                                            }
                                                                            if (z12 && i54 < 8 && zArr2222[2]) {
                                                                                int i60 = 0;
                                                                                int i61 = 0;
                                                                                for (i20 = 0; i20 < i15; i20++) {
                                                                                    ConstraintWidget constraintWidget14 = this.f10897s0.get(i20);
                                                                                    i61 = Math.max(i61, constraintWidget14.q() + constraintWidget14.f4239b0);
                                                                                    i60 = Math.max(i60, constraintWidget14.l() + constraintWidget14.c0);
                                                                                }
                                                                                max3 = Math.max(this.f4243e0, i61);
                                                                                max4 = Math.max(this.f4245f0, i60);
                                                                                if (dimensionBehaviour2 == dimensionBehaviour4 && q() < max3) {
                                                                                    N(max3);
                                                                                    dimensionBehaviourArr[0] = dimensionBehaviour4;
                                                                                    z17 = true;
                                                                                    z16 = true;
                                                                                }
                                                                                if (dimensionBehaviour3 == dimensionBehaviour4 && l() < max4) {
                                                                                    K(max4);
                                                                                    dimensionBehaviourArr[1] = dimensionBehaviour4;
                                                                                    z17 = true;
                                                                                    z16 = true;
                                                                                }
                                                                            }
                                                                            max = Math.max(this.f4243e0, q());
                                                                            if (max > q()) {
                                                                                N(max);
                                                                                dimensionBehaviourArr[0] = dimensionBehaviour5;
                                                                                z17 = true;
                                                                                z16 = true;
                                                                            }
                                                                            max2 = Math.max(this.f4245f0, l());
                                                                            if (max2 <= l()) {
                                                                                K(max2);
                                                                                r82 = 1;
                                                                                dimensionBehaviourArr[1] = dimensionBehaviour5;
                                                                                z17 = true;
                                                                                z16 = true;
                                                                            } else {
                                                                                r82 = 1;
                                                                            }
                                                                            if (!z16) {
                                                                                if (dimensionBehaviourArr[0] == dimensionBehaviour4 && i14 > 0 && q() > i14) {
                                                                                    this.G0 = r82;
                                                                                    dimensionBehaviourArr[0] = dimensionBehaviour5;
                                                                                    N(i14);
                                                                                    z17 = true;
                                                                                    z16 = true;
                                                                                }
                                                                                if (dimensionBehaviourArr[r82] == dimensionBehaviour4 && i17 > 0) {
                                                                                    i18 = i17;
                                                                                    if (l() > i18) {
                                                                                        this.H0 = r82;
                                                                                        dimensionBehaviourArr[r82] = dimensionBehaviour5;
                                                                                        K(i18);
                                                                                        i19 = 8;
                                                                                        z28 = true;
                                                                                        z17 = true;
                                                                                        if (i54 <= i19) {
                                                                                            z13 = false;
                                                                                        } else {
                                                                                            z13 = z17;
                                                                                        }
                                                                                        i53 = i54;
                                                                                        i13 = i18;
                                                                                        constraintAnchor2 = constraintAnchor3;
                                                                                        arrayList13 = arrayList;
                                                                                    }
                                                                                    z28 = z16;
                                                                                    i19 = 8;
                                                                                    if (i54 <= i19) {
                                                                                    }
                                                                                    i53 = i54;
                                                                                    i13 = i18;
                                                                                    constraintAnchor2 = constraintAnchor3;
                                                                                    arrayList13 = arrayList;
                                                                                }
                                                                            }
                                                                            i18 = i17;
                                                                            z28 = z16;
                                                                            i19 = 8;
                                                                            if (i54 <= i19) {
                                                                            }
                                                                            i53 = i54;
                                                                            i13 = i18;
                                                                            constraintAnchor2 = constraintAnchor3;
                                                                            arrayList13 = arrayList;
                                                                        }
                                                                    }
                                                                    arrayList = arrayList13;
                                                                    constraintAnchor3 = constraintAnchor2;
                                                                    z16 = z28;
                                                                    weakReference2 = this.K0;
                                                                    if (weakReference2 != null) {
                                                                        cVar.f(cVar.l(this.N), cVar.l(this.K0.get()), 0, 5);
                                                                        this.K0 = null;
                                                                    }
                                                                    weakReference3 = this.J0;
                                                                    if (weakReference3 != null) {
                                                                        constraintAnchor4 = constraintAnchor;
                                                                        constraintAnchor = constraintAnchor4;
                                                                        cVar.f(cVar.l(this.J0.get()), cVar.l(constraintAnchor4), 0, 5);
                                                                        this.J0 = null;
                                                                    }
                                                                    weakReference4 = this.L0;
                                                                    if (weakReference4 == null) {
                                                                    }
                                                                    cVar.q();
                                                                    z15 = true;
                                                                    boolean[] zArr22222 = g.f4369a;
                                                                    if (!z15) {
                                                                    }
                                                                    if (z12) {
                                                                        int i602 = 0;
                                                                        int i612 = 0;
                                                                        while (i20 < i15) {
                                                                        }
                                                                        max3 = Math.max(this.f4243e0, i612);
                                                                        max4 = Math.max(this.f4245f0, i602);
                                                                        if (dimensionBehaviour2 == dimensionBehaviour4) {
                                                                            N(max3);
                                                                            dimensionBehaviourArr[0] = dimensionBehaviour4;
                                                                            z17 = true;
                                                                            z16 = true;
                                                                        }
                                                                        if (dimensionBehaviour3 == dimensionBehaviour4) {
                                                                            K(max4);
                                                                            dimensionBehaviourArr[1] = dimensionBehaviour4;
                                                                            z17 = true;
                                                                            z16 = true;
                                                                        }
                                                                    }
                                                                    max = Math.max(this.f4243e0, q());
                                                                    if (max > q()) {
                                                                    }
                                                                    max2 = Math.max(this.f4245f0, l());
                                                                    if (max2 <= l()) {
                                                                    }
                                                                    if (!z16) {
                                                                    }
                                                                    i18 = i17;
                                                                    z28 = z16;
                                                                    i19 = 8;
                                                                    if (i54 <= i19) {
                                                                    }
                                                                    i53 = i54;
                                                                    i13 = i18;
                                                                    constraintAnchor2 = constraintAnchor3;
                                                                    arrayList13 = arrayList;
                                                                }
                                                                z14 = z28;
                                                                this.f10897s0 = arrayList13;
                                                                if (z14) {
                                                                    dimensionBehaviourArr[0] = dimensionBehaviour2;
                                                                    dimensionBehaviourArr[1] = dimensionBehaviour3;
                                                                }
                                                                F(cVar.f4211l);
                                                            }
                                                            z12 = true;
                                                            this.B0 = 0;
                                                            this.C0 = 0;
                                                            i15 = i12;
                                                            while (i16 < i15) {
                                                            }
                                                            boolean V3 = V(64);
                                                            boolean z282 = z10;
                                                            int i532 = 0;
                                                            z13 = true;
                                                            while (z13) {
                                                            }
                                                            z14 = z282;
                                                            this.f10897s0 = arrayList13;
                                                            if (z14) {
                                                            }
                                                            F(cVar.f4211l);
                                                        }
                                                        z11 = true;
                                                        cVar.getClass();
                                                        cVar.f4206g = false;
                                                        if (this.F0 == 0) {
                                                        }
                                                        c = 1;
                                                        ArrayList<ConstraintWidget> arrayList132 = this.f10897s0;
                                                        if (dimensionBehaviourArr[0] != dimensionBehaviour4) {
                                                            z12 = false;
                                                            this.B0 = 0;
                                                            this.C0 = 0;
                                                            i15 = i12;
                                                            while (i16 < i15) {
                                                            }
                                                            boolean V32 = V(64);
                                                            boolean z2822 = z10;
                                                            int i5322 = 0;
                                                            z13 = true;
                                                            while (z13) {
                                                            }
                                                            z14 = z2822;
                                                            this.f10897s0 = arrayList132;
                                                            if (z14) {
                                                            }
                                                            F(cVar.f4211l);
                                                        }
                                                        z12 = true;
                                                        this.B0 = 0;
                                                        this.C0 = 0;
                                                        i15 = i12;
                                                        while (i16 < i15) {
                                                        }
                                                        boolean V322 = V(64);
                                                        boolean z28222 = z10;
                                                        int i53222 = 0;
                                                        z13 = true;
                                                        while (z13) {
                                                        }
                                                        z14 = z28222;
                                                        this.f10897s0 = arrayList132;
                                                        if (z14) {
                                                        }
                                                        F(cVar.f4211l);
                                                    }
                                                } else {
                                                    i24 = i11;
                                                }
                                                i25 = i24;
                                                i13 = i25;
                                                i14 = i23;
                                                z10 = true;
                                                if (!V(64)) {
                                                    z11 = false;
                                                    cVar.getClass();
                                                    cVar.f4206g = false;
                                                    if (this.F0 == 0) {
                                                    }
                                                    c = 1;
                                                    ArrayList<ConstraintWidget> arrayList1322 = this.f10897s0;
                                                    if (dimensionBehaviourArr[0] != dimensionBehaviour4) {
                                                    }
                                                    z12 = true;
                                                    this.B0 = 0;
                                                    this.C0 = 0;
                                                    i15 = i12;
                                                    while (i16 < i15) {
                                                    }
                                                    boolean V3222 = V(64);
                                                    boolean z282222 = z10;
                                                    int i532222 = 0;
                                                    z13 = true;
                                                    while (z13) {
                                                    }
                                                    z14 = z282222;
                                                    this.f10897s0 = arrayList1322;
                                                    if (z14) {
                                                    }
                                                    F(cVar.f4211l);
                                                }
                                                z11 = true;
                                                cVar.getClass();
                                                cVar.f4206g = false;
                                                if (this.F0 == 0) {
                                                }
                                                c = 1;
                                                ArrayList<ConstraintWidget> arrayList13222 = this.f10897s0;
                                                if (dimensionBehaviourArr[0] != dimensionBehaviour4) {
                                                }
                                                z12 = true;
                                                this.B0 = 0;
                                                this.C0 = 0;
                                                i15 = i12;
                                                while (i16 < i15) {
                                                }
                                                boolean V32222 = V(64);
                                                boolean z2822222 = z10;
                                                int i5322222 = 0;
                                                z13 = true;
                                                while (z13) {
                                                }
                                                z14 = z2822222;
                                                this.f10897s0 = arrayList13222;
                                                if (z14) {
                                                }
                                                F(cVar.f4211l);
                                            }
                                        } else {
                                            i22 = i10;
                                        }
                                        i23 = i22;
                                        dimensionBehaviour3 = dimensionBehaviour6;
                                        if (dimensionBehaviour3 != dimensionBehaviour4) {
                                        }
                                        i25 = i24;
                                        i13 = i25;
                                        i14 = i23;
                                        z10 = true;
                                        if (!V(64)) {
                                        }
                                        z11 = true;
                                        cVar.getClass();
                                        cVar.f4206g = false;
                                        if (this.F0 == 0) {
                                        }
                                        c = 1;
                                        ArrayList<ConstraintWidget> arrayList132222 = this.f10897s0;
                                        if (dimensionBehaviourArr[0] != dimensionBehaviour4) {
                                        }
                                        z12 = true;
                                        this.B0 = 0;
                                        this.C0 = 0;
                                        i15 = i12;
                                        while (i16 < i15) {
                                        }
                                        boolean V322222 = V(64);
                                        boolean z28222222 = z10;
                                        int i53222222 = 0;
                                        z13 = true;
                                        while (z13) {
                                        }
                                        z14 = z28222222;
                                        this.f10897s0 = arrayList132222;
                                        if (z14) {
                                        }
                                        F(cVar.f4211l);
                                    }
                                    i13 = i11;
                                    i14 = i10;
                                    dimensionBehaviour2 = dimensionBehaviour7;
                                    dimensionBehaviour3 = dimensionBehaviour6;
                                }
                            }
                            jVar2 = null;
                            if (jVar == null) {
                            }
                            z19 = true;
                            if (!z19) {
                            }
                        }
                    } else {
                        dimensionBehaviour5 = dimensionBehaviour25;
                        cVar = cVar5;
                    }
                    i21 = 1;
                    jVar = null;
                    if (dimensionBehaviourArr[i21] == dimensionBehaviour4) {
                    }
                    jVar2 = null;
                    if (jVar == null) {
                    }
                    z19 = true;
                    if (!z19) {
                    }
                }
                z19 = false;
                if (!z19) {
                }
            } else {
                i12 = size;
                cVar = cVar3;
                dimensionBehaviour2 = dimensionBehaviour10;
                constraintAnchor2 = constraintAnchor5;
                i13 = i11;
                i14 = i10;
                dimensionBehaviour4 = dimensionBehaviour15;
                dimensionBehaviour5 = dimensionBehaviour12;
            }
        } else {
            i12 = size;
            cVar = cVar3;
            dimensionBehaviour2 = dimensionBehaviour10;
            i13 = i11;
            i14 = i10;
            dimensionBehaviour3 = dimensionBehaviour;
            dimensionBehaviour4 = dimensionBehaviour15;
            dimensionBehaviour5 = dimensionBehaviour12;
            constraintAnchor2 = constraintAnchor5;
        }
        z10 = false;
        if (!V(64)) {
        }
        z11 = true;
        cVar.getClass();
        cVar.f4206g = false;
        if (this.F0 == 0) {
        }
        c = 1;
        ArrayList<ConstraintWidget> arrayList1322222 = this.f10897s0;
        if (dimensionBehaviourArr[0] != dimensionBehaviour4) {
        }
        z12 = true;
        this.B0 = 0;
        this.C0 = 0;
        i15 = i12;
        while (i16 < i15) {
        }
        boolean V3222222 = V(64);
        boolean z282222222 = z10;
        int i532222222 = 0;
        z13 = true;
        while (z13) {
        }
        z14 = z282222222;
        this.f10897s0 = arrayList1322222;
        if (z14) {
        }
        F(cVar.f4211l);
    }

    public final void R(int i10, ConstraintWidget constraintWidget) {
        if (i10 == 0) {
            int i11 = this.B0 + 1;
            c[] cVarArr = this.E0;
            if (i11 >= cVarArr.length) {
                this.E0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.E0;
            int i12 = this.B0;
            cVarArr2[i12] = new c(constraintWidget, 0, this.f4340x0);
            this.B0 = i12 + 1;
        } else if (i10 == 1) {
            int i13 = this.C0 + 1;
            c[] cVarArr3 = this.D0;
            if (i13 >= cVarArr3.length) {
                this.D0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.D0;
            int i14 = this.C0;
            cVarArr4[i14] = new c(constraintWidget, 1, this.f4340x0);
            this.C0 = i14 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(androidx.constraintlayout.core.c cVar) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean V = V(64);
        c(cVar, V);
        int size = this.f10897s0.size();
        boolean z14 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = this.f10897s0.get(i11);
            boolean[] zArr = constraintWidget.U;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof a) {
                z14 = true;
            }
        }
        if (z14) {
            for (int i12 = 0; i12 < size; i12++) {
                ConstraintWidget constraintWidget2 = this.f10897s0.get(i12);
                if (constraintWidget2 instanceof a) {
                    a aVar = (a) constraintWidget2;
                    for (int i13 = 0; i13 < aVar.f10896t0; i13++) {
                        ConstraintWidget constraintWidget3 = aVar.f10895s0[i13];
                        if (aVar.f4283v0 || constraintWidget3.d()) {
                            int i14 = aVar.f4282u0;
                            if (i14 != 0 && i14 != 1) {
                                if (i14 == 2 || i14 == 3) {
                                    constraintWidget3.U[1] = true;
                                }
                            }
                            constraintWidget3.U[0] = true;
                        }
                    }
                }
            }
        }
        HashSet<ConstraintWidget> hashSet = this.M0;
        hashSet.clear();
        for (int i15 = 0; i15 < size; i15++) {
            ConstraintWidget constraintWidget4 = this.f10897s0.get(i15);
            constraintWidget4.getClass();
            if (!(constraintWidget4 instanceof h) && !(constraintWidget4 instanceof f)) {
                z13 = false;
                if (z13) {
                    if (constraintWidget4 instanceof h) {
                        hashSet.add(constraintWidget4);
                    } else {
                        constraintWidget4.c(cVar, V);
                    }
                }
            }
            z13 = true;
            if (z13) {
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<ConstraintWidget> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h hVar = (h) it.next();
                int i16 = 0;
                while (true) {
                    if (i16 < hVar.f10896t0) {
                        if (hashSet.contains(hVar.f10895s0[i16])) {
                            z12 = true;
                            continue;
                            break;
                        }
                        i16++;
                    } else {
                        z12 = false;
                        continue;
                        break;
                    }
                }
                if (z12) {
                    hVar.c(cVar, V);
                    hashSet.remove(hVar);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<ConstraintWidget> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().c(cVar, V);
                }
                hashSet.clear();
            }
        }
        boolean z15 = androidx.constraintlayout.core.c.f4199p;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (z15) {
            HashSet<ConstraintWidget> hashSet2 = new HashSet<>();
            for (int i17 = 0; i17 < size; i17++) {
                ConstraintWidget constraintWidget5 = this.f10897s0.get(i17);
                constraintWidget5.getClass();
                if (!(constraintWidget5 instanceof h) && !(constraintWidget5 instanceof f)) {
                    z11 = false;
                    if (z11) {
                        hashSet2.add(constraintWidget5);
                    }
                }
                z11 = true;
                if (z11) {
                }
            }
            if (this.V[0] == dimensionBehaviour) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            b(this, cVar, hashSet2, i10, false);
            Iterator<ConstraintWidget> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next = it3.next();
                g.a(this, cVar, next);
                next.c(cVar, V);
            }
        } else {
            for (int i18 = 0; i18 < size; i18++) {
                ConstraintWidget constraintWidget6 = this.f10897s0.get(i18);
                if (constraintWidget6 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.V;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour2 == dimensionBehaviour) {
                        constraintWidget6.L(dimensionBehaviour4);
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        constraintWidget6.M(dimensionBehaviour4);
                    }
                    constraintWidget6.c(cVar, V);
                    if (dimensionBehaviour2 == dimensionBehaviour) {
                        constraintWidget6.L(dimensionBehaviour2);
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        constraintWidget6.M(dimensionBehaviour3);
                    }
                } else {
                    g.a(this, cVar, constraintWidget6);
                    if (!(constraintWidget6 instanceof h) && !(constraintWidget6 instanceof f)) {
                        z10 = false;
                        if (z10) {
                            constraintWidget6.c(cVar, V);
                        }
                    }
                    z10 = true;
                    if (z10) {
                    }
                }
            }
        }
        if (this.B0 > 0) {
            b.a(this, cVar, null, 0);
        }
        if (this.C0 > 0) {
            b.a(this, cVar, null, 1);
        }
    }

    public final boolean T(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        androidx.constraintlayout.core.widgets.analyzer.a aVar;
        int l2;
        boolean z13 = z10 & true;
        g2.e eVar = this.f4337u0;
        d dVar = eVar.f11206a;
        ConstraintWidget.DimensionBehaviour k3 = dVar.k(0);
        ConstraintWidget.DimensionBehaviour k10 = dVar.k(1);
        int r3 = dVar.r();
        int s10 = dVar.s();
        ArrayList<WidgetRun> arrayList = eVar.f11209e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (z13 && (k3 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || k10 == dimensionBehaviour)) {
            Iterator<WidgetRun> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WidgetRun next = it.next();
                if (next.f4309f == i10 && !next.k()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && k3 == dimensionBehaviour) {
                    dVar.L(dimensionBehaviour2);
                    dVar.N(eVar.d(dVar, 0));
                    aVar = dVar.f4240d.f4308e;
                    l2 = dVar.q();
                    aVar.d(l2);
                }
            } else if (z13 && k10 == dimensionBehaviour) {
                dVar.M(dimensionBehaviour2);
                dVar.K(eVar.d(dVar, 1));
                aVar = dVar.f4242e.f4308e;
                l2 = dVar.l();
                aVar.d(l2);
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = dVar.V;
        if (i10 == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
            if (dimensionBehaviour4 != dimensionBehaviour2 && dimensionBehaviour4 != dimensionBehaviour3) {
                z11 = false;
            }
            int q10 = dVar.q() + r3;
            dVar.f4240d.f4312i.d(q10);
            dVar.f4240d.f4308e.d(q10 - r3);
            z11 = true;
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[1];
            if (dimensionBehaviour5 != dimensionBehaviour2) {
                if (dimensionBehaviour5 == dimensionBehaviour3) {
                }
                z11 = false;
            }
            int l4 = dVar.l() + s10;
            dVar.f4242e.f4312i.d(l4);
            dVar.f4242e.f4308e.d(l4 - s10);
            z11 = true;
        }
        eVar.g();
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            WidgetRun next2 = it2.next();
            if (next2.f4309f == i10 && (next2.f4306b != dVar || next2.f4310g)) {
                next2.e();
            }
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next3 = it3.next();
            if (next3.f4309f == i10 && (z11 || next3.f4306b != dVar)) {
                if (next3.f4311h.f4294j) {
                    if (next3.f4312i.f4294j) {
                        if (!(next3 instanceof g2.c) && !next3.f4308e.f4294j) {
                        }
                    }
                }
                z12 = false;
                break;
            }
        }
        z12 = true;
        dVar.L(k3);
        dVar.M(k10);
        return z12;
    }

    public final boolean V(int i10) {
        return (this.F0 & i10) == i10;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void n(StringBuilder sb) {
        sb.append(this.f4254k + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.X);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.Y);
        sb.append("\n");
        Iterator<ConstraintWidget> it = this.f10897s0.iterator();
        while (it.hasNext()) {
            it.next().n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
