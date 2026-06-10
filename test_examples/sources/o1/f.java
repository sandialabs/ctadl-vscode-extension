package o1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static final f f16187d = new f(new b8.d());

    /* renamed from: a  reason: collision with root package name */
    public final float f16188a;

    /* renamed from: b  reason: collision with root package name */
    public final b8.e<Float> f16189b;
    public final int c;

    public f() {
        throw null;
    }

    public f(b8.d dVar) {
        this.f16188a = 0.0f;
        this.f16189b = dVar;
        this.c = 0;
        if (!(!Float.isNaN(0.0f))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return ((this.f16188a > fVar.f16188a ? 1 : (this.f16188a == fVar.f16188a ? 0 : -1)) == 0) && v7.g.a(this.f16189b, fVar.f16189b) && this.c == fVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16189b.hashCode() + (Float.floatToIntBits(this.f16188a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.f16188a);
        sb.append(", range=");
        sb.append(this.f16189b);
        sb.append(", steps=");
        return androidx.activity.e.h(sb, this.c, ')');
    }
}
