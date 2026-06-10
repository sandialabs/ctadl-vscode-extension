package ja;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public interface u0 extends CoroutineContext.a {
    public static final /* synthetic */ int c = 0;

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ h0 a(u0 u0Var, boolean z10, x0 x0Var, int i10) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return u0Var.z(z10, (i10 & 2) != 0, x0Var);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements CoroutineContext.b<u0> {

        /* renamed from: i  reason: collision with root package name */
        public static final /* synthetic */ b f12806i = new b();
    }

    CancellationException C();

    m G(y0 y0Var);

    h0 O(u7.l<? super Throwable, m7.n> lVar);

    Object R(p7.c<? super m7.n> cVar);

    boolean b();

    void c(CancellationException cancellationException);

    boolean start();

    h0 z(boolean z10, boolean z11, u7.l<? super Throwable, m7.n> lVar);
}
