package m9;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final h9.b f16020a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16021b;

    public f(h9.b bVar, int i10) {
        this.f16020a = bVar;
        this.f16021b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return v7.g.a(this.f16020a, fVar.f16020a) && this.f16021b == fVar.f16021b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16020a.hashCode() * 31) + this.f16021b;
    }

    public final String toString() {
        int i10;
        StringBuilder sb = new StringBuilder();
        int i11 = 0;
        while (true) {
            i10 = this.f16021b;
            if (i11 >= i10) {
                break;
            }
            sb.append("kotlin/Array<");
            i11++;
        }
        sb.append(this.f16020a);
        for (int i12 = 0; i12 < i10; i12++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
