package kotlinx.coroutines;

import java.io.Closeable;
import v7.g;

/* loaded from: classes.dex */
public abstract class d extends CoroutineDispatcher implements Closeable {
    static {
        ExecutorCoroutineDispatcher$Key$1 executorCoroutineDispatcher$Key$1 = ExecutorCoroutineDispatcher$Key$1.f15155j;
        g.f(CoroutineDispatcher.f15147j, "baseKey");
        g.f(executorCoroutineDispatcher$Key$1, "safeCast");
    }
}
