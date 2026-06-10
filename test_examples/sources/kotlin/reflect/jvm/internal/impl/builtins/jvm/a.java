package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import c8.j;
import h9.d;
import h9.e;
import java.util.Collection;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import l8.f;
import l8.s;
import u7.l;
import v7.i;
import x9.h;

/* loaded from: classes.dex */
public final class a implements n8.b {

    /* renamed from: g  reason: collision with root package name */
    public static final e f13415g;

    /* renamed from: h  reason: collision with root package name */
    public static final h9.b f13416h;

    /* renamed from: a  reason: collision with root package name */
    public final s f13417a;

    /* renamed from: b  reason: collision with root package name */
    public final l<s, f> f13418b;
    public final x9.e c;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ j<Object>[] f13413e = {i.c(new PropertyReference1Impl(i.a(a.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: d  reason: collision with root package name */
    public static final C0149a f13412d = new C0149a();

    /* renamed from: f  reason: collision with root package name */
    public static final h9.c f13414f = g.f13354k;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0149a {
    }

    static {
        d dVar = g.a.c;
        e g10 = dVar.g();
        v7.g.e(g10, "cloneable.shortName()");
        f13415g = g10;
        f13416h = h9.b.l(dVar.h());
    }

    public a() {
        throw null;
    }

    public a(h hVar, kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar) {
        JvmBuiltInClassDescriptorFactory$1 jvmBuiltInClassDescriptorFactory$1 = JvmBuiltInClassDescriptorFactory$1.f13384j;
        v7.g.f(jvmBuiltInClassDescriptorFactory$1, "computeContainingDeclaration");
        this.f13417a = cVar;
        this.f13418b = jvmBuiltInClassDescriptorFactory$1;
        this.c = hVar.a(new JvmBuiltInClassDescriptorFactory$cloneable$2(this, hVar));
    }

    @Override // n8.b
    public final Collection<l8.b> a(h9.c cVar) {
        v7.g.f(cVar, "packageFqName");
        if (v7.g.a(cVar, f13414f)) {
            return a1.c.v1((o8.l) m0.b.u0(this.c, f13413e[0]));
        }
        return EmptySet.f12983i;
    }

    @Override // n8.b
    public final l8.b b(h9.b bVar) {
        v7.g.f(bVar, "classId");
        if (v7.g.a(bVar, f13416h)) {
            return (o8.l) m0.b.u0(this.c, f13413e[0]);
        }
        return null;
    }

    @Override // n8.b
    public final boolean c(h9.c cVar, e eVar) {
        v7.g.f(cVar, "packageFqName");
        v7.g.f(eVar, "name");
        return v7.g.a(eVar, f13415g) && v7.g.a(cVar, f13414f);
    }
}
