package b8;

/* loaded from: classes.dex */
public final class c extends a implements f<Character> {
    static {
        new c((char) 1, (char) 0);
    }

    public c(char c, char c10) {
        super(c, c10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r3 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (!(obj instanceof c)) {
            return false;
        }
        char c = this.f6488i;
        char c10 = this.f6489j;
        if (v7.g.h(c, c10) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c cVar = (c) obj;
            if (v7.g.h(cVar.f6488i, cVar.f6489j) > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        c cVar2 = (c) obj;
        if (c != cVar2.f6488i || c10 != cVar2.f6489j) {
            return false;
        }
        return true;
    }

    public final boolean g(char c) {
        return v7.g.h(this.f6488i, c) <= 0 && v7.g.h(c, this.f6489j) <= 0;
    }

    public final int hashCode() {
        char c = this.f6488i;
        char c10 = this.f6489j;
        if (v7.g.h(c, c10) > 0) {
            return -1;
        }
        return (c * 31) + c10;
    }

    public final String toString() {
        return this.f6488i + ".." + this.f6489j;
    }
}
