package com.noto.app.filtered;

import a3.j0;
import a3.v0;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.e;
import u7.q;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"", "isRememberScrollingPosition", "", "scrollingPosition", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.filtered.FilteredFragment$setupState$8", f = "FilteredFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FilteredFragment$setupState$8 extends SuspendLambda implements q<Boolean, Integer, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f8276m;
    public /* synthetic */ int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f8277o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ e f8278p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilteredFragment$setupState$8(LinearLayoutManager linearLayoutManager, e eVar, p7.c<? super FilteredFragment$setupState$8> cVar) {
        super(3, cVar);
        this.f8277o = linearLayoutManager;
        this.f8278p = eVar;
    }

    @Override // u7.q
    public final Object O(Boolean bool, Integer num, p7.c<? super n> cVar) {
        boolean booleanValue = bool.booleanValue();
        int intValue = num.intValue();
        FilteredFragment$setupState$8 filteredFragment$setupState$8 = new FilteredFragment$setupState$8(this.f8277o, this.f8278p, cVar);
        filteredFragment$setupState$8.f8276m = booleanValue;
        filteredFragment$setupState$8.n = intValue;
        return filteredFragment$setupState$8.k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        final boolean z10 = this.f8276m;
        final int i10 = this.n;
        final e eVar = this.f8278p;
        final LinearLayoutManager linearLayoutManager = this.f8277o;
        Runnable runnable = new Runnable() { // from class: w6.j
            @Override // java.lang.Runnable
            public final void run() {
                EpoxyRecyclerView epoxyRecyclerView = s6.e.this.f17329e;
                final boolean z11 = z10;
                final LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                final int i11 = i10;
                epoxyRecyclerView.post(new Runnable() { // from class: w6.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (z11) {
                            linearLayoutManager2.w0(i11);
                        }
                    }
                });
            }
        };
        RecyclerView recyclerView = linearLayoutManager.f5693b;
        if (recyclerView != null) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.d.m(recyclerView, runnable);
        }
        return n.f16010a;
    }
}
