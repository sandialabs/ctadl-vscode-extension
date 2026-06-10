package j$.util.stream;

import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class x3 extends A3 implements j$.util.N {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x3(j$.util.N n, long j2, long j10) {
        super(n, j2, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x3(j$.util.N n, x3 x3Var) {
        super(n, x3Var);
    }

    @Override // j$.util.N
    /* renamed from: forEachRemaining */
    public final void d(Object obj) {
        obj.getClass();
        AbstractC0334b3 abstractC0334b3 = null;
        while (true) {
            z3 t10 = t();
            if (t10 == z3.NO_MORE) {
                return;
            }
            z3 z3Var = z3.MAYBE_MORE;
            Spliterator spliterator = this.f12287a;
            if (t10 != z3Var) {
                ((j$.util.N) spliterator).forEachRemaining(obj);
                return;
            }
            if (abstractC0334b3 == null) {
                abstractC0334b3 = v();
            } else {
                abstractC0334b3.f12438b = 0;
            }
            long j2 = 0;
            while (((j$.util.N) spliterator).tryAdvance(abstractC0334b3)) {
                j2++;
                if (j2 >= 128) {
                    break;
                }
            }
            if (j2 == 0) {
                return;
            }
            abstractC0334b3.a(obj, r(j2));
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

    @Override // j$.util.N
    /* renamed from: tryAdvance */
    public final boolean p(Object obj) {
        obj.getClass();
        while (t() != z3.NO_MORE && ((j$.util.N) this.f12287a).tryAdvance(this)) {
            if (r(1L) == 1) {
                u(obj);
                return true;
            }
        }
        return false;
    }

    protected abstract void u(Object obj);

    protected abstract AbstractC0334b3 v();
}
