package s4;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17271a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17272b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f17273d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f17271a = z10;
        this.f17272b = z11;
        this.c = z12;
        this.f17273d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f17271a == bVar.f17271a && this.f17272b == bVar.f17272b && this.c == bVar.c && this.f17273d == bVar.f17273d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i10 = 1;
        boolean z10 = this.f17271a;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = i11 * 31;
        boolean z11 = this.f17272b;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z12 = this.c;
        int i15 = z12;
        if (z12 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z13 = this.f17273d;
        if (!z13) {
            i10 = z13 ? 1 : 0;
        }
        return i16 + i10;
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f17271a + ", isValidated=" + this.f17272b + ", isMetered=" + this.c + ", isNotRoaming=" + this.f17273d + ')';
    }
}
