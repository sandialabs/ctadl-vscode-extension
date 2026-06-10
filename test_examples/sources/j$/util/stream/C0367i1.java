package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.ArrayDeque;

/* renamed from: j$.util.stream.i1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0367i1 extends AbstractC0371j1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0367i1(F0 f02) {
        super(f02);
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        F0 e10;
        if (h()) {
            boolean a10 = this.f12482d.a(consumer);
            if (!a10) {
                if (this.c == null && (e10 = AbstractC0371j1.e(this.f12483e)) != null) {
                    Spliterator spliterator = e10.spliterator();
                    this.f12482d = spliterator;
                    return spliterator.a(consumer);
                }
                this.f12480a = null;
            }
            return a10;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f12480a == null) {
            return;
        }
        if (this.f12482d != null) {
            while (a(consumer)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            return;
        }
        ArrayDeque g10 = g();
        while (true) {
            F0 e10 = AbstractC0371j1.e(g10);
            if (e10 == null) {
                this.f12480a = null;
                return;
            }
            e10.forEach(consumer);
        }
    }
}
