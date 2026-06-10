package y3;

import d.v;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p implements Executor {

    /* renamed from: i  reason: collision with root package name */
    public final Executor f18880i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayDeque<Runnable> f18881j;

    /* renamed from: k  reason: collision with root package name */
    public Runnable f18882k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f18883l;

    public p(Executor executor) {
        v7.g.f(executor, "executor");
        this.f18880i = executor;
        this.f18881j = new ArrayDeque<>();
        this.f18883l = new Object();
    }

    public final void a() {
        synchronized (this.f18883l) {
            Runnable poll = this.f18881j.poll();
            Runnable runnable = poll;
            this.f18882k = runnable;
            if (poll != null) {
                this.f18880i.execute(runnable);
            }
            m7.n nVar = m7.n.f16010a;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        v7.g.f(runnable, "command");
        synchronized (this.f18883l) {
            this.f18881j.offer(new v(runnable, this));
            if (this.f18882k == null) {
                a();
            }
            m7.n nVar = m7.n.f16010a;
        }
    }
}
