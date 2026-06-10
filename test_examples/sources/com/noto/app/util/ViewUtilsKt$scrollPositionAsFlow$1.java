package com.noto.app.util;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.datastore.preferences.PreferencesProto$Value;
import f7.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ProduceKt;
import la.k;
import m0.b;
import m7.n;
import q7.c;
import u7.a;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lla/k;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.util.ViewUtilsKt$scrollPositionAsFlow$1", f = "ViewUtils.kt", l = {266}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ViewUtilsKt$scrollPositionAsFlow$1 extends SuspendLambda implements p<k<? super n>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9900m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ View f9901o;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.ViewUtilsKt$scrollPositionAsFlow$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ View f9902j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f9903k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(View view, x xVar) {
            super(0);
            this.f9902j = view;
            this.f9903k = xVar;
        }

        @Override // u7.a
        public final n k0() {
            ViewTreeObserver viewTreeObserver = this.f9902j.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnScrollChangedListener(this.f9903k);
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewUtilsKt$scrollPositionAsFlow$1(View view, p7.c<? super ViewUtilsKt$scrollPositionAsFlow$1> cVar) {
        super(2, cVar);
        this.f9901o = view;
    }

    @Override // u7.p
    public final Object R(k<? super n> kVar, p7.c<? super n> cVar) {
        return ((ViewUtilsKt$scrollPositionAsFlow$1) a(kVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ViewUtilsKt$scrollPositionAsFlow$1 viewUtilsKt$scrollPositionAsFlow$1 = new ViewUtilsKt$scrollPositionAsFlow$1(this.f9901o, cVar);
        viewUtilsKt$scrollPositionAsFlow$1.n = obj;
        return viewUtilsKt$scrollPositionAsFlow$1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [f7.x, android.view.ViewTreeObserver$OnScrollChangedListener] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9900m;
        if (i10 == 0) {
            b.n1(obj);
            final k kVar = (k) this.n;
            ?? r1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: f7.x
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    la.k.this.F(m7.n.f16010a);
                }
            };
            View view = this.f9901o;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnScrollChangedListener(r1);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(view, r1);
            this.f9900m = 1;
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
