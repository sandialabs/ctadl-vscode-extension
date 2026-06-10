package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.main.MainViewModel$updateFolderParentId$1", f = "MainViewModel.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class MainViewModel$updateFolderParentId$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8939m;
    public final /* synthetic */ MainViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ t6.a f8940o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Long f8941p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$updateFolderParentId$1(MainViewModel mainViewModel, t6.a aVar, Long l2, p7.c<? super MainViewModel$updateFolderParentId$1> cVar) {
        super(2, cVar);
        this.n = mainViewModel;
        this.f8940o = aVar;
        this.f8941p = l2;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((MainViewModel$updateFolderParentId$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new MainViewModel$updateFolderParentId$1(this.n, this.f8940o, this.f8941p, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8939m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            u6.a aVar = this.n.f8905d;
            t6.a a10 = t6.a.a(this.f8940o, this.f8941p, null, 0, null, null, 0, false, false, false, null, null, null, null, null, false, 0, null, null, null, 2097149);
            this.f8939m = 1;
            if (aVar.f(a10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}
