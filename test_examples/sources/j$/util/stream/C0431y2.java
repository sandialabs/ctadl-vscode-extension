package j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.y2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0431y2 extends AbstractC0415u2 {
    private O2 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0431y2(InterfaceC0363h2 interfaceC0363h2) {
        super(interfaceC0363h2);
    }

    @Override // j$.util.stream.InterfaceC0358g2, j$.util.stream.InterfaceC0363h2
    public final void accept(long j2) {
        this.c.accept(j2);
    }

    @Override // j$.util.stream.AbstractC0338c2, j$.util.stream.InterfaceC0363h2
    public final void end() {
        long[] jArr = (long[]) this.c.b();
        Arrays.sort(jArr);
        InterfaceC0363h2 interfaceC0363h2 = this.f12449a;
        interfaceC0363h2.g(jArr.length);
        int i10 = 0;
        if (this.f12553b) {
            int length = jArr.length;
            while (i10 < length) {
                long j2 = jArr[i10];
                if (interfaceC0363h2.i()) {
                    break;
                }
                interfaceC0363h2.accept(j2);
                i10++;
            }
        } else {
            int length2 = jArr.length;
            while (i10 < length2) {
                interfaceC0363h2.accept(jArr[i10]);
                i10++;
            }
        }
        interfaceC0363h2.end();
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j2 > 0 ? new O2((int) j2) : new O2();
    }
}
