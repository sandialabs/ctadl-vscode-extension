package ja;

/* loaded from: classes.dex */
public final class r0 extends g {

    /* renamed from: i  reason: collision with root package name */
    public final u7.l<Throwable, m7.n> f12797i;

    /* JADX WARN: Multi-variable type inference failed */
    public r0(u7.l<? super Throwable, m7.n> lVar) {
        this.f12797i = lVar;
    }

    @Override // u7.l
    public final /* bridge */ /* synthetic */ m7.n U(Throwable th) {
        a(th);
        return m7.n.f16010a;
    }

    @Override // ja.h
    public final void a(Throwable th) {
        this.f12797i.U(th);
    }

    public final String toString() {
        return "InvokeOnCancel[" + this.f12797i.getClass().getSimpleName() + '@' + y.a(this) + ']';
    }
}
