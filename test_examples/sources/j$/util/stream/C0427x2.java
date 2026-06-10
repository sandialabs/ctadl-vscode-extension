package j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.x2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0427x2 extends AbstractC0411t2 {
    private M2 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0427x2(InterfaceC0363h2 interfaceC0363h2) {
        super(interfaceC0363h2);
    }

    @Override // j$.util.stream.InterfaceC0353f2, j$.util.stream.InterfaceC0363h2
    public final void accept(int i10) {
        this.c.accept(i10);
    }

    @Override // j$.util.stream.AbstractC0333b2, j$.util.stream.InterfaceC0363h2
    public final void end() {
        int[] iArr = (int[]) this.c.b();
        Arrays.sort(iArr);
        InterfaceC0363h2 interfaceC0363h2 = this.f12437a;
        interfaceC0363h2.g(iArr.length);
        int i10 = 0;
        if (this.f12544b) {
            int length = iArr.length;
            while (i10 < length) {
                int i11 = iArr[i10];
                if (interfaceC0363h2.i()) {
                    break;
                }
                interfaceC0363h2.accept(i11);
                i10++;
            }
        } else {
            int length2 = iArr.length;
            while (i10 < length2) {
                interfaceC0363h2.accept(iArr[i10]);
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
        this.c = j2 > 0 ? new M2((int) j2) : new M2();
    }
}
