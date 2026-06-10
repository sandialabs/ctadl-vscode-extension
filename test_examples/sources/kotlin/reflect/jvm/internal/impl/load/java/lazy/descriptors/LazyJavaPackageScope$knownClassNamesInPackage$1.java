package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class LazyJavaPackageScope$knownClassNamesInPackage$1 extends Lambda implements u7.a<Set<? extends String>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ x8.c f13782j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ LazyJavaPackageScope f13783k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope$knownClassNamesInPackage$1(x8.c cVar, LazyJavaPackageScope lazyJavaPackageScope) {
        super(0);
        this.f13782j = cVar;
        this.f13783k = lazyJavaPackageScope;
    }

    @Override // u7.a
    public final Set<? extends String> k0() {
        this.f13782j.f18762a.f18740b.c(this.f13783k.f13772o.f16379m);
        return null;
    }
}
