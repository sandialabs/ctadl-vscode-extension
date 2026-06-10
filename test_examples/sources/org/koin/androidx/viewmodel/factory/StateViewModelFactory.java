package org.koin.androidx.viewmodel.factory;

import android.os.Bundle;
import androidx.lifecycle.a;
import androidx.lifecycle.d0;
import androidx.lifecycle.i0;
import b4.d;
import c8.b;
import v7.g;

/* loaded from: classes.dex */
public final class StateViewModelFactory<T extends i0> extends a {

    /* renamed from: d  reason: collision with root package name */
    public final org.koin.core.scope.a f16495d;

    /* renamed from: e  reason: collision with root package name */
    public final m1.a f16496e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StateViewModelFactory(org.koin.core.scope.a aVar, m1.a aVar2) {
        super(r0, (Bundle) aVar2.f15902d);
        g.f(aVar, "scope");
        d dVar = (d) aVar2.f15904f;
        if (dVar != null) {
            this.f16495d = aVar;
            this.f16496e = aVar2;
            return;
        }
        throw new IllegalStateException("Can't create SavedStateViewModelFactory without a proper stateRegistryOwner".toString());
    }

    @Override // androidx.lifecycle.a
    public final <T extends i0> T d(String str, Class<T> cls, d0 d0Var) {
        g.f(d0Var, "handle");
        m1.a aVar = this.f16496e;
        StateViewModelFactory$create$1 stateViewModelFactory$create$1 = new StateViewModelFactory$create$1(this, d0Var);
        return (T) this.f16495d.a(stateViewModelFactory$create$1, (b) aVar.f15901b, (kb.a) aVar.c);
    }
}
