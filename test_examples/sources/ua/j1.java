package ua;

import java.util.Iterator;
import ua.h1;

/* loaded from: classes.dex */
public abstract class j1<Element, Array, Builder extends h1<Array>> extends t<Element, Array, Builder> {

    /* renamed from: b  reason: collision with root package name */
    public final i1 f17981b;

    public j1(qa.b<Element> bVar) {
        super(bVar);
        this.f17981b = new i1(bVar.a());
    }

    @Override // ua.t, qa.b, qa.e, qa.a
    public final sa.e a() {
        return this.f17981b;
    }

    @Override // ua.t, qa.e
    public final void b(ta.d dVar, Array array) {
        v7.g.f(dVar, "encoder");
        int i10 = i(array);
        i1 i1Var = this.f17981b;
        ta.b j02 = dVar.j0(i1Var);
        p(j02, array, i10);
        j02.a(i1Var);
    }

    @Override // ua.a, qa.a
    public final Array e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        return (Array) j(cVar);
    }

    @Override // ua.a
    public final Object f() {
        return (h1) l(o());
    }

    @Override // ua.a
    public final int g(Object obj) {
        h1 h1Var = (h1) obj;
        v7.g.f(h1Var, "<this>");
        return h1Var.d();
    }

    @Override // ua.a
    public final Iterator<Element> h(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // ua.a
    public final Object m(Object obj) {
        h1 h1Var = (h1) obj;
        v7.g.f(h1Var, "<this>");
        return h1Var.a();
    }

    @Override // ua.t
    public final void n(Object obj, int i10, Object obj2) {
        v7.g.f((h1) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    public abstract Array o();

    public abstract void p(ta.b bVar, Array array, int i10);
}
