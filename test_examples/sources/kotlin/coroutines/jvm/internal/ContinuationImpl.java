package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import p7.c;
import p7.d;
import q7.a;
import v7.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {

    /* renamed from: j  reason: collision with root package name */
    public final CoroutineContext f13036j;

    /* renamed from: k  reason: collision with root package name */
    public transient c<Object> f13037k;

    public ContinuationImpl(c<Object> cVar) {
        this(cVar, cVar != null ? cVar.f() : null);
    }

    public ContinuationImpl(c<Object> cVar, CoroutineContext coroutineContext) {
        super(cVar);
        this.f13036j = coroutineContext;
    }

    @Override // p7.c
    public CoroutineContext f() {
        CoroutineContext coroutineContext = this.f13036j;
        g.c(coroutineContext);
        return coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void m() {
        c<?> cVar = this.f13037k;
        if (cVar != null && cVar != this) {
            CoroutineContext f10 = f();
            int i10 = d.f16776f;
            CoroutineContext.a a10 = f10.a(d.a.f16777i);
            g.c(a10);
            ((d) a10).S(cVar);
        }
        this.f13037k = a.f16941i;
    }
}
