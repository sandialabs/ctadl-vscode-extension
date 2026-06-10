package ma;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.internal.p;

/* loaded from: classes.dex */
public final class e<T> extends p<T> {
    public e(p7.c cVar, CoroutineContext coroutineContext) {
        super(cVar, coroutineContext);
    }

    @Override // ja.y0
    public final boolean Z(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return V(th);
    }
}
