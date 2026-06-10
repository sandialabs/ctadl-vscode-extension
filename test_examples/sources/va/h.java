package va;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class h implements sa.e {

    /* renamed from: a  reason: collision with root package name */
    public final m7.e f18221a;

    public h(u7.a<? extends sa.e> aVar) {
        this.f18221a = kotlin.a.b(aVar);
    }

    @Override // sa.e
    public final int a(String str) {
        v7.g.f(str, "name");
        return e().a(str);
    }

    @Override // sa.e
    public final String b() {
        return e().b();
    }

    @Override // sa.e
    public final int c() {
        return e().c();
    }

    @Override // sa.e
    public final String d(int i10) {
        return e().d(i10);
    }

    public final sa.e e() {
        return (sa.e) this.f18221a.getValue();
    }

    @Override // sa.e
    public final boolean f() {
        return false;
    }

    @Override // sa.e
    public final List<Annotation> g(int i10) {
        return e().g(i10);
    }

    @Override // sa.e
    public final List<Annotation> getAnnotations() {
        return EmptyList.f12981i;
    }

    @Override // sa.e
    public final sa.h h() {
        return e().h();
    }

    @Override // sa.e
    public final boolean i() {
        return false;
    }

    @Override // sa.e
    public final sa.e j(int i10) {
        return e().j(i10);
    }

    @Override // sa.e
    public final boolean k(int i10) {
        return e().k(i10);
    }
}
