package org.koin.androidx.viewmodel.ext.android;

import a1.c;
import android.content.ComponentCallbacks;
import androidx.lifecycle.i0;
import androidx.lifecycle.n0;
import c8.b;
import v7.g;

/* loaded from: classes.dex */
public final class ViewModelStoreOwnerExtKt {
    public static final <T extends i0> T a(n0 n0Var, kb.a aVar, b<T> bVar, u7.a<? extends jb.a> aVar2) {
        g.f(n0Var, "<this>");
        g.f(bVar, "clazz");
        if (n0Var instanceof ComponentCallbacks) {
            return (T) c.H0(a1.b.V((ComponentCallbacks) n0Var), aVar, new ViewModelStoreOwnerExtKt$getViewModel$1(n0Var), bVar, aVar2);
        }
        org.koin.core.a aVar3 = c.f72i;
        if (aVar3 != null) {
            return (T) c.H0(aVar3.f16502a.f15888b, aVar, new ViewModelStoreOwnerExtKt$getViewModel$2(n0Var), bVar, aVar2);
        }
        throw new IllegalStateException("KoinApplication has not been started".toString());
    }
}
