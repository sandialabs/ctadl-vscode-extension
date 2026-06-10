package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.function.Consumer;

/* renamed from: j$.util.stream.g1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0357g1 extends AbstractC0362h1 implements j$.util.K {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0357g1(D0 d02) {
        super(d02);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.n(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.h(this, consumer);
    }
}
