package com.noto.app;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.Icon;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import m0.b;
import m7.n;
import q7.c;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lcom/noto/app/domain/model/Icon;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.AppViewModel$currentIcon$1", f = "AppViewModel.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AppViewModel$currentIcon$1 extends SuspendLambda implements p<x, p7.c<? super Icon>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f7573m;
    public final /* synthetic */ AppViewModel n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppViewModel$currentIcon$1(AppViewModel appViewModel, p7.c<? super AppViewModel$currentIcon$1> cVar) {
        super(2, cVar);
        this.n = appViewModel;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super Icon> cVar) {
        return ((AppViewModel$currentIcon$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new AppViewModel$currentIcon$1(this.n, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f7573m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            kotlinx.coroutines.flow.b<Icon> icon = this.n.f7546f.getIcon();
            this.f7573m = 1;
            obj = FlowKt__ReduceKt.a(icon, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
