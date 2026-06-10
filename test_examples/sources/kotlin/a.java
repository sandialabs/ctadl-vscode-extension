package kotlin;

import m7.e;
import v7.g;

/* loaded from: classes.dex */
public class a {
    public static final <T> e<T> a(LazyThreadSafetyMode lazyThreadSafetyMode, u7.a<? extends T> aVar) {
        g.f(aVar, "initializer");
        int ordinal = lazyThreadSafetyMode.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return new UnsafeLazyImpl(aVar);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new SafePublicationLazyImpl(aVar);
        }
        return new SynchronizedLazyImpl(aVar);
    }

    public static final <T> e<T> b(u7.a<? extends T> aVar) {
        g.f(aVar, "initializer");
        return new SynchronizedLazyImpl(aVar);
    }
}
