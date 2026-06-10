package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.f;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.l;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.b;
import l8.i0;
import l8.s;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final e f15103a = new e();

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    public final String a() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    public final String b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return b.a.a(this, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    public final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        v e10;
        v7.g.f(eVar, "functionDescriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = eVar.m().get(1);
        f.b bVar = kotlin.reflect.jvm.internal.impl.builtins.f.f13330d;
        v7.g.e(hVar, "secondParameter");
        s j2 = DescriptorUtilsKt.j(hVar);
        bVar.getClass();
        l8.b a10 = FindClassInModuleKt.a(j2, g.a.Q);
        if (a10 == null) {
            e10 = null;
        } else {
            l.f15045j.getClass();
            l lVar = l.f15046k;
            List<i0> e11 = a10.o().e();
            v7.g.e(e11, "kPropertyClass.typeConstructor.parameters");
            Object C2 = kotlin.collections.c.C2(e11);
            v7.g.e(C2, "kPropertyClass.typeConstructor.parameters.single()");
            e10 = KotlinTypeFactory.e(lVar, a10, a1.c.N0(new StarProjectionImpl((i0) C2)));
        }
        if (e10 != null) {
            r b5 = hVar.b();
            v7.g.e(b5, "secondParameter.type");
            return TypeUtilsKt.j(e10, kotlin.reflect.jvm.internal.impl.types.r.i(b5));
        }
        return false;
    }
}
