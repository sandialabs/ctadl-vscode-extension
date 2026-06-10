package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class G2 extends AbstractC0415u2 {
    private long[] c;

    /* renamed from: d  reason: collision with root package name */
    private int f12316d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G2(InterfaceC0363h2 interfaceC0363h2) {
        super(interfaceC0363h2);
    }

    @Override // j$.util.stream.InterfaceC0358g2, j$.util.stream.InterfaceC0363h2
    public final void accept(long j2) {
        long[] jArr = this.c;
        int i10 = this.f12316d;
        this.f12316d = i10 + 1;
        jArr[i10] = j2;
    }

    @Override // j$.util.stream.AbstractC0338c2, j$.util.stream.InterfaceC0363h2
    public final void end() {
        int i10 = 0;
        Arrays.sort(this.c, 0, this.f12316d);
        InterfaceC0363h2 interfaceC0363h2 = this.f12449a;
        interfaceC0363h2.g(this.f12316d);
        if (this.f12553b) {
            while (i10 < this.f12316d && !interfaceC0363h2.i()) {
                interfaceC0363h2.accept(this.c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f12316d) {
                interfaceC0363h2.accept(this.c[i10]);
                i10++;
            }
        }
        interfaceC0363h2.end();
        this.c = null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new long[(int) j2];
    }
}
