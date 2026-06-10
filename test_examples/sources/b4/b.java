package b4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import l.b;
import v7.g;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public boolean f6380b;
    public Bundle c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6381d;

    /* renamed from: e  reason: collision with root package name */
    public Recreator.a f6382e;

    /* renamed from: a  reason: collision with root package name */
    public final l.b<String, InterfaceC0053b> f6379a = new l.b<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f6383f = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(d dVar);
    }

    /* renamed from: b4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0053b {
        Bundle a();
    }

    public final Bundle a(String str) {
        g.f(str, "key");
        if (this.f6381d) {
            Bundle bundle = this.c;
            if (bundle != null) {
                Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
                Bundle bundle3 = this.c;
                if (bundle3 != null) {
                    bundle3.remove(str);
                }
                Bundle bundle4 = this.c;
                boolean z10 = false;
                if (bundle4 != null && !bundle4.isEmpty()) {
                    z10 = true;
                }
                if (!z10) {
                    this.c = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final InterfaceC0053b b() {
        Map.Entry entry;
        InterfaceC0053b interfaceC0053b;
        Iterator<Map.Entry<String, InterfaceC0053b>> it = this.f6379a.iterator();
        do {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            entry = (Map.Entry) eVar.next();
            g.e(entry, "components");
            interfaceC0053b = (InterfaceC0053b) entry.getValue();
        } while (!g.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC0053b;
    }

    public final void c(String str, InterfaceC0053b interfaceC0053b) {
        g.f(str, "key");
        g.f(interfaceC0053b, "provider");
        if (!(this.f6379a.d(str, interfaceC0053b) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        if (this.f6383f) {
            Recreator.a aVar = this.f6382e;
            if (aVar == null) {
                aVar = new Recreator.a(this);
            }
            this.f6382e = aVar;
            try {
                j.a.class.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar2 = this.f6382e;
                if (aVar2 != null) {
                    aVar2.f6062a.add(j.a.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + j.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
