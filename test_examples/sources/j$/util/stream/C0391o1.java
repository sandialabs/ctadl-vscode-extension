package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.o1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0391o1 extends AbstractC0402r1 implements InterfaceC0353f2 {

    /* renamed from: h  reason: collision with root package name */
    private final int[] f12509h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0391o1(Spliterator spliterator, AbstractC0421w0 abstractC0421w0, int[] iArr) {
        super(iArr.length, spliterator, abstractC0421w0);
        this.f12509h = iArr;
    }

    C0391o1(C0391o1 c0391o1, Spliterator spliterator, long j2, long j10) {
        super(c0391o1, spliterator, j2, j10, c0391o1.f12509h.length);
        this.f12509h = c0391o1.f12509h;
    }

    @Override // j$.util.stream.AbstractC0402r1
    final AbstractC0402r1 a(Spliterator spliterator, long j2, long j10) {
        return new C0391o1(this, spliterator, j2, j10);
    }

    @Override // j$.util.stream.AbstractC0402r1, j$.util.stream.InterfaceC0363h2
    public final void accept(int i10) {
        int i11 = this.f12528f;
        if (i11 >= this.f12529g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f12528f));
        }
        int[] iArr = this.f12509h;
        this.f12528f = i11 + 1;
        iArr[i11] = i10;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        h((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC0353f2
    public final /* synthetic */ void h(Integer num) {
        AbstractC0421w0.s0(this, num);
    }

    @Override // j$.util.function.K
    public final j$.util.function.K o(j$.util.function.K k3) {
        k3.getClass();
        return new j$.util.function.H(this, k3);
    }
}
