package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    public static class a<T> extends c<T> implements u7.a<T> {

        /* renamed from: j  reason: collision with root package name */
        public final u7.a<T> f13286j;

        /* renamed from: k  reason: collision with root package name */
        public volatile SoftReference<Object> f13287k;

        public a(T t10, u7.a<T> aVar) {
            if (aVar != null) {
                this.f13287k = null;
                this.f13286j = aVar;
                if (t10 != null) {
                    this.f13287k = new SoftReference<>(t10);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // u7.a
        public final T k0() {
            T t10;
            SoftReference<Object> softReference = this.f13287k;
            c.a aVar = c.f13290i;
            if (softReference != null && (t10 = (T) softReference.get()) != null) {
                if (t10 == aVar) {
                    return null;
                }
                return t10;
            }
            T k02 = this.f13286j.k0();
            if (k02 != null) {
                aVar = k02;
            }
            this.f13287k = new SoftReference<>(aVar);
            return k02;
        }
    }

    /* loaded from: classes.dex */
    public static class b<T> extends c<T> {

        /* renamed from: j  reason: collision with root package name */
        public final u7.a<T> f13288j;

        /* renamed from: k  reason: collision with root package name */
        public volatile Object f13289k = null;

        public b(u7.a<T> aVar) {
            this.f13288j = aVar;
        }

        public final T k0() {
            T t10 = (T) this.f13289k;
            c.a aVar = c.f13290i;
            if (t10 != null) {
                if (t10 == aVar) {
                    return null;
                }
                return t10;
            }
            T k02 = this.f13288j.k0();
            if (k02 != null) {
                aVar = k02;
            }
            this.f13289k = aVar;
            return k02;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c<T> {

        /* renamed from: i  reason: collision with root package name */
        public static final a f13290i = new a();

        /* loaded from: classes.dex */
        public static class a {
        }
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <T> b<T> b(u7.a<T> aVar) {
        return new b<>(aVar);
    }

    public static <T> a<T> c(u7.a<T> aVar) {
        if (aVar != null) {
            return new a<>(null, aVar);
        }
        a(2);
        throw null;
    }
}
