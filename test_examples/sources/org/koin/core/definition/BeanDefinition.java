package org.koin.core.definition;

import c8.b;
import java.util.List;
import kb.a;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class BeanDefinition<T> {

    /* renamed from: a  reason: collision with root package name */
    public final a f16506a;

    /* renamed from: b  reason: collision with root package name */
    public final b<?> f16507b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public final p<org.koin.core.scope.a, jb.a, T> f16508d;

    /* renamed from: e  reason: collision with root package name */
    public final Kind f16509e;

    /* renamed from: f  reason: collision with root package name */
    public List<? extends b<?>> f16510f;

    public BeanDefinition(kb.b bVar, b bVar2, p pVar, Kind kind, EmptyList emptyList) {
        g.f(bVar, "scopeQualifier");
        g.f(bVar2, "primaryType");
        g.f(pVar, "definition");
        g.f(emptyList, "secondaryTypes");
        this.f16506a = bVar;
        this.f16507b = bVar2;
        this.c = null;
        this.f16508d = pVar;
        this.f16509e = kind;
        this.f16510f = emptyList;
        new fb.a(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            BeanDefinition beanDefinition = (BeanDefinition) obj;
            return g.a(this.f16507b, beanDefinition.f16507b) && g.a(this.c, beanDefinition.c) && g.a(this.f16506a, beanDefinition.f16506a);
        }
        throw new NullPointerException("null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
    }

    public final int hashCode() {
        a aVar = this.c;
        int hashCode = aVar == null ? 0 : aVar.hashCode();
        return this.f16506a.hashCode() + ((this.f16507b.hashCode() + (hashCode * 31)) * 31);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r3 == null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String k3;
        String k10;
        String obj = this.f16509e.toString();
        String str = "'" + mb.a.a(this.f16507b) + '\'';
        String str2 = "";
        a aVar = this.c;
        if (aVar != null) {
            k3 = g.k(aVar, ",qualifier:");
        }
        k3 = "";
        a aVar2 = this.f16506a;
        if (g.a(aVar2, lb.b.c)) {
            k10 = "";
        } else {
            k10 = g.k(aVar2, ",scope:");
        }
        if (!this.f16510f.isEmpty()) {
            str2 = g.k(c.t2(this.f16510f, ",", null, null, BeanDefinition$toString$defOtherTypes$typesAsString$1.f16511j, 30), ",binds:");
        }
        return "[" + obj + ':' + str + k3 + k10 + str2 + ']';
    }
}
