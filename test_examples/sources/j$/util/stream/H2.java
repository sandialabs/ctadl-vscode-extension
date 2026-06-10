package j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class H2 extends AbstractC0419v2 {

    /* renamed from: d  reason: collision with root package name */
    private Object[] f12324d;

    /* renamed from: e  reason: collision with root package name */
    private int f12325e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H2(InterfaceC0363h2 interfaceC0363h2, Comparator comparator) {
        super(interfaceC0363h2, comparator);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f12324d;
        int i10 = this.f12325e;
        this.f12325e = i10 + 1;
        objArr[i10] = obj;
    }

    @Override // j$.util.stream.AbstractC0343d2, j$.util.stream.InterfaceC0363h2
    public final void end() {
        int i10 = 0;
        Arrays.sort(this.f12324d, 0, this.f12325e, this.f12560b);
        InterfaceC0363h2 interfaceC0363h2 = this.f12453a;
        interfaceC0363h2.g(this.f12325e);
        if (this.c) {
            while (i10 < this.f12325e && !interfaceC0363h2.i()) {
                interfaceC0363h2.accept(this.f12324d[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f12325e) {
                interfaceC0363h2.accept(this.f12324d[i10]);
                i10++;
            }
        }
        interfaceC0363h2.end();
        this.f12324d = null;
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f12324d = new Object[(int) j2];
    }
}
