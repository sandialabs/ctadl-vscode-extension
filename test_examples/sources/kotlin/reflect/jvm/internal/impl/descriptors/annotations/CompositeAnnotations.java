package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import ga.f;
import h9.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import m8.e;
import v7.g;

/* loaded from: classes.dex */
public final class CompositeAnnotations implements e {

    /* renamed from: i  reason: collision with root package name */
    public final List<e> f13481i;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(List<? extends e> list) {
        g.f(list, "delegates");
        this.f13481i = list;
    }

    public CompositeAnnotations(e... eVarArr) {
        this(b.w2(eVarArr));
    }

    @Override // m8.e
    public final boolean i(c cVar) {
        g.f(cVar, "fqName");
        Iterator<Object> it = kotlin.collections.c.g2(this.f13481i).iterator();
        while (it.hasNext()) {
            if (((e) it.next()).i(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // m8.e
    public final boolean isEmpty() {
        List<e> list = this.f13481i;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (e eVar : list) {
            if (!eVar.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<m8.c> iterator() {
        return new f.a(kotlin.sequences.a.V0(kotlin.collections.c.g2(this.f13481i), CompositeAnnotations$iterator$1.f13483j));
    }

    @Override // m8.e
    public final m8.c j(c cVar) {
        g.f(cVar, "fqName");
        return (m8.c) kotlin.sequences.a.U0(kotlin.sequences.a.X0(kotlin.collections.c.g2(this.f13481i), new CompositeAnnotations$findAnnotation$1(cVar)));
    }
}
