package ua;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class i0<E> extends u<E, Set<? extends E>, HashSet<E>> {

    /* renamed from: b  reason: collision with root package name */
    public final c f17979b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(qa.b<E> bVar) {
        super(bVar);
        v7.g.f(bVar, "eSerializer");
        this.f17979b = new c(bVar.a(), 1);
    }

    @Override // ua.t, qa.b, qa.e, qa.a
    public final sa.e a() {
        return this.f17979b;
    }

    @Override // ua.a
    public final Object f() {
        return new HashSet();
    }

    @Override // ua.a
    public final int g(Object obj) {
        HashSet hashSet = (HashSet) obj;
        v7.g.f(hashSet, "<this>");
        return hashSet.size();
    }

    @Override // ua.a
    public final Object l(Object obj) {
        v7.g.f(null, "<this>");
        throw null;
    }

    @Override // ua.a
    public final Object m(Object obj) {
        HashSet hashSet = (HashSet) obj;
        v7.g.f(hashSet, "<this>");
        return hashSet;
    }

    @Override // ua.t
    public final void n(Object obj, int i10, Object obj2) {
        HashSet hashSet = (HashSet) obj;
        v7.g.f(hashSet, "<this>");
        hashSet.add(obj2);
    }
}
