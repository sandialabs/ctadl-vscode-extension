package com.noto.app.util;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.datastore.preferences.PreferencesProto$Value;
import f7.v;
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
@c(c = "com.noto.app.util.ViewUtilsKt$onPreDrawFlow$1", f = "ViewUtils.kt", l = {290}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ViewUtilsKt$onPreDrawFlow$1 extends SuspendLambda implements p<k<? super n>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9896m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ View f9897o;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.ViewUtilsKt$onPreDrawFlow$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ View f9898j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ ViewTreeObserver.OnPreDrawListener f9899k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(View view, v vVar) {
            super(0);
            this.f9898j = view;
            this.f9899k = vVar;
        }

        @Override // u7.a
        public final n k0() {
            ViewTreeObserver viewTreeObserver = this.f9898j.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(this.f9899k);
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewUtilsKt$onPreDrawFlow$1(View view, p7.c<? super ViewUtilsKt$onPreDrawFlow$1> cVar) {
        super(2, cVar);
        this.f9897o = view;
    }

    @Override // u7.p
    public final Object R(k<? super n> kVar, p7.c<? super n> cVar) {
        return ((ViewUtilsKt$onPreDrawFlow$1) a(kVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ViewUtilsKt$onPreDrawFlow$1 viewUtilsKt$onPreDrawFlow$1 = new ViewUtilsKt$onPreDrawFlow$1(this.f9897o, cVar);
        viewUtilsKt$onPreDrawFlow$1.n = obj;
        return viewUtilsKt$onPreDrawFlow$1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [f7.v, android.view.ViewTreeObserver$OnPreDrawListener] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9896m;
        if (i10 == 0) {
            b.n1(obj);
            final k kVar = (k) this.n;
            ?? r1 = new ViewTreeObserver.OnPreDrawListener() { // from class: f7.v
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    la.k.this.F(m7.n.f16010a);
                    return true;
                }
            };
            View view = this.f9897o;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnPreDrawListener(r1);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(view, r1);
            this.f9896m = 1;
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
