package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;

/* loaded from: classes.dex */
public interface h {

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b(h9.e eVar, h9.b bVar, h9.e eVar2);

        void c(Object obj, h9.e eVar);

        void d(h9.e eVar, m9.f fVar);

        a e(h9.b bVar, h9.e eVar);

        b f(h9.e eVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(m9.f fVar);

        a c(h9.b bVar);

        void d(h9.b bVar, h9.e eVar);

        void e(Object obj);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        a b(h9.b bVar, q8.b bVar2);
    }

    KotlinClassHeader a();

    String b();

    void c(kotlin.reflect.jvm.internal.impl.load.kotlin.a aVar);

    h9.b d();

    void e(c cVar);
}
