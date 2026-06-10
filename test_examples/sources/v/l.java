package v;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f18065a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18066b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18067d;

    public l(int i10, int i11, int i12, int i13) {
        this.f18065a = i10;
        this.f18066b = i11;
        this.c = i12;
        this.f18067d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f18065a == lVar.f18065a && this.f18066b == lVar.f18066b && this.c == lVar.c && this.f18067d == lVar.f18067d;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f18065a * 31) + this.f18066b) * 31) + this.c) * 31) + this.f18067d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f18065a);
        sb.append(", top=");
        sb.append(this.f18066b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return androidx.activity.e.h(sb, this.f18067d, ')');
    }
}
