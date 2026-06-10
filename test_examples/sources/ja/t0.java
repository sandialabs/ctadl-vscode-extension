package ja;

/* loaded from: classes.dex */
public final class t0 extends x0 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f12805m;
    public final Object n;

    public /* synthetic */ t0(int i10, Object obj) {
        this.f12805m = i10;
        this.n = obj;
    }

    @Override // ja.u
    public final void M(Throwable th) {
        Object T1;
        int i10 = this.f12805m;
        Object obj = this.n;
        switch (i10) {
            case 0:
                ((u7.l) obj).U(th);
                return;
            default:
                Object i02 = N().i0();
                j jVar = (j) obj;
                if (i02 instanceof s) {
                    T1 = m0.b.Q(((s) i02).f12801a);
                } else {
                    T1 = a1.c.T1(i02);
                }
                jVar.t(T1);
                return;
        }
    }

    @Override // u7.l
    public final /* bridge */ /* synthetic */ m7.n U(Throwable th) {
        switch (this.f12805m) {
            case 0:
                M(th);
                return m7.n.f16010a;
            default:
                M(th);
                return m7.n.f16010a;
        }
    }
}
