package ua;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class t0<E> extends u<E, Set<? extends E>, LinkedHashSet<E>> {

    /* renamed from: b  reason: collision with root package name */
    public final s0 f18013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(qa.b<E> bVar) {
        super(bVar);
        v7.g.f(bVar, "eSerializer");
        this.f18013b = new s0(bVar.a());
    }

    @Override // ua.t, qa.b, qa.e, qa.a
    public final sa.e a() {
        return this.f18013b;
    }

    @Override // ua.a
    public final Object f() {
        return new LinkedHashSet();
    }

    @Override // ua.a
    public final int g(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        v7.g.f(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // ua.a
    public final Object l(Object obj) {
        v7.g.f(null, "<this>");
        throw null;
    }

    @Override // ua.a
    public final Object m(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        v7.g.f(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // ua.t
    public final void n(Object obj, int i10, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        v7.g.f(linkedHashSet, "<this>");
        linkedHashSet.add(obj2);
    }
}
