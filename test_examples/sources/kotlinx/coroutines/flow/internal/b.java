package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.ThreadContextKt;
import la.k;
import m7.n;
import ma.h;
import ma.j;
import p7.d;
import v7.g;

/* loaded from: classes.dex */
public abstract class b<S, T> extends a<T> {

    /* renamed from: l  reason: collision with root package name */
    public final kotlinx.coroutines.flow.b<S> f15426l;

    public b(int i10, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, kotlinx.coroutines.flow.b bVar) {
        super(coroutineContext, i10, bufferOverflow);
        this.f15426l = bVar;
    }

    @Override // kotlinx.coroutines.flow.internal.a, kotlinx.coroutines.flow.b
    public final Object a(kotlinx.coroutines.flow.c<? super T> cVar, p7.c<? super n> cVar2) {
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.f15424j == -3) {
            CoroutineContext f10 = cVar2.f();
            CoroutineContext m10 = f10.m(this.f15423i);
            if (g.a(m10, f10)) {
                Object j2 = j(cVar, cVar2);
                if (j2 == coroutineSingletons) {
                    return j2;
                }
            } else {
                d.a aVar = d.a.f16777i;
                if (g.a(m10.a(aVar), f10.a(aVar))) {
                    CoroutineContext f11 = cVar2.f();
                    if (cVar instanceof j) {
                        z10 = true;
                    } else {
                        z10 = cVar instanceof h;
                    }
                    if (!z10) {
                        cVar = new UndispatchedContextCollector(cVar, f11);
                    }
                    Object L0 = a1.b.L0(m10, cVar, ThreadContextKt.b(m10), new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), cVar2);
                    if (L0 != coroutineSingletons) {
                        L0 = n.f16010a;
                    }
                    if (L0 == coroutineSingletons) {
                        return L0;
                    }
                }
            }
            return n.f16010a;
        }
        Object a10 = super.a(cVar, cVar2);
        if (a10 == coroutineSingletons) {
            return a10;
        }
        return n.f16010a;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final Object c(k<? super T> kVar, p7.c<? super n> cVar) {
        Object j2 = j(new j(kVar), cVar);
        return j2 == CoroutineSingletons.COROUTINE_SUSPENDED ? j2 : n.f16010a;
    }

    public abstract Object j(kotlinx.coroutines.flow.c<? super T> cVar, p7.c<? super n> cVar2);

    @Override // kotlinx.coroutines.flow.internal.a
    public final String toString() {
        return this.f15426l + " -> " + super.toString();
    }
}
