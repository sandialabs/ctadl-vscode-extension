package kotlinx.coroutines.flow;

/* loaded from: classes.dex */
public final class q extends ma.b<p<?>> {

    /* renamed from: a  reason: collision with root package name */
    public long f15444a = -1;

    /* renamed from: b  reason: collision with root package name */
    public ja.j f15445b;

    @Override // ma.b
    public final boolean a(ma.a aVar) {
        p pVar = (p) aVar;
        if (this.f15444a >= 0) {
            return false;
        }
        long j2 = pVar.f15436q;
        if (j2 < pVar.f15437r) {
            pVar.f15437r = j2;
        }
        this.f15444a = j2;
        return true;
    }

    @Override // ma.b
    public final p7.c[] b(ma.a aVar) {
        long j2 = this.f15444a;
        this.f15444a = -1L;
        this.f15445b = null;
        return ((p) aVar).x(j2);
    }
}
