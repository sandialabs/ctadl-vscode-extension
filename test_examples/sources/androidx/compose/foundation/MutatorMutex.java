package androidx.compose.foundation;

import ja.u0;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.sync.MutexImpl;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class MutatorMutex {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<a> f1547a = new AtomicReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    public final MutexImpl f1548b = new MutexImpl(false);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final MutatePriority f1549a;

        /* renamed from: b  reason: collision with root package name */
        public final u0 f1550b;

        public a(MutatePriority mutatePriority, u0 u0Var) {
            g.f(mutatePriority, "priority");
            this.f1549a = mutatePriority;
            this.f1550b = u0Var;
        }
    }

    public final <T, R> Object a(T t10, MutatePriority mutatePriority, p<? super T, ? super p7.c<? super R>, ? extends Object> pVar, p7.c<? super R> cVar) {
        return a1.b.H(new MutatorMutex$mutateWith$2(mutatePriority, this, pVar, t10, null), cVar);
    }
}
