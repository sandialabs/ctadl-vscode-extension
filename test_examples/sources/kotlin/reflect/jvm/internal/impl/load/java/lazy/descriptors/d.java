package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.q;
import h9.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import l8.c0;
import v7.g;
import y9.r;

/* loaded from: classes.dex */
public abstract class d extends LazyJavaScope {
    public d(x8.c cVar) {
        super(cVar, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void n(ArrayList arrayList, e eVar) {
        g.f(eVar, "name");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final c0 p() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final LazyJavaScope.a s(q qVar, ArrayList arrayList, r rVar, List list) {
        g.f(qVar, "method");
        g.f(list, "valueParameters");
        return new LazyJavaScope.a(list, arrayList, EmptyList.f12981i, rVar);
    }
}
