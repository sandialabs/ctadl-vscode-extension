package com.noto.app.filtered;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "searchTerm", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.filtered.FilteredFragment$setupState$5", f = "FilteredFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FilteredFragment$setupState$5 extends SuspendLambda implements p<String, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8267m;
    public final /* synthetic */ FilteredFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilteredFragment$setupState$5(FilteredFragment filteredFragment, p7.c<? super FilteredFragment$setupState$5> cVar) {
        super(2, cVar);
        this.n = filteredFragment;
    }

    @Override // u7.p
    public final Object R(String str, p7.c<? super n> cVar) {
        return ((FilteredFragment$setupState$5) a(str, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        FilteredFragment$setupState$5 filteredFragment$setupState$5 = new FilteredFragment$setupState$5(this.n, cVar);
        filteredFragment$setupState$5.f8267m = obj;
        return filteredFragment$setupState$5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        String str = (String) this.f8267m;
        int i10 = FilteredFragment.f8233f0;
        FilteredViewModel Z = this.n.Z();
        Z.getClass();
        g.f(str, "searchTerm");
        Z.f8299p.setValue(str);
        return n.f16010a;
    }
}
