package x4;

import androidx.work.WorkerParameters;
import o4.a0;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final a0 f18600i;

    /* renamed from: j  reason: collision with root package name */
    public final o4.t f18601j;

    /* renamed from: k  reason: collision with root package name */
    public final WorkerParameters.a f18602k;

    public p(a0 a0Var, o4.t tVar, WorkerParameters.a aVar) {
        this.f18600i = a0Var;
        this.f18601j = tVar;
        this.f18602k = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18600i.f16284f.j(this.f18601j, this.f18602k);
    }
}
