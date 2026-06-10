package com.noto.app.util;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ProduceKt;
import la.k;
import m0.b;
import m7.n;
import q7.c;
import u7.p;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lla/k;", "", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.util.ViewUtilsKt$isScrollingAsFlow$1", f = "ViewUtils.kt", l = {350}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ViewUtilsKt$isScrollingAsFlow$1 extends SuspendLambda implements p<k<? super Boolean>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9886m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f9887o;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.ViewUtilsKt$isScrollingAsFlow$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements u7.a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f9888j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ a f9889k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RecyclerView recyclerView, a aVar) {
            super(0);
            this.f9888j = recyclerView;
            this.f9889k = aVar;
        }

        @Override // u7.a
        public final n k0() {
            ArrayList arrayList = this.f9888j.f5638s0;
            if (arrayList != null) {
                arrayList.remove(this.f9889k);
            }
            return n.f16010a;
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends RecyclerView.q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k<Boolean> f9890a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f9891b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(k<? super Boolean> kVar, RecyclerView recyclerView) {
            this.f9890a = kVar;
            this.f9891b = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void b(RecyclerView recyclerView, int i10, int i11) {
            g.f(recyclerView, "recyclerView");
            this.f9890a.F(Boolean.valueOf(this.f9891b.canScrollVertically(-1)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewUtilsKt$isScrollingAsFlow$1(RecyclerView recyclerView, p7.c<? super ViewUtilsKt$isScrollingAsFlow$1> cVar) {
        super(2, cVar);
        this.f9887o = recyclerView;
    }

    @Override // u7.p
    public final Object R(k<? super Boolean> kVar, p7.c<? super n> cVar) {
        return ((ViewUtilsKt$isScrollingAsFlow$1) a(kVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ViewUtilsKt$isScrollingAsFlow$1 viewUtilsKt$isScrollingAsFlow$1 = new ViewUtilsKt$isScrollingAsFlow$1(this.f9887o, cVar);
        viewUtilsKt$isScrollingAsFlow$1.n = obj;
        return viewUtilsKt$isScrollingAsFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9886m;
        if (i10 == 0) {
            b.n1(obj);
            k kVar = (k) this.n;
            RecyclerView recyclerView = this.f9887o;
            a aVar = new a(kVar, recyclerView);
            recyclerView.h(aVar);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(recyclerView, aVar);
            this.f9886m = 1;
            if (ProduceKt.a(kVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            b.n1(obj);
        }
        return n.f16010a;
    }
}
