package la;

/* loaded from: classes.dex */
public final class f<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f15877b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Object f15878a;

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f15879a;

        public a(Throwable th) {
            this.f15879a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (v7.g.a(this.f15879a, ((a) obj).f15879a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.f15879a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // la.f.b
        public final String toString() {
            return "Closed(" + this.f15879a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (!v7.g.a(this.f15878a, ((f) obj).f15878a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f15878a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f15878a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
