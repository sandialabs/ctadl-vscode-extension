package q8;

import d9.f;
import java.io.InputStream;
import q8.e;

/* loaded from: classes.dex */
public final class f implements d9.f {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f16952a;

    /* renamed from: b  reason: collision with root package name */
    public final v9.b f16953b = new v9.b();

    public f(ClassLoader classLoader) {
        this.f16952a = classLoader;
    }

    @Override // d9.f
    public final f.a.b a(h9.b bVar) {
        e a10;
        v7.g.f(bVar, "classId");
        String V0 = ha.i.V0(bVar.i().b(), '.', '$');
        if (!bVar.h().d()) {
            V0 = bVar.h() + '.' + V0;
        }
        Class E1 = m0.b.E1(this.f16952a, V0);
        if (E1 != null && (a10 = e.a.a(E1)) != null) {
            return new f.a.b(a10);
        }
        return null;
    }

    @Override // d9.f
    public final f.a.b b(b9.g gVar) {
        e a10;
        v7.g.f(gVar, "javaClass");
        h9.c e10 = gVar.e();
        if (e10 == null) {
            return null;
        }
        Class E1 = m0.b.E1(this.f16952a, e10.b());
        if (E1 == null || (a10 = e.a.a(E1)) == null) {
            return null;
        }
        return new f.a.b(a10);
    }

    @Override // u9.m
    public final InputStream c(h9.c cVar) {
        v7.g.f(cVar, "packageFqName");
        if (cVar.h(kotlin.reflect.jvm.internal.impl.builtins.g.f13353j)) {
            v9.a.f18189m.getClass();
            String a10 = v9.a.a(cVar);
            this.f16953b.getClass();
            return v9.b.a(a10);
        }
        return null;
    }
}
