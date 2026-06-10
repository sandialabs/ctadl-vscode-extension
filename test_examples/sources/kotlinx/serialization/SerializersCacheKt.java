package kotlinx.serialization;

import kotlinx.serialization.internal.ClassValueCache;
import ua.g1;
import ua.n;
import ua.o1;
import ua.r;
import ua.v;
import ua.w;
import v7.g;

/* loaded from: classes.dex */
public final class SerializersCacheKt {

    /* renamed from: a  reason: collision with root package name */
    public static final o1<? extends Object> f15588a;

    /* renamed from: b  reason: collision with root package name */
    public static final o1<Object> f15589b;
    public static final g1<? extends Object> c;

    /* renamed from: d  reason: collision with root package name */
    public static final g1<Object> f15590d;

    static {
        o1<? extends Object> vVar;
        o1<Object> vVar2;
        g1<? extends Object> wVar;
        g1<Object> wVar2;
        SerializersCacheKt$SERIALIZERS_CACHE$1 serializersCacheKt$SERIALIZERS_CACHE$1 = SerializersCacheKt$SERIALIZERS_CACHE$1.f15593j;
        boolean z10 = n.f17992a;
        g.f(serializersCacheKt$SERIALIZERS_CACHE$1, "factory");
        boolean z11 = n.f17992a;
        if (z11) {
            vVar = new ClassValueCache<>(serializersCacheKt$SERIALIZERS_CACHE$1);
        } else {
            vVar = new v<>(serializersCacheKt$SERIALIZERS_CACHE$1);
        }
        f15588a = vVar;
        SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1 serializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1 = SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1.f15594j;
        g.f(serializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1, "factory");
        if (z11) {
            vVar2 = new ClassValueCache<>(serializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1);
        } else {
            vVar2 = new v<>(serializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1);
        }
        f15589b = vVar2;
        SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1 serializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1 = SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1.f15591j;
        g.f(serializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1, "factory");
        if (z11) {
            wVar = new r<>(serializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1);
        } else {
            wVar = new w<>(serializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1);
        }
        c = wVar;
        SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1 serializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1 = SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1.f15592j;
        g.f(serializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1, "factory");
        if (z11) {
            wVar2 = new r<>(serializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1);
        } else {
            wVar2 = new w<>(serializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1);
        }
        f15590d = wVar2;
    }
}
