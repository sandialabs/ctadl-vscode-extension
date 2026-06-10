package g2;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.widget.ConstraintLayout;
import g2.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.constraintlayout.core.widgets.d f11206a;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.constraintlayout.core.widgets.d f11208d;

    /* renamed from: f  reason: collision with root package name */
    public b.InterfaceC0121b f11210f;

    /* renamed from: g  reason: collision with root package name */
    public final b.a f11211g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<i> f11212h;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11207b = true;
    public boolean c = true;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<WidgetRun> f11209e = new ArrayList<>();

    public e(androidx.constraintlayout.core.widgets.d dVar) {
        new ArrayList();
        this.f11210f = null;
        this.f11211g = new b.a();
        this.f11212h = new ArrayList<>();
        this.f11206a = dVar;
        this.f11208d = dVar;
    }

    public final void a(DependencyNode dependencyNode, int i10, int i11, ArrayList arrayList, i iVar) {
        WidgetRun widgetRun = dependencyNode.f4288d;
        if (widgetRun.c == null) {
            androidx.constraintlayout.core.widgets.d dVar = this.f11206a;
            if (widgetRun != dVar.f4240d && widgetRun != dVar.f4242e) {
                if (iVar == null) {
                    iVar = new i(widgetRun);
                    arrayList.add(iVar);
                }
                widgetRun.c = iVar;
                iVar.f11215b.add(widgetRun);
                DependencyNode dependencyNode2 = widgetRun.f4311h;
                Iterator it = dependencyNode2.f4295k.iterator();
                while (it.hasNext()) {
                    d dVar2 = (d) it.next();
                    if (dVar2 instanceof DependencyNode) {
                        a((DependencyNode) dVar2, i10, 0, arrayList, iVar);
                    }
                }
                DependencyNode dependencyNode3 = widgetRun.f4312i;
                Iterator it2 = dependencyNode3.f4295k.iterator();
                while (it2.hasNext()) {
                    d dVar3 = (d) it2.next();
                    if (dVar3 instanceof DependencyNode) {
                        a((DependencyNode) dVar3, i10, 1, arrayList, iVar);
                    }
                }
                if (i10 == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.d)) {
                    Iterator it3 = ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f4319k.f4295k.iterator();
                    while (it3.hasNext()) {
                        d dVar4 = (d) it3.next();
                        if (dVar4 instanceof DependencyNode) {
                            a((DependencyNode) dVar4, i10, 2, arrayList, iVar);
                        }
                    }
                }
                Iterator it4 = dependencyNode2.f4296l.iterator();
                while (it4.hasNext()) {
                    a((DependencyNode) it4.next(), i10, 0, arrayList, iVar);
                }
                Iterator it5 = dependencyNode3.f4296l.iterator();
                while (it5.hasNext()) {
                    a((DependencyNode) it5.next(), i10, 1, arrayList, iVar);
                }
                if (i10 == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.d)) {
                    Iterator it6 = ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f4319k.f4296l.iterator();
                    while (it6.hasNext()) {
                        a((DependencyNode) it6.next(), i10, 2, arrayList, iVar);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2.f4270t == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(androidx.constraintlayout.core.widgets.d dVar) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        int i11;
        androidx.constraintlayout.core.widgets.analyzer.a aVar;
        int l2;
        int i12;
        int i13;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        Iterator<ConstraintWidget> it = dVar.f10897s0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[1];
            if (next.f4253j0 == 8) {
                next.f4236a = true;
            } else {
                float f10 = next.f4274x;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (f10 < 1.0f && dimensionBehaviour4 == dimensionBehaviour6) {
                    next.f4269s = 2;
                }
                float f11 = next.A;
                if (f11 < 1.0f && dimensionBehaviour5 == dimensionBehaviour6) {
                    next.f4270t = 2;
                }
                float f12 = next.Z;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (f12 > 0.0f) {
                    if (dimensionBehaviour4 == dimensionBehaviour6 && (dimensionBehaviour5 == dimensionBehaviour7 || dimensionBehaviour5 == dimensionBehaviour8)) {
                        next.f4269s = 3;
                    } else {
                        if (dimensionBehaviour5 != dimensionBehaviour6 || (dimensionBehaviour4 != dimensionBehaviour7 && dimensionBehaviour4 != dimensionBehaviour8)) {
                            if (dimensionBehaviour4 == dimensionBehaviour6 && dimensionBehaviour5 == dimensionBehaviour6) {
                                if (next.f4269s == 0) {
                                    next.f4269s = 3;
                                }
                            }
                        }
                        next.f4270t = 3;
                    }
                }
                ConstraintAnchor constraintAnchor = next.M;
                ConstraintAnchor constraintAnchor2 = next.K;
                if (dimensionBehaviour4 == dimensionBehaviour6 && next.f4269s == 1 && (constraintAnchor2.f4224f == null || constraintAnchor.f4224f == null)) {
                    dimensionBehaviour4 = dimensionBehaviour7;
                }
                ConstraintAnchor constraintAnchor3 = next.N;
                ConstraintAnchor constraintAnchor4 = next.L;
                if (dimensionBehaviour5 == dimensionBehaviour6 && next.f4270t == 1 && (constraintAnchor4.f4224f == null || constraintAnchor3.f4224f == null)) {
                    dimensionBehaviour = dimensionBehaviour7;
                } else {
                    dimensionBehaviour = dimensionBehaviour5;
                }
                androidx.constraintlayout.core.widgets.analyzer.c cVar = next.f4240d;
                cVar.f4307d = dimensionBehaviour4;
                int i14 = next.f4269s;
                cVar.f4305a = i14;
                androidx.constraintlayout.core.widgets.analyzer.d dVar2 = next.f4242e;
                dVar2.f4307d = dimensionBehaviour;
                Iterator<ConstraintWidget> it2 = it;
                int i15 = next.f4270t;
                dVar2.f4305a = i15;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour4 != dimensionBehaviour9 && dimensionBehaviour4 != dimensionBehaviour8 && dimensionBehaviour4 != dimensionBehaviour7) || (dimensionBehaviour != dimensionBehaviour9 && dimensionBehaviour != dimensionBehaviour8 && dimensionBehaviour != dimensionBehaviour7)) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar.V;
                    ConstraintAnchor[] constraintAnchorArr = next.S;
                    if (dimensionBehaviour4 == dimensionBehaviour6 && (dimensionBehaviour == dimensionBehaviour7 || dimensionBehaviour == dimensionBehaviour8)) {
                        if (i14 == 3) {
                            if (dimensionBehaviour == dimensionBehaviour7) {
                                f(next, dimensionBehaviour7, 0, dimensionBehaviour7, 0);
                            }
                            int l4 = next.l();
                            f(next, dimensionBehaviour8, (int) ((l4 * next.Z) + 0.5f), dimensionBehaviour8, l4);
                            next.f4240d.f4308e.d(next.q());
                            next.f4242e.f4308e.d(next.l());
                            next.f4236a = true;
                            it = it2;
                        } else if (i14 == 1) {
                            f(next, dimensionBehaviour7, 0, dimensionBehaviour, 0);
                            aVar = next.f4240d.f4308e;
                            l2 = next.q();
                            aVar.f4317m = l2;
                            it = it2;
                        } else if (i14 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviourArr2[0];
                            if (dimensionBehaviour10 == dimensionBehaviour8 || dimensionBehaviour10 == dimensionBehaviour9) {
                                i12 = (int) ((f10 * dVar.q()) + 0.5f);
                                i13 = next.l();
                                dimensionBehaviour3 = dimensionBehaviour;
                                f(next, dimensionBehaviour8, i12, dimensionBehaviour3, i13);
                                next.f4240d.f4308e.d(next.q());
                                next.f4242e.f4308e.d(next.l());
                                next.f4236a = true;
                                it = it2;
                            }
                        } else if (constraintAnchorArr[0].f4224f == null || constraintAnchorArr[1].f4224f == null) {
                            dimensionBehaviour4 = dimensionBehaviour7;
                            dimensionBehaviour2 = dimensionBehaviour;
                            i11 = 0;
                            i10 = 0;
                            f(next, dimensionBehaviour4, i11, dimensionBehaviour2, i10);
                            next.f4240d.f4308e.d(next.q());
                            next.f4242e.f4308e.d(next.l());
                            next.f4236a = true;
                            it = it2;
                        }
                    }
                    if (dimensionBehaviour == dimensionBehaviour6 && (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == dimensionBehaviour8)) {
                        if (i15 == 3) {
                            if (dimensionBehaviour4 == dimensionBehaviour7) {
                                f(next, dimensionBehaviour7, 0, dimensionBehaviour7, 0);
                            }
                            int q10 = next.q();
                            float f13 = next.Z;
                            if (next.f4237a0 == -1) {
                                f13 = 1.0f / f13;
                            }
                            i12 = q10;
                            i13 = (int) ((q10 * f13) + 0.5f);
                            dimensionBehaviour3 = dimensionBehaviour8;
                            f(next, dimensionBehaviour8, i12, dimensionBehaviour3, i13);
                            next.f4240d.f4308e.d(next.q());
                            next.f4242e.f4308e.d(next.l());
                            next.f4236a = true;
                            it = it2;
                        } else if (i15 == 1) {
                            f(next, dimensionBehaviour4, 0, dimensionBehaviour7, 0);
                            aVar = next.f4242e.f4308e;
                            l2 = next.l();
                            aVar.f4317m = l2;
                            it = it2;
                        } else if (i15 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = dimensionBehaviourArr2[1];
                            if (dimensionBehaviour11 == dimensionBehaviour8 || dimensionBehaviour11 == dimensionBehaviour9) {
                                i11 = next.q();
                                i10 = (int) ((f11 * dVar.l()) + 0.5f);
                                dimensionBehaviour2 = dimensionBehaviour8;
                                f(next, dimensionBehaviour4, i11, dimensionBehaviour2, i10);
                                next.f4240d.f4308e.d(next.q());
                                next.f4242e.f4308e.d(next.l());
                                next.f4236a = true;
                                it = it2;
                            }
                        } else if (constraintAnchorArr[2].f4224f == null || constraintAnchorArr[3].f4224f == null) {
                            f(next, dimensionBehaviour7, 0, dimensionBehaviour, 0);
                            next.f4240d.f4308e.d(next.q());
                            next.f4242e.f4308e.d(next.l());
                            next.f4236a = true;
                            it = it2;
                        }
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour6 && dimensionBehaviour == dimensionBehaviour6) {
                        if (i14 != 1 && i15 != 1) {
                            if (i15 == 2 && i14 == 2 && dimensionBehaviourArr2[0] == dimensionBehaviour8 && dimensionBehaviourArr2[1] == dimensionBehaviour8) {
                                i10 = (int) ((f11 * dVar.l()) + 0.5f);
                                i11 = (int) ((f10 * dVar.q()) + 0.5f);
                                dimensionBehaviour4 = dimensionBehaviour8;
                                dimensionBehaviour2 = dimensionBehaviour4;
                                f(next, dimensionBehaviour4, i11, dimensionBehaviour2, i10);
                                next.f4240d.f4308e.d(next.q());
                                next.f4242e.f4308e.d(next.l());
                                next.f4236a = true;
                            }
                        }
                        f(next, dimensionBehaviour7, 0, dimensionBehaviour7, 0);
                        next.f4240d.f4308e.f4317m = next.q();
                        aVar = next.f4242e.f4308e;
                        l2 = next.l();
                        aVar.f4317m = l2;
                    }
                    it = it2;
                }
                int q11 = next.q();
                if (dimensionBehaviour4 == dimensionBehaviour9) {
                    q11 = (dVar.q() - constraintAnchor2.f4225g) - constraintAnchor.f4225g;
                    dimensionBehaviour4 = dimensionBehaviour8;
                }
                int l7 = next.l();
                if (dimensionBehaviour == dimensionBehaviour9) {
                    l7 = (dVar.l() - constraintAnchor4.f4225g) - constraintAnchor3.f4225g;
                } else {
                    dimensionBehaviour8 = dimensionBehaviour;
                }
                i10 = l7;
                dimensionBehaviour2 = dimensionBehaviour8;
                i11 = q11;
                f(next, dimensionBehaviour4, i11, dimensionBehaviour2, i10);
                next.f4240d.f4308e.d(next.q());
                next.f4242e.f4308e.d(next.l());
                next.f4236a = true;
                it = it2;
            }
        }
    }

    public final void c() {
        WidgetRun hVar;
        ArrayList<WidgetRun> arrayList = this.f11209e;
        arrayList.clear();
        androidx.constraintlayout.core.widgets.d dVar = this.f11208d;
        dVar.f4240d.f();
        dVar.f4242e.f();
        arrayList.add(dVar.f4240d);
        arrayList.add(dVar.f4242e);
        Iterator<ConstraintWidget> it = dVar.f10897s0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof androidx.constraintlayout.core.widgets.f) {
                hVar = new h(next);
            } else {
                if (next.x()) {
                    if (next.f4238b == null) {
                        next.f4238b = new c(0, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f4238b);
                } else {
                    arrayList.add(next.f4240d);
                }
                if (next.y()) {
                    if (next.c == null) {
                        next.c = new c(1, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.c);
                } else {
                    arrayList.add(next.f4242e);
                }
                if (next instanceof f2.b) {
                    hVar = new androidx.constraintlayout.core.widgets.analyzer.b(next);
                }
            }
            arrayList.add(hVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.f4306b != dVar) {
                next2.d();
            }
        }
        ArrayList<i> arrayList2 = this.f11212h;
        arrayList2.clear();
        androidx.constraintlayout.core.widgets.d dVar2 = this.f11206a;
        e(dVar2.f4240d, 0, arrayList2);
        e(dVar2.f4242e, 1, arrayList2);
        this.f11207b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r8 instanceof androidx.constraintlayout.core.widgets.analyzer.d) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(androidx.constraintlayout.core.widgets.d dVar, int i10) {
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        boolean contains;
        ArrayList<i> arrayList;
        int i11;
        long j2;
        long j10;
        long j11;
        float f10;
        long j12;
        androidx.constraintlayout.core.widgets.d dVar2 = dVar;
        int i12 = i10;
        ArrayList<i> arrayList2 = this.f11212h;
        int size = arrayList2.size();
        int i13 = 0;
        long j13 = 0;
        while (i13 < size) {
            WidgetRun widgetRun3 = arrayList2.get(i13).f11214a;
            if (widgetRun3 instanceof c) {
                if (((c) widgetRun3).f4309f != i12) {
                    j2 = 0;
                    arrayList = arrayList2;
                    i11 = size;
                }
                if (i12 != 0) {
                    widgetRun = dVar2.f4240d;
                } else {
                    widgetRun = dVar2.f4242e;
                }
                DependencyNode dependencyNode = widgetRun.f4311h;
                if (i12 != 0) {
                    widgetRun2 = dVar2.f4240d;
                } else {
                    widgetRun2 = dVar2.f4242e;
                }
                DependencyNode dependencyNode2 = widgetRun2.f4312i;
                contains = widgetRun3.f4311h.f4296l.contains(dependencyNode);
                DependencyNode dependencyNode3 = widgetRun3.f4312i;
                boolean contains2 = dependencyNode3.f4296l.contains(dependencyNode2);
                long j14 = widgetRun3.j();
                DependencyNode dependencyNode4 = widgetRun3.f4311h;
                if (!contains && contains2) {
                    long b5 = i.b(dependencyNode4, 0L);
                    long a10 = i.a(dependencyNode3, 0L);
                    long j15 = b5 - j14;
                    int i14 = dependencyNode3.f4290f;
                    arrayList = arrayList2;
                    i11 = size;
                    if (j15 >= (-i14)) {
                        j15 += i14;
                    }
                    long j16 = j15;
                    long j17 = dependencyNode4.f4290f;
                    long j18 = ((-a10) - j14) - j17;
                    if (j18 >= j17) {
                        j18 -= j17;
                    }
                    ConstraintWidget constraintWidget = widgetRun3.f4306b;
                    if (i12 == 0) {
                        f10 = constraintWidget.f4247g0;
                    } else if (i12 == 1) {
                        f10 = constraintWidget.f4249h0;
                    } else {
                        constraintWidget.getClass();
                        f10 = -1.0f;
                    }
                    if (f10 > 0.0f) {
                        j12 = (((float) j16) / (1.0f - f10)) + (((float) j18) / f10);
                    } else {
                        j12 = 0;
                    }
                    float f11 = (float) j12;
                    j2 = (dependencyNode4.f4290f + ((((f11 * f10) + 0.5f) + j14) + a4.b.f(1.0f, f10, f11, 0.5f))) - dependencyNode3.f4290f;
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    if (!contains) {
                        j11 = i.b(dependencyNode4, dependencyNode4.f4290f);
                        j10 = dependencyNode4.f4290f + j14;
                    } else if (contains2) {
                        j10 = (-dependencyNode3.f4290f) + j14;
                        j11 = -i.a(dependencyNode3, dependencyNode3.f4290f);
                    } else {
                        j2 = (widgetRun3.j() + dependencyNode4.f4290f) - dependencyNode3.f4290f;
                    }
                    j2 = Math.max(j11, j10);
                }
            } else if (i12 == 0) {
                if (!(widgetRun3 instanceof androidx.constraintlayout.core.widgets.analyzer.c)) {
                    j2 = 0;
                    arrayList = arrayList2;
                    i11 = size;
                }
                if (i12 != 0) {
                }
                DependencyNode dependencyNode5 = widgetRun.f4311h;
                if (i12 != 0) {
                }
                DependencyNode dependencyNode22 = widgetRun2.f4312i;
                contains = widgetRun3.f4311h.f4296l.contains(dependencyNode5);
                DependencyNode dependencyNode32 = widgetRun3.f4312i;
                boolean contains22 = dependencyNode32.f4296l.contains(dependencyNode22);
                long j142 = widgetRun3.j();
                DependencyNode dependencyNode42 = widgetRun3.f4311h;
                if (!contains) {
                }
                arrayList = arrayList2;
                i11 = size;
                if (!contains) {
                }
                j2 = Math.max(j11, j10);
            }
            j13 = Math.max(j13, j2);
            i13++;
            dVar2 = dVar;
            i12 = i10;
            arrayList2 = arrayList;
            size = i11;
        }
        return (int) j13;
    }

    public final void e(WidgetRun widgetRun, int i10, ArrayList<i> arrayList) {
        DependencyNode dependencyNode;
        DependencyNode dependencyNode2;
        DependencyNode dependencyNode3;
        Iterator it = widgetRun.f4311h.f4295k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            dependencyNode = widgetRun.f4312i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof DependencyNode) {
                dependencyNode3 = (DependencyNode) dVar;
            } else if (dVar instanceof WidgetRun) {
                dependencyNode3 = ((WidgetRun) dVar).f4311h;
            }
            a(dependencyNode3, i10, 0, arrayList, null);
        }
        Iterator it2 = dependencyNode.f4295k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof DependencyNode) {
                dependencyNode2 = (DependencyNode) dVar2;
            } else if (dVar2 instanceof WidgetRun) {
                dependencyNode2 = ((WidgetRun) dVar2).f4312i;
            }
            a(dependencyNode2, i10, 1, arrayList, null);
        }
        if (i10 == 1) {
            Iterator it3 = ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f4319k.f4295k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof DependencyNode) {
                    a((DependencyNode) dVar3, i10, 2, arrayList, null);
                }
            }
        }
    }

    public final void f(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        boolean z10;
        b.a aVar = this.f11211g;
        aVar.f11195a = dimensionBehaviour;
        aVar.f11196b = dimensionBehaviour2;
        aVar.c = i10;
        aVar.f11197d = i11;
        ((ConstraintLayout.b) this.f11210f).b(constraintWidget, aVar);
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

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
        if (r8 != r11) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        boolean z10;
        androidx.constraintlayout.core.widgets.analyzer.a aVar;
        boolean z11;
        androidx.constraintlayout.core.widgets.analyzer.a aVar2;
        boolean z12;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        androidx.constraintlayout.core.widgets.analyzer.a aVar3;
        int q10;
        a aVar4;
        Iterator<ConstraintWidget> it = this.f11206a.f10897s0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.f4236a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.V;
                boolean z13 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[1];
                int i10 = next.f4269s;
                int i11 = next.f4270t;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 != dimensionBehaviour4 && (dimensionBehaviour2 != dimensionBehaviour5 || i10 != 1)) {
                    z10 = false;
                    if (dimensionBehaviour3 != dimensionBehaviour4 || (dimensionBehaviour3 == dimensionBehaviour5 && i11 == 1)) {
                        z13 = true;
                    }
                    aVar = next.f4240d.f4308e;
                    z11 = aVar.f4294j;
                    aVar2 = next.f4242e.f4308e;
                    z12 = aVar2.f4294j;
                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (!z11 && z12) {
                        f(next, dimensionBehaviour, aVar.f4291g, dimensionBehaviour, aVar2.f4291g);
                    } else if (!z11 && z13) {
                        f(next, dimensionBehaviour, aVar.f4291g, dimensionBehaviour4, aVar2.f4291g);
                        aVar3 = next.f4242e.f4308e;
                        q10 = next.l();
                        if (dimensionBehaviour3 == dimensionBehaviour5) {
                            aVar3.f4317m = q10;
                            if (next.f4236a) {
                                aVar4.d(next.f4241d0);
                            }
                        }
                        aVar3.d(q10);
                    } else {
                        if (z12 && z10) {
                            f(next, dimensionBehaviour4, aVar.f4291g, dimensionBehaviour, aVar2.f4291g);
                            aVar3 = next.f4240d.f4308e;
                            q10 = next.q();
                        }
                        if (next.f4236a && (aVar4 = next.f4242e.f4320l) != null) {
                            aVar4.d(next.f4241d0);
                        }
                    }
                    next.f4236a = true;
                    if (next.f4236a) {
                    }
                }
                z10 = true;
                if (dimensionBehaviour3 != dimensionBehaviour4) {
                }
                z13 = true;
                aVar = next.f4240d.f4308e;
                z11 = aVar.f4294j;
                aVar2 = next.f4242e.f4308e;
                z12 = aVar2.f4294j;
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                if (!z11) {
                }
                if (!z11) {
                }
                if (z12) {
                    f(next, dimensionBehaviour4, aVar.f4291g, dimensionBehaviour, aVar2.f4291g);
                    aVar3 = next.f4240d.f4308e;
                    q10 = next.q();
                }
                if (next.f4236a) {
                }
            }
        }
    }
}
