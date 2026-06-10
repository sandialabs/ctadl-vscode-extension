package ma;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes.dex */
public interface f<T> extends kotlinx.coroutines.flow.b<T> {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ kotlinx.coroutines.flow.b a(f fVar, CoroutineDispatcher coroutineDispatcher, int i10, BufferOverflow bufferOverflow, int i11) {
            EmptyCoroutineContext emptyCoroutineContext = coroutineDispatcher;
            if ((i11 & 1) != 0) {
                emptyCoroutineContext = EmptyCoroutineContext.f13021i;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                bufferOverflow = BufferOverflow.SUSPEND;
            }
            return fVar.f(emptyCoroutineContext, i10, bufferOverflow);
        }
    }

    kotlinx.coroutines.flow.b<T> f(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow);
}
