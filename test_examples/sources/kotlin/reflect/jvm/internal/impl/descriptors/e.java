package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.q;
import l8.c0;
import l8.m;
import y9.r;

/* loaded from: classes.dex */
public interface e extends CallableMemberDescriptor {

    /* loaded from: classes.dex */
    public interface a<D extends e> {
        a a();

        a b(EmptyList emptyList);

        D build();

        a<D> c(l8.f fVar);

        a<D> d(List<h> list);

        a<D> e(q qVar);

        a f(Boolean bool);

        a<D> g(m8.e eVar);

        a h(b bVar);

        a<D> i(c0 c0Var);

        a<D> j();

        a<D> k(Modality modality);

        a<D> l(CallableMemberDescriptor.Kind kind);

        a<D> m(r rVar);

        a<D> n();

        a<D> o();

        a<D> p(h9.e eVar);

        a<D> q(m mVar);

        a<D> r();
    }

    e C();

    boolean G0();

    boolean O0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a, l8.f
    e a();

    @Override // l8.g, l8.f
    l8.f c();

    e d(TypeSubstitutor typeSubstitutor);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    Collection<? extends e> f();

    boolean i();

    boolean q0();

    boolean r0();

    boolean u0();

    a<? extends e> v();

    boolean v0();
}
