package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import h9.e;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class LazyJavaClassMemberScope$nestedClassIndex$1 extends Lambda implements u7.a<Set<? extends e>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaClassMemberScope f13758j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$nestedClassIndex$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(0);
        this.f13758j = lazyJavaClassMemberScope;
    }

    @Override // u7.a
    public final Set<? extends e> k0() {
        return kotlin.collections.c.Q2(this.f13758j.f13741o.R());
    }
}
