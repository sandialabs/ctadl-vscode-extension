package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Lambda;
import u7.l;

/* loaded from: classes.dex */
public final class TypeRegistry$getId$1 extends Lambda implements l<c8.b<? extends K>, Integer> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TypeRegistry<K, V> f15095j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeRegistry$getId$1(TypeRegistry<K, V> typeRegistry) {
        super(1);
        this.f15095j = typeRegistry;
    }

    @Override // u7.l
    public final Integer U(Object obj) {
        v7.g.f((c8.b) obj, "it");
        return Integer.valueOf(this.f15095j.f15094b.getAndIncrement());
    }
}
