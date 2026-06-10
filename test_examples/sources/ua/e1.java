package ua;

/* loaded from: classes.dex */
public final class e1<T> implements qa.b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final qa.b<T> f17966a;

    /* renamed from: b  reason: collision with root package name */
    public final n1 f17967b;

    public e1(qa.b<T> bVar) {
        this.f17966a = bVar;
        this.f17967b = new n1(bVar.a());
    }

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return this.f17967b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, T t10) {
        v7.g.f(dVar, "encoder");
        if (t10 == null) {
            dVar.j();
            return;
        }
        dVar.Z();
        dVar.a0(this.f17966a, t10);
    }

    @Override // qa.a
    public final T e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        if (cVar.o()) {
            return (T) cVar.J(this.f17966a);
        }
        cVar.W();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e1.class == obj.getClass() && v7.g.a(this.f17966a, ((e1) obj).f17966a);
    }

    public final int hashCode() {
        return this.f17966a.hashCode();
    }
}
