package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import h9.e;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import n7.l;

/* loaded from: classes.dex */
final class LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1 extends Lambda implements u7.a<Set<? extends e>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaClassMemberScope f13761j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(0);
        this.f13761j = lazyJavaClassMemberScope;
    }

    @Override // u7.a
    public final Set<? extends e> k0() {
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.f13761j;
        return l.c2(lazyJavaClassMemberScope.c(), lazyJavaClassMemberScope.d());
    }
}
