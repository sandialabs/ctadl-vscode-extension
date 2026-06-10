package org.koin.androidx.viewmodel.factory;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.a;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/i0;", "T", "Ljb/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class StateViewModelFactory$create$1 extends Lambda implements a<jb.a> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ StateViewModelFactory<T> f16497j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ d0 f16498k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateViewModelFactory$create$1(StateViewModelFactory<T> stateViewModelFactory, d0 d0Var) {
        super(0);
        this.f16497j = stateViewModelFactory;
        this.f16498k = d0Var;
    }

    @Override // u7.a
    public final jb.a k0() {
        jb.a aVar;
        a aVar2 = this.f16497j.f16496e.f15900a;
        if (aVar2 == null) {
            aVar = null;
        } else {
            aVar = (jb.a) aVar2.k0();
        }
        if (aVar == null) {
            aVar = new jb.a(0);
        }
        d0 d0Var = this.f16498k;
        g.f(d0Var, "value");
        aVar.f12820a.add(0, d0Var);
        return aVar;
    }
}
