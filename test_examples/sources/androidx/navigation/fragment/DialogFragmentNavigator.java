package androidx.navigation.fragment;

import a1.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.activity.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.fragment.app.z;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import androidx.navigation.c;
import androidx.navigation.n;
import androidx.navigation.t;
import androidx.navigation.x;
import java.util.HashSet;

@x.a("dialog")
/* loaded from: classes.dex */
public final class DialogFragmentNavigator extends x<a> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5459a;

    /* renamed from: b  reason: collision with root package name */
    public final z f5460b;
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<String> f5461d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public final o f5462e = new o() { // from class: androidx.navigation.fragment.DialogFragmentNavigator.1
        @Override // androidx.lifecycle.o
        public final void f(q qVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                m mVar = (m) qVar;
                if (mVar.d0().isShowing()) {
                    return;
                }
                NavHostFragment.Z(mVar).k();
            }
        }
    };

    /* loaded from: classes.dex */
    public static class a extends n implements c {

        /* renamed from: q  reason: collision with root package name */
        public String f5463q;

        public a(x<? extends a> xVar) {
            super(xVar);
        }

        @Override // androidx.navigation.n
        public final void t(Context context, AttributeSet attributeSet) {
            super.t(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, b.f29h);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.f5463q = string;
            }
            obtainAttributes.recycle();
        }
    }

    public DialogFragmentNavigator(Context context, z zVar) {
        this.f5459a = context;
        this.f5460b = zVar;
    }

    @Override // androidx.navigation.x
    public final a a() {
        return new a(this);
    }

    @Override // androidx.navigation.x
    public final n b(n nVar, Bundle bundle, t tVar) {
        a aVar = (a) nVar;
        z zVar = this.f5460b;
        if (zVar.O()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String str = aVar.f5463q;
        if (str != null) {
            char charAt = str.charAt(0);
            Context context = this.f5459a;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            v H = zVar.H();
            context.getClassLoader();
            Fragment a10 = H.a(str);
            if (m.class.isAssignableFrom(a10.getClass())) {
                m mVar = (m) a10;
                mVar.W(bundle);
                mVar.U.a(this.f5462e);
                StringBuilder sb = new StringBuilder("androidx-nav-fragment:navigator:dialog:");
                int i10 = this.c;
                this.c = i10 + 1;
                sb.append(i10);
                mVar.f0(zVar, sb.toString());
                return aVar;
            }
            StringBuilder sb2 = new StringBuilder("Dialog destination ");
            String str2 = aVar.f5463q;
            if (str2 != null) {
                throw new IllegalArgumentException(e.k(sb2, str2, " is not an instance of DialogFragment"));
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    @Override // androidx.navigation.x
    public final void c(Bundle bundle) {
        this.c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
        for (int i10 = 0; i10 < this.c; i10++) {
            m mVar = (m) this.f5460b.E(e.g("androidx-nav-fragment:navigator:dialog:", i10));
            if (mVar != null) {
                mVar.U.a(this.f5462e);
            } else {
                HashSet<String> hashSet = this.f5461d;
                hashSet.add("androidx-nav-fragment:navigator:dialog:" + i10);
            }
        }
    }

    @Override // androidx.navigation.x
    public final Bundle d() {
        if (this.c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.c);
        return bundle;
    }

    @Override // androidx.navigation.x
    public final boolean e() {
        if (this.c == 0) {
            return false;
        }
        z zVar = this.f5460b;
        if (zVar.O()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        StringBuilder sb = new StringBuilder("androidx-nav-fragment:navigator:dialog:");
        int i10 = this.c - 1;
        this.c = i10;
        sb.append(i10);
        Fragment E = zVar.E(sb.toString());
        if (E != null) {
            E.U.c(this.f5462e);
            ((m) E).Z();
        }
        return true;
    }
}
