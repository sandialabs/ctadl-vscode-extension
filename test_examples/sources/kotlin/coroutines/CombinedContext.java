package kotlin.coroutines;

import androidx.activity.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CombinedContext implements CoroutineContext, Serializable {

    /* renamed from: i  reason: collision with root package name */
    public final CoroutineContext f13017i;

    /* renamed from: j  reason: collision with root package name */
    public final CoroutineContext.a f13018j;

    public CombinedContext(CoroutineContext.a aVar, CoroutineContext coroutineContext) {
        g.f(coroutineContext, "left");
        g.f(aVar, "element");
        this.f13017i = coroutineContext;
        this.f13018j = aVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R J(R r3, p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        g.f(pVar, "operation");
        return pVar.R((Object) this.f13017i.J(r3, pVar), this.f13018j);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext N(CoroutineContext.b<?> bVar) {
        g.f(bVar, "key");
        CoroutineContext.a aVar = this.f13018j;
        CoroutineContext.a a10 = aVar.a(bVar);
        CoroutineContext coroutineContext = this.f13017i;
        if (a10 != null) {
            return coroutineContext;
        }
        CoroutineContext N = coroutineContext.N(bVar);
        return N == coroutineContext ? this : N == EmptyCoroutineContext.f13021i ? aVar : new CombinedContext(aVar, N);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.a> E a(CoroutineContext.b<E> bVar) {
        g.f(bVar, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e10 = (E) combinedContext.f13018j.a(bVar);
            if (e10 != null) {
                return e10;
            }
            CoroutineContext coroutineContext = combinedContext.f13017i;
            if (!(coroutineContext instanceof CombinedContext)) {
                return (E) coroutineContext.a(bVar);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (!(obj instanceof CombinedContext)) {
                return false;
            }
            CombinedContext combinedContext = (CombinedContext) obj;
            combinedContext.getClass();
            int i10 = 2;
            CombinedContext combinedContext2 = combinedContext;
            int i11 = 2;
            while (true) {
                CoroutineContext coroutineContext = combinedContext2.f13017i;
                if (coroutineContext instanceof CombinedContext) {
                    combinedContext2 = (CombinedContext) coroutineContext;
                } else {
                    combinedContext2 = null;
                }
                if (combinedContext2 == null) {
                    break;
                }
                i11++;
            }
            CombinedContext combinedContext3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = combinedContext3.f13017i;
                if (coroutineContext2 instanceof CombinedContext) {
                    combinedContext3 = (CombinedContext) coroutineContext2;
                } else {
                    combinedContext3 = null;
                }
                if (combinedContext3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 != i10) {
                return false;
            }
            CombinedContext combinedContext4 = this;
            while (true) {
                CoroutineContext.a aVar = combinedContext4.f13018j;
                if (!g.a(combinedContext.a(aVar.getKey()), aVar)) {
                    z10 = false;
                    break;
                }
                CoroutineContext coroutineContext3 = combinedContext4.f13017i;
                if (coroutineContext3 instanceof CombinedContext) {
                    combinedContext4 = (CombinedContext) coroutineContext3;
                } else {
                    g.d(coroutineContext3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    CoroutineContext.a aVar2 = (CoroutineContext.a) coroutineContext3;
                    z10 = g.a(combinedContext.a(aVar2.getKey()), aVar2);
                    break;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f13018j.hashCode() + this.f13017i.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext m(CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.a(this, coroutineContext);
    }

    public final String toString() {
        return e.j(new StringBuilder("["), (String) J("", CombinedContext$toString$1.f13019j), ']');
    }
}
