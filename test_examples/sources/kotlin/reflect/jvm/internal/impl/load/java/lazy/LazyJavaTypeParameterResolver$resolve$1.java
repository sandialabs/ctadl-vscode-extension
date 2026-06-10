package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import b9.x;
import kotlin.jvm.internal.Lambda;
import l8.f;
import u7.l;
import v7.g;
import x8.c;
import y8.b;

/* loaded from: classes.dex */
public final class LazyJavaTypeParameterResolver$resolve$1 extends Lambda implements l<x, b> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaTypeParameterResolver f13701j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterResolver$resolve$1(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver) {
        super(1);
        this.f13701j = lazyJavaTypeParameterResolver;
    }

    @Override // u7.l
    public final b U(x xVar) {
        x xVar2 = xVar;
        g.f(xVar2, "typeParameter");
        LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = this.f13701j;
        Integer num = (Integer) lazyJavaTypeParameterResolver.f13699d.get(xVar2);
        if (num != null) {
            int intValue = num.intValue();
            c cVar = lazyJavaTypeParameterResolver.f13697a;
            g.f(cVar, "<this>");
            c cVar2 = new c(cVar.f18762a, lazyJavaTypeParameterResolver, cVar.c);
            f fVar = lazyJavaTypeParameterResolver.f13698b;
            return new b(ContextKt.b(cVar2, fVar.getAnnotations()), xVar2, lazyJavaTypeParameterResolver.c + intValue, fVar);
        }
        return null;
    }
}
