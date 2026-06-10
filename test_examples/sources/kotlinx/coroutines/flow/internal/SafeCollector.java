package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m7.n;
import ma.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/c;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lq7/b;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SafeCollector<T> extends ContinuationImpl implements kotlinx.coroutines.flow.c<T> {

    /* renamed from: l  reason: collision with root package name */
    public final kotlinx.coroutines.flow.c<T> f15410l;

    /* renamed from: m  reason: collision with root package name */
    public final CoroutineContext f15411m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public CoroutineContext f15412o;

    /* renamed from: p  reason: collision with root package name */
    public p7.c<? super n> f15413p;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(kotlinx.coroutines.flow.c<? super T> cVar, CoroutineContext coroutineContext) {
        super(g.f16033i, EmptyCoroutineContext.f13021i);
        this.f15410l = cVar;
        this.f15411m = coroutineContext;
        this.n = ((Number) coroutineContext.J(0, SafeCollector$collectContextSize$1.f15414j)).intValue();
    }

    @Override // kotlinx.coroutines.flow.c
    public final Object c(T t10, p7.c<? super n> cVar) {
        try {
            Object p10 = p(cVar, t10);
            return p10 == CoroutineSingletons.COROUTINE_SUSPENDED ? p10 : n.f16010a;
        } catch (Throwable th) {
            this.f15412o = new ma.d(cVar.f(), th);
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, p7.c
    public final CoroutineContext f() {
        CoroutineContext coroutineContext = this.f15412o;
        return coroutineContext == null ? EmptyCoroutineContext.f13021i : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, q7.b
    public final q7.b g() {
        p7.c<? super n> cVar = this.f15413p;
        if (cVar instanceof q7.b) {
            return (q7.b) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final StackTraceElement j() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Throwable a10 = Result.a(obj);
        if (a10 != null) {
            this.f15412o = new ma.d(f(), a10);
        }
        p7.c<? super n> cVar = this.f15413p;
        if (cVar != null) {
            cVar.t(obj);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final void m() {
        super.m();
    }

    public final Object p(p7.c<? super n> cVar, T t10) {
        CoroutineContext f10 = cVar.f();
        a1.b.L(f10);
        CoroutineContext coroutineContext = this.f15412o;
        if (coroutineContext != f10) {
            if (!(coroutineContext instanceof ma.d)) {
                if (((Number) f10.J(0, new SafeCollector_commonKt$checkContext$result$1(this))).intValue() == this.n) {
                    this.f15412o = f10;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f15411m + ",\n\t\tbut emission happened in " + f10 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(kotlin.text.a.N0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((ma.d) coroutineContext).f16031i + ", but then emission attempt of value '" + t10 + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.f15413p = cVar;
        Object O = SafeCollectorKt.f15415a.O(this.f15410l, t10, this);
        if (!v7.g.a(O, CoroutineSingletons.COROUTINE_SUSPENDED)) {
            this.f15413p = null;
        }
        return O;
    }
}
