package aa;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.q;
import l8.c0;
import l8.d0;
import l8.k;
import l8.l;
import l8.m;
import m8.e;
import o8.g0;
import y9.r;

/* loaded from: classes.dex */
public final class b extends g0 {

    /* loaded from: classes.dex */
    public static final class a implements e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> {
        public a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a a() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a b(EmptyList emptyList) {
            v7.g.f(emptyList, "parameters");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final kotlin.reflect.jvm.internal.impl.descriptors.g build() {
            return b.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> c(l8.f fVar) {
            v7.g.f(fVar, "owner");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> d(List<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> list) {
            v7.g.f(list, "parameters");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> e(q qVar) {
            v7.g.f(qVar, "substitution");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a f(Boolean bool) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> g(m8.e eVar) {
            v7.g.f(eVar, "additionalAnnotations");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a h(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> i(c0 c0Var) {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> j() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> k(Modality modality) {
            v7.g.f(modality, "modality");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> l(CallableMemberDescriptor.Kind kind) {
            v7.g.f(kind, "kind");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> m(r rVar) {
            v7.g.f(rVar, "type");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> n() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> o() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> p(h9.e eVar) {
            v7.g.f(eVar, "name");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> q(m mVar) {
            v7.g.f(mVar, "visibility");
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> r() {
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(aa.a aVar) {
        super(aVar, null, e.a.f16014a, h9.e.m("<Error function>"), CallableMemberDescriptor.Kind.DECLARATION, d0.f15835a);
        v7.g.f(aVar, "containingDeclaration");
        EmptyList emptyList = EmptyList.f12981i;
        V0(null, null, emptyList, emptyList, emptyList, h.c(ErrorTypeKind.RETURN_TYPE_FOR_FUNCTION, new String[0]), Modality.OPEN, l.f15842e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    public final <V> V L(a.InterfaceC0150a<V> interfaceC0150a) {
        return null;
    }

    @Override // o8.g0, kotlin.reflect.jvm.internal.impl.descriptors.impl.b
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e M0(l8.f fVar, Modality modality, k kVar) {
        b1(fVar, modality, kVar);
        return this;
    }

    @Override // o8.g0, kotlin.reflect.jvm.internal.impl.descriptors.impl.b
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.b S0(CallableMemberDescriptor.Kind kind, l8.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, d0 d0Var, m8.e eVar2, h9.e eVar3) {
        v7.g.f(fVar, "newOwner");
        v7.g.f(kind, "kind");
        v7.g.f(eVar2, "annotations");
        return this;
    }

    @Override // o8.g0
    public final kotlin.reflect.jvm.internal.impl.descriptors.g b1(l8.f fVar, Modality modality, k kVar) {
        v7.g.f(fVar, "newOwner");
        v7.g.f(kVar, "visibility");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean r0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void s0(Collection<? extends CallableMemberDescriptor> collection) {
        v7.g.f(collection, "overriddenDescriptors");
    }

    @Override // o8.g0, kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.g
    public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.g> v() {
        return new a();
    }

    @Override // o8.g0, kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final /* bridge */ /* synthetic */ CallableMemberDescriptor y0(l8.f fVar, Modality modality, k kVar) {
        b1(fVar, modality, kVar);
        return this;
    }
}
