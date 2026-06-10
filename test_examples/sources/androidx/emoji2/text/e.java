package androidx.emoji2.text;

import androidx.emoji2.text.f;

/* loaded from: classes.dex */
public final class e extends f.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.a f4979a;

    public e(f.a aVar) {
        this.f4979a = aVar;
    }

    @Override // androidx.emoji2.text.f.h
    public final void a(Throwable th) {
        this.f4979a.f4990a.d(th);
    }

    @Override // androidx.emoji2.text.f.h
    public final void b(n nVar) {
        f.a aVar = this.f4979a;
        aVar.c = nVar;
        aVar.f4989b = new j(aVar.c, new f.i(), aVar.f4990a.f4988h);
        aVar.f4990a.e();
    }
}
