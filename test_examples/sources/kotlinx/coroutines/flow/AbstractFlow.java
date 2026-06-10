package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* loaded from: classes.dex */
public abstract class AbstractFlow<T> implements b<T> {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // kotlinx.coroutines.flow.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c<? super T> cVar, p7.c<? super m7.n> cVar2) {
        AbstractFlow$collect$1 abstractFlow$collect$1;
        int i10;
        Throwable th;
        SafeCollector safeCollector;
        if (cVar2 instanceof AbstractFlow$collect$1) {
            abstractFlow$collect$1 = (AbstractFlow$collect$1) cVar2;
            int i11 = abstractFlow$collect$1.f15206o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                abstractFlow$collect$1.f15206o = i11 - Integer.MIN_VALUE;
                Object obj = abstractFlow$collect$1.f15205m;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = abstractFlow$collect$1.f15206o;
                if (i10 == 0) {
                    if (i10 == 1) {
                        safeCollector = abstractFlow$collect$1.f15204l;
                        try {
                            m0.b.n1(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            safeCollector.m();
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    CoroutineContext coroutineContext = abstractFlow$collect$1.f13036j;
                    v7.g.c(coroutineContext);
                    SafeCollector safeCollector2 = new SafeCollector(cVar, coroutineContext);
                    try {
                        abstractFlow$collect$1.f15204l = safeCollector2;
                        abstractFlow$collect$1.f15206o = 1;
                        Object R = ((n) this).f15432i.R(safeCollector2, abstractFlow$collect$1);
                        if (R != coroutineSingletons) {
                            R = m7.n.f16010a;
                        }
                        if (R == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        safeCollector = safeCollector2;
                    } catch (Throwable th3) {
                        th = th3;
                        safeCollector = safeCollector2;
                        safeCollector.m();
                        throw th;
                    }
                }
                safeCollector.m();
                return m7.n.f16010a;
            }
        }
        abstractFlow$collect$1 = new AbstractFlow$collect$1(this, cVar2);
        Object obj2 = abstractFlow$collect$1.f15205m;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = abstractFlow$collect$1.f15206o;
        if (i10 == 0) {
        }
        safeCollector.m();
        return m7.n.f16010a;
    }
}
