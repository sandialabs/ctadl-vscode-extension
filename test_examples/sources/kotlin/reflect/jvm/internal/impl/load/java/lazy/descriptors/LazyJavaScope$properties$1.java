package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import h9.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import l8.z;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class LazyJavaScope$properties$1 extends Lambda implements l<e, List<? extends z>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaScope f13809j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$properties$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.f13809j = lazyJavaScope;
    }

    @Override // u7.l
    public final List<? extends z> U(e eVar) {
        e eVar2 = eVar;
        g.f(eVar2, "name");
        ArrayList arrayList = new ArrayList();
        LazyJavaScope lazyJavaScope = this.f13809j;
        m0.b.u(arrayList, lazyJavaScope.f13789g.U(eVar2));
        lazyJavaScope.n(arrayList, eVar2);
        if (k9.d.n(lazyJavaScope.q(), ClassKind.f13435m)) {
            return kotlin.collections.c.L2(arrayList);
        }
        x8.c cVar = lazyJavaScope.f13785b;
        return kotlin.collections.c.L2(cVar.f18762a.f18754r.c(cVar, arrayList));
    }
}
