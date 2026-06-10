package o4;

import androidx.work.impl.utils.futures.AbstractFuture;

/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ m6.a f16290i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ d0 f16291j;

    public b0(d0 d0Var, androidx.work.impl.utils.futures.a aVar) {
        this.f16291j = d0Var;
        this.f16290i = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f16291j.f16309x.f6306i instanceof AbstractFuture.b) {
            return;
        }
        try {
            this.f16290i.get();
            n4.g d5 = n4.g.d();
            String str = d0.f16294z;
            d5.a(str, "Starting work for " + this.f16291j.f16298l.c);
            d0 d0Var = this.f16291j;
            d0Var.f16309x.k(d0Var.f16299m.g());
        } catch (Throwable th) {
            this.f16291j.f16309x.j(th);
        }
    }
}
