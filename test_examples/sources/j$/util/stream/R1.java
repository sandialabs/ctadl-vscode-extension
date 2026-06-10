package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class R1 extends AbstractC0350f {

    /* renamed from: h  reason: collision with root package name */
    private final AbstractC0421w0 f12373h;

    R1(R1 r1, Spliterator spliterator) {
        super(r1, spliterator);
        this.f12373h = r1.f12373h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public R1(AbstractC0421w0 abstractC0421w0, AbstractC0421w0 abstractC0421w02, Spliterator spliterator) {
        super(abstractC0421w02, spliterator);
        this.f12373h = abstractC0421w0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0350f
    public final Object a() {
        AbstractC0421w0 abstractC0421w0 = this.f12464a;
        P1 u12 = this.f12373h.u1();
        abstractC0421w0.w1(this.f12465b, u12);
        return u12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0350f
    public final AbstractC0350f d(Spliterator spliterator) {
        return new R1(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0350f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0350f abstractC0350f = this.f12466d;
        if (!(abstractC0350f == null)) {
            P1 p12 = (P1) ((R1) abstractC0350f).b();
            p12.l((P1) ((R1) this.f12467e).b());
            e(p12);
        }
        super.onCompletion(countedCompleter);
    }
}
