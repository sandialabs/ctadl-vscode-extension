package androidx.viewpager2.adapter;

import a3.j0;
import a3.v0;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f0;
import androidx.fragment.app.y;
import androidx.fragment.app.z;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.noto.app.note.NoteReadingModeFragment;
import java.util.Iterator;
import java.util.WeakHashMap;
import ma.i;
import p.g;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<f> implements g {

    /* renamed from: d  reason: collision with root package name */
    public final Lifecycle f6093d;

    /* renamed from: e  reason: collision with root package name */
    public final z f6094e;

    /* renamed from: f  reason: collision with root package name */
    public final p.e<Fragment> f6095f;

    /* renamed from: g  reason: collision with root package name */
    public final p.e<Fragment.d> f6096g;

    /* renamed from: h  reason: collision with root package name */
    public final p.e<Integer> f6097h;

    /* renamed from: i  reason: collision with root package name */
    public b f6098i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6099j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6100k;

    /* loaded from: classes.dex */
    public static abstract class a extends RecyclerView.f {
        @Override // androidx.recyclerview.widget.RecyclerView.f
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void b(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void c(int i10, int i11, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void d(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void e(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void f(int i10, int i11) {
            a();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public d f6106a;

        /* renamed from: b  reason: collision with root package name */
        public e f6107b;
        public o c;

        /* renamed from: d  reason: collision with root package name */
        public ViewPager2 f6108d;

        /* renamed from: e  reason: collision with root package name */
        public long f6109e = -1;

        public b() {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z10) {
            boolean z11;
            int currentItem;
            boolean z12;
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            if (fragmentStateAdapter.f6094e.O() || this.f6108d.getScrollState() != 0) {
                return;
            }
            p.e<Fragment> eVar = fragmentStateAdapter.f6095f;
            if (eVar.L() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || fragmentStateAdapter.d() == 0 || (currentItem = this.f6108d.getCurrentItem()) >= fragmentStateAdapter.d()) {
                return;
            }
            long j2 = currentItem;
            if (j2 == this.f6109e && !z10) {
                return;
            }
            Fragment fragment = null;
            Fragment fragment2 = (Fragment) eVar.h(j2, null);
            if (fragment2 != null && fragment2.s()) {
                this.f6109e = j2;
                z zVar = fragmentStateAdapter.f6094e;
                zVar.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(zVar);
                for (int i10 = 0; i10 < eVar.L(); i10++) {
                    long t10 = eVar.t(i10);
                    Fragment M = eVar.M(i10);
                    if (M.s()) {
                        if (t10 != this.f6109e) {
                            aVar.j(M, Lifecycle.State.STARTED);
                        } else {
                            fragment = M;
                        }
                        if (t10 == this.f6109e) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (M.J != z12) {
                            M.J = z12;
                        }
                    }
                }
                if (fragment != null) {
                    aVar.j(fragment, Lifecycle.State.RESUMED);
                }
                if (!aVar.f5164a.isEmpty()) {
                    if (!aVar.f5169g) {
                        aVar.f5170h = false;
                        aVar.f5098q.z(aVar, false);
                        return;
                    }
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
            }
        }
    }

    public FragmentStateAdapter(Fragment fragment) {
        z h10 = fragment.h();
        r rVar = fragment.U;
        this.f6095f = new p.e<>();
        this.f6096g = new p.e<>();
        this.f6097h = new p.e<>();
        this.f6099j = false;
        this.f6100k = false;
        this.f6094e = h10;
        this.f6093d = rVar;
        q();
    }

    public static void s(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    @Override // androidx.viewpager2.adapter.g
    public final Bundle a() {
        p.e<Fragment> eVar = this.f6095f;
        int L = eVar.L();
        p.e<Fragment.d> eVar2 = this.f6096g;
        Bundle bundle = new Bundle(eVar2.L() + L);
        for (int i10 = 0; i10 < eVar.L(); i10++) {
            long t10 = eVar.t(i10);
            Fragment fragment = (Fragment) eVar.h(t10, null);
            if (fragment != null && fragment.s()) {
                String str = "f#" + t10;
                z zVar = this.f6094e;
                zVar.getClass();
                if (fragment.f5052z == zVar) {
                    bundle.putString(str, fragment.f5040m);
                } else {
                    zVar.e0(new IllegalStateException(a4.b.k("Fragment ", fragment, " is not currently in the FragmentManager")));
                    throw null;
                }
            }
        }
        for (int i11 = 0; i11 < eVar2.L(); i11++) {
            long t11 = eVar2.t(i11);
            if (t(t11)) {
                bundle.putParcelable("s#" + t11, (Parcelable) eVar2.h(t11, null));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.g
    public final void b(Parcelable parcelable) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        p.e<Fragment.d> eVar = this.f6096g;
        boolean z14 = false;
        if (eVar.L() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            p.e<Fragment> eVar2 = this.f6095f;
            if (eVar2.L() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        long parseLong = Long.parseLong(str.substring(2));
                        z zVar = this.f6094e;
                        zVar.getClass();
                        String string = bundle.getString(str);
                        Fragment fragment = null;
                        if (string != null) {
                            Fragment C = zVar.C(string);
                            if (C != null) {
                                fragment = C;
                            } else {
                                zVar.e0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                                throw null;
                            }
                        }
                        eVar2.J(parseLong, fragment);
                    } else {
                        if (str.startsWith("s#") && str.length() > 2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            long parseLong2 = Long.parseLong(str.substring(2));
                            Fragment.d dVar = (Fragment.d) bundle.getParcelable(str);
                            if (t(parseLong2)) {
                                eVar.J(parseLong2, dVar);
                            }
                        } else {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                        }
                    }
                }
                if (eVar2.L() == 0) {
                    z14 = true;
                }
                if (!z14) {
                    this.f6100k = true;
                    this.f6099j = true;
                    v();
                    final Handler handler = new Handler(Looper.getMainLooper());
                    final c cVar = new c(this);
                    this.f6093d.a(new o() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
                        @Override // androidx.lifecycle.o
                        public final void f(q qVar, Lifecycle.Event event) {
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                handler.removeCallbacks(cVar);
                                qVar.i0().c(this);
                            }
                        }
                    });
                    handler.postDelayed(cVar, 10000L);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long e(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void g(RecyclerView recyclerView) {
        boolean z10;
        if (this.f6098i == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            final b bVar = new b();
            this.f6098i = bVar;
            bVar.f6108d = b.a(recyclerView);
            d dVar = new d(bVar);
            bVar.f6106a = dVar;
            bVar.f6108d.f6121k.f6148a.add(dVar);
            e eVar = new e(bVar);
            bVar.f6107b = eVar;
            p(eVar);
            o oVar = new o() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
                @Override // androidx.lifecycle.o
                public final void f(q qVar, Lifecycle.Event event) {
                    FragmentStateAdapter.b.this.b(false);
                }
            };
            bVar.c = oVar;
            this.f6093d.a(oVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void h(f fVar, int i10) {
        boolean z10;
        Bundle bundle;
        f fVar2 = fVar;
        long j2 = fVar2.f5669e;
        FrameLayout frameLayout = (FrameLayout) fVar2.f5666a;
        int id = frameLayout.getId();
        Long w10 = w(id);
        p.e<Integer> eVar = this.f6097h;
        if (w10 != null && w10.longValue() != j2) {
            y(w10.longValue());
            eVar.K(w10.longValue());
        }
        eVar.J(j2, Integer.valueOf(id));
        long j10 = i10;
        p.e<Fragment> eVar2 = this.f6095f;
        if (eVar2.f16553i) {
            eVar2.f();
        }
        if (i.q(eVar2.f16554j, eVar2.f16556l, j10) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            NoteReadingModeFragment u10 = u(i10);
            Bundle bundle2 = null;
            Fragment.d dVar = (Fragment.d) this.f6096g.h(j10, null);
            if (u10.f5052z == null) {
                if (dVar != null && (bundle = dVar.f5068i) != null) {
                    bundle2 = bundle;
                }
                u10.f5037j = bundle2;
                eVar2.J(j10, u10);
            } else {
                throw new IllegalStateException("Fragment already added");
            }
        }
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.g.b(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new androidx.viewpager2.adapter.a(this, frameLayout, fVar2));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        v();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final f j(ViewGroup viewGroup, int i10) {
        int i11 = f.f6118u;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        frameLayout.setId(j0.e.a());
        frameLayout.setSaveEnabled(false);
        return new f(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void k(RecyclerView recyclerView) {
        b bVar = this.f6098i;
        bVar.getClass();
        ViewPager2 a10 = b.a(recyclerView);
        a10.f6121k.f6148a.remove(bVar.f6106a);
        e eVar = bVar.f6107b;
        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
        fragmentStateAdapter.r(eVar);
        fragmentStateAdapter.f6093d.c(bVar.c);
        bVar.f6108d = null;
        this.f6098i = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ boolean l(f fVar) {
        f fVar2 = fVar;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void m(f fVar) {
        x(fVar);
        v();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void o(f fVar) {
        Long w10 = w(((FrameLayout) fVar.f5666a).getId());
        if (w10 != null) {
            y(w10.longValue());
            this.f6097h.K(w10.longValue());
        }
    }

    public final boolean t(long j2) {
        return j2 >= 0 && j2 < ((long) d());
    }

    public abstract NoteReadingModeFragment u(int i10);

    public final void v() {
        p.e<Fragment> eVar;
        p.e<Integer> eVar2;
        boolean z10;
        View view;
        if (this.f6100k && !this.f6094e.O()) {
            p.d dVar = new p.d();
            int i10 = 0;
            while (true) {
                eVar = this.f6095f;
                int L = eVar.L();
                eVar2 = this.f6097h;
                if (i10 >= L) {
                    break;
                }
                long t10 = eVar.t(i10);
                if (!t(t10)) {
                    dVar.add(Long.valueOf(t10));
                    eVar2.K(t10);
                }
                i10++;
            }
            if (!this.f6099j) {
                this.f6100k = false;
                for (int i11 = 0; i11 < eVar.L(); i11++) {
                    long t11 = eVar.t(i11);
                    if (eVar2.f16553i) {
                        eVar2.f();
                    }
                    boolean z11 = true;
                    if (i.q(eVar2.f16554j, eVar2.f16556l, t11) >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        Fragment fragment = (Fragment) eVar.h(t11, null);
                        if (fragment != null && (view = fragment.M) != null && view.getParent() != null) {
                        }
                        z11 = false;
                    }
                    if (!z11) {
                        dVar.add(Long.valueOf(t11));
                    }
                }
            }
            Iterator it = dVar.iterator();
            while (true) {
                g.a aVar = (g.a) it;
                if (aVar.hasNext()) {
                    y(((Long) aVar.next()).longValue());
                } else {
                    return;
                }
            }
        }
    }

    public final Long w(int i10) {
        Long l2 = null;
        int i11 = 0;
        while (true) {
            p.e<Integer> eVar = this.f6097h;
            if (i11 >= eVar.L()) {
                return l2;
            }
            if (eVar.M(i11).intValue() == i10) {
                if (l2 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l2 = Long.valueOf(eVar.t(i11));
            }
            i11++;
        }
    }

    public final void x(final f fVar) {
        Fragment fragment = (Fragment) this.f6095f.h(fVar.f5669e, null);
        if (fragment != null) {
            FrameLayout frameLayout = (FrameLayout) fVar.f5666a;
            View view = fragment.M;
            if (!fragment.s() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            boolean s10 = fragment.s();
            z zVar = this.f6094e;
            if (s10 && view == null) {
                zVar.f5284m.f5269a.add(new y.a(new androidx.viewpager2.adapter.b(this, fragment, frameLayout)));
                return;
            } else if (fragment.s() && view.getParent() != null) {
                if (view.getParent() != frameLayout) {
                    s(view, frameLayout);
                    return;
                }
                return;
            } else if (fragment.s()) {
                s(view, frameLayout);
                return;
            } else if (!zVar.O()) {
                zVar.f5284m.f5269a.add(new y.a(new androidx.viewpager2.adapter.b(this, fragment, frameLayout)));
                zVar.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(zVar);
                aVar.e(0, fragment, "f" + fVar.f5669e, 1);
                aVar.j(fragment, Lifecycle.State.STARTED);
                if (!aVar.f5169g) {
                    aVar.f5170h = false;
                    aVar.f5098q.z(aVar, false);
                    this.f6098i.b(false);
                    return;
                }
                throw new IllegalStateException("This transaction is already being added to the back stack");
            } else if (zVar.C) {
                return;
            } else {
                this.f6093d.a(new o() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // androidx.lifecycle.o
                    public final void f(q qVar, Lifecycle.Event event) {
                        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                        if (fragmentStateAdapter.f6094e.O()) {
                            return;
                        }
                        qVar.i0().c(this);
                        f fVar2 = fVar;
                        WeakHashMap<View, v0> weakHashMap = j0.f188a;
                        if (j0.g.b((FrameLayout) fVar2.f5666a)) {
                            fragmentStateAdapter.x(fVar2);
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void y(long j2) {
        Bundle o10;
        ViewParent parent;
        p.e<Fragment> eVar = this.f6095f;
        Fragment.d dVar = null;
        Fragment fragment = (Fragment) eVar.h(j2, null);
        if (fragment == null) {
            return;
        }
        View view = fragment.M;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean t10 = t(j2);
        p.e<Fragment.d> eVar2 = this.f6096g;
        if (!t10) {
            eVar2.K(j2);
        }
        if (!fragment.s()) {
            eVar.K(j2);
            return;
        }
        z zVar = this.f6094e;
        if (zVar.O()) {
            this.f6100k = true;
            return;
        }
        if (fragment.s() && t(j2)) {
            zVar.getClass();
            f0 g10 = zVar.c.g(fragment.f5040m);
            if (g10 != null) {
                Fragment fragment2 = g10.c;
                if (fragment2.equals(fragment)) {
                    if (fragment2.f5036i > -1 && (o10 = g10.o()) != null) {
                        dVar = new Fragment.d(o10);
                    }
                    eVar2.J(j2, dVar);
                }
            }
            zVar.e0(new IllegalStateException(a4.b.k("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
        zVar.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(zVar);
        aVar.i(fragment);
        if (!aVar.f5169g) {
            aVar.f5170h = false;
            aVar.f5098q.z(aVar, false);
            eVar.K(j2);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }
}
