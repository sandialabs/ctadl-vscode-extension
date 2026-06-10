package g2;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends WidgetRun {

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<WidgetRun> f11204k;

    /* renamed from: l  reason: collision with root package name */
    public int f11205l;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r2.f4224f == r6) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(int i10, ConstraintWidget constraintWidget) {
        super(constraintWidget);
        ConstraintAnchor constraintAnchor;
        ConstraintWidget constraintWidget2;
        WidgetRun widgetRun;
        boolean z10;
        int i11;
        this.f11204k = new ArrayList<>();
        this.f4309f = i10;
        ConstraintWidget constraintWidget3 = this.f4306b;
        while (true) {
            int i12 = this.f4309f;
            if (i12 == 0) {
                ConstraintAnchor constraintAnchor2 = constraintWidget3.K;
                constraintAnchor = constraintAnchor2.f4224f;
                if (constraintAnchor != null) {
                }
                constraintWidget2 = null;
            } else {
                if (i12 == 1) {
                    ConstraintAnchor constraintAnchor3 = constraintWidget3.L;
                    constraintAnchor = constraintAnchor3.f4224f;
                    constraintWidget2 = (constraintAnchor != null && constraintAnchor.f4224f == constraintAnchor3) ? constraintAnchor.f4222d : constraintWidget2;
                } else {
                    constraintWidget3.getClass();
                }
                constraintWidget2 = null;
            }
            if (constraintWidget2 == null) {
                break;
            }
            constraintWidget3 = constraintWidget2;
        }
        this.f4306b = constraintWidget3;
        int i13 = this.f4309f;
        if (i13 == 0) {
            widgetRun = constraintWidget3.f4240d;
        } else if (i13 == 1) {
            widgetRun = constraintWidget3.f4242e;
        } else {
            widgetRun = null;
        }
        ArrayList<WidgetRun> arrayList = this.f11204k;
        while (true) {
            arrayList.add(widgetRun);
            constraintWidget3 = constraintWidget3.m(this.f4309f);
            if (constraintWidget3 == null) {
                break;
            }
            int i14 = this.f4309f;
            if (i14 == 0) {
                widgetRun = constraintWidget3.f4240d;
            } else if (i14 == 1) {
                widgetRun = constraintWidget3.f4242e;
            } else {
                widgetRun = null;
            }
        }
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            int i15 = this.f4309f;
            if (i15 == 0) {
                next.f4306b.f4238b = this;
            } else if (i15 == 1) {
                next.f4306b.c = this;
            }
        }
        if (this.f4309f == 0 && ((androidx.constraintlayout.core.widgets.d) this.f4306b.W).f4340x0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && arrayList.size() > 1) {
            this.f4306b = arrayList.get(arrayList.size() - 1).f4306b;
        }
        if (this.f4309f == 0) {
            i11 = this.f4306b.f4257l0;
        } else {
            i11 = this.f4306b.f4259m0;
        }
        this.f11205l = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:278:0x03c0, code lost:
        r3 = r3 - r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, g2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        boolean z10;
        int i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ArrayList<WidgetRun> arrayList;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        boolean z11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ArrayList<WidgetRun> arrayList2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f11;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        int i27;
        int i28;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        int i29;
        int i30;
        int i31;
        float f12;
        int i32;
        int i33;
        int i34;
        boolean z12;
        boolean z13;
        int i35;
        int i36;
        DependencyNode dependencyNode = this.f4311h;
        if (dependencyNode.f4294j) {
            DependencyNode dependencyNode2 = this.f4312i;
            if (dependencyNode2.f4294j) {
                ConstraintWidget constraintWidget = this.f4306b.W;
                if (constraintWidget instanceof androidx.constraintlayout.core.widgets.d) {
                    z10 = ((androidx.constraintlayout.core.widgets.d) constraintWidget).f4340x0;
                } else {
                    z10 = false;
                }
                int i37 = dependencyNode2.f4291g - dependencyNode.f4291g;
                ArrayList<WidgetRun> arrayList3 = this.f11204k;
                int size = arrayList3.size();
                int i38 = 0;
                while (true) {
                    i10 = -1;
                    if (i38 < size) {
                        if (arrayList3.get(i38).f4306b.f4253j0 != 8) {
                            break;
                        }
                        i38++;
                    } else {
                        i38 = -1;
                        break;
                    }
                }
                int i39 = size - 1;
                int i40 = i39;
                while (true) {
                    if (i40 < 0) {
                        break;
                    } else if (arrayList3.get(i40).f4306b.f4253j0 != 8) {
                        i10 = i40;
                        break;
                    } else {
                        i40--;
                    }
                }
                int i41 = 0;
                while (true) {
                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (i41 < 2) {
                        i15 = 0;
                        int i42 = 0;
                        i33 = 0;
                        i34 = 0;
                        f10 = 0.0f;
                        while (i42 < size) {
                            WidgetRun widgetRun = arrayList3.get(i42);
                            ConstraintWidget constraintWidget2 = widgetRun.f4306b;
                            ArrayList<WidgetRun> arrayList4 = arrayList3;
                            int i43 = size;
                            if (constraintWidget2.f4253j0 == 8) {
                                i35 = i38;
                            } else {
                                i34++;
                                if (i42 > 0 && i42 >= i38) {
                                    i15 += widgetRun.f4311h.f4290f;
                                }
                                androidx.constraintlayout.core.widgets.analyzer.a aVar = widgetRun.f4308e;
                                int i44 = aVar.f4291g;
                                if (widgetRun.f4307d != dimensionBehaviour) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    int i45 = this.f4309f;
                                    z13 = z12;
                                    if (i45 == 0 && !constraintWidget2.f4240d.f4308e.f4294j) {
                                        return;
                                    }
                                    if (i45 == 1 && !constraintWidget2.f4242e.f4308e.f4294j) {
                                        return;
                                    }
                                    i35 = i38;
                                } else {
                                    z13 = z12;
                                    i35 = i38;
                                    if (widgetRun.f4305a == 1 && i41 == 0) {
                                        i36 = aVar.f4317m;
                                        i33++;
                                    } else if (aVar.f4294j) {
                                        i36 = i44;
                                    }
                                    z13 = true;
                                    if (z13) {
                                        i33++;
                                        float f13 = constraintWidget2.f4260n0[this.f4309f];
                                        if (f13 >= 0.0f) {
                                            f10 += f13;
                                        }
                                    } else {
                                        i15 += i36;
                                    }
                                    if (i42 < i39 && i42 < i10) {
                                        i15 += -widgetRun.f4312i.f4290f;
                                    }
                                }
                                i36 = i44;
                                if (z13) {
                                }
                                if (i42 < i39) {
                                    i15 += -widgetRun.f4312i.f4290f;
                                }
                            }
                            i42++;
                            arrayList3 = arrayList4;
                            size = i43;
                            i38 = i35;
                        }
                        arrayList = arrayList3;
                        i11 = size;
                        i12 = i38;
                        if (i15 < i37 || i33 == 0) {
                            break;
                        }
                        i41++;
                        arrayList3 = arrayList;
                        size = i11;
                        i38 = i12;
                    } else {
                        arrayList = arrayList3;
                        i11 = size;
                        i12 = i38;
                        i13 = 0;
                        i14 = 0;
                        i15 = 0;
                        f10 = 0.0f;
                        break;
                    }
                }
                i13 = i33;
                i14 = i34;
                int i46 = dependencyNode.f4291g;
                if (z10) {
                    i46 = dependencyNode2.f4291g;
                }
                if (i15 > i37) {
                    int i47 = (int) (((i15 - i37) / 2.0f) + 0.5f);
                    if (z10) {
                        i46 += i47;
                    } else {
                        i46 -= i47;
                    }
                }
                if (i13 > 0) {
                    float f14 = i37 - i15;
                    int i48 = (int) ((f14 / i13) + 0.5f);
                    i16 = i11;
                    int i49 = 0;
                    int i50 = 0;
                    while (i49 < i16) {
                        ArrayList<WidgetRun> arrayList5 = arrayList;
                        int i51 = i48;
                        WidgetRun widgetRun2 = arrayList5.get(i49);
                        int i52 = i15;
                        ConstraintWidget constraintWidget3 = widgetRun2.f4306b;
                        int i53 = i46;
                        boolean z14 = z10;
                        if (constraintWidget3.f4253j0 != 8 && widgetRun2.f4307d == dimensionBehaviour) {
                            androidx.constraintlayout.core.widgets.analyzer.a aVar2 = widgetRun2.f4308e;
                            if (!aVar2.f4294j) {
                                if (f10 > 0.0f) {
                                    dimensionBehaviour4 = dimensionBehaviour;
                                    i29 = (int) (((constraintWidget3.f4260n0[this.f4309f] * f14) / f10) + 0.5f);
                                } else {
                                    dimensionBehaviour4 = dimensionBehaviour;
                                    i29 = i51;
                                }
                                if (this.f4309f == 0) {
                                    i30 = constraintWidget3.f4273w;
                                    i31 = constraintWidget3.f4272v;
                                } else {
                                    i30 = constraintWidget3.f4276z;
                                    i31 = constraintWidget3.f4275y;
                                }
                                f12 = f14;
                                if (widgetRun2.f4305a == 1) {
                                    i32 = Math.min(i29, aVar2.f4317m);
                                } else {
                                    i32 = i29;
                                }
                                int max = Math.max(i31, i32);
                                if (i30 > 0) {
                                    max = Math.min(i30, max);
                                }
                                if (max != i29) {
                                    i50++;
                                    i29 = max;
                                }
                                aVar2.d(i29);
                                i49++;
                                i15 = i52;
                                i48 = i51;
                                i46 = i53;
                                z10 = z14;
                                dimensionBehaviour = dimensionBehaviour4;
                                f14 = f12;
                                arrayList = arrayList5;
                            }
                        }
                        f12 = f14;
                        dimensionBehaviour4 = dimensionBehaviour;
                        i49++;
                        i15 = i52;
                        i48 = i51;
                        i46 = i53;
                        z10 = z14;
                        dimensionBehaviour = dimensionBehaviour4;
                        f14 = f12;
                        arrayList = arrayList5;
                    }
                    i19 = i46;
                    z11 = z10;
                    int i54 = i15;
                    dimensionBehaviour2 = dimensionBehaviour;
                    arrayList2 = arrayList;
                    if (i50 > 0) {
                        i13 -= i50;
                        int i55 = 0;
                        int i56 = 0;
                        while (i55 < i16) {
                            WidgetRun widgetRun3 = arrayList2.get(i55);
                            if (widgetRun3.f4306b.f4253j0 == 8) {
                                i28 = i12;
                            } else {
                                i28 = i12;
                                if (i55 > 0 && i55 >= i28) {
                                    i56 += widgetRun3.f4311h.f4290f;
                                }
                                i56 += widgetRun3.f4308e.f4291g;
                                if (i55 < i39 && i55 < i10) {
                                    i56 += -widgetRun3.f4312i.f4290f;
                                }
                            }
                            i55++;
                            i12 = i28;
                        }
                        i17 = i12;
                        i15 = i56;
                    } else {
                        i17 = i12;
                        i15 = i54;
                    }
                    i18 = 2;
                    if (this.f11205l == 2 && i50 == 0) {
                        this.f11205l = 0;
                        if (i15 > i37) {
                            this.f11205l = i18;
                        }
                        if (i14 > 0 && i13 == 0 && i17 == i10) {
                            this.f11205l = i18;
                        }
                        i20 = this.f11205l;
                        if (i20 != 1) {
                            if (i14 > 1) {
                                i25 = (i37 - i15) / (i14 - 1);
                            } else if (i14 == 1) {
                                i25 = (i37 - i15) / 2;
                            } else {
                                i25 = 0;
                            }
                            if (i13 > 0) {
                                i25 = 0;
                            }
                            int i57 = i19;
                            int i58 = 0;
                            while (i58 < i16) {
                                if (z11) {
                                    i26 = i16 - (i58 + 1);
                                } else {
                                    i26 = i58;
                                }
                                WidgetRun widgetRun4 = arrayList2.get(i26);
                                int i59 = widgetRun4.f4306b.f4253j0;
                                DependencyNode dependencyNode3 = widgetRun4.f4312i;
                                DependencyNode dependencyNode4 = widgetRun4.f4311h;
                                if (i59 == 8) {
                                    dependencyNode4.d(i57);
                                    dependencyNode3.d(i57);
                                    i27 = i25;
                                    dimensionBehaviour3 = dimensionBehaviour2;
                                } else {
                                    if (i58 > 0) {
                                        if (z11) {
                                            i57 -= i25;
                                        } else {
                                            i57 += i25;
                                        }
                                    }
                                    if (i58 > 0 && i58 >= i17) {
                                        int i60 = dependencyNode4.f4290f;
                                        if (z11) {
                                            i57 -= i60;
                                        } else {
                                            i57 += i60;
                                        }
                                    }
                                    if (z11) {
                                        dependencyNode3.d(i57);
                                    } else {
                                        dependencyNode4.d(i57);
                                    }
                                    androidx.constraintlayout.core.widgets.analyzer.a aVar3 = widgetRun4.f4308e;
                                    int i61 = aVar3.f4291g;
                                    dimensionBehaviour3 = dimensionBehaviour2;
                                    if (widgetRun4.f4307d == dimensionBehaviour3) {
                                        i27 = i25;
                                        if (widgetRun4.f4305a == 1) {
                                            i61 = aVar3.f4317m;
                                        }
                                    } else {
                                        i27 = i25;
                                    }
                                    if (z11) {
                                        i57 -= i61;
                                    } else {
                                        i57 += i61;
                                    }
                                    if (z11) {
                                        dependencyNode4.d(i57);
                                    } else {
                                        dependencyNode3.d(i57);
                                    }
                                    widgetRun4.f4310g = true;
                                    if (i58 < i39 && i58 < i10) {
                                        int i62 = -dependencyNode3.f4290f;
                                        if (z11) {
                                            i57 -= i62;
                                        } else {
                                            i57 += i62;
                                        }
                                    }
                                }
                                i58++;
                                i25 = i27;
                                dimensionBehaviour2 = dimensionBehaviour3;
                            }
                            return;
                        }
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviour2;
                        if (i20 == 0) {
                            int i63 = (i37 - i15) / (i14 + 1);
                            if (i13 > 0) {
                                i63 = 0;
                            }
                            int i64 = i19;
                            for (int i65 = 0; i65 < i16; i65++) {
                                if (z11) {
                                    i23 = i16 - (i65 + 1);
                                } else {
                                    i23 = i65;
                                }
                                WidgetRun widgetRun5 = arrayList2.get(i23);
                                int i66 = widgetRun5.f4306b.f4253j0;
                                DependencyNode dependencyNode5 = widgetRun5.f4312i;
                                DependencyNode dependencyNode6 = widgetRun5.f4311h;
                                if (i66 == 8) {
                                    dependencyNode6.d(i64);
                                    dependencyNode5.d(i64);
                                } else {
                                    if (z11) {
                                        i24 = i64 - i63;
                                    } else {
                                        i24 = i64 + i63;
                                    }
                                    if (i65 > 0 && i65 >= i17) {
                                        int i67 = dependencyNode6.f4290f;
                                        if (z11) {
                                            i24 -= i67;
                                        } else {
                                            i24 += i67;
                                        }
                                    }
                                    if (z11) {
                                        dependencyNode5.d(i24);
                                    } else {
                                        dependencyNode6.d(i24);
                                    }
                                    androidx.constraintlayout.core.widgets.analyzer.a aVar4 = widgetRun5.f4308e;
                                    int i68 = aVar4.f4291g;
                                    if (widgetRun5.f4307d == dimensionBehaviour5 && widgetRun5.f4305a == 1) {
                                        i68 = Math.min(i68, aVar4.f4317m);
                                    }
                                    if (z11) {
                                        i64 = i24 - i68;
                                    } else {
                                        i64 = i24 + i68;
                                    }
                                    if (z11) {
                                        dependencyNode6.d(i64);
                                    } else {
                                        dependencyNode5.d(i64);
                                    }
                                    if (i65 < i39 && i65 < i10) {
                                        int i69 = -dependencyNode5.f4290f;
                                        if (z11) {
                                            i64 -= i69;
                                        } else {
                                            i64 += i69;
                                        }
                                    }
                                }
                            }
                            return;
                        } else if (i20 == 2) {
                            if (this.f4309f == 0) {
                                f11 = this.f4306b.f4247g0;
                            } else {
                                f11 = this.f4306b.f4249h0;
                            }
                            if (z11) {
                                f11 = 1.0f - f11;
                            }
                            int i70 = (((int) ((((float) (i37 - i15)) * f11) + 0.5f)) < 0 || i13 > 0) ? 0 : 0;
                            if (z11) {
                                i21 = i19 - i70;
                            } else {
                                i21 = i19 + i70;
                            }
                            for (int i71 = 0; i71 < i16; i71++) {
                                if (z11) {
                                    i22 = i16 - (i71 + 1);
                                } else {
                                    i22 = i71;
                                }
                                WidgetRun widgetRun6 = arrayList2.get(i22);
                                int i72 = widgetRun6.f4306b.f4253j0;
                                DependencyNode dependencyNode7 = widgetRun6.f4312i;
                                DependencyNode dependencyNode8 = widgetRun6.f4311h;
                                if (i72 == 8) {
                                    dependencyNode8.d(i21);
                                    dependencyNode7.d(i21);
                                } else {
                                    if (i71 > 0 && i71 >= i17) {
                                        int i73 = dependencyNode8.f4290f;
                                        if (z11) {
                                            i21 -= i73;
                                        } else {
                                            i21 += i73;
                                        }
                                    }
                                    if (z11) {
                                        dependencyNode7.d(i21);
                                    } else {
                                        dependencyNode8.d(i21);
                                    }
                                    androidx.constraintlayout.core.widgets.analyzer.a aVar5 = widgetRun6.f4308e;
                                    int i74 = aVar5.f4291g;
                                    if (widgetRun6.f4307d == dimensionBehaviour5 && widgetRun6.f4305a == 1) {
                                        i74 = aVar5.f4317m;
                                    }
                                    i21 += i74;
                                    if (z11) {
                                        dependencyNode8.d(i21);
                                    } else {
                                        dependencyNode7.d(i21);
                                    }
                                    if (i71 < i39 && i71 < i10) {
                                        int i75 = -dependencyNode7.f4290f;
                                        if (z11) {
                                            i21 -= i75;
                                        } else {
                                            i21 += i75;
                                        }
                                    }
                                }
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    z11 = z10;
                    int i76 = i15;
                    dimensionBehaviour2 = dimensionBehaviour;
                    arrayList2 = arrayList;
                    i16 = i11;
                    i17 = i12;
                    i18 = 2;
                    i19 = i46;
                }
                if (i15 > i37) {
                }
                if (i14 > 0) {
                    this.f11205l = i18;
                }
                i20 = this.f11205l;
                if (i20 != 1) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
        if (r1 != null) goto L22;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        DependencyNode i10;
        int e10;
        ArrayList<WidgetRun> arrayList = this.f11204k;
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = arrayList.get(0).f4306b;
        ConstraintWidget constraintWidget2 = arrayList.get(size - 1).f4306b;
        int i11 = this.f4309f;
        DependencyNode dependencyNode = this.f4312i;
        DependencyNode dependencyNode2 = this.f4311h;
        if (i11 == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.K;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.M;
            DependencyNode i12 = WidgetRun.i(constraintAnchor, 0);
            int e11 = constraintAnchor.e();
            ConstraintWidget m10 = m();
            if (m10 != null) {
                e11 = m10.K.e();
            }
            if (i12 != null) {
                WidgetRun.b(dependencyNode2, i12, e11);
            }
            i10 = WidgetRun.i(constraintAnchor2, 0);
            e10 = constraintAnchor2.e();
            ConstraintWidget n = n();
            if (n != null) {
                e10 = n.M.e();
            }
            if (i10 != null) {
                WidgetRun.b(dependencyNode, i10, -e10);
            }
            dependencyNode2.f4286a = this;
            dependencyNode.f4286a = this;
            return;
        }
        ConstraintAnchor constraintAnchor3 = constraintWidget.L;
        ConstraintAnchor constraintAnchor4 = constraintWidget2.N;
        DependencyNode i13 = WidgetRun.i(constraintAnchor3, 1);
        int e12 = constraintAnchor3.e();
        ConstraintWidget m11 = m();
        if (m11 != null) {
            e12 = m11.L.e();
        }
        if (i13 != null) {
            WidgetRun.b(dependencyNode2, i13, e12);
        }
        i10 = WidgetRun.i(constraintAnchor4, 1);
        e10 = constraintAnchor4.e();
        ConstraintWidget n10 = n();
        if (n10 != null) {
            e10 = n10.N.e();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList<WidgetRun> arrayList = this.f11204k;
            if (i10 >= arrayList.size()) {
                return;
            }
            arrayList.get(i10).e();
            i10++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.c = null;
        Iterator<WidgetRun> it = this.f11204k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final long j() {
        ArrayList<WidgetRun> arrayList = this.f11204k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            WidgetRun widgetRun = arrayList.get(i10);
            j2 = widgetRun.f4312i.f4290f + widgetRun.j() + j2 + widgetRun.f4311h.f4290f;
        }
        return j2;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        ArrayList<WidgetRun> arrayList = this.f11204k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!arrayList.get(i10).k()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget m() {
        int i10 = 0;
        while (true) {
            ArrayList<WidgetRun> arrayList = this.f11204k;
            if (i10 < arrayList.size()) {
                ConstraintWidget constraintWidget = arrayList.get(i10).f4306b;
                if (constraintWidget.f4253j0 != 8) {
                    return constraintWidget;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final ConstraintWidget n() {
        ArrayList<WidgetRun> arrayList = this.f11204k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = arrayList.get(size).f4306b;
            if (constraintWidget.f4253j0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f4309f == 0 ? "horizontal : " : "vertical : ");
        Iterator<WidgetRun> it = this.f11204k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
