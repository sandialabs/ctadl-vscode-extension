package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.k0;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.noto.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import n2.a;
import t3.a;
import u3.a;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.q, androidx.lifecycle.n0, androidx.lifecycle.i, b4.d {
    public static final Object c0 = new Object();
    public w<?> A;
    public a0 B;
    public Fragment C;
    public int D;
    public int E;
    public String F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ViewGroup L;
    public View M;
    public boolean N;
    public boolean O;
    public b P;
    public boolean Q;
    public LayoutInflater R;
    public boolean S;
    public Lifecycle.State T;
    public androidx.lifecycle.r U;
    public o0 V;
    public final androidx.lifecycle.v<androidx.lifecycle.q> W;
    public androidx.lifecycle.f0 X;
    public b4.c Y;
    public final int Z;

    /* renamed from: a0  reason: collision with root package name */
    public final AtomicInteger f5034a0;

    /* renamed from: b0  reason: collision with root package name */
    public final ArrayList<c> f5035b0;

    /* renamed from: i  reason: collision with root package name */
    public int f5036i;

    /* renamed from: j  reason: collision with root package name */
    public Bundle f5037j;

    /* renamed from: k  reason: collision with root package name */
    public SparseArray<Parcelable> f5038k;

    /* renamed from: l  reason: collision with root package name */
    public Bundle f5039l;

    /* renamed from: m  reason: collision with root package name */
    public String f5040m;
    public Bundle n;

    /* renamed from: o  reason: collision with root package name */
    public Fragment f5041o;

    /* renamed from: p  reason: collision with root package name */
    public String f5042p;

    /* renamed from: q  reason: collision with root package name */
    public int f5043q;

    /* renamed from: r  reason: collision with root package name */
    public Boolean f5044r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5045s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5046t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5047u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5048v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5049w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5050x;

    /* renamed from: y  reason: collision with root package name */
    public int f5051y;

    /* renamed from: z  reason: collision with root package name */
    public z f5052z;

    /* loaded from: classes.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public class a extends androidx.datastore.preferences.protobuf.k {
        public a() {
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final View C0(int i10) {
            Fragment fragment = Fragment.this;
            View view = fragment.M;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a view");
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final boolean F0() {
            return Fragment.this.M != null;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5055a;

        /* renamed from: b  reason: collision with root package name */
        public int f5056b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f5057d;

        /* renamed from: e  reason: collision with root package name */
        public int f5058e;

        /* renamed from: f  reason: collision with root package name */
        public int f5059f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<String> f5060g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<String> f5061h;

        /* renamed from: i  reason: collision with root package name */
        public Object f5062i = null;

        /* renamed from: j  reason: collision with root package name */
        public Object f5063j;

        /* renamed from: k  reason: collision with root package name */
        public Object f5064k;

        /* renamed from: l  reason: collision with root package name */
        public Object f5065l;

        /* renamed from: m  reason: collision with root package name */
        public final Object f5066m;
        public float n;

        /* renamed from: o  reason: collision with root package name */
        public View f5067o;

        public b() {
            Object obj = Fragment.c0;
            this.f5063j = obj;
            this.f5064k = null;
            this.f5065l = obj;
            this.f5066m = obj;
            this.n = 1.0f;
            this.f5067o = null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a();
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        public final Bundle f5068i;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new d[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }
        }

        public d(Bundle bundle) {
            this.f5068i = bundle;
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f5068i = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f5068i);
        }
    }

    public Fragment() {
        this.f5036i = -1;
        this.f5040m = UUID.randomUUID().toString();
        this.f5042p = null;
        this.f5044r = null;
        this.B = new a0();
        this.J = true;
        this.O = true;
        this.T = Lifecycle.State.RESUMED;
        this.W = new androidx.lifecycle.v<>();
        this.f5034a0 = new AtomicInteger();
        this.f5035b0 = new ArrayList<>();
        this.U = new androidx.lifecycle.r(this);
        this.Y = new b4.c(this);
        this.X = null;
    }

    public Fragment(int i10) {
        this();
        this.Z = i10;
    }

    public LayoutInflater A(Bundle bundle) {
        w<?> wVar = this.A;
        if (wVar != null) {
            LayoutInflater N0 = wVar.N0();
            N0.setFactory2(this.B.f5277f);
            return N0;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void B(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.K = true;
        w<?> wVar = this.A;
        if (wVar == null) {
            activity = null;
        } else {
            activity = wVar.f5262i;
        }
        if (activity != null) {
            this.K = true;
        }
    }

    public void C() {
        this.K = true;
    }

    public void D(boolean z10) {
    }

    public void E() {
        this.K = true;
    }

    public void F(Bundle bundle) {
    }

    public void G() {
        this.K = true;
    }

    public void H() {
        this.K = true;
    }

    public void I(View view) {
    }

    public void J(Bundle bundle) {
        this.K = true;
    }

    public void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.B.Q();
        boolean z10 = true;
        this.f5050x = true;
        this.V = new o0(this, X());
        View x3 = x(layoutInflater, viewGroup, bundle);
        this.M = x3;
        if (x3 != null) {
            this.V.b();
            ViewTreeLifecycleOwner.b(this.M, this.V);
            View view = this.M;
            o0 o0Var = this.V;
            v7.g.f(view, "<this>");
            view.setTag(R.id.view_tree_view_model_store_owner, o0Var);
            ViewTreeSavedStateRegistryOwner.b(this.M, this.V);
            this.W.i(this.V);
            return;
        }
        if (this.V.f5244l == null) {
            z10 = false;
        }
        if (!z10) {
            this.V = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final void L() {
        boolean z10;
        this.B.t(1);
        if (this.M != null) {
            o0 o0Var = this.V;
            o0Var.b();
            if (o0Var.f5244l.f5413d.compareTo(Lifecycle.State.CREATED) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.V.a(Lifecycle.Event.ON_DESTROY);
            }
        }
        this.f5036i = 1;
        this.K = false;
        y();
        if (this.K) {
            p.i<a.C0228a> iVar = ((a.b) new androidx.lifecycle.k0(X(), a.b.f17779e).a(a.b.class)).f17780d;
            int h10 = iVar.h();
            for (int i10 = 0; i10 < h10; i10++) {
                iVar.i(i10).getClass();
            }
            this.f5050x = false;
            return;
        }
        throw new SuperNotCalledException(a4.b.k("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public final void M() {
        onLowMemory();
        this.B.m();
    }

    public final void N(boolean z10) {
        this.B.n(z10);
    }

    public final void O(boolean z10) {
        this.B.r(z10);
    }

    public final boolean P() {
        if (this.G) {
            return false;
        }
        return false | this.B.s();
    }

    public final androidx.activity.result.c Q(androidx.activity.result.b bVar, b.a aVar) {
        n nVar = new n(this);
        if (this.f5036i <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            o oVar = new o(this, nVar, atomicReference, aVar, bVar);
            if (this.f5036i >= 0) {
                oVar.a();
            } else {
                this.f5035b0.add(oVar);
            }
            return new p(atomicReference);
        }
        throw new IllegalStateException(a4.b.k("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    public final s R() {
        s c10 = c();
        if (c10 != null) {
            return c10;
        }
        throw new IllegalStateException(a4.b.k("Fragment ", this, " not attached to an activity."));
    }

    public final Context S() {
        Context j2 = j();
        if (j2 != null) {
            return j2;
        }
        throw new IllegalStateException(a4.b.k("Fragment ", this, " not attached to a context."));
    }

    public final View T() {
        View view = this.M;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a4.b.k("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void U(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.B.V(parcelable);
            a0 a0Var = this.B;
            a0Var.A = false;
            a0Var.B = false;
            a0Var.H.f5130i = false;
            a0Var.t(1);
        }
    }

    public final void V(int i10, int i11, int i12, int i13) {
        if (this.P == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        b().f5056b = i10;
        b().c = i11;
        b().f5057d = i12;
        b().f5058e = i13;
    }

    public final void W(Bundle bundle) {
        boolean O;
        z zVar = this.f5052z;
        if (zVar != null) {
            if (zVar == null) {
                O = false;
            } else {
                O = zVar.O();
            }
            if (O) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.n = bundle;
    }

    @Override // androidx.lifecycle.n0
    public final androidx.lifecycle.m0 X() {
        if (this.f5052z != null) {
            if (k() != 1) {
                HashMap<String, androidx.lifecycle.m0> hashMap = this.f5052z.H.f5127f;
                androidx.lifecycle.m0 m0Var = hashMap.get(this.f5040m);
                if (m0Var == null) {
                    androidx.lifecycle.m0 m0Var2 = new androidx.lifecycle.m0();
                    hashMap.put(this.f5040m, m0Var2);
                    return m0Var2;
                }
                return m0Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final void Y(@SuppressLint({"UnknownNullness"}) Intent intent) {
        w<?> wVar = this.A;
        if (wVar != null) {
            Object obj = n2.a.f16069a;
            a.C0190a.b(wVar.f5263j, intent, null);
            return;
        }
        throw new IllegalStateException(a4.b.k("Fragment ", this, " not attached to Activity"));
    }

    public androidx.datastore.preferences.protobuf.k a() {
        return new a();
    }

    public final b b() {
        if (this.P == null) {
            this.P = new b();
        }
        return this.P;
    }

    public final s c() {
        w<?> wVar = this.A;
        if (wVar == null) {
            return null;
        }
        return (s) wVar.f5262i;
    }

    @Override // b4.d
    public final b4.b e() {
        return this.Y.f6385b;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.lifecycle.i
    public final k0.b f() {
        Application application;
        if (this.f5052z != null) {
            if (this.X == null) {
                Context applicationContext = S().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && z.K(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + S().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.X = new androidx.lifecycle.f0(application, this, this.n);
            }
            return this.X;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.i
    public final t3.a g() {
        return a.C0224a.f17563b;
    }

    public final z h() {
        if (this.A != null) {
            return this.B;
        }
        throw new IllegalStateException(a4.b.k("Fragment ", this, " has not been attached yet."));
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.lifecycle.q
    public final androidx.lifecycle.r i0() {
        return this.U;
    }

    public final Context j() {
        w<?> wVar = this.A;
        if (wVar == null) {
            return null;
        }
        return wVar.f5263j;
    }

    public final int k() {
        Lifecycle.State state = this.T;
        if (state != Lifecycle.State.INITIALIZED && this.C != null) {
            return Math.min(state.ordinal(), this.C.k());
        }
        return state.ordinal();
    }

    public final z l() {
        z zVar = this.f5052z;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException(a4.b.k("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Object m() {
        b bVar = this.P;
        Object obj = null;
        if (bVar == null) {
            return null;
        }
        Object obj2 = bVar.f5065l;
        if (obj2 == c0) {
            if (bVar != null) {
                obj = bVar.f5064k;
            }
            return obj;
        }
        return obj2;
    }

    public final Resources n() {
        return S().getResources();
    }

    public final Object o() {
        b bVar = this.P;
        Object obj = null;
        if (bVar == null) {
            return null;
        }
        Object obj2 = bVar.f5063j;
        if (obj2 == c0) {
            if (bVar != null) {
                obj = bVar.f5062i;
            }
            return obj;
        }
        return obj2;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.K = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        R().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.K = true;
    }

    public final Object p() {
        Object obj;
        b bVar = this.P;
        if (bVar != null && (obj = bVar.f5066m) != c0) {
            return obj;
        }
        return null;
    }

    public final String q(int i10) {
        return n().getString(i10);
    }

    public final o0 r() {
        o0 o0Var = this.V;
        if (o0Var != null) {
            return o0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final boolean s() {
        return this.A != null && this.f5045s;
    }

    @Deprecated
    public void t(int i10, int i11, Intent intent) {
        if (z.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f5040m);
        if (this.D != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.D));
        }
        if (this.F != null) {
            sb.append(" tag=");
            sb.append(this.F);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(Context context) {
        Activity activity;
        this.K = true;
        w<?> wVar = this.A;
        if (wVar == null) {
            activity = null;
        } else {
            activity = wVar.f5262i;
        }
        if (activity != null) {
            this.K = true;
        }
    }

    @Deprecated
    public void v(Fragment fragment) {
    }

    public void w(Bundle bundle) {
        boolean z10;
        this.K = true;
        U(bundle);
        a0 a0Var = this.B;
        if (a0Var.f5285o >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            a0Var.A = false;
            a0Var.B = false;
            a0Var.H.f5130i = false;
            a0Var.t(1);
        }
    }

    public View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.Z;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void y() {
        this.K = true;
    }

    public void z() {
        this.K = true;
    }
}
