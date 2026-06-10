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
@c(c = "com.noto.app.label.LabelViewModel$updateLabelPosition$1", f = "LabelViewModel.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LabelViewModel$updateLabelPosition$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f8763m;
    public final /* synthetic */ LabelViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ t6.c f8764o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f8765p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelViewModel$updateLabelPosition$1(LabelViewModel labelViewModel, t6.c cVar, int i10, p7.c<? super LabelViewModel$updateLabelPosition$1> cVar2) {
        super(2, cVar2);
        this.n = labelViewModel;
        this.f8764o = cVar;
        this.f8765p = i10;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((LabelViewModel$updateLabelPosition$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new LabelViewModel$updateLabelPosition$1(this.n, this.f8764o, this.f8765p, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f8763m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            u6.b bVar = this.n.f8751e;
            t6.c a10 = t6.c.a(this.f8764o, 0L, null, this.f8765p, 15);
            this.f8763m = 1;
            if (bVar.c(a10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}
