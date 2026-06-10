package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.z;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.noto.R;

/* loaded from: classes.dex */
public class m extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: d0  reason: collision with root package name */
    public Handler f5209d0;

    /* renamed from: e0  reason: collision with root package name */
    public final a f5210e0;

    /* renamed from: f0  reason: collision with root package name */
    public final b f5211f0;

    /* renamed from: g0  reason: collision with root package name */
    public final c f5212g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f5213h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f5214i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f5215j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f5216k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f5217l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f5218m0;

    /* renamed from: n0  reason: collision with root package name */
    public final d f5219n0;

    /* renamed from: o0  reason: collision with root package name */
    public Dialog f5220o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f5221p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f5222q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f5223r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f5224s0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            m mVar = m.this;
            mVar.f5212g0.onDismiss(mVar.f5220o0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(DialogInterface dialogInterface) {
            m mVar = m.this;
            Dialog dialog = mVar.f5220o0;
            if (dialog != null) {
                mVar.onCancel(dialog);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(DialogInterface dialogInterface) {
            m mVar = m.this;
            Dialog dialog = mVar.f5220o0;
            if (dialog != null) {
                mVar.onDismiss(dialog);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements androidx.lifecycle.w<androidx.lifecycle.q> {
        public d() {
        }

        @Override // androidx.lifecycle.w
        @SuppressLint({"SyntheticAccessor"})
        public final void b(androidx.lifecycle.q qVar) {
            if (qVar != null) {
                m mVar = m.this;
                if (mVar.f5216k0) {
                    View T = mVar.T();
                    if (T.getParent() == null) {
                        if (mVar.f5220o0 != null) {
                            if (z.K(3)) {
                                Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + mVar.f5220o0);
                            }
                            mVar.f5220o0.setContentView(T);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends androidx.datastore.preferences.protobuf.k {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ androidx.datastore.preferences.protobuf.k f5229i;

        public e(Fragment.a aVar) {
            this.f5229i = aVar;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final View C0(int i10) {
            androidx.datastore.preferences.protobuf.k kVar = this.f5229i;
            if (kVar.F0()) {
                return kVar.C0(i10);
            }
            Dialog dialog = m.this.f5220o0;
            if (dialog != null) {
                return dialog.findViewById(i10);
            }
            return null;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final boolean F0() {
            if (!this.f5229i.F0() && !m.this.f5224s0) {
                return false;
            }
            return true;
        }
    }

    public m() {
        this.f5210e0 = new a();
        this.f5211f0 = new b();
        this.f5212g0 = new c();
        this.f5213h0 = 0;
        this.f5214i0 = 0;
        this.f5215j0 = true;
        this.f5216k0 = true;
        this.f5217l0 = -1;
        this.f5219n0 = new d();
        this.f5224s0 = false;
    }

    public m(int i10) {
        super(i10);
        this.f5210e0 = new a();
        this.f5211f0 = new b();
        this.f5212g0 = new c();
        this.f5213h0 = 0;
        this.f5214i0 = 0;
        this.f5215j0 = true;
        this.f5216k0 = true;
        this.f5217l0 = -1;
        this.f5219n0 = new d();
        this.f5224s0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater A(Bundle bundle) {
        StringBuilder sb;
        LayoutInflater A = super.A(bundle);
        boolean z10 = this.f5216k0;
        if (z10 && !this.f5218m0) {
            if (z10 && !this.f5224s0) {
                try {
                    this.f5218m0 = true;
                    Dialog c0 = c0();
                    this.f5220o0 = c0;
                    if (this.f5216k0) {
                        e0(c0, this.f5213h0);
                        Context j2 = j();
                        if (j2 instanceof Activity) {
                            this.f5220o0.setOwnerActivity((Activity) j2);
                        }
                        this.f5220o0.setCancelable(this.f5215j0);
                        this.f5220o0.setOnCancelListener(this.f5211f0);
                        this.f5220o0.setOnDismissListener(this.f5212g0);
                        this.f5224s0 = true;
                    } else {
                        this.f5220o0 = null;
                    }
                    this.f5218m0 = false;
                } catch (Throwable th) {
                    this.f5218m0 = false;
                    throw th;
                }
            }
            if (z.K(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f5220o0;
            if (dialog != null) {
                return A.cloneInContext(dialog.getContext());
            }
            return A;
        }
        if (z.K(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f5216k0) {
                sb = new StringBuilder("mShowsDialog = false: ");
            } else {
                sb = new StringBuilder("mCreatingDialog = true: ");
            }
            sb.append(str);
            Log.d("FragmentManager", sb.toString());
        }
        return A;
    }

    @Override // androidx.fragment.app.Fragment
    public void F(Bundle bundle) {
        Dialog dialog = this.f5220o0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f5213h0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f5214i0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f5215j0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f5216k0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f5217l0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void G() {
        this.K = true;
        Dialog dialog = this.f5220o0;
        if (dialog != null) {
            this.f5221p0 = false;
            dialog.show();
            View decorView = this.f5220o0.getWindow().getDecorView();
            ViewTreeLifecycleOwner.b(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            ViewTreeSavedStateRegistryOwner.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void H() {
        this.K = true;
        Dialog dialog = this.f5220o0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void J(Bundle bundle) {
        Bundle bundle2;
        this.K = true;
        if (this.f5220o0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f5220o0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.K(layoutInflater, viewGroup, bundle);
        if (this.M != null || this.f5220o0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f5220o0.onRestoreInstanceState(bundle2);
    }

    public void Z() {
        a0(false, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final androidx.datastore.preferences.protobuf.k a() {
        return new e(new Fragment.a());
    }

    public final void a0(boolean z10, boolean z11) {
        if (this.f5222q0) {
            return;
        }
        this.f5222q0 = true;
        this.f5223r0 = false;
        Dialog dialog = this.f5220o0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f5220o0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f5209d0.getLooper()) {
                    onDismiss(this.f5220o0);
                } else {
                    this.f5209d0.post(this.f5210e0);
                }
            }
        }
        this.f5221p0 = true;
        if (this.f5217l0 >= 0) {
            z l2 = l();
            int i10 = this.f5217l0;
            if (i10 >= 0) {
                l2.w(new z.n(null, i10), false);
                this.f5217l0 = -1;
                return;
            }
            throw new IllegalArgumentException(androidx.activity.e.g("Bad id: ", i10));
        }
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(l());
        aVar.i(this);
        if (z10) {
            aVar.d(true);
        } else {
            aVar.d(false);
        }
    }

    public int b0() {
        return this.f5214i0;
    }

    public Dialog c0() {
        if (z.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(S(), b0());
    }

    public final Dialog d0() {
        Dialog dialog = this.f5220o0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void e0(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public final void f0(z zVar, String str) {
        this.f5222q0 = false;
        this.f5223r0 = true;
        zVar.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(zVar);
        aVar.e(0, this, str, 1);
        aVar.d(false);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f5221p0) {
            return;
        }
        if (z.K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        a0(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void u(Context context) {
        super.u(context);
        this.W.e(this.f5219n0);
        if (!this.f5223r0) {
            this.f5222q0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void w(Bundle bundle) {
        super.w(bundle);
        this.f5209d0 = new Handler();
        this.f5216k0 = this.E == 0;
        if (bundle != null) {
            this.f5213h0 = bundle.getInt("android:style", 0);
            this.f5214i0 = bundle.getInt("android:theme", 0);
            this.f5215j0 = bundle.getBoolean("android:cancelable", true);
            this.f5216k0 = bundle.getBoolean("android:showsDialog", this.f5216k0);
            this.f5217l0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void y() {
        this.K = true;
        Dialog dialog = this.f5220o0;
        if (dialog != null) {
            this.f5221p0 = true;
            dialog.setOnDismissListener(null);
            this.f5220o0.dismiss();
            if (!this.f5222q0) {
                onDismiss(this.f5220o0);
            }
            this.f5220o0 = null;
            this.f5224s0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void z() {
        this.K = true;
        if (!this.f5223r0 && !this.f5222q0) {
            this.f5222q0 = true;
        }
        this.W.h(this.f5219n0);
    }
}
