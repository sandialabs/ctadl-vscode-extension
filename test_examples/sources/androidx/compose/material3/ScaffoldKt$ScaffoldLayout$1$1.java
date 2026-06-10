package androidx.compose.material3;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.preferences.PreferencesProto$Value;
import e0.e;
import j1.b0;
import j1.f0;
import j1.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import u7.p;
import u7.q;
import v.o;
import v.v;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayout$1$1 extends Lambda implements p<f0, b2.a, r> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2360j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2361k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2362l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f2363m;
    public final /* synthetic */ v n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ p<g0.d, Integer, n> f2364o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f2365p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ q<o, g0.d, Integer, n> f2366q;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
    /* renamed from: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<b0.a, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ f0 f2367j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ p<g0.d, Integer, n> f2368k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ p<g0.d, Integer, n> f2369l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ p<g0.d, Integer, n> f2370m;
        public final /* synthetic */ int n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ int f2371o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ v f2372p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ long f2373q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ p<g0.d, Integer, n> f2374r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ int f2375s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ q<o, g0.d, Integer, n> f2376t;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ int f2377u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(f0 f0Var, p<? super g0.d, ? super Integer, n> pVar, p<? super g0.d, ? super Integer, n> pVar2, p<? super g0.d, ? super Integer, n> pVar3, int i10, int i11, v vVar, long j2, p<? super g0.d, ? super Integer, n> pVar4, int i12, q<? super o, ? super g0.d, ? super Integer, n> qVar, int i13) {
            super(1);
            this.f2367j = f0Var;
            this.f2368k = pVar;
            this.f2369l = pVar2;
            this.f2370m = pVar3;
            this.n = i10;
            this.f2371o = i11;
            this.f2372p = vVar;
            this.f2373q = j2;
            this.f2374r = pVar4;
            this.f2375s = i12;
            this.f2376t = qVar;
            this.f2377u = i13;
        }

        @Override // u7.l
        public final n U(b0.a aVar) {
            long j2;
            Object next;
            int i10;
            v vVar;
            Object next2;
            int i11;
            Object next3;
            int i12;
            e eVar;
            Object next4;
            Integer num;
            Integer num2;
            int i13;
            int i14;
            int i15;
            int a10;
            int intValue;
            int a02;
            Object next5;
            Object next6;
            boolean z10;
            int i16;
            boolean z11;
            b0.a aVar2 = aVar;
            g.f(aVar2, "$this$layout");
            ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.TopBar;
            p<g0.d, Integer, n> pVar = this.f2368k;
            f0 f0Var = this.f2367j;
            List<j1.p> J = f0Var.J(scaffoldLayoutContent, pVar);
            ArrayList arrayList = new ArrayList(n7.l.Z1(J, 10));
            Iterator<T> it = J.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                j2 = this.f2373q;
                if (!hasNext) {
                    break;
                }
                arrayList.add(((j1.p) it.next()).b(j2));
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    int i17 = ((b0) next).f12641j;
                    while (true) {
                        Object next7 = it2.next();
                        int i18 = ((b0) next7).f12641j;
                        if (i17 < i18) {
                            next = next7;
                            i17 = i18;
                        }
                        if (!it2.hasNext()) {
                            break;
                        }
                        j2 = j2;
                    }
                }
            }
            b0 b0Var = (b0) next;
            if (b0Var != null) {
                i10 = b0Var.f12641j;
            } else {
                i10 = 0;
            }
            List<j1.p> J2 = f0Var.J(ScaffoldLayoutContent.Snackbar, this.f2369l);
            ArrayList arrayList2 = new ArrayList(n7.l.Z1(J2, 10));
            Iterator<T> it3 = J2.iterator();
            while (true) {
                boolean hasNext2 = it3.hasNext();
                vVar = this.f2372p;
                if (!hasNext2) {
                    break;
                }
                arrayList2.add(((j1.p) it3.next()).b(v8.b.A(j2, (-vVar.c(f0Var, f0Var.getLayoutDirection())) - vVar.b(f0Var, f0Var.getLayoutDirection()), -vVar.a(f0Var))));
            }
            Iterator it4 = arrayList2.iterator();
            if (!it4.hasNext()) {
                next2 = null;
            } else {
                next2 = it4.next();
                if (it4.hasNext()) {
                    int i19 = ((b0) next2).f12641j;
                    while (true) {
                        Object next8 = it4.next();
                        int i20 = ((b0) next8).f12641j;
                        if (i19 < i20) {
                            i19 = i20;
                            next2 = next8;
                        }
                        if (!it4.hasNext()) {
                            break;
                        }
                        j2 = j2;
                        arrayList2 = arrayList2;
                    }
                }
            }
            b0 b0Var2 = (b0) next2;
            if (b0Var2 != null) {
                i11 = b0Var2.f12641j;
            } else {
                i11 = 0;
            }
            Iterator it5 = arrayList2.iterator();
            if (!it5.hasNext()) {
                next3 = null;
            } else {
                next3 = it5.next();
                if (it5.hasNext()) {
                    int i21 = ((b0) next3).f12640i;
                    while (true) {
                        Object next9 = it5.next();
                        int i22 = ((b0) next9).f12640i;
                        if (i21 < i22) {
                            next3 = next9;
                            i21 = i22;
                        }
                        if (!it5.hasNext()) {
                            break;
                        }
                        j2 = j2;
                        arrayList2 = arrayList2;
                    }
                }
            }
            b0 b0Var3 = (b0) next3;
            if (b0Var3 != null) {
                i12 = b0Var3.f12640i;
            } else {
                i12 = 0;
            }
            List<j1.p> J3 = f0Var.J(ScaffoldLayoutContent.Fab, this.f2370m);
            ArrayList arrayList3 = new ArrayList();
            Iterator it6 = J3.iterator();
            while (it6.hasNext()) {
                Iterator it7 = it6;
                int i23 = i12;
                b0 b5 = ((j1.p) it6.next()).b(v8.b.A(j2, (-vVar.c(f0Var, f0Var.getLayoutDirection())) - vVar.b(f0Var, f0Var.getLayoutDirection()), -vVar.a(f0Var)));
                if (b5.f12641j != 0 && b5.f12640i != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    b5 = null;
                }
                if (b5 != null) {
                    arrayList3.add(b5);
                }
                it6 = it7;
                i12 = i23;
            }
            int i24 = i12;
            boolean z12 = !arrayList3.isEmpty();
            int i25 = this.f2371o;
            if (z12) {
                Iterator it8 = arrayList3.iterator();
                if (!it8.hasNext()) {
                    next5 = null;
                } else {
                    next5 = it8.next();
                    if (it8.hasNext()) {
                        int i26 = ((b0) next5).f12640i;
                        do {
                            Object next10 = it8.next();
                            Object obj = next5;
                            int i27 = ((b0) next10).f12640i;
                            if (i26 < i27) {
                                i26 = i27;
                                next5 = next10;
                            } else {
                                next5 = obj;
                            }
                        } while (it8.hasNext());
                    }
                }
                g.c(next5);
                int i28 = ((b0) next5).f12640i;
                Iterator it9 = arrayList3.iterator();
                if (!it9.hasNext()) {
                    next6 = null;
                } else {
                    next6 = it9.next();
                    if (it9.hasNext()) {
                        int i29 = ((b0) next6).f12641j;
                        do {
                            Object next11 = it9.next();
                            Object obj2 = next6;
                            int i30 = ((b0) next11).f12641j;
                            if (i29 < i30) {
                                i29 = i30;
                                next6 = next11;
                            } else {
                                next6 = obj2;
                            }
                        } while (it9.hasNext());
                    }
                }
                g.c(next6);
                int i31 = ((b0) next6).f12641j;
                if (this.n == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (f0Var.getLayoutDirection() == LayoutDirection.Ltr) {
                        i16 = (i25 - f0Var.a0(ScaffoldKt.f2340b)) - i28;
                    } else {
                        i16 = f0Var.a0(ScaffoldKt.f2340b);
                    }
                } else {
                    i16 = (i25 - i28) / 2;
                }
                eVar = new e(i16, i31);
            } else {
                eVar = null;
            }
            List<j1.p> J4 = f0Var.J(ScaffoldLayoutContent.BottomBar, a1.c.j0(-1455477816, new ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1(eVar, this.f2374r, this.f2375s), true));
            ArrayList arrayList4 = new ArrayList(n7.l.Z1(J4, 10));
            for (j1.p pVar2 : J4) {
                arrayList4.add(pVar2.b(j2));
            }
            Iterator it10 = arrayList4.iterator();
            if (!it10.hasNext()) {
                next4 = null;
            } else {
                next4 = it10.next();
                if (it10.hasNext()) {
                    int i32 = ((b0) next4).f12641j;
                    while (true) {
                        Object next12 = it10.next();
                        Object obj3 = next4;
                        int i33 = ((b0) next12).f12641j;
                        if (i32 < i33) {
                            i32 = i33;
                            next4 = next12;
                        } else {
                            next4 = obj3;
                        }
                        if (!it10.hasNext()) {
                            break;
                        }
                        f0Var = f0Var;
                        eVar = eVar;
                        arrayList4 = arrayList4;
                        j2 = j2;
                        arrayList2 = arrayList2;
                    }
                }
            }
            b0 b0Var4 = (b0) next4;
            if (b0Var4 != null) {
                num = Integer.valueOf(b0Var4.f12641j);
            } else {
                num = null;
            }
            if (eVar != null) {
                int i34 = eVar.f10540b;
                if (num == null) {
                    intValue = f0Var.a0(ScaffoldKt.f2340b) + i34;
                    a02 = vVar.a(f0Var);
                } else {
                    intValue = num.intValue() + i34;
                    a02 = f0Var.a0(ScaffoldKt.f2340b);
                }
                num2 = Integer.valueOf(a02 + intValue);
            } else {
                num2 = null;
            }
            if (i11 != 0) {
                if (num2 != null) {
                    a10 = num2.intValue();
                } else if (num != null) {
                    a10 = num.intValue();
                } else {
                    a10 = vVar.a(f0Var);
                }
                i13 = a10 + i11;
            } else {
                i13 = 0;
            }
            f0 f0Var2 = this.f2367j;
            long j10 = j2;
            e eVar2 = eVar;
            f0 f0Var3 = f0Var;
            ArrayList arrayList5 = arrayList4;
            ArrayList arrayList6 = arrayList2;
            List<j1.p> J5 = f0Var2.J(ScaffoldLayoutContent.MainContent, a1.c.j0(1643221465, new ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(this.f2372p, f0Var2, arrayList, i10, arrayList5, num, this.f2376t, this.f2375s), true));
            ArrayList arrayList7 = new ArrayList(n7.l.Z1(J5, 10));
            for (j1.p pVar3 : J5) {
                arrayList7.add(pVar3.b(j10));
            }
            Iterator it11 = arrayList7.iterator();
            while (it11.hasNext()) {
                b0.a.c(aVar2, (b0) it11.next(), 0, 0);
            }
            Iterator it12 = arrayList.iterator();
            while (it12.hasNext()) {
                b0.a.c(aVar2, (b0) it12.next(), 0, 0);
            }
            Iterator it13 = arrayList6.iterator();
            while (true) {
                boolean hasNext3 = it13.hasNext();
                i14 = this.f2377u;
                if (!hasNext3) {
                    break;
                }
                b0.a.c(aVar2, (b0) it13.next(), vVar.c(f0Var3, f0Var3.getLayoutDirection()) + ((i25 - i24) / 2), i14 - i13);
            }
            Iterator it14 = arrayList5.iterator();
            while (it14.hasNext()) {
                b0 b0Var5 = (b0) it14.next();
                if (num != null) {
                    i15 = num.intValue();
                } else {
                    i15 = 0;
                }
                b0.a.c(aVar2, b0Var5, 0, i14 - i15);
            }
            if (eVar2 != null) {
                Iterator it15 = arrayList3.iterator();
                while (it15.hasNext()) {
                    g.c(num2);
                    b0.a.c(aVar2, (b0) it15.next(), eVar2.f10539a, i14 - num2.intValue());
                }
                n nVar = n.f16010a;
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$1$1(int i10, int i11, v vVar, p pVar, p pVar2, p pVar3, p pVar4, q qVar) {
        super(2);
        this.f2360j = pVar;
        this.f2361k = pVar2;
        this.f2362l = pVar3;
        this.f2363m = i10;
        this.n = vVar;
        this.f2364o = pVar4;
        this.f2365p = i11;
        this.f2366q = qVar;
    }

    @Override // u7.p
    public final r R(f0 f0Var, b2.a aVar) {
        r m02;
        f0 f0Var2 = f0Var;
        long j2 = aVar.f6336a;
        g.f(f0Var2, "$this$SubcomposeLayout");
        int f10 = b2.a.f(j2);
        int e10 = b2.a.e(j2);
        m02 = f0Var2.m0(f10, e10, kotlin.collections.d.K1(), new AnonymousClass1(f0Var2, this.f2360j, this.f2361k, this.f2362l, this.f2363m, f10, this.n, b2.a.a(j2, 0, 0, 0, 0, 10), this.f2364o, this.f2365p, this.f2366q, e10));
        return m02;
    }
}
