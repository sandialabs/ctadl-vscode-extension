package w2;

import android.os.Handler;
import q2.e;
import w2.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ma.i f18264a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f18265b;

    public c(e.a aVar, Handler handler) {
        this.f18264a = aVar;
        this.f18265b = handler;
    }

    public final void a(j.a aVar) {
        boolean z10;
        int i10 = aVar.f18283b;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Handler handler = this.f18265b;
        ma.i iVar = this.f18264a;
        if (z10) {
            handler.post(new a(iVar, aVar.f18282a));
        } else {
            handler.post(new b(iVar, i10));
        }
    }
}
