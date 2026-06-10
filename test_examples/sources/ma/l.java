package ma;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.u;

/* loaded from: classes.dex */
public final class l extends p<Integer> implements u<Integer> {
    public l(int i10) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        e(Integer.valueOf(i10));
    }

    @Override // kotlinx.coroutines.flow.u
    public final Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f15435p;
            v7.g.c(objArr);
            valueOf = Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((this.f15436q + ((int) ((r() + this.f15438s) - this.f15436q))) - 1))]).intValue());
        }
        return valueOf;
    }

    public final void y(int i10) {
        synchronized (this) {
            Object[] objArr = this.f15435p;
            v7.g.c(objArr);
            e(Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((this.f15436q + ((int) ((r() + this.f15438s) - this.f15436q))) - 1))]).intValue() + i10));
        }
    }
}
