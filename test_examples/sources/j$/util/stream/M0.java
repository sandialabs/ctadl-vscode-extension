package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.InterfaceC0277f;
import j$.util.function.InterfaceC0284i0;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class M0 extends AbstractC0350f {

    /* renamed from: h  reason: collision with root package name */
    protected final AbstractC0421w0 f12351h;

    /* renamed from: i  reason: collision with root package name */
    protected final InterfaceC0284i0 f12352i;

    /* renamed from: j  reason: collision with root package name */
    protected final InterfaceC0277f f12353j;

    M0(M0 m02, Spliterator spliterator) {
        super(m02, spliterator);
        this.f12351h = m02.f12351h;
        this.f12352i = m02.f12352i;
        this.f12353j = m02.f12353j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public M0(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, InterfaceC0284i0 interfaceC0284i0, K0 k02) {
        super(abstractC0421w0, spliterator);
        this.f12351h = abstractC0421w0;
        this.f12352i = interfaceC0284i0;
        this.f12353j = k02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0350f
    public final Object a() {
        A0 a02 = (A0) this.f12352i.apply(this.f12351h.a1(this.f12465b));
        this.f12351h.w1(this.f12465b, a02);
        return a02.build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0350f
    public final AbstractC0350f d(Spliterator spliterator) {
        return new M0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0350f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0350f abstractC0350f = this.f12466d;
        if (!(abstractC0350f == null)) {
            e((F0) this.f12353j.apply((F0) ((M0) abstractC0350f).b(), (F0) ((M0) this.f12467e).b()));
        }
        super.onCompletion(countedCompleter);
    }
}
