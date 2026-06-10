package androidx.fragment.app;

import a3.j0;
import a3.v0;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.lifecycle.Lifecycle;
import com.noto.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final y f5151a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f5152b;
    public final Fragment c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5153d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f5154e = -1;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ View f5155i;

        public a(View view) {
            this.f5155i = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f5155i;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, v0> weakHashMap = a3.j0.f188a;
            j0.h.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public f0(y yVar, g0 g0Var, Fragment fragment) {
        this.f5151a = yVar;
        this.f5152b = g0Var;
        this.c = fragment;
    }

    public f0(y yVar, g0 g0Var, Fragment fragment, e0 e0Var) {
        this.f5151a = yVar;
        this.f5152b = g0Var;
        this.c = fragment;
        fragment.f5038k = null;
        fragment.f5039l = null;
        fragment.f5051y = 0;
        fragment.f5048v = false;
        fragment.f5045s = false;
        Fragment fragment2 = fragment.f5041o;
        fragment.f5042p = fragment2 != null ? fragment2.f5040m : null;
        fragment.f5041o = null;
        Bundle bundle = e0Var.f5147u;
        if (bundle == null) {
            bundle = new Bundle();
        }
        fragment.f5037j = bundle;
    }

    public f0(y yVar, g0 g0Var, ClassLoader classLoader, v vVar, e0 e0Var) {
        this.f5151a = yVar;
        this.f5152b = g0Var;
        Fragment a10 = vVar.a(e0Var.f5136i);
        this.c = a10;
        Bundle bundle = e0Var.f5144r;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.W(bundle);
        a10.f5040m = e0Var.f5137j;
        a10.f5047u = e0Var.f5138k;
        a10.f5049w = true;
        a10.D = e0Var.f5139l;
        a10.E = e0Var.f5140m;
        a10.F = e0Var.n;
        a10.I = e0Var.f5141o;
        a10.f5046t = e0Var.f5142p;
        a10.H = e0Var.f5143q;
        a10.G = e0Var.f5145s;
        a10.T = Lifecycle.State.values()[e0Var.f5146t];
        Bundle bundle2 = e0Var.f5147u;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        a10.f5037j = bundle2;
        if (z.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public final void a() {
        boolean K = z.K(3);
        Fragment fragment = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle = fragment.f5037j;
        fragment.B.Q();
        fragment.f5036i = 3;
        fragment.K = true;
        if (z.K(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + fragment);
        }
        View view = fragment.M;
        if (view != null) {
            Bundle bundle2 = fragment.f5037j;
            SparseArray<Parcelable> sparseArray = fragment.f5038k;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                fragment.f5038k = null;
            }
            if (fragment.M != null) {
                o0 o0Var = fragment.V;
                o0Var.f5245m.b(fragment.f5039l);
                fragment.f5039l = null;
            }
            fragment.K = false;
            fragment.J(bundle2);
            if (fragment.K) {
                if (fragment.M != null) {
                    fragment.V.a(Lifecycle.Event.ON_CREATE);
                }
            } else {
                throw new SuperNotCalledException(a4.b.k("Fragment ", fragment, " did not call through to super.onViewStateRestored()"));
            }
        }
        fragment.f5037j = null;
        a0 a0Var = fragment.B;
        a0Var.A = false;
        a0Var.B = false;
        a0Var.H.f5130i = false;
        a0Var.t(4);
        this.f5151a.a(false);
    }

    public final void b() {
        View view;
        View view2;
        g0 g0Var = this.f5152b;
        g0Var.getClass();
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.L;
        int i10 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) g0Var.f5159b;
            int indexOf = arrayList.indexOf(fragment);
            int i11 = indexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = (Fragment) arrayList.get(indexOf);
                        if (fragment2.L == viewGroup && (view = fragment2.M) != null) {
                            i10 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = (Fragment) arrayList.get(i11);
                    if (fragment3.L == viewGroup && (view2 = fragment3.M) != null) {
                        i10 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        fragment.L.addView(fragment.M, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
        r4.k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        boolean K = z.K(3);
        Fragment fragment = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.f5041o;
        f0 f0Var = null;
        g0 g0Var = this.f5152b;
        if (fragment2 != null) {
            f0 g10 = g0Var.g(fragment2.f5040m);
            if (g10 != null) {
                fragment.f5042p = fragment.f5041o.f5040m;
                fragment.f5041o = null;
                f0Var = g10;
            } else {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.f5041o + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.f5042p;
            if (str != null && (f0Var = g0Var.g(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(androidx.activity.e.k(sb, fragment.f5042p, " that does not belong to this FragmentManager!"));
            }
        }
        z zVar = fragment.f5052z;
        fragment.A = zVar.f5286p;
        fragment.C = zVar.f5288r;
        y yVar = this.f5151a;
        yVar.g(false);
        ArrayList<Fragment.c> arrayList = fragment.f5035b0;
        Iterator<Fragment.c> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        arrayList.clear();
        fragment.B.c(fragment.A, fragment.a(), fragment);
        fragment.f5036i = 0;
        fragment.K = false;
        fragment.u(fragment.A.f5263j);
        if (fragment.K) {
            Iterator<d0> it2 = fragment.f5052z.n.iterator();
            while (it2.hasNext()) {
                it2.next().L(fragment);
            }
            a0 a0Var = fragment.B;
            a0Var.A = false;
            a0Var.B = false;
            a0Var.H.f5130i = false;
            a0Var.t(0);
            yVar.b(false);
            return;
        }
        throw new SuperNotCalledException(a4.b.k("Fragment ", fragment, " did not call through to super.onAttach()"));
    }

    public final int d() {
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact;
        Fragment fragment = this.c;
        if (fragment.f5052z == null) {
            return fragment.f5036i;
        }
        int i10 = this.f5154e;
        int ordinal = fragment.T.ordinal();
        boolean z10 = false;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i10 = Math.min(i10, -1);
                    }
                } else {
                    i10 = Math.min(i10, 5);
                }
            } else {
                i10 = Math.min(i10, 1);
            }
        } else {
            i10 = Math.min(i10, 0);
        }
        if (fragment.f5047u) {
            if (fragment.f5048v) {
                i10 = Math.max(this.f5154e, 2);
                View view = fragment.M;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f5154e < 4 ? Math.min(i10, fragment.f5036i) : Math.min(i10, 1);
            }
        }
        if (!fragment.f5045s) {
            i10 = Math.min(i10, 1);
        }
        ViewGroup viewGroup = fragment.L;
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact2 = null;
        SpecialEffectsController.Operation operation = null;
        if (viewGroup != null) {
            SpecialEffectsController f10 = SpecialEffectsController.f(viewGroup, fragment.l().I());
            f10.getClass();
            SpecialEffectsController.Operation d5 = f10.d(fragment);
            if (d5 != null) {
                lifecycleImpact = d5.f5078b;
            } else {
                lifecycleImpact = null;
            }
            Iterator<SpecialEffectsController.Operation> it = f10.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SpecialEffectsController.Operation next = it.next();
                if (next.c.equals(fragment) && !next.f5081f) {
                    operation = next;
                    break;
                }
            }
            if (operation != null && (lifecycleImpact == null || lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.NONE)) {
                lifecycleImpact2 = operation.f5078b;
            } else {
                lifecycleImpact2 = lifecycleImpact;
            }
        }
        if (lifecycleImpact2 == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (lifecycleImpact2 == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            i10 = Math.max(i10, 3);
        } else if (fragment.f5046t) {
            if (fragment.f5051y > 0) {
                z10 = true;
            }
            if (z10) {
                i10 = Math.min(i10, 1);
            } else {
                i10 = Math.min(i10, -1);
            }
        }
        if (fragment.N && fragment.f5036i < 5) {
            i10 = Math.min(i10, 4);
        }
        if (z.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + fragment);
        }
        return i10;
    }

    public final void e() {
        boolean K = z.K(3);
        final Fragment fragment = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        if (!fragment.S) {
            y yVar = this.f5151a;
            yVar.h(false);
            Bundle bundle = fragment.f5037j;
            fragment.B.Q();
            fragment.f5036i = 1;
            fragment.K = false;
            fragment.U.a(new androidx.lifecycle.o() { // from class: androidx.fragment.app.Fragment.5
                @Override // androidx.lifecycle.o
                public final void f(androidx.lifecycle.q qVar, Lifecycle.Event event) {
                    View view;
                    if (event != Lifecycle.Event.ON_STOP || (view = Fragment.this.M) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
            fragment.Y.b(bundle);
            fragment.w(bundle);
            fragment.S = true;
            if (fragment.K) {
                fragment.U.f(Lifecycle.Event.ON_CREATE);
                yVar.c(false);
                return;
            }
            throw new SuperNotCalledException(a4.b.k("Fragment ", fragment, " did not call through to super.onCreate()"));
        }
        fragment.U(fragment.f5037j);
        fragment.f5036i = 1;
    }

    public final void f() {
        String str;
        Fragment fragment = this.c;
        if (fragment.f5047u) {
            return;
        }
        if (z.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        LayoutInflater A = fragment.A(fragment.f5037j);
        fragment.R = A;
        ViewGroup viewGroup = fragment.L;
        if (viewGroup == null) {
            int i10 = fragment.E;
            if (i10 != 0) {
                if (i10 != -1) {
                    viewGroup = (ViewGroup) fragment.f5052z.f5287q.C0(i10);
                    if (viewGroup == null && !fragment.f5049w) {
                        try {
                            str = fragment.n().getResourceName(fragment.E);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.E) + " (" + str + ") for fragment " + fragment);
                    }
                } else {
                    throw new IllegalArgumentException(a4.b.k("Cannot create fragment ", fragment, " for a container view with no id"));
                }
            } else {
                viewGroup = null;
            }
        }
        fragment.L = viewGroup;
        fragment.K(A, viewGroup, fragment.f5037j);
        View view = fragment.M;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            fragment.M.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                b();
            }
            if (fragment.G) {
                fragment.M.setVisibility(8);
            }
            View view2 = fragment.M;
            WeakHashMap<View, v0> weakHashMap = a3.j0.f188a;
            if (j0.g.b(view2)) {
                j0.h.c(fragment.M);
            } else {
                View view3 = fragment.M;
                view3.addOnAttachStateChangeListener(new a(view3));
            }
            fragment.I(fragment.M);
            fragment.B.t(2);
            this.f5151a.m(fragment, fragment.M, fragment.f5037j, false);
            int visibility = fragment.M.getVisibility();
            fragment.b().n = fragment.M.getAlpha();
            if (fragment.L != null && visibility == 0) {
                View findFocus = fragment.M.findFocus();
                if (findFocus != null) {
                    fragment.b().f5067o = findFocus;
                    if (z.K(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                fragment.M.setAlpha(0.0f);
            }
        }
        fragment.f5036i = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        boolean z10;
        boolean z11;
        Fragment c;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean K = z.K(3);
        Fragment fragment = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        if (fragment.f5046t) {
            if (fragment.f5051y > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                z10 = true;
                g0 g0Var = this.f5152b;
                if (!z10) {
                    c0 c0Var = (c0) g0Var.f5160d;
                    if (!c0Var.f5125d.containsKey(fragment.f5040m) || !c0Var.f5128g) {
                        z13 = true;
                    } else {
                        z13 = c0Var.f5129h;
                    }
                    if (!z13) {
                        z11 = false;
                        if (z11) {
                            w<?> wVar = fragment.A;
                            if (wVar instanceof androidx.lifecycle.n0) {
                                z12 = ((c0) g0Var.f5160d).f5129h;
                            } else {
                                Context context = wVar.f5263j;
                                if (context instanceof Activity) {
                                    z12 = !((Activity) context).isChangingConfigurations();
                                } else {
                                    z12 = true;
                                }
                            }
                            if (z10 || z12) {
                                c0 c0Var2 = (c0) g0Var.f5160d;
                                c0Var2.getClass();
                                if (z.K(3)) {
                                    Log.d("FragmentManager", "Clearing non-config state for " + fragment);
                                }
                                HashMap<String, c0> hashMap = c0Var2.f5126e;
                                c0 c0Var3 = hashMap.get(fragment.f5040m);
                                if (c0Var3 != null) {
                                    c0Var3.b();
                                    hashMap.remove(fragment.f5040m);
                                }
                                HashMap<String, androidx.lifecycle.m0> hashMap2 = c0Var2.f5127f;
                                androidx.lifecycle.m0 m0Var = hashMap2.get(fragment.f5040m);
                                if (m0Var != null) {
                                    m0Var.a();
                                    hashMap2.remove(fragment.f5040m);
                                }
                            }
                            fragment.B.l();
                            fragment.U.f(Lifecycle.Event.ON_DESTROY);
                            fragment.f5036i = 0;
                            fragment.S = false;
                            fragment.K = true;
                            this.f5151a.d(fragment, false);
                            Iterator it = g0Var.e().iterator();
                            while (it.hasNext()) {
                                f0 f0Var = (f0) it.next();
                                if (f0Var != null) {
                                    String str = fragment.f5040m;
                                    Fragment fragment2 = f0Var.c;
                                    if (str.equals(fragment2.f5042p)) {
                                        fragment2.f5041o = fragment;
                                        fragment2.f5042p = null;
                                    }
                                }
                            }
                            String str2 = fragment.f5042p;
                            if (str2 != null) {
                                fragment.f5041o = g0Var.c(str2);
                            }
                            g0Var.j(this);
                            return;
                        }
                        String str3 = fragment.f5042p;
                        if (str3 != null && (c = g0Var.c(str3)) != null && c.I) {
                            fragment.f5041o = c;
                        }
                        fragment.f5036i = 0;
                        return;
                    }
                }
                z11 = true;
                if (z11) {
                }
            }
        }
        z10 = false;
        g0 g0Var2 = this.f5152b;
        if (!z10) {
        }
        z11 = true;
        if (z11) {
        }
    }

    public final void h() {
        View view;
        boolean K = z.K(3);
        Fragment fragment = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.L;
        if (viewGroup != null && (view = fragment.M) != null) {
            viewGroup.removeView(view);
        }
        fragment.L();
        this.f5151a.n(false);
        fragment.L = null;
        fragment.M = null;
        fragment.V = null;
        fragment.W.i(null);
        fragment.f5048v = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        boolean z10;
        boolean z11;
        boolean K = z.K(3);
        Fragment fragment = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.f5036i = -1;
        fragment.K = false;
        fragment.z();
        fragment.R = null;
        if (fragment.K) {
            a0 a0Var = fragment.B;
            if (!a0Var.C) {
                a0Var.l();
                fragment.B = new a0();
            }
            this.f5151a.e(false);
            fragment.f5036i = -1;
            fragment.A = null;
            fragment.C = null;
            fragment.f5052z = null;
            boolean z12 = true;
            if (fragment.f5046t) {
                if (fragment.f5051y > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    z10 = true;
                    if (!z10) {
                        c0 c0Var = (c0) this.f5152b.f5160d;
                        if (c0Var.f5125d.containsKey(fragment.f5040m) && c0Var.f5128g) {
                            z12 = c0Var.f5129h;
                        }
                        return;
                    }
                    if (z.K(3)) {
                        Log.d("FragmentManager", "initState called for fragment: " + fragment);
                    }
                    fragment.U = new androidx.lifecycle.r(fragment);
                    fragment.Y = new b4.c(fragment);
                    fragment.X = null;
                    fragment.f5040m = UUID.randomUUID().toString();
                    fragment.f5045s = false;
                    fragment.f5046t = false;
                    fragment.f5047u = false;
                    fragment.f5048v = false;
                    fragment.f5049w = false;
                    fragment.f5051y = 0;
                    fragment.f5052z = null;
                    fragment.B = new a0();
                    fragment.A = null;
                    fragment.D = 0;
                    fragment.E = 0;
                    fragment.F = null;
                    fragment.G = false;
                    fragment.H = false;
                    return;
                }
            }
            z10 = false;
            if (!z10) {
            }
            if (z.K(3)) {
            }
            fragment.U = new androidx.lifecycle.r(fragment);
            fragment.Y = new b4.c(fragment);
            fragment.X = null;
            fragment.f5040m = UUID.randomUUID().toString();
            fragment.f5045s = false;
            fragment.f5046t = false;
            fragment.f5047u = false;
            fragment.f5048v = false;
            fragment.f5049w = false;
            fragment.f5051y = 0;
            fragment.f5052z = null;
            fragment.B = new a0();
            fragment.A = null;
            fragment.D = 0;
            fragment.E = 0;
            fragment.F = null;
            fragment.G = false;
            fragment.H = false;
            return;
        }
        throw new SuperNotCalledException(a4.b.k("Fragment ", fragment, " did not call through to super.onDetach()"));
    }

    public final void j() {
        Fragment fragment = this.c;
        if (fragment.f5047u && fragment.f5048v && !fragment.f5050x) {
            if (z.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            LayoutInflater A = fragment.A(fragment.f5037j);
            fragment.R = A;
            fragment.K(A, null, fragment.f5037j);
            View view = fragment.M;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.M.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.G) {
                    fragment.M.setVisibility(8);
                }
                fragment.I(fragment.M);
                fragment.B.t(2);
                this.f5151a.m(fragment, fragment.M, fragment.f5037j, false);
                fragment.f5036i = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z10 = this.f5153d;
        Fragment fragment = this.c;
        if (z10) {
            if (z.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.f5153d = true;
            while (true) {
                int d5 = d();
                int i10 = fragment.f5036i;
                if (d5 != i10) {
                    if (d5 > i10) {
                        switch (i10 + 1) {
                            case 0:
                                c();
                                continue;
                            case 1:
                                e();
                                continue;
                            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                j();
                                f();
                                continue;
                            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                                a();
                                continue;
                            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                                if (fragment.M != null && (viewGroup2 = fragment.L) != null) {
                                    SpecialEffectsController f10 = SpecialEffectsController.f(viewGroup2, fragment.l().I());
                                    SpecialEffectsController.Operation.State b5 = SpecialEffectsController.Operation.State.b(fragment.M.getVisibility());
                                    f10.getClass();
                                    if (z.K(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragment);
                                    }
                                    f10.a(b5, SpecialEffectsController.Operation.LifecycleImpact.ADDING, this);
                                }
                                fragment.f5036i = 4;
                                continue;
                            case 5:
                                q();
                                continue;
                            case 6:
                                fragment.f5036i = 6;
                                continue;
                            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                n();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i10 - 1) {
                            case -1:
                                i();
                                continue;
                            case 0:
                                g();
                                continue;
                            case 1:
                                h();
                                fragment.f5036i = 1;
                                continue;
                            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                                fragment.f5048v = false;
                                fragment.f5036i = 2;
                                continue;
                            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                                if (z.K(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                                }
                                if (fragment.M != null && fragment.f5038k == null) {
                                    p();
                                }
                                if (fragment.M != null && (viewGroup3 = fragment.L) != null) {
                                    SpecialEffectsController f11 = SpecialEffectsController.f(viewGroup3, fragment.l().I());
                                    f11.getClass();
                                    if (z.K(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                    }
                                    f11.a(SpecialEffectsController.Operation.State.REMOVED, SpecialEffectsController.Operation.LifecycleImpact.REMOVING, this);
                                }
                                fragment.f5036i = 3;
                                continue;
                            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                                r();
                                continue;
                            case 5:
                                fragment.f5036i = 5;
                                continue;
                            case 6:
                                l();
                                continue;
                            default:
                                continue;
                        }
                    }
                } else {
                    if (fragment.Q) {
                        if (fragment.M != null && (viewGroup = fragment.L) != null) {
                            SpecialEffectsController f12 = SpecialEffectsController.f(viewGroup, fragment.l().I());
                            boolean z11 = fragment.G;
                            SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = SpecialEffectsController.Operation.LifecycleImpact.NONE;
                            if (z11) {
                                f12.getClass();
                                if (z.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                f12.a(SpecialEffectsController.Operation.State.GONE, lifecycleImpact, this);
                            } else {
                                f12.getClass();
                                if (z.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                f12.a(SpecialEffectsController.Operation.State.VISIBLE, lifecycleImpact, this);
                            }
                        }
                        z zVar = fragment.f5052z;
                        if (zVar != null && fragment.f5045s && z.L(fragment)) {
                            zVar.f5296z = true;
                        }
                        fragment.Q = false;
                    }
                    return;
                }
            }
        } finally {
            this.f5153d = false;
        }
    }

    public final void l() {
        boolean K = z.K(3);
        Fragment fragment = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
        }
        fragment.B.t(5);
        if (fragment.M != null) {
            fragment.V.a(Lifecycle.Event.ON_PAUSE);
        }
        fragment.U.f(Lifecycle.Event.ON_PAUSE);
        fragment.f5036i = 6;
        fragment.K = false;
        fragment.C();
        if (fragment.K) {
            this.f5151a.f(false);
            return;
        }
        throw new SuperNotCalledException(a4.b.k("Fragment ", fragment, " did not call through to super.onPause()"));
    }

    public final void m(ClassLoader classLoader) {
        Fragment fragment = this.c;
        Bundle bundle = fragment.f5037j;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        fragment.f5038k = fragment.f5037j.getSparseParcelableArray("android:view_state");
        fragment.f5039l = fragment.f5037j.getBundle("android:view_registry_state");
        String string = fragment.f5037j.getString("android:target_state");
        fragment.f5042p = string;
        if (string != null) {
            fragment.f5043q = fragment.f5037j.getInt("android:target_req_state", 0);
        }
        boolean z10 = fragment.f5037j.getBoolean("android:user_visible_hint", true);
        fragment.O = z10;
        if (z10) {
            return;
        }
        fragment.N = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        View view;
        boolean z10;
        String str;
        boolean K = z.K(3);
        Fragment fragment = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        Fragment.b bVar = fragment.P;
        if (bVar == null) {
            view = null;
        } else {
            view = bVar.f5067o;
        }
        if (view != null) {
            if (view != fragment.M) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != fragment.M) {
                    }
                }
                z10 = false;
                if (z10) {
                    boolean requestFocus = view.requestFocus();
                    if (z.K(2)) {
                        StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                        sb.append(view);
                        sb.append(" ");
                        if (requestFocus) {
                            str = "succeeded";
                        } else {
                            str = "failed";
                        }
                        sb.append(str);
                        sb.append(" on Fragment ");
                        sb.append(fragment);
                        sb.append(" resulting in focused view ");
                        sb.append(fragment.M.findFocus());
                        Log.v("FragmentManager", sb.toString());
                    }
                }
            }
            z10 = true;
            if (z10) {
            }
        }
        fragment.b().f5067o = null;
        fragment.B.Q();
        fragment.B.y(true);
        fragment.f5036i = 7;
        fragment.K = false;
        fragment.E();
        if (fragment.K) {
            androidx.lifecycle.r rVar = fragment.U;
            Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
            rVar.f(event);
            if (fragment.M != null) {
                fragment.V.f5244l.f(event);
            }
            a0 a0Var = fragment.B;
            a0Var.A = false;
            a0Var.B = false;
            a0Var.H.f5130i = false;
            a0Var.t(7);
            this.f5151a.i(false);
            fragment.f5037j = null;
            fragment.f5038k = null;
            fragment.f5039l = null;
            return;
        }
        throw new SuperNotCalledException(a4.b.k("Fragment ", fragment, " did not call through to super.onResume()"));
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        Fragment fragment = this.c;
        fragment.F(bundle);
        fragment.Y.c(bundle);
        b0 W = fragment.B.W();
        if (W != null) {
            bundle.putParcelable("android:support:fragments", W);
        }
        this.f5151a.j(false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (fragment.M != null) {
            p();
        }
        if (fragment.f5038k != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f5038k);
        }
        if (fragment.f5039l != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", fragment.f5039l);
        }
        if (!fragment.O) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.O);
        }
        return bundle;
    }

    public final void p() {
        Fragment fragment = this.c;
        if (fragment.M == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.M.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.f5038k = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.V.f5245m.c(bundle);
        if (!bundle.isEmpty()) {
            fragment.f5039l = bundle;
        }
    }

    public final void q() {
        boolean K = z.K(3);
        Fragment fragment = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto STARTED: " + fragment);
        }
        fragment.B.Q();
        fragment.B.y(true);
        fragment.f5036i = 5;
        fragment.K = false;
        fragment.G();
        if (fragment.K) {
            androidx.lifecycle.r rVar = fragment.U;
            Lifecycle.Event event = Lifecycle.Event.ON_START;
            rVar.f(event);
            if (fragment.M != null) {
                fragment.V.f5244l.f(event);
            }
            a0 a0Var = fragment.B;
            a0Var.A = false;
            a0Var.B = false;
            a0Var.H.f5130i = false;
            a0Var.t(5);
            this.f5151a.k(false);
            return;
        }
        throw new SuperNotCalledException(a4.b.k("Fragment ", fragment, " did not call through to super.onStart()"));
    }

    public final void r() {
        boolean K = z.K(3);
        Fragment fragment = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom STARTED: " + fragment);
        }
        a0 a0Var = fragment.B;
        a0Var.B = true;
        a0Var.H.f5130i = true;
        a0Var.t(4);
        if (fragment.M != null) {
            fragment.V.a(Lifecycle.Event.ON_STOP);
        }
        fragment.U.f(Lifecycle.Event.ON_STOP);
        fragment.f5036i = 4;
        fragment.K = false;
        fragment.H();
        if (fragment.K) {
            this.f5151a.l(false);
            return;
        }
        throw new SuperNotCalledException(a4.b.k("Fragment ", fragment, " did not call through to super.onStop()"));
    }
}
