package m3;

import java.util.Map;
import v7.g;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: m3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0185a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f15975a;

        public C0185a(String str) {
            g.f(str, "name");
            this.f15975a = str;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C0185a) {
                return g.a(this.f15975a, ((C0185a) obj).f15975a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15975a.hashCode();
        }

        public final String toString() {
            return this.f15975a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> {
    }

    public abstract Map<C0185a<?>, Object> a();

    public abstract <T> T b(C0185a<T> c0185a);
}
