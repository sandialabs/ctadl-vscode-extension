package ja;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class x0 extends u implements h0, p0 {

    /* renamed from: l  reason: collision with root package name */
    public y0 f12809l;

    public final y0 N() {
        y0 y0Var = this.f12809l;
        if (y0Var != null) {
            return y0Var;
        }
        v7.g.l("job");
        throw null;
    }

    @Override // ja.h0
    public final void a() {
        boolean z10;
        y0 N = N();
        do {
            Object i02 = N.i0();
            if (i02 instanceof x0) {
                if (i02 == this) {
                    j0 j0Var = a1.c.F;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y0.f12811i;
                        if (atomicReferenceFieldUpdater.compareAndSet(N, i02, j0Var)) {
                            z10 = true;
                            continue;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(N) != i02) {
                            z10 = false;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else if ((i02 instanceof p0) && ((p0) i02).q() != null) {
                I();
                return;
            } else {
                return;
            }
        } while (!z10);
    }

    @Override // ja.p0
    public final boolean b() {
        return true;
    }

    @Override // ja.p0
    public final c1 q() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final String toString() {
        return getClass().getSimpleName() + '@' + y.a(this) + "[job@" + y.a(N()) + ']';
    }
}
