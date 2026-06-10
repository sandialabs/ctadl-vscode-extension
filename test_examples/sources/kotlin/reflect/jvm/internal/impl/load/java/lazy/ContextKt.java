package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import b9.y;
import kotlin.LazyThreadSafetyMode;
import m7.e;
import v7.g;
import x8.c;

/* loaded from: classes.dex */
public final class ContextKt {
    public static c a(c cVar, l8.c cVar2, y yVar, int i10) {
        a aVar;
        if ((i10 & 2) != 0) {
            yVar = null;
        }
        g.f(cVar, "<this>");
        g.f(cVar2, "containingDeclaration");
        e a10 = kotlin.a.a(LazyThreadSafetyMode.NONE, new ContextKt$childForClassOrPackage$1(cVar, cVar2));
        if (yVar != null) {
            aVar = new LazyJavaTypeParameterResolver(cVar, cVar2, yVar, 0);
        } else {
            aVar = cVar.f18763b;
        }
        return new c(cVar.f18762a, aVar, a10);
    }

    public static final c b(c cVar, m8.e eVar) {
        g.f(cVar, "<this>");
        g.f(eVar, "additionalAnnotations");
        if (eVar.isEmpty()) {
            return cVar;
        }
        return new c(cVar.f18762a, cVar.f18763b, kotlin.a.a(LazyThreadSafetyMode.NONE, new ContextKt$copyWithNewDefaultTypeQualifiers$1(cVar, eVar)));
    }
}
