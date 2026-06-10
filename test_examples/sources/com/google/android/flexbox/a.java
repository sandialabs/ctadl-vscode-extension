package com.google.android.flexbox;

import a3.j0;
import a3.v0;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CompoundButton;
import androidx.activity.e;
import androidx.recyclerview.widget.RecyclerView;
import c5.b;
import c5.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c5.a f6771a;

    /* renamed from: b  reason: collision with root package name */
    public boolean[] f6772b;
    public int[] c;

    /* renamed from: d  reason: collision with root package name */
    public long[] f6773d;

    /* renamed from: e  reason: collision with root package name */
    public long[] f6774e;

    /* renamed from: com.google.android.flexbox.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0058a {

        /* renamed from: a  reason: collision with root package name */
        public List<c> f6775a;
    }

    public a(c5.a aVar) {
        this.f6771a = aVar;
    }

    public final void a(List<c> list, c cVar, int i10, int i11) {
        cVar.f6540i = i11;
        this.f6771a.getClass();
        cVar.f6543l = i10;
        list.add(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x023b, code lost:
        if (r6 < (r7 + r13)) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03f3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C0058a c0058a, int i10, int i11, int i12, int i13, int i14, List<c> list) {
        C0058a c0058a2;
        List<c> list2;
        boolean z10;
        int J;
        int G;
        int i15;
        int i16;
        RecyclerView.l lVar;
        List<c> list3;
        int i17;
        int a10;
        int W0;
        int measuredHeight;
        int H;
        int E;
        int i18;
        int i19;
        int i20;
        int O;
        int y10;
        boolean z11;
        int i21;
        boolean z12;
        boolean z13;
        int[] iArr;
        int measuredHeight2;
        int H2;
        int E2;
        int O2;
        int y11;
        int measuredWidth;
        int F;
        int w10;
        boolean z14;
        int i22;
        int i23;
        int E3;
        int i24;
        int minimumWidth;
        int minimumHeight;
        int i25;
        boolean z15;
        boolean z16;
        c5.a aVar = this.f6771a;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) aVar;
        boolean e12 = flexboxLayoutManager.e1();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (list == null) {
            list2 = new ArrayList<>();
            c0058a2 = c0058a;
        } else {
            c0058a2 = c0058a;
            list2 = list;
        }
        c0058a2.f6775a = list2;
        if (i14 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        RecyclerView.l lVar2 = (RecyclerView.l) aVar;
        if (e12) {
            RecyclerView recyclerView = lVar2.f5693b;
            if (recyclerView != null) {
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                J = j0.e.f(recyclerView);
            } else {
                J = 0;
            }
        } else {
            J = lVar2.J();
        }
        if (e12) {
            RecyclerView recyclerView2 = lVar2.f5693b;
            if (recyclerView2 != null) {
                WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                G = j0.e.e(recyclerView2);
            } else {
                G = 0;
            }
        } else {
            G = lVar2.G();
        }
        if (e12) {
            i15 = lVar2.J();
        } else {
            RecyclerView recyclerView3 = lVar2.f5693b;
            if (recyclerView3 != null) {
                WeakHashMap<View, v0> weakHashMap3 = j0.f188a;
                i15 = j0.e.f(recyclerView3);
            } else {
                i15 = 0;
            }
        }
        if (e12) {
            i16 = lVar2.G();
        } else {
            RecyclerView recyclerView4 = lVar2.f5693b;
            if (recyclerView4 != null) {
                WeakHashMap<View, v0> weakHashMap4 = j0.f188a;
                i16 = j0.e.e(recyclerView4);
            } else {
                i16 = 0;
            }
        }
        c cVar = new c();
        int i26 = i13;
        cVar.f6542k = i26;
        int i27 = J + G;
        cVar.f6533a = i27;
        int a12 = flexboxLayoutManager.a1();
        int i28 = 0;
        int i29 = 0;
        int i30 = Integer.MIN_VALUE;
        while (i26 < a12) {
            boolean z17 = z10;
            View Z0 = flexboxLayoutManager.Z0(i26);
            if (Z0 == null) {
                if (i26 == a12 - 1 && cVar.f6535d - cVar.f6536e != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    a(list2, cVar, i26, i28);
                }
                lVar = lVar2;
            } else {
                lVar = lVar2;
                if (Z0.getVisibility() == 8) {
                    int i31 = cVar.f6536e + 1;
                    cVar.f6536e = i31;
                    int i32 = cVar.f6535d + 1;
                    cVar.f6535d = i32;
                    if (i26 == a12 - 1 && i32 - i31 != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        a(list2, cVar, i26, i28);
                    }
                } else {
                    if (Z0 instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) Z0;
                        b bVar = (b) compoundButton.getLayoutParams();
                        i17 = a12;
                        int z18 = bVar.z();
                        list3 = list2;
                        int y12 = bVar.y();
                        Drawable a11 = e3.b.a(compoundButton);
                        if (a11 == null) {
                            minimumWidth = 0;
                        } else {
                            minimumWidth = a11.getMinimumWidth();
                        }
                        if (a11 == null) {
                            i25 = -1;
                            minimumHeight = 0;
                        } else {
                            minimumHeight = a11.getMinimumHeight();
                            i25 = -1;
                        }
                        if (z18 == i25) {
                            z18 = minimumWidth;
                        }
                        bVar.D(z18);
                        if (y12 == i25) {
                            y12 = minimumHeight;
                        }
                        bVar.j(y12);
                    } else {
                        list3 = list2;
                        i17 = a12;
                    }
                    b bVar2 = (b) Z0.getLayoutParams();
                    if (bVar2.r() == 4) {
                        cVar.f6541j.add(Integer.valueOf(i26));
                    }
                    if (e12) {
                        a10 = bVar2.b();
                    } else {
                        a10 = bVar2.a();
                    }
                    if (bVar2.p() != -1.0f && mode == 1073741824) {
                        a10 = Math.round(bVar2.p() * size);
                    }
                    if (e12) {
                        W0 = flexboxLayoutManager.X0(bVar2.w() + bVar2.F() + i27, a10);
                        int W02 = flexboxLayoutManager.W0(bVar2.E() + bVar2.H() + i15 + i16 + i28, bVar2.a());
                        Z0.measure(W0, W02);
                        p(Z0, i26, W0, W02);
                    } else {
                        int X0 = flexboxLayoutManager.X0(bVar2.w() + bVar2.F() + i15 + i16 + i28, bVar2.b());
                        W0 = flexboxLayoutManager.W0(bVar2.E() + bVar2.H() + i27, a10);
                        Z0.measure(X0, W0);
                        p(Z0, i26, X0, W0);
                    }
                    flexboxLayoutManager.m1(Z0, i26);
                    c(Z0, i26);
                    i29 = View.combineMeasuredStates(i29, Z0.getMeasuredState());
                    int i33 = cVar.f6533a;
                    if (e12) {
                        measuredHeight = Z0.getMeasuredWidth();
                    } else {
                        measuredHeight = Z0.getMeasuredHeight();
                    }
                    if (e12) {
                        H = bVar2.F();
                    } else {
                        H = bVar2.H();
                    }
                    int i34 = H + measuredHeight;
                    if (e12) {
                        E = bVar2.w();
                    } else {
                        E = bVar2.E();
                    }
                    int i35 = E + i34;
                    int size2 = list3.size();
                    i18 = i15;
                    if (flexboxLayoutManager.f6736r != 0) {
                        if (bVar2.A()) {
                            i19 = mode;
                            i20 = i16;
                        } else if (mode != 0) {
                            int i36 = flexboxLayoutManager.f6738t;
                            i19 = mode;
                            i20 = i16;
                            if (i36 == -1 || i36 > size2 + 1) {
                                if (flexboxLayoutManager.e1()) {
                                    O = RecyclerView.l.F(Z0);
                                    y10 = RecyclerView.l.M(Z0);
                                } else {
                                    O = RecyclerView.l.O(Z0);
                                    y10 = RecyclerView.l.y(Z0);
                                }
                                int i37 = y10 + O;
                                if (i37 > 0) {
                                    i35 += i37;
                                }
                            }
                            z11 = false;
                            if (z11) {
                                if (cVar.f6535d - cVar.f6536e > 0) {
                                    if (i26 > 0) {
                                        i24 = i26 - 1;
                                        list2 = list3;
                                    } else {
                                        list2 = list3;
                                        i24 = 0;
                                    }
                                    a(list2, cVar, i24, i28);
                                    i28 += cVar.c;
                                } else {
                                    list2 = list3;
                                }
                                if (e12) {
                                    if (bVar2.a() == -1) {
                                        Z0.measure(W0, flexboxLayoutManager.W0(bVar2.E() + bVar2.H() + lVar.G() + lVar.J() + i28, bVar2.a()));
                                        c(Z0, i26);
                                    }
                                    cVar = new c();
                                    cVar.f6535d = 1;
                                    cVar.f6533a = i27;
                                    cVar.f6542k = i26;
                                    i21 = Integer.MIN_VALUE;
                                } else {
                                    if (bVar2.b() == -1) {
                                        Z0.measure(flexboxLayoutManager.X0(bVar2.w() + bVar2.F() + lVar.I() + lVar.H() + i28, bVar2.b()), W0);
                                        c(Z0, i26);
                                    }
                                    cVar = new c();
                                    cVar.f6535d = 1;
                                    cVar.f6533a = i27;
                                    cVar.f6542k = i26;
                                    i21 = Integer.MIN_VALUE;
                                }
                            } else {
                                list2 = list3;
                                cVar.f6535d++;
                                i21 = i30;
                            }
                            boolean z19 = cVar.f6544m;
                            if (bVar2.k() != 0.0f) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            cVar.f6544m = z19 | z12;
                            boolean z20 = cVar.n;
                            if (bVar2.u() != 0.0f) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            cVar.n = z20 | z13;
                            iArr = this.c;
                            if (iArr != null) {
                                iArr[i26] = list2.size();
                            }
                            int i38 = cVar.f6533a;
                            if (e12) {
                                measuredHeight2 = Z0.getMeasuredWidth();
                            } else {
                                measuredHeight2 = Z0.getMeasuredHeight();
                            }
                            if (e12) {
                                H2 = bVar2.F();
                            } else {
                                H2 = bVar2.H();
                            }
                            int i39 = H2 + measuredHeight2;
                            if (e12) {
                                E2 = bVar2.w();
                            } else {
                                E2 = bVar2.E();
                            }
                            cVar.f6533a = E2 + i39 + i38;
                            cVar.f6537f = bVar2.k() + cVar.f6537f;
                            cVar.f6538g = bVar2.u() + cVar.f6538g;
                            flexboxLayoutManager.g(Z0, FlexboxLayoutManager.O);
                            if (flexboxLayoutManager.e1()) {
                                O2 = RecyclerView.l.F(Z0);
                                y11 = RecyclerView.l.M(Z0);
                            } else {
                                O2 = RecyclerView.l.O(Z0);
                                y11 = RecyclerView.l.y(Z0);
                            }
                            int i40 = y11 + O2;
                            cVar.f6533a += i40;
                            cVar.f6534b += i40;
                            if (e12) {
                                measuredWidth = Z0.getMeasuredHeight();
                            } else {
                                measuredWidth = Z0.getMeasuredWidth();
                            }
                            if (e12) {
                                F = bVar2.H();
                            } else {
                                F = bVar2.F();
                            }
                            int i41 = F + measuredWidth;
                            if (e12) {
                                w10 = bVar2.E();
                            } else {
                                w10 = bVar2.w();
                            }
                            int max = Math.max(i21, flexboxLayoutManager.Y0(Z0) + w10 + i41);
                            cVar.c = Math.max(cVar.c, max);
                            if (e12) {
                                if (flexboxLayoutManager.f6736r != 2) {
                                    i23 = cVar.f6539h;
                                    E3 = bVar2.H() + Z0.getBaseline();
                                } else {
                                    i23 = cVar.f6539h;
                                    E3 = bVar2.E() + (Z0.getMeasuredHeight() - Z0.getBaseline());
                                }
                                cVar.f6539h = Math.max(i23, E3);
                            }
                            if (i26 != i17 - 1 && cVar.f6535d - cVar.f6536e != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                a(list2, cVar, i26, i28);
                                i28 += cVar.c;
                            }
                            if (i14 == -1 && list2.size() > 0) {
                                if (list2.get(list2.size() - 1).f6543l >= i14 && i26 >= i14 && !z17) {
                                    i28 = -cVar.c;
                                    i22 = i12;
                                    z10 = true;
                                    if (i28 > i22 || !z10) {
                                        i30 = max;
                                        i26++;
                                        lVar2 = lVar;
                                        a12 = i17;
                                        i15 = i18;
                                        mode = i19;
                                        i16 = i20;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            i22 = i12;
                            z10 = z17;
                            if (i28 > i22) {
                            }
                            i30 = max;
                            i26++;
                            lVar2 = lVar;
                            a12 = i17;
                            i15 = i18;
                            mode = i19;
                            i16 = i20;
                        }
                        z11 = true;
                        if (z11) {
                        }
                        boolean z192 = cVar.f6544m;
                        if (bVar2.k() != 0.0f) {
                        }
                        cVar.f6544m = z192 | z12;
                        boolean z202 = cVar.n;
                        if (bVar2.u() != 0.0f) {
                        }
                        cVar.n = z202 | z13;
                        iArr = this.c;
                        if (iArr != null) {
                        }
                        int i382 = cVar.f6533a;
                        if (e12) {
                        }
                        if (e12) {
                        }
                        int i392 = H2 + measuredHeight2;
                        if (e12) {
                        }
                        cVar.f6533a = E2 + i392 + i382;
                        cVar.f6537f = bVar2.k() + cVar.f6537f;
                        cVar.f6538g = bVar2.u() + cVar.f6538g;
                        flexboxLayoutManager.g(Z0, FlexboxLayoutManager.O);
                        if (flexboxLayoutManager.e1()) {
                        }
                        int i402 = y11 + O2;
                        cVar.f6533a += i402;
                        cVar.f6534b += i402;
                        if (e12) {
                        }
                        if (e12) {
                        }
                        int i412 = F + measuredWidth;
                        if (e12) {
                        }
                        int max2 = Math.max(i21, flexboxLayoutManager.Y0(Z0) + w10 + i412);
                        cVar.c = Math.max(cVar.c, max2);
                        if (e12) {
                        }
                        if (i26 != i17 - 1) {
                        }
                        z14 = false;
                        if (z14) {
                        }
                        if (i14 == -1) {
                        }
                        i22 = i12;
                        z10 = z17;
                        if (i28 > i22) {
                        }
                        i30 = max2;
                        i26++;
                        lVar2 = lVar;
                        a12 = i17;
                        i15 = i18;
                        mode = i19;
                        i16 = i20;
                    }
                    i19 = mode;
                    i20 = i16;
                    z11 = false;
                    if (z11) {
                    }
                    boolean z1922 = cVar.f6544m;
                    if (bVar2.k() != 0.0f) {
                    }
                    cVar.f6544m = z1922 | z12;
                    boolean z2022 = cVar.n;
                    if (bVar2.u() != 0.0f) {
                    }
                    cVar.n = z2022 | z13;
                    iArr = this.c;
                    if (iArr != null) {
                    }
                    int i3822 = cVar.f6533a;
                    if (e12) {
                    }
                    if (e12) {
                    }
                    int i3922 = H2 + measuredHeight2;
                    if (e12) {
                    }
                    cVar.f6533a = E2 + i3922 + i3822;
                    cVar.f6537f = bVar2.k() + cVar.f6537f;
                    cVar.f6538g = bVar2.u() + cVar.f6538g;
                    flexboxLayoutManager.g(Z0, FlexboxLayoutManager.O);
                    if (flexboxLayoutManager.e1()) {
                    }
                    int i4022 = y11 + O2;
                    cVar.f6533a += i4022;
                    cVar.f6534b += i4022;
                    if (e12) {
                    }
                    if (e12) {
                    }
                    int i4122 = F + measuredWidth;
                    if (e12) {
                    }
                    int max22 = Math.max(i21, flexboxLayoutManager.Y0(Z0) + w10 + i4122);
                    cVar.c = Math.max(cVar.c, max22);
                    if (e12) {
                    }
                    if (i26 != i17 - 1) {
                    }
                    z14 = false;
                    if (z14) {
                    }
                    if (i14 == -1) {
                    }
                    i22 = i12;
                    z10 = z17;
                    if (i28 > i22) {
                    }
                    i30 = max22;
                    i26++;
                    lVar2 = lVar;
                    a12 = i17;
                    i15 = i18;
                    mode = i19;
                    i16 = i20;
                }
            }
            z10 = z17;
            i19 = mode;
            i17 = a12;
            i18 = i15;
            i20 = i16;
            i26++;
            lVar2 = lVar;
            a12 = i17;
            i15 = i18;
            mode = i19;
            i16 = i20;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(View view, int i10) {
        boolean z10;
        b bVar = (b) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z11 = true;
        if (measuredWidth < bVar.z()) {
            measuredWidth = bVar.z();
        } else if (measuredWidth <= bVar.G()) {
            z10 = false;
            if (measuredHeight >= bVar.y()) {
                measuredHeight = bVar.y();
            } else if (measuredHeight > bVar.C()) {
                measuredHeight = bVar.C();
            } else {
                z11 = z10;
            }
            if (z11) {
                return;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            p(view, i10, makeMeasureSpec, makeMeasureSpec2);
            ((FlexboxLayoutManager) this.f6771a).m1(view, i10);
            return;
        } else {
            measuredWidth = bVar.G();
        }
        z10 = true;
        if (measuredHeight >= bVar.y()) {
        }
        if (z11) {
        }
    }

    public final void d(int i10, List list) {
        int i11 = this.c[i10];
        if (i11 == -1) {
            i11 = 0;
        }
        for (int size = list.size() - 1; size >= i11; size--) {
            list.remove(size);
        }
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (i10 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i10, length, -1);
        }
        long[] jArr = this.f6773d;
        int length2 = jArr.length - 1;
        if (i10 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i10, length2, 0L);
        }
    }

    public final void e(int i10, int i11, int i12) {
        int size;
        int H;
        int I;
        c5.a aVar = this.f6771a;
        int a12 = ((FlexboxLayoutManager) aVar).a1();
        boolean[] zArr = this.f6772b;
        int i13 = 0;
        if (zArr == null) {
            if (a12 < 10) {
                a12 = 10;
            }
            this.f6772b = new boolean[a12];
        } else if (zArr.length < a12) {
            int length = zArr.length * 2;
            if (length >= a12) {
                a12 = length;
            }
            this.f6772b = new boolean[a12];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i12 >= ((FlexboxLayoutManager) aVar).a1()) {
            return;
        }
        int i14 = ((FlexboxLayoutManager) aVar).f6735q;
        int i15 = ((FlexboxLayoutManager) aVar).f6735q;
        if (i15 != 0 && i15 != 1) {
            if (i15 != 2 && i15 != 3) {
                throw new IllegalArgumentException(e.g("Invalid flex direction: ", i14));
            }
            int mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode != 1073741824) {
                size = ((FlexboxLayoutManager) aVar).b1();
            }
            H = ((RecyclerView.l) aVar).J();
            I = ((RecyclerView.l) aVar).G();
        } else {
            int mode2 = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int b12 = ((FlexboxLayoutManager) aVar).b1();
            if (mode2 != 1073741824 && b12 <= size) {
                size = b12;
            }
            H = ((RecyclerView.l) aVar).H();
            I = ((RecyclerView.l) aVar).I();
        }
        int i16 = I + H;
        int[] iArr = this.c;
        if (iArr != null) {
            i13 = iArr[i12];
        }
        List<c> list = ((FlexboxLayoutManager) aVar).f6741w;
        int size2 = list.size();
        while (i13 < size2) {
            c cVar = list.get(i13);
            int i17 = cVar.f6533a;
            if (i17 < size && cVar.f6544m) {
                i(i10, i11, cVar, size, i16, false);
            } else if (i17 > size && cVar.n) {
                l(i10, i11, cVar, size, i16, false);
            }
            i13++;
        }
    }

    public final void f(int i10) {
        int[] iArr = this.c;
        if (iArr == null) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.c = new int[i10];
        } else if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (length >= i10) {
                i10 = length;
            }
            this.c = Arrays.copyOf(iArr, i10);
        }
    }

    public final void g(int i10) {
        long[] jArr = this.f6773d;
        if (jArr == null) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f6773d = new long[i10];
        } else if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (length >= i10) {
                i10 = length;
            }
            this.f6773d = Arrays.copyOf(jArr, i10);
        }
    }

    public final void h(int i10) {
        long[] jArr = this.f6774e;
        if (jArr == null) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f6774e = new long[i10];
        } else if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (length >= i10) {
                i10 = length;
            }
            this.f6774e = Arrays.copyOf(jArr, i10);
        }
    }

    public final void i(int i10, int i11, c cVar, int i12, int i13, boolean z10) {
        int i14;
        float f10;
        FlexboxLayoutManager flexboxLayoutManager;
        int max;
        double d5;
        FlexboxLayoutManager flexboxLayoutManager2;
        View view;
        double d10;
        float f11 = cVar.f6537f;
        if (f11 > 0.0f && i12 >= (i14 = cVar.f6533a)) {
            float f12 = (i12 - i14) / f11;
            cVar.f6533a = i13 + cVar.f6534b;
            if (!z10) {
                cVar.c = Integer.MIN_VALUE;
            }
            int i15 = 0;
            boolean z11 = false;
            int i16 = 0;
            float f13 = 0.0f;
            while (i15 < cVar.f6535d) {
                int i17 = cVar.f6542k + i15;
                FlexboxLayoutManager flexboxLayoutManager3 = (FlexboxLayoutManager) this.f6771a;
                View Z0 = flexboxLayoutManager3.Z0(i17);
                if (Z0 != null && Z0.getVisibility() != 8) {
                    b bVar = (b) Z0.getLayoutParams();
                    int i18 = flexboxLayoutManager3.f6735q;
                    if (i18 != 0 && i18 != 1) {
                        int measuredHeight = Z0.getMeasuredHeight();
                        long[] jArr = this.f6774e;
                        if (jArr != null) {
                            measuredHeight = (int) (jArr[i17] >> 32);
                        }
                        int measuredWidth = Z0.getMeasuredWidth();
                        long[] jArr2 = this.f6774e;
                        if (jArr2 != null) {
                            measuredWidth = (int) jArr2[i17];
                        }
                        if (!this.f6772b[i17] && bVar.k() > 0.0f) {
                            float k3 = (bVar.k() * f12) + measuredHeight;
                            if (i15 == cVar.f6535d - 1) {
                                k3 += f13;
                                f13 = 0.0f;
                            }
                            int round = Math.round(k3);
                            if (round > bVar.C()) {
                                round = bVar.C();
                                this.f6772b[i17] = true;
                                cVar.f6537f -= bVar.k();
                                z11 = true;
                            } else {
                                float f14 = (k3 - round) + f13;
                                double d11 = f14;
                                if (d11 > 1.0d) {
                                    round++;
                                    d10 = d11 - 1.0d;
                                } else if (d11 < -1.0d) {
                                    round--;
                                    d10 = d11 + 1.0d;
                                } else {
                                    f13 = f14;
                                }
                                f13 = (float) d10;
                            }
                            int k10 = k(i10, bVar, cVar.f6540i);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            Z0.measure(k10, makeMeasureSpec);
                            measuredWidth = Z0.getMeasuredWidth();
                            int measuredHeight2 = Z0.getMeasuredHeight();
                            p(Z0, i17, k10, makeMeasureSpec);
                            flexboxLayoutManager2 = flexboxLayoutManager3;
                            flexboxLayoutManager2.m1(Z0, i17);
                            view = Z0;
                            measuredHeight = measuredHeight2;
                        } else {
                            flexboxLayoutManager2 = flexboxLayoutManager3;
                            view = Z0;
                        }
                        max = Math.max(i16, flexboxLayoutManager2.Y0(view) + bVar.w() + bVar.F() + measuredWidth);
                        cVar.f6533a = bVar.E() + bVar.H() + measuredHeight + cVar.f6533a;
                        f10 = f12;
                        cVar.c = Math.max(cVar.c, max);
                        i16 = max;
                        i15++;
                        f12 = f10;
                    }
                    int measuredWidth2 = Z0.getMeasuredWidth();
                    long[] jArr3 = this.f6774e;
                    if (jArr3 != null) {
                        measuredWidth2 = (int) jArr3[i17];
                    }
                    int measuredHeight3 = Z0.getMeasuredHeight();
                    long[] jArr4 = this.f6774e;
                    if (jArr4 != null) {
                        long j2 = jArr4[i17];
                        flexboxLayoutManager = flexboxLayoutManager3;
                        measuredHeight3 = (int) (j2 >> 32);
                    } else {
                        flexboxLayoutManager = flexboxLayoutManager3;
                    }
                    if (!this.f6772b[i17] && bVar.k() > 0.0f) {
                        float k11 = (bVar.k() * f12) + measuredWidth2;
                        if (i15 == cVar.f6535d - 1) {
                            k11 += f13;
                            f13 = 0.0f;
                        }
                        int round2 = Math.round(k11);
                        if (round2 > bVar.G()) {
                            round2 = bVar.G();
                            this.f6772b[i17] = true;
                            cVar.f6537f -= bVar.k();
                            f10 = f12;
                            z11 = true;
                        } else {
                            float f15 = (k11 - round2) + f13;
                            f10 = f12;
                            boolean z12 = z11;
                            double d12 = f15;
                            if (d12 > 1.0d) {
                                round2++;
                                d5 = d12 - 1.0d;
                            } else if (d12 < -1.0d) {
                                round2--;
                                d5 = d12 + 1.0d;
                            } else {
                                f13 = f15;
                                z11 = z12;
                            }
                            f13 = (float) d5;
                            z11 = z12;
                        }
                        int j10 = j(i11, bVar, cVar.f6540i);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        Z0.measure(makeMeasureSpec2, j10);
                        int measuredWidth3 = Z0.getMeasuredWidth();
                        int measuredHeight4 = Z0.getMeasuredHeight();
                        p(Z0, i17, makeMeasureSpec2, j10);
                        flexboxLayoutManager.m1(Z0, i17);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    } else {
                        f10 = f12;
                        z11 = z11;
                    }
                    max = Math.max(i16, flexboxLayoutManager.Y0(Z0) + bVar.E() + bVar.H() + measuredHeight3);
                    cVar.f6533a = bVar.w() + bVar.F() + measuredWidth2 + cVar.f6533a;
                    cVar.c = Math.max(cVar.c, max);
                    i16 = max;
                    i15++;
                    f12 = f10;
                }
                f10 = f12;
                z11 = z11;
                i15++;
                f12 = f10;
            }
            if (z11 && i14 != cVar.f6533a) {
                i(i10, i11, cVar, i12, i13, true);
            }
        }
    }

    public final int j(int i10, b bVar, int i11) {
        int y10;
        c5.a aVar = this.f6771a;
        RecyclerView.l lVar = (RecyclerView.l) aVar;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) aVar;
        int W0 = flexboxLayoutManager.W0(bVar.E() + bVar.H() + lVar.G() + lVar.J() + i11, bVar.a());
        int size = View.MeasureSpec.getSize(W0);
        if (size > bVar.C()) {
            y10 = bVar.C();
        } else if (size >= bVar.y()) {
            return W0;
        } else {
            y10 = bVar.y();
        }
        return View.MeasureSpec.makeMeasureSpec(y10, View.MeasureSpec.getMode(W0));
    }

    public final int k(int i10, b bVar, int i11) {
        int z10;
        c5.a aVar = this.f6771a;
        RecyclerView.l lVar = (RecyclerView.l) aVar;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) aVar;
        int X0 = flexboxLayoutManager.X0(bVar.w() + bVar.F() + lVar.I() + lVar.H() + i11, bVar.b());
        int size = View.MeasureSpec.getSize(X0);
        if (size > bVar.G()) {
            z10 = bVar.G();
        } else if (size >= bVar.z()) {
            return X0;
        } else {
            z10 = bVar.z();
        }
        return View.MeasureSpec.makeMeasureSpec(z10, View.MeasureSpec.getMode(X0));
    }

    public final void l(int i10, int i11, c cVar, int i12, int i13, boolean z10) {
        float f10;
        FlexboxLayoutManager flexboxLayoutManager;
        int max;
        int i14;
        FlexboxLayoutManager flexboxLayoutManager2;
        View view;
        int i15;
        int i16 = cVar.f6533a;
        float f11 = cVar.f6538g;
        if (f11 > 0.0f && i12 <= i16) {
            float f12 = (i16 - i12) / f11;
            cVar.f6533a = i13 + cVar.f6534b;
            if (!z10) {
                cVar.c = Integer.MIN_VALUE;
            }
            int i17 = 0;
            boolean z11 = false;
            int i18 = 0;
            float f13 = 0.0f;
            while (i17 < cVar.f6535d) {
                int i19 = cVar.f6542k + i17;
                FlexboxLayoutManager flexboxLayoutManager3 = (FlexboxLayoutManager) this.f6771a;
                View Z0 = flexboxLayoutManager3.Z0(i19);
                if (Z0 != null && Z0.getVisibility() != 8) {
                    b bVar = (b) Z0.getLayoutParams();
                    int i20 = flexboxLayoutManager3.f6735q;
                    if (i20 != 0 && i20 != 1) {
                        int measuredHeight = Z0.getMeasuredHeight();
                        long[] jArr = this.f6774e;
                        if (jArr != null) {
                            measuredHeight = (int) (jArr[i19] >> 32);
                        }
                        int measuredWidth = Z0.getMeasuredWidth();
                        long[] jArr2 = this.f6774e;
                        if (jArr2 != null) {
                            measuredWidth = (int) jArr2[i19];
                        }
                        if (!this.f6772b[i19] && bVar.u() > 0.0f) {
                            float u10 = measuredHeight - (bVar.u() * f12);
                            if (i17 == cVar.f6535d - 1) {
                                u10 += f13;
                                f13 = 0.0f;
                            }
                            int round = Math.round(u10);
                            if (round < bVar.y()) {
                                i15 = bVar.y();
                                this.f6772b[i19] = true;
                                cVar.f6538g -= bVar.u();
                                z11 = true;
                            } else {
                                float f14 = (u10 - round) + f13;
                                double d5 = f14;
                                if (d5 > 1.0d) {
                                    round++;
                                    f14 -= 1.0f;
                                } else if (d5 < -1.0d) {
                                    round--;
                                    f14 += 1.0f;
                                }
                                f13 = f14;
                                i15 = round;
                            }
                            int k3 = k(i10, bVar, cVar.f6540i);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                            Z0.measure(k3, makeMeasureSpec);
                            measuredWidth = Z0.getMeasuredWidth();
                            int measuredHeight2 = Z0.getMeasuredHeight();
                            p(Z0, i19, k3, makeMeasureSpec);
                            flexboxLayoutManager2 = flexboxLayoutManager3;
                            flexboxLayoutManager2.m1(Z0, i19);
                            view = Z0;
                            measuredHeight = measuredHeight2;
                        } else {
                            flexboxLayoutManager2 = flexboxLayoutManager3;
                            view = Z0;
                        }
                        max = Math.max(i18, flexboxLayoutManager2.Y0(view) + bVar.w() + bVar.F() + measuredWidth);
                        cVar.f6533a = bVar.E() + bVar.H() + measuredHeight + cVar.f6533a;
                        f10 = f12;
                        cVar.c = Math.max(cVar.c, max);
                        i18 = max;
                        i17++;
                        f12 = f10;
                    }
                    int measuredWidth2 = Z0.getMeasuredWidth();
                    long[] jArr3 = this.f6774e;
                    if (jArr3 != null) {
                        measuredWidth2 = (int) jArr3[i19];
                    }
                    int measuredHeight3 = Z0.getMeasuredHeight();
                    long[] jArr4 = this.f6774e;
                    if (jArr4 != null) {
                        long j2 = jArr4[i19];
                        flexboxLayoutManager = flexboxLayoutManager3;
                        measuredHeight3 = (int) (j2 >> 32);
                    } else {
                        flexboxLayoutManager = flexboxLayoutManager3;
                    }
                    if (!this.f6772b[i19] && bVar.u() > 0.0f) {
                        float u11 = measuredWidth2 - (bVar.u() * f12);
                        boolean z12 = true;
                        if (i17 == cVar.f6535d - 1) {
                            u11 += f13;
                            f13 = 0.0f;
                        }
                        int round2 = Math.round(u11);
                        if (round2 < bVar.z()) {
                            i14 = bVar.z();
                            this.f6772b[i19] = true;
                            cVar.f6538g -= bVar.u();
                            f10 = f12;
                        } else {
                            float f15 = (u11 - round2) + f13;
                            f10 = f12;
                            boolean z13 = z11;
                            double d10 = f15;
                            if (d10 > 1.0d) {
                                round2++;
                                f15 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                round2--;
                                f15 += 1.0f;
                            }
                            f13 = f15;
                            i14 = round2;
                            z12 = z13;
                        }
                        int j10 = j(i11, bVar, cVar.f6540i);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                        Z0.measure(makeMeasureSpec2, j10);
                        measuredWidth2 = Z0.getMeasuredWidth();
                        int measuredHeight4 = Z0.getMeasuredHeight();
                        p(Z0, i19, makeMeasureSpec2, j10);
                        flexboxLayoutManager.m1(Z0, i19);
                        z11 = z12;
                        measuredHeight3 = measuredHeight4;
                    } else {
                        f10 = f12;
                        z11 = z11;
                    }
                    max = Math.max(i18, flexboxLayoutManager.Y0(Z0) + bVar.E() + bVar.H() + measuredHeight3);
                    cVar.f6533a = bVar.w() + bVar.F() + measuredWidth2 + cVar.f6533a;
                    cVar.c = Math.max(cVar.c, max);
                    i18 = max;
                    i17++;
                    f12 = f10;
                }
                f10 = f12;
                z11 = z11;
                i17++;
                f12 = f10;
            }
            if (z11 && i16 != cVar.f6533a) {
                l(i10, i11, cVar, i12, i13, true);
            }
        }
    }

    public final void m(View view, int i10, int i11) {
        b bVar = (b) view.getLayoutParams();
        int F = (i10 - bVar.F()) - bVar.w();
        c5.a aVar = this.f6771a;
        int min = Math.min(Math.max(F - ((FlexboxLayoutManager) aVar).Y0(view), bVar.z()), bVar.G());
        long[] jArr = this.f6774e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i11] >> 32) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        p(view, i11, makeMeasureSpec2, makeMeasureSpec);
        ((FlexboxLayoutManager) aVar).m1(view, i11);
    }

    public final void n(View view, int i10, int i11) {
        b bVar = (b) view.getLayoutParams();
        int H = (i10 - bVar.H()) - bVar.E();
        c5.a aVar = this.f6771a;
        int min = Math.min(Math.max(H - ((FlexboxLayoutManager) aVar).Y0(view), bVar.y()), bVar.C());
        long[] jArr = this.f6774e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i11] : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        p(view, i11, makeMeasureSpec, makeMeasureSpec2);
        ((FlexboxLayoutManager) aVar).m1(view, i11);
    }

    public final void o(int i10) {
        int i11;
        View Z0;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.f6771a;
        if (i10 >= flexboxLayoutManager.a1()) {
            return;
        }
        int i12 = flexboxLayoutManager.f6735q;
        if (flexboxLayoutManager.f6737s == 4) {
            int[] iArr = this.c;
            if (iArr != null) {
                i11 = iArr[i10];
            } else {
                i11 = 0;
            }
            List<c> list = flexboxLayoutManager.f6741w;
            int size = list.size();
            while (i11 < size) {
                c cVar = list.get(i11);
                int i13 = cVar.f6535d;
                for (int i14 = 0; i14 < i13; i14++) {
                    int i15 = cVar.f6542k + i14;
                    if (i14 < flexboxLayoutManager.a1() && (Z0 = flexboxLayoutManager.Z0(i15)) != null && Z0.getVisibility() != 8) {
                        b bVar = (b) Z0.getLayoutParams();
                        if (bVar.r() == -1 || bVar.r() == 4) {
                            if (i12 != 0 && i12 != 1) {
                                if (i12 != 2 && i12 != 3) {
                                    throw new IllegalArgumentException(e.g("Invalid flex direction: ", i12));
                                }
                                m(Z0, cVar.c, i15);
                            } else {
                                n(Z0, cVar.c, i15);
                            }
                        }
                    }
                }
                i11++;
            }
            return;
        }
        for (c cVar2 : flexboxLayoutManager.f6741w) {
            Iterator it = cVar2.f6541j.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                View Z02 = flexboxLayoutManager.Z0(num.intValue());
                if (i12 != 0 && i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalArgumentException(e.g("Invalid flex direction: ", i12));
                    }
                    m(Z02, cVar2.c, num.intValue());
                } else {
                    n(Z02, cVar2.c, num.intValue());
                }
            }
        }
    }

    public final void p(View view, int i10, int i11, int i12) {
        long[] jArr = this.f6773d;
        if (jArr != null) {
            jArr[i10] = (i11 & 4294967295L) | (i12 << 32);
        }
        long[] jArr2 = this.f6774e;
        if (jArr2 != null) {
            jArr2[i10] = (view.getMeasuredWidth() & 4294967295L) | (view.getMeasuredHeight() << 32);
        }
    }
}
