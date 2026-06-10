package ua;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e<E> extends u<E, List<? extends E>, ArrayList<E>> {

    /* renamed from: b  reason: collision with root package name */
    public final d f17963b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qa.b<E> bVar) {
        super(bVar);
        v7.g.f(bVar, "element");
        this.f17963b = new d(bVar.a());
    }

    @Override // ua.t, qa.b, qa.e, qa.a
    public final sa.e a() {
        return this.f17963b;
    }

    @Override // ua.a
    public final Object f() {
        return new ArrayList();
    }

    @Override // ua.a
    public final int g(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        v7.g.f(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // ua.a
    public final Object l(Object obj) {
        v7.g.f(null, "<this>");
        throw null;
    }

    @Override // ua.a
    public final Object m(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        v7.g.f(arrayList, "<this>");
        return arrayList;
    }

    @Override // ua.t
    public final void n(Object obj, int i10, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        v7.g.f(arrayList, "<this>");
        arrayList.add(i10, obj2);
    }
}
