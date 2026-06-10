package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class y3 extends A3 implements Spliterator, Consumer {

    /* renamed from: e  reason: collision with root package name */
    Object f12583e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y3(Spliterator spliterator, long j2, long j10) {
        super(spliterator, j2, j10);
    }

    y3(Spliterator spliterator, y3 y3Var) {
        super(spliterator, y3Var);
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        consumer.getClass();
        while (t() != z3.NO_MORE && this.f12287a.a(this)) {
            if (r(1L) == 1) {
                consumer.accept(this.f12583e);
                this.f12583e = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f12583e = obj;
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        consumer.getClass();
        return new j$.util.concurrent.u(3, this, consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        C0339c3 c0339c3 = null;
        while (true) {
            z3 t10 = t();
            if (t10 == z3.NO_MORE) {
                return;
            }
            z3 z3Var = z3.MAYBE_MORE;
            Spliterator spliterator = this.f12287a;
            if (t10 != z3Var) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            if (c0339c3 == null) {
                c0339c3 = new C0339c3();
            } else {
                c0339c3.f12454a = 0;
            }
            long j2 = 0;
            while (spliterator.a(c0339c3)) {
                j2++;
                if (j2 >= 128) {
                    break;
                }
            }
            if (j2 == 0) {
                return;
            }
            long r3 = r(j2);
            for (int i10 = 0; i10 < r3; i10++) {
                consumer.accept(c0339c3.f12450b[i10]);
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0261c.i(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0261c.j(this, i10);
    }

    @Override // j$.util.stream.A3
    protected final Spliterator s(Spliterator spliterator) {
        return new y3(spliterator, this);
    }
}
