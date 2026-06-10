package ja;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class c0<T> extends kotlinx.coroutines.internal.p<T> {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12758l = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public c0(p7.c cVar, CoroutineContext coroutineContext) {
        super(cVar, coroutineContext);
        this._decision = 0;
    }

    @Override // kotlinx.coroutines.internal.p, ja.a
    public final void A0(Object obj) {
        boolean z10;
        while (true) {
            int i10 = this._decision;
            z10 = true;
            if (i10 != 0) {
                if (i10 == 1) {
                    z10 = false;
                } else {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (f12758l.compareAndSet(this, 0, 2)) {
                break;
            }
        }
        if (z10) {
            return;
        }
        a1.b.z0(m0.b.y0(this.f15493k), a1.b.x0(obj), null);
    }

    public final Object E0() {
        boolean z10;
        while (true) {
            int i10 = this._decision;
            z10 = false;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
            } else if (f12758l.compareAndSet(this, 0, 1)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        Object T1 = a1.c.T1(i0());
        if (!(T1 instanceof s)) {
            return T1;
        }
        throw ((s) T1).f12801a;
    }

    @Override // kotlinx.coroutines.internal.p, ja.y0
    public final void Q(Object obj) {
        A0(obj);
    }
}
