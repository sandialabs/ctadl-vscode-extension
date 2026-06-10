package v4;

import ma.i;
import w4.s;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f18155i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.foreground.a f18156j;

    public b(androidx.work.impl.foreground.a aVar, String str) {
        this.f18156j = aVar;
        this.f18155i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s b5 = this.f18156j.f6285i.f16284f.b(this.f18155i);
        if (b5 != null && b5.b()) {
            synchronized (this.f18156j.f6287k) {
                this.f18156j.n.put(i.x(b5), b5);
                this.f18156j.f6290o.add(b5);
                androidx.work.impl.foreground.a aVar = this.f18156j;
                aVar.f6291p.d(aVar.f6290o);
            }
        }
    }
}
