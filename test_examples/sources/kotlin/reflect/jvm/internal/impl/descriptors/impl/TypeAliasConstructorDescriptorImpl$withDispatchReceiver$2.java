package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import l8.c0;
import l8.d0;
import l8.h0;
import l8.i0;
import n7.l;
import v7.g;
import x9.h;
import y9.r;

/* loaded from: classes.dex */
public final class TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2 extends Lambda implements u7.a<TypeAliasConstructorDescriptorImpl> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TypeAliasConstructorDescriptorImpl f13524j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.b f13525k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2(TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        super(0);
        this.f13524j = typeAliasConstructorDescriptorImpl;
        this.f13525k = bVar;
    }

    @Override // u7.a
    public final TypeAliasConstructorDescriptorImpl k0() {
        TypeSubstitutor e10;
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = this.f13524j;
        h hVar = typeAliasConstructorDescriptorImpl.M;
        h0 h0Var = typeAliasConstructorDescriptorImpl.N;
        kotlin.reflect.jvm.internal.impl.descriptors.b bVar = this.f13525k;
        m8.e annotations = bVar.getAnnotations();
        CallableMemberDescriptor.Kind h10 = bVar.h();
        g.e(h10, "underlyingConstructorDescriptor.kind");
        h0 h0Var2 = typeAliasConstructorDescriptorImpl.N;
        d0 j2 = h0Var2.j();
        g.e(j2, "typeAliasDescriptor.source");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(hVar, h0Var, bVar, typeAliasConstructorDescriptorImpl, annotations, h10, j2);
        TypeAliasConstructorDescriptorImpl.Q.getClass();
        o8.d dVar = null;
        if (h0Var2.n() == null) {
            e10 = null;
        } else {
            e10 = TypeSubstitutor.e(h0Var2.H0());
        }
        if (e10 == null) {
            return null;
        }
        c0 E = bVar.E();
        if (E != null) {
            dVar = E.d(e10);
        }
        o8.d dVar2 = dVar;
        List<c0> b02 = bVar.b0();
        g.e(b02, "underlyingConstructorDes…contextReceiverParameters");
        ArrayList arrayList = new ArrayList(l.Z1(b02, 10));
        for (c0 c0Var : b02) {
            arrayList.add(c0Var.d(e10));
        }
        List<i0> x3 = h0Var2.x();
        List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = typeAliasConstructorDescriptorImpl.m();
        r rVar = typeAliasConstructorDescriptorImpl.f13530o;
        g.c(rVar);
        typeAliasConstructorDescriptorImpl2.V0(null, dVar2, arrayList, x3, m10, rVar, Modality.FINAL, h0Var2.g());
        return typeAliasConstructorDescriptorImpl2;
    }
}
