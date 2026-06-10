package wa;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m implements p {

    /* renamed from: a  reason: collision with root package name */
    public char[] f18514a;

    /* renamed from: b  reason: collision with root package name */
    public int f18515b;

    public m() {
        char[] cArr;
        Object removeLast;
        d dVar = d.c;
        synchronized (dVar) {
            n7.g gVar = (n7.g) dVar.f11346b;
            cArr = null;
            if (gVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = gVar.removeLast();
            }
            char[] cArr2 = (char[]) removeLast;
            if (cArr2 != null) {
                dVar.f11345a -= cArr2.length;
                cArr = cArr2;
            }
        }
        this.f18514a = cArr == null ? new char[128] : cArr;
    }

    @Override // wa.p
    public final void a(char c) {
        d(this.f18515b, 1);
        char[] cArr = this.f18514a;
        int i10 = this.f18515b;
        this.f18515b = i10 + 1;
        cArr[i10] = c;
    }

    @Override // wa.p
    public final void b(String str) {
        int i10;
        v7.g.f(str, "text");
        d(this.f18515b, str.length() + 2);
        char[] cArr = this.f18514a;
        int i11 = this.f18515b;
        int i12 = i11 + 1;
        cArr[i11] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i12);
        int i13 = length + i12;
        int i14 = i12;
        while (i14 < i13) {
            char c = cArr[i14];
            byte[] bArr = v.f18542b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i15 = i14 - i12; i15 < length2; i15++) {
                    d(i14, 2);
                    char charAt = str.charAt(i15);
                    byte[] bArr2 = v.f18542b;
                    if (charAt < bArr2.length) {
                        byte b5 = bArr2[charAt];
                        if (b5 == 0) {
                            i10 = i14 + 1;
                            this.f18514a[i14] = charAt;
                        } else {
                            if (b5 == 1) {
                                String str2 = v.f18541a[charAt];
                                v7.g.c(str2);
                                d(i14, str2.length());
                                str2.getChars(0, str2.length(), this.f18514a, i14);
                                int length3 = str2.length() + i14;
                                this.f18515b = length3;
                                i14 = length3;
                            } else {
                                char[] cArr2 = this.f18514a;
                                cArr2[i14] = '\\';
                                cArr2[i14 + 1] = (char) b5;
                                i14 += 2;
                                this.f18515b = i14;
                            }
                        }
                    } else {
                        i10 = i14 + 1;
                        this.f18514a[i14] = charAt;
                    }
                    i14 = i10;
                }
                d(i14, 1);
                this.f18514a[i14] = '\"';
                this.f18515b = i14 + 1;
                return;
            }
            i14++;
        }
        cArr[i13] = '\"';
        this.f18515b = i13 + 1;
    }

    @Override // wa.p
    public final void c(String str) {
        v7.g.f(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        d(this.f18515b, length);
        str.getChars(0, str.length(), this.f18514a, this.f18515b);
        this.f18515b += length;
    }

    public final void d(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f18514a;
        if (cArr.length <= i12) {
            int i13 = i10 * 2;
            if (i12 < i13) {
                i12 = i13;
            }
            char[] copyOf = Arrays.copyOf(cArr, i12);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f18514a = copyOf;
        }
    }

    public final void e() {
        d dVar = d.c;
        char[] cArr = this.f18514a;
        dVar.getClass();
        v7.g.f(cArr, "array");
        synchronized (dVar) {
            int i10 = dVar.f11345a;
            if (cArr.length + i10 < c.f18503a) {
                dVar.f11345a = i10 + cArr.length;
                ((n7.g) dVar.f11346b).addLast(cArr);
            }
            m7.n nVar = m7.n.f16010a;
        }
    }

    public final String toString() {
        return new String(this.f18514a, 0, this.f18515b);
    }

    @Override // wa.p
    public final void writeLong(long j2) {
        c(String.valueOf(j2));
    }
}
