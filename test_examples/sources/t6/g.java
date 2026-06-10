package t6;

/* loaded from: classes.dex */
public interface g {

    /* loaded from: classes.dex */
    public static final class a {
        public static String a(String str) {
            return a4.b.m("Changelog(text=", str, ")");
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f17644a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17645b;
        public final int c;

        public b(int i10, int i11, int i12) {
            this.f17644a = i10;
            this.f17645b = i11;
            this.c = i12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f17644a == bVar.f17644a && this.f17645b == bVar.f17645b && this.c == bVar.c;
            }
            return false;
        }

        public final int hashCode() {
            return (((this.f17644a * 31) + this.f17645b) * 31) + this.c;
        }

        public final String toString() {
            return this.f17644a + "." + this.f17645b + "." + this.c;
        }
    }

    String a();

    b b();

    na.d c();
}
