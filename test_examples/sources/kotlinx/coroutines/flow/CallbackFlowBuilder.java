package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes.dex */
public final class CallbackFlowBuilder<T> extends a<T> {

    /* renamed from: m  reason: collision with root package name */
    public final u7.p<la.k<? super T>, p7.c<? super m7.n>, Object> f15207m;

    /* JADX WARN: Multi-variable type inference failed */
    public CallbackFlowBuilder(u7.p<? super la.k<? super T>, ? super p7.c<? super m7.n>, ? extends Object> pVar, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        super(pVar, coroutineContext, i10, bufferOverflow);
        this.f15207m = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    @Override // kotlinx.coroutines.flow.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(la.k<? super T> kVar, p7.c<? super m7.n> cVar) {
        CallbackFlowBuilder$collectTo$1 callbackFlowBuilder$collectTo$1;
        int i10;
        if (cVar instanceof CallbackFlowBuilder$collectTo$1) {
            callbackFlowBuilder$collectTo$1 = (CallbackFlowBuilder$collectTo$1) cVar;
            int i11 = callbackFlowBuilder$collectTo$1.f15210o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                callbackFlowBuilder$collectTo$1.f15210o = i11 - Integer.MIN_VALUE;
                Object obj = callbackFlowBuilder$collectTo$1.f15209m;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = callbackFlowBuilder$collectTo$1.f15210o;
                if (i10 == 0) {
                    if (i10 == 1) {
                        kVar = callbackFlowBuilder$collectTo$1.f15208l;
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    callbackFlowBuilder$collectTo$1.f15208l = kVar;
                    callbackFlowBuilder$collectTo$1.f15210o = 1;
                    Object R = this.f15355l.R(kVar, callbackFlowBuilder$collectTo$1);
                    if (R != coroutineSingletons) {
                        R = m7.n.f16010a;
                    }
                    if (R == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                if (!kVar.K()) {
                    return m7.n.f16010a;
                }
                throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
            }
        }
        callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, cVar);
        Object obj2 = callbackFlowBuilder$collectTo$1.f15209m;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = callbackFlowBuilder$collectTo$1.f15210o;
        if (i10 == 0) {
        }
        if (!kVar.K()) {
        }
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final kotlinx.coroutines.flow.internal.a<T> g(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.f15207m, coroutineContext, i10, bufferOverflow);
    }
}
