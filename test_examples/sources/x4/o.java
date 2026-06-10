package x4;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class o implements Executor {

    /* renamed from: j  reason: collision with root package name */
    public final Executor f18595j;

    /* renamed from: k  reason: collision with root package name */
    public Runnable f18596k;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayDeque<a> f18594i = new ArrayDeque<>();

    /* renamed from: l  reason: collision with root package name */
    public final Object f18597l = new Object();

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final o f18598i;

        /* renamed from: j  reason: collision with root package name */
        public final Runnable f18599j;

        public a(o oVar, Runnable runnable) {
            this.f18598i = oVar;
            this.f18599j = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f18599j.run();
                synchronized (this.f18598i.f18597l) {
                    this.f18598i.b();
                }
            } catch (Throwable th) {
                synchronized (this.f18598i.f18597l) {
                    this.f18598i.b();
                    throw th;
                }
            }
        }
    }

    public o(ExecutorService executorService) {
        this.f18595j = executorService;
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f18597l) {
            z10 = !this.f18594i.isEmpty();
        }
        return z10;
    }

    public final void b() {
        a poll = this.f18594i.poll();
        this.f18596k = poll;
        if (poll != null) {
            this.f18595j.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f18597l) {
            this.f18594i.add(new a(this, runnable));
            if (this.f18596k == null) {
                b();
            }
        }
    }
}
