package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.function.Consumer;

/* renamed from: j$.util.stream.f1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0352f1 extends AbstractC0362h1 implements j$.util.H {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0352f1(C0 c0) {
        super(c0);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.m(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.g(this, consumer);
    }
}
