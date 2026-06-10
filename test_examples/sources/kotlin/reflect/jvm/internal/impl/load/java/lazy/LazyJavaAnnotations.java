package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import b9.d;
import ga.e;
import ga.p;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import m8.e;
import v7.g;
import x8.c;

/* loaded from: classes.dex */
public final class LazyJavaAnnotations implements e {

    /* renamed from: i  reason: collision with root package name */
    public final c f13688i;

    /* renamed from: j  reason: collision with root package name */
    public final d f13689j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f13690k;

    /* renamed from: l  reason: collision with root package name */
    public final x9.d<b9.a, m8.c> f13691l;

    public LazyJavaAnnotations(c cVar, d dVar, boolean z10) {
        g.f(cVar, "c");
        g.f(dVar, "annotationOwner");
        this.f13688i = cVar;
        this.f13689j = dVar;
        this.f13690k = z10;
        this.f13691l = cVar.f18762a.f18739a.h(new LazyJavaAnnotations$annotationDescriptors$1(this));
    }

    @Override // m8.e
    public final boolean i(h9.c cVar) {
        return e.b.b(this, cVar);
    }

    @Override // m8.e
    public final boolean isEmpty() {
        d dVar = this.f13689j;
        if (dVar.getAnnotations().isEmpty()) {
            dVar.s();
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<m8.c> iterator() {
        d dVar = this.f13689j;
        p W0 = kotlin.sequences.a.W0(kotlin.collections.c.g2(dVar.getAnnotations()), this.f13691l);
        h9.e eVar = v8.c.f18181a;
        return new e.a(kotlin.sequences.a.T0(kotlin.sequences.a.Y0(W0, v8.c.a(g.a.f13371m, dVar, this.f13688i))));
    }

    @Override // m8.e
    public final m8.c j(h9.c cVar) {
        m8.c U;
        v7.g.f(cVar, "fqName");
        d dVar = this.f13689j;
        b9.a j2 = dVar.j(cVar);
        if (j2 == null || (U = this.f13691l.U(j2)) == null) {
            h9.e eVar = v8.c.f18181a;
            return v8.c.a(cVar, dVar, this.f13688i);
        }
        return U;
    }
}
