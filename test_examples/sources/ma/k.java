package ma;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class k<T> implements p7.c<T>, q7.b {

    /* renamed from: i  reason: collision with root package name */
    public final p7.c<T> f16058i;

    /* renamed from: j  reason: collision with root package name */
    public final CoroutineContext f16059j;

    /* JADX WARN: Multi-variable type inference failed */
    public k(p7.c<? super T> cVar, CoroutineContext coroutineContext) {
        this.f16058i = cVar;
        this.f16059j = coroutineContext;
    }

    @Override // p7.c
    public final CoroutineContext f() {
        return this.f16059j;
    }

    @Override // q7.b
    public final q7.b g() {
        p7.c<T> cVar = this.f16058i;
        if (cVar instanceof q7.b) {
            return (q7.b) cVar;
        }
        return null;
    }

    @Override // p7.c
    public final void t(Object obj) {
        this.f16058i.t(obj);
    }
}
