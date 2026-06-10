package ua;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class k1 implements sa.e {

    /* renamed from: a  reason: collision with root package name */
    public final String f17985a;

    /* renamed from: b  reason: collision with root package name */
    public final sa.d f17986b;

    public k1(String str, sa.d dVar) {
        v7.g.f(dVar, "kind");
        this.f17985a = str;
        this.f17986b = dVar;
    }

    @Override // sa.e
    public final int a(String str) {
        v7.g.f(str, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // sa.e
    public final String b() {
        return this.f17985a;
    }

    @Override // sa.e
    public final int c() {
        return 0;
    }

    @Override // sa.e
    public final String d(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (v7.g.a(this.f17985a, k1Var.f17985a)) {
            if (v7.g.a(this.f17986b, k1Var.f17986b)) {
                return true;
            }
        }
        return false;
    }

    @Override // sa.e
    public final boolean f() {
        return false;
    }

    @Override // sa.e
    public final List<Annotation> g(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // sa.e
    public final List<Annotation> getAnnotations() {
        return EmptyList.f12981i;
    }

    @Override // sa.e
    public final sa.h h() {
        return this.f17986b;
    }

    public final int hashCode() {
        return (this.f17986b.hashCode() * 31) + this.f17985a.hashCode();
    }

    @Override // sa.e
    public final boolean i() {
        return false;
    }

    @Override // sa.e
    public final sa.e j(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // sa.e
    public final boolean k(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return androidx.activity.e.j(new StringBuilder("PrimitiveDescriptor("), this.f17985a, ')');
    }
}
