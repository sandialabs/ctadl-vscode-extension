package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* loaded from: classes.dex */
public final class w<T> implements c<T> {
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.flow.internal.SafeCollector, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m7.n a(p7.c cVar) {
        SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1;
        ?? r1;
        try {
            if (cVar instanceof SubscribedFlowCollector$onSubscription$1) {
                subscribedFlowCollector$onSubscription$1 = (SubscribedFlowCollector$onSubscription$1) cVar;
                int i10 = subscribedFlowCollector$onSubscription$1.f15354p;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    subscribedFlowCollector$onSubscription$1.f15354p = i10 - Integer.MIN_VALUE;
                    Object obj = subscribedFlowCollector$onSubscription$1.n;
                    r1 = subscribedFlowCollector$onSubscription$1.f15354p;
                    if (r1 == 0) {
                        if (r1 != 1) {
                            if (r1 == 2) {
                                m0.b.n1(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            SafeCollector safeCollector = subscribedFlowCollector$onSubscription$1.f15352m;
                            w wVar = subscribedFlowCollector$onSubscription$1.f15351l;
                            m0.b.n1(obj);
                            safeCollector.m();
                            wVar.getClass();
                        }
                        return m7.n.f16010a;
                    }
                    m0.b.n1(obj);
                    CoroutineContext coroutineContext = subscribedFlowCollector$onSubscription$1.f13036j;
                    v7.g.c(coroutineContext);
                    SafeCollector safeCollector2 = new SafeCollector(null, coroutineContext);
                    subscribedFlowCollector$onSubscription$1.f15351l = this;
                    subscribedFlowCollector$onSubscription$1.f15352m = safeCollector2;
                    subscribedFlowCollector$onSubscription$1.f15354p = 1;
                    throw null;
                }
            }
            if (r1 == 0) {
            }
        } catch (Throwable th) {
            r1.m();
            throw th;
        }
        subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, cVar);
        Object obj2 = subscribedFlowCollector$onSubscription$1.n;
        r1 = subscribedFlowCollector$onSubscription$1.f15354p;
    }

    @Override // kotlinx.coroutines.flow.c
    public final Object c(T t10, p7.c<? super m7.n> cVar) {
        throw null;
    }
}
