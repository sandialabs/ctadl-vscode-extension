package kotlinx.coroutines.internal;

import ja.b0;
import ja.h0;
import ja.z;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public final class g extends CoroutineDispatcher implements Runnable, b0 {

    /* renamed from: k  reason: collision with root package name */
    public final CoroutineDispatcher f15479k;

    /* renamed from: l  reason: collision with root package name */
    public final int f15480l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ b0 f15481m;
    public final i<Runnable> n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f15482o;
    private volatile int runningWorkers;

    public g(kotlinx.coroutines.scheduling.k kVar, int i10) {
        b0 b0Var;
        this.f15479k = kVar;
        this.f15480l = i10;
        if (kVar instanceof b0) {
            b0Var = (b0) kVar;
        } else {
            b0Var = null;
        }
        this.f15481m = b0Var == null ? z.f12817a : b0Var;
        this.n = new i<>();
        this.f15482o = new Object();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void T(CoroutineContext coroutineContext, Runnable runnable) {
        boolean z10;
        this.n.a(runnable);
        boolean z11 = true;
        if (this.runningWorkers >= this.f15480l) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            synchronized (this.f15482o) {
                if (this.runningWorkers >= this.f15480l) {
                    z11 = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z11) {
                this.f15479k.T(this, this);
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void U(CoroutineContext coroutineContext, Runnable runnable) {
        boolean z10;
        this.n.a(runnable);
        boolean z11 = true;
        if (this.runningWorkers >= this.f15480l) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            synchronized (this.f15482o) {
                if (this.runningWorkers >= this.f15480l) {
                    z11 = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z11) {
                this.f15479k.U(this, this);
            }
        }
    }

    @Override // ja.b0
    public final h0 j(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f15481m.j(j2, runnable, coroutineContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        r1 = r4.f15482o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r4.n.c() != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r4.runningWorkers++;
        r2 = m7.n.f16010a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        monitor-exit(r1);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        while (true) {
            int i10 = 0;
            while (true) {
                Runnable d5 = this.n.d();
                if (d5 == null) {
                    break;
                }
                try {
                    d5.run();
                } catch (Throwable th) {
                    m0.b.v0(EmptyCoroutineContext.f13021i, th);
                }
                i10++;
                if (i10 >= 16 && this.f15479k.V(this)) {
                    this.f15479k.T(this, this);
                    return;
                }
            }
        }
    }

    @Override // ja.b0
    public final void v(long j2, ja.j jVar) {
        this.f15481m.v(j2, jVar);
    }
}
