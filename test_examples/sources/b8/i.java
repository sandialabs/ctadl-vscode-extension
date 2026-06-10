package b8;

/* loaded from: classes.dex */
public final class i extends g implements f<Integer> {

    /* renamed from: l  reason: collision with root package name */
    public static final i f6504l = new i(1, 0);

    public i(int i10, int i11) {
        super(i10, i11, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r2.f6498j == r3.f6498j) goto L7;
     */
    @Override // b8.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (this.f6497i == iVar.f6497i) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // b8.g
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f6497i * 31) + this.f6498j;
    }

    @Override // b8.g
    public final boolean isEmpty() {
        return this.f6497i > this.f6498j;
    }

    public final boolean s(int i10) {
        return this.f6497i <= i10 && i10 <= this.f6498j;
    }

    @Override // b8.g
    public final String toString() {
        return this.f6497i + ".." + this.f6498j;
    }
}
