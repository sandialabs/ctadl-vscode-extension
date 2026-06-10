package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import h9.e;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class LazyJavaScope$functionNamesLazy$2 extends Lambda implements u7.a<Set<? extends e>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaScope f13807j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$functionNamesLazy$2(LazyJavaScope lazyJavaScope) {
        super(0);
        this.f13807j = lazyJavaScope;
    }

    @Override // u7.a
    public final Set<? extends e> k0() {
        return this.f13807j.i(r9.c.f17184p, null);
    }
}
