package q8;

import r8.r;
import u8.h;

/* loaded from: classes.dex */
public final class d implements u8.h {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f16949a;

    public d(ClassLoader classLoader) {
        this.f16949a = classLoader;
    }

    @Override // u8.h
    public final r a(h9.c cVar) {
        v7.g.f(cVar, "fqName");
        return new r(cVar);
    }

    @Override // u8.h
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a b(h.a aVar) {
        h9.b bVar = aVar.f17847a;
        h9.c h10 = bVar.h();
        v7.g.e(h10, "classId.packageFqName");
        String V0 = ha.i.V0(bVar.i().b(), '.', '$');
        if (!h10.d()) {
            V0 = h10.b() + '.' + V0;
        }
        Class E1 = m0.b.E1(this.f16949a, V0);
        if (E1 != null) {
            return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a(E1);
        }
        return null;
    }

    @Override // u8.h
    public final void c(h9.c cVar) {
        v7.g.f(cVar, "packageFqName");
    }
}
