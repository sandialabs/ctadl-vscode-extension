package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.k0;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c0 extends androidx.lifecycle.i0 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f5124j = new a();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5128g;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, Fragment> f5125d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, c0> f5126e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, androidx.lifecycle.m0> f5127f = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f5129h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5130i = false;

    /* loaded from: classes.dex */
    public class a implements k0.b {
        @Override // androidx.lifecycle.k0.b
        public final <T extends androidx.lifecycle.i0> T a(Class<T> cls) {
            return new c0(true);
        }

        @Override // androidx.lifecycle.k0.b
        public final androidx.lifecycle.i0 b(Class cls, t3.c cVar) {
            return a(cls);
        }
    }

    public c0(boolean z10) {
        this.f5128g = z10;
    }

    @Override // androidx.lifecycle.i0
    public final void b() {
        if (z.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f5129h = true;
    }

    public final void d(Fragment fragment) {
        if (this.f5130i) {
            if (z.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f5125d.remove(fragment.f5040m) != null) && z.K(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            return this.f5125d.equals(c0Var.f5125d) && this.f5126e.equals(c0Var.f5126e) && this.f5127f.equals(c0Var.f5127f);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f5126e.hashCode();
        return this.f5127f.hashCode() + ((hashCode + (this.f5125d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f5125d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f5126e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f5127f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
