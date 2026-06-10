package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;

/* renamed from: j$.util.stream.h1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0362h1 extends AbstractC0371j1 implements j$.util.N {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0362h1(E0 e02) {
        super(e02);
    }

    @Override // j$.util.N
    /* renamed from: forEachRemaining */
    public final void d(Object obj) {
        if (this.f12480a == null) {
            return;
        }
        if (this.f12482d != null) {
            while (p(obj)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            ((j$.util.N) spliterator).forEachRemaining(obj);
            return;
        }
        ArrayDeque g10 = g();
        while (true) {
            E0 e02 = (E0) AbstractC0371j1.e(g10);
            if (e02 == null) {
                this.f12480a = null;
                return;
            }
            e02.d(obj);
        }
    }

    @Override // j$.util.N
    /* renamed from: tryAdvance */
    public final boolean p(Object obj) {
        E0 e02;
        if (h()) {
            boolean tryAdvance = ((j$.util.N) this.f12482d).tryAdvance(obj);
            if (!tryAdvance) {
                if (this.c == null && (e02 = (E0) AbstractC0371j1.e(this.f12483e)) != null) {
                    j$.util.N spliterator = e02.spliterator();
                    this.f12482d = spliterator;
                    return spliterator.tryAdvance(obj);
                }
                this.f12480a = null;
            }
            return tryAdvance;
        }
        return false;
    }
}
