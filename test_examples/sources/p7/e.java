package p7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class e<T> implements c<T>, q7.b {
    @Deprecated

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<e<?>, Object> f16778j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "result");

    /* renamed from: i  reason: collision with root package name */
    public final c<T> f16779i;
    private volatile Object result;

    public e(c cVar) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        this.f16779i = cVar;
        this.result = coroutineSingletons;
    }

    @Override // p7.c
    public final CoroutineContext f() {
        return this.f16779i.f();
    }

    @Override // q7.b
    public final q7.b g() {
        c<T> cVar = this.f16779i;
        if (cVar instanceof q7.b) {
            return (q7.b) cVar;
        }
        return null;
    }

    @Override // p7.c
    public final void t(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            boolean z10 = false;
            if (obj2 == coroutineSingletons) {
                AtomicReferenceFieldUpdater<e<?>, Object> atomicReferenceFieldUpdater = f16778j;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, obj)) {
                        if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj2 != coroutineSingletons2) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater<e<?>, Object> atomicReferenceFieldUpdater2 = f16778j;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.RESUMED;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons2, coroutineSingletons3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons2) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    this.f16779i.t(obj);
                    return;
                }
            }
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f16779i;
    }
}
