package g9;

/* loaded from: classes.dex */
public abstract class d {

    /* loaded from: classes.dex */
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public final String f11270a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11271b;

        public a(String str, String str2) {
            v7.g.f(str, "name");
            v7.g.f(str2, "desc");
            this.f11270a = str;
            this.f11271b = str2;
        }

        @Override // g9.d
        public final String a() {
            return this.f11270a + ':' + this.f11271b;
        }

        @Override // g9.d
        public final String b() {
            return this.f11271b;
        }

        @Override // g9.d
        public final String c() {
            return this.f11270a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (v7.g.a(this.f11270a, aVar.f11270a) && v7.g.a(this.f11271b, aVar.f11271b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f11271b.hashCode() + (this.f11270a.hashCode() * 31);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public final String f11272a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11273b;

        public b(String str, String str2) {
            v7.g.f(str, "name");
            v7.g.f(str2, "desc");
            this.f11272a = str;
            this.f11273b = str2;
        }

        @Override // g9.d
        public final String a() {
            return this.f11272a + this.f11273b;
        }

        @Override // g9.d
        public final String b() {
            return this.f11273b;
        }

        @Override // g9.d
        public final String c() {
            return this.f11272a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (v7.g.a(this.f11272a, bVar.f11272a) && v7.g.a(this.f11273b, bVar.f11273b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f11273b.hashCode() + (this.f11272a.hashCode() * 31);
        }
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        return a();
    }
}
