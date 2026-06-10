package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.q1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0399q1 extends AbstractC0402r1 {

    /* renamed from: h  reason: collision with root package name */
    private final Object[] f12521h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0399q1(Spliterator spliterator, AbstractC0421w0 abstractC0421w0, Object[] objArr) {
        super(objArr.length, spliterator, abstractC0421w0);
        this.f12521h = objArr;
    }

    C0399q1(C0399q1 c0399q1, Spliterator spliterator, long j2, long j10) {
        super(c0399q1, spliterator, j2, j10, c0399q1.f12521h.length);
        this.f12521h = c0399q1.f12521h;
    }

    @Override // j$.util.stream.AbstractC0402r1
    final AbstractC0402r1 a(Spliterator spliterator, long j2, long j10) {
        return new C0399q1(this, spliterator, j2, j10);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f12528f;
        if (i10 >= this.f12529g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f12528f));
        }
        Object[] objArr = this.f12521h;
        this.f12528f = i10 + 1;
        objArr[i10] = obj;
    }
}
