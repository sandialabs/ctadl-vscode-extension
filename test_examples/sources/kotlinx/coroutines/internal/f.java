package kotlinx.coroutines.internal;

import ja.d0;
import ja.k0;
import ja.n1;
import ja.y;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public final class f<T> extends d0<T> implements q7.b, p7.c<T> {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15475p = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: l  reason: collision with root package name */
    public final CoroutineDispatcher f15476l;

    /* renamed from: m  reason: collision with root package name */
    public final p7.c<T> f15477m;
    public Object n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f15478o;

    public f(CoroutineDispatcher coroutineDispatcher, ContinuationImpl continuationImpl) {
        super(-1);
        this.f15476l = coroutineDispatcher;
        this.f15477m = continuationImpl;
        this.n = a1.b.Q0;
        this.f15478o = ThreadContextKt.b(f());
        this._reusableCancellableContinuation = null;
    }

    @Override // ja.d0
    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof ja.t) {
            ((ja.t) obj).f12804b.U(cancellationException);
        }
    }

    @Override // ja.d0
    public final p7.c<T> c() {
        return this;
    }

    @Override // p7.c
    public final CoroutineContext f() {
        return this.f15477m.f();
    }

    @Override // q7.b
    public final q7.b g() {
        p7.c<T> cVar = this.f15477m;
        if (cVar instanceof q7.b) {
            return (q7.b) cVar;
        }
        return null;
    }

    @Override // ja.d0
    public final Object i() {
        Object obj = this.n;
        this.n = a1.b.Q0;
        return obj;
    }

    public final ja.j<T> j() {
        boolean z10;
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            r rVar = a1.b.R0;
            if (obj == null) {
                this._reusableCancellableContinuation = rVar;
                return null;
            } else if (obj instanceof ja.j) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15475p;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return (ja.j) obj;
                }
            } else if (obj != rVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean k() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean l(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            r rVar = a1.b.R0;
            boolean z10 = false;
            boolean z11 = true;
            if (v7.g.a(obj, rVar)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15475p;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, th)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15475p;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z11 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z11) {
                    return false;
                }
            }
        }
    }

    public final void m() {
        ja.j jVar;
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof ja.j) {
            jVar = (ja.j) obj;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            jVar.m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0019, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Throwable p(ja.i<?> iVar) {
        boolean z10;
        do {
            Object obj = this._reusableCancellableContinuation;
            r rVar = a1.b.R0;
            z10 = false;
            if (obj != rVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15475p;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15475p;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar, iVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != rVar) {
                        break;
                    }
                } else {
                    z10 = true;
                    continue;
                    break;
                }
            }
        } while (!z10);
        return null;
    }

    @Override // p7.c
    public final void t(Object obj) {
        Object sVar;
        p7.c<T> cVar = this.f15477m;
        CoroutineContext f10 = cVar.f();
        Throwable a10 = Result.a(obj);
        if (a10 == null) {
            sVar = obj;
        } else {
            sVar = new ja.s(a10, false);
        }
        CoroutineDispatcher coroutineDispatcher = this.f15476l;
        if (coroutineDispatcher.V(f10)) {
            this.n = sVar;
            this.f12761k = 0;
            coroutineDispatcher.T(f10, this);
            return;
        }
        k0 a11 = n1.a();
        if (a11.Z()) {
            this.n = sVar;
            this.f12761k = 0;
            a11.X(this);
            return;
        }
        a11.Y(true);
        try {
            CoroutineContext f11 = f();
            Object c = ThreadContextKt.c(f11, this.f15478o);
            cVar.t(obj);
            m7.n nVar = m7.n.f16010a;
            ThreadContextKt.a(f11, c);
            do {
            } while (a11.b0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f15476l + ", " + y.b(this.f15477m) + ']';
    }
}
