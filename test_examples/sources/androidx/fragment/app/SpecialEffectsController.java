package androidx.fragment.app;

import a3.j0;
import a3.v0;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.z;
import com.noto.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import v2.d;

/* loaded from: classes.dex */
public abstract class SpecialEffectsController {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f5073a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<Operation> f5074b = new ArrayList<>();
    public final ArrayList<Operation> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f5075d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5076e = false;

    /* loaded from: classes.dex */
    public static class Operation {

        /* renamed from: a  reason: collision with root package name */
        public State f5077a;

        /* renamed from: b  reason: collision with root package name */
        public LifecycleImpact f5078b;
        public final Fragment c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f5079d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final HashSet<v2.d> f5080e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f5081f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5082g = false;

        /* loaded from: classes.dex */
        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        /* loaded from: classes.dex */
        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static State b(int i10) {
                if (i10 != 0) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException(androidx.activity.e.g("Unknown visibility ", i10));
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            public static State i(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            public final void a(View view) {
                int i10;
                int ordinal = ordinal();
                if (ordinal == 0) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (z.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (ordinal == 1) {
                    if (z.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i10 = 0;
                } else if (ordinal == 2) {
                    if (z.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i10 = 8;
                } else if (ordinal != 3) {
                    return;
                } else {
                    if (z.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    i10 = 4;
                }
                view.setVisibility(i10);
            }
        }

        /* loaded from: classes.dex */
        public class a implements d.b {
            public a() {
            }

            @Override // v2.d.b
            public final void onCancel() {
                Operation.this.a();
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment, v2.d dVar) {
            this.f5077a = state;
            this.f5078b = lifecycleImpact;
            this.c = fragment;
            dVar.b(new a());
        }

        public final void a() {
            if (this.f5081f) {
                return;
            }
            this.f5081f = true;
            HashSet<v2.d> hashSet = this.f5080e;
            if (hashSet.isEmpty()) {
                b();
                return;
            }
            Iterator it = new ArrayList(hashSet).iterator();
            while (it.hasNext()) {
                ((v2.d) it.next()).a();
            }
        }

        public void b() {
            if (this.f5082g) {
                return;
            }
            if (z.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f5082g = true;
            Iterator it = this.f5079d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(State state, LifecycleImpact lifecycleImpact) {
            LifecycleImpact lifecycleImpact2;
            int ordinal = lifecycleImpact.ordinal();
            State state2 = State.REMOVED;
            Fragment fragment = this.c;
            if (ordinal == 0) {
                if (this.f5077a != state2) {
                    if (z.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f5077a + " -> " + state + ". ");
                    }
                    this.f5077a = state;
                    return;
                }
                return;
            }
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return;
                }
                if (z.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f5077a + " -> REMOVED. mLifecycleImpact  = " + this.f5078b + " to REMOVING.");
                }
                this.f5077a = state2;
                lifecycleImpact2 = LifecycleImpact.REMOVING;
            } else if (this.f5077a != state2) {
                return;
            } else {
                if (z.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f5078b + " to ADDING.");
                }
                this.f5077a = State.VISIBLE;
                lifecycleImpact2 = LifecycleImpact.ADDING;
            }
            this.f5078b = lifecycleImpact2;
        }

        public void d() {
        }

        public final String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f5077a + "} {mLifecycleImpact = " + this.f5078b + "} {mFragment = " + this.c + "}";
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ c f5093i;

        public a(c cVar) {
            this.f5093i = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<Operation> arrayList = SpecialEffectsController.this.f5074b;
            c cVar = this.f5093i;
            if (arrayList.contains(cVar)) {
                cVar.f5077a.a(cVar.c.M);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ c f5095i;

        public b(c cVar) {
            this.f5095i = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SpecialEffectsController specialEffectsController = SpecialEffectsController.this;
            ArrayList<Operation> arrayList = specialEffectsController.f5074b;
            c cVar = this.f5095i;
            arrayList.remove(cVar);
            specialEffectsController.c.remove(cVar);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Operation {

        /* renamed from: h  reason: collision with root package name */
        public final f0 f5097h;

        public c(Operation.State state, Operation.LifecycleImpact lifecycleImpact, f0 f0Var, v2.d dVar) {
            super(state, lifecycleImpact, f0Var.c, dVar);
            this.f5097h = f0Var;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void b() {
            super.b();
            this.f5097h.k();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void d() {
            float f10;
            if (this.f5078b == Operation.LifecycleImpact.ADDING) {
                f0 f0Var = this.f5097h;
                Fragment fragment = f0Var.c;
                View findFocus = fragment.M.findFocus();
                if (findFocus != null) {
                    fragment.b().f5067o = findFocus;
                    if (z.K(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                View T = this.c.T();
                if (T.getParent() == null) {
                    f0Var.b();
                    T.setAlpha(0.0f);
                }
                if (T.getAlpha() == 0.0f && T.getVisibility() == 0) {
                    T.setVisibility(4);
                }
                Fragment.b bVar = fragment.P;
                if (bVar == null) {
                    f10 = 1.0f;
                } else {
                    f10 = bVar.n;
                }
                T.setAlpha(f10);
            }
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        this.f5073a = viewGroup;
    }

    public static SpecialEffectsController f(ViewGroup viewGroup, q0 q0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        ((z.f) q0Var).getClass();
        l lVar = new l(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, lVar);
        return lVar;
    }

    public final void a(Operation.State state, Operation.LifecycleImpact lifecycleImpact, f0 f0Var) {
        synchronized (this.f5074b) {
            v2.d dVar = new v2.d();
            Operation d5 = d(f0Var.c);
            if (d5 != null) {
                d5.c(state, lifecycleImpact);
                return;
            }
            c cVar = new c(state, lifecycleImpact, f0Var, dVar);
            this.f5074b.add(cVar);
            cVar.f5079d.add(new a(cVar));
            cVar.f5079d.add(new b(cVar));
        }
    }

    public abstract void b(ArrayList arrayList, boolean z10);

    public final void c() {
        if (this.f5076e) {
            return;
        }
        ViewGroup viewGroup = this.f5073a;
        WeakHashMap<View, v0> weakHashMap = a3.j0.f188a;
        if (!j0.g.b(viewGroup)) {
            e();
            this.f5075d = false;
            return;
        }
        synchronized (this.f5074b) {
            if (!this.f5074b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.c);
                this.c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Operation operation = (Operation) it.next();
                    if (z.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                    }
                    operation.a();
                    if (!operation.f5082g) {
                        this.c.add(operation);
                    }
                }
                h();
                ArrayList arrayList2 = new ArrayList(this.f5074b);
                this.f5074b.clear();
                this.c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((Operation) it2.next()).d();
                }
                b(arrayList2, this.f5075d);
                this.f5075d = false;
            }
        }
    }

    public final Operation d(Fragment fragment) {
        Iterator<Operation> it = this.f5074b.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.c.equals(fragment) && !next.f5081f) {
                return next;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f5073a;
        WeakHashMap<View, v0> weakHashMap = a3.j0.f188a;
        boolean b5 = j0.g.b(viewGroup);
        synchronized (this.f5074b) {
            h();
            Iterator<Operation> it = this.f5074b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.c).iterator();
            while (it2.hasNext()) {
                Operation operation = (Operation) it2.next();
                if (z.K(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (b5) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f5073a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(operation);
                    Log.v("FragmentManager", sb.toString());
                }
                operation.a();
            }
            Iterator it3 = new ArrayList(this.f5074b).iterator();
            while (it3.hasNext()) {
                Operation operation2 = (Operation) it3.next();
                if (z.K(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b5) {
                        str = "";
                    } else {
                        str = "Container " + this.f5073a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(operation2);
                    Log.v("FragmentManager", sb2.toString());
                }
                operation2.a();
            }
        }
    }

    public final void g() {
        synchronized (this.f5074b) {
            h();
            this.f5076e = false;
            int size = this.f5074b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Operation operation = this.f5074b.get(size);
                Operation.State i10 = Operation.State.i(operation.c.M);
                Operation.State state = operation.f5077a;
                Operation.State state2 = Operation.State.VISIBLE;
                if (state == state2 && i10 != state2) {
                    operation.c.getClass();
                    this.f5076e = false;
                    break;
                }
            }
        }
    }

    public final void h() {
        Iterator<Operation> it = this.f5074b.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.f5078b == Operation.LifecycleImpact.ADDING) {
                next.c(Operation.State.b(next.c.T().getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }
}
