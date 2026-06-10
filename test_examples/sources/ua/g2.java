package ua;

/* loaded from: classes.dex */
public final class g2 implements qa.b<m7.n> {

    /* renamed from: b  reason: collision with root package name */
    public static final g2 f17973b = new g2();

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kotlinx.serialization.internal.a<m7.n> f17974a = new kotlinx.serialization.internal.a<>(m7.n.f16010a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return this.f17974a.a();
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        m7.n nVar = (m7.n) obj;
        v7.g.f(dVar, "encoder");
        v7.g.f(nVar, "value");
        this.f17974a.b(dVar, nVar);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        this.f17974a.e(cVar);
        return m7.n.f16010a;
    }
}
