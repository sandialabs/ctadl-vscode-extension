package androidx.navigation.fragment;

import a1.c;
import a4.b;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.m;
import androidx.fragment.app.s;
import androidx.fragment.app.z;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p;
import androidx.navigation.NavController;
import androidx.navigation.i;
import androidx.navigation.j;
import androidx.navigation.k;
import androidx.navigation.n;
import androidx.navigation.r;
import androidx.navigation.w;
import androidx.navigation.x;
import androidx.navigation.y;
import com.noto.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class NavHostFragment extends Fragment {

    /* renamed from: d0  reason: collision with root package name */
    public r f5464d0;

    /* renamed from: e0  reason: collision with root package name */
    public Boolean f5465e0 = null;

    /* renamed from: f0  reason: collision with root package name */
    public View f5466f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f5467g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f5468h0;

    public static NavController Z(Fragment fragment) {
        Dialog dialog;
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.C) {
            if (fragment2 instanceof NavHostFragment) {
                r rVar = ((NavHostFragment) fragment2).f5464d0;
                if (rVar != null) {
                    return rVar;
                }
                throw new IllegalStateException("NavController is not available before onCreate()");
            }
            Fragment fragment3 = fragment2.l().f5289s;
            if (fragment3 instanceof NavHostFragment) {
                r rVar2 = ((NavHostFragment) fragment3).f5464d0;
                if (rVar2 != null) {
                    return rVar2;
                }
                throw new IllegalStateException("NavController is not available before onCreate()");
            }
        }
        View view = fragment.M;
        if (view != null) {
            return w.a(view);
        }
        if (fragment instanceof m) {
            dialog = ((m) fragment).f5220o0;
        } else {
            dialog = null;
        }
        if (dialog != null && dialog.getWindow() != null) {
            return w.a(dialog.getWindow().getDecorView());
        }
        throw new IllegalStateException(b.k("Fragment ", fragment, " does not have a NavController set"));
    }

    @Override // androidx.fragment.app.Fragment
    public final void B(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.B(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.c);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f5467g0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a1.b.f33j);
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f5468h0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void D(boolean z10) {
        r rVar = this.f5464d0;
        if (rVar != null) {
            rVar.f5446o = z10;
            rVar.o();
            return;
        }
        this.f5465e0 = Boolean.valueOf(z10);
    }

    @Override // androidx.fragment.app.Fragment
    public final void F(Bundle bundle) {
        Bundle bundle2;
        r rVar = this.f5464d0;
        rVar.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle3 = new Bundle();
        for (Map.Entry<String, x<? extends n>> entry : rVar.f5443k.f5557a.entrySet()) {
            String key = entry.getKey();
            Bundle d5 = entry.getValue().d();
            if (d5 != null) {
                arrayList.add(key);
                bundle3.putBundle(key, d5);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle2 = new Bundle();
            bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle3);
        } else {
            bundle2 = null;
        }
        ArrayDeque arrayDeque = rVar.f5440h;
        if (!arrayDeque.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[arrayDeque.size()];
            Iterator it = arrayDeque.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                parcelableArr[i10] = new j((i) it.next());
                i10++;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (rVar.f5439g) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", rVar.f5439g);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.f5468h0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i11 = this.f5467g0;
        if (i11 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i11);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void I(View view) {
        if (view instanceof ViewGroup) {
            view.setTag(R.id.nav_controller_view_tag, this.f5464d0);
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                this.f5466f0 = view2;
                if (view2.getId() == this.D) {
                    this.f5466f0.setTag(R.id.nav_controller_view_tag, this.f5464d0);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
    }

    @Override // androidx.fragment.app.Fragment
    public final void u(Context context) {
        super.u(context);
        if (this.f5468h0) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(l());
            aVar.k(this);
            aVar.d(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void v(Fragment fragment) {
        y yVar = this.f5464d0.f5443k;
        yVar.getClass();
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) yVar.c(y.b(DialogFragmentNavigator.class));
        if (dialogFragmentNavigator.f5461d.remove(fragment.F)) {
            fragment.U.a(dialogFragmentNavigator.f5462e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void w(Bundle bundle) {
        boolean z10;
        Bundle bundle2;
        r rVar = new r(S());
        this.f5464d0 = rVar;
        if (this != rVar.f5441i) {
            rVar.f5441i = this;
            this.U.a(rVar.f5445m);
        }
        r rVar2 = this.f5464d0;
        s R = R();
        if (rVar2.f5441i != null) {
            NavController.a aVar = rVar2.n;
            Iterator<androidx.activity.a> it = aVar.f463b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            R.f417p.a(rVar2.f5441i, aVar);
            androidx.lifecycle.r i02 = rVar2.f5441i.i0();
            p pVar = rVar2.f5445m;
            i02.c(pVar);
            rVar2.f5441i.i0().a(pVar);
            r rVar3 = this.f5464d0;
            Boolean bool = this.f5465e0;
            int i10 = 0;
            if (bool != null && bool.booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            rVar3.f5446o = z10;
            rVar3.o();
            Bundle bundle3 = null;
            this.f5465e0 = null;
            r rVar4 = this.f5464d0;
            m0 X = X();
            k kVar = rVar4.f5442j;
            k.a aVar2 = k.f5494e;
            if (kVar != ((k) new k0(X, aVar2).a(k.class))) {
                if (rVar4.f5440h.isEmpty()) {
                    rVar4.f5442j = (k) new k0(X, aVar2).a(k.class);
                } else {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                }
            }
            r rVar5 = this.f5464d0;
            rVar5.f5443k.a(new DialogFragmentNavigator(S(), h()));
            y yVar = rVar5.f5443k;
            Context S = S();
            z h10 = h();
            int i11 = this.D;
            if (i11 == 0 || i11 == -1) {
                i11 = R.id.nav_host_fragment_container;
            }
            yVar.a(new a(S, h10, i11));
            if (bundle != null) {
                bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
                if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                    this.f5468h0 = true;
                    androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(l());
                    aVar3.k(this);
                    aVar3.d(false);
                }
                this.f5467g0 = bundle.getInt("android-support-nav:fragment:graphId");
            } else {
                bundle2 = null;
            }
            if (bundle2 != null) {
                r rVar6 = this.f5464d0;
                bundle2.setClassLoader(rVar6.f5434a.getClassLoader());
                rVar6.f5437e = bundle2.getBundle("android-support-nav:controller:navigatorState");
                rVar6.f5438f = bundle2.getParcelableArray("android-support-nav:controller:backStack");
                rVar6.f5439g = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
            }
            int i12 = this.f5467g0;
            if (i12 != 0) {
                r rVar7 = this.f5464d0;
                if (rVar7.c == null) {
                    rVar7.c = new androidx.navigation.s(rVar7.f5434a, rVar7.f5443k);
                }
                rVar7.n(rVar7.c.c(i12), null);
            } else {
                Bundle bundle4 = this.n;
                if (bundle4 != null) {
                    i10 = bundle4.getInt("android-support-nav:fragment:graphId");
                }
                if (bundle4 != null) {
                    bundle3 = bundle4.getBundle("android-support-nav:fragment:startDestinationArgs");
                }
                if (i10 != 0) {
                    r rVar8 = this.f5464d0;
                    if (rVar8.c == null) {
                        rVar8.c = new androidx.navigation.s(rVar8.f5434a, rVar8.f5443k);
                    }
                    rVar8.n(rVar8.c.c(i10), bundle3);
                }
            }
            super.w(bundle);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        int i10 = this.D;
        if (i10 == 0 || i10 == -1) {
            i10 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i10);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void y() {
        this.K = true;
        View view = this.f5466f0;
        if (view != null && w.a(view) == this.f5464d0) {
            this.f5466f0.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f5466f0 = null;
    }
}
