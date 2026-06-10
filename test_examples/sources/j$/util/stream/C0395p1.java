package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0272c0;
import j$.util.function.InterfaceC0278f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.p1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0395p1 extends AbstractC0402r1 implements InterfaceC0358g2 {

    /* renamed from: h  reason: collision with root package name */
    private final long[] f12514h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0395p1(Spliterator spliterator, AbstractC0421w0 abstractC0421w0, long[] jArr) {
        super(jArr.length, spliterator, abstractC0421w0);
        this.f12514h = jArr;
    }

    C0395p1(C0395p1 c0395p1, Spliterator spliterator, long j2, long j10) {
        super(c0395p1, spliterator, j2, j10, c0395p1.f12514h.length);
        this.f12514h = c0395p1.f12514h;
    }

    @Override // j$.util.stream.AbstractC0402r1
    final AbstractC0402r1 a(Spliterator spliterator, long j2, long j10) {
        return new C0395p1(this, spliterator, j2, j10);
    }

    @Override // j$.util.stream.AbstractC0402r1, j$.util.stream.InterfaceC0363h2
    public final void accept(long j2) {
        int i10 = this.f12528f;
        if (i10 >= this.f12529g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f12528f));
        }
        long[] jArr = this.f12514h;
        this.f12528f = i10 + 1;
        jArr[i10] = j2;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Long) obj);
    }

    @Override // j$.util.function.InterfaceC0278f0
    public final InterfaceC0278f0 j(InterfaceC0278f0 interfaceC0278f0) {
        interfaceC0278f0.getClass();
        return new C0272c0(this, interfaceC0278f0);
    }

    @Override // j$.util.stream.InterfaceC0358g2
    public final /* synthetic */ void m(Long l2) {
        AbstractC0421w0.u0(this, l2);
    }
}
