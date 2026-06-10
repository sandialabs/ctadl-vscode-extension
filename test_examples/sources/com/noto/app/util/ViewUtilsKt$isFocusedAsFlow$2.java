package com.noto.app.util;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/c;", "", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.util.ViewUtilsKt$isFocusedAsFlow$2", f = "ViewUtils.kt", l = {299}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ViewUtilsKt$isFocusedAsFlow$2 extends SuspendLambda implements p<kotlinx.coroutines.flow.c<? super Boolean>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9884m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ View f9885o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewUtilsKt$isFocusedAsFlow$2(View view, p7.c<? super ViewUtilsKt$isFocusedAsFlow$2> cVar) {
        super(2, cVar);
        this.f9885o = view;
    }

    @Override // u7.p
    public final Object R(kotlinx.coroutines.flow.c<? super Boolean> cVar, p7.c<? super n> cVar2) {
        return ((ViewUtilsKt$isFocusedAsFlow$2) a(cVar, cVar2)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ViewUtilsKt$isFocusedAsFlow$2 viewUtilsKt$isFocusedAsFlow$2 = new ViewUtilsKt$isFocusedAsFlow$2(this.f9885o, cVar);
        viewUtilsKt$isFocusedAsFlow$2.n = obj;
        return viewUtilsKt$isFocusedAsFlow$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9884m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            Boolean valueOf = Boolean.valueOf(this.f9885o.isFocused());
            this.f9884m = 1;
            if (((kotlinx.coroutines.flow.c) this.n).c(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}
