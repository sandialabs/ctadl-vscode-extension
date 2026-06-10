package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class F2 extends AbstractC0411t2 {
    private int[] c;

    /* renamed from: d  reason: collision with root package name */
    private int f12312d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F2(InterfaceC0363h2 interfaceC0363h2) {
        super(interfaceC0363h2);
    }

    @Override // j$.util.stream.InterfaceC0353f2, j$.util.stream.InterfaceC0363h2
    public final void accept(int i10) {
        int[] iArr = this.c;
        int i11 = this.f12312d;
        this.f12312d = i11 + 1;
        iArr[i11] = i10;
    }

    @Override // j$.util.stream.AbstractC0333b2, j$.util.stream.InterfaceC0363h2
    public final void end() {
        int i10 = 0;
        Arrays.sort(this.c, 0, this.f12312d);
        InterfaceC0363h2 interfaceC0363h2 = this.f12437a;
        interfaceC0363h2.g(this.f12312d);
        if (this.f12544b) {
            while (i10 < this.f12312d && !interfaceC0363h2.i()) {
                interfaceC0363h2.accept(this.c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f12312d) {
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
        this.c = new int[(int) j2];
    }
}
