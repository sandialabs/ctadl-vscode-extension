package kotlin.reflect.jvm.internal.impl.types.checker;

import androidx.datastore.preferences.protobuf.k;
import java.util.Collection;
import l8.s;
import y9.r;

/* loaded from: classes.dex */
public abstract class e extends k {

    /* loaded from: classes.dex */
    public static final class a extends e {

        /* renamed from: i  reason: collision with root package name */
        public static final a f14998i = new a();

        @Override // androidx.datastore.preferences.protobuf.k
        public final r H0(ba.f fVar) {
            v7.g.f(fVar, "type");
            return (r) fVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
        public final void L0(h9.b bVar) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
        public final void M0(s sVar) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
        public final void N0(l8.d dVar) {
            v7.g.f(dVar, "descriptor");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
        public final Collection<r> O0(l8.b bVar) {
            v7.g.f(bVar, "classDescriptor");
            Collection<r> f10 = bVar.o().f();
            v7.g.e(f10, "classDescriptor.typeConstructor.supertypes");
            return f10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.e
        public final r P0(ba.f fVar) {
            v7.g.f(fVar, "type");
            return (r) fVar;
        }
    }

    public abstract void L0(h9.b bVar);

    public abstract void M0(s sVar);

    public abstract void N0(l8.d dVar);

    public abstract Collection<r> O0(l8.b bVar);

    public abstract r P0(ba.f fVar);
}
