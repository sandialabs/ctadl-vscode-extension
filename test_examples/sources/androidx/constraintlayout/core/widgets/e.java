package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import g2.b;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: c1  reason: collision with root package name */
    public ConstraintWidget[] f4345c1;
    public int F0 = -1;
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public float L0 = 0.5f;
    public float M0 = 0.5f;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public int R0 = 0;
    public int S0 = 0;
    public int T0 = 2;
    public int U0 = 2;
    public int V0 = 0;
    public int W0 = -1;
    public int X0 = 0;
    public final ArrayList<a> Y0 = new ArrayList<>();
    public ConstraintWidget[] Z0 = null;

    /* renamed from: a1  reason: collision with root package name */
    public ConstraintWidget[] f4343a1 = null;

    /* renamed from: b1  reason: collision with root package name */
    public int[] f4344b1 = null;

    /* renamed from: d1  reason: collision with root package name */
    public int f4346d1 = 0;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f4347a;

        /* renamed from: d  reason: collision with root package name */
        public ConstraintAnchor f4349d;

        /* renamed from: e  reason: collision with root package name */
        public ConstraintAnchor f4350e;

        /* renamed from: f  reason: collision with root package name */
        public ConstraintAnchor f4351f;

        /* renamed from: g  reason: collision with root package name */
        public ConstraintAnchor f4352g;

        /* renamed from: h  reason: collision with root package name */
        public int f4353h;

        /* renamed from: i  reason: collision with root package name */
        public int f4354i;

        /* renamed from: j  reason: collision with root package name */
        public int f4355j;

        /* renamed from: k  reason: collision with root package name */
        public int f4356k;

        /* renamed from: q  reason: collision with root package name */
        public int f4361q;

        /* renamed from: b  reason: collision with root package name */
        public ConstraintWidget f4348b = null;
        public int c = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f4357l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f4358m = 0;
        public int n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f4359o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f4360p = 0;

        public a(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11) {
            this.f4353h = 0;
            this.f4354i = 0;
            this.f4355j = 0;
            this.f4356k = 0;
            this.f4361q = 0;
            this.f4347a = i10;
            this.f4349d = constraintAnchor;
            this.f4350e = constraintAnchor2;
            this.f4351f = constraintAnchor3;
            this.f4352g = constraintAnchor4;
            this.f4353h = e.this.f4374y0;
            this.f4354i = e.this.f4370u0;
            this.f4355j = e.this.f4375z0;
            this.f4356k = e.this.f4371v0;
            this.f4361q = i11;
        }

        public final void a(ConstraintWidget constraintWidget) {
            int i10 = this.f4347a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            int i11 = 0;
            e eVar = e.this;
            if (i10 == 0) {
                int U = eVar.U(this.f4361q, constraintWidget);
                if (constraintWidget.V[0] == dimensionBehaviour) {
                    this.f4360p++;
                    U = 0;
                }
                int i12 = eVar.R0;
                if (constraintWidget.f4253j0 != 8) {
                    i11 = i12;
                }
                this.f4357l = U + i11 + this.f4357l;
                int T = eVar.T(this.f4361q, constraintWidget);
                if (this.f4348b == null || this.c < T) {
                    this.f4348b = constraintWidget;
                    this.c = T;
                    this.f4358m = T;
                }
            } else {
                int U2 = eVar.U(this.f4361q, constraintWidget);
                int T2 = eVar.T(this.f4361q, constraintWidget);
                if (constraintWidget.V[1] == dimensionBehaviour) {
                    this.f4360p++;
                    T2 = 0;
                }
                int i13 = eVar.S0;
                if (constraintWidget.f4253j0 != 8) {
                    i11 = i13;
                }
                this.f4358m = T2 + i11 + this.f4358m;
                if (this.f4348b == null || this.c < U2) {
                    this.f4348b = constraintWidget;
                    this.c = U2;
                    this.f4357l = U2;
                }
            }
            this.f4359o++;
        }

        public final void b(int i10, boolean z10, boolean z11) {
            e eVar;
            boolean z12;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            ConstraintWidget constraintWidget;
            int i16;
            int i17;
            int i18;
            int i19;
            float f10;
            float f11;
            int i20;
            float f12;
            float f13;
            int i21;
            int i22;
            int i23;
            int i24 = this.f4359o;
            int i25 = 0;
            while (true) {
                eVar = e.this;
                if (i25 >= i24 || (i23 = this.n + i25) >= eVar.f4346d1) {
                    break;
                }
                ConstraintWidget constraintWidget2 = eVar.f4345c1[i23];
                if (constraintWidget2 != null) {
                    constraintWidget2.D();
                }
                i25++;
            }
            if (i24 != 0 && this.f4348b != null) {
                if (z11 && i10 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i26 = -1;
                int i27 = -1;
                for (int i28 = 0; i28 < i24; i28++) {
                    if (z10) {
                        i22 = (i24 - 1) - i28;
                    } else {
                        i22 = i28;
                    }
                    int i29 = this.n + i22;
                    if (i29 >= eVar.f4346d1) {
                        break;
                    }
                    ConstraintWidget constraintWidget3 = eVar.f4345c1[i29];
                    if (constraintWidget3 != null && constraintWidget3.f4253j0 == 0) {
                        if (i26 == -1) {
                            i26 = i28;
                        }
                        i27 = i28;
                    }
                }
                if (this.f4347a == 0) {
                    ConstraintWidget constraintWidget4 = this.f4348b;
                    constraintWidget4.f4259m0 = eVar.G0;
                    int i30 = this.f4354i;
                    if (i10 > 0) {
                        i30 += eVar.S0;
                    }
                    ConstraintAnchor constraintAnchor = this.f4350e;
                    ConstraintAnchor constraintAnchor2 = constraintWidget4.L;
                    constraintAnchor2.a(constraintAnchor, i30);
                    ConstraintAnchor constraintAnchor3 = constraintWidget4.N;
                    if (z11) {
                        constraintAnchor3.a(this.f4352g, this.f4356k);
                    }
                    if (i10 > 0) {
                        this.f4350e.f4222d.N.a(constraintAnchor2, 0);
                    }
                    if (eVar.U0 == 3 && !constraintWidget4.F) {
                        for (int i31 = 0; i31 < i24; i31++) {
                            if (z10) {
                                i21 = (i24 - 1) - i31;
                            } else {
                                i21 = i31;
                            }
                            int i32 = this.n + i21;
                            if (i32 >= eVar.f4346d1) {
                                break;
                            }
                            constraintWidget = eVar.f4345c1[i32];
                            if (constraintWidget.F) {
                                break;
                            }
                        }
                    }
                    constraintWidget = constraintWidget4;
                    ConstraintWidget constraintWidget5 = null;
                    int i33 = 0;
                    while (i33 < i24) {
                        if (z10) {
                            i16 = (i24 - 1) - i33;
                        } else {
                            i16 = i33;
                        }
                        int i34 = this.n + i16;
                        if (i34 < eVar.f4346d1) {
                            ConstraintWidget constraintWidget6 = eVar.f4345c1[i34];
                            if (constraintWidget6 == null) {
                                i17 = i24;
                            } else {
                                ConstraintAnchor constraintAnchor4 = constraintWidget6.K;
                                if (i33 == 0) {
                                    constraintWidget6.g(constraintAnchor4, this.f4349d, this.f4353h);
                                }
                                if (i16 == 0) {
                                    int i35 = eVar.F0;
                                    if (z10) {
                                        i19 = i35;
                                        f10 = 1.0f - eVar.L0;
                                    } else {
                                        i19 = i35;
                                        f10 = eVar.L0;
                                    }
                                    if (this.n == 0) {
                                        int i36 = eVar.H0;
                                        f11 = f10;
                                        if (i36 != -1) {
                                            if (z10) {
                                                f13 = 1.0f - eVar.N0;
                                            } else {
                                                f13 = eVar.N0;
                                            }
                                            f12 = f13;
                                            i20 = i36;
                                            constraintWidget6.f4257l0 = i20;
                                            constraintWidget6.f4247g0 = f12;
                                        }
                                    } else {
                                        f11 = f10;
                                    }
                                    if (z11 && (i20 = eVar.J0) != -1) {
                                        if (z10) {
                                            f12 = 1.0f - eVar.P0;
                                        } else {
                                            f12 = eVar.P0;
                                        }
                                    } else {
                                        i20 = i19;
                                        f12 = f11;
                                    }
                                    constraintWidget6.f4257l0 = i20;
                                    constraintWidget6.f4247g0 = f12;
                                }
                                if (i33 == i24 - 1) {
                                    i17 = i24;
                                    constraintWidget6.g(constraintWidget6.M, this.f4351f, this.f4355j);
                                } else {
                                    i17 = i24;
                                }
                                if (constraintWidget5 != null) {
                                    int i37 = eVar.R0;
                                    ConstraintAnchor constraintAnchor5 = constraintWidget5.M;
                                    constraintAnchor4.a(constraintAnchor5, i37);
                                    if (i33 == i26) {
                                        int i38 = this.f4353h;
                                        if (constraintAnchor4.h()) {
                                            constraintAnchor4.f4226h = i38;
                                        }
                                    }
                                    constraintAnchor5.a(constraintAnchor4, 0);
                                    if (i33 == i27 + 1) {
                                        int i39 = this.f4355j;
                                        if (constraintAnchor5.h()) {
                                            constraintAnchor5.f4226h = i39;
                                        }
                                    }
                                }
                                if (constraintWidget6 != constraintWidget4) {
                                    int i40 = eVar.U0;
                                    if (i40 == 3 && constraintWidget.F && constraintWidget6 != constraintWidget && constraintWidget6.F) {
                                        constraintWidget6.O.a(constraintWidget.O, 0);
                                    } else {
                                        ConstraintAnchor constraintAnchor6 = constraintWidget6.L;
                                        if (i40 != 0) {
                                            ConstraintAnchor constraintAnchor7 = constraintWidget6.N;
                                            if (i40 != 1) {
                                                if (z12) {
                                                    constraintAnchor6.a(this.f4350e, this.f4354i);
                                                    constraintAnchor7.a(this.f4352g, this.f4356k);
                                                } else {
                                                    i18 = 0;
                                                    constraintAnchor6.a(constraintAnchor2, 0);
                                                }
                                            } else {
                                                i18 = 0;
                                            }
                                            constraintAnchor7.a(constraintAnchor3, i18);
                                        } else {
                                            constraintAnchor6.a(constraintAnchor2, 0);
                                        }
                                    }
                                }
                                constraintWidget5 = constraintWidget6;
                            }
                            i33++;
                            i24 = i17;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                ConstraintWidget constraintWidget7 = this.f4348b;
                constraintWidget7.f4257l0 = eVar.F0;
                int i41 = this.f4353h;
                if (i10 > 0) {
                    i41 += eVar.R0;
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget7.M;
                ConstraintAnchor constraintAnchor9 = constraintWidget7.K;
                if (z10) {
                    constraintAnchor8.a(this.f4351f, i41);
                    if (z11) {
                        constraintAnchor9.a(this.f4349d, this.f4355j);
                    }
                    if (i10 > 0) {
                        this.f4351f.f4222d.K.a(constraintAnchor8, 0);
                    }
                } else {
                    constraintAnchor9.a(this.f4349d, i41);
                    if (z11) {
                        constraintAnchor8.a(this.f4351f, this.f4355j);
                    }
                    if (i10 > 0) {
                        this.f4349d.f4222d.M.a(constraintAnchor9, 0);
                    }
                }
                int i42 = 0;
                ConstraintWidget constraintWidget8 = null;
                while (i42 < i24) {
                    int i43 = this.n + i42;
                    if (i43 < eVar.f4346d1) {
                        ConstraintWidget constraintWidget9 = eVar.f4345c1[i43];
                        if (constraintWidget9 == null) {
                            constraintWidget9 = constraintWidget8;
                        } else {
                            ConstraintAnchor constraintAnchor10 = constraintWidget9.L;
                            if (i42 == 0) {
                                constraintWidget9.g(constraintAnchor10, this.f4350e, this.f4354i);
                                int i44 = eVar.G0;
                                float f14 = eVar.M0;
                                if (this.n == 0) {
                                    i15 = eVar.I0;
                                    i13 = i44;
                                    i14 = -1;
                                    if (i15 != -1) {
                                        f14 = eVar.O0;
                                        constraintWidget9.f4259m0 = i15;
                                        constraintWidget9.f4249h0 = f14;
                                    }
                                } else {
                                    i13 = i44;
                                    i14 = -1;
                                }
                                if (z11 && (i15 = eVar.K0) != i14) {
                                    f14 = eVar.Q0;
                                } else {
                                    i15 = i13;
                                }
                                constraintWidget9.f4259m0 = i15;
                                constraintWidget9.f4249h0 = f14;
                            }
                            if (i42 == i24 - 1) {
                                constraintWidget9.g(constraintWidget9.N, this.f4352g, this.f4356k);
                            }
                            if (constraintWidget8 != null) {
                                int i45 = eVar.S0;
                                ConstraintAnchor constraintAnchor11 = constraintWidget8.N;
                                constraintAnchor10.a(constraintAnchor11, i45);
                                if (i42 == i26) {
                                    int i46 = this.f4354i;
                                    if (constraintAnchor10.h()) {
                                        constraintAnchor10.f4226h = i46;
                                    }
                                }
                                constraintAnchor11.a(constraintAnchor10, 0);
                                if (i42 == i27 + 1) {
                                    int i47 = this.f4356k;
                                    if (constraintAnchor11.h()) {
                                        constraintAnchor11.f4226h = i47;
                                    }
                                }
                            }
                            if (constraintWidget9 != constraintWidget7) {
                                ConstraintAnchor constraintAnchor12 = constraintWidget9.M;
                                ConstraintAnchor constraintAnchor13 = constraintWidget9.K;
                                if (z10) {
                                    int i48 = eVar.T0;
                                    if (i48 != 0) {
                                        if (i48 != 1) {
                                            if (i48 == 2) {
                                                i12 = 0;
                                                constraintAnchor13.a(constraintAnchor9, 0);
                                            }
                                        } else {
                                            constraintAnchor13.a(constraintAnchor9, 0);
                                            i42++;
                                            constraintWidget8 = constraintWidget9;
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                    constraintAnchor12.a(constraintAnchor8, i12);
                                    i42++;
                                    constraintWidget8 = constraintWidget9;
                                } else {
                                    int i49 = eVar.T0;
                                    if (i49 != 0) {
                                        if (i49 != 1) {
                                            if (i49 == 2) {
                                                if (z12) {
                                                    constraintAnchor13.a(this.f4349d, this.f4353h);
                                                    constraintAnchor12.a(this.f4351f, this.f4355j);
                                                } else {
                                                    i11 = 0;
                                                    constraintAnchor13.a(constraintAnchor9, 0);
                                                }
                                            }
                                        } else {
                                            i11 = 0;
                                        }
                                        constraintAnchor12.a(constraintAnchor8, i11);
                                    } else {
                                        constraintAnchor13.a(constraintAnchor9, 0);
                                    }
                                    i42++;
                                    constraintWidget8 = constraintWidget9;
                                }
                            }
                        }
                        i42++;
                        constraintWidget8 = constraintWidget9;
                    } else {
                        return;
                    }
                }
            }
        }

        public final int c() {
            if (this.f4347a == 1) {
                return this.f4358m - e.this.S0;
            }
            return this.f4358m;
        }

        public final int d() {
            if (this.f4347a == 0) {
                return this.f4357l - e.this.R0;
            }
            return this.f4357l;
        }

        public final void e(int i10) {
            e eVar;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour;
            int q10;
            int i11;
            int i12 = this.f4360p;
            if (i12 == 0) {
                return;
            }
            int i13 = this.f4359o;
            int i14 = i10 / i12;
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = this.n;
                int i17 = i16 + i15;
                e eVar2 = e.this;
                if (i17 >= eVar2.f4346d1) {
                    break;
                }
                ConstraintWidget constraintWidget = eVar2.f4345c1[i16 + i15];
                int i18 = this.f4347a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (i18 == 0) {
                    if (constraintWidget != null) {
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
                        if (dimensionBehaviourArr[0] == dimensionBehaviour3 && constraintWidget.f4269s == 0) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
                            eVar = eVar2;
                            dimensionBehaviour = dimensionBehaviour2;
                            q10 = i14;
                            dimensionBehaviour2 = dimensionBehaviour4;
                            i11 = constraintWidget.l();
                            eVar.S(constraintWidget, dimensionBehaviour, q10, dimensionBehaviour2, i11);
                        }
                    }
                } else {
                    if (constraintWidget != null) {
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.V;
                        if (dimensionBehaviourArr2[1] == dimensionBehaviour3 && constraintWidget.f4270t == 0) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr2[0];
                            eVar = eVar2;
                            dimensionBehaviour = dimensionBehaviour5;
                            q10 = constraintWidget.q();
                            i11 = i14;
                            eVar.S(constraintWidget, dimensionBehaviour, q10, dimensionBehaviour2, i11);
                        }
                    }
                }
            }
            this.f4357l = 0;
            this.f4358m = 0;
            this.f4348b = null;
            this.c = 0;
            int i19 = this.f4359o;
            for (int i20 = 0; i20 < i19; i20++) {
                int i21 = this.n + i20;
                e eVar3 = e.this;
                if (i21 < eVar3.f4346d1) {
                    ConstraintWidget constraintWidget2 = eVar3.f4345c1[i21];
                    if (this.f4347a == 0) {
                        int q11 = constraintWidget2.q();
                        int i22 = eVar3.R0;
                        if (constraintWidget2.f4253j0 == 8) {
                            i22 = 0;
                        }
                        this.f4357l = q11 + i22 + this.f4357l;
                        int T = eVar3.T(this.f4361q, constraintWidget2);
                        if (this.f4348b == null || this.c < T) {
                            this.f4348b = constraintWidget2;
                            this.c = T;
                            this.f4358m = T;
                        }
                    } else {
                        int U = eVar3.U(this.f4361q, constraintWidget2);
                        int T2 = eVar3.T(this.f4361q, constraintWidget2);
                        int i23 = eVar3.S0;
                        if (constraintWidget2.f4253j0 == 8) {
                            i23 = 0;
                        }
                        this.f4358m = T2 + i23 + this.f4358m;
                        if (this.f4348b == null || this.c < U) {
                            this.f4348b = constraintWidget2;
                            this.c = U;
                            this.f4357l = U;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public final void f(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11, int i12, int i13, int i14, int i15) {
            this.f4347a = i10;
            this.f4349d = constraintAnchor;
            this.f4350e = constraintAnchor2;
            this.f4351f = constraintAnchor3;
            this.f4352g = constraintAnchor4;
            this.f4353h = i11;
            this.f4354i = i12;
            this.f4355j = i13;
            this.f4356k = i14;
            this.f4361q = i15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b2, code lost:
        if (r37.G0 == (-1)) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x085e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:292:0x0508 -> B:293:0x0515). Please submit an issue!!! */
    @Override // androidx.constraintlayout.core.widgets.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(int i10, int i11, int i12, int i13) {
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        int i18;
        a aVar;
        char c;
        char c10;
        int i19;
        int i20;
        int i21;
        int i22;
        e eVar;
        int i23;
        int i24;
        int[] iArr2;
        int i25;
        int i26;
        int i27;
        e eVar2;
        int i28;
        int i29;
        int i30;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i31;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr;
        int i32;
        int i33;
        boolean z10;
        int i34;
        int i35;
        ArrayList<a> arrayList;
        int i36;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        int i37;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget constraintWidget;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        e eVar3;
        ConstraintWidget[] constraintWidgetArr;
        int[] iArr3;
        boolean z11;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        ConstraintWidget[] constraintWidgetArr2;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        ConstraintWidget constraintWidget2;
        ConstraintWidget[] constraintWidgetArr3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        int i59;
        int i60;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        int i61;
        boolean z12;
        int i62;
        int i63;
        ArrayList<a> arrayList2;
        int i64;
        int i65;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        int i66;
        int i67;
        ConstraintWidget constraintWidget3;
        int i68;
        int i69;
        boolean z13;
        int i70 = this.f10896t0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (i70 > 0) {
            ConstraintWidget constraintWidget4 = this.W;
            b.InterfaceC0121b interfaceC0121b = constraintWidget4 != null ? ((d) constraintWidget4).f4339w0 : null;
            if (interfaceC0121b == null) {
                z13 = false;
            } else {
                for (int i71 = 0; i71 < this.f10896t0; i71++) {
                    ConstraintWidget constraintWidget5 = this.f10895s0[i71];
                    if (constraintWidget5 != null && !(constraintWidget5 instanceof f)) {
                        ConstraintWidget.DimensionBehaviour k3 = constraintWidget5.k(0);
                        ConstraintWidget.DimensionBehaviour k10 = constraintWidget5.k(1);
                        if (!(k3 == dimensionBehaviour8 && constraintWidget5.f4269s != 1 && k10 == dimensionBehaviour8 && constraintWidget5.f4270t != 1)) {
                            if (k3 == dimensionBehaviour8) {
                                k3 = dimensionBehaviour7;
                            }
                            if (k10 == dimensionBehaviour8) {
                                k10 = dimensionBehaviour7;
                            }
                            b.a aVar2 = this.D0;
                            aVar2.f11195a = k3;
                            aVar2.f11196b = k10;
                            aVar2.c = constraintWidget5.q();
                            aVar2.f11197d = constraintWidget5.l();
                            ((ConstraintLayout.b) interfaceC0121b).b(constraintWidget5, aVar2);
                            constraintWidget5.N(aVar2.f11198e);
                            constraintWidget5.K(aVar2.f11199f);
                            int i72 = aVar2.f11200g;
                            constraintWidget5.f4241d0 = i72;
                            constraintWidget5.F = i72 > 0;
                        }
                    }
                }
                z13 = true;
            }
            if (!z13) {
                this.B0 = 0;
                this.C0 = 0;
                this.A0 = false;
                return;
            }
        }
        int i73 = this.f4374y0;
        int i74 = this.f4375z0;
        int i75 = this.f4370u0;
        int i76 = this.f4371v0;
        int[] iArr4 = new int[2];
        int i77 = (i11 - i73) - i74;
        int i78 = this.X0;
        if (i78 == 1) {
            i77 = (i13 - i75) - i76;
        }
        int i79 = i77;
        if (i78 == 0) {
            if (this.F0 == -1) {
                this.F0 = 0;
            }
            if (this.G0 == -1) {
                this.G0 = 0;
            }
            ConstraintWidget[] constraintWidgetArr4 = this.f10895s0;
            int i80 = 0;
            int i81 = 0;
            while (true) {
                i14 = this.f10896t0;
                if (i80 >= i14) {
                    break;
                }
                if (this.f10895s0[i80].f4253j0 == 8) {
                    i81++;
                }
                i80++;
            }
            if (i81 > 0) {
                constraintWidgetArr4 = new ConstraintWidget[i14 - i81];
                i14 = 0;
                for (int i82 = 0; i82 < this.f10896t0; i82++) {
                    ConstraintWidget constraintWidget6 = this.f10895s0[i82];
                    if (constraintWidget6.f4253j0 != 8) {
                        constraintWidgetArr4[i14] = constraintWidget6;
                        i14++;
                    }
                }
            }
            int i83 = i14;
            ConstraintWidget[] constraintWidgetArr5 = constraintWidgetArr4;
            this.f4345c1 = constraintWidgetArr5;
            this.f4346d1 = i83;
            int i84 = this.V0;
            ArrayList<a> arrayList3 = this.Y0;
            if (i84 != 0) {
                ConstraintAnchor constraintAnchor = this.L;
                ConstraintAnchor constraintAnchor2 = this.K;
                ConstraintAnchor constraintAnchor3 = this.M;
                ConstraintAnchor constraintAnchor4 = this.N;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = this.V;
                if (i84 == 1) {
                    iArr = iArr4;
                    i15 = i76;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviour8;
                    i16 = i73;
                    i17 = i74;
                    i18 = i75;
                    ArrayList<a> arrayList4 = arrayList3;
                    int i85 = this.X0;
                    if (i83 != 0) {
                        arrayList4.clear();
                        a aVar3 = new a(i85, this.K, this.L, this.M, this.N, i79);
                        arrayList4.add(aVar3);
                        if (i85 == 0) {
                            i32 = 0;
                            int i86 = 0;
                            int i87 = 0;
                            while (i87 < i83) {
                                ConstraintWidget constraintWidget7 = constraintWidgetArr5[i87];
                                int U = U(i79, constraintWidget7);
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviour9;
                                if (constraintWidget7.V[0] == dimensionBehaviour10) {
                                    i32++;
                                }
                                int i88 = i32;
                                boolean z14 = (i86 == i79 || (this.R0 + i86) + U > i79) && aVar3.f4348b != null;
                                if (!z14 && i87 > 0 && (i39 = this.W0) > 0 && i87 % i39 == 0) {
                                    z14 = true;
                                }
                                if (z14) {
                                    int i89 = i85;
                                    dimensionBehaviour2 = dimensionBehaviour7;
                                    dimensionBehaviour3 = dimensionBehaviour10;
                                    dimensionBehaviourArr2 = dimensionBehaviourArr3;
                                    constraintWidget = constraintWidget7;
                                    i37 = i85;
                                    i38 = i87;
                                    aVar3 = new a(i89, this.K, this.L, this.M, this.N, i79);
                                    aVar3.n = i38;
                                    arrayList4.add(aVar3);
                                } else {
                                    dimensionBehaviour2 = dimensionBehaviour7;
                                    i37 = i85;
                                    dimensionBehaviourArr2 = dimensionBehaviourArr3;
                                    dimensionBehaviour3 = dimensionBehaviour10;
                                    constraintWidget = constraintWidget7;
                                    i38 = i87;
                                    if (i38 > 0) {
                                        i86 = this.R0 + U + i86;
                                        aVar3.a(constraintWidget);
                                        i87 = i38 + 1;
                                        dimensionBehaviour9 = dimensionBehaviour3;
                                        i32 = i88;
                                        dimensionBehaviourArr3 = dimensionBehaviourArr2;
                                        dimensionBehaviour7 = dimensionBehaviour2;
                                        i85 = i37;
                                    }
                                }
                                i86 = U;
                                aVar3.a(constraintWidget);
                                i87 = i38 + 1;
                                dimensionBehaviour9 = dimensionBehaviour3;
                                i32 = i88;
                                dimensionBehaviourArr3 = dimensionBehaviourArr2;
                                dimensionBehaviour7 = dimensionBehaviour2;
                                i85 = i37;
                            }
                            dimensionBehaviour = dimensionBehaviour7;
                            i31 = i85;
                            dimensionBehaviourArr = dimensionBehaviourArr3;
                        } else {
                            dimensionBehaviour = dimensionBehaviour7;
                            i31 = i85;
                            dimensionBehaviourArr = dimensionBehaviourArr3;
                            i32 = 0;
                            int i90 = 0;
                            int i91 = 0;
                            while (i91 < i83) {
                                ConstraintWidget constraintWidget8 = constraintWidgetArr5[i91];
                                int T = T(i79, constraintWidget8);
                                if (constraintWidget8.V[1] == dimensionBehaviour9) {
                                    i32++;
                                }
                                int i92 = i32;
                                boolean z15 = (i90 == i79 || (this.S0 + i90) + T > i79) && aVar3.f4348b != null;
                                if (!z15 && i91 > 0 && (i33 = this.W0) > 0 && i91 % i33 == 0) {
                                    z15 = true;
                                }
                                if (z15) {
                                    aVar3 = new a(i31, this.K, this.L, this.M, this.N, i79);
                                    aVar3.n = i91;
                                    arrayList4.add(aVar3);
                                } else if (i91 > 0) {
                                    i90 = this.S0 + T + i90;
                                    aVar3.a(constraintWidget8);
                                    i91++;
                                    i32 = i92;
                                }
                                i90 = T;
                                aVar3.a(constraintWidget8);
                                i91++;
                                i32 = i92;
                            }
                        }
                        int size = arrayList4.size();
                        int i93 = this.f4374y0;
                        int i94 = this.f4370u0;
                        int i95 = this.f4375z0;
                        int i96 = this.f4371v0;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = dimensionBehaviour;
                        if (dimensionBehaviourArr[0] != dimensionBehaviour11 && dimensionBehaviourArr[1] != dimensionBehaviour11) {
                            z10 = false;
                            if (i32 > 0 && z10) {
                                for (i36 = 0; i36 < size; i36++) {
                                    a aVar4 = arrayList4.get(i36);
                                    aVar4.e(i79 - (i31 == 0 ? aVar4.d() : aVar4.c()));
                                }
                            }
                            int i97 = i94;
                            ConstraintAnchor constraintAnchor5 = constraintAnchor2;
                            ConstraintAnchor constraintAnchor6 = constraintAnchor3;
                            ConstraintAnchor constraintAnchor7 = constraintAnchor4;
                            i34 = 0;
                            int i98 = 0;
                            int i99 = 0;
                            int i100 = i93;
                            ConstraintAnchor constraintAnchor8 = constraintAnchor;
                            while (i34 < size) {
                                a aVar5 = arrayList4.get(i34);
                                if (i31 == 0) {
                                    if (i34 < size - 1) {
                                        constraintAnchor7 = arrayList4.get(i34 + 1).f4348b.L;
                                        arrayList = arrayList4;
                                        i96 = 0;
                                    } else {
                                        i96 = this.f4371v0;
                                        arrayList = arrayList4;
                                        constraintAnchor7 = constraintAnchor4;
                                    }
                                    ConstraintAnchor constraintAnchor9 = aVar5.f4348b.N;
                                    aVar5.f(i31, constraintAnchor5, constraintAnchor8, constraintAnchor6, constraintAnchor7, i100, i97, i95, i96, i79);
                                    int max = Math.max(i98, aVar5.d());
                                    int c11 = aVar5.c() + i99;
                                    if (i34 > 0) {
                                        c11 += this.S0;
                                    }
                                    i35 = size;
                                    i98 = max;
                                    i99 = c11;
                                    constraintAnchor8 = constraintAnchor9;
                                    arrayList4 = arrayList;
                                    i97 = 0;
                                } else {
                                    ArrayList<a> arrayList5 = arrayList4;
                                    if (i34 < size - 1) {
                                        arrayList4 = arrayList5;
                                        i35 = size;
                                        constraintAnchor6 = arrayList4.get(i34 + 1).f4348b.K;
                                        i95 = 0;
                                    } else {
                                        arrayList4 = arrayList5;
                                        i95 = this.f4375z0;
                                        i35 = size;
                                        constraintAnchor6 = constraintAnchor3;
                                    }
                                    ConstraintAnchor constraintAnchor10 = aVar5.f4348b.M;
                                    aVar5.f(i31, constraintAnchor5, constraintAnchor8, constraintAnchor6, constraintAnchor7, i100, i97, i95, i96, i79);
                                    int d5 = aVar5.d() + i98;
                                    int max2 = Math.max(i99, aVar5.c());
                                    if (i34 > 0) {
                                        d5 += this.R0;
                                    }
                                    i98 = d5;
                                    constraintAnchor5 = constraintAnchor10;
                                    i99 = max2;
                                    i100 = 0;
                                }
                                i34++;
                                size = i35;
                            }
                            iArr[0] = i98;
                            iArr[1] = i99;
                        }
                        z10 = true;
                        if (i32 > 0) {
                            while (i36 < size) {
                            }
                        }
                        int i972 = i94;
                        ConstraintAnchor constraintAnchor52 = constraintAnchor2;
                        ConstraintAnchor constraintAnchor62 = constraintAnchor3;
                        ConstraintAnchor constraintAnchor72 = constraintAnchor4;
                        i34 = 0;
                        int i982 = 0;
                        int i992 = 0;
                        int i1002 = i93;
                        ConstraintAnchor constraintAnchor82 = constraintAnchor;
                        while (i34 < size) {
                        }
                        iArr[0] = i982;
                        iArr[1] = i992;
                    }
                } else if (i84 == 2) {
                    ConstraintWidget[] constraintWidgetArr6 = constraintWidgetArr5;
                    iArr = iArr4;
                    i15 = i76;
                    i18 = i75;
                    int i101 = this.X0;
                    int i102 = this.W0;
                    if (i101 == 0) {
                        if (i102 <= 0) {
                            int i103 = 0;
                            int i104 = 0;
                            for (int i105 = 0; i105 < i83; i105++) {
                                if (i105 > 0) {
                                    i103 += this.R0;
                                }
                                ConstraintWidget constraintWidget9 = constraintWidgetArr6[i105];
                                if (constraintWidget9 != null) {
                                    int U2 = U(i79, constraintWidget9) + i103;
                                    if (U2 > i79) {
                                        break;
                                    }
                                    i104++;
                                    i103 = U2;
                                }
                            }
                            i102 = i104;
                        }
                        i40 = i102;
                        i102 = 0;
                    } else {
                        if (i102 <= 0) {
                            int i106 = 0;
                            int i107 = 0;
                            for (int i108 = 0; i108 < i83; i108++) {
                                if (i108 > 0) {
                                    i106 += this.S0;
                                }
                                ConstraintWidget constraintWidget10 = constraintWidgetArr6[i108];
                                if (constraintWidget10 != null) {
                                    int T2 = T(i79, constraintWidget10) + i106;
                                    if (T2 > i79) {
                                        break;
                                    }
                                    i107++;
                                    i106 = T2;
                                }
                            }
                            i102 = i107;
                        }
                        i40 = 0;
                    }
                    if (this.f4344b1 == null) {
                        this.f4344b1 = new int[2];
                    }
                    if ((i102 != 0 || i101 != 1) && (i40 != 0 || i101 != 0)) {
                        i28 = i13;
                        i41 = i101;
                        i42 = i102;
                        i43 = i40;
                        eVar3 = this;
                        eVar2 = eVar3;
                        i23 = i73;
                        constraintWidgetArr = constraintWidgetArr6;
                        i24 = i74;
                        iArr3 = iArr;
                        z11 = false;
                        i44 = i10;
                        i45 = i11;
                        i46 = i12;
                        while (!z11) {
                            if (i41 == 0) {
                                i47 = i44;
                                i48 = i45;
                                i42 = (int) Math.ceil(i83 / i43);
                            } else {
                                i47 = i44;
                                i48 = i45;
                                i43 = (int) Math.ceil(i83 / i42);
                            }
                            ConstraintWidget[] constraintWidgetArr7 = eVar3.f4343a1;
                            if (constraintWidgetArr7 != null && constraintWidgetArr7.length >= i43) {
                                Arrays.fill(constraintWidgetArr7, (Object) null);
                                constraintWidgetArr2 = eVar3.Z0;
                                if (constraintWidgetArr2 != null && constraintWidgetArr2.length >= i42) {
                                    Arrays.fill(constraintWidgetArr2, (Object) null);
                                    for (i49 = 0; i49 < i43; i49++) {
                                        int i109 = 0;
                                        while (i109 < i42) {
                                            int i110 = (i109 * i43) + i49;
                                            int i111 = i46;
                                            if (i41 == 1) {
                                                i110 = (i49 * i42) + i109;
                                            }
                                            int i112 = i28;
                                            int i113 = i110;
                                            if (i113 < constraintWidgetArr.length && (constraintWidget2 = constraintWidgetArr[i113]) != null) {
                                                int U3 = eVar3.U(i79, constraintWidget2);
                                                constraintWidgetArr3 = constraintWidgetArr;
                                                ConstraintWidget constraintWidget11 = eVar3.f4343a1[i49];
                                                if (constraintWidget11 == null || constraintWidget11.q() < U3) {
                                                    eVar3.f4343a1[i49] = constraintWidget2;
                                                }
                                                int T3 = eVar3.T(i79, constraintWidget2);
                                                ConstraintWidget constraintWidget12 = eVar3.Z0[i109];
                                                if (constraintWidget12 == null || constraintWidget12.l() < T3) {
                                                    eVar3.Z0[i109] = constraintWidget2;
                                                }
                                                i109++;
                                                i46 = i111;
                                                i28 = i112;
                                                constraintWidgetArr = constraintWidgetArr3;
                                            }
                                            constraintWidgetArr3 = constraintWidgetArr;
                                            i109++;
                                            i46 = i111;
                                            i28 = i112;
                                            constraintWidgetArr = constraintWidgetArr3;
                                        }
                                        int i114 = i46;
                                        int i115 = i28;
                                        ConstraintWidget[] constraintWidgetArr8 = constraintWidgetArr;
                                    }
                                    int i116 = i46;
                                    int i117 = i28;
                                    ConstraintWidget[] constraintWidgetArr9 = constraintWidgetArr;
                                    int i118 = 0;
                                    for (i50 = 0; i50 < i43; i50++) {
                                        ConstraintWidget constraintWidget13 = eVar3.f4343a1[i50];
                                        if (constraintWidget13 != null) {
                                            if (i50 > 0) {
                                                i118 += eVar3.R0;
                                            }
                                            i118 = eVar3.U(i79, constraintWidget13) + i118;
                                        }
                                    }
                                    int i119 = 0;
                                    for (i51 = 0; i51 < i42; i51++) {
                                        ConstraintWidget constraintWidget14 = eVar3.Z0[i51];
                                        if (constraintWidget14 != null) {
                                            if (i51 > 0) {
                                                i119 += eVar3.S0;
                                            }
                                            i119 = eVar3.T(i79, constraintWidget14) + i119;
                                        }
                                    }
                                    iArr3[0] = i118;
                                    iArr3[1] = i119;
                                    if (i41 != 0) {
                                        if (i119 > i79 && i42 > 1) {
                                            i42--;
                                            i44 = i47;
                                            i45 = i48;
                                            i46 = i116;
                                            i28 = i117;
                                            constraintWidgetArr = constraintWidgetArr9;
                                        }
                                        i52 = i47;
                                        i53 = i48;
                                        i54 = i116;
                                        i55 = i43;
                                        constraintWidgetArr6 = constraintWidgetArr9;
                                        i56 = i42;
                                        i57 = i41;
                                        i58 = i117;
                                    } else {
                                        if (i118 > i79 && i43 > 1) {
                                            i43--;
                                            i44 = i47;
                                            i45 = i48;
                                            i46 = i116;
                                            i28 = i117;
                                            constraintWidgetArr = constraintWidgetArr9;
                                        }
                                        i52 = i47;
                                        i53 = i48;
                                        i54 = i116;
                                        i55 = i43;
                                        constraintWidgetArr6 = constraintWidgetArr9;
                                        i56 = i42;
                                        i57 = i41;
                                        i58 = i117;
                                    }
                                    i44 = i52;
                                    i45 = i53;
                                    i46 = i54;
                                    i28 = i58;
                                    i41 = i57;
                                    i42 = i56;
                                    i43 = i55;
                                    constraintWidgetArr = constraintWidgetArr6;
                                    z11 = true;
                                    while (!z11) {
                                    }
                                }
                                eVar3.Z0 = new ConstraintWidget[i42];
                                while (i49 < i43) {
                                }
                                int i1162 = i46;
                                int i1172 = i28;
                                ConstraintWidget[] constraintWidgetArr92 = constraintWidgetArr;
                                int i1182 = 0;
                                while (i50 < i43) {
                                }
                                int i1192 = 0;
                                while (i51 < i42) {
                                }
                                iArr3[0] = i1182;
                                iArr3[1] = i1192;
                                if (i41 != 0) {
                                }
                                i44 = i52;
                                i45 = i53;
                                i46 = i54;
                                i28 = i58;
                                i41 = i57;
                                i42 = i56;
                                i43 = i55;
                                constraintWidgetArr = constraintWidgetArr6;
                                z11 = true;
                                while (!z11) {
                                }
                            }
                            eVar3.f4343a1 = new ConstraintWidget[i43];
                            constraintWidgetArr2 = eVar3.Z0;
                            if (constraintWidgetArr2 != null) {
                                Arrays.fill(constraintWidgetArr2, (Object) null);
                                while (i49 < i43) {
                                }
                                int i11622 = i46;
                                int i11722 = i28;
                                ConstraintWidget[] constraintWidgetArr922 = constraintWidgetArr;
                                int i11822 = 0;
                                while (i50 < i43) {
                                }
                                int i11922 = 0;
                                while (i51 < i42) {
                                }
                                iArr3[0] = i11822;
                                iArr3[1] = i11922;
                                if (i41 != 0) {
                                }
                                i44 = i52;
                                i45 = i53;
                                i46 = i54;
                                i28 = i58;
                                i41 = i57;
                                i42 = i56;
                                i43 = i55;
                                constraintWidgetArr = constraintWidgetArr6;
                                z11 = true;
                                while (!z11) {
                                }
                            }
                            eVar3.Z0 = new ConstraintWidget[i42];
                            while (i49 < i43) {
                            }
                            int i116222 = i46;
                            int i117222 = i28;
                            ConstraintWidget[] constraintWidgetArr9222 = constraintWidgetArr;
                            int i118222 = 0;
                            while (i50 < i43) {
                            }
                            int i119222 = 0;
                            while (i51 < i42) {
                            }
                            iArr3[0] = i118222;
                            iArr3[1] = i119222;
                            if (i41 != 0) {
                            }
                            i44 = i52;
                            i45 = i53;
                            i46 = i54;
                            i28 = i58;
                            i41 = i57;
                            i42 = i56;
                            i43 = i55;
                            constraintWidgetArr = constraintWidgetArr6;
                            z11 = true;
                            while (!z11) {
                            }
                        }
                        int i120 = i45;
                        int i121 = i28;
                        int[] iArr5 = eVar3.f4344b1;
                        iArr5[0] = i43;
                        iArr5[1] = i42;
                        i19 = i44;
                        i30 = i120;
                        i29 = i46;
                        iArr2 = iArr;
                        i25 = i15;
                        i26 = i18;
                        i22 = i28;
                        eVar = eVar2;
                        c = 0;
                        i21 = i29;
                        i20 = i30;
                        c10 = 1;
                        int i122 = iArr2[c] + i23 + i24;
                        int i123 = iArr2[c10] + i26 + i25;
                        if (i19 != 1073741824) {
                            i27 = i20;
                        } else if (i19 == Integer.MIN_VALUE) {
                            i27 = Math.min(i122, i20);
                        } else {
                            i27 = i19 == 0 ? i122 : 0;
                        }
                        int min = i21 != 1073741824 ? i22 : i21 == Integer.MIN_VALUE ? Math.min(i123, i22) : i21 == 0 ? i123 : 0;
                        eVar.B0 = i27;
                        eVar.C0 = min;
                        eVar.N(i27);
                        eVar.K(min);
                        eVar.A0 = eVar.f10896t0 <= 0;
                    }
                    i54 = i12;
                    i58 = i13;
                    i57 = i101;
                    i56 = i102;
                    i55 = i40;
                    eVar3 = this;
                    eVar2 = eVar3;
                    i23 = i73;
                    i24 = i74;
                    iArr3 = iArr;
                    i52 = i10;
                    i53 = i11;
                    i44 = i52;
                    i45 = i53;
                    i46 = i54;
                    i28 = i58;
                    i41 = i57;
                    i42 = i56;
                    i43 = i55;
                    constraintWidgetArr = constraintWidgetArr6;
                    z11 = true;
                    while (!z11) {
                    }
                    int i1202 = i45;
                    int i1212 = i28;
                    int[] iArr52 = eVar3.f4344b1;
                    iArr52[0] = i43;
                    iArr52[1] = i42;
                    i19 = i44;
                    i30 = i1202;
                    i29 = i46;
                    iArr2 = iArr;
                    i25 = i15;
                    i26 = i18;
                    i22 = i28;
                    eVar = eVar2;
                    c = 0;
                    i21 = i29;
                    i20 = i30;
                    c10 = 1;
                    int i1222 = iArr2[c] + i23 + i24;
                    int i1232 = iArr2[c10] + i26 + i25;
                    if (i19 != 1073741824) {
                    }
                    if (i21 != 1073741824) {
                    }
                    eVar.B0 = i27;
                    eVar.C0 = min;
                    eVar.N(i27);
                    eVar.K(min);
                    eVar.A0 = eVar.f10896t0 <= 0;
                } else {
                    if (i84 == 3) {
                        int i124 = this.X0;
                        if (i83 != 0) {
                            arrayList3.clear();
                            i16 = i73;
                            ArrayList<a> arrayList6 = arrayList3;
                            int i125 = i79;
                            iArr = iArr4;
                            i15 = i76;
                            a aVar6 = new a(i124, this.K, this.L, this.M, this.N, i125);
                            arrayList6.add(aVar6);
                            if (i124 == 0) {
                                int i126 = 0;
                                i60 = 0;
                                int i127 = 0;
                                int i128 = 0;
                                while (i128 < i83) {
                                    int i129 = i126 + 1;
                                    ConstraintWidget constraintWidget15 = constraintWidgetArr5[i128];
                                    int i130 = i125;
                                    int U4 = U(i130, constraintWidget15);
                                    if (constraintWidget15.V[0] == dimensionBehaviour8) {
                                        i60++;
                                    }
                                    int i131 = i60;
                                    boolean z16 = (i127 == i130 || (this.R0 + i127) + U4 > i130) && aVar6.f4348b != null;
                                    if (!z16 && i128 > 0 && (i69 = this.W0) > 0 && i129 > i69) {
                                        z16 = true;
                                    }
                                    if (z16) {
                                        i66 = i74;
                                        i65 = i130;
                                        i67 = i75;
                                        constraintWidget3 = constraintWidget15;
                                        dimensionBehaviour6 = dimensionBehaviour7;
                                        i68 = i128;
                                        a aVar7 = new a(i124, this.K, this.L, this.M, this.N, i65);
                                        aVar7.n = i68;
                                        arrayList6.add(aVar7);
                                        aVar6 = aVar7;
                                        i127 = U4;
                                        i126 = i129;
                                    } else {
                                        i65 = i130;
                                        dimensionBehaviour6 = dimensionBehaviour7;
                                        i66 = i74;
                                        i67 = i75;
                                        constraintWidget3 = constraintWidget15;
                                        i68 = i128;
                                        if (i68 > 0) {
                                            U4 = this.R0 + U4 + i127;
                                        }
                                        i127 = U4;
                                        i126 = 0;
                                    }
                                    aVar6.a(constraintWidget3);
                                    i128 = i68 + 1;
                                    i60 = i131;
                                    dimensionBehaviour7 = dimensionBehaviour6;
                                    i74 = i66;
                                    i125 = i65;
                                    i75 = i67;
                                }
                                dimensionBehaviour4 = dimensionBehaviour7;
                                i18 = i75;
                                int i132 = i125;
                                i17 = i74;
                                i59 = i132;
                            } else {
                                dimensionBehaviour4 = dimensionBehaviour7;
                                i18 = i75;
                                int i133 = i125;
                                i17 = i74;
                                int i134 = 0;
                                int i135 = 0;
                                int i136 = 0;
                                while (i136 < i83) {
                                    ConstraintWidget constraintWidget16 = constraintWidgetArr5[i136];
                                    int i137 = i133;
                                    int T4 = T(i137, constraintWidget16);
                                    if (constraintWidget16.V[1] == dimensionBehaviour8) {
                                        i134++;
                                    }
                                    int i138 = i134;
                                    boolean z17 = (i135 == i137 || (this.S0 + i135) + T4 > i137) && aVar6.f4348b != null;
                                    if (!z17 && i136 > 0 && (i61 = this.W0) > 0 && i61 < 0) {
                                        z17 = true;
                                    }
                                    if (z17) {
                                        dimensionBehaviour5 = dimensionBehaviour8;
                                        a aVar8 = new a(i124, this.K, this.L, this.M, this.N, i137);
                                        aVar8.n = i136;
                                        arrayList6.add(aVar8);
                                        aVar6 = aVar8;
                                    } else {
                                        dimensionBehaviour5 = dimensionBehaviour8;
                                        if (i136 > 0) {
                                            i135 = this.S0 + T4 + i135;
                                            aVar6.a(constraintWidget16);
                                            i136++;
                                            i133 = i137;
                                            i134 = i138;
                                            dimensionBehaviour8 = dimensionBehaviour5;
                                        }
                                    }
                                    i135 = T4;
                                    aVar6.a(constraintWidget16);
                                    i136++;
                                    i133 = i137;
                                    i134 = i138;
                                    dimensionBehaviour8 = dimensionBehaviour5;
                                }
                                i59 = i133;
                                i60 = i134;
                            }
                            int size2 = arrayList6.size();
                            int i139 = this.f4374y0;
                            int i140 = this.f4370u0;
                            int i141 = this.f4375z0;
                            int i142 = this.f4371v0;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dimensionBehaviour4;
                            if (dimensionBehaviourArr3[0] != dimensionBehaviour12 && dimensionBehaviourArr3[1] != dimensionBehaviour12) {
                                z12 = false;
                                if (i60 > 0 && z12) {
                                    for (i64 = 0; i64 < size2; i64++) {
                                        a aVar9 = arrayList6.get(i64);
                                        aVar9.e(i59 - (i124 == 0 ? aVar9.d() : aVar9.c()));
                                    }
                                }
                                int i143 = i140;
                                ConstraintAnchor constraintAnchor11 = constraintAnchor;
                                ConstraintAnchor constraintAnchor12 = constraintAnchor3;
                                ConstraintAnchor constraintAnchor13 = constraintAnchor4;
                                i62 = 0;
                                int i144 = 0;
                                int i145 = 0;
                                int i146 = i139;
                                ConstraintAnchor constraintAnchor14 = constraintAnchor2;
                                while (i62 < size2) {
                                    a aVar10 = arrayList6.get(i62);
                                    if (i124 == 0) {
                                        if (i62 < size2 - 1) {
                                            constraintAnchor13 = arrayList6.get(i62 + 1).f4348b.L;
                                            arrayList2 = arrayList6;
                                            i142 = 0;
                                        } else {
                                            i142 = this.f4371v0;
                                            arrayList2 = arrayList6;
                                            constraintAnchor13 = constraintAnchor4;
                                        }
                                        ConstraintAnchor constraintAnchor15 = aVar10.f4348b.N;
                                        aVar10.f(i124, constraintAnchor14, constraintAnchor11, constraintAnchor12, constraintAnchor13, i146, i143, i141, i142, i59);
                                        int max3 = Math.max(i144, aVar10.d());
                                        int c12 = aVar10.c() + i145;
                                        if (i62 > 0) {
                                            c12 += this.S0;
                                        }
                                        i63 = size2;
                                        i144 = max3;
                                        i145 = c12;
                                        constraintAnchor11 = constraintAnchor15;
                                        arrayList6 = arrayList2;
                                        i143 = 0;
                                    } else {
                                        ArrayList<a> arrayList7 = arrayList6;
                                        if (i62 < size2 - 1) {
                                            arrayList6 = arrayList7;
                                            i63 = size2;
                                            constraintAnchor12 = arrayList6.get(i62 + 1).f4348b.K;
                                            i141 = 0;
                                        } else {
                                            arrayList6 = arrayList7;
                                            i141 = this.f4375z0;
                                            i63 = size2;
                                            constraintAnchor12 = constraintAnchor3;
                                        }
                                        ConstraintAnchor constraintAnchor16 = aVar10.f4348b.M;
                                        aVar10.f(i124, constraintAnchor14, constraintAnchor11, constraintAnchor12, constraintAnchor13, i146, i143, i141, i142, i59);
                                        int d10 = aVar10.d() + i144;
                                        int max4 = Math.max(i145, aVar10.c());
                                        if (i62 > 0) {
                                            d10 += this.R0;
                                        }
                                        i144 = d10;
                                        i145 = max4;
                                        i146 = 0;
                                        constraintAnchor14 = constraintAnchor16;
                                    }
                                    i62++;
                                    size2 = i63;
                                }
                                iArr[0] = i144;
                                iArr[1] = i145;
                            }
                            z12 = true;
                            if (i60 > 0) {
                                while (i64 < size2) {
                                }
                            }
                            int i1432 = i140;
                            ConstraintAnchor constraintAnchor112 = constraintAnchor;
                            ConstraintAnchor constraintAnchor122 = constraintAnchor3;
                            ConstraintAnchor constraintAnchor132 = constraintAnchor4;
                            i62 = 0;
                            int i1442 = 0;
                            int i1452 = 0;
                            int i1462 = i139;
                            ConstraintAnchor constraintAnchor142 = constraintAnchor2;
                            while (i62 < size2) {
                            }
                            iArr[0] = i1442;
                            iArr[1] = i1452;
                        }
                    }
                    iArr = iArr4;
                    i15 = i76;
                    i16 = i73;
                    i17 = i74;
                    i18 = i75;
                }
            } else {
                iArr = iArr4;
                i15 = i76;
                i16 = i73;
                i17 = i74;
                i18 = i75;
                int i147 = this.X0;
                if (i83 != 0) {
                    if (arrayList3.size() == 0) {
                        aVar = new a(i147, this.K, this.L, this.M, this.N, i79);
                        arrayList3.add(aVar);
                    } else {
                        aVar = arrayList3.get(0);
                        aVar.c = 0;
                        aVar.f4348b = null;
                        aVar.f4357l = 0;
                        aVar.f4358m = 0;
                        aVar.n = 0;
                        aVar.f4359o = 0;
                        aVar.f4360p = 0;
                        aVar.f(i147, this.K, this.L, this.M, this.N, this.f4374y0, this.f4370u0, this.f4375z0, this.f4371v0, i79);
                    }
                    for (int i148 = 0; i148 < i83; i148++) {
                        aVar.a(constraintWidgetArr5[i148]);
                    }
                    c = 0;
                    iArr[0] = aVar.d();
                    c10 = 1;
                    iArr[1] = aVar.c();
                    i19 = i10;
                    i20 = i11;
                    i21 = i12;
                    i22 = i13;
                    eVar = this;
                    i23 = i16;
                    i24 = i17;
                    iArr2 = iArr;
                    i25 = i15;
                    i26 = i18;
                    int i12222 = iArr2[c] + i23 + i24;
                    int i12322 = iArr2[c10] + i26 + i25;
                    if (i19 != 1073741824) {
                    }
                    if (i21 != 1073741824) {
                    }
                    eVar.B0 = i27;
                    eVar.C0 = min;
                    eVar.N(i27);
                    eVar.K(min);
                    eVar.A0 = eVar.f10896t0 <= 0;
                }
            }
            i19 = i10;
            i30 = i11;
            i29 = i12;
            i28 = i13;
            eVar2 = this;
            i23 = i16;
            i24 = i17;
            iArr2 = iArr;
            i25 = i15;
            i26 = i18;
            i22 = i28;
            eVar = eVar2;
            c = 0;
            i21 = i29;
            i20 = i30;
            c10 = 1;
            int i122222 = iArr2[c] + i23 + i24;
            int i123222 = iArr2[c10] + i26 + i25;
            if (i19 != 1073741824) {
            }
            if (i21 != 1073741824) {
            }
            eVar.B0 = i27;
            eVar.C0 = min;
            eVar.N(i27);
            eVar.K(min);
            eVar.A0 = eVar.f10896t0 <= 0;
        } else if (this.F0 == -1) {
            this.F0 = 0;
        }
    }

    public final int T(int i10, ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return 0;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        if (dimensionBehaviourArr[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.f4270t;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.A * i10);
                if (i12 != constraintWidget.l()) {
                    constraintWidget.f4246g = true;
                    S(constraintWidget, dimensionBehaviourArr[0], constraintWidget.q(), ConstraintWidget.DimensionBehaviour.FIXED, i12);
                }
                return i12;
            } else if (i11 == 1) {
                return constraintWidget.l();
            } else {
                if (i11 == 3) {
                    return (int) ((constraintWidget.q() * constraintWidget.Z) + 0.5f);
                }
            }
        }
        return constraintWidget.l();
    }

    public final int U(int i10, ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return 0;
        }
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        if (dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.f4269s;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.f4274x * i10);
                if (i12 != constraintWidget.q()) {
                    constraintWidget.f4246g = true;
                    S(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i12, dimensionBehaviourArr[1], constraintWidget.l());
                }
                return i12;
            } else if (i11 == 1) {
                return constraintWidget.q();
            } else {
                if (i11 == 3) {
                    return (int) ((constraintWidget.l() * constraintWidget.Z) + 0.5f);
                }
            }
        }
        return constraintWidget.q();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void c(androidx.constraintlayout.core.c cVar, boolean z10) {
        boolean z11;
        boolean z12;
        ConstraintWidget constraintWidget;
        float f10;
        int i10;
        boolean z13;
        super.c(cVar, z10);
        ConstraintWidget constraintWidget2 = this.W;
        if (constraintWidget2 != null && ((d) constraintWidget2).f4340x0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = this.V0;
        ArrayList<a> arrayList = this.Y0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        int size = arrayList.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            a aVar = arrayList.get(i12);
                            if (i12 == size - 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            aVar.b(i12, z11, z13);
                        }
                    }
                } else if (this.f4344b1 != null && this.f4343a1 != null && this.Z0 != null) {
                    for (int i13 = 0; i13 < this.f4346d1; i13++) {
                        this.f4345c1[i13].D();
                    }
                    int[] iArr = this.f4344b1;
                    int i14 = iArr[0];
                    int i15 = iArr[1];
                    float f11 = this.L0;
                    ConstraintWidget constraintWidget3 = null;
                    int i16 = 0;
                    while (i16 < i14) {
                        if (z11) {
                            i10 = (i14 - i16) - 1;
                            f10 = 1.0f - this.L0;
                        } else {
                            f10 = f11;
                            i10 = i16;
                        }
                        ConstraintWidget constraintWidget4 = this.f4343a1[i10];
                        if (constraintWidget4 != null && constraintWidget4.f4253j0 != 8) {
                            ConstraintAnchor constraintAnchor = constraintWidget4.K;
                            if (i16 == 0) {
                                constraintWidget4.g(constraintAnchor, this.K, this.f4374y0);
                                constraintWidget4.f4257l0 = this.F0;
                                constraintWidget4.f4247g0 = f10;
                            }
                            if (i16 == i14 - 1) {
                                constraintWidget4.g(constraintWidget4.M, this.M, this.f4375z0);
                            }
                            if (i16 > 0 && constraintWidget3 != null) {
                                int i17 = this.R0;
                                ConstraintAnchor constraintAnchor2 = constraintWidget3.M;
                                constraintWidget4.g(constraintAnchor, constraintAnchor2, i17);
                                constraintWidget3.g(constraintAnchor2, constraintAnchor, 0);
                            }
                            constraintWidget3 = constraintWidget4;
                        }
                        i16++;
                        f11 = f10;
                    }
                    for (int i18 = 0; i18 < i15; i18++) {
                        ConstraintWidget constraintWidget5 = this.Z0[i18];
                        if (constraintWidget5 != null && constraintWidget5.f4253j0 != 8) {
                            ConstraintAnchor constraintAnchor3 = constraintWidget5.L;
                            if (i18 == 0) {
                                constraintWidget5.g(constraintAnchor3, this.L, this.f4370u0);
                                constraintWidget5.f4259m0 = this.G0;
                                constraintWidget5.f4249h0 = this.M0;
                            }
                            if (i18 == i15 - 1) {
                                constraintWidget5.g(constraintWidget5.N, this.N, this.f4371v0);
                            }
                            if (i18 > 0 && constraintWidget3 != null) {
                                int i19 = this.S0;
                                ConstraintAnchor constraintAnchor4 = constraintWidget3.N;
                                constraintWidget5.g(constraintAnchor3, constraintAnchor4, i19);
                                constraintWidget3.g(constraintAnchor4, constraintAnchor3, 0);
                            }
                            constraintWidget3 = constraintWidget5;
                        }
                    }
                    for (int i20 = 0; i20 < i14; i20++) {
                        for (int i21 = 0; i21 < i15; i21++) {
                            int i22 = (i21 * i14) + i20;
                            if (this.X0 == 1) {
                                i22 = (i20 * i15) + i21;
                            }
                            ConstraintWidget[] constraintWidgetArr = this.f4345c1;
                            if (i22 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i22]) != null && constraintWidget.f4253j0 != 8) {
                                ConstraintWidget constraintWidget6 = this.f4343a1[i20];
                                ConstraintWidget constraintWidget7 = this.Z0[i21];
                                if (constraintWidget != constraintWidget6) {
                                    constraintWidget.g(constraintWidget.K, constraintWidget6.K, 0);
                                    constraintWidget.g(constraintWidget.M, constraintWidget6.M, 0);
                                }
                                if (constraintWidget != constraintWidget7) {
                                    constraintWidget.g(constraintWidget.L, constraintWidget7.L, 0);
                                    constraintWidget.g(constraintWidget.N, constraintWidget7.N, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i23 = 0; i23 < size2; i23++) {
                    a aVar2 = arrayList.get(i23);
                    if (i23 == size2 - 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    aVar2.b(i23, z11, z12);
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).b(0, z11, true);
        }
        this.A0 = false;
    }
}
