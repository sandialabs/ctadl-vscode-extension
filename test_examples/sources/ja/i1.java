package ja;

import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public final class i1 implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final CoroutineDispatcher f12772i;

    /* renamed from: j  reason: collision with root package name */
    public final i<m7.n> f12773j;

    public i1(CoroutineDispatcher coroutineDispatcher, j jVar) {
        this.f12772i = coroutineDispatcher;
        this.f12773j = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12773j.v(this.f12772i, m7.n.f16010a);
    }
}
