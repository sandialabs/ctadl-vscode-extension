package com.noto.app.util;

import android.view.View;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lla/k;", "", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.util.ViewUtilsKt$isFocusedAsFlow$1", f = "ViewUtils.kt", l = {298}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ViewUtilsKt$isFocusedAsFlow$1 extends SuspendLambda implements p<k<? super Boolean>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9881m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ View f9882o;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.ViewUtilsKt$isFocusedAsFlow$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ View f9883j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(View view) {
            super(0);
            this.f9883j = view;
        }

        @Override // u7.a
        public final n k0() {
            this.f9883j.setOnFocusChangeListener(null);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewUtilsKt$isFocusedAsFlow$1(View view, p7.c<? super ViewUtilsKt$isFocusedAsFlow$1> cVar) {
        super(2, cVar);
        this.f9882o = view;
    }

    @Override // u7.p
    public final Object R(k<? super Boolean> kVar, p7.c<? super n> cVar) {
        return ((ViewUtilsKt$isFocusedAsFlow$1) a(kVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ViewUtilsKt$isFocusedAsFlow$1 viewUtilsKt$isFocusedAsFlow$1 = new ViewUtilsKt$isFocusedAsFlow$1(this.f9882o, cVar);
        viewUtilsKt$isFocusedAsFlow$1.n = obj;
        return viewUtilsKt$isFocusedAsFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9881m;
        if (i10 == 0) {
            b.n1(obj);
            final k kVar = (k) this.n;
            View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: f7.t
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    la.k.this.F(Boolean.valueOf(z10));
                }
            };
            View view = this.f9882o;
            view.setOnFocusChangeListener(onFocusChangeListener);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(view);
            this.f9881m = 1;
            if (ProduceKt.a(kVar, anonymousClass2, this) == coroutineSingletons) {
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
