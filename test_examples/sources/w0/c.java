package w0;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f18241a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18242b;
    public final int c;

    public c(String str, long j2, int i10) {
        this.f18241a = str;
        this.f18242b = j2;
        this.c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i10);

    public abstract float c(int i10);

    public boolean d() {
        return false;
    }

    public abstract float[] e(float[] fArr);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v7.g.a(v7.i.a(getClass()), v7.i.a(obj.getClass()))) {
            c cVar = (c) obj;
            if (this.c == cVar.c && v7.g.a(this.f18241a, cVar.f18241a)) {
                return b.a(this.f18242b, cVar.f18242b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i10 = b.f18240e;
        long j2 = this.f18242b;
        return (((this.f18241a.hashCode() * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.c;
    }

    public final String toString() {
        return this.f18241a + " (id=" + this.c + ", model=" + ((Object) b.b(this.f18242b)) + ')';
    }
}
