package la;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes.dex */
public interface m<E> {
    Object E();

    Object L(SuspendLambda suspendLambda);

    void c(CancellationException cancellationException);

    e<E> iterator();

    Object k(p7.c<? super f<? extends E>> cVar);

    kotlinx.coroutines.selects.b<f<E>> x();
}
