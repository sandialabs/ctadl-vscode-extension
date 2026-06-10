package a2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final d f93d = new d();

    /* renamed from: a  reason: collision with root package name */
    public final int f94a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final int f95b = 3;
    public final int c = 1;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f96a;

        public static String a(int i10) {
            if (i10 == 1) {
                return "Strategy.Simple";
            }
            if (i10 == 2) {
                return "Strategy.HighQuality";
            }
            return i10 == 3 ? "Strategy.Balanced" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this.f96a != ((a) obj).f96a) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f96a;
        }

        public final String toString() {
            return a(this.f96a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f97a;

        public static String a(int i10) {
            if (i10 == 1) {
                return "Strictness.None";
            }
            if (i10 == 2) {
                return "Strictness.Loose";
            }
            if (i10 == 3) {
                return "Strictness.Normal";
            }
            return i10 == 4 ? "Strictness.Strict" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (this.f97a != ((b) obj).f97a) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f97a;
        }

        public final String toString() {
            return a(this.f97a);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f98a;

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            if (this.f98a != ((c) obj).f98a) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f98a;
        }

        public final String toString() {
            int i10 = this.f98a;
            if (i10 == 1) {
                return "WordBreak.None";
            }
            return i10 == 2 ? "WordBreak.Phrase" : "Invalid";
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f94a == dVar.f94a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f95b == dVar.f95b) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        if (this.c == dVar.c) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f94a * 31) + this.f95b) * 31) + this.c;
    }

    public final String toString() {
        boolean z10;
        String str;
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        sb.append((Object) a.a(this.f94a));
        sb.append(", strictness=");
        sb.append((Object) b.a(this.f95b));
        sb.append(", wordBreak=");
        boolean z11 = false;
        int i10 = this.c;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            str = "WordBreak.None";
        } else {
            if (i10 == 2) {
                z11 = true;
            }
            if (z11) {
                str = "WordBreak.Phrase";
            } else {
                str = "Invalid";
            }
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
