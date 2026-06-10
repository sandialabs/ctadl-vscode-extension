package androidx.navigation;

import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class k extends i0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f5494e = new a();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<UUID, m0> f5495d = new HashMap<>();

    /* loaded from: classes.dex */
    public class a implements k0.b {
        @Override // androidx.lifecycle.k0.b
        public final <T extends i0> T a(Class<T> cls) {
            return new k();
        }

        @Override // androidx.lifecycle.k0.b
        public final i0 b(Class cls, t3.c cVar) {
            return a(cls);
        }
    }

    @Override // androidx.lifecycle.i0
    public final void b() {
        HashMap<UUID, m0> hashMap = this.f5495d;
        for (m0 m0Var : hashMap.values()) {
            m0Var.a();
        }
        hashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.f5495d.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
