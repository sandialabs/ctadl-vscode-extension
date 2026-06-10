package p4;

import n4.g;
import w4.s;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ s f16753i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f16754j;

    public a(b bVar, s sVar) {
        this.f16754j = bVar;
        this.f16753i = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g d5 = g.d();
        String str = b.f16755d;
        StringBuilder sb = new StringBuilder("Scheduling work ");
        s sVar = this.f16753i;
        sb.append(sVar.f18334a);
        d5.a(str, sb.toString());
        this.f16754j.f16756a.c(sVar);
    }
}
