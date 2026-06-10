package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import b4.b;
import b4.d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/o;", "a", "savedstate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class Recreator implements o {

    /* renamed from: i  reason: collision with root package name */
    public final d f6061i;

    /* loaded from: classes.dex */
    public static final class a implements b.InterfaceC0053b {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashSet f6062a;

        public a(b bVar) {
            g.f(bVar, "registry");
            this.f6062a = new LinkedHashSet();
            bVar.c("androidx.savedstate.Restarter", this);
        }

        @Override // b4.b.InterfaceC0053b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f6062a));
            return bundle;
        }
    }

    public Recreator(d dVar) {
        g.f(dVar, "owner");
        this.f6061i = dVar;
    }

    @Override // androidx.lifecycle.o
    public final void f(q qVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            qVar.i0().c(this);
            d dVar = this.f6061i;
            Bundle a10 = dVar.e().a("androidx.savedstate.Restarter");
            if (a10 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(b.a.class);
                        g.e(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                g.e(newInstance, "{\n                constr…wInstance()\n            }");
                                ((b.a) newInstance).a(dVar);
                            } catch (Exception e10) {
                                throw new RuntimeException("Failed to instantiate " + str, e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(a4.b.m("Class ", str, " wasn't found"), e12);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
