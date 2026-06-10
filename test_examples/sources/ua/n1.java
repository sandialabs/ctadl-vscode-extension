package ua;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class n1 implements sa.e, m {

    /* renamed from: a  reason: collision with root package name */
    public final sa.e f17995a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17996b;
    public final Set<String> c;

    public n1(sa.e eVar) {
        v7.g.f(eVar, "original");
        this.f17995a = eVar;
        this.f17996b = eVar.b() + '?';
        this.c = m0.b.z(eVar);
    }

    @Override // sa.e
    public final int a(String str) {
        v7.g.f(str, "name");
        return this.f17995a.a(str);
    }

    @Override // sa.e
    public final String b() {
        return this.f17996b;
    }

    @Override // sa.e
    public final int c() {
        return this.f17995a.c();
    }

    @Override // sa.e
    public final String d(int i10) {
        return this.f17995a.d(i10);
    }

    @Override // ua.m
    public final Set<String> e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n1) {
            return v7.g.a(this.f17995a, ((n1) obj).f17995a);
        }
        return false;
    }

    @Override // sa.e
    public final boolean f() {
        return true;
    }

    @Override // sa.e
    public final List<Annotation> g(int i10) {
        return this.f17995a.g(i10);
    }

    @Override // sa.e
    public final List<Annotation> getAnnotations() {
        return this.f17995a.getAnnotations();
    }

    @Override // sa.e
    public final sa.h h() {
        return this.f17995a.h();
    }

    public final int hashCode() {
        return this.f17995a.hashCode() * 31;
    }

    @Override // sa.e
    public final boolean i() {
        return this.f17995a.i();
    }

    @Override // sa.e
    public final sa.e j(int i10) {
        return this.f17995a.j(i10);
    }

    @Override // sa.e
    public final boolean k(int i10) {
        return this.f17995a.k(i10);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17995a);
        sb.append('?');
        return sb.toString();
    }
}
