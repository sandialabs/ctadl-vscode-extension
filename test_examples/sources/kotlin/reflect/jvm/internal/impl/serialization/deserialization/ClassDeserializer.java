package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.g;

/* loaded from: classes.dex */
public final class ClassDeserializer {
    public static final Set<h9.b> c = a1.c.v1(h9.b.l(g.a.c.h()));

    /* renamed from: a  reason: collision with root package name */
    public final u9.e f14763a;

    /* renamed from: b  reason: collision with root package name */
    public final x9.d f14764b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final h9.b f14765a;

        /* renamed from: b  reason: collision with root package name */
        public final u9.b f14766b;

        public a(h9.b bVar, u9.b bVar2) {
            v7.g.f(bVar, "classId");
            this.f14765a = bVar;
            this.f14766b = bVar2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (v7.g.a(this.f14765a, ((a) obj).f14765a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f14765a.hashCode();
        }
    }

    public ClassDeserializer(u9.e eVar) {
        v7.g.f(eVar, "components");
        this.f14763a = eVar;
        this.f14764b = eVar.f17901a.h(new ClassDeserializer$classes$1(this));
    }

    public final l8.b a(h9.b bVar, u9.b bVar2) {
        v7.g.f(bVar, "classId");
        return (l8.b) this.f14764b.U(new a(bVar, bVar2));
    }
}
