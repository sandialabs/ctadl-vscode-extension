package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import m7.n;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lg1/c;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ForEachGestureKt$awaitAllPointersUp$2 extends RestrictedSuspendLambda implements p<g1.c, p7.c<? super n>, Object> {

    /* renamed from: k  reason: collision with root package name */
    public int f1753k;

    /* renamed from: l  reason: collision with root package name */
    public /* synthetic */ Object f1754l;

    public ForEachGestureKt$awaitAllPointersUp$2(p7.c<? super ForEachGestureKt$awaitAllPointersUp$2> cVar) {
        super(2, cVar);
    }

    @Override // u7.p
    public final Object R(g1.c cVar, p7.c<? super n> cVar2) {
        return ((ForEachGestureKt$awaitAllPointersUp$2) a(cVar, cVar2)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ForEachGestureKt$awaitAllPointersUp$2 forEachGestureKt$awaitAllPointersUp$2 = new ForEachGestureKt$awaitAllPointersUp$2(cVar);
        forEachGestureKt$awaitAllPointersUp$2.f1754l = obj;
        return forEachGestureKt$awaitAllPointersUp$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1753k;
        if (i10 == 0) {
            m0.b.n1(obj);
            this.f1753k = 1;
            if (ForEachGestureKt.a((g1.c) this.f1754l, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m0.b.n1(obj);
        }
        return n.f16010a;
    }
}
