package ka;

import ja.i;
import ja.j;
import m7.n;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ i f12953i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.android.a f12954j;

    public d(j jVar, kotlinx.coroutines.android.a aVar) {
        this.f12953i = jVar;
        this.f12954j = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12953i.v(this.f12954j, n.f16010a);
    }
}
