package o8;

import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* loaded from: classes.dex */
public final class y implements x {

    /* renamed from: a  reason: collision with root package name */
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.impl.c> f16473a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.c> f16474b;
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.impl.c> c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.c> f16475d;

    public y(List list, EmptySet emptySet, EmptyList emptyList, EmptySet emptySet2) {
        v7.g.f(emptyList, "directExpectedByDependencies");
        v7.g.f(emptySet2, "allExpectedByDependencies");
        this.f16473a = list;
        this.f16474b = emptySet;
        this.c = emptyList;
        this.f16475d = emptySet2;
    }

    @Override // o8.x
    public final Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.c> a() {
        return this.f16474b;
    }

    @Override // o8.x
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.impl.c> b() {
        return this.f16473a;
    }

    @Override // o8.x
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.impl.c> c() {
        return this.c;
    }
}
