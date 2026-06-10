package j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.w2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0423w2 extends AbstractC0407s2 {
    private K2 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0423w2(InterfaceC0363h2 interfaceC0363h2) {
        super(interfaceC0363h2);
    }

    @Override // j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        this.c.accept(d5);
    }

    @Override // j$.util.stream.AbstractC0328a2, j$.util.stream.InterfaceC0363h2
    public final void end() {
        double[] dArr = (double[]) this.c.b();
        Arrays.sort(dArr);
        InterfaceC0363h2 interfaceC0363h2 = this.f12433a;
        interfaceC0363h2.g(dArr.length);
        int i10 = 0;
        if (this.f12539b) {
            int length = dArr.length;
            while (i10 < length) {
                double d5 = dArr[i10];
                if (interfaceC0363h2.i()) {
                    break;
                }
                interfaceC0363h2.accept(d5);
                i10++;
            }
        } else {
            int length2 = dArr.length;
            while (i10 < length2) {
                interfaceC0363h2.accept(dArr[i10]);
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
        this.c = j2 > 0 ? new K2((int) j2) : new K2();
    }
}
