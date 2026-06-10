package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.m;
import b9.o;
import c8.j;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import l8.d0;
import l8.i0;
import m9.n;
import m9.p;
import n7.l;
import u8.q;
import v7.g;
import v7.i;
import w8.f;
import x9.e;
import x9.h;
import y9.f0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class LazyJavaAnnotationDescriptor implements m8.c, f {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ j<Object>[] f13714i = {i.c(new PropertyReference1Impl(i.a(LazyJavaAnnotationDescriptor.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), i.c(new PropertyReference1Impl(i.a(LazyJavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), i.c(new PropertyReference1Impl(i.a(LazyJavaAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: a  reason: collision with root package name */
    public final x8.c f13715a;

    /* renamed from: b  reason: collision with root package name */
    public final b9.a f13716b;
    public final x9.f c;

    /* renamed from: d  reason: collision with root package name */
    public final e f13717d;

    /* renamed from: e  reason: collision with root package name */
    public final a9.a f13718e;

    /* renamed from: f  reason: collision with root package name */
    public final e f13719f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13720g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13721h;

    public LazyJavaAnnotationDescriptor(x8.c cVar, b9.a aVar, boolean z10) {
        g.f(cVar, "c");
        g.f(aVar, "javaAnnotation");
        this.f13715a = cVar;
        this.f13716b = aVar;
        x8.a aVar2 = cVar.f18762a;
        this.c = aVar2.f18739a.g(new LazyJavaAnnotationDescriptor$fqName$2(this));
        LazyJavaAnnotationDescriptor$type$2 lazyJavaAnnotationDescriptor$type$2 = new LazyJavaAnnotationDescriptor$type$2(this);
        h hVar = aVar2.f18739a;
        this.f13717d = hVar.a(lazyJavaAnnotationDescriptor$type$2);
        this.f13718e = aVar2.f18747j.a(aVar);
        this.f13719f = hVar.a(new LazyJavaAnnotationDescriptor$allValueArguments$2(this));
        aVar.i();
        this.f13720g = false;
        aVar.O();
        this.f13721h = z10;
    }

    @Override // m8.c
    public final Map<h9.e, m9.g<?>> a() {
        return (Map) m0.b.u0(this.f13719f, f13714i[2]);
    }

    @Override // m8.c
    public final r b() {
        return (v) m0.b.u0(this.f13717d, f13714i[1]);
    }

    public final m9.g<?> c(b9.b bVar) {
        r i10;
        if (bVar instanceof o) {
            return ConstantValueFactory.c(((o) bVar).getValue());
        }
        m9.g<?> gVar = null;
        if (bVar instanceof m) {
            m mVar = (m) bVar;
            h9.b d5 = mVar.d();
            h9.e a10 = mVar.a();
            if (d5 != null && a10 != null) {
                gVar = new m9.i(d5, a10);
            }
        } else {
            boolean z10 = bVar instanceof b9.e;
            x8.c cVar = this.f13715a;
            if (z10) {
                b9.e eVar = (b9.e) bVar;
                h9.e name = eVar.getName();
                if (name == null) {
                    name = q.f17865b;
                }
                g.e(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
                ArrayList<b9.b> c = eVar.c();
                v vVar = (v) m0.b.u0(this.f13717d, f13714i[1]);
                g.e(vVar, "type");
                if (!m0.b.D0(vVar)) {
                    l8.b d10 = DescriptorUtilsKt.d(this);
                    g.c(d10);
                    kotlin.reflect.jvm.internal.impl.descriptors.h t10 = v8.b.t(name, d10);
                    if (t10 == null || (i10 = t10.b()) == null) {
                        i10 = cVar.f18762a.f18751o.u().i(aa.h.c(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
                    }
                    ArrayList arrayList = new ArrayList(l.Z1(c, 10));
                    for (b9.b bVar2 : c) {
                        m9.g<?> c10 = c(bVar2);
                        if (c10 == null) {
                            c10 = new p();
                        }
                        arrayList.add(c10);
                    }
                    return ConstantValueFactory.b(arrayList, i10);
                }
            } else if (bVar instanceof b9.c) {
                return new m9.a(new LazyJavaAnnotationDescriptor(cVar, ((b9.c) bVar).b(), false));
            } else {
                if (bVar instanceof b9.h) {
                    r e10 = cVar.f18765e.e(((b9.h) bVar).e(), m0.b.r1(TypeUsage.COMMON, false, false, null, 7));
                    if (!m0.b.D0(e10)) {
                        r rVar = e10;
                        int i11 = 0;
                        while (kotlin.reflect.jvm.internal.impl.builtins.e.z(rVar)) {
                            rVar = ((f0) kotlin.collections.c.C2(rVar.S0())).b();
                            g.e(rVar, "type.arguments.single().type");
                            i11++;
                        }
                        l8.d c11 = rVar.U0().c();
                        if (c11 instanceof l8.b) {
                            h9.b f10 = DescriptorUtilsKt.f(c11);
                            gVar = f10 == null ? new n(new n.a.C0188a(e10)) : new n(f10, i11);
                        } else if (c11 instanceof i0) {
                            return new n(h9.b.l(g.a.f13358a.h()), 0);
                        }
                    }
                }
            }
        }
        return gVar;
    }

    @Override // m8.c
    public final h9.c e() {
        j<Object> jVar = f13714i[0];
        x9.f fVar = this.c;
        v7.g.f(fVar, "<this>");
        v7.g.f(jVar, "p");
        return (h9.c) fVar.k0();
    }

    @Override // w8.f
    public final boolean i() {
        return this.f13720g;
    }

    @Override // m8.c
    public final d0 j() {
        return this.f13718e;
    }

    public final String toString() {
        return DescriptorRenderer.f14593a.p(this, null);
    }
}
