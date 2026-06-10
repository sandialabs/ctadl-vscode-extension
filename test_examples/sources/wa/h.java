package wa;

/* loaded from: classes.dex */
public final class h extends f {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, boolean z10) {
        super(pVar);
        v7.g.f(pVar, "writer");
        this.c = z10;
    }

    @Override // wa.f
    public final void c(byte b5) {
        String a10 = m7.f.a(b5);
        if (this.c) {
            i(a10);
        } else {
            g(a10);
        }
    }

    @Override // wa.f
    public final void e(int i10) {
        String l2 = Long.toString(4294967295L & i10, 10);
        if (this.c) {
            i(l2);
        } else {
            g(l2);
        }
    }

    @Override // wa.f
    public final void f(long j2) {
        int i10 = 63;
        String str = "0";
        if (this.c) {
            int i11 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i11 != 0) {
                if (i11 > 0) {
                    str = Long.toString(j2, 10);
                } else {
                    char[] cArr = new char[64];
                    long j10 = (j2 >>> 1) / 5;
                    long j11 = 10;
                    cArr[63] = Character.forDigit((int) (j2 - (j10 * j11)), 10);
                    while (j10 > 0) {
                        i10--;
                        cArr[i10] = Character.forDigit((int) (j10 % j11), 10);
                        j10 /= j11;
                    }
                    str = new String(cArr, i10, 64 - i10);
                }
            }
            i(str);
            return;
        }
        int i12 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i12 != 0) {
            if (i12 > 0) {
                str = Long.toString(j2, 10);
            } else {
                char[] cArr2 = new char[64];
                long j12 = (j2 >>> 1) / 5;
                long j13 = 10;
                cArr2[63] = Character.forDigit((int) (j2 - (j12 * j13)), 10);
                while (j12 > 0) {
                    i10--;
                    cArr2[i10] = Character.forDigit((int) (j12 % j13), 10);
                    j12 /= j13;
                }
                str = new String(cArr2, i10, 64 - i10);
            }
        }
        g(str);
    }

    @Override // wa.f
    public final void h(short s10) {
        String a10 = m7.l.a(s10);
        if (this.c) {
            i(a10);
        } else {
            g(a10);
        }
    }
}
