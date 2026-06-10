package com.airbnb.epoxy;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import g0.f1;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, d2 = {"Lcom/airbnb/epoxy/PoolReference;", "Landroidx/lifecycle/p;", "Lm7/n;", "onContextDestroyed", "epoxy-adapter_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class PoolReference implements androidx.lifecycle.p {

    /* renamed from: i  reason: collision with root package name */
    public final RecyclerView.r f6605i;

    /* renamed from: j  reason: collision with root package name */
    public final f1 f6606j;

    /* renamed from: k  reason: collision with root package name */
    public final WeakReference<Context> f6607k;

    public PoolReference(Context context, RecyclerView.r rVar, f1 f1Var) {
        v7.g.f(rVar, "viewPool");
        this.f6605i = rVar;
        this.f6606j = f1Var;
        this.f6607k = new WeakReference<>(context);
    }

    @androidx.lifecycle.x(Lifecycle.Event.ON_DESTROY)
    public final void onContextDestroyed() {
        f1 f1Var = this.f6606j;
        f1Var.getClass();
        if (a1.b.i0(this.f6607k.get())) {
            this.f6605i.a();
            f1Var.f11050a.remove(this);
        }
    }
}
