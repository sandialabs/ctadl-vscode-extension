package m8;

import java.util.Iterator;
import java.util.List;
import m8.e;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: i  reason: collision with root package name */
    public final List<c> f16015i;

    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends c> list) {
        this.f16015i = list;
    }

    @Override // m8.e
    public final boolean i(h9.c cVar) {
        return e.b.b(this, cVar);
    }

    @Override // m8.e
    public final boolean isEmpty() {
        return this.f16015i.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<c> iterator() {
        return this.f16015i.iterator();
    }

    @Override // m8.e
    public final c j(h9.c cVar) {
        return e.b.a(this, cVar);
    }

    public final String toString() {
        return this.f16015i.toString();
    }
}
