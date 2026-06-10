package n6;

import v7.g;

/* loaded from: classes.dex */
public interface c<T> {

    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16110a = new a();
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f16111a;

        public b(T t10) {
            this.f16111a = t10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && g.a(this.f16111a, ((b) obj).f16111a);
        }

        public final int hashCode() {
            T t10 = this.f16111a;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        public final String toString() {
            return "Success(value=" + this.f16111a + ")";
        }
    }
}
