package com.noto.app;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.ModelUtilsKt;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import m0.b;
import m7.n;
import q7.c;
import t6.d;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.AppViewModel$createQuickNote$1", f = "AppViewModel.kt", l = {106, 108, 109}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AppViewModel$createQuickNote$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public Object f7567m;
    public String n;

    /* renamed from: o  reason: collision with root package name */
    public long f7568o;

    /* renamed from: p  reason: collision with root package name */
    public int f7569p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ String f7570q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ AppViewModel f7571r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ p<t6.a, d, n> f7572s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppViewModel$createQuickNote$1(String str, AppViewModel appViewModel, p<? super t6.a, ? super d, n> pVar, p7.c<? super AppViewModel$createQuickNote$1> cVar) {
        super(2, cVar);
        this.f7570q = str;
        this.f7571r = appViewModel;
        this.f7572s = pVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((AppViewModel$createQuickNote$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new AppViewModel$createQuickNote$1(this.f7570q, this.f7571r, this.f7572s, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        String k3;
        String C;
        Object a10;
        long longValue;
        d dVar;
        Object g10;
        Object a11;
        long j2;
        d dVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f7569p;
        AppViewModel appViewModel = this.f7571r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        long j10 = this.f7568o;
                        b.n1(obj);
                        j2 = j10;
                        dVar2 = (d) this.f7567m;
                        a11 = obj;
                        d a12 = d.a(dVar2, j2, 0L, null, null, 0, false, false, null, null, 0, 4094);
                        this.f7572s.R((t6.a) a11, a12);
                        return n.f16010a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j11 = this.f7568o;
                dVar = (d) this.f7567m;
                b.n1(obj);
                longValue = j11;
                g10 = obj;
                long longValue2 = ((Number) g10).longValue();
                kotlinx.coroutines.flow.b<t6.a> d5 = appViewModel.f7544d.d(longValue);
                this.f7567m = dVar;
                this.f7568o = longValue2;
                this.f7569p = 3;
                a11 = FlowKt__ReduceKt.a(d5, this);
                if (a11 != coroutineSingletons) {
                    return coroutineSingletons;
                }
                j2 = longValue2;
                dVar2 = dVar;
                d a122 = d.a(dVar2, j2, 0L, null, null, 0, false, false, null, null, 0, 4094);
                this.f7572s.R((t6.a) a11, a122);
                return n.f16010a;
            }
            C = this.n;
            k3 = (String) this.f7567m;
            b.n1(obj);
            a10 = obj;
        } else {
            b.n1(obj);
            String str = this.f7570q;
            k3 = ModelUtilsKt.k(str);
            C = ModelUtilsKt.C(str);
            kotlinx.coroutines.flow.b<Long> K = appViewModel.f7546f.K();
            this.f7567m = k3;
            this.n = C;
            this.f7569p = 1;
            a10 = FlowKt__ReduceKt.a(K, this);
            if (a10 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        String str2 = k3;
        longValue = ((Number) a10).longValue();
        dVar = new d(0L, longValue, str2, C, false, 4065);
        u6.d dVar3 = appViewModel.f7545e;
        this.f7567m = dVar;
        this.n = null;
        this.f7568o = longValue;
        this.f7569p = 2;
        g10 = dVar3.g(dVar, true, this);
        if (g10 == coroutineSingletons) {
            return coroutineSingletons;
        }
        long longValue22 = ((Number) g10).longValue();
        kotlinx.coroutines.flow.b<t6.a> d52 = appViewModel.f7544d.d(longValue);
        this.f7567m = dVar;
        this.f7568o = longValue22;
        this.f7569p = 3;
        a11 = FlowKt__ReduceKt.a(d52, this);
        if (a11 != coroutineSingletons) {
        }
    }
}
