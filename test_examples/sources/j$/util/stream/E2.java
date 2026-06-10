package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class E2 extends AbstractC0407s2 {
    private double[] c;

    /* renamed from: d  reason: collision with root package name */
    private int f12306d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E2(InterfaceC0363h2 interfaceC0363h2) {
        super(interfaceC0363h2);
    }

    @Override // j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        double[] dArr = this.c;
        int i10 = this.f12306d;
        this.f12306d = i10 + 1;
        dArr[i10] = d5;
    }

    @Override // j$.util.stream.AbstractC0328a2, j$.util.stream.InterfaceC0363h2
    public final void end() {
        int i10 = 0;
        Arrays.sort(this.c, 0, this.f12306d);
        InterfaceC0363h2 interfaceC0363h2 = this.f12433a;
        interfaceC0363h2.g(this.f12306d);
        if (this.f12539b) {
            while (i10 < this.f12306d && !interfaceC0363h2.i()) {
                interfaceC0363h2.accept(this.c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f12306d) {
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
        this.c = new double[(int) j2];
    }
}
