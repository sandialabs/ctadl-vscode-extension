package q2;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f16870e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f16871a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16872b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16873d;

    /* loaded from: classes.dex */
    public static class a {
        public static Insets a(int i10, int i11, int i12, int i13) {
            Insets of;
            of = Insets.of(i10, i11, i12, i13);
            return of;
        }
    }

    public b(int i10, int i11, int i12, int i13) {
        this.f16871a = i10;
        this.f16872b = i11;
        this.c = i12;
        this.f16873d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f16871a, bVar2.f16871a), Math.max(bVar.f16872b, bVar2.f16872b), Math.max(bVar.c, bVar2.c), Math.max(bVar.f16873d, bVar2.f16873d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f16870e : new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        int i10;
        int i11;
        int i12;
        int i13;
        i10 = insets.left;
        i11 = insets.top;
        i12 = insets.right;
        i13 = insets.bottom;
        return b(i10, i11, i12, i13);
    }

    public final Insets d() {
        return a.a(this.f16871a, this.f16872b, this.c, this.f16873d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f16873d == bVar.f16873d && this.f16871a == bVar.f16871a && this.c == bVar.c && this.f16872b == bVar.f16872b;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f16871a * 31) + this.f16872b) * 31) + this.c) * 31) + this.f16873d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f16871a);
        sb.append(", top=");
        sb.append(this.f16872b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return androidx.activity.e.h(sb, this.f16873d, '}');
    }
}
