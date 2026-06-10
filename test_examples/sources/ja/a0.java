package ja;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public class a0<T> extends a<T> implements kotlinx.coroutines.selects.b<T> {
    public a0(CoroutineContext coroutineContext, boolean z10) {
        super(coroutineContext, z10);
    }

    @Override // kotlinx.coroutines.selects.b
    public final <R> void s(kotlinx.coroutines.selects.c<? super R> cVar, u7.p<? super T, ? super p7.c<? super R>, ? extends Object> pVar) {
        v0(cVar, pVar);
    }
}
