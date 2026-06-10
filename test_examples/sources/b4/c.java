package b4;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.savedstate.Recreator;
import b4.b;
import java.util.Map;
import l.b;
import v7.g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final d f6384a;

    /* renamed from: b  reason: collision with root package name */
    public final b f6385b = new b();
    public boolean c;

    public c(d dVar) {
        this.f6384a = dVar;
    }

    public final void a() {
        boolean z10;
        d dVar = this.f6384a;
        r i02 = dVar.i0();
        g.e(i02, "owner.lifecycle");
        if (i02.f5413d == Lifecycle.State.INITIALIZED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i02.a(new Recreator(dVar));
            final b bVar = this.f6385b;
            bVar.getClass();
            if (!bVar.f6380b) {
                i02.a(new o() { // from class: b4.a
                    @Override // androidx.lifecycle.o
                    public final void f(q qVar, Lifecycle.Event event) {
                        boolean z11;
                        b bVar2 = b.this;
                        g.f(bVar2, "this$0");
                        if (event == Lifecycle.Event.ON_START) {
                            z11 = true;
                        } else if (event != Lifecycle.Event.ON_STOP) {
                            return;
                        } else {
                            z11 = false;
                        }
                        bVar2.f6383f = z11;
                    }
                });
                bVar.f6380b = true;
                this.c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        boolean z10;
        Bundle bundle2;
        if (!this.c) {
            a();
        }
        r i02 = this.f6384a.i0();
        g.e(i02, "owner.lifecycle");
        if (i02.f5413d.compareTo(Lifecycle.State.STARTED) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            b bVar = this.f6385b;
            if (bVar.f6380b) {
                if (!bVar.f6381d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    bVar.c = bundle2;
                    bVar.f6381d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + i02.f5413d).toString());
    }

    public final void c(Bundle bundle) {
        g.f(bundle, "outBundle");
        b bVar = this.f6385b;
        bVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = bVar.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        l.b<String, b.InterfaceC0053b> bVar2 = bVar.f6379a;
        bVar2.getClass();
        b.d dVar = new b.d();
        bVar2.f15707k.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((b.InterfaceC0053b) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
