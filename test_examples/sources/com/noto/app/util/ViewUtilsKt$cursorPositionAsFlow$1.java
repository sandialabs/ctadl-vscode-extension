package com.noto.app.util;

import androidx.datastore.preferences.PreferencesProto$Value;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lla/k;", "", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.util.ViewUtilsKt$cursorPositionAsFlow$1", f = "ViewUtils.kt", l = {173}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ViewUtilsKt$cursorPositionAsFlow$1 extends SuspendLambda implements p<k<? super Integer>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9873m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ CustomEditText f9874o;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.ViewUtilsKt$cursorPositionAsFlow$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ CustomEditText f9875j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CustomEditText customEditText) {
            super(0);
            this.f9875j = customEditText;
        }

        @Override // u7.a
        public final n k0() {
            this.f9875j.setOnCursorPositionChangedListener(null);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewUtilsKt$cursorPositionAsFlow$1(CustomEditText customEditText, p7.c<? super ViewUtilsKt$cursorPositionAsFlow$1> cVar) {
        super(2, cVar);
        this.f9874o = customEditText;
    }

    @Override // u7.p
    public final Object R(k<? super Integer> kVar, p7.c<? super n> cVar) {
        return ((ViewUtilsKt$cursorPositionAsFlow$1) a(kVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ViewUtilsKt$cursorPositionAsFlow$1 viewUtilsKt$cursorPositionAsFlow$1 = new ViewUtilsKt$cursorPositionAsFlow$1(this.f9874o, cVar);
        viewUtilsKt$cursorPositionAsFlow$1.n = obj;
        return viewUtilsKt$cursorPositionAsFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9873m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            k kVar = (k) this.n;
            kVar.F(new Integer(0));
            ViewUtilsKt$cursorPositionAsFlow$1$listener$1 viewUtilsKt$cursorPositionAsFlow$1$listener$1 = new ViewUtilsKt$cursorPositionAsFlow$1$listener$1(kVar);
            CustomEditText customEditText = this.f9874o;
            customEditText.setOnCursorPositionChangedListener(viewUtilsKt$cursorPositionAsFlow$1$listener$1);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(customEditText);
            this.f9873m = 1;
            if (ProduceKt.a(kVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}
