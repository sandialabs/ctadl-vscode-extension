package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import l8.d0;
import l8.f;
import l8.l;
import l8.l0;
import l8.m;
import n7.l;
import o8.k0;
import v7.g;
import y9.r;

/* loaded from: classes.dex */
public class e extends k0 implements h {
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f13576o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f13577p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f13578q;

    /* renamed from: r  reason: collision with root package name */
    public final r f13579r;

    /* renamed from: s  reason: collision with root package name */
    public final h f13580s;

    /* loaded from: classes.dex */
    public static final class a extends e {

        /* renamed from: t  reason: collision with root package name */
        public final m7.e f13581t;

        public a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, h hVar, int i10, m8.e eVar, h9.e eVar2, r rVar, boolean z10, boolean z11, boolean z12, r rVar2, d0 d0Var, u7.a<? extends List<? extends l0>> aVar2) {
            super(aVar, hVar, i10, eVar, eVar2, rVar, z10, z11, z12, rVar2, d0Var);
            this.f13581t = kotlin.a.b(aVar2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e, kotlin.reflect.jvm.internal.impl.descriptors.h
        public final h Q(j8.c cVar, h9.e eVar, int i10) {
            m8.e annotations = getAnnotations();
            g.e(annotations, "annotations");
            r b5 = b();
            g.e(b5, "type");
            return new a(cVar, null, i10, annotations, eVar, b5, j0(), this.f13577p, this.f13578q, this.f13579r, d0.f15835a, new ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, h hVar, int i10, m8.e eVar, h9.e eVar2, r rVar, boolean z10, boolean z11, boolean z12, r rVar2, d0 d0Var) {
        super(aVar, eVar, eVar2, rVar, d0Var);
        g.f(aVar, "containingDeclaration");
        g.f(eVar, "annotations");
        g.f(eVar2, "name");
        g.f(rVar, "outType");
        g.f(d0Var, "source");
        this.n = i10;
        this.f13576o = z10;
        this.f13577p = z11;
        this.f13578q = z12;
        this.f13579r = rVar2;
        this.f13580s = hVar == null ? this : hVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    public final boolean A() {
        return this.f13577p;
    }

    @Override // l8.l0
    public final /* bridge */ /* synthetic */ m9.g J0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    public final boolean K0() {
        return this.f13578q;
    }

    @Override // l8.l0
    public final boolean M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    public final r N() {
        return this.f13579r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    public h Q(j8.c cVar, h9.e eVar, int i10) {
        m8.e annotations = getAnnotations();
        g.e(annotations, "annotations");
        r b5 = b();
        g.e(b5, "type");
        return new e(cVar, null, i10, annotations, eVar, b5, j0(), this.f13577p, this.f13578q, this.f13579r, d0.f15835a);
    }

    @Override // o8.o
    /* renamed from: a */
    public final h z0() {
        h hVar = this.f13580s;
        return hVar == this ? this : hVar.a();
    }

    @Override // o8.o, l8.f
    public final kotlin.reflect.jvm.internal.impl.descriptors.a c() {
        f c = super.c();
        g.d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (kotlin.reflect.jvm.internal.impl.descriptors.a) c;
    }

    @Override // l8.f0
    public final l8.g d(TypeSubstitutor typeSubstitutor) {
        g.f(typeSubstitutor, "substitutor");
        if (typeSubstitutor.h()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final Collection<h> f() {
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> f10 = c().f();
        g.e(f10, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(l.Z1(f10, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.a aVar : f10) {
            arrayList.add(aVar.m().get(this.n));
        }
        return arrayList;
    }

    @Override // l8.j, l8.r
    public final m g() {
        l.i iVar = l8.l.f15843f;
        g.e(iVar, "LOCAL");
        return iVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    public final int getIndex() {
        return this.n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    public final boolean j0() {
        boolean z10;
        if (!this.f13576o) {
            return false;
        }
        CallableMemberDescriptor.Kind h10 = ((CallableMemberDescriptor) c()).h();
        h10.getClass();
        if (h10 != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // l8.f
    public final <R, D> R n0(l8.h<R, D> hVar, D d5) {
        return hVar.i(this, d5);
    }
}
