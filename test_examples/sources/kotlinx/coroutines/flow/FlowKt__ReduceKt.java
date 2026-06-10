package kotlinx.coroutines.flow;

import java.util.NoSuchElementException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes.dex */
public final /* synthetic */ class FlowKt__ReduceKt {

    /* loaded from: classes.dex */
    public static final class a implements c<T> {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f15269i;

        public a(Ref$ObjectRef ref$ObjectRef) {
            this.f15269i = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.c
        public final Object c(T t10, p7.c<? super m7.n> cVar) {
            this.f15269i.f13060i = t10;
            throw new AbortFlowException(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c<T> {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f15270i;

        public b(Ref$ObjectRef ref$ObjectRef) {
            this.f15270i = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.c
        public final Object c(T t10, p7.c<? super m7.n> cVar) {
            this.f15270i.f13060i = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object a(kotlinx.coroutines.flow.b<? extends T> bVar, p7.c<? super T> cVar) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        int i10;
        T t10;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e10;
        a aVar;
        T t11;
        if (cVar instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) cVar;
            int i11 = flowKt__ReduceKt$first$1.f15273o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.f15273o = i11 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$first$1.n;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = flowKt__ReduceKt$first$1.f15273o;
                t10 = (T) ma.i.f16036b;
                if (i10 == 0) {
                    if (i10 == 1) {
                        aVar = flowKt__ReduceKt$first$1.f15272m;
                        ref$ObjectRef = flowKt__ReduceKt$first$1.f15271l;
                        try {
                            m0.b.n1(obj);
                        } catch (AbortFlowException e11) {
                            e10 = e11;
                            if (e10.f15366i != aVar) {
                                throw e10;
                            }
                            t11 = ref$ObjectRef.f13060i;
                            if (t11 == t10) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.f13060i = t10;
                    a aVar2 = new a(ref$ObjectRef2);
                    try {
                        flowKt__ReduceKt$first$1.f15271l = ref$ObjectRef2;
                        flowKt__ReduceKt$first$1.f15272m = aVar2;
                        flowKt__ReduceKt$first$1.f15273o = 1;
                        if (bVar.a(aVar2, flowKt__ReduceKt$first$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (AbortFlowException e12) {
                        ref$ObjectRef = ref$ObjectRef2;
                        e10 = e12;
                        aVar = aVar2;
                        if (e10.f15366i != aVar) {
                        }
                        t11 = ref$ObjectRef.f13060i;
                        if (t11 == t10) {
                        }
                    }
                }
                t11 = ref$ObjectRef.f13060i;
                if (t11 == t10) {
                    return t11;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(cVar);
        Object obj2 = flowKt__ReduceKt$first$1.n;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = flowKt__ReduceKt$first$1.f15273o;
        t10 = (T) ma.i.f16036b;
        if (i10 == 0) {
        }
        t11 = ref$ObjectRef.f13060i;
        if (t11 == t10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlinx.coroutines.internal.r, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(u uVar, u7.p pVar, p7.c cVar) {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        int i10;
        ?? r3;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException abortFlowException;
        FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$2;
        u7.p pVar2;
        Ref$ObjectRef ref$ObjectRef2;
        T t10;
        if (cVar instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) cVar;
            int i11 = flowKt__ReduceKt$first$3.f15277p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.f15277p = i11 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$first$3.f15276o;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = flowKt__ReduceKt$first$3.f15277p;
                r3 = ma.i.f16036b;
                if (i10 == 0) {
                    if (i10 == 1) {
                        flowKt__ReduceKt$first$$inlined$collectWhile$2 = flowKt__ReduceKt$first$3.n;
                        ref$ObjectRef2 = flowKt__ReduceKt$first$3.f15275m;
                        pVar2 = flowKt__ReduceKt$first$3.f15274l;
                        try {
                            m0.b.n1(obj);
                        } catch (AbortFlowException e10) {
                            ref$ObjectRef = ref$ObjectRef2;
                            pVar = pVar2;
                            abortFlowException = e10;
                        }
                        t10 = ref$ObjectRef2.f13060i;
                        if (t10 == r3) {
                            return t10;
                        }
                        throw new NoSuchElementException("Expected at least one element matching the predicate " + pVar2);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m0.b.n1(obj);
                ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.f13060i = r3;
                FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$22 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2(pVar, ref$ObjectRef);
                try {
                    flowKt__ReduceKt$first$3.f15274l = pVar;
                    flowKt__ReduceKt$first$3.f15275m = ref$ObjectRef;
                    flowKt__ReduceKt$first$3.n = flowKt__ReduceKt$first$$inlined$collectWhile$22;
                    flowKt__ReduceKt$first$3.f15277p = 1;
                    if (uVar.a(flowKt__ReduceKt$first$$inlined$collectWhile$22, flowKt__ReduceKt$first$3) == obj2) {
                        return obj2;
                    }
                } catch (AbortFlowException e11) {
                    abortFlowException = e11;
                    flowKt__ReduceKt$first$$inlined$collectWhile$2 = flowKt__ReduceKt$first$$inlined$collectWhile$22;
                }
                pVar2 = pVar;
                ref$ObjectRef2 = ref$ObjectRef;
                t10 = ref$ObjectRef2.f13060i;
                if (t10 == r3) {
                }
                if (abortFlowException.f15366i != flowKt__ReduceKt$first$$inlined$collectWhile$2) {
                    throw abortFlowException;
                }
                pVar2 = pVar;
                ref$ObjectRef2 = ref$ObjectRef;
                t10 = ref$ObjectRef2.f13060i;
                if (t10 == r3) {
                }
            }
        }
        flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(cVar);
        Object obj3 = flowKt__ReduceKt$first$3.f15276o;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = flowKt__ReduceKt$first$3.f15277p;
        r3 = ma.i.f16036b;
        if (i10 == 0) {
        }
        if (abortFlowException.f15366i != flowKt__ReduceKt$first$$inlined$collectWhile$2) {
        }
        pVar2 = pVar;
        ref$ObjectRef2 = ref$ObjectRef;
        t10 = ref$ObjectRef2.f13060i;
        if (t10 == r3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object c(kotlinx.coroutines.flow.b<? extends T> bVar, p7.c<? super T> cVar) {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        int i10;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e10;
        b bVar2;
        if (cVar instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) cVar;
            int i11 = flowKt__ReduceKt$firstOrNull$1.f15280o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.f15280o = i11 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$firstOrNull$1.n;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = flowKt__ReduceKt$firstOrNull$1.f15280o;
                if (i10 == 0) {
                    if (i10 == 1) {
                        bVar2 = flowKt__ReduceKt$firstOrNull$1.f15279m;
                        ref$ObjectRef = flowKt__ReduceKt$firstOrNull$1.f15278l;
                        try {
                            m0.b.n1(obj);
                        } catch (AbortFlowException e11) {
                            e10 = e11;
                            if (e10.f15366i != bVar2) {
                            }
                            return ref$ObjectRef.f13060i;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    b bVar3 = new b(ref$ObjectRef2);
                    try {
                        flowKt__ReduceKt$firstOrNull$1.f15278l = ref$ObjectRef2;
                        flowKt__ReduceKt$firstOrNull$1.f15279m = bVar3;
                        flowKt__ReduceKt$firstOrNull$1.f15280o = 1;
                        if (bVar.a(bVar3, flowKt__ReduceKt$firstOrNull$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (AbortFlowException e12) {
                        ref$ObjectRef = ref$ObjectRef2;
                        e10 = e12;
                        bVar2 = bVar3;
                        if (e10.f15366i != bVar2) {
                            throw e10;
                        }
                        return ref$ObjectRef.f13060i;
                    }
                }
                return ref$ObjectRef.f13060i;
            }
        }
        flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(cVar);
        Object obj2 = flowKt__ReduceKt$firstOrNull$1.n;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = flowKt__ReduceKt$firstOrNull$1.f15280o;
        if (i10 == 0) {
        }
        return ref$ObjectRef.f13060i;
    }
}
