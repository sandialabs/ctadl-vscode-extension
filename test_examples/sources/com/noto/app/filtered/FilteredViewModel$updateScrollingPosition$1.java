package com.noto.app.filtered;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u6.e;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.filtered.FilteredViewModel$updateScrollingPosition$1", f = "FilteredViewModel.kt", l = {195}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FilteredViewModel$updateScrollingPosition$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8308m;
    public final /* synthetic */ FilteredViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f8309o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilteredViewModel$updateScrollingPosition$1(FilteredViewModel filteredViewModel, int i10, p7.c<? super FilteredViewModel$updateScrollingPosition$1> cVar) {
        super(2, cVar);
        this.n = filteredViewModel;
        this.f8309o = i10;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((FilteredViewModel$updateScrollingPosition$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new FilteredViewModel$updateScrollingPosition$1(this.n, this.f8309o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8308m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            FilteredViewModel filteredViewModel = this.n;
            e eVar = filteredViewModel.f8292h;
            FilteredItemModel filteredItemModel = filteredViewModel.f8293i;
            this.f8308m = 1;
            if (eVar.v(filteredItemModel, this.f8309o, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}
