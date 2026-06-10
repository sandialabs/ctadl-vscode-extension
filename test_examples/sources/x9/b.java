package x9;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class b implements g {

    /* renamed from: b  reason: collision with root package name */
    public final Lock f18767b;

    public /* synthetic */ b(int i10) {
        this(new ReentrantLock());
    }

    public b(Lock lock) {
        v7.g.f(lock, "lock");
        this.f18767b = lock;
    }

    @Override // x9.g
    public void lock() {
        this.f18767b.lock();
    }

    @Override // x9.g
    public final void unlock() {
        this.f18767b.unlock();
    }
}
