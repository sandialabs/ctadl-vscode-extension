package aa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import l8.b0;
import l8.d0;
import l8.i0;
import l8.k;
import l8.l;
import l8.m;
import l8.n;
import l8.z;
import o8.c0;
import y9.r;

/* loaded from: classes.dex */
public final class d implements z {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ c0 f395i;

    public d() {
        h hVar = h.f405a;
        c0 T0 = c0.T0(h.c, Modality.OPEN, l.f15842e, true, h9.e.m("<Error property>"), CallableMemberDescriptor.Kind.DECLARATION, d0.f15835a);
        f fVar = h.f408e;
        EmptyList emptyList = EmptyList.f12981i;
        T0.Y0(fVar, emptyList, null, null, emptyList);
        this.f395i = T0;
    }

    @Override // l8.r
    public final boolean D() {
        return this.f395i.D();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final l8.c0 E() {
        return this.f395i.C;
    }

    @Override // l8.l0
    public final boolean I() {
        return this.f395i.f16400w;
    }

    @Override // l8.l0
    public final m9.g<?> J0() {
        return this.f395i.J0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final <V> V L(a.InterfaceC0150a<V> interfaceC0150a) {
        this.f395i.getClass();
        return null;
    }

    @Override // l8.r
    public final boolean L0() {
        return this.f395i.f16402y;
    }

    @Override // l8.l0
    public final boolean M() {
        return this.f395i.n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final l8.c0 R() {
        return this.f395i.D;
    }

    @Override // l8.z
    public final n U() {
        return this.f395i.I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final boolean Z() {
        return this.f395i.Z();
    }

    @Override // l8.z, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a, l8.f
    public final z a() {
        return this.f395i.z0();
    }

    @Override // l8.z
    public final n a0() {
        return this.f395i.H;
    }

    @Override // l8.k0
    public final r b() {
        return this.f395i.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final List<l8.c0> b0() {
        return this.f395i.b0();
    }

    @Override // l8.g, l8.f
    public final l8.f c() {
        return this.f395i.c();
    }

    @Override // l8.z, l8.f0
    public final z d(TypeSubstitutor typeSubstitutor) {
        v7.g.f(typeSubstitutor, "substitutor");
        return this.f395i.d(typeSubstitutor);
    }

    @Override // l8.z, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    public final Collection<? extends z> f() {
        return this.f395i.f();
    }

    @Override // l8.l0
    public final boolean f0() {
        return this.f395i.f16399v;
    }

    @Override // l8.j, l8.r
    public final m g() {
        return this.f395i.g();
    }

    @Override // m8.a
    public final m8.e getAnnotations() {
        m8.e annotations = this.f395i.getAnnotations();
        v7.g.e(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // l8.f
    public final h9.e getName() {
        return this.f395i.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final List<i0> getTypeParameters() {
        return this.f395i.getTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor.Kind h() {
        return this.f395i.h();
    }

    @Override // l8.i
    public final d0 j() {
        return this.f395i.j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final r k() {
        return this.f395i.k();
    }

    @Override // l8.z
    public final b0 l() {
        return this.f395i.G;
    }

    @Override // l8.r
    public final boolean l0() {
        return this.f395i.f16401x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.h> m() {
        return this.f395i.m();
    }

    @Override // l8.f
    public final <R, D> R n0(l8.h<R, D> hVar, D d5) {
        c0 c0Var = this.f395i;
        c0Var.getClass();
        return hVar.b(c0Var, d5);
    }

    @Override // l8.r
    public final Modality p() {
        return this.f395i.p();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public final boolean p0() {
        return this.f395i.A;
    }

    @Override // l8.z
    public final o8.d0 s() {
        return this.f395i.F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void s0(Collection<? extends CallableMemberDescriptor> collection) {
        this.f395i.s0(collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor y0(l8.f fVar, Modality modality, k kVar) {
        return this.f395i.y0(fVar, modality, kVar);
    }

    @Override // l8.z
    public final ArrayList z() {
        return this.f395i.z();
    }
}
