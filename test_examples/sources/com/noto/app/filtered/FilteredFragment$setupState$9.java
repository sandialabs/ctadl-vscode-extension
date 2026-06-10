package com.noto.app.filtered;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lm7/n;", "it", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.filtered.FilteredFragment$setupState$9", f = "FilteredFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FilteredFragment$setupState$9 extends SuspendLambda implements p<n, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f8279m;
    public final /* synthetic */ FilteredFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilteredFragment$setupState$9(LinearLayoutManager linearLayoutManager, FilteredFragment filteredFragment, p7.c<? super FilteredFragment$setupState$9> cVar) {
        super(2, cVar);
        this.f8279m = linearLayoutManager;
        this.n = filteredFragment;
    }

    @Override // u7.p
    public final Object R(n nVar, p7.c<? super n> cVar) {
        return ((FilteredFragment$setupState$9) a(nVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new FilteredFragment$setupState$9(this.f8279m, this.n, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        int K;
        b.n1(obj);
        LinearLayoutManager linearLayoutManager = this.f8279m;
        View W0 = linearLayoutManager.W0(0, linearLayoutManager.A(), true, false);
        if (W0 == null) {
            K = -1;
        } else {
            K = RecyclerView.l.K(W0);
        }
        if (K != -1) {
            int i10 = FilteredFragment.f8233f0;
            FilteredViewModel Z = this.n.Z();
            Z.getClass();
            b.M0(a1.b.d0(Z), null, null, new FilteredViewModel$updateScrollingPosition$1(Z, K, null), 3);
        }
        return n.f16010a;
    }
}
