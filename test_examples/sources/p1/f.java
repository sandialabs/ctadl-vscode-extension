package p1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final g f16662a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16663b;
    public final int c;

    public f(androidx.compose.ui.text.platform.a aVar, int i10, int i11) {
        this.f16662a = aVar;
        this.f16663b = i10;
        this.c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return v7.g.a(this.f16662a, fVar.f16662a) && this.f16663b == fVar.f16663b && this.c == fVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f16662a.hashCode() * 31) + this.f16663b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f16662a);
        sb.append(", startIndex=");
        sb.append(this.f16663b);
        sb.append(", endIndex=");
        return androidx.activity.e.h(sb, this.c, ')');
    }
}
