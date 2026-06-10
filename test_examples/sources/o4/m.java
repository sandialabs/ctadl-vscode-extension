package o4;

import n4.i;

/* loaded from: classes.dex */
public final class m implements n4.i {
    public final androidx.lifecycle.v<i.a> c = new androidx.lifecycle.v<>();

    /* renamed from: d  reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<i.a.c> f16319d = new androidx.work.impl.utils.futures.a<>();

    public m() {
        a(n4.i.f16091b);
    }

    public final void a(i.a aVar) {
        this.c.j(aVar);
        boolean z10 = aVar instanceof i.a.c;
        androidx.work.impl.utils.futures.a<i.a.c> aVar2 = this.f16319d;
        if (z10) {
            aVar2.i((i.a.c) aVar);
        } else if (aVar instanceof i.a.C0191a) {
            aVar2.j(((i.a.C0191a) aVar).f16092a);
        }
    }
}
