package b8;

/* loaded from: classes.dex */
public class g implements Iterable<Integer>, w7.a {

    /* renamed from: i  reason: collision with root package name */
    public final int f6497i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6498j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6499k;

    public g(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f6497i = i10;
        this.f6498j = a1.c.E0(i10, i11, i12);
        this.f6499k = i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r2.f6499k == r3.f6499k) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (this.f6497i == gVar.f6497i) {
                    if (this.f6498j == gVar.f6498j) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* renamed from: g */
    public final h iterator() {
        return new h(this.f6497i, this.f6498j, this.f6499k);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f6497i * 31) + this.f6498j) * 31) + this.f6499k;
    }

    public boolean isEmpty() {
        int i10 = this.f6499k;
        int i11 = this.f6498j;
        int i12 = this.f6497i;
        if (i10 > 0) {
            if (i12 > i11) {
                return true;
            }
        } else if (i12 < i11) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i10 = this.f6498j;
        int i11 = this.f6497i;
        int i12 = this.f6499k;
        if (i12 > 0) {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append("..");
            sb.append(i10);
            sb.append(" step ");
            sb.append(i12);
        } else {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append(" downTo ");
            sb.append(i10);
            sb.append(" step ");
            sb.append(-i12);
        }
        return sb.toString();
    }
}
