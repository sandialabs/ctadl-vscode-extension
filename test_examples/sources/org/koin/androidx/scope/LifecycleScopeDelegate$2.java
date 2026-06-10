package org.koin.androidx.scope;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.x;
import kotlin.Metadata;
import v7.g;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"org/koin/androidx/scope/LifecycleScopeDelegate$2", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/q;", "owner", "Lm7/n;", "onDestroy", "koin-android_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class LifecycleScopeDelegate$2 implements p {
    @x(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy(q qVar) {
        g.f(qVar, "owner");
        throw null;
    }
}
