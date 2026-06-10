package ua;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m1<ElementKlass, Element extends ElementKlass> extends t<Element, Element[], ArrayList<Element>> {

    /* renamed from: b  reason: collision with root package name */
    public final c8.b<ElementKlass> f17991b;
    public final c c;

    public m1(c8.b<ElementKlass> bVar, qa.b<Element> bVar2) {
        super(bVar2);
        this.f17991b = bVar;
        this.c = new c(bVar2.a(), 0);
    }

    @Override // ua.t, qa.b, qa.e, qa.a
    public final sa.e a() {
        return this.c;
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
    public final Iterator h(Object obj) {
        Object[] objArr = (Object[]) obj;
        v7.g.f(objArr, "<this>");
        return m0.b.K0(objArr);
    }

    @Override // ua.a
    public final int i(Object obj) {
        Object[] objArr = (Object[]) obj;
        v7.g.f(objArr, "<this>");
        return objArr.length;
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
        c8.b<ElementKlass> bVar = this.f17991b;
        v7.g.f(bVar, "eClass");
        Object newInstance = Array.newInstance(a1.c.y0(bVar), arrayList.size());
        v7.g.d(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        v7.g.e(array, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return array;
    }

    @Override // ua.t
    public final void n(Object obj, int i10, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        v7.g.f(arrayList, "<this>");
        arrayList.add(i10, obj2);
    }
}
