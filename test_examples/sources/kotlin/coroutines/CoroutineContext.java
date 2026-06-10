package kotlin.coroutines;

import u7.p;
import v7.g;

/* loaded from: classes.dex */
public interface CoroutineContext {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
            g.f(coroutineContext2, "context");
            return coroutineContext2 == EmptyCoroutineContext.f13021i ? coroutineContext : (CoroutineContext) coroutineContext2.J(coroutineContext, CoroutineContext$plus$1.f13020j);
        }
    }

    /* loaded from: classes.dex */
    public interface a extends CoroutineContext {

        /* renamed from: kotlin.coroutines.CoroutineContext$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0140a {
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends a> E a(a aVar, b<E> bVar) {
                g.f(bVar, "key");
                if (g.a(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            public static CoroutineContext b(a aVar, b<?> bVar) {
                g.f(bVar, "key");
                return g.a(aVar.getKey(), bVar) ? EmptyCoroutineContext.f13021i : aVar;
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        <E extends a> E a(b<E> bVar);

        b<?> getKey();
    }

    /* loaded from: classes.dex */
    public interface b<E extends a> {
    }

    <R> R J(R r3, p<? super R, ? super a, ? extends R> pVar);

    CoroutineContext N(b<?> bVar);

    <E extends a> E a(b<E> bVar);

    CoroutineContext m(CoroutineContext coroutineContext);
}
