package androidx.fragment.app;

import a3.j0;
import a3.r0;
import a3.v0;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import p.g;

/* loaded from: classes.dex */
public final class l extends SpecialEffectsController {

    /* loaded from: classes.dex */
    public static class a extends b {
        public final boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5202d;

        /* renamed from: e  reason: collision with root package name */
        public t.a f5203e;

        public a(SpecialEffectsController.Operation operation, v2.d dVar, boolean z10) {
            super(operation, dVar);
            this.f5202d = false;
            this.c = z10;
        }

        public final t.a c(Context context) {
            boolean z10;
            if (this.f5202d) {
                return this.f5203e;
            }
            SpecialEffectsController.Operation operation = this.f5204a;
            Fragment fragment = operation.c;
            if (operation.f5077a == SpecialEffectsController.Operation.State.VISIBLE) {
                z10 = true;
            } else {
                z10 = false;
            }
            t.a a10 = t.a(context, fragment, z10, this.c);
            this.f5203e = a10;
            this.f5202d = true;
            return a10;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final SpecialEffectsController.Operation f5204a;

        /* renamed from: b  reason: collision with root package name */
        public final v2.d f5205b;

        public b(SpecialEffectsController.Operation operation, v2.d dVar) {
            this.f5204a = operation;
            this.f5205b = dVar;
        }

        public final void a() {
            SpecialEffectsController.Operation operation = this.f5204a;
            HashSet<v2.d> hashSet = operation.f5080e;
            if (hashSet.remove(this.f5205b) && hashSet.isEmpty()) {
                operation.b();
            }
        }

        public final boolean b() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation operation = this.f5204a;
            SpecialEffectsController.Operation.State i10 = SpecialEffectsController.Operation.State.i(operation.c.M);
            SpecialEffectsController.Operation.State state2 = operation.f5077a;
            if (i10 != state2 && (i10 == (state = SpecialEffectsController.Operation.State.VISIBLE) || state2 == state)) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        public final Object c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f5206d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f5207e;

        public c(SpecialEffectsController.Operation operation, v2.d dVar, boolean z10, boolean z11) {
            super(operation, dVar);
            Object obj;
            Object obj2;
            SpecialEffectsController.Operation.State state = operation.f5077a;
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            Fragment fragment = operation.c;
            if (state == state2) {
                if (z10) {
                    obj2 = fragment.m();
                } else {
                    Fragment.b bVar = fragment.P;
                    if (bVar == null) {
                        obj2 = null;
                    } else {
                        obj2 = bVar.f5062i;
                    }
                }
                this.c = obj2;
                fragment.getClass();
            } else {
                if (z10) {
                    obj = fragment.o();
                } else {
                    Fragment.b bVar2 = fragment.P;
                    if (bVar2 == null) {
                        obj = null;
                    } else {
                        obj = bVar2.f5064k;
                    }
                }
                this.c = obj;
            }
            this.f5206d = true;
            if (z11) {
                if (z10) {
                    this.f5207e = fragment.p();
                    return;
                }
                fragment.getClass();
            }
            this.f5207e = null;
        }

        public final n0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            k0 k0Var = i0.f5188a;
            if (k0Var != null && (obj instanceof Transition)) {
                return k0Var;
            }
            n0 n0Var = i0.f5189b;
            if (n0Var != null && n0Var.e(obj)) {
                return n0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f5204a.c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public l(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public static void i(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (r0.b(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(viewGroup);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    i(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void j(p.b bVar, View view) {
        WeakHashMap<View, v0> weakHashMap = a3.j0.f188a;
        String k3 = j0.i.k(view);
        if (k3 != null) {
            bVar.put(k3, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    j(bVar, childAt);
                }
            }
        }
    }

    public static void k(p.b bVar, Collection collection) {
        Iterator it = ((g.b) bVar.entrySet()).iterator();
        while (true) {
            g.d dVar = (g.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                WeakHashMap<View, v0> weakHashMap = a3.j0.f188a;
                if (!collection.contains(j0.i.k((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (r12 == r5) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0639 A[LOOP:6: B:240:0x0633->B:242:0x0639, LOOP_END] */
    @Override // androidx.fragment.app.SpecialEffectsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z10) {
        SpecialEffectsController.Operation.State state;
        ArrayList arrayList2;
        SpecialEffectsController.Operation.State state2;
        HashMap hashMap;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        Object obj;
        View view;
        HashMap hashMap2;
        ArrayList<View> arrayList3;
        SpecialEffectsController.Operation.State state3;
        View view2;
        SpecialEffectsController.Operation operation;
        boolean z13;
        ArrayList arrayList4;
        View view3;
        ArrayList<View> arrayList5;
        HashMap hashMap3;
        Rect rect;
        n0 n0Var;
        SpecialEffectsController.Operation operation2;
        View view4;
        ArrayList<String> arrayList6;
        ArrayList<String> arrayList7;
        ArrayList<String> arrayList8;
        Object obj2;
        ArrayList<String> arrayList9;
        Object obj3;
        int i10;
        boolean z14;
        View view5;
        View view6;
        Iterator it;
        Iterator it2;
        Iterator it3;
        StringBuilder sb;
        String str3;
        t.a c10;
        boolean z15;
        Iterator it4;
        ArrayList arrayList10;
        boolean z16;
        Iterator it5 = arrayList.iterator();
        SpecialEffectsController.Operation operation3 = null;
        SpecialEffectsController.Operation operation4 = null;
        while (true) {
            boolean hasNext = it5.hasNext();
            state = SpecialEffectsController.Operation.State.VISIBLE;
            if (!hasNext) {
                break;
            }
            SpecialEffectsController.Operation operation5 = (SpecialEffectsController.Operation) it5.next();
            SpecialEffectsController.Operation.State i11 = SpecialEffectsController.Operation.State.i(operation5.c.M);
            int ordinal = operation5.f5077a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                    }
                } else if (i11 != state) {
                    operation4 = operation5;
                }
            }
            if (i11 == state && operation3 == null) {
                operation3 = operation5;
            }
        }
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList(arrayList);
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            SpecialEffectsController.Operation operation6 = (SpecialEffectsController.Operation) it6.next();
            v2.d dVar = new v2.d();
            operation6.d();
            operation6.f5080e.add(dVar);
            arrayList11.add(new a(operation6, dVar, z10));
            v2.d dVar2 = new v2.d();
            operation6.d();
            operation6.f5080e.add(dVar2);
            if (z10) {
                if (operation6 == operation3) {
                    z16 = true;
                }
                z16 = false;
            }
            arrayList12.add(new c(operation6, dVar2, z10, z16));
            operation6.f5079d.add(new androidx.fragment.app.c(this, arrayList13, operation6));
        }
        HashMap hashMap4 = new HashMap();
        Iterator it7 = arrayList12.iterator();
        n0 n0Var2 = null;
        while (it7.hasNext()) {
            c cVar = (c) it7.next();
            if (cVar.b()) {
                arrayList10 = arrayList11;
                it4 = it7;
            } else {
                Object obj4 = cVar.c;
                n0 c11 = cVar.c(obj4);
                Object obj5 = cVar.f5207e;
                n0 c12 = cVar.c(obj5);
                it4 = it7;
                arrayList10 = arrayList11;
                SpecialEffectsController.Operation operation7 = cVar.f5204a;
                if (c11 != null && c12 != null && c11 != c12) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + operation7.c + " returned Transition " + obj4 + " which uses a different Transition  type than its shared element transition " + obj5);
                }
                c11 = c12;
                if (n0Var2 == null) {
                    n0Var2 = c11;
                } else if (c11 != null && n0Var2 != c11) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + operation7.c + " returned Transition " + obj4 + " which uses a different Transition  type than other Fragments.");
                }
            }
            it7 = it4;
            arrayList11 = arrayList10;
        }
        ArrayList arrayList14 = arrayList11;
        SpecialEffectsController.Operation.State state4 = SpecialEffectsController.Operation.State.GONE;
        ViewGroup viewGroup = this.f5073a;
        if (n0Var2 == null) {
            Iterator it8 = arrayList12.iterator();
            while (it8.hasNext()) {
                c cVar2 = (c) it8.next();
                hashMap4.put(cVar2.f5204a, Boolean.FALSE);
                cVar2.a();
            }
            state2 = state4;
            arrayList2 = arrayList13;
            hashMap = hashMap4;
            str = "FragmentManager";
        } else {
            View view7 = new View(viewGroup.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList15 = new ArrayList<>();
            ArrayList<View> arrayList16 = new ArrayList<>();
            p.b bVar = new p.b();
            Iterator it9 = arrayList12.iterator();
            SpecialEffectsController.Operation.State state5 = state;
            String str4 = "FragmentManager";
            arrayList2 = arrayList13;
            Object obj6 = null;
            View view8 = null;
            boolean z17 = false;
            SpecialEffectsController.Operation operation8 = operation3;
            SpecialEffectsController.Operation operation9 = operation4;
            while (it9.hasNext()) {
                SpecialEffectsController.Operation.State state6 = state4;
                Object obj7 = ((c) it9.next()).f5207e;
                if (obj7 != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 && operation8 != null && operation9 != null) {
                    Object t10 = n0Var2.t(n0Var2.f(obj7));
                    Fragment fragment = operation9.c;
                    Fragment.b bVar2 = fragment.P;
                    if (bVar2 == null || (arrayList6 = bVar2.f5060g) == null) {
                        arrayList6 = new ArrayList<>();
                    }
                    Fragment fragment2 = operation8.c;
                    arrayList4 = arrayList12;
                    Fragment.b bVar3 = fragment2.P;
                    if (bVar3 == null || (arrayList7 = bVar3.f5060g) == null) {
                        arrayList7 = new ArrayList<>();
                    }
                    HashMap hashMap5 = hashMap4;
                    Fragment.b bVar4 = fragment2.P;
                    if (bVar4 == null || (arrayList8 = bVar4.f5061h) == null) {
                        arrayList8 = new ArrayList<>();
                    }
                    View view9 = view7;
                    Rect rect3 = rect2;
                    int i12 = 0;
                    while (true) {
                        obj2 = t10;
                        if (i12 >= arrayList8.size()) {
                            break;
                        }
                        int indexOf = arrayList6.indexOf(arrayList8.get(i12));
                        if (indexOf != -1) {
                            arrayList6.set(indexOf, arrayList7.get(i12));
                        }
                        i12++;
                        t10 = obj2;
                    }
                    Fragment.b bVar5 = fragment.P;
                    if (bVar5 == null || (arrayList9 = bVar5.f5061h) == null) {
                        arrayList9 = new ArrayList<>();
                    }
                    int size = arrayList6.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        bVar.put(arrayList6.get(i13), arrayList9.get(i13));
                    }
                    p.b bVar6 = new p.b();
                    j(bVar6, fragment2.M);
                    p.g.k(bVar6, arrayList6);
                    p.g.k(bVar, bVar6.keySet());
                    p.b bVar7 = new p.b();
                    j(bVar7, fragment.M);
                    p.g.k(bVar7, arrayList9);
                    p.g.k(bVar7, bVar.values());
                    k0 k0Var = i0.f5188a;
                    int i14 = bVar.f16580k;
                    while (true) {
                        i14--;
                        if (i14 < 0) {
                            break;
                        } else if (!bVar7.containsKey((String) bVar.k(i14))) {
                            bVar.j(i14);
                        }
                    }
                    k(bVar6, bVar.keySet());
                    k(bVar7, bVar.values());
                    if (bVar.isEmpty()) {
                        arrayList15.clear();
                        arrayList16.clear();
                        operation8 = operation3;
                        operation9 = operation4;
                        arrayList5 = arrayList16;
                        n0Var = n0Var2;
                        hashMap3 = hashMap5;
                        view3 = view9;
                        rect = rect3;
                        obj6 = null;
                        view7 = view3;
                        arrayList16 = arrayList5;
                        state4 = state6;
                        arrayList12 = arrayList4;
                        n0 n0Var3 = n0Var;
                        rect2 = rect;
                        hashMap4 = hashMap3;
                        n0Var2 = n0Var3;
                    } else {
                        i0.a(fragment, fragment2, z10);
                        a3.a0.a(viewGroup, new h(operation4, operation3, z10, bVar7));
                        arrayList15.addAll(bVar6.values());
                        if (!arrayList6.isEmpty()) {
                            i10 = 0;
                            z14 = false;
                            view5 = (View) bVar6.getOrDefault(arrayList6.get(0), null);
                            obj3 = obj2;
                            n0Var2.n(view5, obj3);
                        } else {
                            obj3 = obj2;
                            i10 = 0;
                            z14 = false;
                            view5 = view8;
                        }
                        arrayList16.addAll(bVar7.values());
                        if (!arrayList9.isEmpty() && (view6 = (View) bVar7.getOrDefault(arrayList9.get(i10), z14)) != null) {
                            rect = rect3;
                            a3.a0.a(viewGroup, new i(n0Var2, view6, rect));
                            view3 = view9;
                            z17 = true;
                        } else {
                            rect = rect3;
                            view3 = view9;
                        }
                        n0Var2.r(obj3, view3, arrayList15);
                        arrayList5 = arrayList16;
                        n0Var = n0Var2;
                        n0Var2.m(obj3, null, null, null, null, obj3, arrayList5);
                        Boolean bool = Boolean.TRUE;
                        hashMap3 = hashMap5;
                        hashMap3.put(operation3, bool);
                        hashMap3.put(operation4, bool);
                        view4 = view5;
                        obj6 = obj3;
                        operation8 = operation3;
                        operation2 = operation4;
                    }
                } else {
                    arrayList4 = arrayList12;
                    view3 = view7;
                    arrayList5 = arrayList16;
                    n0 n0Var4 = n0Var2;
                    hashMap3 = hashMap4;
                    rect = rect2;
                    n0Var = n0Var4;
                    operation2 = operation9;
                    view4 = view8;
                }
                view8 = view4;
                operation9 = operation2;
                view7 = view3;
                arrayList16 = arrayList5;
                state4 = state6;
                arrayList12 = arrayList4;
                n0 n0Var32 = n0Var;
                rect2 = rect;
                hashMap4 = hashMap3;
                n0Var2 = n0Var32;
            }
            state2 = state4;
            ArrayList arrayList17 = arrayList12;
            View view10 = view7;
            ArrayList<View> arrayList18 = arrayList16;
            n0 n0Var5 = n0Var2;
            HashMap hashMap6 = hashMap4;
            Rect rect4 = rect2;
            ArrayList arrayList19 = new ArrayList();
            Iterator it10 = arrayList17.iterator();
            SpecialEffectsController.Operation operation10 = operation9;
            Object obj8 = null;
            Object obj9 = null;
            while (it10.hasNext()) {
                Iterator it11 = it10;
                c cVar3 = (c) it10.next();
                boolean b5 = cVar3.b();
                p.b bVar8 = bVar;
                SpecialEffectsController.Operation operation11 = cVar3.f5204a;
                SpecialEffectsController.Operation operation12 = operation4;
                if (b5) {
                    hashMap6.put(operation11, Boolean.FALSE);
                    cVar3.a();
                    view = view10;
                    obj = obj6;
                    arrayList3 = arrayList15;
                    operation = operation10;
                    hashMap2 = hashMap6;
                    view2 = view8;
                    state3 = state5;
                } else {
                    Object f10 = n0Var5.f(cVar3.c);
                    if (obj6 != null && (operation11 == operation8 || operation11 == operation10)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (f10 == null) {
                        if (!z12) {
                            hashMap6.put(operation11, Boolean.FALSE);
                            cVar3.a();
                        }
                        view = view10;
                        obj = obj6;
                        arrayList3 = arrayList15;
                        hashMap2 = hashMap6;
                        view2 = view8;
                        state3 = state5;
                    } else {
                        obj = obj6;
                        ArrayList<View> arrayList20 = new ArrayList<>();
                        HashMap hashMap7 = hashMap6;
                        i(arrayList20, operation11.c.M);
                        if (z12) {
                            if (operation11 == operation8) {
                                arrayList20.removeAll(arrayList15);
                            } else {
                                arrayList20.removeAll(arrayList18);
                            }
                        }
                        if (arrayList20.isEmpty()) {
                            n0Var5.a(view10, f10);
                            view = view10;
                            hashMap2 = hashMap7;
                            arrayList3 = arrayList15;
                        } else {
                            n0Var5.b(f10, arrayList20);
                            view = view10;
                            hashMap2 = hashMap7;
                            n0Var5.m(f10, f10, arrayList20, null, null, null, null);
                            SpecialEffectsController.Operation.State state7 = state2;
                            if (operation11.f5077a == state7) {
                                arrayList2.remove(operation11);
                                ArrayList arrayList21 = new ArrayList(arrayList20);
                                state2 = state7;
                                Fragment fragment3 = operation11.c;
                                arrayList3 = arrayList15;
                                arrayList21.remove(fragment3.M);
                                n0Var5.l(f10, fragment3.M, arrayList21);
                                a3.a0.a(viewGroup, new j(arrayList20));
                            } else {
                                arrayList3 = arrayList15;
                                state2 = state7;
                            }
                        }
                        state3 = state5;
                        if (operation11.f5077a == state3) {
                            arrayList19.addAll(arrayList20);
                            if (z17) {
                                n0Var5.o(f10, rect4);
                            }
                            view2 = view8;
                        } else {
                            view2 = view8;
                            n0Var5.n(view2, f10);
                        }
                        hashMap2.put(operation11, Boolean.TRUE);
                        if (cVar3.f5206d) {
                            obj9 = n0Var5.j(obj9, f10, null);
                        } else {
                            obj8 = n0Var5.j(obj8, f10, null);
                        }
                    }
                    operation = operation12;
                }
                hashMap6 = hashMap2;
                view8 = view2;
                state5 = state3;
                arrayList15 = arrayList3;
                bVar = bVar8;
                operation4 = operation12;
                obj6 = obj;
                view10 = view;
                operation10 = operation;
                it10 = it11;
            }
            p.b bVar9 = bVar;
            SpecialEffectsController.Operation operation13 = operation4;
            Object obj10 = obj6;
            ArrayList<View> arrayList22 = arrayList15;
            hashMap = hashMap6;
            Object i15 = n0Var5.i(obj9, obj8, obj10);
            Iterator it12 = arrayList17.iterator();
            while (it12.hasNext()) {
                c cVar4 = (c) it12.next();
                if (!cVar4.b()) {
                    SpecialEffectsController.Operation operation14 = cVar4.f5204a;
                    SpecialEffectsController.Operation operation15 = operation13;
                    if (obj10 != null && (operation14 == operation8 || operation14 == operation15)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (cVar4.c == null && !z11) {
                        str2 = str4;
                        operation13 = operation15;
                        str4 = str2;
                    }
                    WeakHashMap<View, v0> weakHashMap = a3.j0.f188a;
                    if (!j0.g.c(viewGroup)) {
                        if (z.K(2)) {
                            str2 = str4;
                            Log.v(str2, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + operation14);
                        } else {
                            str2 = str4;
                        }
                        cVar4.a();
                    } else {
                        str2 = str4;
                        Fragment fragment4 = operation14.c;
                        n0Var5.p(i15, cVar4.f5205b, new k(cVar4));
                    }
                    operation13 = operation15;
                    str4 = str2;
                }
            }
            str = str4;
            WeakHashMap<View, v0> weakHashMap2 = a3.j0.f188a;
            if (j0.g.c(viewGroup)) {
                i0.b(arrayList19, 4);
                ArrayList k3 = n0.k(arrayList18);
                n0Var5.c(viewGroup, i15);
                n0.q(viewGroup, arrayList22, arrayList18, k3, bVar9);
                i0.b(arrayList19, 0);
                n0Var5.s(obj10, arrayList22, arrayList18);
                boolean containsValue = hashMap.containsValue(Boolean.TRUE);
                Context context = viewGroup.getContext();
                ArrayList arrayList23 = new ArrayList();
                it = arrayList14.iterator();
                boolean z18 = false;
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (!aVar.b() && (c10 = aVar.c(context)) != null) {
                        Animator animator = c10.f5254b;
                        if (animator == null) {
                            arrayList23.add(aVar);
                        } else {
                            SpecialEffectsController.Operation operation16 = aVar.f5204a;
                            Fragment fragment5 = operation16.c;
                            if (Boolean.TRUE.equals(hashMap.get(operation16))) {
                                if (z.K(2)) {
                                    Log.v(str, "Ignoring Animator set on " + fragment5 + " as this Fragment was involved in a Transition.");
                                }
                            } else {
                                SpecialEffectsController.Operation.State state8 = state2;
                                if (operation16.f5077a == state8) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                ArrayList arrayList24 = arrayList2;
                                if (z15) {
                                    arrayList24.remove(operation16);
                                }
                                View view11 = fragment5.M;
                                viewGroup.startViewTransition(view11);
                                animator.addListener(new d(viewGroup, view11, z15, operation16, aVar));
                                animator.setTarget(view11);
                                animator.start();
                                aVar.f5205b.b(new e(animator));
                                state2 = state8;
                                arrayList2 = arrayList24;
                                z18 = true;
                            }
                        }
                    }
                    aVar.a();
                }
                ArrayList arrayList25 = arrayList2;
                it2 = arrayList23.iterator();
                while (it2.hasNext()) {
                    a aVar2 = (a) it2.next();
                    SpecialEffectsController.Operation operation17 = aVar2.f5204a;
                    Fragment fragment6 = operation17.c;
                    if (containsValue) {
                        if (z.K(2)) {
                            sb = new StringBuilder("Ignoring Animation set on ");
                            sb.append(fragment6);
                            str3 = " as Animations cannot run alongside Transitions.";
                            sb.append(str3);
                            Log.v(str, sb.toString());
                        }
                        aVar2.a();
                    } else if (z18) {
                        if (z.K(2)) {
                            sb = new StringBuilder("Ignoring Animation set on ");
                            sb.append(fragment6);
                            str3 = " as Animations cannot run alongside Animators.";
                            sb.append(str3);
                            Log.v(str, sb.toString());
                        }
                        aVar2.a();
                    } else {
                        View view12 = fragment6.M;
                        t.a c13 = aVar2.c(context);
                        c13.getClass();
                        Animation animation = c13.f5253a;
                        animation.getClass();
                        if (operation17.f5077a != SpecialEffectsController.Operation.State.REMOVED) {
                            view12.startAnimation(animation);
                            aVar2.a();
                        } else {
                            viewGroup.startViewTransition(view12);
                            t.b bVar10 = new t.b(animation, viewGroup, view12);
                            bVar10.setAnimationListener(new f(view12, viewGroup, aVar2));
                            view12.startAnimation(bVar10);
                        }
                        aVar2.f5205b.b(new g(view12, viewGroup, aVar2));
                    }
                }
                it3 = arrayList25.iterator();
                while (it3.hasNext()) {
                    SpecialEffectsController.Operation operation18 = (SpecialEffectsController.Operation) it3.next();
                    operation18.f5077a.a(operation18.c.M);
                }
                arrayList25.clear();
            }
        }
        boolean containsValue2 = hashMap.containsValue(Boolean.TRUE);
        Context context2 = viewGroup.getContext();
        ArrayList arrayList232 = new ArrayList();
        it = arrayList14.iterator();
        boolean z182 = false;
        while (it.hasNext()) {
        }
        ArrayList arrayList252 = arrayList2;
        it2 = arrayList232.iterator();
        while (it2.hasNext()) {
        }
        it3 = arrayList252.iterator();
        while (it3.hasNext()) {
        }
        arrayList252.clear();
    }
}
