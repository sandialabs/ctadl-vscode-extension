package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import h9.e;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class LazyJavaClassMemberScope$generatedNestedClassNames$1 extends Lambda implements u7.a<Set<? extends e>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ x8.c f13754j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ LazyJavaClassMemberScope f13755k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$generatedNestedClassNames$1(x8.c cVar, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(0);
        this.f13754j = cVar;
        this.f13755k = lazyJavaClassMemberScope;
    }

    @Override // u7.a
    public final Set<? extends e> k0() {
        x8.c cVar = this.f13754j;
        return kotlin.collections.c.Q2(cVar.f18762a.f18760x.c(cVar, this.f13755k.n));
    }
}
