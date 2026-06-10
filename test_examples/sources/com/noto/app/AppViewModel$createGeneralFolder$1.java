package com.noto.app;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.util.ModelUtilsKt;
import ja.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import m0.b;
import m7.n;
import q7.c;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.AppViewModel$createGeneralFolder$1", f = "AppViewModel.kt", l = {91, 92}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AppViewModel$createGeneralFolder$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public List f7565m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ AppViewModel f7566o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppViewModel$createGeneralFolder$1(AppViewModel appViewModel, p7.c<? super AppViewModel$createGeneralFolder$1> cVar) {
        super(2, cVar);
        this.f7566o = appViewModel;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((AppViewModel$createGeneralFolder$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new AppViewModel$createGeneralFolder$1(this.f7566o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.n;
        AppViewModel appViewModel = this.f7566o;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    b.n1(obj);
                    return n.f16010a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.n1(obj);
        } else {
            b.n1(obj);
            kotlinx.coroutines.flow.b<List<t6.a>> e10 = appViewModel.f7544d.e();
            this.n = 1;
            obj = FlowKt__ReduceKt.c(e10, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        List<t6.a> list = (List) obj;
        if (list != null) {
            if (!list.isEmpty()) {
                for (t6.a aVar : list) {
                    if (ModelUtilsKt.u(aVar)) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                u6.a aVar2 = appViewModel.f7544d;
                t6.a.Companion.getClass();
                t6.a aVar3 = new t6.a(-1L, NotoColor.Black, 2097126);
                this.f7565m = list;
                this.n = 2;
                if (aVar2.i(aVar3, true, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return n.f16010a;
    }
}
