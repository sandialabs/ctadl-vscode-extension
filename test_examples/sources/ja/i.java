package ja;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* loaded from: classes.dex */
public interface i<T> extends p7.c<T> {
    boolean B(Throwable th);

    kotlinx.coroutines.internal.r T(Throwable th);

    boolean b();

    kotlinx.coroutines.internal.r n(Object obj, Object obj2);

    kotlinx.coroutines.internal.r o(Object obj, LockFreeLinkedListNode.a aVar, u7.l lVar);

    void r();

    void v(CoroutineDispatcher coroutineDispatcher, m7.n nVar);
}
