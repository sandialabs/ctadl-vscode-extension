package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.function.Consumer;

/* renamed from: j$.util.stream.e1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0347e1 extends AbstractC0362h1 implements j$.util.E {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0347e1(B0 b02) {
        super(b02);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0261c.l(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0261c.e(this, consumer);
    }
}
