package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.d0;
import b4.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class SavedStateHandleSupport {

    /* renamed from: a  reason: collision with root package name */
    public static final b f5353a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f5354b = new c();
    public static final a c = new a();

    /* loaded from: classes.dex */
    public static final class a {
    }

    /* loaded from: classes.dex */
    public static final class b {
    }

    /* loaded from: classes.dex */
    public static final class c {
    }

    public static final d0 a(t3.c cVar) {
        SavedStateHandlesProvider savedStateHandlesProvider;
        Bundle bundle;
        b bVar = f5353a;
        LinkedHashMap linkedHashMap = cVar.f17562a;
        b4.d dVar = (b4.d) linkedHashMap.get(bVar);
        if (dVar != null) {
            n0 n0Var = (n0) linkedHashMap.get(f5354b);
            if (n0Var != null) {
                Bundle bundle2 = (Bundle) linkedHashMap.get(c);
                String str = (String) linkedHashMap.get(l0.f5409a);
                if (str != null) {
                    b.InterfaceC0053b b5 = dVar.e().b();
                    if (b5 instanceof SavedStateHandlesProvider) {
                        savedStateHandlesProvider = (SavedStateHandlesProvider) b5;
                    } else {
                        savedStateHandlesProvider = null;
                    }
                    if (savedStateHandlesProvider != null) {
                        e0 b10 = b(n0Var);
                        d0 d0Var = (d0) b10.f5382d.get(str);
                        if (d0Var == null) {
                            Class<? extends Object>[] clsArr = d0.f5375f;
                            boolean z10 = true;
                            if (!savedStateHandlesProvider.f5357b) {
                                savedStateHandlesProvider.c = savedStateHandlesProvider.f5356a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                                savedStateHandlesProvider.f5357b = true;
                                e0 e0Var = (e0) savedStateHandlesProvider.f5358d.getValue();
                            }
                            Bundle bundle3 = savedStateHandlesProvider.c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = savedStateHandlesProvider.c;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = savedStateHandlesProvider.c;
                            if (bundle5 == null || !bundle5.isEmpty()) {
                                z10 = false;
                            }
                            if (z10) {
                                savedStateHandlesProvider.c = null;
                            }
                            d0 a10 = d0.a.a(bundle, bundle2);
                            b10.f5382d.put(str, a10);
                            return a10;
                        }
                        return d0Var;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final e0 b(n0 n0Var) {
        v7.g.f(n0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        SavedStateHandleSupport$savedStateHandlesVM$1$1 savedStateHandleSupport$savedStateHandlesVM$1$1 = SavedStateHandleSupport$savedStateHandlesVM$1$1.f5355j;
        c8.b a10 = v7.i.a(e0.class);
        v7.g.f(a10, "clazz");
        v7.g.f(savedStateHandleSupport$savedStateHandlesVM$1$1, "initializer");
        arrayList.add(new t3.d(a1.c.y0(a10), savedStateHandleSupport$savedStateHandlesVM$1$1));
        t3.d[] dVarArr = (t3.d[]) arrayList.toArray(new t3.d[0]);
        return (e0) new k0(n0Var, new t3.b((t3.d[]) Arrays.copyOf(dVarArr, dVarArr.length))).b(e0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
