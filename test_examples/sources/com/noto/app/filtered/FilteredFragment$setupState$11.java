package com.noto.app.filtered;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.d0;
import androidx.navigation.NavController;
import com.noto.app.util.ViewUtilsKt;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.b;
import m7.n;
import ma.i;
import q7.c;
import u7.l;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "folderId", "Lm7/n;", "invoke", "(Ljava/lang/Long;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FilteredFragment$setupState$11 extends Lambda implements l<Long, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FilteredFragment f8250j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ d0 f8251k;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    @c(c = "com.noto.app.filtered.FilteredFragment$setupState$11$1", f = "FilteredFragment.kt", l = {220}, m = "invokeSuspend")
    /* renamed from: com.noto.app.filtered.FilteredFragment$setupState$11$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f8252m;
        public final /* synthetic */ d0 n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ FilteredFragment f8253o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ Long f8254p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d0 d0Var, FilteredFragment filteredFragment, Long l2, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.n = d0Var;
            this.f8253o = filteredFragment;
            this.f8254p = l2;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass1) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass1(this.n, this.f8253o, this.f8254p, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f8252m;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                b.n1(obj);
                this.f8252m = 1;
                if (b.S(150L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.n.d("folder_id");
            NavController g10 = ViewUtilsKt.g(this.f8253o);
            if (g10 != null) {
                Long l2 = this.f8254p;
                g.e(l2, "folderId");
                ViewUtilsKt.o(g10, i.l(l2.longValue(), 0L, new long[0], 126), null);
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilteredFragment$setupState$11(FilteredFragment filteredFragment, d0 d0Var) {
        super(1);
        this.f8250j = filteredFragment;
        this.f8251k = d0Var;
    }

    @Override // u7.l
    public final n U(Long l2) {
        Long l4 = l2;
        if (l4 != null) {
            FilteredFragment filteredFragment = this.f8250j;
            b.M0(i.z(filteredFragment), null, null, new AnonymousClass1(this.f8251k, filteredFragment, l4, null), 3);
        }
        return n.f16010a;
    }
}
