package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.types.l;
import m8.e;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ c8.j<Object>[] f15005a = {v7.i.c(new PropertyReference1Impl(v7.i.f18169a.c(d.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* renamed from: b  reason: collision with root package name */
    public static final da.g f15006b;

    static {
        l.a aVar = l.f15045j;
        c8.b a10 = v7.i.a(y9.c.class);
        aVar.getClass();
        v7.g.f(a10, "kClass");
        f15006b = new da.g(a10, aVar.b(a10));
    }

    public static final m8.e a(l lVar) {
        m8.e eVar;
        v7.g.f(lVar, "<this>");
        c8.j<Object> jVar = f15005a[0];
        da.g gVar = f15006b;
        gVar.getClass();
        v7.g.f(jVar, "property");
        y9.c cVar = (y9.c) lVar.c().get(gVar.f10475b);
        if (cVar == null || (eVar = cVar.f18943a) == null) {
            return e.a.f16014a;
        }
        return eVar;
    }
}
