package com.noto.app.label;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.label.LabelViewModel$createOrUpdateLabel$1", f = "LabelViewModel.kt", l = {38, 40}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LabelViewModel$createOrUpdateLabel$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8760m;
    public final /* synthetic */ LabelViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ String f8761o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelViewModel$createOrUpdateLabel$1(LabelViewModel labelViewModel, String str, p7.c<? super LabelViewModel$createOrUpdateLabel$1> cVar) {
        super(2, cVar);
        this.n = labelViewModel;
        this.f8761o = str;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((LabelViewModel$createOrUpdateLabel$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new LabelViewModel$createOrUpdateLabel$1(this.n, this.f8761o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8760m;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0.b.n1(obj);
        } else {
            m0.b.n1(obj);
            LabelViewModel labelViewModel = this.n;
            t6.c a10 = t6.c.a((t6.c) labelViewModel.f8755i.getValue(), 0L, kotlin.text.b.w1(this.f8761o).toString(), 0, 27);
            long j2 = labelViewModel.f8752f;
            u6.b bVar = labelViewModel.f8751e;
            if (j2 == 0) {
                this.f8760m = 1;
                if (bVar.f(a10, true, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                this.f8760m = 2;
                if (bVar.c(a10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return n.f16010a;
    }
}
