package w9;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import m8.e;

/* loaded from: classes.dex */
public class a implements m8.e {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ c8.j<Object>[] f18482j = {v7.i.c(new PropertyReference1Impl(v7.i.a(a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: i  reason: collision with root package name */
    public final x9.e f18483i;

    public a(x9.h hVar, u7.a<? extends List<? extends m8.c>> aVar) {
        v7.g.f(hVar, "storageManager");
        this.f18483i = hVar.a(aVar);
    }

    @Override // m8.e
    public final boolean i(h9.c cVar) {
        return e.b.b(this, cVar);
    }

    @Override // m8.e
    public boolean isEmpty() {
        return ((List) m0.b.u0(this.f18483i, f18482j[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<m8.c> iterator() {
        return ((List) m0.b.u0(this.f18483i, f18482j[0])).iterator();
    }

    @Override // m8.e
    public final m8.c j(h9.c cVar) {
        return e.b.a(this, cVar);
    }
}
