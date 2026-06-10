package kotlin.reflect.jvm.internal.impl.load.java.components;

import b9.a;
import b9.b;
import c8.j;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import l8.d0;
import m8.c;
import v7.g;
import v7.i;
import w8.f;
import x9.e;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public class JavaAnnotationDescriptor implements c, f {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ j<Object>[] f13658f = {i.c(new PropertyReference1Impl(i.a(JavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a  reason: collision with root package name */
    public final h9.c f13659a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f13660b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final b f13661d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13662e;

    public JavaAnnotationDescriptor(x8.c cVar, a aVar, h9.c cVar2) {
        d0 d0Var;
        b bVar;
        ArrayList a10;
        g.f(cVar, "c");
        g.f(cVar2, "fqName");
        this.f13659a = cVar2;
        x8.a aVar2 = cVar.f18762a;
        if (aVar == null || (d0Var = aVar2.f18747j.a(aVar)) == null) {
            d0Var = d0.f15835a;
        }
        this.f13660b = d0Var;
        this.c = aVar2.f18739a.a(new JavaAnnotationDescriptor$type$2(cVar, this));
        if (aVar != null && (a10 = aVar.a()) != null) {
            bVar = (b) kotlin.collections.c.o2(a10);
        } else {
            bVar = null;
        }
        this.f13661d = bVar;
        if (aVar != null) {
            aVar.i();
        }
        this.f13662e = false;
    }

    @Override // m8.c
    public Map<h9.e, m9.g<?>> a() {
        return d.K1();
    }

    @Override // m8.c
    public final r b() {
        return (v) m0.b.u0(this.c, f13658f[0]);
    }

    @Override // m8.c
    public final h9.c e() {
        return this.f13659a;
    }

    @Override // w8.f
    public final boolean i() {
        return this.f13662e;
    }

    @Override // m8.c
    public final d0 j() {
        return this.f13660b;
    }
}
