package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0275, code lost:
        if (r1.f4222d == r9) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fa, code lost:
        if (r5.f4222d == r13) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x042c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x048b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x051e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0577 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x06fb A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(d dVar, androidx.constraintlayout.core.c cVar, ArrayList<ConstraintWidget> arrayList, int i10) {
        int i11;
        c[] cVarArr;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ConstraintAnchor[] constraintAnchorArr;
        c[] cVarArr2;
        c cVar2;
        ArrayList<ConstraintWidget> arrayList2;
        c cVar3;
        int i15;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        int i16;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget constraintWidget3;
        int i17;
        int i18;
        ConstraintWidget constraintWidget4;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        ConstraintAnchor constraintAnchor6;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        int e10;
        ConstraintWidget constraintWidget5;
        ConstraintWidget constraintWidget6;
        ConstraintWidget constraintWidget7;
        ConstraintAnchor constraintAnchor7;
        int i19;
        ConstraintAnchor constraintAnchor8;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        int size;
        int i20;
        ArrayList<ConstraintWidget> arrayList3;
        float f10;
        c cVar4;
        int i21;
        ConstraintWidget constraintWidget8;
        d dVar2;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        int i22;
        int i23;
        ConstraintWidget constraintWidget9;
        boolean z16;
        ConstraintWidget constraintWidget10;
        ConstraintWidget constraintWidget11;
        int i24;
        int i25;
        int i26;
        ConstraintWidget constraintWidget12;
        ConstraintAnchor constraintAnchor9;
        ConstraintWidget constraintWidget13;
        int i27;
        d dVar3 = dVar;
        ArrayList<ConstraintWidget> arrayList4 = arrayList;
        if (i10 == 0) {
            i11 = dVar3.B0;
            cVarArr = dVar3.E0;
            i12 = 0;
        } else {
            i11 = dVar3.C0;
            cVarArr = dVar3.D0;
            i12 = 2;
        }
        int i28 = 0;
        while (i28 < i11) {
            c cVar5 = cVarArr[i28];
            boolean z17 = cVar5.f4335q;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            int i29 = 8;
            int i30 = 1;
            ConstraintWidget constraintWidget14 = cVar5.f4321a;
            if (z17) {
                i13 = i28;
                i14 = i11;
            } else {
                int i31 = cVar5.f4331l;
                int i32 = i31 * 2;
                ConstraintWidget constraintWidget15 = constraintWidget14;
                ConstraintWidget constraintWidget16 = constraintWidget15;
                boolean z18 = false;
                while (!z18) {
                    cVar5.f4328i += i30;
                    constraintWidget15.f4264p0[i31] = null;
                    constraintWidget15.f4262o0[i31] = null;
                    int i33 = constraintWidget15.f4253j0;
                    ConstraintAnchor[] constraintAnchorArr2 = constraintWidget15.S;
                    if (i33 != i29) {
                        constraintWidget15.k(i31);
                        constraintAnchorArr2[i32].e();
                        int i34 = i32 + 1;
                        constraintAnchorArr2[i34].e();
                        constraintAnchorArr2[i32].e();
                        constraintAnchorArr2[i34].e();
                        if (cVar5.f4322b == null) {
                            cVar5.f4322b = constraintWidget15;
                        }
                        cVar5.f4323d = constraintWidget15;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget15.V[i31];
                        if (dimensionBehaviour2 == dimensionBehaviour && ((i27 = constraintWidget15.f4271u[i31]) == 0 || i27 == 3 || i27 == 2)) {
                            cVar5.f4329j++;
                            float f11 = constraintWidget15.f4260n0[i31];
                            if (f11 > 0.0f) {
                                i25 = i28;
                                cVar5.f4330k += f11;
                            } else {
                                i25 = i28;
                            }
                            i26 = i11;
                            if (constraintWidget15.f4253j0 != 8 && dimensionBehaviour2 == dimensionBehaviour && (i27 == 0 || i27 == 3)) {
                                if (f11 < 0.0f) {
                                    cVar5.n = true;
                                } else {
                                    cVar5.f4333o = true;
                                }
                                if (cVar5.f4327h == null) {
                                    cVar5.f4327h = new ArrayList<>();
                                }
                                cVar5.f4327h.add(constraintWidget15);
                            }
                            if (cVar5.f4325f == null) {
                                cVar5.f4325f = constraintWidget15;
                            }
                            ConstraintWidget constraintWidget17 = cVar5.f4326g;
                            if (constraintWidget17 != null) {
                                constraintWidget17.f4262o0[i31] = constraintWidget15;
                            }
                            cVar5.f4326g = constraintWidget15;
                            constraintWidget12 = constraintWidget16;
                            if (constraintWidget12 != constraintWidget15) {
                                constraintWidget12.f4264p0[i31] = constraintWidget15;
                            }
                            constraintAnchor9 = constraintAnchorArr2[i32 + 1].f4224f;
                            if (constraintAnchor9 != null) {
                                constraintWidget13 = constraintAnchor9.f4222d;
                                ConstraintAnchor constraintAnchor10 = constraintWidget13.S[i32].f4224f;
                                if (constraintAnchor10 != null) {
                                }
                            }
                            constraintWidget13 = null;
                            if (constraintWidget13 != null) {
                                constraintWidget13 = constraintWidget15;
                                z18 = true;
                            }
                            constraintWidget16 = constraintWidget15;
                            i28 = i25;
                            i11 = i26;
                            i30 = 1;
                            i29 = 8;
                            constraintWidget15 = constraintWidget13;
                        }
                    }
                    i25 = i28;
                    i26 = i11;
                    constraintWidget12 = constraintWidget16;
                    if (constraintWidget12 != constraintWidget15) {
                    }
                    constraintAnchor9 = constraintAnchorArr2[i32 + 1].f4224f;
                    if (constraintAnchor9 != null) {
                    }
                    constraintWidget13 = null;
                    if (constraintWidget13 != null) {
                    }
                    constraintWidget16 = constraintWidget15;
                    i28 = i25;
                    i11 = i26;
                    i30 = 1;
                    i29 = 8;
                    constraintWidget15 = constraintWidget13;
                }
                i13 = i28;
                i14 = i11;
                ConstraintWidget constraintWidget18 = cVar5.f4322b;
                if (constraintWidget18 != null) {
                    constraintWidget18.S[i32].e();
                }
                ConstraintWidget constraintWidget19 = cVar5.f4323d;
                if (constraintWidget19 != null) {
                    constraintWidget19.S[i32 + 1].e();
                }
                cVar5.c = constraintWidget15;
                if (i31 == 0 && cVar5.f4332m) {
                    cVar5.f4324e = constraintWidget15;
                } else {
                    cVar5.f4324e = constraintWidget14;
                }
                cVar5.f4334p = cVar5.f4333o && cVar5.n;
            }
            cVar5.f4335q = true;
            if (arrayList4 != null && !arrayList4.contains(constraintWidget14)) {
                cVarArr2 = cVarArr;
                i16 = i13;
                i28 = i16 + 1;
                dVar3 = dVar;
                arrayList4 = arrayList;
                i11 = i14;
                cVarArr = cVarArr2;
            }
            ConstraintWidget constraintWidget20 = cVar5.c;
            ConstraintWidget constraintWidget21 = cVar5.f4322b;
            ConstraintWidget constraintWidget22 = cVar5.f4323d;
            ConstraintWidget constraintWidget23 = cVar5.f4324e;
            float f12 = cVar5.f4330k;
            boolean z19 = dVar3.V[i10] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (i10 == 0) {
                int i35 = constraintWidget23.f4257l0;
                boolean z20 = i35 == 0;
                z11 = i35 == 1;
                if (i35 == 2) {
                    z12 = z20;
                    z13 = z11;
                    z14 = z12;
                    z15 = true;
                } else {
                    z10 = z20;
                    z13 = z11;
                    z14 = z10;
                    z15 = false;
                }
            } else {
                int i36 = constraintWidget23.f4259m0;
                boolean z21 = i36 == 0;
                boolean z22 = i36 == 1;
                if (i36 == 2) {
                    z12 = z21;
                    z11 = z22;
                    z13 = z11;
                    z14 = z12;
                    z15 = true;
                } else {
                    z10 = z21;
                    z11 = z22;
                    z13 = z11;
                    z14 = z10;
                    z15 = false;
                }
            }
            ConstraintWidget constraintWidget24 = constraintWidget14;
            boolean z23 = false;
            while (true) {
                constraintAnchorArr = dVar3.S;
                if (z23) {
                    break;
                }
                boolean z24 = z23;
                ConstraintAnchor constraintAnchor11 = constraintWidget24.S[i12];
                int i37 = z15 ? 1 : 4;
                int e11 = constraintAnchor11.e();
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget24.V;
                c[] cVarArr3 = cVarArr;
                if (dimensionBehaviourArr[i10] == dimensionBehaviour && constraintWidget24.f4271u[i10] == 0) {
                    constraintWidget9 = constraintWidget23;
                    z16 = true;
                } else {
                    constraintWidget9 = constraintWidget23;
                    z16 = false;
                }
                ConstraintAnchor constraintAnchor12 = constraintAnchor11.f4224f;
                if (constraintAnchor12 != null && constraintWidget24 != constraintWidget14) {
                    e11 = constraintAnchor12.e() + e11;
                }
                int i38 = e11;
                if (!z15 || constraintWidget24 == constraintWidget14 || constraintWidget24 == constraintWidget21) {
                    constraintWidget10 = constraintWidget14;
                } else {
                    constraintWidget10 = constraintWidget14;
                    i37 = 8;
                }
                ConstraintAnchor constraintAnchor13 = constraintAnchor11.f4224f;
                c cVar6 = cVar5;
                if (constraintAnchor13 != null) {
                    if (constraintWidget24 == constraintWidget21) {
                        cVar.f(constraintAnchor11.f4227i, constraintAnchor13.f4227i, i38, 6);
                    } else {
                        cVar.f(constraintAnchor11.f4227i, constraintAnchor13.f4227i, i38, 8);
                    }
                    if (z16 && !z15) {
                        i37 = 5;
                    }
                    cVar.e(constraintAnchor11.f4227i, constraintAnchor11.f4224f.f4227i, i38, (constraintWidget24 == constraintWidget21 && z15 && constraintWidget24.U[i10]) ? 5 : i37);
                }
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget24.S;
                if (z19) {
                    if (constraintWidget24.f4253j0 == 8 || dimensionBehaviourArr[i10] != dimensionBehaviour) {
                        i24 = 0;
                    } else {
                        i24 = 0;
                        cVar.f(constraintAnchorArr3[i12 + 1].f4227i, constraintAnchorArr3[i12].f4227i, 0, 5);
                    }
                    cVar.f(constraintAnchorArr3[i12].f4227i, constraintAnchorArr[i12].f4227i, i24, 8);
                }
                ConstraintAnchor constraintAnchor14 = constraintAnchorArr3[i12 + 1].f4224f;
                if (constraintAnchor14 != null) {
                    constraintWidget11 = constraintAnchor14.f4222d;
                    ConstraintAnchor constraintAnchor15 = constraintWidget11.S[i12].f4224f;
                    if (constraintAnchor15 != null) {
                    }
                }
                constraintWidget11 = null;
                if (constraintWidget11 != null) {
                    constraintWidget24 = constraintWidget11;
                    z23 = z24;
                } else {
                    z23 = true;
                }
                dVar3 = dVar;
                constraintWidget14 = constraintWidget10;
                cVarArr = cVarArr3;
                constraintWidget23 = constraintWidget9;
                cVar5 = cVar6;
            }
            c cVar7 = cVar5;
            ConstraintWidget constraintWidget25 = constraintWidget23;
            ConstraintWidget constraintWidget26 = constraintWidget14;
            cVarArr2 = cVarArr;
            if (constraintWidget22 != null) {
                int i39 = i12 + 1;
                if (constraintWidget20.S[i39].f4224f != null) {
                    ConstraintAnchor constraintAnchor16 = constraintWidget22.S[i39];
                    if (!(constraintWidget22.V[i10] == dimensionBehaviour && constraintWidget22.f4271u[i10] == 0) || z15) {
                        dVar2 = dVar;
                    } else {
                        ConstraintAnchor constraintAnchor17 = constraintAnchor16.f4224f;
                        dVar2 = dVar;
                        if (constraintAnchor17.f4222d == dVar2) {
                            solverVariable7 = constraintAnchor16.f4227i;
                            solverVariable8 = constraintAnchor17.f4227i;
                            i22 = -constraintAnchor16.e();
                            i23 = 5;
                            cVar.e(solverVariable7, solverVariable8, i22, i23);
                            cVar.g(constraintAnchor16.f4227i, constraintWidget20.S[i39].f4224f.f4227i, -constraintAnchor16.e(), 6);
                            if (z19) {
                                int i40 = i12 + 1;
                                SolverVariable solverVariable9 = constraintAnchorArr[i40].f4227i;
                                ConstraintAnchor constraintAnchor18 = constraintWidget20.S[i40];
                                cVar.f(solverVariable9, constraintAnchor18.f4227i, constraintAnchor18.e(), 8);
                            }
                            cVar2 = cVar7;
                            arrayList2 = cVar2.f4327h;
                            if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                float f13 = (cVar2.n || cVar2.f4334p) ? f12 : cVar2.f4329j;
                                ConstraintWidget constraintWidget27 = null;
                                float f14 = 0.0f;
                                i20 = 0;
                                while (i20 < size) {
                                    ConstraintWidget constraintWidget28 = arrayList2.get(i20);
                                    float f15 = constraintWidget28.f4260n0[i10];
                                    ConstraintAnchor[] constraintAnchorArr4 = constraintWidget28.S;
                                    if (f15 >= 0.0f) {
                                        arrayList3 = arrayList2;
                                        f10 = 0.0f;
                                    } else if (cVar2.f4334p) {
                                        arrayList3 = arrayList2;
                                        cVar.e(constraintAnchorArr4[i12 + 1].f4227i, constraintAnchorArr4[i12].f4227i, 0, 4);
                                        cVar4 = cVar2;
                                        i21 = size;
                                        i20++;
                                        cVar2 = cVar4;
                                        arrayList2 = arrayList3;
                                        size = i21;
                                    } else {
                                        arrayList3 = arrayList2;
                                        f10 = 0.0f;
                                        f15 = 1.0f;
                                    }
                                    int i41 = (f15 > f10 ? 1 : (f15 == f10 ? 0 : -1));
                                    if (i41 == 0) {
                                        cVar.e(constraintAnchorArr4[i12 + 1].f4227i, constraintAnchorArr4[i12].f4227i, 0, 8);
                                        cVar4 = cVar2;
                                        i21 = size;
                                        i20++;
                                        cVar2 = cVar4;
                                        arrayList2 = arrayList3;
                                        size = i21;
                                    } else {
                                        if (constraintWidget27 != null) {
                                            ConstraintAnchor[] constraintAnchorArr5 = constraintWidget27.S;
                                            SolverVariable solverVariable10 = constraintAnchorArr5[i12].f4227i;
                                            int i42 = i12 + 1;
                                            SolverVariable solverVariable11 = constraintAnchorArr5[i42].f4227i;
                                            i21 = size;
                                            SolverVariable solverVariable12 = constraintAnchorArr4[i12].f4227i;
                                            SolverVariable solverVariable13 = constraintAnchorArr4[i42].f4227i;
                                            androidx.constraintlayout.core.b m10 = cVar.m();
                                            constraintWidget8 = constraintWidget28;
                                            m10.f4196b = 0.0f;
                                            cVar4 = cVar2;
                                            if (f13 != 0.0f && f14 != f15) {
                                                if (f14 == 0.0f) {
                                                    m10.f4197d.g(solverVariable10, 1.0f);
                                                    m10.f4197d.g(solverVariable11, -1.0f);
                                                } else if (i41 == 0) {
                                                    m10.f4197d.g(solverVariable12, 1.0f);
                                                    m10.f4197d.g(solverVariable13, -1.0f);
                                                } else {
                                                    float f16 = (f14 / f13) / (f15 / f13);
                                                    m10.f4197d.g(solverVariable10, 1.0f);
                                                    m10.f4197d.g(solverVariable11, -1.0f);
                                                    m10.f4197d.g(solverVariable13, f16);
                                                    m10.f4197d.g(solverVariable12, -f16);
                                                }
                                                cVar.c(m10);
                                            }
                                            m10.f4197d.g(solverVariable10, 1.0f);
                                            m10.f4197d.g(solverVariable11, -1.0f);
                                            m10.f4197d.g(solverVariable13, 1.0f);
                                            m10.f4197d.g(solverVariable12, -1.0f);
                                            cVar.c(m10);
                                        } else {
                                            cVar4 = cVar2;
                                            i21 = size;
                                            constraintWidget8 = constraintWidget28;
                                        }
                                        f14 = f15;
                                        constraintWidget27 = constraintWidget8;
                                        i20++;
                                        cVar2 = cVar4;
                                        arrayList2 = arrayList3;
                                        size = i21;
                                    }
                                }
                            }
                            cVar3 = cVar2;
                            if (constraintWidget21 == null && (constraintWidget21 == constraintWidget22 || z15)) {
                                ConstraintAnchor constraintAnchor19 = constraintWidget26.S[i12];
                                int i43 = i12 + 1;
                                ConstraintAnchor constraintAnchor20 = constraintWidget20.S[i43];
                                ConstraintAnchor constraintAnchor21 = constraintAnchor19.f4224f;
                                SolverVariable solverVariable14 = constraintAnchor21 != null ? constraintAnchor21.f4227i : null;
                                ConstraintAnchor constraintAnchor22 = constraintAnchor20.f4224f;
                                SolverVariable solverVariable15 = constraintAnchor22 != null ? constraintAnchor22.f4227i : null;
                                ConstraintAnchor constraintAnchor23 = constraintWidget21.S[i12];
                                if (constraintWidget22 != null) {
                                    constraintAnchor20 = constraintWidget22.S[i43];
                                }
                                if (solverVariable14 == null || solverVariable15 == null) {
                                    i15 = i13;
                                } else {
                                    i15 = i13;
                                    cVar.b(constraintAnchor23.f4227i, solverVariable14, constraintAnchor23.e(), i10 == 0 ? constraintWidget25.f4247g0 : constraintWidget25.f4249h0, solverVariable15, constraintAnchor20.f4227i, constraintAnchor20.e(), 7);
                                }
                            } else {
                                i15 = i13;
                                constraintWidget = constraintWidget26;
                                if (z14 || constraintWidget21 == null) {
                                    int i44 = 8;
                                    if (z13 && constraintWidget21 != null) {
                                        int i45 = cVar3.f4329j;
                                        boolean z25 = i45 <= 0 && cVar3.f4328i == i45;
                                        ConstraintWidget constraintWidget29 = constraintWidget21;
                                        constraintWidget2 = constraintWidget29;
                                        while (constraintWidget2 != null) {
                                            ConstraintWidget constraintWidget30 = constraintWidget2.f4264p0[i10];
                                            while (constraintWidget30 != null && constraintWidget30.f4253j0 == i44) {
                                                constraintWidget30 = constraintWidget30.f4264p0[i10];
                                            }
                                            if (constraintWidget2 == constraintWidget21 || constraintWidget2 == constraintWidget22 || constraintWidget30 == null) {
                                                constraintWidget3 = constraintWidget29;
                                                i17 = i15;
                                                i18 = 8;
                                            } else {
                                                ConstraintWidget constraintWidget31 = constraintWidget30 == constraintWidget22 ? null : constraintWidget30;
                                                ConstraintAnchor[] constraintAnchorArr6 = constraintWidget2.S;
                                                ConstraintAnchor constraintAnchor24 = constraintAnchorArr6[i12];
                                                SolverVariable solverVariable16 = constraintAnchor24.f4227i;
                                                int i46 = i12 + 1;
                                                SolverVariable solverVariable17 = constraintWidget29.S[i46].f4227i;
                                                int e12 = constraintAnchor24.e();
                                                int e13 = constraintAnchorArr6[i46].e();
                                                if (constraintWidget31 != null) {
                                                    constraintAnchor4 = constraintWidget31.S[i12];
                                                    solverVariable = constraintAnchor4.f4227i;
                                                    constraintWidget4 = constraintWidget31;
                                                    ConstraintAnchor constraintAnchor25 = constraintAnchor4.f4224f;
                                                    solverVariable2 = constraintAnchor25 != null ? constraintAnchor25.f4227i : null;
                                                } else {
                                                    constraintWidget4 = constraintWidget31;
                                                    ConstraintAnchor constraintAnchor26 = constraintWidget22.S[i12];
                                                    solverVariable = constraintAnchor26 != null ? constraintAnchor26.f4227i : null;
                                                    solverVariable2 = constraintAnchorArr6[i46].f4227i;
                                                    constraintAnchor4 = constraintAnchor26;
                                                }
                                                int e14 = constraintAnchor4 != null ? constraintAnchor4.e() + e13 : e13;
                                                int e15 = constraintWidget29.S[i46].e() + e12;
                                                int i47 = z25 ? 8 : 4;
                                                if (solverVariable16 == null || solverVariable17 == null || solverVariable == null || solverVariable2 == null) {
                                                    constraintWidget3 = constraintWidget29;
                                                    i17 = i15;
                                                    i18 = 8;
                                                } else {
                                                    constraintWidget3 = constraintWidget29;
                                                    int i48 = e14;
                                                    i17 = i15;
                                                    i18 = 8;
                                                    cVar.b(solverVariable16, solverVariable17, e15, 0.5f, solverVariable, solverVariable2, i48, i47);
                                                }
                                                constraintWidget30 = constraintWidget4;
                                            }
                                            constraintWidget29 = constraintWidget2.f4253j0 != i18 ? constraintWidget2 : constraintWidget3;
                                            constraintWidget2 = constraintWidget30;
                                            i15 = i17;
                                            i44 = 8;
                                        }
                                        i16 = i15;
                                        ConstraintAnchor constraintAnchor27 = constraintWidget21.S[i12];
                                        constraintAnchor = constraintWidget.S[i12].f4224f;
                                        int i49 = i12 + 1;
                                        constraintAnchor2 = constraintWidget22.S[i49];
                                        constraintAnchor3 = constraintWidget20.S[i49].f4224f;
                                        if (constraintAnchor != null) {
                                            if (constraintWidget21 != constraintWidget22) {
                                                cVar.e(constraintAnchor27.f4227i, constraintAnchor.f4227i, constraintAnchor27.e(), 5);
                                            } else if (constraintAnchor3 != null) {
                                                cVar.b(constraintAnchor27.f4227i, constraintAnchor.f4227i, constraintAnchor27.e(), 0.5f, constraintAnchor2.f4227i, constraintAnchor3.f4227i, constraintAnchor2.e(), 5);
                                            }
                                        }
                                        if (constraintAnchor3 != null && constraintWidget21 != constraintWidget22) {
                                            cVar.e(constraintAnchor2.f4227i, constraintAnchor3.f4227i, -constraintAnchor2.e(), 5);
                                        }
                                        if ((!z14 || z13) && constraintWidget21 != null && constraintWidget21 != constraintWidget22) {
                                            ConstraintAnchor[] constraintAnchorArr7 = constraintWidget21.S;
                                            constraintAnchor7 = constraintAnchorArr7[i12];
                                            if (constraintWidget22 == null) {
                                                constraintWidget22 = constraintWidget21;
                                            }
                                            i19 = i12 + 1;
                                            constraintAnchor8 = constraintWidget22.S[i19];
                                            ConstraintAnchor constraintAnchor28 = constraintAnchor7.f4224f;
                                            solverVariable5 = constraintAnchor28 != null ? constraintAnchor28.f4227i : null;
                                            ConstraintAnchor constraintAnchor29 = constraintAnchor8.f4224f;
                                            SolverVariable solverVariable18 = constraintAnchor29 != null ? constraintAnchor29.f4227i : null;
                                            if (constraintWidget20 != constraintWidget22) {
                                                ConstraintAnchor constraintAnchor30 = constraintWidget20.S[i19].f4224f;
                                                solverVariable6 = constraintAnchor30 != null ? constraintAnchor30.f4227i : null;
                                            } else {
                                                solverVariable6 = solverVariable18;
                                            }
                                            if (constraintWidget21 == constraintWidget22) {
                                                constraintAnchor8 = constraintAnchorArr7[i19];
                                            }
                                            if (solverVariable5 == null && solverVariable6 != null) {
                                                cVar.b(constraintAnchor7.f4227i, solverVariable5, constraintAnchor7.e(), 0.5f, solverVariable6, constraintAnchor8.f4227i, constraintWidget22.S[i19].e(), 5);
                                            }
                                        }
                                        i28 = i16 + 1;
                                        dVar3 = dVar;
                                        arrayList4 = arrayList;
                                        i11 = i14;
                                        cVarArr = cVarArr2;
                                    }
                                } else {
                                    int i50 = cVar3.f4329j;
                                    boolean z26 = i50 > 0 && cVar3.f4328i == i50;
                                    ConstraintWidget constraintWidget32 = constraintWidget21;
                                    for (ConstraintWidget constraintWidget33 = constraintWidget32; constraintWidget33 != null; constraintWidget33 = constraintWidget6) {
                                        ConstraintWidget constraintWidget34 = constraintWidget33.f4264p0[i10];
                                        while (constraintWidget34 != null && constraintWidget34.f4253j0 == 8) {
                                            constraintWidget34 = constraintWidget34.f4264p0[i10];
                                        }
                                        if (constraintWidget34 == null) {
                                            if (constraintWidget33 == constraintWidget22) {
                                            }
                                            constraintWidget6 = constraintWidget34;
                                            constraintWidget5 = constraintWidget32;
                                            constraintWidget7 = constraintWidget33;
                                            constraintWidget32 = constraintWidget7.f4253j0 == 8 ? constraintWidget7 : constraintWidget5;
                                        }
                                        ConstraintAnchor[] constraintAnchorArr8 = constraintWidget33.S;
                                        ConstraintAnchor constraintAnchor31 = constraintAnchorArr8[i12];
                                        SolverVariable solverVariable19 = constraintAnchor31.f4227i;
                                        ConstraintAnchor constraintAnchor32 = constraintAnchor31.f4224f;
                                        SolverVariable solverVariable20 = constraintAnchor32 != null ? constraintAnchor32.f4227i : null;
                                        if (constraintWidget32 != constraintWidget33) {
                                            constraintAnchor5 = constraintWidget32.S[i12 + 1];
                                        } else {
                                            if (constraintWidget33 == constraintWidget21) {
                                                constraintAnchor5 = constraintWidget.S[i12].f4224f;
                                                if (constraintAnchor5 == null) {
                                                    solverVariable20 = null;
                                                }
                                            }
                                            int e16 = constraintAnchor31.e();
                                            int i51 = i12 + 1;
                                            int e17 = constraintAnchorArr8[i51].e();
                                            if (constraintWidget34 == null) {
                                                constraintAnchor6 = constraintWidget34.S[i12];
                                            } else {
                                                constraintAnchor6 = constraintWidget20.S[i51].f4224f;
                                                if (constraintAnchor6 == null) {
                                                    solverVariable3 = null;
                                                    solverVariable4 = constraintAnchorArr8[i51].f4227i;
                                                    if (constraintAnchor6 != null) {
                                                        e17 = constraintAnchor6.e() + e17;
                                                    }
                                                    e10 = constraintWidget32.S[i51].e() + e16;
                                                    if (solverVariable19 != null && solverVariable20 != null && solverVariable3 != null && solverVariable4 != null) {
                                                        if (constraintWidget33 == constraintWidget21) {
                                                            e10 = constraintWidget21.S[i12].e();
                                                        }
                                                        if (constraintWidget33 == constraintWidget22) {
                                                            e17 = constraintWidget22.S[i51].e();
                                                        }
                                                        SolverVariable solverVariable21 = solverVariable20;
                                                        int i52 = e10;
                                                        SolverVariable solverVariable22 = solverVariable3;
                                                        constraintWidget = constraintWidget;
                                                        constraintWidget5 = constraintWidget32;
                                                        int i53 = e17;
                                                        constraintWidget6 = constraintWidget34;
                                                        constraintWidget7 = constraintWidget33;
                                                        cVar.b(solverVariable19, solverVariable21, i52, 0.5f, solverVariable22, solverVariable4, i53, !z26 ? 8 : 5);
                                                        if (constraintWidget7.f4253j0 == 8) {
                                                        }
                                                    }
                                                    constraintWidget6 = constraintWidget34;
                                                    constraintWidget5 = constraintWidget32;
                                                    constraintWidget7 = constraintWidget33;
                                                    if (constraintWidget7.f4253j0 == 8) {
                                                    }
                                                }
                                            }
                                            solverVariable3 = constraintAnchor6.f4227i;
                                            solverVariable4 = constraintAnchorArr8[i51].f4227i;
                                            if (constraintAnchor6 != null) {
                                            }
                                            e10 = constraintWidget32.S[i51].e() + e16;
                                            if (solverVariable19 != null) {
                                                if (constraintWidget33 == constraintWidget21) {
                                                }
                                                if (constraintWidget33 == constraintWidget22) {
                                                }
                                                SolverVariable solverVariable212 = solverVariable20;
                                                int i522 = e10;
                                                SolverVariable solverVariable222 = solverVariable3;
                                                constraintWidget = constraintWidget;
                                                constraintWidget5 = constraintWidget32;
                                                int i532 = e17;
                                                constraintWidget6 = constraintWidget34;
                                                constraintWidget7 = constraintWidget33;
                                                cVar.b(solverVariable19, solverVariable212, i522, 0.5f, solverVariable222, solverVariable4, i532, !z26 ? 8 : 5);
                                                if (constraintWidget7.f4253j0 == 8) {
                                                }
                                            }
                                            constraintWidget6 = constraintWidget34;
                                            constraintWidget5 = constraintWidget32;
                                            constraintWidget7 = constraintWidget33;
                                            if (constraintWidget7.f4253j0 == 8) {
                                            }
                                        }
                                        solverVariable20 = constraintAnchor5.f4227i;
                                        int e162 = constraintAnchor31.e();
                                        int i512 = i12 + 1;
                                        int e172 = constraintAnchorArr8[i512].e();
                                        if (constraintWidget34 == null) {
                                        }
                                        solverVariable3 = constraintAnchor6.f4227i;
                                        solverVariable4 = constraintAnchorArr8[i512].f4227i;
                                        if (constraintAnchor6 != null) {
                                        }
                                        e10 = constraintWidget32.S[i512].e() + e162;
                                        if (solverVariable19 != null) {
                                        }
                                        constraintWidget6 = constraintWidget34;
                                        constraintWidget5 = constraintWidget32;
                                        constraintWidget7 = constraintWidget33;
                                        if (constraintWidget7.f4253j0 == 8) {
                                        }
                                    }
                                }
                            }
                            i16 = i15;
                            if (!z14) {
                            }
                            ConstraintAnchor[] constraintAnchorArr72 = constraintWidget21.S;
                            constraintAnchor7 = constraintAnchorArr72[i12];
                            if (constraintWidget22 == null) {
                            }
                            i19 = i12 + 1;
                            constraintAnchor8 = constraintWidget22.S[i19];
                            ConstraintAnchor constraintAnchor282 = constraintAnchor7.f4224f;
                            if (constraintAnchor282 != null) {
                            }
                            ConstraintAnchor constraintAnchor292 = constraintAnchor8.f4224f;
                            if (constraintAnchor292 != null) {
                            }
                            if (constraintWidget20 != constraintWidget22) {
                            }
                            if (constraintWidget21 == constraintWidget22) {
                            }
                            if (solverVariable5 == null) {
                                cVar.b(constraintAnchor7.f4227i, solverVariable5, constraintAnchor7.e(), 0.5f, solverVariable6, constraintAnchor8.f4227i, constraintWidget22.S[i19].e(), 5);
                            }
                            i28 = i16 + 1;
                            dVar3 = dVar;
                            arrayList4 = arrayList;
                            i11 = i14;
                            cVarArr = cVarArr2;
                        }
                    }
                    if (z15) {
                        ConstraintAnchor constraintAnchor33 = constraintAnchor16.f4224f;
                        if (constraintAnchor33.f4222d == dVar2) {
                            solverVariable7 = constraintAnchor16.f4227i;
                            solverVariable8 = constraintAnchor33.f4227i;
                            i22 = -constraintAnchor16.e();
                            i23 = 4;
                            cVar.e(solverVariable7, solverVariable8, i22, i23);
                        }
                    }
                    cVar.g(constraintAnchor16.f4227i, constraintWidget20.S[i39].f4224f.f4227i, -constraintAnchor16.e(), 6);
                    if (z19) {
                    }
                    cVar2 = cVar7;
                    arrayList2 = cVar2.f4327h;
                    if (arrayList2 != null) {
                        if (cVar2.n) {
                        }
                        ConstraintWidget constraintWidget272 = null;
                        float f142 = 0.0f;
                        i20 = 0;
                        while (i20 < size) {
                        }
                    }
                    cVar3 = cVar2;
                    if (constraintWidget21 == null) {
                    }
                    i15 = i13;
                    constraintWidget = constraintWidget26;
                    if (z14) {
                    }
                    int i442 = 8;
                    if (z13) {
                        int i452 = cVar3.f4329j;
                        if (i452 <= 0) {
                        }
                        ConstraintWidget constraintWidget292 = constraintWidget21;
                        constraintWidget2 = constraintWidget292;
                        while (constraintWidget2 != null) {
                        }
                        i16 = i15;
                        ConstraintAnchor constraintAnchor272 = constraintWidget21.S[i12];
                        constraintAnchor = constraintWidget.S[i12].f4224f;
                        int i492 = i12 + 1;
                        constraintAnchor2 = constraintWidget22.S[i492];
                        constraintAnchor3 = constraintWidget20.S[i492].f4224f;
                        if (constraintAnchor != null) {
                        }
                        if (constraintAnchor3 != null) {
                            cVar.e(constraintAnchor2.f4227i, constraintAnchor3.f4227i, -constraintAnchor2.e(), 5);
                        }
                        if (!z14) {
                        }
                        ConstraintAnchor[] constraintAnchorArr722 = constraintWidget21.S;
                        constraintAnchor7 = constraintAnchorArr722[i12];
                        if (constraintWidget22 == null) {
                        }
                        i19 = i12 + 1;
                        constraintAnchor8 = constraintWidget22.S[i19];
                        ConstraintAnchor constraintAnchor2822 = constraintAnchor7.f4224f;
                        if (constraintAnchor2822 != null) {
                        }
                        ConstraintAnchor constraintAnchor2922 = constraintAnchor8.f4224f;
                        if (constraintAnchor2922 != null) {
                        }
                        if (constraintWidget20 != constraintWidget22) {
                        }
                        if (constraintWidget21 == constraintWidget22) {
                        }
                        if (solverVariable5 == null) {
                        }
                        i28 = i16 + 1;
                        dVar3 = dVar;
                        arrayList4 = arrayList;
                        i11 = i14;
                        cVarArr = cVarArr2;
                    }
                    i16 = i15;
                    if (!z14) {
                    }
                    ConstraintAnchor[] constraintAnchorArr7222 = constraintWidget21.S;
                    constraintAnchor7 = constraintAnchorArr7222[i12];
                    if (constraintWidget22 == null) {
                    }
                    i19 = i12 + 1;
                    constraintAnchor8 = constraintWidget22.S[i19];
                    ConstraintAnchor constraintAnchor28222 = constraintAnchor7.f4224f;
                    if (constraintAnchor28222 != null) {
                    }
                    ConstraintAnchor constraintAnchor29222 = constraintAnchor8.f4224f;
                    if (constraintAnchor29222 != null) {
                    }
                    if (constraintWidget20 != constraintWidget22) {
                    }
                    if (constraintWidget21 == constraintWidget22) {
                    }
                    if (solverVariable5 == null) {
                    }
                    i28 = i16 + 1;
                    dVar3 = dVar;
                    arrayList4 = arrayList;
                    i11 = i14;
                    cVarArr = cVarArr2;
                }
            }
            if (z19) {
            }
            cVar2 = cVar7;
            arrayList2 = cVar2.f4327h;
            if (arrayList2 != null) {
            }
            cVar3 = cVar2;
            if (constraintWidget21 == null) {
            }
            i15 = i13;
            constraintWidget = constraintWidget26;
            if (z14) {
            }
            int i4422 = 8;
            if (z13) {
            }
            i16 = i15;
            if (!z14) {
            }
            ConstraintAnchor[] constraintAnchorArr72222 = constraintWidget21.S;
            constraintAnchor7 = constraintAnchorArr72222[i12];
            if (constraintWidget22 == null) {
            }
            i19 = i12 + 1;
            constraintAnchor8 = constraintWidget22.S[i19];
            ConstraintAnchor constraintAnchor282222 = constraintAnchor7.f4224f;
            if (constraintAnchor282222 != null) {
            }
            ConstraintAnchor constraintAnchor292222 = constraintAnchor8.f4224f;
            if (constraintAnchor292222 != null) {
            }
            if (constraintWidget20 != constraintWidget22) {
            }
            if (constraintWidget21 == constraintWidget22) {
            }
            if (solverVariable5 == null) {
            }
            i28 = i16 + 1;
            dVar3 = dVar;
            arrayList4 = arrayList;
            i11 = i14;
            cVarArr = cVarArr2;
        }
    }
}
