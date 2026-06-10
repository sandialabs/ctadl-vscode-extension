package kotlin.reflect.jvm.internal;

/* loaded from: classes.dex */
public final class CachesKt {

    /* renamed from: a  reason: collision with root package name */
    public static final f8.b f13076a = f8.a.a(CachesKt$K_CLASS_CACHE$1.f13082j);

    /* renamed from: b  reason: collision with root package name */
    public static final f8.b f13077b = f8.a.a(CachesKt$K_PACKAGE_CACHE$1.f13083j);
    public static final f8.b c = f8.a.a(CachesKt$CACHE_FOR_BASE_CLASSIFIERS$1.f13079j);

    /* renamed from: d  reason: collision with root package name */
    public static final f8.b f13078d;

    static {
        f8.a.a(CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1.f13081j);
        f13078d = f8.a.a(CachesKt$CACHE_FOR_GENERIC_CLASSIFIERS$1.f13080j);
    }

    public static final <T> KClassImpl<T> a(Class<T> cls) {
        v7.g.f(cls, "jClass");
        Object L0 = f13076a.L0(cls);
        v7.g.d(L0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (KClassImpl) L0;
    }
}
