package sa;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final e f17514a;

    /* renamed from: b  reason: collision with root package name */
    public final c8.b<?> f17515b;
    public final String c;

    public b(SerialDescriptorImpl serialDescriptorImpl, c8.b bVar) {
        this.f17514a = serialDescriptorImpl;
        this.f17515b = bVar;
        this.c = serialDescriptorImpl.f15595a + '<' + bVar.d() + '>';
    }

    @Override // sa.e
    public final int a(String str) {
        v7.g.f(str, "name");
        return this.f17514a.a(str);
    }

    @Override // sa.e
    public final String b() {
        return this.c;
    }

    @Override // sa.e
    public final int c() {
        return this.f17514a.c();
    }

    @Override // sa.e
    public final String d(int i10) {
        return this.f17514a.d(i10);
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && v7.g.a(this.f17514a, bVar.f17514a) && v7.g.a(bVar.f17515b, this.f17515b);
    }

    @Override // sa.e
    public final boolean f() {
        return this.f17514a.f();
    }

    @Override // sa.e
    public final List<Annotation> g(int i10) {
        return this.f17514a.g(i10);
    }

    @Override // sa.e
    public final List<Annotation> getAnnotations() {
        return this.f17514a.getAnnotations();
    }

    @Override // sa.e
    public final h h() {
        return this.f17514a.h();
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.f17515b.hashCode() * 31);
    }

    @Override // sa.e
    public final boolean i() {
        return this.f17514a.i();
    }

    @Override // sa.e
    public final e j(int i10) {
        return this.f17514a.j(i10);
    }

    @Override // sa.e
    public final boolean k(int i10) {
        return this.f17514a.k(i10);
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f17515b + ", original: " + this.f17514a + ')';
    }
}
