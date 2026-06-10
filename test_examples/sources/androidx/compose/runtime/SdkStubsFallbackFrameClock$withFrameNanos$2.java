package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u7.l;
import u7.p;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lja/x;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@q7.c(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SdkStubsFallbackFrameClock$withFrameNanos$2 extends SuspendLambda implements p<x, p7.c<Object>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f2828m;
    public final /* synthetic */ l<Long, Object> n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkStubsFallbackFrameClock$withFrameNanos$2(p7.c cVar, l lVar) {
        super(2, cVar);
        this.n = lVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<Object> cVar) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(cVar, this.n);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2828m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            this.f2828m = 1;
            if (m0.b.S(16L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return this.n.U(new Long(System.nanoTime()));
    }
}
