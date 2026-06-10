package k0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class f<K, V, T> extends d<K, V, T> {

    /* renamed from: l  reason: collision with root package name */
    public final e<K, V> f12844l;

    /* renamed from: m  reason: collision with root package name */
    public K f12845m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public int f12846o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e<K, V> eVar, t<K, V, T>[] tVarArr) {
        super(eVar.f12841k, tVarArr);
        v7.g.f(eVar, "builder");
        this.f12844l = eVar;
        this.f12846o = eVar.f12843m;
    }

    public final void c(int i10, s<?, ?> sVar, K k3, int i11) {
        int i12 = i11 * 5;
        t<K, V, T>[] tVarArr = this.f12836i;
        if (i12 > 30) {
            t<K, V, T> tVar = tVarArr[i11];
            Object[] objArr = sVar.f12858d;
            int length = objArr.length;
            tVar.getClass();
            tVar.f12861i = objArr;
            tVar.f12862j = length;
            tVar.f12863k = 0;
            while (true) {
                t<K, V, T> tVar2 = tVarArr[i11];
                if (!v7.g.a(tVar2.f12861i[tVar2.f12863k], k3)) {
                    tVarArr[i11].f12863k += 2;
                } else {
                    this.f12837j = i11;
                    return;
                }
            }
        } else {
            int i13 = 1 << ((i10 >> i12) & 31);
            if (sVar.h(i13)) {
                int f10 = sVar.f(i13);
                t<K, V, T> tVar3 = tVarArr[i11];
                Object[] objArr2 = sVar.f12858d;
                tVar3.getClass();
                v7.g.f(objArr2, "buffer");
                tVar3.f12861i = objArr2;
                tVar3.f12862j = Integer.bitCount(sVar.f12856a) * 2;
                tVar3.f12863k = f10;
                this.f12837j = i11;
                return;
            }
            int t10 = sVar.t(i13);
            s<?, ?> s10 = sVar.s(t10);
            t<K, V, T> tVar4 = tVarArr[i11];
            Object[] objArr3 = sVar.f12858d;
            tVar4.getClass();
            v7.g.f(objArr3, "buffer");
            tVar4.f12861i = objArr3;
            tVar4.f12862j = Integer.bitCount(sVar.f12856a) * 2;
            tVar4.f12863k = t10;
            c(i10, s10, k3, i11 + 1);
        }
    }

    @Override // k0.d, java.util.Iterator, j$.util.Iterator
    public final T next() {
        if (this.f12844l.f12843m == this.f12846o) {
            if (this.f12838k) {
                t<K, V, T> tVar = this.f12836i[this.f12837j];
                this.f12845m = (K) tVar.f12861i[tVar.f12863k];
                this.n = true;
                return (T) super.next();
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k0.d, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        int i10;
        if (this.n) {
            boolean z10 = this.f12838k;
            e<K, V> eVar = this.f12844l;
            if (z10) {
                if (z10) {
                    t<K, V, T> tVar = this.f12836i[this.f12837j];
                    Object obj = tVar.f12861i[tVar.f12863k];
                    K k3 = this.f12845m;
                    v7.l.b(eVar);
                    eVar.remove(k3);
                    if (obj != null) {
                        i10 = obj.hashCode();
                    } else {
                        i10 = 0;
                    }
                    c(i10, eVar.f12841k, obj, 0);
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                K k10 = this.f12845m;
                v7.l.b(eVar);
                eVar.remove(k10);
            }
            this.f12845m = null;
            this.n = false;
            this.f12846o = eVar.f12843m;
            return;
        }
        throw new IllegalStateException();
    }
}
